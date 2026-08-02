package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$BacktraceFrame;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDump;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Register;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class TombstoneProtos$Thread extends GeneratedMessageLite<TombstoneProtos$Thread, Builder> implements TombstoneProtos$ThreadOrBuilder {
    public static final int BACKTRACE_NOTE_FIELD_NUMBER = 7;
    public static final int CURRENT_BACKTRACE_FIELD_NUMBER = 4;
    private static final TombstoneProtos$Thread DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MEMORY_DUMP_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int PAC_ENABLED_KEYS_FIELD_NUMBER = 8;
    private static volatile E<TombstoneProtos$Thread> PARSER = null;
    public static final int REGISTERS_FIELD_NUMBER = 3;
    public static final int TAGGED_ADDR_CTRL_FIELD_NUMBER = 6;
    public static final int UNREADABLE_ELF_FILES_FIELD_NUMBER = 9;
    private int id_;
    private long pacEnabledKeys_;
    private long taggedAddrCtrl_;
    private String name_ = "";
    private Internal.e<TombstoneProtos$Register> registers_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<String> backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<String> unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<TombstoneProtos$BacktraceFrame> currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<TombstoneProtos$MemoryDump> memoryDump_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$Thread, Builder> implements TombstoneProtos$ThreadOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder addAllBacktraceNote(Iterable<String> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addAllBacktraceNote(iterable);
            return this;
        }

        public Builder addAllCurrentBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addAllCurrentBacktrace(iterable);
            return this;
        }

        public Builder addAllMemoryDump(Iterable<? extends TombstoneProtos$MemoryDump> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addAllMemoryDump(iterable);
            return this;
        }

        public Builder addAllRegisters(Iterable<? extends TombstoneProtos$Register> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addAllRegisters(iterable);
            return this;
        }

        public Builder addAllUnreadableElfFiles(Iterable<String> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addAllUnreadableElfFiles(iterable);
            return this;
        }

        public Builder addBacktraceNote(String str) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addBacktraceNote(str);
            return this;
        }

        public Builder addBacktraceNoteBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addBacktraceNoteBytes(byteString);
            return this;
        }

        public Builder addCurrentBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addCurrentBacktrace(tombstoneProtos$BacktraceFrame);
            return this;
        }

        public Builder addMemoryDump(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addMemoryDump(tombstoneProtos$MemoryDump);
            return this;
        }

        public Builder addRegisters(TombstoneProtos$Register tombstoneProtos$Register) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addRegisters(tombstoneProtos$Register);
            return this;
        }

        public Builder addUnreadableElfFiles(String str) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addUnreadableElfFiles(str);
            return this;
        }

        public Builder addUnreadableElfFilesBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addUnreadableElfFilesBytes(byteString);
            return this;
        }

        public Builder clearBacktraceNote() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearBacktraceNote();
            return this;
        }

        public Builder clearCurrentBacktrace() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearCurrentBacktrace();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearId();
            return this;
        }

        public Builder clearMemoryDump() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearMemoryDump();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearName();
            return this;
        }

        public Builder clearPacEnabledKeys() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearPacEnabledKeys();
            return this;
        }

        public Builder clearRegisters() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearRegisters();
            return this;
        }

        public Builder clearTaggedAddrCtrl() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearTaggedAddrCtrl();
            return this;
        }

        public Builder clearUnreadableElfFiles() {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).clearUnreadableElfFiles();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public String getBacktraceNote(int i11) {
            return ((TombstoneProtos$Thread) this.instance).getBacktraceNote(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public ByteString getBacktraceNoteBytes(int i11) {
            return ((TombstoneProtos$Thread) this.instance).getBacktraceNoteBytes(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public int getBacktraceNoteCount() {
            return ((TombstoneProtos$Thread) this.instance).getBacktraceNoteCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public List<String> getBacktraceNoteList() {
            return Collections.unmodifiableList(((TombstoneProtos$Thread) this.instance).getBacktraceNoteList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public TombstoneProtos$BacktraceFrame getCurrentBacktrace(int i11) {
            return ((TombstoneProtos$Thread) this.instance).getCurrentBacktrace(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public int getCurrentBacktraceCount() {
            return ((TombstoneProtos$Thread) this.instance).getCurrentBacktraceCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public List<TombstoneProtos$BacktraceFrame> getCurrentBacktraceList() {
            return Collections.unmodifiableList(((TombstoneProtos$Thread) this.instance).getCurrentBacktraceList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public int getId() {
            return ((TombstoneProtos$Thread) this.instance).getId();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public TombstoneProtos$MemoryDump getMemoryDump(int i11) {
            return ((TombstoneProtos$Thread) this.instance).getMemoryDump(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public int getMemoryDumpCount() {
            return ((TombstoneProtos$Thread) this.instance).getMemoryDumpCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public List<TombstoneProtos$MemoryDump> getMemoryDumpList() {
            return Collections.unmodifiableList(((TombstoneProtos$Thread) this.instance).getMemoryDumpList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public String getName() {
            return ((TombstoneProtos$Thread) this.instance).getName();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public ByteString getNameBytes() {
            return ((TombstoneProtos$Thread) this.instance).getNameBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public long getPacEnabledKeys() {
            return ((TombstoneProtos$Thread) this.instance).getPacEnabledKeys();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public TombstoneProtos$Register getRegisters(int i11) {
            return ((TombstoneProtos$Thread) this.instance).getRegisters(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public int getRegistersCount() {
            return ((TombstoneProtos$Thread) this.instance).getRegistersCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public List<TombstoneProtos$Register> getRegistersList() {
            return Collections.unmodifiableList(((TombstoneProtos$Thread) this.instance).getRegistersList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public long getTaggedAddrCtrl() {
            return ((TombstoneProtos$Thread) this.instance).getTaggedAddrCtrl();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public String getUnreadableElfFiles(int i11) {
            return ((TombstoneProtos$Thread) this.instance).getUnreadableElfFiles(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public ByteString getUnreadableElfFilesBytes(int i11) {
            return ((TombstoneProtos$Thread) this.instance).getUnreadableElfFilesBytes(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public int getUnreadableElfFilesCount() {
            return ((TombstoneProtos$Thread) this.instance).getUnreadableElfFilesCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
        public List<String> getUnreadableElfFilesList() {
            return Collections.unmodifiableList(((TombstoneProtos$Thread) this.instance).getUnreadableElfFilesList());
        }

        public Builder removeCurrentBacktrace(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).removeCurrentBacktrace(i11);
            return this;
        }

        public Builder removeMemoryDump(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).removeMemoryDump(i11);
            return this;
        }

        public Builder removeRegisters(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).removeRegisters(i11);
            return this;
        }

        public Builder setBacktraceNote(int i11, String str) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setBacktraceNote(i11, str);
            return this;
        }

        public Builder setCurrentBacktrace(int i11, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setCurrentBacktrace(i11, tombstoneProtos$BacktraceFrame);
            return this;
        }

        public Builder setId(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setId(i11);
            return this;
        }

        public Builder setMemoryDump(int i11, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setMemoryDump(i11, tombstoneProtos$MemoryDump);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPacEnabledKeys(long j11) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setPacEnabledKeys(j11);
            return this;
        }

        public Builder setRegisters(int i11, TombstoneProtos$Register tombstoneProtos$Register) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setRegisters(i11, tombstoneProtos$Register);
            return this;
        }

        public Builder setTaggedAddrCtrl(long j11) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setTaggedAddrCtrl(j11);
            return this;
        }

        public Builder setUnreadableElfFiles(int i11, String str) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setUnreadableElfFiles(i11, str);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$Thread.DEFAULT_INSTANCE);
        }

        public Builder addCurrentBacktrace(int i11, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addCurrentBacktrace(i11, tombstoneProtos$BacktraceFrame);
            return this;
        }

        public Builder addMemoryDump(int i11, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addMemoryDump(i11, tombstoneProtos$MemoryDump);
            return this;
        }

        public Builder addRegisters(int i11, TombstoneProtos$Register tombstoneProtos$Register) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addRegisters(i11, tombstoneProtos$Register);
            return this;
        }

        public Builder setCurrentBacktrace(int i11, TombstoneProtos$BacktraceFrame.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setCurrentBacktrace(i11, builder.build());
            return this;
        }

        public Builder setMemoryDump(int i11, TombstoneProtos$MemoryDump.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setMemoryDump(i11, builder.build());
            return this;
        }

        public Builder setRegisters(int i11, TombstoneProtos$Register.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).setRegisters(i11, builder.build());
            return this;
        }

        public Builder addCurrentBacktrace(TombstoneProtos$BacktraceFrame.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addCurrentBacktrace(builder.build());
            return this;
        }

        public Builder addMemoryDump(TombstoneProtos$MemoryDump.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addMemoryDump(builder.build());
            return this;
        }

        public Builder addRegisters(TombstoneProtos$Register.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addRegisters(builder.build());
            return this;
        }

        public Builder addCurrentBacktrace(int i11, TombstoneProtos$BacktraceFrame.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addCurrentBacktrace(i11, builder.build());
            return this;
        }

        public Builder addMemoryDump(int i11, TombstoneProtos$MemoryDump.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addMemoryDump(i11, builder.build());
            return this;
        }

        public Builder addRegisters(int i11, TombstoneProtos$Register.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Thread) this.instance).addRegisters(i11, builder.build());
            return this;
        }
    }

    static {
        TombstoneProtos$Thread tombstoneProtos$Thread = new TombstoneProtos$Thread();
        DEFAULT_INSTANCE = tombstoneProtos$Thread;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Thread.class, tombstoneProtos$Thread);
    }

    private TombstoneProtos$Thread() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBacktraceNote(Iterable<String> iterable) {
        ensureBacktraceNoteIsMutable();
        AbstractMessageLite.addAll(iterable, this.backtraceNote_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCurrentBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
        ensureCurrentBacktraceIsMutable();
        AbstractMessageLite.addAll(iterable, this.currentBacktrace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemoryDump(Iterable<? extends TombstoneProtos$MemoryDump> iterable) {
        ensureMemoryDumpIsMutable();
        AbstractMessageLite.addAll(iterable, this.memoryDump_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegisters(Iterable<? extends TombstoneProtos$Register> iterable) {
        ensureRegistersIsMutable();
        AbstractMessageLite.addAll(iterable, this.registers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnreadableElfFiles(Iterable<String> iterable) {
        ensureUnreadableElfFilesIsMutable();
        AbstractMessageLite.addAll(iterable, this.unreadableElfFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBacktraceNote(String str) {
        str.getClass();
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBacktraceNoteBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.add(tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryDump(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.add(tombstoneProtos$MemoryDump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegisters(TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.add(tombstoneProtos$Register);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnreadableElfFiles(String str) {
        str.getClass();
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnreadableElfFilesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBacktraceNote() {
        this.backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentBacktrace() {
        this.currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryDump() {
        this.memoryDump_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacEnabledKeys() {
        this.pacEnabledKeys_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegisters() {
        this.registers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaggedAddrCtrl() {
        this.taggedAddrCtrl_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnreadableElfFiles() {
        this.unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureBacktraceNoteIsMutable() {
        Internal.e<String> eVar = this.backtraceNote_;
        if (eVar.isModifiable()) {
            return;
        }
        this.backtraceNote_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureCurrentBacktraceIsMutable() {
        Internal.e<TombstoneProtos$BacktraceFrame> eVar = this.currentBacktrace_;
        if (eVar.isModifiable()) {
            return;
        }
        this.currentBacktrace_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureMemoryDumpIsMutable() {
        Internal.e<TombstoneProtos$MemoryDump> eVar = this.memoryDump_;
        if (eVar.isModifiable()) {
            return;
        }
        this.memoryDump_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureRegistersIsMutable() {
        Internal.e<TombstoneProtos$Register> eVar = this.registers_;
        if (eVar.isModifiable()) {
            return;
        }
        this.registers_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureUnreadableElfFilesIsMutable() {
        Internal.e<String> eVar = this.unreadableElfFiles_;
        if (eVar.isModifiable()) {
            return;
        }
        this.unreadableElfFiles_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static TombstoneProtos$Thread getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Thread parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Thread parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$Thread> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCurrentBacktrace(int i11) {
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMemoryDump(int i11) {
        ensureMemoryDumpIsMutable();
        this.memoryDump_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegisters(int i11) {
        ensureRegistersIsMutable();
        this.registers_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBacktraceNote(int i11, String str) {
        str.getClass();
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentBacktrace(int i11, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.set(i11, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i11) {
        this.id_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryDump(int i11, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.set(i11, tombstoneProtos$MemoryDump);
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
    public void setPacEnabledKeys(long j11) {
        this.pacEnabledKeys_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisters(int i11, TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.set(i11, tombstoneProtos$Register);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaggedAddrCtrl(long j11) {
        this.taggedAddrCtrl_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreadableElfFiles(int i11, String str) {
        str.getClass();
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.set(i11, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$Thread();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", TombstoneProtos$Register.class, "currentBacktrace_", TombstoneProtos$BacktraceFrame.class, "memoryDump_", TombstoneProtos$MemoryDump.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$Thread> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$Thread.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public String getBacktraceNote(int i11) {
        return this.backtraceNote_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public ByteString getBacktraceNoteBytes(int i11) {
        return ByteString.copyFromUtf8(this.backtraceNote_.get(i11));
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public int getBacktraceNoteCount() {
        return this.backtraceNote_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public List<String> getBacktraceNoteList() {
        return this.backtraceNote_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public TombstoneProtos$BacktraceFrame getCurrentBacktrace(int i11) {
        return this.currentBacktrace_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public int getCurrentBacktraceCount() {
        return this.currentBacktrace_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public List<TombstoneProtos$BacktraceFrame> getCurrentBacktraceList() {
        return this.currentBacktrace_;
    }

    public TombstoneProtos$BacktraceFrameOrBuilder getCurrentBacktraceOrBuilder(int i11) {
        return this.currentBacktrace_.get(i11);
    }

    public List<? extends TombstoneProtos$BacktraceFrameOrBuilder> getCurrentBacktraceOrBuilderList() {
        return this.currentBacktrace_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public TombstoneProtos$MemoryDump getMemoryDump(int i11) {
        return this.memoryDump_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public int getMemoryDumpCount() {
        return this.memoryDump_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public List<TombstoneProtos$MemoryDump> getMemoryDumpList() {
        return this.memoryDump_;
    }

    public TombstoneProtos$MemoryDumpOrBuilder getMemoryDumpOrBuilder(int i11) {
        return this.memoryDump_.get(i11);
    }

    public List<? extends TombstoneProtos$MemoryDumpOrBuilder> getMemoryDumpOrBuilderList() {
        return this.memoryDump_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public long getPacEnabledKeys() {
        return this.pacEnabledKeys_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public TombstoneProtos$Register getRegisters(int i11) {
        return this.registers_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public int getRegistersCount() {
        return this.registers_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public List<TombstoneProtos$Register> getRegistersList() {
        return this.registers_;
    }

    public TombstoneProtos$RegisterOrBuilder getRegistersOrBuilder(int i11) {
        return this.registers_.get(i11);
    }

    public List<? extends TombstoneProtos$RegisterOrBuilder> getRegistersOrBuilderList() {
        return this.registers_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public long getTaggedAddrCtrl() {
        return this.taggedAddrCtrl_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public String getUnreadableElfFiles(int i11) {
        return this.unreadableElfFiles_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public ByteString getUnreadableElfFilesBytes(int i11) {
        return ByteString.copyFromUtf8(this.unreadableElfFiles_.get(i11));
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public int getUnreadableElfFilesCount() {
        return this.unreadableElfFiles_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$ThreadOrBuilder
    public List<String> getUnreadableElfFilesList() {
        return this.unreadableElfFiles_;
    }

    public static Builder newBuilder(TombstoneProtos$Thread tombstoneProtos$Thread) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Thread);
    }

    public static TombstoneProtos$Thread parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Thread parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$Thread parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentBacktrace(int i11, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.add(i11, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryDump(int i11, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.add(i11, tombstoneProtos$MemoryDump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegisters(int i11, TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.add(i11, tombstoneProtos$Register);
    }

    public static TombstoneProtos$Thread parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$Thread parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Thread parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$Thread parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Thread parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Thread parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Thread parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
