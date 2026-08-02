package io.sentry.android.core.internal.tombstone;

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
public final class TombstoneProtos$CrashDetail extends GeneratedMessageLite<TombstoneProtos$CrashDetail, Builder> implements TombstoneProtos$CrashDetailOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final TombstoneProtos$CrashDetail DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile E<TombstoneProtos$CrashDetail> PARSER;
    private ByteString data_;
    private ByteString name_;

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$CrashDetail, Builder> implements TombstoneProtos$CrashDetailOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearData() {
            copyOnWrite();
            ((TombstoneProtos$CrashDetail) this.instance).clearData();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TombstoneProtos$CrashDetail) this.instance).clearName();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CrashDetailOrBuilder
        public ByteString getData() {
            return ((TombstoneProtos$CrashDetail) this.instance).getData();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CrashDetailOrBuilder
        public ByteString getName() {
            return ((TombstoneProtos$CrashDetail) this.instance).getName();
        }

        public Builder setData(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$CrashDetail) this.instance).setData(byteString);
            return this;
        }

        public Builder setName(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$CrashDetail) this.instance).setName(byteString);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$CrashDetail.DEFAULT_INSTANCE);
        }
    }

    static {
        TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail = new TombstoneProtos$CrashDetail();
        DEFAULT_INSTANCE = tombstoneProtos$CrashDetail;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$CrashDetail.class, tombstoneProtos$CrashDetail);
    }

    private TombstoneProtos$CrashDetail() {
        ByteString byteString = ByteString.EMPTY;
        this.name_ = byteString;
        this.data_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static TombstoneProtos$CrashDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$CrashDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$CrashDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$CrashDetail> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(ByteString byteString) {
        byteString.getClass();
        this.name_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$CrashDetail();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"name_", "data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$CrashDetail> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$CrashDetail.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CrashDetailOrBuilder
    public ByteString getData() {
        return this.data_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$CrashDetailOrBuilder
    public ByteString getName() {
        return this.name_;
    }

    public static Builder newBuilder(TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$CrashDetail);
    }

    public static TombstoneProtos$CrashDetail parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$CrashDetail parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$CrashDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$CrashDetail parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$CrashDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$CrashDetail parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$CrashDetail parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$CrashDetail parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$CrashDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$CrashDetail parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
