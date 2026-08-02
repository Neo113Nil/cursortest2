package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$LogMessage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class TombstoneProtos$LogBuffer extends GeneratedMessageLite<TombstoneProtos$LogBuffer, Builder> implements TombstoneProtos$LogBufferOrBuilder {
    private static final TombstoneProtos$LogBuffer DEFAULT_INSTANCE;
    public static final int LOGS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile E<TombstoneProtos$LogBuffer> PARSER;
    private String name_ = "";
    private Internal.e<TombstoneProtos$LogMessage> logs_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$LogBuffer, Builder> implements TombstoneProtos$LogBufferOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder addAllLogs(Iterable<? extends TombstoneProtos$LogMessage> iterable) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).addAllLogs(iterable);
            return this;
        }

        public Builder addLogs(TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).addLogs(tombstoneProtos$LogMessage);
            return this;
        }

        public Builder clearLogs() {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).clearLogs();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).clearName();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
        public TombstoneProtos$LogMessage getLogs(int i11) {
            return ((TombstoneProtos$LogBuffer) this.instance).getLogs(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
        public int getLogsCount() {
            return ((TombstoneProtos$LogBuffer) this.instance).getLogsCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
        public List<TombstoneProtos$LogMessage> getLogsList() {
            return Collections.unmodifiableList(((TombstoneProtos$LogBuffer) this.instance).getLogsList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
        public String getName() {
            return ((TombstoneProtos$LogBuffer) this.instance).getName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
        public ByteString getNameBytes() {
            return ((TombstoneProtos$LogBuffer) this.instance).getNameBytes();
        }

        public Builder removeLogs(int i11) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).removeLogs(i11);
            return this;
        }

        public Builder setLogs(int i11, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).setLogs(i11, tombstoneProtos$LogMessage);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$LogBuffer.DEFAULT_INSTANCE);
        }

        public Builder addLogs(int i11, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).addLogs(i11, tombstoneProtos$LogMessage);
            return this;
        }

        public Builder setLogs(int i11, TombstoneProtos$LogMessage.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).setLogs(i11, builder.build());
            return this;
        }

        public Builder addLogs(TombstoneProtos$LogMessage.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).addLogs(builder.build());
            return this;
        }

        public Builder addLogs(int i11, TombstoneProtos$LogMessage.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$LogBuffer) this.instance).addLogs(i11, builder.build());
            return this;
        }
    }

    static {
        TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer = new TombstoneProtos$LogBuffer();
        DEFAULT_INSTANCE = tombstoneProtos$LogBuffer;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$LogBuffer.class, tombstoneProtos$LogBuffer);
    }

    private TombstoneProtos$LogBuffer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends TombstoneProtos$LogMessage> iterable) {
        ensureLogsIsMutable();
        AbstractMessageLite.addAll(iterable, this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.add(tombstoneProtos$LogMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureLogsIsMutable() {
        Internal.e<TombstoneProtos$LogMessage> eVar = this.logs_;
        if (eVar.isModifiable()) {
            return;
        }
        this.logs_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static TombstoneProtos$LogBuffer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$LogBuffer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$LogBuffer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i11) {
        ensureLogsIsMutable();
        this.logs_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i11, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i11, tombstoneProtos$LogMessage);
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$LogBuffer();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"name_", "logs_", TombstoneProtos$LogMessage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$LogBuffer> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$LogBuffer.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
    public TombstoneProtos$LogMessage getLogs(int i11) {
        return this.logs_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
    public List<TombstoneProtos$LogMessage> getLogsList() {
        return this.logs_;
    }

    public TombstoneProtos$LogMessageOrBuilder getLogsOrBuilder(int i11) {
        return this.logs_.get(i11);
    }

    public List<? extends TombstoneProtos$LogMessageOrBuilder> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBufferOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$LogBuffer);
    }

    public static TombstoneProtos$LogBuffer parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i11, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i11, tombstoneProtos$LogMessage);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$LogBuffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$LogBuffer parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$LogBuffer parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$LogBuffer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
