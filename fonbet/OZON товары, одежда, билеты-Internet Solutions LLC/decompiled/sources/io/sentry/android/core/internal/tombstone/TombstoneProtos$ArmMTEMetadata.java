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
public final class TombstoneProtos$ArmMTEMetadata extends GeneratedMessageLite<TombstoneProtos$ArmMTEMetadata, Builder> implements TombstoneProtos$ArmMTEMetadataOrBuilder {
    private static final TombstoneProtos$ArmMTEMetadata DEFAULT_INSTANCE;
    public static final int MEMORY_TAGS_FIELD_NUMBER = 1;
    private static volatile E<TombstoneProtos$ArmMTEMetadata> PARSER;
    private ByteString memoryTags_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$ArmMTEMetadata, Builder> implements TombstoneProtos$ArmMTEMetadataOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearMemoryTags() {
            copyOnWrite();
            ((TombstoneProtos$ArmMTEMetadata) this.instance).clearMemoryTags();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ArmMTEMetadataOrBuilder
        public ByteString getMemoryTags() {
            return ((TombstoneProtos$ArmMTEMetadata) this.instance).getMemoryTags();
        }

        public Builder setMemoryTags(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$ArmMTEMetadata) this.instance).setMemoryTags(byteString);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$ArmMTEMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata = new TombstoneProtos$ArmMTEMetadata();
        DEFAULT_INSTANCE = tombstoneProtos$ArmMTEMetadata;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$ArmMTEMetadata.class, tombstoneProtos$ArmMTEMetadata);
    }

    private TombstoneProtos$ArmMTEMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryTags() {
        this.memoryTags_ = getDefaultInstance().getMemoryTags();
    }

    public static TombstoneProtos$ArmMTEMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$ArmMTEMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$ArmMTEMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryTags(ByteString byteString) {
        byteString.getClass();
        this.memoryTags_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$ArmMTEMetadata();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"memoryTags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$ArmMTEMetadata> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$ArmMTEMetadata.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ArmMTEMetadataOrBuilder
    public ByteString getMemoryTags() {
        return this.memoryTags_;
    }

    public static Builder newBuilder(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$ArmMTEMetadata);
    }

    public static TombstoneProtos$ArmMTEMetadata parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
