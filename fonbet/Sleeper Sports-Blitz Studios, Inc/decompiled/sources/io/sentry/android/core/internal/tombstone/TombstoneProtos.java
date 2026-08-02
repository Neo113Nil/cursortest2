package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class TombstoneProtos {

    public interface ArmMTEMetadataOrBuilder extends MessageLiteOrBuilder {
        ByteString getMemoryTags();
    }

    public interface BacktraceFrameOrBuilder extends MessageLiteOrBuilder {
        String getBuildId();

        ByteString getBuildIdBytes();

        long getFileMapOffset();

        String getFileName();

        ByteString getFileNameBytes();

        String getFunctionName();

        ByteString getFunctionNameBytes();

        long getFunctionOffset();

        long getPc();

        long getRelPc();

        long getSp();
    }

    public interface CauseOrBuilder extends MessageLiteOrBuilder {
        Cause.DetailsCase getDetailsCase();

        String getHumanReadable();

        ByteString getHumanReadableBytes();

        MemoryError getMemoryError();

        boolean hasMemoryError();
    }

    public interface CrashDetailOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();

        ByteString getName();
    }

    public interface FDOrBuilder extends MessageLiteOrBuilder {
        int getFd();

        String getOwner();

        ByteString getOwnerBytes();

        String getPath();

        ByteString getPathBytes();

        long getTag();
    }

    public interface HeapObjectOrBuilder extends MessageLiteOrBuilder {
        long getAddress();

        BacktraceFrame getAllocationBacktrace(int i);

        int getAllocationBacktraceCount();

        List<BacktraceFrame> getAllocationBacktraceList();

        long getAllocationTid();

        BacktraceFrame getDeallocationBacktrace(int i);

        int getDeallocationBacktraceCount();

        List<BacktraceFrame> getDeallocationBacktraceList();

        long getDeallocationTid();

        long getSize();
    }

    public interface LogBufferOrBuilder extends MessageLiteOrBuilder {
        LogMessage getLogs(int i);

        int getLogsCount();

        List<LogMessage> getLogsList();

        String getName();

        ByteString getNameBytes();
    }

    public interface LogMessageOrBuilder extends MessageLiteOrBuilder {
        String getMessage();

        ByteString getMessageBytes();

        int getPid();

        int getPriority();

        String getTag();

        ByteString getTagBytes();

        int getTid();

        String getTimestamp();

        ByteString getTimestampBytes();
    }

    public interface MemoryDumpOrBuilder extends MessageLiteOrBuilder {
        ArmMTEMetadata getArmMteMetadata();

        long getBeginAddress();

        String getMappingName();

        ByteString getMappingNameBytes();

        ByteString getMemory();

        MemoryDump.MetadataCase getMetadataCase();

        String getRegisterName();

        ByteString getRegisterNameBytes();

        boolean hasArmMteMetadata();
    }

    public interface MemoryErrorOrBuilder extends MessageLiteOrBuilder {
        HeapObject getHeap();

        MemoryError.LocationCase getLocationCase();

        MemoryError.Tool getTool();

        int getToolValue();

        MemoryError.Type getType();

        int getTypeValue();

        boolean hasHeap();
    }

    public interface MemoryMappingOrBuilder extends MessageLiteOrBuilder {
        long getBeginAddress();

        String getBuildId();

        ByteString getBuildIdBytes();

        long getEndAddress();

        boolean getExecute();

        long getLoadBias();

        String getMappingName();

        ByteString getMappingNameBytes();

        long getOffset();

        boolean getRead();

        boolean getWrite();
    }

    public interface RegisterOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        long getU64();
    }

    public interface SignalOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        String getCodeName();

        ByteString getCodeNameBytes();

        long getFaultAddress();

        MemoryDump getFaultAdjacentMetadata();

        boolean getHasFaultAddress();

        boolean getHasSender();

        String getName();

        ByteString getNameBytes();

        int getNumber();

        int getSenderPid();

        int getSenderUid();

        boolean hasFaultAdjacentMetadata();
    }

    public interface StackHistoryBufferEntryOrBuilder extends MessageLiteOrBuilder {
        BacktraceFrame getAddr();

        long getFp();

        long getTag();

        boolean hasAddr();
    }

    public interface StackHistoryBufferOrBuilder extends MessageLiteOrBuilder {
        StackHistoryBufferEntry getEntries(int i);

        int getEntriesCount();

        List<StackHistoryBufferEntry> getEntriesList();

        long getTid();
    }

    public interface ThreadOrBuilder extends MessageLiteOrBuilder {
        String getBacktraceNote(int i);

        ByteString getBacktraceNoteBytes(int i);

        int getBacktraceNoteCount();

        List<String> getBacktraceNoteList();

        BacktraceFrame getCurrentBacktrace(int i);

        int getCurrentBacktraceCount();

        List<BacktraceFrame> getCurrentBacktraceList();

        int getId();

        MemoryDump getMemoryDump(int i);

        int getMemoryDumpCount();

        List<MemoryDump> getMemoryDumpList();

        String getName();

        ByteString getNameBytes();

        long getPacEnabledKeys();

        Register getRegisters(int i);

        int getRegistersCount();

        List<Register> getRegistersList();

        long getTaggedAddrCtrl();

        String getUnreadableElfFiles(int i);

        ByteString getUnreadableElfFilesBytes(int i);

        int getUnreadableElfFilesCount();

        List<String> getUnreadableElfFilesList();
    }

    public interface TombstoneOrBuilder extends MessageLiteOrBuilder {
        boolean containsGuestThreads(int i);

        boolean containsThreads(int i);

        String getAbortMessage();

        ByteString getAbortMessageBytes();

        Architecture getArch();

        int getArchValue();

        String getBuildFingerprint();

        ByteString getBuildFingerprintBytes();

        Cause getCauses(int i);

        int getCausesCount();

        List<Cause> getCausesList();

        String getCommandLine(int i);

        ByteString getCommandLineBytes(int i);

        int getCommandLineCount();

        List<String> getCommandLineList();

        CrashDetail getCrashDetails(int i);

        int getCrashDetailsCount();

        List<CrashDetail> getCrashDetailsList();

        Architecture getGuestArch();

        int getGuestArchValue();

        @Deprecated
        Map<Integer, Thread> getGuestThreads();

        int getGuestThreadsCount();

        Map<Integer, Thread> getGuestThreadsMap();

        Thread getGuestThreadsOrDefault(int i, Thread thread);

        Thread getGuestThreadsOrThrow(int i);

        boolean getHasBeen16KbMode();

        LogBuffer getLogBuffers(int i);

        int getLogBuffersCount();

        List<LogBuffer> getLogBuffersList();

        MemoryMapping getMemoryMappings(int i);

        int getMemoryMappingsCount();

        List<MemoryMapping> getMemoryMappingsList();

        FD getOpenFds(int i);

        int getOpenFdsCount();

        List<FD> getOpenFdsList();

        int getPageSize();

        int getPid();

        int getProcessUptime();

        String getRevision();

        ByteString getRevisionBytes();

        String getSelinuxLabel();

        ByteString getSelinuxLabelBytes();

        Signal getSignalInfo();

        StackHistoryBuffer getStackHistoryBuffer();

        @Deprecated
        Map<Integer, Thread> getThreads();

        int getThreadsCount();

        Map<Integer, Thread> getThreadsMap();

        Thread getThreadsOrDefault(int i, Thread thread);

        Thread getThreadsOrThrow(int i);

        int getTid();

        String getTimestamp();

        ByteString getTimestampBytes();

        int getUid();

        boolean hasSignalInfo();

        boolean hasStackHistoryBuffer();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private TombstoneProtos() {
    }

    public enum Architecture implements Internal.EnumLite {
        ARM32(0),
        ARM64(1),
        X86(2),
        X86_64(3),
        RISCV64(4),
        NONE(5),
        UNRECOGNIZED(-1);

        public static final int ARM32_VALUE = 0;
        public static final int ARM64_VALUE = 1;
        public static final int NONE_VALUE = 5;
        public static final int RISCV64_VALUE = 4;
        public static final int X86_64_VALUE = 3;
        public static final int X86_VALUE = 2;
        private static final Internal.EnumLiteMap<Architecture> internalValueMap = new Internal.EnumLiteMap<Architecture>() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.Architecture.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Architecture findValueByNumber(int i) {
                return Architecture.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static Architecture valueOf(int i) {
            return forNumber(i);
        }

        public static Architecture forNumber(int i) {
            if (i == 0) {
                return ARM32;
            }
            if (i == 1) {
                return ARM64;
            }
            if (i == 2) {
                return X86;
            }
            if (i == 3) {
                return X86_64;
            }
            if (i == 4) {
                return RISCV64;
            }
            if (i != 5) {
                return null;
            }
            return NONE;
        }

        public static Internal.EnumLiteMap<Architecture> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ArchitectureVerifier.INSTANCE;
        }

        private static final class ArchitectureVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ArchitectureVerifier();

            private ArchitectureVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Architecture.forNumber(i) != null;
            }
        }

        Architecture(int i) {
            this.value = i;
        }
    }

    public static final class CrashDetail extends GeneratedMessageLite<CrashDetail, Builder> implements CrashDetailOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final CrashDetail DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<CrashDetail> PARSER;
        private ByteString name_ = ByteString.EMPTY;
        private ByteString data_ = ByteString.EMPTY;

        private CrashDetail() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
        public ByteString getName() {
            return this.name_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(ByteString byteString) {
            byteString.getClass();
            this.name_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        public static CrashDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CrashDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CrashDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CrashDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CrashDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CrashDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CrashDetail parseFrom(InputStream inputStream) throws IOException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CrashDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CrashDetail) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashDetail) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CrashDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CrashDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CrashDetail crashDetail) {
            return DEFAULT_INSTANCE.createBuilder(crashDetail);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CrashDetail, Builder> implements CrashDetailOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(CrashDetail.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
            public ByteString getName() {
                return ((CrashDetail) this.instance).getName();
            }

            public Builder setName(ByteString byteString) {
                copyOnWrite();
                ((CrashDetail) this.instance).setName(byteString);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((CrashDetail) this.instance).clearName();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CrashDetailOrBuilder
            public ByteString getData() {
                return ((CrashDetail) this.instance).getData();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((CrashDetail) this.instance).setData(byteString);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((CrashDetail) this.instance).clearData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CrashDetail();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"name_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CrashDetail> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (CrashDetail.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            CrashDetail crashDetail = new CrashDetail();
            DEFAULT_INSTANCE = crashDetail;
            GeneratedMessageLite.registerDefaultInstance(CrashDetail.class, crashDetail);
        }

        public static CrashDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CrashDetail> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: io.sentry.android.core.internal.tombstone.TombstoneProtos$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class StackHistoryBufferEntry extends GeneratedMessageLite<StackHistoryBufferEntry, Builder> implements StackHistoryBufferEntryOrBuilder {
        public static final int ADDR_FIELD_NUMBER = 1;
        private static final StackHistoryBufferEntry DEFAULT_INSTANCE;
        public static final int FP_FIELD_NUMBER = 2;
        private static volatile Parser<StackHistoryBufferEntry> PARSER = null;
        public static final int TAG_FIELD_NUMBER = 3;
        private BacktraceFrame addr_;
        private int bitField0_;
        private long fp_;
        private long tag_;

        private StackHistoryBufferEntry() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public boolean hasAddr() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public BacktraceFrame getAddr() {
            BacktraceFrame backtraceFrame = this.addr_;
            return backtraceFrame == null ? BacktraceFrame.getDefaultInstance() : backtraceFrame;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddr(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            this.addr_ = backtraceFrame;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAddr(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            BacktraceFrame backtraceFrame2 = this.addr_;
            if (backtraceFrame2 != null && backtraceFrame2 != BacktraceFrame.getDefaultInstance()) {
                this.addr_ = BacktraceFrame.newBuilder(this.addr_).mergeFrom((BacktraceFrame.Builder) backtraceFrame).buildPartial();
            } else {
                this.addr_ = backtraceFrame;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddr() {
            this.addr_ = null;
            this.bitField0_ &= -2;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public long getFp() {
            return this.fp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFp(long j) {
            this.fp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFp() {
            this.fp_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
        public long getTag() {
            return this.tag_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(long j) {
            this.tag_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = 0L;
        }

        public static StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StackHistoryBufferEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StackHistoryBufferEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StackHistoryBufferEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StackHistoryBufferEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StackHistoryBufferEntry parseFrom(InputStream inputStream) throws IOException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBufferEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StackHistoryBufferEntry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StackHistoryBufferEntry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StackHistoryBufferEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StackHistoryBufferEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StackHistoryBufferEntry stackHistoryBufferEntry) {
            return DEFAULT_INSTANCE.createBuilder(stackHistoryBufferEntry);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StackHistoryBufferEntry, Builder> implements StackHistoryBufferEntryOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(StackHistoryBufferEntry.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public boolean hasAddr() {
                return ((StackHistoryBufferEntry) this.instance).hasAddr();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public BacktraceFrame getAddr() {
                return ((StackHistoryBufferEntry) this.instance).getAddr();
            }

            public Builder setAddr(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setAddr(backtraceFrame);
                return this;
            }

            public Builder setAddr(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setAddr(builder.build());
                return this;
            }

            public Builder mergeAddr(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).mergeAddr(backtraceFrame);
                return this;
            }

            public Builder clearAddr() {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).clearAddr();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public long getFp() {
                return ((StackHistoryBufferEntry) this.instance).getFp();
            }

            public Builder setFp(long j) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setFp(j);
                return this;
            }

            public Builder clearFp() {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).clearFp();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferEntryOrBuilder
            public long getTag() {
                return ((StackHistoryBufferEntry) this.instance).getTag();
            }

            public Builder setTag(long j) {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).setTag(j);
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((StackHistoryBufferEntry) this.instance).clearTag();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StackHistoryBufferEntry();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003\u0003", new Object[]{"bitField0_", "addr_", "fp_", "tag_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StackHistoryBufferEntry> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (StackHistoryBufferEntry.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            StackHistoryBufferEntry stackHistoryBufferEntry = new StackHistoryBufferEntry();
            DEFAULT_INSTANCE = stackHistoryBufferEntry;
            GeneratedMessageLite.registerDefaultInstance(StackHistoryBufferEntry.class, stackHistoryBufferEntry);
        }

        public static StackHistoryBufferEntry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<StackHistoryBufferEntry> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class StackHistoryBuffer extends GeneratedMessageLite<StackHistoryBuffer, Builder> implements StackHistoryBufferOrBuilder {
        private static final StackHistoryBuffer DEFAULT_INSTANCE;
        public static final int ENTRIES_FIELD_NUMBER = 2;
        private static volatile Parser<StackHistoryBuffer> PARSER = null;
        public static final int TID_FIELD_NUMBER = 1;
        private Internal.ProtobufList<StackHistoryBufferEntry> entries_ = emptyProtobufList();
        private long tid_;

        private StackHistoryBuffer() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public long getTid() {
            return this.tid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTid(long j) {
            this.tid_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTid() {
            this.tid_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public List<StackHistoryBufferEntry> getEntriesList() {
            return this.entries_;
        }

        public List<? extends StackHistoryBufferEntryOrBuilder> getEntriesOrBuilderList() {
            return this.entries_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public int getEntriesCount() {
            return this.entries_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
        public StackHistoryBufferEntry getEntries(int i) {
            return this.entries_.get(i);
        }

        public StackHistoryBufferEntryOrBuilder getEntriesOrBuilder(int i) {
            return this.entries_.get(i);
        }

        private void ensureEntriesIsMutable() {
            Internal.ProtobufList<StackHistoryBufferEntry> protobufList = this.entries_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.entries_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntries(int i, StackHistoryBufferEntry stackHistoryBufferEntry) {
            stackHistoryBufferEntry.getClass();
            ensureEntriesIsMutable();
            this.entries_.set(i, stackHistoryBufferEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEntries(StackHistoryBufferEntry stackHistoryBufferEntry) {
            stackHistoryBufferEntry.getClass();
            ensureEntriesIsMutable();
            this.entries_.add(stackHistoryBufferEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEntries(int i, StackHistoryBufferEntry stackHistoryBufferEntry) {
            stackHistoryBufferEntry.getClass();
            ensureEntriesIsMutable();
            this.entries_.add(i, stackHistoryBufferEntry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEntries(Iterable<? extends StackHistoryBufferEntry> iterable) {
            ensureEntriesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.entries_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEntries() {
            this.entries_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEntries(int i) {
            ensureEntriesIsMutable();
            this.entries_.remove(i);
        }

        public static StackHistoryBuffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static StackHistoryBuffer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StackHistoryBuffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StackHistoryBuffer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StackHistoryBuffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StackHistoryBuffer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StackHistoryBuffer parseFrom(InputStream inputStream) throws IOException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBuffer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StackHistoryBuffer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StackHistoryBuffer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StackHistoryBuffer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StackHistoryBuffer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StackHistoryBuffer parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StackHistoryBuffer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StackHistoryBuffer stackHistoryBuffer) {
            return DEFAULT_INSTANCE.createBuilder(stackHistoryBuffer);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StackHistoryBuffer, Builder> implements StackHistoryBufferOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(StackHistoryBuffer.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public long getTid() {
                return ((StackHistoryBuffer) this.instance).getTid();
            }

            public Builder setTid(long j) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).setTid(j);
                return this;
            }

            public Builder clearTid() {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).clearTid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public List<StackHistoryBufferEntry> getEntriesList() {
                return Collections.unmodifiableList(((StackHistoryBuffer) this.instance).getEntriesList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public int getEntriesCount() {
                return ((StackHistoryBuffer) this.instance).getEntriesCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.StackHistoryBufferOrBuilder
            public StackHistoryBufferEntry getEntries(int i) {
                return ((StackHistoryBuffer) this.instance).getEntries(i);
            }

            public Builder setEntries(int i, StackHistoryBufferEntry stackHistoryBufferEntry) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).setEntries(i, stackHistoryBufferEntry);
                return this;
            }

            public Builder setEntries(int i, StackHistoryBufferEntry.Builder builder) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).setEntries(i, builder.build());
                return this;
            }

            public Builder addEntries(StackHistoryBufferEntry stackHistoryBufferEntry) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries(stackHistoryBufferEntry);
                return this;
            }

            public Builder addEntries(int i, StackHistoryBufferEntry stackHistoryBufferEntry) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries(i, stackHistoryBufferEntry);
                return this;
            }

            public Builder addEntries(StackHistoryBufferEntry.Builder builder) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries(builder.build());
                return this;
            }

            public Builder addEntries(int i, StackHistoryBufferEntry.Builder builder) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addEntries(i, builder.build());
                return this;
            }

            public Builder addAllEntries(Iterable<? extends StackHistoryBufferEntry> iterable) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).addAllEntries(iterable);
                return this;
            }

            public Builder clearEntries() {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).clearEntries();
                return this;
            }

            public Builder removeEntries(int i) {
                copyOnWrite();
                ((StackHistoryBuffer) this.instance).removeEntries(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StackHistoryBuffer();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0003\u0002\u001b", new Object[]{"tid_", "entries_", StackHistoryBufferEntry.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StackHistoryBuffer> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (StackHistoryBuffer.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            StackHistoryBuffer stackHistoryBuffer = new StackHistoryBuffer();
            DEFAULT_INSTANCE = stackHistoryBuffer;
            GeneratedMessageLite.registerDefaultInstance(StackHistoryBuffer.class, stackHistoryBuffer);
        }

        public static StackHistoryBuffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<StackHistoryBuffer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Tombstone extends GeneratedMessageLite<Tombstone, Builder> implements TombstoneOrBuilder {
        public static final int ABORT_MESSAGE_FIELD_NUMBER = 14;
        public static final int ARCH_FIELD_NUMBER = 1;
        public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 2;
        public static final int CAUSES_FIELD_NUMBER = 15;
        public static final int COMMAND_LINE_FIELD_NUMBER = 9;
        public static final int CRASH_DETAILS_FIELD_NUMBER = 21;
        private static final Tombstone DEFAULT_INSTANCE;
        public static final int GUEST_ARCH_FIELD_NUMBER = 24;
        public static final int GUEST_THREADS_FIELD_NUMBER = 25;
        public static final int HAS_BEEN_16KB_MODE_FIELD_NUMBER = 23;
        public static final int LOG_BUFFERS_FIELD_NUMBER = 18;
        public static final int MEMORY_MAPPINGS_FIELD_NUMBER = 17;
        public static final int OPEN_FDS_FIELD_NUMBER = 19;
        public static final int PAGE_SIZE_FIELD_NUMBER = 22;
        private static volatile Parser<Tombstone> PARSER = null;
        public static final int PID_FIELD_NUMBER = 5;
        public static final int PROCESS_UPTIME_FIELD_NUMBER = 20;
        public static final int REVISION_FIELD_NUMBER = 3;
        public static final int SELINUX_LABEL_FIELD_NUMBER = 8;
        public static final int SIGNAL_INFO_FIELD_NUMBER = 10;
        public static final int STACK_HISTORY_BUFFER_FIELD_NUMBER = 26;
        public static final int THREADS_FIELD_NUMBER = 16;
        public static final int TID_FIELD_NUMBER = 6;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        public static final int UID_FIELD_NUMBER = 7;
        private int arch_;
        private int bitField0_;
        private int guestArch_;
        private boolean hasBeen16KbMode_;
        private int pageSize_;
        private int pid_;
        private int processUptime_;
        private Signal signalInfo_;
        private StackHistoryBuffer stackHistoryBuffer_;
        private int tid_;
        private int uid_;
        private MapFieldLite<Integer, Thread> threads_ = MapFieldLite.emptyMapField();
        private MapFieldLite<Integer, Thread> guestThreads_ = MapFieldLite.emptyMapField();
        private String buildFingerprint_ = "";
        private String revision_ = "";
        private String timestamp_ = "";
        private String selinuxLabel_ = "";
        private Internal.ProtobufList<String> commandLine_ = GeneratedMessageLite.emptyProtobufList();
        private String abortMessage_ = "";
        private Internal.ProtobufList<CrashDetail> crashDetails_ = emptyProtobufList();
        private Internal.ProtobufList<Cause> causes_ = emptyProtobufList();
        private Internal.ProtobufList<MemoryMapping> memoryMappings_ = emptyProtobufList();
        private Internal.ProtobufList<LogBuffer> logBuffers_ = emptyProtobufList();
        private Internal.ProtobufList<FD> openFds_ = emptyProtobufList();

        private Tombstone() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getArchValue() {
            return this.arch_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Architecture getArch() {
            Architecture forNumber = Architecture.forNumber(this.arch_);
            return forNumber == null ? Architecture.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArchValue(int i) {
            this.arch_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArch(Architecture architecture) {
            this.arch_ = architecture.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArch() {
            this.arch_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getGuestArchValue() {
            return this.guestArch_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Architecture getGuestArch() {
            Architecture forNumber = Architecture.forNumber(this.guestArch_);
            return forNumber == null ? Architecture.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestArchValue(int i) {
            this.guestArch_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuestArch(Architecture architecture) {
            this.guestArch_ = architecture.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuestArch() {
            this.guestArch_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getBuildFingerprint() {
            return this.buildFingerprint_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public ByteString getBuildFingerprintBytes() {
            return ByteString.copyFromUtf8(this.buildFingerprint_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprint(String str) {
            str.getClass();
            this.buildFingerprint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildFingerprint() {
            this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprintBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.buildFingerprint_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getRevision() {
            return this.revision_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public ByteString getRevisionBytes() {
            return ByteString.copyFromUtf8(this.revision_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevision(String str) {
            str.getClass();
            this.revision_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevision() {
            this.revision_ = getDefaultInstance().getRevision();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevisionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.revision_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getTimestamp() {
            return this.timestamp_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public ByteString getTimestampBytes() {
            return ByteString.copyFromUtf8(this.timestamp_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getPid() {
            return this.pid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getTid() {
            return this.tid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTid(int i) {
            this.tid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTid() {
            this.tid_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getUid() {
            return this.uid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUid(int i) {
            this.uid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUid() {
            this.uid_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getSelinuxLabel() {
            return this.selinuxLabel_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public ByteString getSelinuxLabelBytes() {
            return ByteString.copyFromUtf8(this.selinuxLabel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelinuxLabel(String str) {
            str.getClass();
            this.selinuxLabel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSelinuxLabel() {
            this.selinuxLabel_ = getDefaultInstance().getSelinuxLabel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelinuxLabelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.selinuxLabel_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<String> getCommandLineList() {
            return this.commandLine_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getCommandLineCount() {
            return this.commandLine_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getCommandLine(int i) {
            return this.commandLine_.get(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public ByteString getCommandLineBytes(int i) {
            return ByteString.copyFromUtf8(this.commandLine_.get(i));
        }

        private void ensureCommandLineIsMutable() {
            Internal.ProtobufList<String> protobufList = this.commandLine_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.commandLine_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommandLine(int i, String str) {
            str.getClass();
            ensureCommandLineIsMutable();
            this.commandLine_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCommandLine(String str) {
            str.getClass();
            ensureCommandLineIsMutable();
            this.commandLine_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCommandLine(Iterable<String> iterable) {
            ensureCommandLineIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.commandLine_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommandLine() {
            this.commandLine_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCommandLineBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureCommandLineIsMutable();
            this.commandLine_.add(byteString.toStringUtf8());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getProcessUptime() {
            return this.processUptime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProcessUptime(int i) {
            this.processUptime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProcessUptime() {
            this.processUptime_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean hasSignalInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Signal getSignalInfo() {
            Signal signal = this.signalInfo_;
            return signal == null ? Signal.getDefaultInstance() : signal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignalInfo(Signal signal) {
            signal.getClass();
            this.signalInfo_ = signal;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSignalInfo(Signal signal) {
            signal.getClass();
            Signal signal2 = this.signalInfo_;
            if (signal2 != null && signal2 != Signal.getDefaultInstance()) {
                this.signalInfo_ = Signal.newBuilder(this.signalInfo_).mergeFrom((Signal.Builder) signal).buildPartial();
            } else {
                this.signalInfo_ = signal;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSignalInfo() {
            this.signalInfo_ = null;
            this.bitField0_ &= -2;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public String getAbortMessage() {
            return this.abortMessage_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public ByteString getAbortMessageBytes() {
            return ByteString.copyFromUtf8(this.abortMessage_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbortMessage(String str) {
            str.getClass();
            this.abortMessage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbortMessage() {
            this.abortMessage_ = getDefaultInstance().getAbortMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbortMessageBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.abortMessage_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<CrashDetail> getCrashDetailsList() {
            return this.crashDetails_;
        }

        public List<? extends CrashDetailOrBuilder> getCrashDetailsOrBuilderList() {
            return this.crashDetails_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getCrashDetailsCount() {
            return this.crashDetails_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public CrashDetail getCrashDetails(int i) {
            return this.crashDetails_.get(i);
        }

        public CrashDetailOrBuilder getCrashDetailsOrBuilder(int i) {
            return this.crashDetails_.get(i);
        }

        private void ensureCrashDetailsIsMutable() {
            Internal.ProtobufList<CrashDetail> protobufList = this.crashDetails_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.crashDetails_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCrashDetails(int i, CrashDetail crashDetail) {
            crashDetail.getClass();
            ensureCrashDetailsIsMutable();
            this.crashDetails_.set(i, crashDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCrashDetails(CrashDetail crashDetail) {
            crashDetail.getClass();
            ensureCrashDetailsIsMutable();
            this.crashDetails_.add(crashDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCrashDetails(int i, CrashDetail crashDetail) {
            crashDetail.getClass();
            ensureCrashDetailsIsMutable();
            this.crashDetails_.add(i, crashDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCrashDetails(Iterable<? extends CrashDetail> iterable) {
            ensureCrashDetailsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.crashDetails_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCrashDetails() {
            this.crashDetails_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCrashDetails(int i) {
            ensureCrashDetailsIsMutable();
            this.crashDetails_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<Cause> getCausesList() {
            return this.causes_;
        }

        public List<? extends CauseOrBuilder> getCausesOrBuilderList() {
            return this.causes_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getCausesCount() {
            return this.causes_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Cause getCauses(int i) {
            return this.causes_.get(i);
        }

        public CauseOrBuilder getCausesOrBuilder(int i) {
            return this.causes_.get(i);
        }

        private void ensureCausesIsMutable() {
            Internal.ProtobufList<Cause> protobufList = this.causes_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.causes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCauses(int i, Cause cause) {
            cause.getClass();
            ensureCausesIsMutable();
            this.causes_.set(i, cause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCauses(Cause cause) {
            cause.getClass();
            ensureCausesIsMutable();
            this.causes_.add(cause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCauses(int i, Cause cause) {
            cause.getClass();
            ensureCausesIsMutable();
            this.causes_.add(i, cause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCauses(Iterable<? extends Cause> iterable) {
            ensureCausesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.causes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCauses() {
            this.causes_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCauses(int i) {
            ensureCausesIsMutable();
            this.causes_.remove(i);
        }

        private static final class ThreadsDefaultEntryHolder {
            static final MapEntryLite<Integer, Thread> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, Thread.getDefaultInstance());

            private ThreadsDefaultEntryHolder() {
            }
        }

        private MapFieldLite<Integer, Thread> internalGetThreads() {
            return this.threads_;
        }

        private MapFieldLite<Integer, Thread> internalGetMutableThreads() {
            if (!this.threads_.isMutable()) {
                this.threads_ = this.threads_.mutableCopy();
            }
            return this.threads_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getThreadsCount() {
            return internalGetThreads().size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean containsThreads(int i) {
            return internalGetThreads().containsKey(Integer.valueOf(i));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        @Deprecated
        public Map<Integer, Thread> getThreads() {
            return getThreadsMap();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Map<Integer, Thread> getThreadsMap() {
            return Collections.unmodifiableMap(internalGetThreads());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getThreadsOrDefault(int i, Thread thread) {
            MapFieldLite<Integer, Thread> internalGetThreads = internalGetThreads();
            return internalGetThreads.containsKey(Integer.valueOf(i)) ? internalGetThreads.get(Integer.valueOf(i)) : thread;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getThreadsOrThrow(int i) {
            MapFieldLite<Integer, Thread> internalGetThreads = internalGetThreads();
            if (!internalGetThreads.containsKey(Integer.valueOf(i))) {
                throw new IllegalArgumentException();
            }
            return internalGetThreads.get(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, Thread> getMutableThreadsMap() {
            return internalGetMutableThreads();
        }

        private static final class GuestThreadsDefaultEntryHolder {
            static final MapEntryLite<Integer, Thread> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, Thread.getDefaultInstance());

            private GuestThreadsDefaultEntryHolder() {
            }
        }

        private MapFieldLite<Integer, Thread> internalGetGuestThreads() {
            return this.guestThreads_;
        }

        private MapFieldLite<Integer, Thread> internalGetMutableGuestThreads() {
            if (!this.guestThreads_.isMutable()) {
                this.guestThreads_ = this.guestThreads_.mutableCopy();
            }
            return this.guestThreads_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getGuestThreadsCount() {
            return internalGetGuestThreads().size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean containsGuestThreads(int i) {
            return internalGetGuestThreads().containsKey(Integer.valueOf(i));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        @Deprecated
        public Map<Integer, Thread> getGuestThreads() {
            return getGuestThreadsMap();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Map<Integer, Thread> getGuestThreadsMap() {
            return Collections.unmodifiableMap(internalGetGuestThreads());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getGuestThreadsOrDefault(int i, Thread thread) {
            MapFieldLite<Integer, Thread> internalGetGuestThreads = internalGetGuestThreads();
            return internalGetGuestThreads.containsKey(Integer.valueOf(i)) ? internalGetGuestThreads.get(Integer.valueOf(i)) : thread;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public Thread getGuestThreadsOrThrow(int i) {
            MapFieldLite<Integer, Thread> internalGetGuestThreads = internalGetGuestThreads();
            if (!internalGetGuestThreads.containsKey(Integer.valueOf(i))) {
                throw new IllegalArgumentException();
            }
            return internalGetGuestThreads.get(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, Thread> getMutableGuestThreadsMap() {
            return internalGetMutableGuestThreads();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<MemoryMapping> getMemoryMappingsList() {
            return this.memoryMappings_;
        }

        public List<? extends MemoryMappingOrBuilder> getMemoryMappingsOrBuilderList() {
            return this.memoryMappings_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getMemoryMappingsCount() {
            return this.memoryMappings_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public MemoryMapping getMemoryMappings(int i) {
            return this.memoryMappings_.get(i);
        }

        public MemoryMappingOrBuilder getMemoryMappingsOrBuilder(int i) {
            return this.memoryMappings_.get(i);
        }

        private void ensureMemoryMappingsIsMutable() {
            Internal.ProtobufList<MemoryMapping> protobufList = this.memoryMappings_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.memoryMappings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryMappings(int i, MemoryMapping memoryMapping) {
            memoryMapping.getClass();
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.set(i, memoryMapping);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryMappings(MemoryMapping memoryMapping) {
            memoryMapping.getClass();
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.add(memoryMapping);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryMappings(int i, MemoryMapping memoryMapping) {
            memoryMapping.getClass();
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.add(i, memoryMapping);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMemoryMappings(Iterable<? extends MemoryMapping> iterable) {
            ensureMemoryMappingsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.memoryMappings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryMappings() {
            this.memoryMappings_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMemoryMappings(int i) {
            ensureMemoryMappingsIsMutable();
            this.memoryMappings_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<LogBuffer> getLogBuffersList() {
            return this.logBuffers_;
        }

        public List<? extends LogBufferOrBuilder> getLogBuffersOrBuilderList() {
            return this.logBuffers_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getLogBuffersCount() {
            return this.logBuffers_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public LogBuffer getLogBuffers(int i) {
            return this.logBuffers_.get(i);
        }

        public LogBufferOrBuilder getLogBuffersOrBuilder(int i) {
            return this.logBuffers_.get(i);
        }

        private void ensureLogBuffersIsMutable() {
            Internal.ProtobufList<LogBuffer> protobufList = this.logBuffers_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.logBuffers_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogBuffers(int i, LogBuffer logBuffer) {
            logBuffer.getClass();
            ensureLogBuffersIsMutable();
            this.logBuffers_.set(i, logBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogBuffers(LogBuffer logBuffer) {
            logBuffer.getClass();
            ensureLogBuffersIsMutable();
            this.logBuffers_.add(logBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogBuffers(int i, LogBuffer logBuffer) {
            logBuffer.getClass();
            ensureLogBuffersIsMutable();
            this.logBuffers_.add(i, logBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogBuffers(Iterable<? extends LogBuffer> iterable) {
            ensureLogBuffersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.logBuffers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogBuffers() {
            this.logBuffers_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLogBuffers(int i) {
            ensureLogBuffersIsMutable();
            this.logBuffers_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public List<FD> getOpenFdsList() {
            return this.openFds_;
        }

        public List<? extends FDOrBuilder> getOpenFdsOrBuilderList() {
            return this.openFds_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getOpenFdsCount() {
            return this.openFds_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public FD getOpenFds(int i) {
            return this.openFds_.get(i);
        }

        public FDOrBuilder getOpenFdsOrBuilder(int i) {
            return this.openFds_.get(i);
        }

        private void ensureOpenFdsIsMutable() {
            Internal.ProtobufList<FD> protobufList = this.openFds_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.openFds_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenFds(int i, FD fd) {
            fd.getClass();
            ensureOpenFdsIsMutable();
            this.openFds_.set(i, fd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOpenFds(FD fd) {
            fd.getClass();
            ensureOpenFdsIsMutable();
            this.openFds_.add(fd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOpenFds(int i, FD fd) {
            fd.getClass();
            ensureOpenFdsIsMutable();
            this.openFds_.add(i, fd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOpenFds(Iterable<? extends FD> iterable) {
            ensureOpenFdsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.openFds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenFds() {
            this.openFds_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOpenFds(int i) {
            ensureOpenFdsIsMutable();
            this.openFds_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public int getPageSize() {
            return this.pageSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageSize(int i) {
            this.pageSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPageSize() {
            this.pageSize_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean getHasBeen16KbMode() {
            return this.hasBeen16KbMode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasBeen16KbMode(boolean z) {
            this.hasBeen16KbMode_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasBeen16KbMode() {
            this.hasBeen16KbMode_ = false;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public boolean hasStackHistoryBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
        public StackHistoryBuffer getStackHistoryBuffer() {
            StackHistoryBuffer stackHistoryBuffer = this.stackHistoryBuffer_;
            return stackHistoryBuffer == null ? StackHistoryBuffer.getDefaultInstance() : stackHistoryBuffer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
            stackHistoryBuffer.getClass();
            this.stackHistoryBuffer_ = stackHistoryBuffer;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
            stackHistoryBuffer.getClass();
            StackHistoryBuffer stackHistoryBuffer2 = this.stackHistoryBuffer_;
            if (stackHistoryBuffer2 != null && stackHistoryBuffer2 != StackHistoryBuffer.getDefaultInstance()) {
                this.stackHistoryBuffer_ = StackHistoryBuffer.newBuilder(this.stackHistoryBuffer_).mergeFrom((StackHistoryBuffer.Builder) stackHistoryBuffer).buildPartial();
            } else {
                this.stackHistoryBuffer_ = stackHistoryBuffer;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStackHistoryBuffer() {
            this.stackHistoryBuffer_ = null;
            this.bitField0_ &= -3;
        }

        public static Tombstone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Tombstone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Tombstone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Tombstone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Tombstone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Tombstone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Tombstone parseFrom(InputStream inputStream) throws IOException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Tombstone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Tombstone parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Tombstone) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Tombstone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Tombstone) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Tombstone parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Tombstone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Tombstone tombstone) {
            return DEFAULT_INSTANCE.createBuilder(tombstone);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Tombstone, Builder> implements TombstoneOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Tombstone.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getArchValue() {
                return ((Tombstone) this.instance).getArchValue();
            }

            public Builder setArchValue(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).setArchValue(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Architecture getArch() {
                return ((Tombstone) this.instance).getArch();
            }

            public Builder setArch(Architecture architecture) {
                copyOnWrite();
                ((Tombstone) this.instance).setArch(architecture);
                return this;
            }

            public Builder clearArch() {
                copyOnWrite();
                ((Tombstone) this.instance).clearArch();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getGuestArchValue() {
                return ((Tombstone) this.instance).getGuestArchValue();
            }

            public Builder setGuestArchValue(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).setGuestArchValue(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Architecture getGuestArch() {
                return ((Tombstone) this.instance).getGuestArch();
            }

            public Builder setGuestArch(Architecture architecture) {
                copyOnWrite();
                ((Tombstone) this.instance).setGuestArch(architecture);
                return this;
            }

            public Builder clearGuestArch() {
                copyOnWrite();
                ((Tombstone) this.instance).clearGuestArch();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getBuildFingerprint() {
                return ((Tombstone) this.instance).getBuildFingerprint();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public ByteString getBuildFingerprintBytes() {
                return ((Tombstone) this.instance).getBuildFingerprintBytes();
            }

            public Builder setBuildFingerprint(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setBuildFingerprint(str);
                return this;
            }

            public Builder clearBuildFingerprint() {
                copyOnWrite();
                ((Tombstone) this.instance).clearBuildFingerprint();
                return this;
            }

            public Builder setBuildFingerprintBytes(ByteString byteString) {
                copyOnWrite();
                ((Tombstone) this.instance).setBuildFingerprintBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getRevision() {
                return ((Tombstone) this.instance).getRevision();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public ByteString getRevisionBytes() {
                return ((Tombstone) this.instance).getRevisionBytes();
            }

            public Builder setRevision(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setRevision(str);
                return this;
            }

            public Builder clearRevision() {
                copyOnWrite();
                ((Tombstone) this.instance).clearRevision();
                return this;
            }

            public Builder setRevisionBytes(ByteString byteString) {
                copyOnWrite();
                ((Tombstone) this.instance).setRevisionBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getTimestamp() {
                return ((Tombstone) this.instance).getTimestamp();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public ByteString getTimestampBytes() {
                return ((Tombstone) this.instance).getTimestampBytes();
            }

            public Builder setTimestamp(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setTimestamp(str);
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Tombstone) this.instance).clearTimestamp();
                return this;
            }

            public Builder setTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((Tombstone) this.instance).setTimestampBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getPid() {
                return ((Tombstone) this.instance).getPid();
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).setPid(i);
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((Tombstone) this.instance).clearPid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getTid() {
                return ((Tombstone) this.instance).getTid();
            }

            public Builder setTid(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).setTid(i);
                return this;
            }

            public Builder clearTid() {
                copyOnWrite();
                ((Tombstone) this.instance).clearTid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getUid() {
                return ((Tombstone) this.instance).getUid();
            }

            public Builder setUid(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).setUid(i);
                return this;
            }

            public Builder clearUid() {
                copyOnWrite();
                ((Tombstone) this.instance).clearUid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getSelinuxLabel() {
                return ((Tombstone) this.instance).getSelinuxLabel();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public ByteString getSelinuxLabelBytes() {
                return ((Tombstone) this.instance).getSelinuxLabelBytes();
            }

            public Builder setSelinuxLabel(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setSelinuxLabel(str);
                return this;
            }

            public Builder clearSelinuxLabel() {
                copyOnWrite();
                ((Tombstone) this.instance).clearSelinuxLabel();
                return this;
            }

            public Builder setSelinuxLabelBytes(ByteString byteString) {
                copyOnWrite();
                ((Tombstone) this.instance).setSelinuxLabelBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<String> getCommandLineList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getCommandLineList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getCommandLineCount() {
                return ((Tombstone) this.instance).getCommandLineCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getCommandLine(int i) {
                return ((Tombstone) this.instance).getCommandLine(i);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public ByteString getCommandLineBytes(int i) {
                return ((Tombstone) this.instance).getCommandLineBytes(i);
            }

            public Builder setCommandLine(int i, String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setCommandLine(i, str);
                return this;
            }

            public Builder addCommandLine(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).addCommandLine(str);
                return this;
            }

            public Builder addAllCommandLine(Iterable<String> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllCommandLine(iterable);
                return this;
            }

            public Builder clearCommandLine() {
                copyOnWrite();
                ((Tombstone) this.instance).clearCommandLine();
                return this;
            }

            public Builder addCommandLineBytes(ByteString byteString) {
                copyOnWrite();
                ((Tombstone) this.instance).addCommandLineBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getProcessUptime() {
                return ((Tombstone) this.instance).getProcessUptime();
            }

            public Builder setProcessUptime(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).setProcessUptime(i);
                return this;
            }

            public Builder clearProcessUptime() {
                copyOnWrite();
                ((Tombstone) this.instance).clearProcessUptime();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean hasSignalInfo() {
                return ((Tombstone) this.instance).hasSignalInfo();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Signal getSignalInfo() {
                return ((Tombstone) this.instance).getSignalInfo();
            }

            public Builder setSignalInfo(Signal signal) {
                copyOnWrite();
                ((Tombstone) this.instance).setSignalInfo(signal);
                return this;
            }

            public Builder setSignalInfo(Signal.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setSignalInfo(builder.build());
                return this;
            }

            public Builder mergeSignalInfo(Signal signal) {
                copyOnWrite();
                ((Tombstone) this.instance).mergeSignalInfo(signal);
                return this;
            }

            public Builder clearSignalInfo() {
                copyOnWrite();
                ((Tombstone) this.instance).clearSignalInfo();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public String getAbortMessage() {
                return ((Tombstone) this.instance).getAbortMessage();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public ByteString getAbortMessageBytes() {
                return ((Tombstone) this.instance).getAbortMessageBytes();
            }

            public Builder setAbortMessage(String str) {
                copyOnWrite();
                ((Tombstone) this.instance).setAbortMessage(str);
                return this;
            }

            public Builder clearAbortMessage() {
                copyOnWrite();
                ((Tombstone) this.instance).clearAbortMessage();
                return this;
            }

            public Builder setAbortMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((Tombstone) this.instance).setAbortMessageBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<CrashDetail> getCrashDetailsList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getCrashDetailsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getCrashDetailsCount() {
                return ((Tombstone) this.instance).getCrashDetailsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public CrashDetail getCrashDetails(int i) {
                return ((Tombstone) this.instance).getCrashDetails(i);
            }

            public Builder setCrashDetails(int i, CrashDetail crashDetail) {
                copyOnWrite();
                ((Tombstone) this.instance).setCrashDetails(i, crashDetail);
                return this;
            }

            public Builder setCrashDetails(int i, CrashDetail.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setCrashDetails(i, builder.build());
                return this;
            }

            public Builder addCrashDetails(CrashDetail crashDetail) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails(crashDetail);
                return this;
            }

            public Builder addCrashDetails(int i, CrashDetail crashDetail) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails(i, crashDetail);
                return this;
            }

            public Builder addCrashDetails(CrashDetail.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails(builder.build());
                return this;
            }

            public Builder addCrashDetails(int i, CrashDetail.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCrashDetails(i, builder.build());
                return this;
            }

            public Builder addAllCrashDetails(Iterable<? extends CrashDetail> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllCrashDetails(iterable);
                return this;
            }

            public Builder clearCrashDetails() {
                copyOnWrite();
                ((Tombstone) this.instance).clearCrashDetails();
                return this;
            }

            public Builder removeCrashDetails(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).removeCrashDetails(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<Cause> getCausesList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getCausesList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getCausesCount() {
                return ((Tombstone) this.instance).getCausesCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Cause getCauses(int i) {
                return ((Tombstone) this.instance).getCauses(i);
            }

            public Builder setCauses(int i, Cause cause) {
                copyOnWrite();
                ((Tombstone) this.instance).setCauses(i, cause);
                return this;
            }

            public Builder setCauses(int i, Cause.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setCauses(i, builder.build());
                return this;
            }

            public Builder addCauses(Cause cause) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses(cause);
                return this;
            }

            public Builder addCauses(int i, Cause cause) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses(i, cause);
                return this;
            }

            public Builder addCauses(Cause.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses(builder.build());
                return this;
            }

            public Builder addCauses(int i, Cause.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addCauses(i, builder.build());
                return this;
            }

            public Builder addAllCauses(Iterable<? extends Cause> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllCauses(iterable);
                return this;
            }

            public Builder clearCauses() {
                copyOnWrite();
                ((Tombstone) this.instance).clearCauses();
                return this;
            }

            public Builder removeCauses(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).removeCauses(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getThreadsCount() {
                return ((Tombstone) this.instance).getThreadsMap().size();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean containsThreads(int i) {
                return ((Tombstone) this.instance).getThreadsMap().containsKey(Integer.valueOf(i));
            }

            public Builder clearThreads() {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().clear();
                return this;
            }

            public Builder removeThreads(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().remove(Integer.valueOf(i));
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            @Deprecated
            public Map<Integer, Thread> getThreads() {
                return getThreadsMap();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Map<Integer, Thread> getThreadsMap() {
                return Collections.unmodifiableMap(((Tombstone) this.instance).getThreadsMap());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getThreadsOrDefault(int i, Thread thread) {
                Map<Integer, Thread> threadsMap = ((Tombstone) this.instance).getThreadsMap();
                return threadsMap.containsKey(Integer.valueOf(i)) ? threadsMap.get(Integer.valueOf(i)) : thread;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getThreadsOrThrow(int i) {
                Map<Integer, Thread> threadsMap = ((Tombstone) this.instance).getThreadsMap();
                if (!threadsMap.containsKey(Integer.valueOf(i))) {
                    throw new IllegalArgumentException();
                }
                return threadsMap.get(Integer.valueOf(i));
            }

            public Builder putThreads(int i, Thread thread) {
                thread.getClass();
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().put(Integer.valueOf(i), thread);
                return this;
            }

            public Builder putAllThreads(Map<Integer, Thread> map) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableThreadsMap().putAll(map);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getGuestThreadsCount() {
                return ((Tombstone) this.instance).getGuestThreadsMap().size();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean containsGuestThreads(int i) {
                return ((Tombstone) this.instance).getGuestThreadsMap().containsKey(Integer.valueOf(i));
            }

            public Builder clearGuestThreads() {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().clear();
                return this;
            }

            public Builder removeGuestThreads(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().remove(Integer.valueOf(i));
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            @Deprecated
            public Map<Integer, Thread> getGuestThreads() {
                return getGuestThreadsMap();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Map<Integer, Thread> getGuestThreadsMap() {
                return Collections.unmodifiableMap(((Tombstone) this.instance).getGuestThreadsMap());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getGuestThreadsOrDefault(int i, Thread thread) {
                Map<Integer, Thread> guestThreadsMap = ((Tombstone) this.instance).getGuestThreadsMap();
                return guestThreadsMap.containsKey(Integer.valueOf(i)) ? guestThreadsMap.get(Integer.valueOf(i)) : thread;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public Thread getGuestThreadsOrThrow(int i) {
                Map<Integer, Thread> guestThreadsMap = ((Tombstone) this.instance).getGuestThreadsMap();
                if (!guestThreadsMap.containsKey(Integer.valueOf(i))) {
                    throw new IllegalArgumentException();
                }
                return guestThreadsMap.get(Integer.valueOf(i));
            }

            public Builder putGuestThreads(int i, Thread thread) {
                thread.getClass();
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().put(Integer.valueOf(i), thread);
                return this;
            }

            public Builder putAllGuestThreads(Map<Integer, Thread> map) {
                copyOnWrite();
                ((Tombstone) this.instance).getMutableGuestThreadsMap().putAll(map);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<MemoryMapping> getMemoryMappingsList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getMemoryMappingsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getMemoryMappingsCount() {
                return ((Tombstone) this.instance).getMemoryMappingsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public MemoryMapping getMemoryMappings(int i) {
                return ((Tombstone) this.instance).getMemoryMappings(i);
            }

            public Builder setMemoryMappings(int i, MemoryMapping memoryMapping) {
                copyOnWrite();
                ((Tombstone) this.instance).setMemoryMappings(i, memoryMapping);
                return this;
            }

            public Builder setMemoryMappings(int i, MemoryMapping.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setMemoryMappings(i, builder.build());
                return this;
            }

            public Builder addMemoryMappings(MemoryMapping memoryMapping) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings(memoryMapping);
                return this;
            }

            public Builder addMemoryMappings(int i, MemoryMapping memoryMapping) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings(i, memoryMapping);
                return this;
            }

            public Builder addMemoryMappings(MemoryMapping.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings(builder.build());
                return this;
            }

            public Builder addMemoryMappings(int i, MemoryMapping.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addMemoryMappings(i, builder.build());
                return this;
            }

            public Builder addAllMemoryMappings(Iterable<? extends MemoryMapping> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllMemoryMappings(iterable);
                return this;
            }

            public Builder clearMemoryMappings() {
                copyOnWrite();
                ((Tombstone) this.instance).clearMemoryMappings();
                return this;
            }

            public Builder removeMemoryMappings(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).removeMemoryMappings(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<LogBuffer> getLogBuffersList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getLogBuffersList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getLogBuffersCount() {
                return ((Tombstone) this.instance).getLogBuffersCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public LogBuffer getLogBuffers(int i) {
                return ((Tombstone) this.instance).getLogBuffers(i);
            }

            public Builder setLogBuffers(int i, LogBuffer logBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).setLogBuffers(i, logBuffer);
                return this;
            }

            public Builder setLogBuffers(int i, LogBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setLogBuffers(i, builder.build());
                return this;
            }

            public Builder addLogBuffers(LogBuffer logBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers(logBuffer);
                return this;
            }

            public Builder addLogBuffers(int i, LogBuffer logBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers(i, logBuffer);
                return this;
            }

            public Builder addLogBuffers(LogBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers(builder.build());
                return this;
            }

            public Builder addLogBuffers(int i, LogBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addLogBuffers(i, builder.build());
                return this;
            }

            public Builder addAllLogBuffers(Iterable<? extends LogBuffer> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllLogBuffers(iterable);
                return this;
            }

            public Builder clearLogBuffers() {
                copyOnWrite();
                ((Tombstone) this.instance).clearLogBuffers();
                return this;
            }

            public Builder removeLogBuffers(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).removeLogBuffers(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public List<FD> getOpenFdsList() {
                return Collections.unmodifiableList(((Tombstone) this.instance).getOpenFdsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getOpenFdsCount() {
                return ((Tombstone) this.instance).getOpenFdsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public FD getOpenFds(int i) {
                return ((Tombstone) this.instance).getOpenFds(i);
            }

            public Builder setOpenFds(int i, FD fd) {
                copyOnWrite();
                ((Tombstone) this.instance).setOpenFds(i, fd);
                return this;
            }

            public Builder setOpenFds(int i, FD.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setOpenFds(i, builder.build());
                return this;
            }

            public Builder addOpenFds(FD fd) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds(fd);
                return this;
            }

            public Builder addOpenFds(int i, FD fd) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds(i, fd);
                return this;
            }

            public Builder addOpenFds(FD.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds(builder.build());
                return this;
            }

            public Builder addOpenFds(int i, FD.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).addOpenFds(i, builder.build());
                return this;
            }

            public Builder addAllOpenFds(Iterable<? extends FD> iterable) {
                copyOnWrite();
                ((Tombstone) this.instance).addAllOpenFds(iterable);
                return this;
            }

            public Builder clearOpenFds() {
                copyOnWrite();
                ((Tombstone) this.instance).clearOpenFds();
                return this;
            }

            public Builder removeOpenFds(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).removeOpenFds(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public int getPageSize() {
                return ((Tombstone) this.instance).getPageSize();
            }

            public Builder setPageSize(int i) {
                copyOnWrite();
                ((Tombstone) this.instance).setPageSize(i);
                return this;
            }

            public Builder clearPageSize() {
                copyOnWrite();
                ((Tombstone) this.instance).clearPageSize();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean getHasBeen16KbMode() {
                return ((Tombstone) this.instance).getHasBeen16KbMode();
            }

            public Builder setHasBeen16KbMode(boolean z) {
                copyOnWrite();
                ((Tombstone) this.instance).setHasBeen16KbMode(z);
                return this;
            }

            public Builder clearHasBeen16KbMode() {
                copyOnWrite();
                ((Tombstone) this.instance).clearHasBeen16KbMode();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public boolean hasStackHistoryBuffer() {
                return ((Tombstone) this.instance).hasStackHistoryBuffer();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.TombstoneOrBuilder
            public StackHistoryBuffer getStackHistoryBuffer() {
                return ((Tombstone) this.instance).getStackHistoryBuffer();
            }

            public Builder setStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).setStackHistoryBuffer(stackHistoryBuffer);
                return this;
            }

            public Builder setStackHistoryBuffer(StackHistoryBuffer.Builder builder) {
                copyOnWrite();
                ((Tombstone) this.instance).setStackHistoryBuffer(builder.build());
                return this;
            }

            public Builder mergeStackHistoryBuffer(StackHistoryBuffer stackHistoryBuffer) {
                copyOnWrite();
                ((Tombstone) this.instance).mergeStackHistoryBuffer(stackHistoryBuffer);
                return this;
            }

            public Builder clearStackHistoryBuffer() {
                copyOnWrite();
                ((Tombstone) this.instance).clearStackHistoryBuffer();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Tombstone();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0002\u0006\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b\u0015\u001b\u0016\u000b\u0017\u0007\u0018\f\u00192\u001aဉ\u0001", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", Cause.class, "threads_", ThreadsDefaultEntryHolder.defaultEntry, "memoryMappings_", MemoryMapping.class, "logBuffers_", LogBuffer.class, "openFds_", FD.class, "processUptime_", "crashDetails_", CrashDetail.class, "pageSize_", "hasBeen16KbMode_", "guestArch_", "guestThreads_", GuestThreadsDefaultEntryHolder.defaultEntry, "stackHistoryBuffer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Tombstone> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Tombstone.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Tombstone tombstone = new Tombstone();
            DEFAULT_INSTANCE = tombstone;
            GeneratedMessageLite.registerDefaultInstance(Tombstone.class, tombstone);
        }

        public static Tombstone getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Tombstone> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Signal extends GeneratedMessageLite<Signal, Builder> implements SignalOrBuilder {
        public static final int CODE_FIELD_NUMBER = 3;
        public static final int CODE_NAME_FIELD_NUMBER = 4;
        private static final Signal DEFAULT_INSTANCE;
        public static final int FAULT_ADDRESS_FIELD_NUMBER = 9;
        public static final int FAULT_ADJACENT_METADATA_FIELD_NUMBER = 10;
        public static final int HAS_FAULT_ADDRESS_FIELD_NUMBER = 8;
        public static final int HAS_SENDER_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static volatile Parser<Signal> PARSER = null;
        public static final int SENDER_PID_FIELD_NUMBER = 7;
        public static final int SENDER_UID_FIELD_NUMBER = 6;
        private int bitField0_;
        private int code_;
        private long faultAddress_;
        private MemoryDump faultAdjacentMetadata_;
        private boolean hasFaultAddress_;
        private boolean hasSender_;
        private int number_;
        private int senderPid_;
        private int senderUid_;
        private String name_ = "";
        private String codeName_ = "";

        private Signal() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getNumber() {
            return this.number_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i) {
            this.number_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getCode() {
            return this.code_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public String getCodeName() {
            return this.codeName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public ByteString getCodeNameBytes() {
            return ByteString.copyFromUtf8(this.codeName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeName(String str) {
            str.getClass();
            this.codeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodeName() {
            this.codeName_ = getDefaultInstance().getCodeName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.codeName_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public boolean getHasSender() {
            return this.hasSender_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasSender(boolean z) {
            this.hasSender_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasSender() {
            this.hasSender_ = false;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getSenderUid() {
            return this.senderUid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderUid(int i) {
            this.senderUid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderUid() {
            this.senderUid_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public int getSenderPid() {
            return this.senderPid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSenderPid(int i) {
            this.senderPid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSenderPid() {
            this.senderPid_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public boolean getHasFaultAddress() {
            return this.hasFaultAddress_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasFaultAddress(boolean z) {
            this.hasFaultAddress_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasFaultAddress() {
            this.hasFaultAddress_ = false;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public long getFaultAddress() {
            return this.faultAddress_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFaultAddress(long j) {
            this.faultAddress_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFaultAddress() {
            this.faultAddress_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public boolean hasFaultAdjacentMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
        public MemoryDump getFaultAdjacentMetadata() {
            MemoryDump memoryDump = this.faultAdjacentMetadata_;
            return memoryDump == null ? MemoryDump.getDefaultInstance() : memoryDump;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFaultAdjacentMetadata(MemoryDump memoryDump) {
            memoryDump.getClass();
            this.faultAdjacentMetadata_ = memoryDump;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFaultAdjacentMetadata(MemoryDump memoryDump) {
            memoryDump.getClass();
            MemoryDump memoryDump2 = this.faultAdjacentMetadata_;
            if (memoryDump2 != null && memoryDump2 != MemoryDump.getDefaultInstance()) {
                this.faultAdjacentMetadata_ = MemoryDump.newBuilder(this.faultAdjacentMetadata_).mergeFrom((MemoryDump.Builder) memoryDump).buildPartial();
            } else {
                this.faultAdjacentMetadata_ = memoryDump;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFaultAdjacentMetadata() {
            this.faultAdjacentMetadata_ = null;
            this.bitField0_ &= -2;
        }

        public static Signal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Signal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Signal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Signal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Signal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Signal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Signal parseFrom(InputStream inputStream) throws IOException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Signal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Signal parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Signal) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Signal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Signal) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Signal parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Signal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Signal signal) {
            return DEFAULT_INSTANCE.createBuilder(signal);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Signal, Builder> implements SignalOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Signal.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getNumber() {
                return ((Signal) this.instance).getNumber();
            }

            public Builder setNumber(int i) {
                copyOnWrite();
                ((Signal) this.instance).setNumber(i);
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((Signal) this.instance).clearNumber();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public String getName() {
                return ((Signal) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public ByteString getNameBytes() {
                return ((Signal) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Signal) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Signal) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Signal) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getCode() {
                return ((Signal) this.instance).getCode();
            }

            public Builder setCode(int i) {
                copyOnWrite();
                ((Signal) this.instance).setCode(i);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Signal) this.instance).clearCode();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public String getCodeName() {
                return ((Signal) this.instance).getCodeName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public ByteString getCodeNameBytes() {
                return ((Signal) this.instance).getCodeNameBytes();
            }

            public Builder setCodeName(String str) {
                copyOnWrite();
                ((Signal) this.instance).setCodeName(str);
                return this;
            }

            public Builder clearCodeName() {
                copyOnWrite();
                ((Signal) this.instance).clearCodeName();
                return this;
            }

            public Builder setCodeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Signal) this.instance).setCodeNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public boolean getHasSender() {
                return ((Signal) this.instance).getHasSender();
            }

            public Builder setHasSender(boolean z) {
                copyOnWrite();
                ((Signal) this.instance).setHasSender(z);
                return this;
            }

            public Builder clearHasSender() {
                copyOnWrite();
                ((Signal) this.instance).clearHasSender();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getSenderUid() {
                return ((Signal) this.instance).getSenderUid();
            }

            public Builder setSenderUid(int i) {
                copyOnWrite();
                ((Signal) this.instance).setSenderUid(i);
                return this;
            }

            public Builder clearSenderUid() {
                copyOnWrite();
                ((Signal) this.instance).clearSenderUid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public int getSenderPid() {
                return ((Signal) this.instance).getSenderPid();
            }

            public Builder setSenderPid(int i) {
                copyOnWrite();
                ((Signal) this.instance).setSenderPid(i);
                return this;
            }

            public Builder clearSenderPid() {
                copyOnWrite();
                ((Signal) this.instance).clearSenderPid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public boolean getHasFaultAddress() {
                return ((Signal) this.instance).getHasFaultAddress();
            }

            public Builder setHasFaultAddress(boolean z) {
                copyOnWrite();
                ((Signal) this.instance).setHasFaultAddress(z);
                return this;
            }

            public Builder clearHasFaultAddress() {
                copyOnWrite();
                ((Signal) this.instance).clearHasFaultAddress();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public long getFaultAddress() {
                return ((Signal) this.instance).getFaultAddress();
            }

            public Builder setFaultAddress(long j) {
                copyOnWrite();
                ((Signal) this.instance).setFaultAddress(j);
                return this;
            }

            public Builder clearFaultAddress() {
                copyOnWrite();
                ((Signal) this.instance).clearFaultAddress();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public boolean hasFaultAdjacentMetadata() {
                return ((Signal) this.instance).hasFaultAdjacentMetadata();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.SignalOrBuilder
            public MemoryDump getFaultAdjacentMetadata() {
                return ((Signal) this.instance).getFaultAdjacentMetadata();
            }

            public Builder setFaultAdjacentMetadata(MemoryDump memoryDump) {
                copyOnWrite();
                ((Signal) this.instance).setFaultAdjacentMetadata(memoryDump);
                return this;
            }

            public Builder setFaultAdjacentMetadata(MemoryDump.Builder builder) {
                copyOnWrite();
                ((Signal) this.instance).setFaultAdjacentMetadata(builder.build());
                return this;
            }

            public Builder mergeFaultAdjacentMetadata(MemoryDump memoryDump) {
                copyOnWrite();
                ((Signal) this.instance).mergeFaultAdjacentMetadata(memoryDump);
                return this;
            }

            public Builder clearFaultAdjacentMetadata() {
                copyOnWrite();
                ((Signal) this.instance).clearFaultAdjacentMetadata();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Signal();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Signal> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Signal.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Signal signal = new Signal();
            DEFAULT_INSTANCE = signal;
            GeneratedMessageLite.registerDefaultInstance(Signal.class, signal);
        }

        public static Signal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Signal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class HeapObject extends GeneratedMessageLite<HeapObject, Builder> implements HeapObjectOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        public static final int ALLOCATION_BACKTRACE_FIELD_NUMBER = 4;
        public static final int ALLOCATION_TID_FIELD_NUMBER = 3;
        public static final int DEALLOCATION_BACKTRACE_FIELD_NUMBER = 6;
        public static final int DEALLOCATION_TID_FIELD_NUMBER = 5;
        private static final HeapObject DEFAULT_INSTANCE;
        private static volatile Parser<HeapObject> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        private long address_;
        private long allocationTid_;
        private long deallocationTid_;
        private long size_;
        private Internal.ProtobufList<BacktraceFrame> allocationBacktrace_ = emptyProtobufList();
        private Internal.ProtobufList<BacktraceFrame> deallocationBacktrace_ = emptyProtobufList();

        private HeapObject() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getAddress() {
            return this.address_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(long j) {
            this.address_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getSize() {
            return this.size_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getAllocationTid() {
            return this.allocationTid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllocationTid(long j) {
            this.allocationTid_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllocationTid() {
            this.allocationTid_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public List<BacktraceFrame> getAllocationBacktraceList() {
            return this.allocationBacktrace_;
        }

        public List<? extends BacktraceFrameOrBuilder> getAllocationBacktraceOrBuilderList() {
            return this.allocationBacktrace_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public int getAllocationBacktraceCount() {
            return this.allocationBacktrace_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public BacktraceFrame getAllocationBacktrace(int i) {
            return this.allocationBacktrace_.get(i);
        }

        public BacktraceFrameOrBuilder getAllocationBacktraceOrBuilder(int i) {
            return this.allocationBacktrace_.get(i);
        }

        private void ensureAllocationBacktraceIsMutable() {
            Internal.ProtobufList<BacktraceFrame> protobufList = this.allocationBacktrace_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.allocationBacktrace_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllocationBacktrace(int i, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.set(i, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllocationBacktrace(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.add(backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllocationBacktrace(int i, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.add(i, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAllocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
            ensureAllocationBacktraceIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.allocationBacktrace_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllocationBacktrace() {
            this.allocationBacktrace_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAllocationBacktrace(int i) {
            ensureAllocationBacktraceIsMutable();
            this.allocationBacktrace_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public long getDeallocationTid() {
            return this.deallocationTid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeallocationTid(long j) {
            this.deallocationTid_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeallocationTid() {
            this.deallocationTid_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public List<BacktraceFrame> getDeallocationBacktraceList() {
            return this.deallocationBacktrace_;
        }

        public List<? extends BacktraceFrameOrBuilder> getDeallocationBacktraceOrBuilderList() {
            return this.deallocationBacktrace_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public int getDeallocationBacktraceCount() {
            return this.deallocationBacktrace_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
        public BacktraceFrame getDeallocationBacktrace(int i) {
            return this.deallocationBacktrace_.get(i);
        }

        public BacktraceFrameOrBuilder getDeallocationBacktraceOrBuilder(int i) {
            return this.deallocationBacktrace_.get(i);
        }

        private void ensureDeallocationBacktraceIsMutable() {
            Internal.ProtobufList<BacktraceFrame> protobufList = this.deallocationBacktrace_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.deallocationBacktrace_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeallocationBacktrace(int i, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.set(i, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeallocationBacktrace(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.add(backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeallocationBacktrace(int i, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.add(i, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDeallocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
            ensureDeallocationBacktraceIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.deallocationBacktrace_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeallocationBacktrace() {
            this.deallocationBacktrace_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDeallocationBacktrace(int i) {
            ensureDeallocationBacktraceIsMutable();
            this.deallocationBacktrace_.remove(i);
        }

        public static HeapObject parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HeapObject parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeapObject parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeapObject parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeapObject parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeapObject parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeapObject parseFrom(InputStream inputStream) throws IOException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeapObject parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeapObject parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeapObject) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeapObject parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeapObject) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeapObject parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeapObject parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HeapObject heapObject) {
            return DEFAULT_INSTANCE.createBuilder(heapObject);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<HeapObject, Builder> implements HeapObjectOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(HeapObject.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getAddress() {
                return ((HeapObject) this.instance).getAddress();
            }

            public Builder setAddress(long j) {
                copyOnWrite();
                ((HeapObject) this.instance).setAddress(j);
                return this;
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((HeapObject) this.instance).clearAddress();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getSize() {
                return ((HeapObject) this.instance).getSize();
            }

            public Builder setSize(long j) {
                copyOnWrite();
                ((HeapObject) this.instance).setSize(j);
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((HeapObject) this.instance).clearSize();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getAllocationTid() {
                return ((HeapObject) this.instance).getAllocationTid();
            }

            public Builder setAllocationTid(long j) {
                copyOnWrite();
                ((HeapObject) this.instance).setAllocationTid(j);
                return this;
            }

            public Builder clearAllocationTid() {
                copyOnWrite();
                ((HeapObject) this.instance).clearAllocationTid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public List<BacktraceFrame> getAllocationBacktraceList() {
                return Collections.unmodifiableList(((HeapObject) this.instance).getAllocationBacktraceList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public int getAllocationBacktraceCount() {
                return ((HeapObject) this.instance).getAllocationBacktraceCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public BacktraceFrame getAllocationBacktrace(int i) {
                return ((HeapObject) this.instance).getAllocationBacktrace(i);
            }

            public Builder setAllocationBacktrace(int i, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).setAllocationBacktrace(i, backtraceFrame);
                return this;
            }

            public Builder setAllocationBacktrace(int i, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).setAllocationBacktrace(i, builder.build());
                return this;
            }

            public Builder addAllocationBacktrace(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace(backtraceFrame);
                return this;
            }

            public Builder addAllocationBacktrace(int i, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace(i, backtraceFrame);
                return this;
            }

            public Builder addAllocationBacktrace(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace(builder.build());
                return this;
            }

            public Builder addAllocationBacktrace(int i, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllocationBacktrace(i, builder.build());
                return this;
            }

            public Builder addAllAllocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllAllocationBacktrace(iterable);
                return this;
            }

            public Builder clearAllocationBacktrace() {
                copyOnWrite();
                ((HeapObject) this.instance).clearAllocationBacktrace();
                return this;
            }

            public Builder removeAllocationBacktrace(int i) {
                copyOnWrite();
                ((HeapObject) this.instance).removeAllocationBacktrace(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public long getDeallocationTid() {
                return ((HeapObject) this.instance).getDeallocationTid();
            }

            public Builder setDeallocationTid(long j) {
                copyOnWrite();
                ((HeapObject) this.instance).setDeallocationTid(j);
                return this;
            }

            public Builder clearDeallocationTid() {
                copyOnWrite();
                ((HeapObject) this.instance).clearDeallocationTid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public List<BacktraceFrame> getDeallocationBacktraceList() {
                return Collections.unmodifiableList(((HeapObject) this.instance).getDeallocationBacktraceList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public int getDeallocationBacktraceCount() {
                return ((HeapObject) this.instance).getDeallocationBacktraceCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.HeapObjectOrBuilder
            public BacktraceFrame getDeallocationBacktrace(int i) {
                return ((HeapObject) this.instance).getDeallocationBacktrace(i);
            }

            public Builder setDeallocationBacktrace(int i, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).setDeallocationBacktrace(i, backtraceFrame);
                return this;
            }

            public Builder setDeallocationBacktrace(int i, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).setDeallocationBacktrace(i, builder.build());
                return this;
            }

            public Builder addDeallocationBacktrace(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace(backtraceFrame);
                return this;
            }

            public Builder addDeallocationBacktrace(int i, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace(i, backtraceFrame);
                return this;
            }

            public Builder addDeallocationBacktrace(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace(builder.build());
                return this;
            }

            public Builder addDeallocationBacktrace(int i, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((HeapObject) this.instance).addDeallocationBacktrace(i, builder.build());
                return this;
            }

            public Builder addAllDeallocationBacktrace(Iterable<? extends BacktraceFrame> iterable) {
                copyOnWrite();
                ((HeapObject) this.instance).addAllDeallocationBacktrace(iterable);
                return this;
            }

            public Builder clearDeallocationBacktrace() {
                copyOnWrite();
                ((HeapObject) this.instance).clearDeallocationBacktrace();
                return this;
            }

            public Builder removeDeallocationBacktrace(int i) {
                copyOnWrite();
                ((HeapObject) this.instance).removeDeallocationBacktrace(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeapObject();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u001b\u0005\u0003\u0006\u001b", new Object[]{"address_", "size_", "allocationTid_", "allocationBacktrace_", BacktraceFrame.class, "deallocationTid_", "deallocationBacktrace_", BacktraceFrame.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeapObject> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (HeapObject.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            HeapObject heapObject = new HeapObject();
            DEFAULT_INSTANCE = heapObject;
            GeneratedMessageLite.registerDefaultInstance(HeapObject.class, heapObject);
        }

        public static HeapObject getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<HeapObject> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MemoryError extends GeneratedMessageLite<MemoryError, Builder> implements MemoryErrorOrBuilder {
        private static final MemoryError DEFAULT_INSTANCE;
        public static final int HEAP_FIELD_NUMBER = 3;
        private static volatile Parser<MemoryError> PARSER = null;
        public static final int TOOL_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int locationCase_ = 0;
        private Object location_;
        private int tool_;
        private int type_;

        private MemoryError() {
        }

        public enum Tool implements Internal.EnumLite {
            GWP_ASAN(0),
            SCUDO(1),
            UNRECOGNIZED(-1);

            public static final int GWP_ASAN_VALUE = 0;
            public static final int SCUDO_VALUE = 1;
            private static final Internal.EnumLiteMap<Tool> internalValueMap = new Internal.EnumLiteMap<Tool>() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryError.Tool.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Tool findValueByNumber(int i) {
                    return Tool.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Tool valueOf(int i) {
                return forNumber(i);
            }

            public static Tool forNumber(int i) {
                if (i == 0) {
                    return GWP_ASAN;
                }
                if (i != 1) {
                    return null;
                }
                return SCUDO;
            }

            public static Internal.EnumLiteMap<Tool> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return ToolVerifier.INSTANCE;
            }

            private static final class ToolVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new ToolVerifier();

                private ToolVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Tool.forNumber(i) != null;
                }
            }

            Tool(int i) {
                this.value = i;
            }
        }

        public enum Type implements Internal.EnumLite {
            UNKNOWN(0),
            USE_AFTER_FREE(1),
            DOUBLE_FREE(2),
            INVALID_FREE(3),
            BUFFER_OVERFLOW(4),
            BUFFER_UNDERFLOW(5),
            UNRECOGNIZED(-1);

            public static final int BUFFER_OVERFLOW_VALUE = 4;
            public static final int BUFFER_UNDERFLOW_VALUE = 5;
            public static final int DOUBLE_FREE_VALUE = 2;
            public static final int INVALID_FREE_VALUE = 3;
            public static final int UNKNOWN_VALUE = 0;
            public static final int USE_AFTER_FREE_VALUE = 1;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryError.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            private final int value;

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return USE_AFTER_FREE;
                }
                if (i == 2) {
                    return DOUBLE_FREE;
                }
                if (i == 3) {
                    return INVALID_FREE;
                }
                if (i == 4) {
                    return BUFFER_OVERFLOW;
                }
                if (i != 5) {
                    return null;
                }
                return BUFFER_UNDERFLOW;
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return TypeVerifier.INSTANCE;
            }

            private static final class TypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new TypeVerifier();

                private TypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Type.forNumber(i) != null;
                }
            }

            Type(int i) {
                this.value = i;
            }
        }

        public enum LocationCase {
            HEAP(3),
            LOCATION_NOT_SET(0);

            private final int value;

            LocationCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static LocationCase valueOf(int i) {
                return forNumber(i);
            }

            public static LocationCase forNumber(int i) {
                if (i == 0) {
                    return LOCATION_NOT_SET;
                }
                if (i != 3) {
                    return null;
                }
                return HEAP;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public LocationCase getLocationCase() {
            return LocationCase.forNumber(this.locationCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.locationCase_ = 0;
            this.location_ = null;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public int getToolValue() {
            return this.tool_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public Tool getTool() {
            Tool forNumber = Tool.forNumber(this.tool_);
            return forNumber == null ? Tool.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToolValue(int i) {
            this.tool_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTool(Tool tool) {
            this.tool_ = tool.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTool() {
            this.tool_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public Type getType() {
            Type forNumber = Type.forNumber(this.type_);
            return forNumber == null ? Type.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            this.type_ = type.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public boolean hasHeap() {
            return this.locationCase_ == 3;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
        public HeapObject getHeap() {
            if (this.locationCase_ == 3) {
                return (HeapObject) this.location_;
            }
            return HeapObject.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeap(HeapObject heapObject) {
            heapObject.getClass();
            this.location_ = heapObject;
            this.locationCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeap(HeapObject heapObject) {
            heapObject.getClass();
            if (this.locationCase_ == 3 && this.location_ != HeapObject.getDefaultInstance()) {
                this.location_ = HeapObject.newBuilder((HeapObject) this.location_).mergeFrom((HeapObject.Builder) heapObject).buildPartial();
            } else {
                this.location_ = heapObject;
            }
            this.locationCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeap() {
            if (this.locationCase_ == 3) {
                this.locationCase_ = 0;
                this.location_ = null;
            }
        }

        public static MemoryError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MemoryError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MemoryError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoryError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MemoryError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoryError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MemoryError parseFrom(InputStream inputStream) throws IOException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoryError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryError parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MemoryError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MemoryError memoryError) {
            return DEFAULT_INSTANCE.createBuilder(memoryError);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MemoryError, Builder> implements MemoryErrorOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(MemoryError.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public LocationCase getLocationCase() {
                return ((MemoryError) this.instance).getLocationCase();
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((MemoryError) this.instance).clearLocation();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public int getToolValue() {
                return ((MemoryError) this.instance).getToolValue();
            }

            public Builder setToolValue(int i) {
                copyOnWrite();
                ((MemoryError) this.instance).setToolValue(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public Tool getTool() {
                return ((MemoryError) this.instance).getTool();
            }

            public Builder setTool(Tool tool) {
                copyOnWrite();
                ((MemoryError) this.instance).setTool(tool);
                return this;
            }

            public Builder clearTool() {
                copyOnWrite();
                ((MemoryError) this.instance).clearTool();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public int getTypeValue() {
                return ((MemoryError) this.instance).getTypeValue();
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((MemoryError) this.instance).setTypeValue(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public Type getType() {
                return ((MemoryError) this.instance).getType();
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((MemoryError) this.instance).setType(type);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((MemoryError) this.instance).clearType();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public boolean hasHeap() {
                return ((MemoryError) this.instance).hasHeap();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryErrorOrBuilder
            public HeapObject getHeap() {
                return ((MemoryError) this.instance).getHeap();
            }

            public Builder setHeap(HeapObject heapObject) {
                copyOnWrite();
                ((MemoryError) this.instance).setHeap(heapObject);
                return this;
            }

            public Builder setHeap(HeapObject.Builder builder) {
                copyOnWrite();
                ((MemoryError) this.instance).setHeap(builder.build());
                return this;
            }

            public Builder mergeHeap(HeapObject heapObject) {
                copyOnWrite();
                ((MemoryError) this.instance).mergeHeap(heapObject);
                return this;
            }

            public Builder clearHeap() {
                copyOnWrite();
                ((MemoryError) this.instance).clearHeap();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoryError();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003<\u0000", new Object[]{"location_", "locationCase_", "tool_", "type_", HeapObject.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MemoryError> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MemoryError.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            MemoryError memoryError = new MemoryError();
            DEFAULT_INSTANCE = memoryError;
            GeneratedMessageLite.registerDefaultInstance(MemoryError.class, memoryError);
        }

        public static MemoryError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MemoryError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Cause extends GeneratedMessageLite<Cause, Builder> implements CauseOrBuilder {
        private static final Cause DEFAULT_INSTANCE;
        public static final int HUMAN_READABLE_FIELD_NUMBER = 1;
        public static final int MEMORY_ERROR_FIELD_NUMBER = 2;
        private static volatile Parser<Cause> PARSER;
        private Object details_;
        private int detailsCase_ = 0;
        private String humanReadable_ = "";

        private Cause() {
        }

        public enum DetailsCase {
            MEMORY_ERROR(2),
            DETAILS_NOT_SET(0);

            private final int value;

            DetailsCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static DetailsCase valueOf(int i) {
                return forNumber(i);
            }

            public static DetailsCase forNumber(int i) {
                if (i == 0) {
                    return DETAILS_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return MEMORY_ERROR;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public DetailsCase getDetailsCase() {
            return DetailsCase.forNumber(this.detailsCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetails() {
            this.detailsCase_ = 0;
            this.details_ = null;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public String getHumanReadable() {
            return this.humanReadable_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public ByteString getHumanReadableBytes() {
            return ByteString.copyFromUtf8(this.humanReadable_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHumanReadable(String str) {
            str.getClass();
            this.humanReadable_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHumanReadable() {
            this.humanReadable_ = getDefaultInstance().getHumanReadable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHumanReadableBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.humanReadable_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public boolean hasMemoryError() {
            return this.detailsCase_ == 2;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
        public MemoryError getMemoryError() {
            if (this.detailsCase_ == 2) {
                return (MemoryError) this.details_;
            }
            return MemoryError.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryError(MemoryError memoryError) {
            memoryError.getClass();
            this.details_ = memoryError;
            this.detailsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMemoryError(MemoryError memoryError) {
            memoryError.getClass();
            if (this.detailsCase_ == 2 && this.details_ != MemoryError.getDefaultInstance()) {
                this.details_ = MemoryError.newBuilder((MemoryError) this.details_).mergeFrom((MemoryError.Builder) memoryError).buildPartial();
            } else {
                this.details_ = memoryError;
            }
            this.detailsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryError() {
            if (this.detailsCase_ == 2) {
                this.detailsCase_ = 0;
                this.details_ = null;
            }
        }

        public static Cause parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Cause parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Cause parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Cause parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Cause parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Cause parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Cause parseFrom(InputStream inputStream) throws IOException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Cause parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Cause parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Cause) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Cause parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Cause) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Cause parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Cause parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Cause cause) {
            return DEFAULT_INSTANCE.createBuilder(cause);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Cause, Builder> implements CauseOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Cause.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public DetailsCase getDetailsCase() {
                return ((Cause) this.instance).getDetailsCase();
            }

            public Builder clearDetails() {
                copyOnWrite();
                ((Cause) this.instance).clearDetails();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public String getHumanReadable() {
                return ((Cause) this.instance).getHumanReadable();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public ByteString getHumanReadableBytes() {
                return ((Cause) this.instance).getHumanReadableBytes();
            }

            public Builder setHumanReadable(String str) {
                copyOnWrite();
                ((Cause) this.instance).setHumanReadable(str);
                return this;
            }

            public Builder clearHumanReadable() {
                copyOnWrite();
                ((Cause) this.instance).clearHumanReadable();
                return this;
            }

            public Builder setHumanReadableBytes(ByteString byteString) {
                copyOnWrite();
                ((Cause) this.instance).setHumanReadableBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public boolean hasMemoryError() {
                return ((Cause) this.instance).hasMemoryError();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.CauseOrBuilder
            public MemoryError getMemoryError() {
                return ((Cause) this.instance).getMemoryError();
            }

            public Builder setMemoryError(MemoryError memoryError) {
                copyOnWrite();
                ((Cause) this.instance).setMemoryError(memoryError);
                return this;
            }

            public Builder setMemoryError(MemoryError.Builder builder) {
                copyOnWrite();
                ((Cause) this.instance).setMemoryError(builder.build());
                return this;
            }

            public Builder mergeMemoryError(MemoryError memoryError) {
                copyOnWrite();
                ((Cause) this.instance).mergeMemoryError(memoryError);
                return this;
            }

            public Builder clearMemoryError() {
                copyOnWrite();
                ((Cause) this.instance).clearMemoryError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Cause();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"details_", "detailsCase_", "humanReadable_", MemoryError.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Cause> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Cause.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Cause cause = new Cause();
            DEFAULT_INSTANCE = cause;
            GeneratedMessageLite.registerDefaultInstance(Cause.class, cause);
        }

        public static Cause getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Cause> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Register extends GeneratedMessageLite<Register, Builder> implements RegisterOrBuilder {
        private static final Register DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<Register> PARSER = null;
        public static final int U64_FIELD_NUMBER = 2;
        private String name_ = "";
        private long u64_;

        private Register() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
        public long getU64() {
            return this.u64_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setU64(long j) {
            this.u64_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearU64() {
            this.u64_ = 0L;
        }

        public static Register parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Register parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Register parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Register parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Register parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Register parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Register parseFrom(InputStream inputStream) throws IOException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Register parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Register parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Register) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Register parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Register) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Register parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Register parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Register register) {
            return DEFAULT_INSTANCE.createBuilder(register);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Register, Builder> implements RegisterOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Register.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
            public String getName() {
                return ((Register) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
            public ByteString getNameBytes() {
                return ((Register) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Register) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Register) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Register) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.RegisterOrBuilder
            public long getU64() {
                return ((Register) this.instance).getU64();
            }

            public Builder setU64(long j) {
                copyOnWrite();
                ((Register) this.instance).setU64(j);
                return this;
            }

            public Builder clearU64() {
                copyOnWrite();
                ((Register) this.instance).clearU64();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Register();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"name_", "u64_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Register> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Register.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Register register = new Register();
            DEFAULT_INSTANCE = register;
            GeneratedMessageLite.registerDefaultInstance(Register.class, register);
        }

        public static Register getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Register> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Thread extends GeneratedMessageLite<Thread, Builder> implements ThreadOrBuilder {
        public static final int BACKTRACE_NOTE_FIELD_NUMBER = 7;
        public static final int CURRENT_BACKTRACE_FIELD_NUMBER = 4;
        private static final Thread DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MEMORY_DUMP_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PAC_ENABLED_KEYS_FIELD_NUMBER = 8;
        private static volatile Parser<Thread> PARSER = null;
        public static final int REGISTERS_FIELD_NUMBER = 3;
        public static final int TAGGED_ADDR_CTRL_FIELD_NUMBER = 6;
        public static final int UNREADABLE_ELF_FILES_FIELD_NUMBER = 9;
        private int id_;
        private long pacEnabledKeys_;
        private long taggedAddrCtrl_;
        private String name_ = "";
        private Internal.ProtobufList<Register> registers_ = emptyProtobufList();
        private Internal.ProtobufList<String> backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<BacktraceFrame> currentBacktrace_ = emptyProtobufList();
        private Internal.ProtobufList<MemoryDump> memoryDump_ = emptyProtobufList();

        private Thread() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getId() {
            return this.id_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<Register> getRegistersList() {
            return this.registers_;
        }

        public List<? extends RegisterOrBuilder> getRegistersOrBuilderList() {
            return this.registers_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getRegistersCount() {
            return this.registers_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public Register getRegisters(int i) {
            return this.registers_.get(i);
        }

        public RegisterOrBuilder getRegistersOrBuilder(int i) {
            return this.registers_.get(i);
        }

        private void ensureRegistersIsMutable() {
            Internal.ProtobufList<Register> protobufList = this.registers_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.registers_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegisters(int i, Register register) {
            register.getClass();
            ensureRegistersIsMutable();
            this.registers_.set(i, register);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRegisters(Register register) {
            register.getClass();
            ensureRegistersIsMutable();
            this.registers_.add(register);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRegisters(int i, Register register) {
            register.getClass();
            ensureRegistersIsMutable();
            this.registers_.add(i, register);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRegisters(Iterable<? extends Register> iterable) {
            ensureRegistersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.registers_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegisters() {
            this.registers_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRegisters(int i) {
            ensureRegistersIsMutable();
            this.registers_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<String> getBacktraceNoteList() {
            return this.backtraceNote_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getBacktraceNoteCount() {
            return this.backtraceNote_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public String getBacktraceNote(int i) {
            return this.backtraceNote_.get(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public ByteString getBacktraceNoteBytes(int i) {
            return ByteString.copyFromUtf8(this.backtraceNote_.get(i));
        }

        private void ensureBacktraceNoteIsMutable() {
            Internal.ProtobufList<String> protobufList = this.backtraceNote_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.backtraceNote_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacktraceNote(int i, String str) {
            str.getClass();
            ensureBacktraceNoteIsMutable();
            this.backtraceNote_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBacktraceNote(String str) {
            str.getClass();
            ensureBacktraceNoteIsMutable();
            this.backtraceNote_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBacktraceNote(Iterable<String> iterable) {
            ensureBacktraceNoteIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.backtraceNote_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBacktraceNote() {
            this.backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBacktraceNoteBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureBacktraceNoteIsMutable();
            this.backtraceNote_.add(byteString.toStringUtf8());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<String> getUnreadableElfFilesList() {
            return this.unreadableElfFiles_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getUnreadableElfFilesCount() {
            return this.unreadableElfFiles_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public String getUnreadableElfFiles(int i) {
            return this.unreadableElfFiles_.get(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public ByteString getUnreadableElfFilesBytes(int i) {
            return ByteString.copyFromUtf8(this.unreadableElfFiles_.get(i));
        }

        private void ensureUnreadableElfFilesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.unreadableElfFiles_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.unreadableElfFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnreadableElfFiles(int i, String str) {
            str.getClass();
            ensureUnreadableElfFilesIsMutable();
            this.unreadableElfFiles_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUnreadableElfFiles(String str) {
            str.getClass();
            ensureUnreadableElfFilesIsMutable();
            this.unreadableElfFiles_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUnreadableElfFiles(Iterable<String> iterable) {
            ensureUnreadableElfFilesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.unreadableElfFiles_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnreadableElfFiles() {
            this.unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUnreadableElfFilesBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureUnreadableElfFilesIsMutable();
            this.unreadableElfFiles_.add(byteString.toStringUtf8());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<BacktraceFrame> getCurrentBacktraceList() {
            return this.currentBacktrace_;
        }

        public List<? extends BacktraceFrameOrBuilder> getCurrentBacktraceOrBuilderList() {
            return this.currentBacktrace_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getCurrentBacktraceCount() {
            return this.currentBacktrace_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public BacktraceFrame getCurrentBacktrace(int i) {
            return this.currentBacktrace_.get(i);
        }

        public BacktraceFrameOrBuilder getCurrentBacktraceOrBuilder(int i) {
            return this.currentBacktrace_.get(i);
        }

        private void ensureCurrentBacktraceIsMutable() {
            Internal.ProtobufList<BacktraceFrame> protobufList = this.currentBacktrace_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.currentBacktrace_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentBacktrace(int i, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.set(i, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentBacktrace(BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.add(backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCurrentBacktrace(int i, BacktraceFrame backtraceFrame) {
            backtraceFrame.getClass();
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.add(i, backtraceFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCurrentBacktrace(Iterable<? extends BacktraceFrame> iterable) {
            ensureCurrentBacktraceIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.currentBacktrace_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentBacktrace() {
            this.currentBacktrace_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCurrentBacktrace(int i) {
            ensureCurrentBacktraceIsMutable();
            this.currentBacktrace_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public List<MemoryDump> getMemoryDumpList() {
            return this.memoryDump_;
        }

        public List<? extends MemoryDumpOrBuilder> getMemoryDumpOrBuilderList() {
            return this.memoryDump_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public int getMemoryDumpCount() {
            return this.memoryDump_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public MemoryDump getMemoryDump(int i) {
            return this.memoryDump_.get(i);
        }

        public MemoryDumpOrBuilder getMemoryDumpOrBuilder(int i) {
            return this.memoryDump_.get(i);
        }

        private void ensureMemoryDumpIsMutable() {
            Internal.ProtobufList<MemoryDump> protobufList = this.memoryDump_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.memoryDump_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryDump(int i, MemoryDump memoryDump) {
            memoryDump.getClass();
            ensureMemoryDumpIsMutable();
            this.memoryDump_.set(i, memoryDump);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryDump(MemoryDump memoryDump) {
            memoryDump.getClass();
            ensureMemoryDumpIsMutable();
            this.memoryDump_.add(memoryDump);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMemoryDump(int i, MemoryDump memoryDump) {
            memoryDump.getClass();
            ensureMemoryDumpIsMutable();
            this.memoryDump_.add(i, memoryDump);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMemoryDump(Iterable<? extends MemoryDump> iterable) {
            ensureMemoryDumpIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.memoryDump_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryDump() {
            this.memoryDump_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMemoryDump(int i) {
            ensureMemoryDumpIsMutable();
            this.memoryDump_.remove(i);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public long getTaggedAddrCtrl() {
            return this.taggedAddrCtrl_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaggedAddrCtrl(long j) {
            this.taggedAddrCtrl_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaggedAddrCtrl() {
            this.taggedAddrCtrl_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
        public long getPacEnabledKeys() {
            return this.pacEnabledKeys_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacEnabledKeys(long j) {
            this.pacEnabledKeys_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacEnabledKeys() {
            this.pacEnabledKeys_ = 0L;
        }

        public static Thread parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Thread parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Thread parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Thread parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Thread parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Thread parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Thread parseFrom(InputStream inputStream) throws IOException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Thread parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Thread parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Thread) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Thread parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Thread) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Thread parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Thread parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Thread thread) {
            return DEFAULT_INSTANCE.createBuilder(thread);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Thread, Builder> implements ThreadOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Thread.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getId() {
                return ((Thread) this.instance).getId();
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((Thread) this.instance).setId(i);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Thread) this.instance).clearId();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public String getName() {
                return ((Thread) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public ByteString getNameBytes() {
                return ((Thread) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Thread) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Thread) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Thread) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<Register> getRegistersList() {
                return Collections.unmodifiableList(((Thread) this.instance).getRegistersList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getRegistersCount() {
                return ((Thread) this.instance).getRegistersCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public Register getRegisters(int i) {
                return ((Thread) this.instance).getRegisters(i);
            }

            public Builder setRegisters(int i, Register register) {
                copyOnWrite();
                ((Thread) this.instance).setRegisters(i, register);
                return this;
            }

            public Builder setRegisters(int i, Register.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).setRegisters(i, builder.build());
                return this;
            }

            public Builder addRegisters(Register register) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters(register);
                return this;
            }

            public Builder addRegisters(int i, Register register) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters(i, register);
                return this;
            }

            public Builder addRegisters(Register.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters(builder.build());
                return this;
            }

            public Builder addRegisters(int i, Register.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addRegisters(i, builder.build());
                return this;
            }

            public Builder addAllRegisters(Iterable<? extends Register> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllRegisters(iterable);
                return this;
            }

            public Builder clearRegisters() {
                copyOnWrite();
                ((Thread) this.instance).clearRegisters();
                return this;
            }

            public Builder removeRegisters(int i) {
                copyOnWrite();
                ((Thread) this.instance).removeRegisters(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<String> getBacktraceNoteList() {
                return Collections.unmodifiableList(((Thread) this.instance).getBacktraceNoteList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getBacktraceNoteCount() {
                return ((Thread) this.instance).getBacktraceNoteCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public String getBacktraceNote(int i) {
                return ((Thread) this.instance).getBacktraceNote(i);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public ByteString getBacktraceNoteBytes(int i) {
                return ((Thread) this.instance).getBacktraceNoteBytes(i);
            }

            public Builder setBacktraceNote(int i, String str) {
                copyOnWrite();
                ((Thread) this.instance).setBacktraceNote(i, str);
                return this;
            }

            public Builder addBacktraceNote(String str) {
                copyOnWrite();
                ((Thread) this.instance).addBacktraceNote(str);
                return this;
            }

            public Builder addAllBacktraceNote(Iterable<String> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllBacktraceNote(iterable);
                return this;
            }

            public Builder clearBacktraceNote() {
                copyOnWrite();
                ((Thread) this.instance).clearBacktraceNote();
                return this;
            }

            public Builder addBacktraceNoteBytes(ByteString byteString) {
                copyOnWrite();
                ((Thread) this.instance).addBacktraceNoteBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<String> getUnreadableElfFilesList() {
                return Collections.unmodifiableList(((Thread) this.instance).getUnreadableElfFilesList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getUnreadableElfFilesCount() {
                return ((Thread) this.instance).getUnreadableElfFilesCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public String getUnreadableElfFiles(int i) {
                return ((Thread) this.instance).getUnreadableElfFiles(i);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public ByteString getUnreadableElfFilesBytes(int i) {
                return ((Thread) this.instance).getUnreadableElfFilesBytes(i);
            }

            public Builder setUnreadableElfFiles(int i, String str) {
                copyOnWrite();
                ((Thread) this.instance).setUnreadableElfFiles(i, str);
                return this;
            }

            public Builder addUnreadableElfFiles(String str) {
                copyOnWrite();
                ((Thread) this.instance).addUnreadableElfFiles(str);
                return this;
            }

            public Builder addAllUnreadableElfFiles(Iterable<String> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllUnreadableElfFiles(iterable);
                return this;
            }

            public Builder clearUnreadableElfFiles() {
                copyOnWrite();
                ((Thread) this.instance).clearUnreadableElfFiles();
                return this;
            }

            public Builder addUnreadableElfFilesBytes(ByteString byteString) {
                copyOnWrite();
                ((Thread) this.instance).addUnreadableElfFilesBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<BacktraceFrame> getCurrentBacktraceList() {
                return Collections.unmodifiableList(((Thread) this.instance).getCurrentBacktraceList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getCurrentBacktraceCount() {
                return ((Thread) this.instance).getCurrentBacktraceCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public BacktraceFrame getCurrentBacktrace(int i) {
                return ((Thread) this.instance).getCurrentBacktrace(i);
            }

            public Builder setCurrentBacktrace(int i, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((Thread) this.instance).setCurrentBacktrace(i, backtraceFrame);
                return this;
            }

            public Builder setCurrentBacktrace(int i, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).setCurrentBacktrace(i, builder.build());
                return this;
            }

            public Builder addCurrentBacktrace(BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace(backtraceFrame);
                return this;
            }

            public Builder addCurrentBacktrace(int i, BacktraceFrame backtraceFrame) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace(i, backtraceFrame);
                return this;
            }

            public Builder addCurrentBacktrace(BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace(builder.build());
                return this;
            }

            public Builder addCurrentBacktrace(int i, BacktraceFrame.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addCurrentBacktrace(i, builder.build());
                return this;
            }

            public Builder addAllCurrentBacktrace(Iterable<? extends BacktraceFrame> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllCurrentBacktrace(iterable);
                return this;
            }

            public Builder clearCurrentBacktrace() {
                copyOnWrite();
                ((Thread) this.instance).clearCurrentBacktrace();
                return this;
            }

            public Builder removeCurrentBacktrace(int i) {
                copyOnWrite();
                ((Thread) this.instance).removeCurrentBacktrace(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public List<MemoryDump> getMemoryDumpList() {
                return Collections.unmodifiableList(((Thread) this.instance).getMemoryDumpList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public int getMemoryDumpCount() {
                return ((Thread) this.instance).getMemoryDumpCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public MemoryDump getMemoryDump(int i) {
                return ((Thread) this.instance).getMemoryDump(i);
            }

            public Builder setMemoryDump(int i, MemoryDump memoryDump) {
                copyOnWrite();
                ((Thread) this.instance).setMemoryDump(i, memoryDump);
                return this;
            }

            public Builder setMemoryDump(int i, MemoryDump.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).setMemoryDump(i, builder.build());
                return this;
            }

            public Builder addMemoryDump(MemoryDump memoryDump) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump(memoryDump);
                return this;
            }

            public Builder addMemoryDump(int i, MemoryDump memoryDump) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump(i, memoryDump);
                return this;
            }

            public Builder addMemoryDump(MemoryDump.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump(builder.build());
                return this;
            }

            public Builder addMemoryDump(int i, MemoryDump.Builder builder) {
                copyOnWrite();
                ((Thread) this.instance).addMemoryDump(i, builder.build());
                return this;
            }

            public Builder addAllMemoryDump(Iterable<? extends MemoryDump> iterable) {
                copyOnWrite();
                ((Thread) this.instance).addAllMemoryDump(iterable);
                return this;
            }

            public Builder clearMemoryDump() {
                copyOnWrite();
                ((Thread) this.instance).clearMemoryDump();
                return this;
            }

            public Builder removeMemoryDump(int i) {
                copyOnWrite();
                ((Thread) this.instance).removeMemoryDump(i);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public long getTaggedAddrCtrl() {
                return ((Thread) this.instance).getTaggedAddrCtrl();
            }

            public Builder setTaggedAddrCtrl(long j) {
                copyOnWrite();
                ((Thread) this.instance).setTaggedAddrCtrl(j);
                return this;
            }

            public Builder clearTaggedAddrCtrl() {
                copyOnWrite();
                ((Thread) this.instance).clearTaggedAddrCtrl();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ThreadOrBuilder
            public long getPacEnabledKeys() {
                return ((Thread) this.instance).getPacEnabledKeys();
            }

            public Builder setPacEnabledKeys(long j) {
                copyOnWrite();
                ((Thread) this.instance).setPacEnabledKeys(j);
                return this;
            }

            public Builder clearPacEnabledKeys() {
                copyOnWrite();
                ((Thread) this.instance).clearPacEnabledKeys();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Thread();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", Register.class, "currentBacktrace_", BacktraceFrame.class, "memoryDump_", MemoryDump.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Thread> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Thread.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Thread thread = new Thread();
            DEFAULT_INSTANCE = thread;
            GeneratedMessageLite.registerDefaultInstance(Thread.class, thread);
        }

        public static Thread getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Thread> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class BacktraceFrame extends GeneratedMessageLite<BacktraceFrame, Builder> implements BacktraceFrameOrBuilder {
        public static final int BUILD_ID_FIELD_NUMBER = 8;
        private static final BacktraceFrame DEFAULT_INSTANCE;
        public static final int FILE_MAP_OFFSET_FIELD_NUMBER = 7;
        public static final int FILE_NAME_FIELD_NUMBER = 6;
        public static final int FUNCTION_NAME_FIELD_NUMBER = 4;
        public static final int FUNCTION_OFFSET_FIELD_NUMBER = 5;
        private static volatile Parser<BacktraceFrame> PARSER = null;
        public static final int PC_FIELD_NUMBER = 2;
        public static final int REL_PC_FIELD_NUMBER = 1;
        public static final int SP_FIELD_NUMBER = 3;
        private long fileMapOffset_;
        private long functionOffset_;
        private long pc_;
        private long relPc_;
        private long sp_;
        private String functionName_ = "";
        private String fileName_ = "";
        private String buildId_ = "";

        private BacktraceFrame() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getRelPc() {
            return this.relPc_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelPc(long j) {
            this.relPc_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelPc() {
            this.relPc_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getPc() {
            return this.pc_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPc(long j) {
            this.pc_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPc() {
            this.pc_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getSp() {
            return this.sp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSp(long j) {
            this.sp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSp() {
            this.sp_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public String getFunctionName() {
            return this.functionName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public ByteString getFunctionNameBytes() {
            return ByteString.copyFromUtf8(this.functionName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunctionName(String str) {
            str.getClass();
            this.functionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFunctionName() {
            this.functionName_ = getDefaultInstance().getFunctionName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunctionNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.functionName_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getFunctionOffset() {
            return this.functionOffset_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFunctionOffset(long j) {
            this.functionOffset_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFunctionOffset() {
            this.functionOffset_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public String getFileName() {
            return this.fileName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public ByteString getFileNameBytes() {
            return ByteString.copyFromUtf8(this.fileName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileName(String str) {
            str.getClass();
            this.fileName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileName() {
            this.fileName_ = getDefaultInstance().getFileName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.fileName_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public long getFileMapOffset() {
            return this.fileMapOffset_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileMapOffset(long j) {
            this.fileMapOffset_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileMapOffset() {
            this.fileMapOffset_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public String getBuildId() {
            return this.buildId_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
        public ByteString getBuildIdBytes() {
            return ByteString.copyFromUtf8(this.buildId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildId(String str) {
            str.getClass();
            this.buildId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildId() {
            this.buildId_ = getDefaultInstance().getBuildId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.buildId_ = byteString.toStringUtf8();
        }

        public static BacktraceFrame parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BacktraceFrame parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BacktraceFrame parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BacktraceFrame parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BacktraceFrame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BacktraceFrame parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BacktraceFrame parseFrom(InputStream inputStream) throws IOException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacktraceFrame parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BacktraceFrame parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BacktraceFrame) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BacktraceFrame parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BacktraceFrame) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BacktraceFrame parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BacktraceFrame parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(BacktraceFrame backtraceFrame) {
            return DEFAULT_INSTANCE.createBuilder(backtraceFrame);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<BacktraceFrame, Builder> implements BacktraceFrameOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(BacktraceFrame.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getRelPc() {
                return ((BacktraceFrame) this.instance).getRelPc();
            }

            public Builder setRelPc(long j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setRelPc(j);
                return this;
            }

            public Builder clearRelPc() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearRelPc();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getPc() {
                return ((BacktraceFrame) this.instance).getPc();
            }

            public Builder setPc(long j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setPc(j);
                return this;
            }

            public Builder clearPc() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearPc();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getSp() {
                return ((BacktraceFrame) this.instance).getSp();
            }

            public Builder setSp(long j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setSp(j);
                return this;
            }

            public Builder clearSp() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearSp();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public String getFunctionName() {
                return ((BacktraceFrame) this.instance).getFunctionName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public ByteString getFunctionNameBytes() {
                return ((BacktraceFrame) this.instance).getFunctionNameBytes();
            }

            public Builder setFunctionName(String str) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFunctionName(str);
                return this;
            }

            public Builder clearFunctionName() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFunctionName();
                return this;
            }

            public Builder setFunctionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFunctionNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getFunctionOffset() {
                return ((BacktraceFrame) this.instance).getFunctionOffset();
            }

            public Builder setFunctionOffset(long j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFunctionOffset(j);
                return this;
            }

            public Builder clearFunctionOffset() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFunctionOffset();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public String getFileName() {
                return ((BacktraceFrame) this.instance).getFileName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public ByteString getFileNameBytes() {
                return ((BacktraceFrame) this.instance).getFileNameBytes();
            }

            public Builder setFileName(String str) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFileName(str);
                return this;
            }

            public Builder clearFileName() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFileName();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFileNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public long getFileMapOffset() {
                return ((BacktraceFrame) this.instance).getFileMapOffset();
            }

            public Builder setFileMapOffset(long j) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setFileMapOffset(j);
                return this;
            }

            public Builder clearFileMapOffset() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearFileMapOffset();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public String getBuildId() {
                return ((BacktraceFrame) this.instance).getBuildId();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.BacktraceFrameOrBuilder
            public ByteString getBuildIdBytes() {
                return ((BacktraceFrame) this.instance).getBuildIdBytes();
            }

            public Builder setBuildId(String str) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setBuildId(str);
                return this;
            }

            public Builder clearBuildId() {
                copyOnWrite();
                ((BacktraceFrame) this.instance).clearBuildId();
                return this;
            }

            public Builder setBuildIdBytes(ByteString byteString) {
                copyOnWrite();
                ((BacktraceFrame) this.instance).setBuildIdBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BacktraceFrame();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004Ȉ\u0005\u0003\u0006Ȉ\u0007\u0003\bȈ", new Object[]{"relPc_", "pc_", "sp_", "functionName_", "functionOffset_", "fileName_", "fileMapOffset_", "buildId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BacktraceFrame> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (BacktraceFrame.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            BacktraceFrame backtraceFrame = new BacktraceFrame();
            DEFAULT_INSTANCE = backtraceFrame;
            GeneratedMessageLite.registerDefaultInstance(BacktraceFrame.class, backtraceFrame);
        }

        public static BacktraceFrame getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BacktraceFrame> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ArmMTEMetadata extends GeneratedMessageLite<ArmMTEMetadata, Builder> implements ArmMTEMetadataOrBuilder {
        private static final ArmMTEMetadata DEFAULT_INSTANCE;
        public static final int MEMORY_TAGS_FIELD_NUMBER = 1;
        private static volatile Parser<ArmMTEMetadata> PARSER;
        private ByteString memoryTags_ = ByteString.EMPTY;

        private ArmMTEMetadata() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ArmMTEMetadataOrBuilder
        public ByteString getMemoryTags() {
            return this.memoryTags_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryTags(ByteString byteString) {
            byteString.getClass();
            this.memoryTags_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryTags() {
            this.memoryTags_ = getDefaultInstance().getMemoryTags();
        }

        public static ArmMTEMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ArmMTEMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ArmMTEMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ArmMTEMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ArmMTEMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ArmMTEMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ArmMTEMetadata parseFrom(InputStream inputStream) throws IOException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ArmMTEMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ArmMTEMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ArmMTEMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ArmMTEMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ArmMTEMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ArmMTEMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ArmMTEMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ArmMTEMetadata armMTEMetadata) {
            return DEFAULT_INSTANCE.createBuilder(armMTEMetadata);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ArmMTEMetadata, Builder> implements ArmMTEMetadataOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ArmMTEMetadata.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.ArmMTEMetadataOrBuilder
            public ByteString getMemoryTags() {
                return ((ArmMTEMetadata) this.instance).getMemoryTags();
            }

            public Builder setMemoryTags(ByteString byteString) {
                copyOnWrite();
                ((ArmMTEMetadata) this.instance).setMemoryTags(byteString);
                return this;
            }

            public Builder clearMemoryTags() {
                copyOnWrite();
                ((ArmMTEMetadata) this.instance).clearMemoryTags();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ArmMTEMetadata();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"memoryTags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ArmMTEMetadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (ArmMTEMetadata.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ArmMTEMetadata armMTEMetadata = new ArmMTEMetadata();
            DEFAULT_INSTANCE = armMTEMetadata;
            GeneratedMessageLite.registerDefaultInstance(ArmMTEMetadata.class, armMTEMetadata);
        }

        public static ArmMTEMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ArmMTEMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MemoryDump extends GeneratedMessageLite<MemoryDump, Builder> implements MemoryDumpOrBuilder {
        public static final int ARM_MTE_METADATA_FIELD_NUMBER = 6;
        public static final int BEGIN_ADDRESS_FIELD_NUMBER = 3;
        private static final MemoryDump DEFAULT_INSTANCE;
        public static final int MAPPING_NAME_FIELD_NUMBER = 2;
        public static final int MEMORY_FIELD_NUMBER = 4;
        private static volatile Parser<MemoryDump> PARSER = null;
        public static final int REGISTER_NAME_FIELD_NUMBER = 1;
        private long beginAddress_;
        private Object metadata_;
        private int metadataCase_ = 0;
        private String registerName_ = "";
        private String mappingName_ = "";
        private ByteString memory_ = ByteString.EMPTY;

        private MemoryDump() {
        }

        public enum MetadataCase {
            ARM_MTE_METADATA(6),
            METADATA_NOT_SET(0);

            private final int value;

            MetadataCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static MetadataCase valueOf(int i) {
                return forNumber(i);
            }

            public static MetadataCase forNumber(int i) {
                if (i == 0) {
                    return METADATA_NOT_SET;
                }
                if (i != 6) {
                    return null;
                }
                return ARM_MTE_METADATA;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public MetadataCase getMetadataCase() {
            return MetadataCase.forNumber(this.metadataCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public String getRegisterName() {
            return this.registerName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public ByteString getRegisterNameBytes() {
            return ByteString.copyFromUtf8(this.registerName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegisterName(String str) {
            str.getClass();
            this.registerName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegisterName() {
            this.registerName_ = getDefaultInstance().getRegisterName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegisterNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.registerName_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public String getMappingName() {
            return this.mappingName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public ByteString getMappingNameBytes() {
            return ByteString.copyFromUtf8(this.mappingName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingName(String str) {
            str.getClass();
            this.mappingName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMappingName() {
            this.mappingName_ = getDefaultInstance().getMappingName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mappingName_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public long getBeginAddress() {
            return this.beginAddress_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeginAddress(long j) {
            this.beginAddress_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeginAddress() {
            this.beginAddress_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public ByteString getMemory() {
            return this.memory_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemory(ByteString byteString) {
            byteString.getClass();
            this.memory_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemory() {
            this.memory_ = getDefaultInstance().getMemory();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public boolean hasArmMteMetadata() {
            return this.metadataCase_ == 6;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
        public ArmMTEMetadata getArmMteMetadata() {
            if (this.metadataCase_ == 6) {
                return (ArmMTEMetadata) this.metadata_;
            }
            return ArmMTEMetadata.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
            armMTEMetadata.getClass();
            this.metadata_ = armMTEMetadata;
            this.metadataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
            armMTEMetadata.getClass();
            if (this.metadataCase_ == 6 && this.metadata_ != ArmMTEMetadata.getDefaultInstance()) {
                this.metadata_ = ArmMTEMetadata.newBuilder((ArmMTEMetadata) this.metadata_).mergeFrom((ArmMTEMetadata.Builder) armMTEMetadata).buildPartial();
            } else {
                this.metadata_ = armMTEMetadata;
            }
            this.metadataCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArmMteMetadata() {
            if (this.metadataCase_ == 6) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        public static MemoryDump parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MemoryDump parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MemoryDump parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoryDump parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MemoryDump parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoryDump parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MemoryDump parseFrom(InputStream inputStream) throws IOException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryDump parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryDump parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoryDump) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryDump parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryDump) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryDump parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MemoryDump parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MemoryDump memoryDump) {
            return DEFAULT_INSTANCE.createBuilder(memoryDump);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MemoryDump, Builder> implements MemoryDumpOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(MemoryDump.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public MetadataCase getMetadataCase() {
                return ((MemoryDump) this.instance).getMetadataCase();
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearMetadata();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public String getRegisterName() {
                return ((MemoryDump) this.instance).getRegisterName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public ByteString getRegisterNameBytes() {
                return ((MemoryDump) this.instance).getRegisterNameBytes();
            }

            public Builder setRegisterName(String str) {
                copyOnWrite();
                ((MemoryDump) this.instance).setRegisterName(str);
                return this;
            }

            public Builder clearRegisterName() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearRegisterName();
                return this;
            }

            public Builder setRegisterNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MemoryDump) this.instance).setRegisterNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public String getMappingName() {
                return ((MemoryDump) this.instance).getMappingName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public ByteString getMappingNameBytes() {
                return ((MemoryDump) this.instance).getMappingNameBytes();
            }

            public Builder setMappingName(String str) {
                copyOnWrite();
                ((MemoryDump) this.instance).setMappingName(str);
                return this;
            }

            public Builder clearMappingName() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearMappingName();
                return this;
            }

            public Builder setMappingNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MemoryDump) this.instance).setMappingNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public long getBeginAddress() {
                return ((MemoryDump) this.instance).getBeginAddress();
            }

            public Builder setBeginAddress(long j) {
                copyOnWrite();
                ((MemoryDump) this.instance).setBeginAddress(j);
                return this;
            }

            public Builder clearBeginAddress() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearBeginAddress();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public ByteString getMemory() {
                return ((MemoryDump) this.instance).getMemory();
            }

            public Builder setMemory(ByteString byteString) {
                copyOnWrite();
                ((MemoryDump) this.instance).setMemory(byteString);
                return this;
            }

            public Builder clearMemory() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearMemory();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public boolean hasArmMteMetadata() {
                return ((MemoryDump) this.instance).hasArmMteMetadata();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryDumpOrBuilder
            public ArmMTEMetadata getArmMteMetadata() {
                return ((MemoryDump) this.instance).getArmMteMetadata();
            }

            public Builder setArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
                copyOnWrite();
                ((MemoryDump) this.instance).setArmMteMetadata(armMTEMetadata);
                return this;
            }

            public Builder setArmMteMetadata(ArmMTEMetadata.Builder builder) {
                copyOnWrite();
                ((MemoryDump) this.instance).setArmMteMetadata(builder.build());
                return this;
            }

            public Builder mergeArmMteMetadata(ArmMTEMetadata armMTEMetadata) {
                copyOnWrite();
                ((MemoryDump) this.instance).mergeArmMteMetadata(armMTEMetadata);
                return this;
            }

            public Builder clearArmMteMetadata() {
                copyOnWrite();
                ((MemoryDump) this.instance).clearArmMteMetadata();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoryDump();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\n\u0006<\u0000", new Object[]{"metadata_", "metadataCase_", "registerName_", "mappingName_", "beginAddress_", "memory_", ArmMTEMetadata.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MemoryDump> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MemoryDump.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            MemoryDump memoryDump = new MemoryDump();
            DEFAULT_INSTANCE = memoryDump;
            GeneratedMessageLite.registerDefaultInstance(MemoryDump.class, memoryDump);
        }

        public static MemoryDump getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MemoryDump> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MemoryMapping extends GeneratedMessageLite<MemoryMapping, Builder> implements MemoryMappingOrBuilder {
        public static final int BEGIN_ADDRESS_FIELD_NUMBER = 1;
        public static final int BUILD_ID_FIELD_NUMBER = 8;
        private static final MemoryMapping DEFAULT_INSTANCE;
        public static final int END_ADDRESS_FIELD_NUMBER = 2;
        public static final int EXECUTE_FIELD_NUMBER = 6;
        public static final int LOAD_BIAS_FIELD_NUMBER = 9;
        public static final int MAPPING_NAME_FIELD_NUMBER = 7;
        public static final int OFFSET_FIELD_NUMBER = 3;
        private static volatile Parser<MemoryMapping> PARSER = null;
        public static final int READ_FIELD_NUMBER = 4;
        public static final int WRITE_FIELD_NUMBER = 5;
        private long beginAddress_;
        private long endAddress_;
        private boolean execute_;
        private long loadBias_;
        private long offset_;
        private boolean read_;
        private boolean write_;
        private String mappingName_ = "";
        private String buildId_ = "";

        private MemoryMapping() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getBeginAddress() {
            return this.beginAddress_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeginAddress(long j) {
            this.beginAddress_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeginAddress() {
            this.beginAddress_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getEndAddress() {
            return this.endAddress_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndAddress(long j) {
            this.endAddress_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndAddress() {
            this.endAddress_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getOffset() {
            return this.offset_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffset(long j) {
            this.offset_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOffset() {
            this.offset_ = 0L;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public boolean getRead() {
            return this.read_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRead(boolean z) {
            this.read_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRead() {
            this.read_ = false;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public boolean getWrite() {
            return this.write_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWrite(boolean z) {
            this.write_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWrite() {
            this.write_ = false;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public boolean getExecute() {
            return this.execute_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExecute(boolean z) {
            this.execute_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExecute() {
            this.execute_ = false;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public String getMappingName() {
            return this.mappingName_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public ByteString getMappingNameBytes() {
            return ByteString.copyFromUtf8(this.mappingName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingName(String str) {
            str.getClass();
            this.mappingName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMappingName() {
            this.mappingName_ = getDefaultInstance().getMappingName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMappingNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.mappingName_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public String getBuildId() {
            return this.buildId_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public ByteString getBuildIdBytes() {
            return ByteString.copyFromUtf8(this.buildId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildId(String str) {
            str.getClass();
            this.buildId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildId() {
            this.buildId_ = getDefaultInstance().getBuildId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.buildId_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
        public long getLoadBias() {
            return this.loadBias_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadBias(long j) {
            this.loadBias_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadBias() {
            this.loadBias_ = 0L;
        }

        public static MemoryMapping parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MemoryMapping parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MemoryMapping parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoryMapping parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MemoryMapping parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoryMapping parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MemoryMapping parseFrom(InputStream inputStream) throws IOException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryMapping parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryMapping parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoryMapping) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoryMapping parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryMapping) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MemoryMapping parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MemoryMapping parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MemoryMapping memoryMapping) {
            return DEFAULT_INSTANCE.createBuilder(memoryMapping);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MemoryMapping, Builder> implements MemoryMappingOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(MemoryMapping.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getBeginAddress() {
                return ((MemoryMapping) this.instance).getBeginAddress();
            }

            public Builder setBeginAddress(long j) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setBeginAddress(j);
                return this;
            }

            public Builder clearBeginAddress() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearBeginAddress();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getEndAddress() {
                return ((MemoryMapping) this.instance).getEndAddress();
            }

            public Builder setEndAddress(long j) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setEndAddress(j);
                return this;
            }

            public Builder clearEndAddress() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearEndAddress();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getOffset() {
                return ((MemoryMapping) this.instance).getOffset();
            }

            public Builder setOffset(long j) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setOffset(j);
                return this;
            }

            public Builder clearOffset() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearOffset();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public boolean getRead() {
                return ((MemoryMapping) this.instance).getRead();
            }

            public Builder setRead(boolean z) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setRead(z);
                return this;
            }

            public Builder clearRead() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearRead();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public boolean getWrite() {
                return ((MemoryMapping) this.instance).getWrite();
            }

            public Builder setWrite(boolean z) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setWrite(z);
                return this;
            }

            public Builder clearWrite() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearWrite();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public boolean getExecute() {
                return ((MemoryMapping) this.instance).getExecute();
            }

            public Builder setExecute(boolean z) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setExecute(z);
                return this;
            }

            public Builder clearExecute() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearExecute();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public String getMappingName() {
                return ((MemoryMapping) this.instance).getMappingName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public ByteString getMappingNameBytes() {
                return ((MemoryMapping) this.instance).getMappingNameBytes();
            }

            public Builder setMappingName(String str) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setMappingName(str);
                return this;
            }

            public Builder clearMappingName() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearMappingName();
                return this;
            }

            public Builder setMappingNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setMappingNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public String getBuildId() {
                return ((MemoryMapping) this.instance).getBuildId();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public ByteString getBuildIdBytes() {
                return ((MemoryMapping) this.instance).getBuildIdBytes();
            }

            public Builder setBuildId(String str) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setBuildId(str);
                return this;
            }

            public Builder clearBuildId() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearBuildId();
                return this;
            }

            public Builder setBuildIdBytes(ByteString byteString) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setBuildIdBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryMappingOrBuilder
            public long getLoadBias() {
                return ((MemoryMapping) this.instance).getLoadBias();
            }

            public Builder setLoadBias(long j) {
                copyOnWrite();
                ((MemoryMapping) this.instance).setLoadBias(j);
                return this;
            }

            public Builder clearLoadBias() {
                copyOnWrite();
                ((MemoryMapping) this.instance).clearLoadBias();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoryMapping();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0007\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t\u0003", new Object[]{"beginAddress_", "endAddress_", "offset_", "read_", "write_", "execute_", "mappingName_", "buildId_", "loadBias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MemoryMapping> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MemoryMapping.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            MemoryMapping memoryMapping = new MemoryMapping();
            DEFAULT_INSTANCE = memoryMapping;
            GeneratedMessageLite.registerDefaultInstance(MemoryMapping.class, memoryMapping);
        }

        public static MemoryMapping getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MemoryMapping> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class FD extends GeneratedMessageLite<FD, Builder> implements FDOrBuilder {
        private static final FD DEFAULT_INSTANCE;
        public static final int FD_FIELD_NUMBER = 1;
        public static final int OWNER_FIELD_NUMBER = 3;
        private static volatile Parser<FD> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 2;
        public static final int TAG_FIELD_NUMBER = 4;
        private int fd_;
        private long tag_;
        private String path_ = "";
        private String owner_ = "";

        private FD() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public int getFd() {
            return this.fd_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFd(int i) {
            this.fd_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFd() {
            this.fd_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public String getPath() {
            return this.path_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public ByteString getPathBytes() {
            return ByteString.copyFromUtf8(this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPathBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.path_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public String getOwner() {
            return this.owner_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public ByteString getOwnerBytes() {
            return ByteString.copyFromUtf8(this.owner_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(String str) {
            str.getClass();
            this.owner_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwner() {
            this.owner_ = getDefaultInstance().getOwner();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.owner_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
        public long getTag() {
            return this.tag_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(long j) {
            this.tag_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = 0L;
        }

        public static FD parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FD parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FD parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FD parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FD parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FD parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FD parseFrom(InputStream inputStream) throws IOException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FD parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FD parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FD) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FD parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FD) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FD parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FD parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FD fd) {
            return DEFAULT_INSTANCE.createBuilder(fd);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<FD, Builder> implements FDOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(FD.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public int getFd() {
                return ((FD) this.instance).getFd();
            }

            public Builder setFd(int i) {
                copyOnWrite();
                ((FD) this.instance).setFd(i);
                return this;
            }

            public Builder clearFd() {
                copyOnWrite();
                ((FD) this.instance).clearFd();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public String getPath() {
                return ((FD) this.instance).getPath();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public ByteString getPathBytes() {
                return ((FD) this.instance).getPathBytes();
            }

            public Builder setPath(String str) {
                copyOnWrite();
                ((FD) this.instance).setPath(str);
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((FD) this.instance).clearPath();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                copyOnWrite();
                ((FD) this.instance).setPathBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public String getOwner() {
                return ((FD) this.instance).getOwner();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public ByteString getOwnerBytes() {
                return ((FD) this.instance).getOwnerBytes();
            }

            public Builder setOwner(String str) {
                copyOnWrite();
                ((FD) this.instance).setOwner(str);
                return this;
            }

            public Builder clearOwner() {
                copyOnWrite();
                ((FD) this.instance).clearOwner();
                return this;
            }

            public Builder setOwnerBytes(ByteString byteString) {
                copyOnWrite();
                ((FD) this.instance).setOwnerBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.FDOrBuilder
            public long getTag() {
                return ((FD) this.instance).getTag();
            }

            public Builder setTag(long j) {
                copyOnWrite();
                ((FD) this.instance).setTag(j);
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((FD) this.instance).clearTag();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FD();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0003", new Object[]{"fd_", "path_", "owner_", "tag_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FD> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (FD.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            FD fd = new FD();
            DEFAULT_INSTANCE = fd;
            GeneratedMessageLite.registerDefaultInstance(FD.class, fd);
        }

        public static FD getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FD> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class LogBuffer extends GeneratedMessageLite<LogBuffer, Builder> implements LogBufferOrBuilder {
        private static final LogBuffer DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<LogBuffer> PARSER;
        private String name_ = "";
        private Internal.ProtobufList<LogMessage> logs_ = emptyProtobufList();

        private LogBuffer() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public List<LogMessage> getLogsList() {
            return this.logs_;
        }

        public List<? extends LogMessageOrBuilder> getLogsOrBuilderList() {
            return this.logs_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public int getLogsCount() {
            return this.logs_.size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
        public LogMessage getLogs(int i) {
            return this.logs_.get(i);
        }

        public LogMessageOrBuilder getLogsOrBuilder(int i) {
            return this.logs_.get(i);
        }

        private void ensureLogsIsMutable() {
            Internal.ProtobufList<LogMessage> protobufList = this.logs_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogs(int i, LogMessage logMessage) {
            logMessage.getClass();
            ensureLogsIsMutable();
            this.logs_.set(i, logMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(LogMessage logMessage) {
            logMessage.getClass();
            ensureLogsIsMutable();
            this.logs_.add(logMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(int i, LogMessage logMessage) {
            logMessage.getClass();
            ensureLogsIsMutable();
            this.logs_.add(i, logMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogs(Iterable<? extends LogMessage> iterable) {
            ensureLogsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.logs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLogs(int i) {
            ensureLogsIsMutable();
            this.logs_.remove(i);
        }

        public static LogBuffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static LogBuffer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LogBuffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LogBuffer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LogBuffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LogBuffer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LogBuffer parseFrom(InputStream inputStream) throws IOException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogBuffer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LogBuffer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LogBuffer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogBuffer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LogBuffer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LogBuffer parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LogBuffer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LogBuffer logBuffer) {
            return DEFAULT_INSTANCE.createBuilder(logBuffer);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<LogBuffer, Builder> implements LogBufferOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(LogBuffer.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public String getName() {
                return ((LogBuffer) this.instance).getName();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public ByteString getNameBytes() {
                return ((LogBuffer) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((LogBuffer) this.instance).setName(str);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((LogBuffer) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LogBuffer) this.instance).setNameBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public List<LogMessage> getLogsList() {
                return Collections.unmodifiableList(((LogBuffer) this.instance).getLogsList());
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public int getLogsCount() {
                return ((LogBuffer) this.instance).getLogsCount();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogBufferOrBuilder
            public LogMessage getLogs(int i) {
                return ((LogBuffer) this.instance).getLogs(i);
            }

            public Builder setLogs(int i, LogMessage logMessage) {
                copyOnWrite();
                ((LogBuffer) this.instance).setLogs(i, logMessage);
                return this;
            }

            public Builder setLogs(int i, LogMessage.Builder builder) {
                copyOnWrite();
                ((LogBuffer) this.instance).setLogs(i, builder.build());
                return this;
            }

            public Builder addLogs(LogMessage logMessage) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs(logMessage);
                return this;
            }

            public Builder addLogs(int i, LogMessage logMessage) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs(i, logMessage);
                return this;
            }

            public Builder addLogs(LogMessage.Builder builder) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs(builder.build());
                return this;
            }

            public Builder addLogs(int i, LogMessage.Builder builder) {
                copyOnWrite();
                ((LogBuffer) this.instance).addLogs(i, builder.build());
                return this;
            }

            public Builder addAllLogs(Iterable<? extends LogMessage> iterable) {
                copyOnWrite();
                ((LogBuffer) this.instance).addAllLogs(iterable);
                return this;
            }

            public Builder clearLogs() {
                copyOnWrite();
                ((LogBuffer) this.instance).clearLogs();
                return this;
            }

            public Builder removeLogs(int i) {
                copyOnWrite();
                ((LogBuffer) this.instance).removeLogs(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new LogBuffer();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"name_", "logs_", LogMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LogBuffer> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (LogBuffer.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            LogBuffer logBuffer = new LogBuffer();
            DEFAULT_INSTANCE = logBuffer;
            GeneratedMessageLite.registerDefaultInstance(LogBuffer.class, logBuffer);
        }

        public static LogBuffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LogBuffer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class LogMessage extends GeneratedMessageLite<LogMessage, Builder> implements LogMessageOrBuilder {
        private static final LogMessage DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 6;
        private static volatile Parser<LogMessage> PARSER = null;
        public static final int PID_FIELD_NUMBER = 2;
        public static final int PRIORITY_FIELD_NUMBER = 4;
        public static final int TAG_FIELD_NUMBER = 5;
        public static final int TID_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private int pid_;
        private int priority_;
        private int tid_;
        private String timestamp_ = "";
        private String tag_ = "";
        private String message_ = "";

        private LogMessage() {
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public String getTimestamp() {
            return this.timestamp_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public ByteString getTimestampBytes() {
            return ByteString.copyFromUtf8(this.timestamp_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public int getPid() {
            return this.pid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPid(int i) {
            this.pid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPid() {
            this.pid_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public int getTid() {
            return this.tid_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTid(int i) {
            this.tid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTid() {
            this.tid_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(int i) {
            this.priority_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public String getTag() {
            return this.tag_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public ByteString getTagBytes() {
            return ByteString.copyFromUtf8(this.tag_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(String str) {
            str.getClass();
            this.tag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = getDefaultInstance().getTag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.tag_ = byteString.toStringUtf8();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        public static LogMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static LogMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LogMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LogMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LogMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LogMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LogMessage parseFrom(InputStream inputStream) throws IOException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LogMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LogMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LogMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LogMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LogMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LogMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LogMessage logMessage) {
            return DEFAULT_INSTANCE.createBuilder(logMessage);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<LogMessage, Builder> implements LogMessageOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(LogMessage.DEFAULT_INSTANCE);
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public String getTimestamp() {
                return ((LogMessage) this.instance).getTimestamp();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public ByteString getTimestampBytes() {
                return ((LogMessage) this.instance).getTimestampBytes();
            }

            public Builder setTimestamp(String str) {
                copyOnWrite();
                ((LogMessage) this.instance).setTimestamp(str);
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((LogMessage) this.instance).clearTimestamp();
                return this;
            }

            public Builder setTimestampBytes(ByteString byteString) {
                copyOnWrite();
                ((LogMessage) this.instance).setTimestampBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public int getPid() {
                return ((LogMessage) this.instance).getPid();
            }

            public Builder setPid(int i) {
                copyOnWrite();
                ((LogMessage) this.instance).setPid(i);
                return this;
            }

            public Builder clearPid() {
                copyOnWrite();
                ((LogMessage) this.instance).clearPid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public int getTid() {
                return ((LogMessage) this.instance).getTid();
            }

            public Builder setTid(int i) {
                copyOnWrite();
                ((LogMessage) this.instance).setTid(i);
                return this;
            }

            public Builder clearTid() {
                copyOnWrite();
                ((LogMessage) this.instance).clearTid();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public int getPriority() {
                return ((LogMessage) this.instance).getPriority();
            }

            public Builder setPriority(int i) {
                copyOnWrite();
                ((LogMessage) this.instance).setPriority(i);
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((LogMessage) this.instance).clearPriority();
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public String getTag() {
                return ((LogMessage) this.instance).getTag();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public ByteString getTagBytes() {
                return ((LogMessage) this.instance).getTagBytes();
            }

            public Builder setTag(String str) {
                copyOnWrite();
                ((LogMessage) this.instance).setTag(str);
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((LogMessage) this.instance).clearTag();
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                copyOnWrite();
                ((LogMessage) this.instance).setTagBytes(byteString);
                return this;
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public String getMessage() {
                return ((LogMessage) this.instance).getMessage();
            }

            @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos.LogMessageOrBuilder
            public ByteString getMessageBytes() {
                return ((LogMessage) this.instance).getMessageBytes();
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((LogMessage) this.instance).setMessage(str);
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((LogMessage) this.instance).clearMessage();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((LogMessage) this.instance).setMessageBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new LogMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005Ȉ\u0006Ȉ", new Object[]{"timestamp_", "pid_", "tid_", "priority_", "tag_", "message_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LogMessage> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (LogMessage.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            LogMessage logMessage = new LogMessage();
            DEFAULT_INSTANCE = logMessage;
            GeneratedMessageLite.registerDefaultInstance(LogMessage.class, logMessage);
        }

        public static LogMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LogMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
