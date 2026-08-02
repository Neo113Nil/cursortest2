package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TombstoneProtos$MemoryMapping extends GeneratedMessageLite<TombstoneProtos$MemoryMapping, Builder> implements TombstoneProtos$MemoryMappingOrBuilder {
    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 1;
    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private static final TombstoneProtos$MemoryMapping DEFAULT_INSTANCE;
    public static final int END_ADDRESS_FIELD_NUMBER = 2;
    public static final int EXECUTE_FIELD_NUMBER = 6;
    public static final int LOAD_BIAS_FIELD_NUMBER = 9;
    public static final int MAPPING_NAME_FIELD_NUMBER = 7;
    public static final int OFFSET_FIELD_NUMBER = 3;
    private static volatile E<TombstoneProtos$MemoryMapping> PARSER = null;
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

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$MemoryMapping, Builder> implements TombstoneProtos$MemoryMappingOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearBeginAddress() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearBeginAddress();
            return this;
        }

        public Builder clearBuildId() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearBuildId();
            return this;
        }

        public Builder clearEndAddress() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearEndAddress();
            return this;
        }

        public Builder clearExecute() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearExecute();
            return this;
        }

        public Builder clearLoadBias() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearLoadBias();
            return this;
        }

        public Builder clearMappingName() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearMappingName();
            return this;
        }

        public Builder clearOffset() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearOffset();
            return this;
        }

        public Builder clearRead() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearRead();
            return this;
        }

        public Builder clearWrite() {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).clearWrite();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public long getBeginAddress() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getBeginAddress();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public String getBuildId() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getBuildId();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public ByteString getBuildIdBytes() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getBuildIdBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public long getEndAddress() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getEndAddress();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public boolean getExecute() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getExecute();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public long getLoadBias() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getLoadBias();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public String getMappingName() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getMappingName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public ByteString getMappingNameBytes() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getMappingNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public long getOffset() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getOffset();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public boolean getRead() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getRead();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
        public boolean getWrite() {
            return ((TombstoneProtos$MemoryMapping) this.instance).getWrite();
        }

        public Builder setBeginAddress(long j11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setBeginAddress(j11);
            return this;
        }

        public Builder setBuildId(String str) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setBuildId(str);
            return this;
        }

        public Builder setBuildIdBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setBuildIdBytes(byteString);
            return this;
        }

        public Builder setEndAddress(long j11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setEndAddress(j11);
            return this;
        }

        public Builder setExecute(boolean z11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setExecute(z11);
            return this;
        }

        public Builder setLoadBias(long j11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setLoadBias(j11);
            return this;
        }

        public Builder setMappingName(String str) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setMappingName(str);
            return this;
        }

        public Builder setMappingNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setMappingNameBytes(byteString);
            return this;
        }

        public Builder setOffset(long j11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setOffset(j11);
            return this;
        }

        public Builder setRead(boolean z11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setRead(z11);
            return this;
        }

        public Builder setWrite(boolean z11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryMapping) this.instance).setWrite(z11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$MemoryMapping.DEFAULT_INSTANCE);
        }
    }

    static {
        TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping = new TombstoneProtos$MemoryMapping();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryMapping;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryMapping.class, tombstoneProtos$MemoryMapping);
    }

    private TombstoneProtos$MemoryMapping() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginAddress() {
        this.beginAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildId() {
        this.buildId_ = getDefaultInstance().getBuildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndAddress() {
        this.endAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExecute() {
        this.execute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadBias() {
        this.loadBias_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMappingName() {
        this.mappingName_ = getDefaultInstance().getMappingName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.offset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRead() {
        this.read_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrite() {
        this.write_ = false;
    }

    public static TombstoneProtos$MemoryMapping getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryMapping parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$MemoryMapping> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginAddress(long j11) {
        this.beginAddress_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildId(String str) {
        str.getClass();
        this.buildId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buildId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndAddress(long j11) {
        this.endAddress_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExecute(boolean z11) {
        this.execute_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadBias(long j11) {
        this.loadBias_ = j11;
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
    public void setOffset(long j11) {
        this.offset_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRead(boolean z11) {
        this.read_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrite(boolean z11) {
        this.write_ = z11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryMapping();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0007\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t\u0003", new Object[]{"beginAddress_", "endAddress_", "offset_", "read_", "write_", "execute_", "mappingName_", "buildId_", "loadBias_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$MemoryMapping> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$MemoryMapping.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public long getBeginAddress() {
        return this.beginAddress_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public String getBuildId() {
        return this.buildId_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public ByteString getBuildIdBytes() {
        return ByteString.copyFromUtf8(this.buildId_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public long getEndAddress() {
        return this.endAddress_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public boolean getExecute() {
        return this.execute_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public long getLoadBias() {
        return this.loadBias_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public String getMappingName() {
        return this.mappingName_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public ByteString getMappingNameBytes() {
        return ByteString.copyFromUtf8(this.mappingName_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public long getOffset() {
        return this.offset_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public boolean getRead() {
        return this.read_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMappingOrBuilder
    public boolean getWrite() {
        return this.write_;
    }

    public static Builder newBuilder(TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryMapping);
    }

    public static TombstoneProtos$MemoryMapping parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
