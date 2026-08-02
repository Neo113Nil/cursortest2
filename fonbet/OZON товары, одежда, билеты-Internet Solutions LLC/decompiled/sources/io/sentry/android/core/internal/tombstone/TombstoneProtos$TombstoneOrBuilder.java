package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface TombstoneProtos$TombstoneOrBuilder extends A {
    boolean containsGuestThreads(int i11);

    boolean containsThreads(int i11);

    String getAbortMessage();

    ByteString getAbortMessageBytes();

    TombstoneProtos$Architecture getArch();

    int getArchValue();

    String getBuildFingerprint();

    ByteString getBuildFingerprintBytes();

    TombstoneProtos$Cause getCauses(int i11);

    int getCausesCount();

    List<TombstoneProtos$Cause> getCausesList();

    String getCommandLine(int i11);

    ByteString getCommandLineBytes(int i11);

    int getCommandLineCount();

    List<String> getCommandLineList();

    TombstoneProtos$CrashDetail getCrashDetails(int i11);

    int getCrashDetailsCount();

    List<TombstoneProtos$CrashDetail> getCrashDetailsList();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    TombstoneProtos$Architecture getGuestArch();

    int getGuestArchValue();

    @Deprecated
    Map<Integer, TombstoneProtos$Thread> getGuestThreads();

    int getGuestThreadsCount();

    Map<Integer, TombstoneProtos$Thread> getGuestThreadsMap();

    TombstoneProtos$Thread getGuestThreadsOrDefault(int i11, TombstoneProtos$Thread tombstoneProtos$Thread);

    TombstoneProtos$Thread getGuestThreadsOrThrow(int i11);

    boolean getHasBeen16KbMode();

    TombstoneProtos$LogBuffer getLogBuffers(int i11);

    int getLogBuffersCount();

    List<TombstoneProtos$LogBuffer> getLogBuffersList();

    TombstoneProtos$MemoryMapping getMemoryMappings(int i11);

    int getMemoryMappingsCount();

    List<TombstoneProtos$MemoryMapping> getMemoryMappingsList();

    TombstoneProtos$FD getOpenFds(int i11);

    int getOpenFdsCount();

    List<TombstoneProtos$FD> getOpenFdsList();

    int getPageSize();

    int getPid();

    int getProcessUptime();

    String getRevision();

    ByteString getRevisionBytes();

    String getSelinuxLabel();

    ByteString getSelinuxLabelBytes();

    TombstoneProtos$Signal getSignalInfo();

    TombstoneProtos$StackHistoryBuffer getStackHistoryBuffer();

    @Deprecated
    Map<Integer, TombstoneProtos$Thread> getThreads();

    int getThreadsCount();

    Map<Integer, TombstoneProtos$Thread> getThreadsMap();

    TombstoneProtos$Thread getThreadsOrDefault(int i11, TombstoneProtos$Thread tombstoneProtos$Thread);

    TombstoneProtos$Thread getThreadsOrThrow(int i11);

    int getTid();

    String getTimestamp();

    ByteString getTimestampBytes();

    int getUid();

    boolean hasSignalInfo();

    boolean hasStackHistoryBuffer();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
