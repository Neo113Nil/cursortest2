package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrame;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TombstoneProtos$StackHistoryBufferEntry extends GeneratedMessageLite<TombstoneProtos$StackHistoryBufferEntry, Builder> implements TombstoneProtos$StackHistoryBufferEntryOrBuilder {
    public static final int ADDR_FIELD_NUMBER = 1;
    private static final TombstoneProtos$StackHistoryBufferEntry DEFAULT_INSTANCE;
    public static final int FP_FIELD_NUMBER = 2;
    private static volatile E<TombstoneProtos$StackHistoryBufferEntry> PARSER = null;
    public static final int TAG_FIELD_NUMBER = 3;
    private TombstoneProtos$BacktraceFrame addr_;
    private int bitField0_;
    private long fp_;
    private long tag_;

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$StackHistoryBufferEntry, Builder> implements TombstoneProtos$StackHistoryBufferEntryOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearAddr() {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).clearAddr();
            return this;
        }

        public Builder clearFp() {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).clearFp();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).clearTag();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
        public TombstoneProtos$BacktraceFrame getAddr() {
            return ((TombstoneProtos$StackHistoryBufferEntry) this.instance).getAddr();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
        public long getFp() {
            return ((TombstoneProtos$StackHistoryBufferEntry) this.instance).getFp();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
        public long getTag() {
            return ((TombstoneProtos$StackHistoryBufferEntry) this.instance).getTag();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
        public boolean hasAddr() {
            return ((TombstoneProtos$StackHistoryBufferEntry) this.instance).hasAddr();
        }

        public Builder mergeAddr(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).mergeAddr(tombstoneProtos$BacktraceFrame);
            return this;
        }

        public Builder setAddr(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).setAddr(tombstoneProtos$BacktraceFrame);
            return this;
        }

        public Builder setFp(long j11) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).setFp(j11);
            return this;
        }

        public Builder setTag(long j11) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).setTag(j11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$StackHistoryBufferEntry.DEFAULT_INSTANCE);
        }

        public Builder setAddr(TombstoneProtos$BacktraceFrame.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBufferEntry) this.instance).setAddr(builder.build());
            return this;
        }
    }

    static {
        TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry = new TombstoneProtos$StackHistoryBufferEntry();
        DEFAULT_INSTANCE = tombstoneProtos$StackHistoryBufferEntry;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$StackHistoryBufferEntry.class, tombstoneProtos$StackHistoryBufferEntry);
    }

    private TombstoneProtos$StackHistoryBufferEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddr() {
        this.addr_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFp() {
        this.fp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = 0L;
    }

    public static TombstoneProtos$StackHistoryBufferEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddr(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame2 = this.addr_;
        if (tombstoneProtos$BacktraceFrame2 == null || tombstoneProtos$BacktraceFrame2 == TombstoneProtos$BacktraceFrame.getDefaultInstance()) {
            this.addr_ = tombstoneProtos$BacktraceFrame;
        } else {
            this.addr_ = TombstoneProtos$BacktraceFrame.newBuilder(this.addr_).mergeFrom((TombstoneProtos$BacktraceFrame.Builder) tombstoneProtos$BacktraceFrame).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$StackHistoryBufferEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddr(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        this.addr_ = tombstoneProtos$BacktraceFrame;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFp(long j11) {
        this.fp_ = j11;
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
                return new TombstoneProtos$StackHistoryBufferEntry();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003\u0003", new Object[]{"bitField0_", "addr_", "fp_", "tag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$StackHistoryBufferEntry> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$StackHistoryBufferEntry.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
    public TombstoneProtos$BacktraceFrame getAddr() {
        TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame = this.addr_;
        return tombstoneProtos$BacktraceFrame == null ? TombstoneProtos$BacktraceFrame.getDefaultInstance() : tombstoneProtos$BacktraceFrame;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
    public long getFp() {
        return this.fp_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
    public long getTag() {
        return this.tag_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntryOrBuilder
    public boolean hasAddr() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$StackHistoryBufferEntry);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
