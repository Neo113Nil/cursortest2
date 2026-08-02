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
public final class TombstoneProtos$FD extends GeneratedMessageLite<TombstoneProtos$FD, Builder> implements TombstoneProtos$FDOrBuilder {
    private static final TombstoneProtos$FD DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile E<TombstoneProtos$FD> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    public static final int TAG_FIELD_NUMBER = 4;
    private int fd_;
    private long tag_;
    private String path_ = "";
    private String owner_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$FD, Builder> implements TombstoneProtos$FDOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearFd() {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).clearFd();
            return this;
        }

        public Builder clearOwner() {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).clearOwner();
            return this;
        }

        public Builder clearPath() {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).clearPath();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).clearTag();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
        public int getFd() {
            return ((TombstoneProtos$FD) this.instance).getFd();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
        public String getOwner() {
            return ((TombstoneProtos$FD) this.instance).getOwner();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
        public ByteString getOwnerBytes() {
            return ((TombstoneProtos$FD) this.instance).getOwnerBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
        public String getPath() {
            return ((TombstoneProtos$FD) this.instance).getPath();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
        public ByteString getPathBytes() {
            return ((TombstoneProtos$FD) this.instance).getPathBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
        public long getTag() {
            return ((TombstoneProtos$FD) this.instance).getTag();
        }

        public Builder setFd(int i11) {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).setFd(i11);
            return this;
        }

        public Builder setOwner(String str) {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).setOwner(str);
            return this;
        }

        public Builder setOwnerBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).setOwnerBytes(byteString);
            return this;
        }

        public Builder setPath(String str) {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).setPath(str);
            return this;
        }

        public Builder setPathBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).setPathBytes(byteString);
            return this;
        }

        public Builder setTag(long j11) {
            copyOnWrite();
            ((TombstoneProtos$FD) this.instance).setTag(j11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$FD.DEFAULT_INSTANCE);
        }
    }

    static {
        TombstoneProtos$FD tombstoneProtos$FD = new TombstoneProtos$FD();
        DEFAULT_INSTANCE = tombstoneProtos$FD;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$FD.class, tombstoneProtos$FD);
    }

    private TombstoneProtos$FD() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = getDefaultInstance().getOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = 0L;
    }

    public static TombstoneProtos$FD getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$FD parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$FD parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$FD> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i11) {
        this.fd_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwner(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.owner_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.path_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(long j11) {
        this.tag_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$FD();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0003", new Object[]{"fd_", "path_", "owner_", "tag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$FD> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$FD.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
    public int getFd() {
        return this.fd_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
    public String getOwner() {
        return this.owner_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
    public ByteString getOwnerBytes() {
        return ByteString.copyFromUtf8(this.owner_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
    public String getPath() {
        return this.path_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$FDOrBuilder
    public long getTag() {
        return this.tag_;
    }

    public static Builder newBuilder(TombstoneProtos$FD tombstoneProtos$FD) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$FD);
    }

    public static TombstoneProtos$FD parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$FD parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$FD parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$FD parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$FD parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$FD parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$FD parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$FD parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$FD parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$FD parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
