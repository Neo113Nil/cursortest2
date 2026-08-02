package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$ArmMTEMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TombstoneProtos$MemoryDump extends GeneratedMessageLite<TombstoneProtos$MemoryDump, Builder> implements TombstoneProtos$MemoryDumpOrBuilder {
    public static final int ARM_MTE_METADATA_FIELD_NUMBER = 6;
    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 3;
    private static final TombstoneProtos$MemoryDump DEFAULT_INSTANCE;
    public static final int MAPPING_NAME_FIELD_NUMBER = 2;
    public static final int MEMORY_FIELD_NUMBER = 4;
    private static volatile E<TombstoneProtos$MemoryDump> PARSER = null;
    public static final int REGISTER_NAME_FIELD_NUMBER = 1;
    private long beginAddress_;
    private Object metadata_;
    private int metadataCase_ = 0;
    private String registerName_ = "";
    private String mappingName_ = "";
    private ByteString memory_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$MemoryDump, Builder> implements TombstoneProtos$MemoryDumpOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearArmMteMetadata() {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).clearArmMteMetadata();
            return this;
        }

        public Builder clearBeginAddress() {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).clearBeginAddress();
            return this;
        }

        public Builder clearMappingName() {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).clearMappingName();
            return this;
        }

        public Builder clearMemory() {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).clearMemory();
            return this;
        }

        public Builder clearMetadata() {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).clearMetadata();
            return this;
        }

        public Builder clearRegisterName() {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).clearRegisterName();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public TombstoneProtos$ArmMTEMetadata getArmMteMetadata() {
            return ((TombstoneProtos$MemoryDump) this.instance).getArmMteMetadata();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public long getBeginAddress() {
            return ((TombstoneProtos$MemoryDump) this.instance).getBeginAddress();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public String getMappingName() {
            return ((TombstoneProtos$MemoryDump) this.instance).getMappingName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public ByteString getMappingNameBytes() {
            return ((TombstoneProtos$MemoryDump) this.instance).getMappingNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public ByteString getMemory() {
            return ((TombstoneProtos$MemoryDump) this.instance).getMemory();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public a getMetadataCase() {
            return ((TombstoneProtos$MemoryDump) this.instance).getMetadataCase();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public String getRegisterName() {
            return ((TombstoneProtos$MemoryDump) this.instance).getRegisterName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public ByteString getRegisterNameBytes() {
            return ((TombstoneProtos$MemoryDump) this.instance).getRegisterNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
        public boolean hasArmMteMetadata() {
            return ((TombstoneProtos$MemoryDump) this.instance).hasArmMteMetadata();
        }

        public Builder mergeArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).mergeArmMteMetadata(tombstoneProtos$ArmMTEMetadata);
            return this;
        }

        public Builder setArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setArmMteMetadata(tombstoneProtos$ArmMTEMetadata);
            return this;
        }

        public Builder setBeginAddress(long j11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setBeginAddress(j11);
            return this;
        }

        public Builder setMappingName(String str) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setMappingName(str);
            return this;
        }

        public Builder setMappingNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setMappingNameBytes(byteString);
            return this;
        }

        public Builder setMemory(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setMemory(byteString);
            return this;
        }

        public Builder setRegisterName(String str) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setRegisterName(str);
            return this;
        }

        public Builder setRegisterNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setRegisterNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$MemoryDump.DEFAULT_INSTANCE);
        }

        public Builder setArmMteMetadata(TombstoneProtos$ArmMTEMetadata.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$MemoryDump) this.instance).setArmMteMetadata(builder.build());
            return this;
        }
    }

    public enum a {
        ARM_MTE_METADATA(6),
        METADATA_NOT_SET(0);

        private final int value;

        a(int i11) {
            this.value = i11;
        }

        public static a forNumber(int i11) {
            if (i11 == 0) {
                return METADATA_NOT_SET;
            }
            if (i11 != 6) {
                return null;
            }
            return ARM_MTE_METADATA;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static a valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump = new TombstoneProtos$MemoryDump();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryDump;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryDump.class, tombstoneProtos$MemoryDump);
    }

    private TombstoneProtos$MemoryDump() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArmMteMetadata() {
        if (this.metadataCase_ == 6) {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginAddress() {
        this.beginAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMappingName() {
        this.mappingName_ = getDefaultInstance().getMappingName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemory() {
        this.memory_ = getDefaultInstance().getMemory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadataCase_ = 0;
        this.metadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegisterName() {
        this.registerName_ = getDefaultInstance().getRegisterName();
    }

    public static TombstoneProtos$MemoryDump getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        tombstoneProtos$ArmMTEMetadata.getClass();
        if (this.metadataCase_ != 6 || this.metadata_ == TombstoneProtos$ArmMTEMetadata.getDefaultInstance()) {
            this.metadata_ = tombstoneProtos$ArmMTEMetadata;
        } else {
            this.metadata_ = TombstoneProtos$ArmMTEMetadata.newBuilder((TombstoneProtos$ArmMTEMetadata) this.metadata_).mergeFrom((TombstoneProtos$ArmMTEMetadata.Builder) tombstoneProtos$ArmMTEMetadata).buildPartial();
        }
        this.metadataCase_ = 6;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryDump parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$MemoryDump> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        tombstoneProtos$ArmMTEMetadata.getClass();
        this.metadata_ = tombstoneProtos$ArmMTEMetadata;
        this.metadataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginAddress(long j11) {
        this.beginAddress_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMappingName(String str) {
        str.getClass();
        this.mappingName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMappingNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mappingName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemory(ByteString byteString) {
        byteString.getClass();
        this.memory_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisterName(String str) {
        str.getClass();
        this.registerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisterNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.registerName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryDump();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\n\u0006<\u0000", new Object[]{"metadata_", "metadataCase_", "registerName_", "mappingName_", "beginAddress_", "memory_", TombstoneProtos$ArmMTEMetadata.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$MemoryDump> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$MemoryDump.class) {
                    try {
                        e11 = PARSER;
                        if (e11 == null) {
                            e11 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = e11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return e11;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public TombstoneProtos$ArmMTEMetadata getArmMteMetadata() {
        return this.metadataCase_ == 6 ? (TombstoneProtos$ArmMTEMetadata) this.metadata_ : TombstoneProtos$ArmMTEMetadata.getDefaultInstance();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public long getBeginAddress() {
        return this.beginAddress_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public String getMappingName() {
        return this.mappingName_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public ByteString getMappingNameBytes() {
        return ByteString.copyFromUtf8(this.mappingName_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public ByteString getMemory() {
        return this.memory_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public a getMetadataCase() {
        return a.forNumber(this.metadataCase_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public String getRegisterName() {
        return this.registerName_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public ByteString getRegisterNameBytes() {
        return ByteString.copyFromUtf8(this.registerName_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDumpOrBuilder
    public boolean hasArmMteMetadata() {
        return this.metadataCase_ == 6;
    }

    public static Builder newBuilder(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryDump);
    }

    public static TombstoneProtos$MemoryDump parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$MemoryDump parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryDump parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$MemoryDump parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$MemoryDump parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
