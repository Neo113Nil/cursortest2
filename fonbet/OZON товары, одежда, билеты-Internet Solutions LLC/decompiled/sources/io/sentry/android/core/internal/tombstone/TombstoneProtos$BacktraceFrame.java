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
public final class TombstoneProtos$BacktraceFrame extends GeneratedMessageLite<TombstoneProtos$BacktraceFrame, Builder> implements TombstoneProtos$BacktraceFrameOrBuilder {
    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private static final TombstoneProtos$BacktraceFrame DEFAULT_INSTANCE;
    public static final int FILE_MAP_OFFSET_FIELD_NUMBER = 7;
    public static final int FILE_NAME_FIELD_NUMBER = 6;
    public static final int FUNCTION_NAME_FIELD_NUMBER = 4;
    public static final int FUNCTION_OFFSET_FIELD_NUMBER = 5;
    private static volatile E<TombstoneProtos$BacktraceFrame> PARSER = null;
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

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$BacktraceFrame, Builder> implements TombstoneProtos$BacktraceFrameOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearBuildId() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearBuildId();
            return this;
        }

        public Builder clearFileMapOffset() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearFileMapOffset();
            return this;
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearFileName();
            return this;
        }

        public Builder clearFunctionName() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearFunctionName();
            return this;
        }

        public Builder clearFunctionOffset() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearFunctionOffset();
            return this;
        }

        public Builder clearPc() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearPc();
            return this;
        }

        public Builder clearRelPc() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearRelPc();
            return this;
        }

        public Builder clearSp() {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).clearSp();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public String getBuildId() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getBuildId();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public ByteString getBuildIdBytes() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getBuildIdBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public long getFileMapOffset() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getFileMapOffset();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public String getFileName() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getFileName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public ByteString getFileNameBytes() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getFileNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public String getFunctionName() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getFunctionName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public ByteString getFunctionNameBytes() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getFunctionNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public long getFunctionOffset() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getFunctionOffset();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public long getPc() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getPc();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public long getRelPc() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getRelPc();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
        public long getSp() {
            return ((TombstoneProtos$BacktraceFrame) this.instance).getSp();
        }

        public Builder setBuildId(String str) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setBuildId(str);
            return this;
        }

        public Builder setBuildIdBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setBuildIdBytes(byteString);
            return this;
        }

        public Builder setFileMapOffset(long j11) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setFileMapOffset(j11);
            return this;
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setFileName(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setFileNameBytes(byteString);
            return this;
        }

        public Builder setFunctionName(String str) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setFunctionName(str);
            return this;
        }

        public Builder setFunctionNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setFunctionNameBytes(byteString);
            return this;
        }

        public Builder setFunctionOffset(long j11) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setFunctionOffset(j11);
            return this;
        }

        public Builder setPc(long j11) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setPc(j11);
            return this;
        }

        public Builder setRelPc(long j11) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setRelPc(j11);
            return this;
        }

        public Builder setSp(long j11) {
            copyOnWrite();
            ((TombstoneProtos$BacktraceFrame) this.instance).setSp(j11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$BacktraceFrame.DEFAULT_INSTANCE);
        }
    }

    static {
        TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame = new TombstoneProtos$BacktraceFrame();
        DEFAULT_INSTANCE = tombstoneProtos$BacktraceFrame;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$BacktraceFrame.class, tombstoneProtos$BacktraceFrame);
    }

    private TombstoneProtos$BacktraceFrame() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildId() {
        this.buildId_ = getDefaultInstance().getBuildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileMapOffset() {
        this.fileMapOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionName() {
        this.functionName_ = getDefaultInstance().getFunctionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionOffset() {
        this.functionOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPc() {
        this.pc_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelPc() {
        this.relPc_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSp() {
        this.sp_ = 0L;
    }

    public static TombstoneProtos$BacktraceFrame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$BacktraceFrame parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$BacktraceFrame> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setFileMapOffset(long j11) {
        this.fileMapOffset_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionName(String str) {
        str.getClass();
        this.functionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.functionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionOffset(long j11) {
        this.functionOffset_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPc(long j11) {
        this.pc_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelPc(long j11) {
        this.relPc_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSp(long j11) {
        this.sp_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$BacktraceFrame();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004Ȉ\u0005\u0003\u0006Ȉ\u0007\u0003\bȈ", new Object[]{"relPc_", "pc_", "sp_", "functionName_", "functionOffset_", "fileName_", "fileMapOffset_", "buildId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$BacktraceFrame> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$BacktraceFrame.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public String getBuildId() {
        return this.buildId_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public ByteString getBuildIdBytes() {
        return ByteString.copyFromUtf8(this.buildId_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public long getFileMapOffset() {
        return this.fileMapOffset_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public String getFunctionName() {
        return this.functionName_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public ByteString getFunctionNameBytes() {
        return ByteString.copyFromUtf8(this.functionName_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public long getFunctionOffset() {
        return this.functionOffset_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public long getPc() {
        return this.pc_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public long getRelPc() {
        return this.relPc_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrameOrBuilder
    public long getSp() {
        return this.sp_;
    }

    public static Builder newBuilder(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$BacktraceFrame);
    }

    public static TombstoneProtos$BacktraceFrame parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
