package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferEntry;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class TombstoneProtos$StackHistoryBuffer extends GeneratedMessageLite<TombstoneProtos$StackHistoryBuffer, Builder> implements TombstoneProtos$StackHistoryBufferOrBuilder {
    private static final TombstoneProtos$StackHistoryBuffer DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 2;
    private static volatile E<TombstoneProtos$StackHistoryBuffer> PARSER = null;
    public static final int TID_FIELD_NUMBER = 1;
    private Internal.e<TombstoneProtos$StackHistoryBufferEntry> entries_ = GeneratedMessageLite.emptyProtobufList();
    private long tid_;

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$StackHistoryBuffer, Builder> implements TombstoneProtos$StackHistoryBufferOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder addAllEntries(Iterable<? extends TombstoneProtos$StackHistoryBufferEntry> iterable) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).addAllEntries(iterable);
            return this;
        }

        public Builder addEntries(TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).addEntries(tombstoneProtos$StackHistoryBufferEntry);
            return this;
        }

        public Builder clearEntries() {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).clearEntries();
            return this;
        }

        public Builder clearTid() {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).clearTid();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
        public TombstoneProtos$StackHistoryBufferEntry getEntries(int i11) {
            return ((TombstoneProtos$StackHistoryBuffer) this.instance).getEntries(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
        public int getEntriesCount() {
            return ((TombstoneProtos$StackHistoryBuffer) this.instance).getEntriesCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
        public List<TombstoneProtos$StackHistoryBufferEntry> getEntriesList() {
            return Collections.unmodifiableList(((TombstoneProtos$StackHistoryBuffer) this.instance).getEntriesList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
        public long getTid() {
            return ((TombstoneProtos$StackHistoryBuffer) this.instance).getTid();
        }

        public Builder removeEntries(int i11) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).removeEntries(i11);
            return this;
        }

        public Builder setEntries(int i11, TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).setEntries(i11, tombstoneProtos$StackHistoryBufferEntry);
            return this;
        }

        public Builder setTid(long j11) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).setTid(j11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$StackHistoryBuffer.DEFAULT_INSTANCE);
        }

        public Builder addEntries(int i11, TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).addEntries(i11, tombstoneProtos$StackHistoryBufferEntry);
            return this;
        }

        public Builder setEntries(int i11, TombstoneProtos$StackHistoryBufferEntry.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).setEntries(i11, builder.build());
            return this;
        }

        public Builder addEntries(TombstoneProtos$StackHistoryBufferEntry.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).addEntries(builder.build());
            return this;
        }

        public Builder addEntries(int i11, TombstoneProtos$StackHistoryBufferEntry.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$StackHistoryBuffer) this.instance).addEntries(i11, builder.build());
            return this;
        }
    }

    static {
        TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer = new TombstoneProtos$StackHistoryBuffer();
        DEFAULT_INSTANCE = tombstoneProtos$StackHistoryBuffer;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$StackHistoryBuffer.class, tombstoneProtos$StackHistoryBuffer);
    }

    private TombstoneProtos$StackHistoryBuffer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntries(Iterable<? extends TombstoneProtos$StackHistoryBufferEntry> iterable) {
        ensureEntriesIsMutable();
        AbstractMessageLite.addAll(iterable, this.entries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntries(TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        tombstoneProtos$StackHistoryBufferEntry.getClass();
        ensureEntriesIsMutable();
        this.entries_.add(tombstoneProtos$StackHistoryBufferEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntries() {
        this.entries_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0L;
    }

    private void ensureEntriesIsMutable() {
        Internal.e<TombstoneProtos$StackHistoryBufferEntry> eVar = this.entries_;
        if (eVar.isModifiable()) {
            return;
        }
        this.entries_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static TombstoneProtos$StackHistoryBuffer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$StackHistoryBuffer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$StackHistoryBuffer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntries(int i11) {
        ensureEntriesIsMutable();
        this.entries_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntries(int i11, TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        tombstoneProtos$StackHistoryBufferEntry.getClass();
        ensureEntriesIsMutable();
        this.entries_.set(i11, tombstoneProtos$StackHistoryBufferEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(long j11) {
        this.tid_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$StackHistoryBuffer();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0003\u0002\u001b", new Object[]{"tid_", "entries_", TombstoneProtos$StackHistoryBufferEntry.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$StackHistoryBuffer> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$StackHistoryBuffer.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
    public TombstoneProtos$StackHistoryBufferEntry getEntries(int i11) {
        return this.entries_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
    public int getEntriesCount() {
        return this.entries_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
    public List<TombstoneProtos$StackHistoryBufferEntry> getEntriesList() {
        return this.entries_;
    }

    public TombstoneProtos$StackHistoryBufferEntryOrBuilder getEntriesOrBuilder(int i11) {
        return this.entries_.get(i11);
    }

    public List<? extends TombstoneProtos$StackHistoryBufferEntryOrBuilder> getEntriesOrBuilderList() {
        return this.entries_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBufferOrBuilder
    public long getTid() {
        return this.tid_;
    }

    public static Builder newBuilder(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$StackHistoryBuffer);
    }

    public static TombstoneProtos$StackHistoryBuffer parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntries(int i11, TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        tombstoneProtos$StackHistoryBufferEntry.getClass();
        ensureEntriesIsMutable();
        this.entries_.add(i11, tombstoneProtos$StackHistoryBufferEntry);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
