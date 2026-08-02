package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import java.util.List;

/* loaded from: classes10.dex */
public interface TombstoneProtos$ThreadOrBuilder extends A {
    String getBacktraceNote(int i11);

    ByteString getBacktraceNoteBytes(int i11);

    int getBacktraceNoteCount();

    List<String> getBacktraceNoteList();

    TombstoneProtos$BacktraceFrame getCurrentBacktrace(int i11);

    int getCurrentBacktraceCount();

    List<TombstoneProtos$BacktraceFrame> getCurrentBacktraceList();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    int getId();

    TombstoneProtos$MemoryDump getMemoryDump(int i11);

    int getMemoryDumpCount();

    List<TombstoneProtos$MemoryDump> getMemoryDumpList();

    String getName();

    ByteString getNameBytes();

    long getPacEnabledKeys();

    TombstoneProtos$Register getRegisters(int i11);

    int getRegistersCount();

    List<TombstoneProtos$Register> getRegistersList();

    long getTaggedAddrCtrl();

    String getUnreadableElfFiles(int i11);

    ByteString getUnreadableElfFilesBytes(int i11);

    int getUnreadableElfFilesCount();

    List<String> getUnreadableElfFilesList();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
