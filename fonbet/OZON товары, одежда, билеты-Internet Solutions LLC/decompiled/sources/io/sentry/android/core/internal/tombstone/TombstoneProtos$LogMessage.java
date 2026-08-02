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
public final class TombstoneProtos$LogMessage extends GeneratedMessageLite<TombstoneProtos$LogMessage, Builder> implements TombstoneProtos$LogMessageOrBuilder {
    private static final TombstoneProtos$LogMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    private static volatile E<TombstoneProtos$LogMessage> PARSER = null;
    public static final int PID_FIELD_NUMBER = 2;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TAG_FIELD_NUMBER = 5;
    public static final int TID_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int pid_;
    private int priority_;
    private int tid_;
    private String timestamp_ = "";
    private String tag_ = "";
    private String message_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$LogMessage, Builder> implements TombstoneProtos$LogMessageOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).clearMessage();
            return this;
        }

        public Builder clearPid() {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).clearPid();
            return this;
        }

        public Builder clearPriority() {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).clearPriority();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).clearTag();
            return this;
        }

        public Builder clearTid() {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).clearTid();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).clearTimestamp();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public String getMessage() {
            return ((TombstoneProtos$LogMessage) this.instance).getMessage();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public ByteString getMessageBytes() {
            return ((TombstoneProtos$LogMessage) this.instance).getMessageBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public int getPid() {
            return ((TombstoneProtos$LogMessage) this.instance).getPid();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public int getPriority() {
            return ((TombstoneProtos$LogMessage) this.instance).getPriority();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public String getTag() {
            return ((TombstoneProtos$LogMessage) this.instance).getTag();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public ByteString getTagBytes() {
            return ((TombstoneProtos$LogMessage) this.instance).getTagBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public int getTid() {
            return ((TombstoneProtos$LogMessage) this.instance).getTid();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public String getTimestamp() {
            return ((TombstoneProtos$LogMessage) this.instance).getTimestamp();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
        public ByteString getTimestampBytes() {
            return ((TombstoneProtos$LogMessage) this.instance).getTimestampBytes();
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setMessageBytes(byteString);
            return this;
        }

        public Builder setPid(int i11) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setPid(i11);
            return this;
        }

        public Builder setPriority(int i11) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setPriority(i11);
            return this;
        }

        public Builder setTag(String str) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setTag(str);
            return this;
        }

        public Builder setTagBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setTagBytes(byteString);
            return this;
        }

        public Builder setTid(int i11) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setTid(i11);
            return this;
        }

        public Builder setTimestamp(String str) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setTimestamp(str);
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$LogMessage) this.instance).setTimestampBytes(byteString);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$LogMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        TombstoneProtos$LogMessage tombstoneProtos$LogMessage = new TombstoneProtos$LogMessage();
        DEFAULT_INSTANCE = tombstoneProtos$LogMessage;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$LogMessage.class, tombstoneProtos$LogMessage);
    }

    private TombstoneProtos$LogMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = getDefaultInstance().getTimestamp();
    }

    public static TombstoneProtos$LogMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$LogMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$LogMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(int i11) {
        this.pid_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i11) {
        this.priority_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(int i11) {
        this.tid_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(String str) {
        str.getClass();
        this.timestamp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timestamp_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$LogMessage();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005Ȉ\u0006Ȉ", new Object[]{"timestamp_", "pid_", "tid_", "priority_", "tag_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$LogMessage> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$LogMessage.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public int getPid() {
        return this.pid_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public int getPriority() {
        return this.priority_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public String getTag() {
        return this.tag_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public ByteString getTagBytes() {
        return ByteString.copyFromUtf8(this.tag_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public int getTid() {
        return this.tid_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public String getTimestamp() {
        return this.timestamp_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessageOrBuilder
    public ByteString getTimestampBytes() {
        return ByteString.copyFromUtf8(this.timestamp_);
    }

    public static Builder newBuilder(TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$LogMessage);
    }

    public static TombstoneProtos$LogMessage parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$LogMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$LogMessage parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$LogMessage parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$LogMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
