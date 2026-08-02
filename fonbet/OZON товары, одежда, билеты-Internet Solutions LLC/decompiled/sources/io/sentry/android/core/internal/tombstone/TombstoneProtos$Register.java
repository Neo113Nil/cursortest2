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
public final class TombstoneProtos$Register extends GeneratedMessageLite<TombstoneProtos$Register, Builder> implements TombstoneProtos$RegisterOrBuilder {
    private static final TombstoneProtos$Register DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile E<TombstoneProtos$Register> PARSER = null;
    public static final int U64_FIELD_NUMBER = 2;
    private String name_ = "";
    private long u64_;

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$Register, Builder> implements TombstoneProtos$RegisterOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((TombstoneProtos$Register) this.instance).clearName();
            return this;
        }

        public Builder clearU64() {
            copyOnWrite();
            ((TombstoneProtos$Register) this.instance).clearU64();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$RegisterOrBuilder
        public String getName() {
            return ((TombstoneProtos$Register) this.instance).getName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$RegisterOrBuilder
        public ByteString getNameBytes() {
            return ((TombstoneProtos$Register) this.instance).getNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$RegisterOrBuilder
        public long getU64() {
            return ((TombstoneProtos$Register) this.instance).getU64();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TombstoneProtos$Register) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Register) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setU64(long j11) {
            copyOnWrite();
            ((TombstoneProtos$Register) this.instance).setU64(j11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$Register.DEFAULT_INSTANCE);
        }
    }

    static {
        TombstoneProtos$Register tombstoneProtos$Register = new TombstoneProtos$Register();
        DEFAULT_INSTANCE = tombstoneProtos$Register;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Register.class, tombstoneProtos$Register);
    }

    private TombstoneProtos$Register() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearU64() {
        this.u64_ = 0L;
    }

    public static TombstoneProtos$Register getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Register parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Register parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$Register> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setU64(long j11) {
        this.u64_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$Register();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"name_", "u64_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$Register> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$Register.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$RegisterOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$RegisterOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$RegisterOrBuilder
    public long getU64() {
        return this.u64_;
    }

    public static Builder newBuilder(TombstoneProtos$Register tombstoneProtos$Register) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Register);
    }

    public static TombstoneProtos$Register parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Register parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$Register parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$Register parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$Register parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Register parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$Register parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Register parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Register parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Register parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Register) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
