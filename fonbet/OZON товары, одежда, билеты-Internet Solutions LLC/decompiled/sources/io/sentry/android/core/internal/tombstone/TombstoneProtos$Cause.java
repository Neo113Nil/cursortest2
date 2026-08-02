package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TombstoneProtos$Cause extends GeneratedMessageLite<TombstoneProtos$Cause, Builder> implements TombstoneProtos$CauseOrBuilder {
    private static final TombstoneProtos$Cause DEFAULT_INSTANCE;
    public static final int HUMAN_READABLE_FIELD_NUMBER = 1;
    public static final int MEMORY_ERROR_FIELD_NUMBER = 2;
    private static volatile E<TombstoneProtos$Cause> PARSER;
    private Object details_;
    private int detailsCase_ = 0;
    private String humanReadable_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$Cause, Builder> implements TombstoneProtos$CauseOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearDetails() {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).clearDetails();
            return this;
        }

        public Builder clearHumanReadable() {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).clearHumanReadable();
            return this;
        }

        public Builder clearMemoryError() {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).clearMemoryError();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
        public a getDetailsCase() {
            return ((TombstoneProtos$Cause) this.instance).getDetailsCase();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
        public String getHumanReadable() {
            return ((TombstoneProtos$Cause) this.instance).getHumanReadable();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
        public ByteString getHumanReadableBytes() {
            return ((TombstoneProtos$Cause) this.instance).getHumanReadableBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
        public TombstoneProtos$MemoryError getMemoryError() {
            return ((TombstoneProtos$Cause) this.instance).getMemoryError();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
        public boolean hasMemoryError() {
            return ((TombstoneProtos$Cause) this.instance).hasMemoryError();
        }

        public Builder mergeMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).mergeMemoryError(tombstoneProtos$MemoryError);
            return this;
        }

        public Builder setHumanReadable(String str) {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).setHumanReadable(str);
            return this;
        }

        public Builder setHumanReadableBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).setHumanReadableBytes(byteString);
            return this;
        }

        public Builder setMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).setMemoryError(tombstoneProtos$MemoryError);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$Cause.DEFAULT_INSTANCE);
        }

        public Builder setMemoryError(TombstoneProtos$MemoryError.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Cause) this.instance).setMemoryError(builder.build());
            return this;
        }
    }

    public enum a {
        MEMORY_ERROR(2),
        DETAILS_NOT_SET(0);

        private final int value;

        a(int i11) {
            this.value = i11;
        }

        public static a forNumber(int i11) {
            if (i11 == 0) {
                return DETAILS_NOT_SET;
            }
            if (i11 != 2) {
                return null;
            }
            return MEMORY_ERROR;
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
        TombstoneProtos$Cause tombstoneProtos$Cause = new TombstoneProtos$Cause();
        DEFAULT_INSTANCE = tombstoneProtos$Cause;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Cause.class, tombstoneProtos$Cause);
    }

    private TombstoneProtos$Cause() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.detailsCase_ = 0;
        this.details_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHumanReadable() {
        this.humanReadable_ = getDefaultInstance().getHumanReadable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryError() {
        if (this.detailsCase_ == 2) {
            this.detailsCase_ = 0;
            this.details_ = null;
        }
    }

    public static TombstoneProtos$Cause getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        tombstoneProtos$MemoryError.getClass();
        if (this.detailsCase_ != 2 || this.details_ == TombstoneProtos$MemoryError.getDefaultInstance()) {
            this.details_ = tombstoneProtos$MemoryError;
        } else {
            this.details_ = TombstoneProtos$MemoryError.newBuilder((TombstoneProtos$MemoryError) this.details_).mergeFrom((TombstoneProtos$MemoryError.Builder) tombstoneProtos$MemoryError).buildPartial();
        }
        this.detailsCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Cause parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Cause parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$Cause> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHumanReadable(String str) {
        str.getClass();
        this.humanReadable_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHumanReadableBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.humanReadable_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        tombstoneProtos$MemoryError.getClass();
        this.details_ = tombstoneProtos$MemoryError;
        this.detailsCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$Cause();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"details_", "detailsCase_", "humanReadable_", TombstoneProtos$MemoryError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$Cause> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$Cause.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
    public a getDetailsCase() {
        return a.forNumber(this.detailsCase_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
    public String getHumanReadable() {
        return this.humanReadable_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
    public ByteString getHumanReadableBytes() {
        return ByteString.copyFromUtf8(this.humanReadable_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
    public TombstoneProtos$MemoryError getMemoryError() {
        return this.detailsCase_ == 2 ? (TombstoneProtos$MemoryError) this.details_ : TombstoneProtos$MemoryError.getDefaultInstance();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CauseOrBuilder
    public boolean hasMemoryError() {
        return this.detailsCase_ == 2;
    }

    public static Builder newBuilder(TombstoneProtos$Cause tombstoneProtos$Cause) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Cause);
    }

    public static TombstoneProtos$Cause parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Cause parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$Cause parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$Cause parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$Cause parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Cause parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$Cause parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Cause parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Cause parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Cause parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
