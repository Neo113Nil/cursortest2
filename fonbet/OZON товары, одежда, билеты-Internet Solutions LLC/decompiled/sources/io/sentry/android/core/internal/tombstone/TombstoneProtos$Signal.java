package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDump;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TombstoneProtos$Signal extends GeneratedMessageLite<TombstoneProtos$Signal, Builder> implements TombstoneProtos$SignalOrBuilder {
    public static final int CODE_FIELD_NUMBER = 3;
    public static final int CODE_NAME_FIELD_NUMBER = 4;
    private static final TombstoneProtos$Signal DEFAULT_INSTANCE;
    public static final int FAULT_ADDRESS_FIELD_NUMBER = 9;
    public static final int FAULT_ADJACENT_METADATA_FIELD_NUMBER = 10;
    public static final int HAS_FAULT_ADDRESS_FIELD_NUMBER = 8;
    public static final int HAS_SENDER_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile E<TombstoneProtos$Signal> PARSER = null;
    public static final int SENDER_PID_FIELD_NUMBER = 7;
    public static final int SENDER_UID_FIELD_NUMBER = 6;
    private int bitField0_;
    private int code_;
    private long faultAddress_;
    private TombstoneProtos$MemoryDump faultAdjacentMetadata_;
    private boolean hasFaultAddress_;
    private boolean hasSender_;
    private int number_;
    private int senderPid_;
    private int senderUid_;
    private String name_ = "";
    private String codeName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$Signal, Builder> implements TombstoneProtos$SignalOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearCode() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearCode();
            return this;
        }

        public Builder clearCodeName() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearCodeName();
            return this;
        }

        public Builder clearFaultAddress() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearFaultAddress();
            return this;
        }

        public Builder clearFaultAdjacentMetadata() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearFaultAdjacentMetadata();
            return this;
        }

        public Builder clearHasFaultAddress() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearHasFaultAddress();
            return this;
        }

        public Builder clearHasSender() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearHasSender();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearNumber();
            return this;
        }

        public Builder clearSenderPid() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearSenderPid();
            return this;
        }

        public Builder clearSenderUid() {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).clearSenderUid();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public int getCode() {
            return ((TombstoneProtos$Signal) this.instance).getCode();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public String getCodeName() {
            return ((TombstoneProtos$Signal) this.instance).getCodeName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public ByteString getCodeNameBytes() {
            return ((TombstoneProtos$Signal) this.instance).getCodeNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public long getFaultAddress() {
            return ((TombstoneProtos$Signal) this.instance).getFaultAddress();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public TombstoneProtos$MemoryDump getFaultAdjacentMetadata() {
            return ((TombstoneProtos$Signal) this.instance).getFaultAdjacentMetadata();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public boolean getHasFaultAddress() {
            return ((TombstoneProtos$Signal) this.instance).getHasFaultAddress();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public boolean getHasSender() {
            return ((TombstoneProtos$Signal) this.instance).getHasSender();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public String getName() {
            return ((TombstoneProtos$Signal) this.instance).getName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public ByteString getNameBytes() {
            return ((TombstoneProtos$Signal) this.instance).getNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public int getNumber() {
            return ((TombstoneProtos$Signal) this.instance).getNumber();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public int getSenderPid() {
            return ((TombstoneProtos$Signal) this.instance).getSenderPid();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public int getSenderUid() {
            return ((TombstoneProtos$Signal) this.instance).getSenderUid();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
        public boolean hasFaultAdjacentMetadata() {
            return ((TombstoneProtos$Signal) this.instance).hasFaultAdjacentMetadata();
        }

        public Builder mergeFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).mergeFaultAdjacentMetadata(tombstoneProtos$MemoryDump);
            return this;
        }

        public Builder setCode(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setCode(i11);
            return this;
        }

        public Builder setCodeName(String str) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setCodeName(str);
            return this;
        }

        public Builder setCodeNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setCodeNameBytes(byteString);
            return this;
        }

        public Builder setFaultAddress(long j11) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setFaultAddress(j11);
            return this;
        }

        public Builder setFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setFaultAdjacentMetadata(tombstoneProtos$MemoryDump);
            return this;
        }

        public Builder setHasFaultAddress(boolean z11) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setHasFaultAddress(z11);
            return this;
        }

        public Builder setHasSender(boolean z11) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setHasSender(z11);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setNumber(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setNumber(i11);
            return this;
        }

        public Builder setSenderPid(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setSenderPid(i11);
            return this;
        }

        public Builder setSenderUid(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setSenderUid(i11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$Signal.DEFAULT_INSTANCE);
        }

        public Builder setFaultAdjacentMetadata(TombstoneProtos$MemoryDump.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Signal) this.instance).setFaultAdjacentMetadata(builder.build());
            return this;
        }
    }

    static {
        TombstoneProtos$Signal tombstoneProtos$Signal = new TombstoneProtos$Signal();
        DEFAULT_INSTANCE = tombstoneProtos$Signal;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Signal.class, tombstoneProtos$Signal);
    }

    private TombstoneProtos$Signal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodeName() {
        this.codeName_ = getDefaultInstance().getCodeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaultAddress() {
        this.faultAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaultAdjacentMetadata() {
        this.faultAdjacentMetadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasFaultAddress() {
        this.hasFaultAddress_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasSender() {
        this.hasSender_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderPid() {
        this.senderPid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderUid() {
        this.senderUid_ = 0;
    }

    public static TombstoneProtos$Signal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump2 = this.faultAdjacentMetadata_;
        if (tombstoneProtos$MemoryDump2 == null || tombstoneProtos$MemoryDump2 == TombstoneProtos$MemoryDump.getDefaultInstance()) {
            this.faultAdjacentMetadata_ = tombstoneProtos$MemoryDump;
        } else {
            this.faultAdjacentMetadata_ = TombstoneProtos$MemoryDump.newBuilder(this.faultAdjacentMetadata_).mergeFrom((TombstoneProtos$MemoryDump.Builder) tombstoneProtos$MemoryDump).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Signal parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Signal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$Signal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i11) {
        this.code_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeName(String str) {
        str.getClass();
        this.codeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.codeName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaultAddress(long j11) {
        this.faultAddress_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        this.faultAdjacentMetadata_ = tombstoneProtos$MemoryDump;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasFaultAddress(boolean z11) {
        this.hasFaultAddress_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasSender(boolean z11) {
        this.hasSender_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i11) {
        this.number_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderPid(int i11) {
        this.senderPid_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderUid(int i11) {
        this.senderUid_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$Signal();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$Signal> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$Signal.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public String getCodeName() {
        return this.codeName_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public ByteString getCodeNameBytes() {
        return ByteString.copyFromUtf8(this.codeName_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public long getFaultAddress() {
        return this.faultAddress_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public TombstoneProtos$MemoryDump getFaultAdjacentMetadata() {
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump = this.faultAdjacentMetadata_;
        return tombstoneProtos$MemoryDump == null ? TombstoneProtos$MemoryDump.getDefaultInstance() : tombstoneProtos$MemoryDump;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public boolean getHasFaultAddress() {
        return this.hasFaultAddress_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public boolean getHasSender() {
        return this.hasSender_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public int getSenderPid() {
        return this.senderPid_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public int getSenderUid() {
        return this.senderUid_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$SignalOrBuilder
    public boolean hasFaultAdjacentMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TombstoneProtos$Signal tombstoneProtos$Signal) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Signal);
    }

    public static TombstoneProtos$Signal parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Signal parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$Signal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$Signal parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$Signal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Signal parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$Signal parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Signal parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Signal parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Signal parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
