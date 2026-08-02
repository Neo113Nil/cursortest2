package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.u;
import com.google.protobuf.v;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Cause;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$CrashDetail;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$FD;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$LogBuffer;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryMapping;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Signal;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$StackHistoryBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TombstoneProtos$Tombstone extends GeneratedMessageLite<TombstoneProtos$Tombstone, Builder> implements TombstoneProtos$TombstoneOrBuilder {
    public static final int ABORT_MESSAGE_FIELD_NUMBER = 14;
    public static final int ARCH_FIELD_NUMBER = 1;
    public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 2;
    public static final int CAUSES_FIELD_NUMBER = 15;
    public static final int COMMAND_LINE_FIELD_NUMBER = 9;
    public static final int CRASH_DETAILS_FIELD_NUMBER = 21;
    private static final TombstoneProtos$Tombstone DEFAULT_INSTANCE;
    public static final int GUEST_ARCH_FIELD_NUMBER = 24;
    public static final int GUEST_THREADS_FIELD_NUMBER = 25;
    public static final int HAS_BEEN_16KB_MODE_FIELD_NUMBER = 23;
    public static final int LOG_BUFFERS_FIELD_NUMBER = 18;
    public static final int MEMORY_MAPPINGS_FIELD_NUMBER = 17;
    public static final int OPEN_FDS_FIELD_NUMBER = 19;
    public static final int PAGE_SIZE_FIELD_NUMBER = 22;
    private static volatile E<TombstoneProtos$Tombstone> PARSER = null;
    public static final int PID_FIELD_NUMBER = 5;
    public static final int PROCESS_UPTIME_FIELD_NUMBER = 20;
    public static final int REVISION_FIELD_NUMBER = 3;
    public static final int SELINUX_LABEL_FIELD_NUMBER = 8;
    public static final int SIGNAL_INFO_FIELD_NUMBER = 10;
    public static final int STACK_HISTORY_BUFFER_FIELD_NUMBER = 26;
    public static final int THREADS_FIELD_NUMBER = 16;
    public static final int TID_FIELD_NUMBER = 6;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int UID_FIELD_NUMBER = 7;
    private int arch_;
    private int bitField0_;
    private int guestArch_;
    private boolean hasBeen16KbMode_;
    private int pageSize_;
    private int pid_;
    private int processUptime_;
    private TombstoneProtos$Signal signalInfo_;
    private TombstoneProtos$StackHistoryBuffer stackHistoryBuffer_;
    private int tid_;
    private int uid_;
    private v<Integer, TombstoneProtos$Thread> threads_ = v.e();
    private v<Integer, TombstoneProtos$Thread> guestThreads_ = v.e();
    private String buildFingerprint_ = "";
    private String revision_ = "";
    private String timestamp_ = "";
    private String selinuxLabel_ = "";
    private Internal.e<String> commandLine_ = GeneratedMessageLite.emptyProtobufList();
    private String abortMessage_ = "";
    private Internal.e<TombstoneProtos$CrashDetail> crashDetails_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<TombstoneProtos$Cause> causes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<TombstoneProtos$MemoryMapping> memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<TombstoneProtos$LogBuffer> logBuffers_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<TombstoneProtos$FD> openFds_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$Tombstone, Builder> implements TombstoneProtos$TombstoneOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder addAllCauses(Iterable<? extends TombstoneProtos$Cause> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addAllCauses(iterable);
            return this;
        }

        public Builder addAllCommandLine(Iterable<String> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addAllCommandLine(iterable);
            return this;
        }

        public Builder addAllCrashDetails(Iterable<? extends TombstoneProtos$CrashDetail> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addAllCrashDetails(iterable);
            return this;
        }

        public Builder addAllLogBuffers(Iterable<? extends TombstoneProtos$LogBuffer> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addAllLogBuffers(iterable);
            return this;
        }

        public Builder addAllMemoryMappings(Iterable<? extends TombstoneProtos$MemoryMapping> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addAllMemoryMappings(iterable);
            return this;
        }

        public Builder addAllOpenFds(Iterable<? extends TombstoneProtos$FD> iterable) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addAllOpenFds(iterable);
            return this;
        }

        public Builder addCauses(TombstoneProtos$Cause tombstoneProtos$Cause) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCauses(tombstoneProtos$Cause);
            return this;
        }

        public Builder addCommandLine(String str) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCommandLine(str);
            return this;
        }

        public Builder addCommandLineBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCommandLineBytes(byteString);
            return this;
        }

        public Builder addCrashDetails(TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCrashDetails(tombstoneProtos$CrashDetail);
            return this;
        }

        public Builder addLogBuffers(TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addLogBuffers(tombstoneProtos$LogBuffer);
            return this;
        }

        public Builder addMemoryMappings(TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addMemoryMappings(tombstoneProtos$MemoryMapping);
            return this;
        }

        public Builder addOpenFds(TombstoneProtos$FD tombstoneProtos$FD) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addOpenFds(tombstoneProtos$FD);
            return this;
        }

        public Builder clearAbortMessage() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearAbortMessage();
            return this;
        }

        public Builder clearArch() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearArch();
            return this;
        }

        public Builder clearBuildFingerprint() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearBuildFingerprint();
            return this;
        }

        public Builder clearCauses() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearCauses();
            return this;
        }

        public Builder clearCommandLine() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearCommandLine();
            return this;
        }

        public Builder clearCrashDetails() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearCrashDetails();
            return this;
        }

        public Builder clearGuestArch() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearGuestArch();
            return this;
        }

        public Builder clearGuestThreads() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableGuestThreadsMap().clear();
            return this;
        }

        public Builder clearHasBeen16KbMode() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearHasBeen16KbMode();
            return this;
        }

        public Builder clearLogBuffers() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearLogBuffers();
            return this;
        }

        public Builder clearMemoryMappings() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearMemoryMappings();
            return this;
        }

        public Builder clearOpenFds() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearOpenFds();
            return this;
        }

        public Builder clearPageSize() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearPageSize();
            return this;
        }

        public Builder clearPid() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearPid();
            return this;
        }

        public Builder clearProcessUptime() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearProcessUptime();
            return this;
        }

        public Builder clearRevision() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearRevision();
            return this;
        }

        public Builder clearSelinuxLabel() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearSelinuxLabel();
            return this;
        }

        public Builder clearSignalInfo() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearSignalInfo();
            return this;
        }

        public Builder clearStackHistoryBuffer() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearStackHistoryBuffer();
            return this;
        }

        public Builder clearThreads() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableThreadsMap().clear();
            return this;
        }

        public Builder clearTid() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearTid();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearUid() {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).clearUid();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public boolean containsGuestThreads(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getGuestThreadsMap().containsKey(Integer.valueOf(i11));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public boolean containsThreads(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getThreadsMap().containsKey(Integer.valueOf(i11));
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public String getAbortMessage() {
            return ((TombstoneProtos$Tombstone) this.instance).getAbortMessage();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public ByteString getAbortMessageBytes() {
            return ((TombstoneProtos$Tombstone) this.instance).getAbortMessageBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Architecture getArch() {
            return ((TombstoneProtos$Tombstone) this.instance).getArch();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getArchValue() {
            return ((TombstoneProtos$Tombstone) this.instance).getArchValue();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public String getBuildFingerprint() {
            return ((TombstoneProtos$Tombstone) this.instance).getBuildFingerprint();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public ByteString getBuildFingerprintBytes() {
            return ((TombstoneProtos$Tombstone) this.instance).getBuildFingerprintBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Cause getCauses(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getCauses(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getCausesCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getCausesCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public List<TombstoneProtos$Cause> getCausesList() {
            return Collections.unmodifiableList(((TombstoneProtos$Tombstone) this.instance).getCausesList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public String getCommandLine(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getCommandLine(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public ByteString getCommandLineBytes(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getCommandLineBytes(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getCommandLineCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getCommandLineCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public List<String> getCommandLineList() {
            return Collections.unmodifiableList(((TombstoneProtos$Tombstone) this.instance).getCommandLineList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$CrashDetail getCrashDetails(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getCrashDetails(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getCrashDetailsCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getCrashDetailsCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public List<TombstoneProtos$CrashDetail> getCrashDetailsList() {
            return Collections.unmodifiableList(((TombstoneProtos$Tombstone) this.instance).getCrashDetailsList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Architecture getGuestArch() {
            return ((TombstoneProtos$Tombstone) this.instance).getGuestArch();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getGuestArchValue() {
            return ((TombstoneProtos$Tombstone) this.instance).getGuestArchValue();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        @Deprecated
        public Map<Integer, TombstoneProtos$Thread> getGuestThreads() {
            return getGuestThreadsMap();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getGuestThreadsCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getGuestThreadsMap().size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public Map<Integer, TombstoneProtos$Thread> getGuestThreadsMap() {
            return Collections.unmodifiableMap(((TombstoneProtos$Tombstone) this.instance).getGuestThreadsMap());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Thread getGuestThreadsOrDefault(int i11, TombstoneProtos$Thread tombstoneProtos$Thread) {
            Map<Integer, TombstoneProtos$Thread> guestThreadsMap = ((TombstoneProtos$Tombstone) this.instance).getGuestThreadsMap();
            return guestThreadsMap.containsKey(Integer.valueOf(i11)) ? guestThreadsMap.get(Integer.valueOf(i11)) : tombstoneProtos$Thread;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Thread getGuestThreadsOrThrow(int i11) {
            Map<Integer, TombstoneProtos$Thread> guestThreadsMap = ((TombstoneProtos$Tombstone) this.instance).getGuestThreadsMap();
            if (guestThreadsMap.containsKey(Integer.valueOf(i11))) {
                return guestThreadsMap.get(Integer.valueOf(i11));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public boolean getHasBeen16KbMode() {
            return ((TombstoneProtos$Tombstone) this.instance).getHasBeen16KbMode();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$LogBuffer getLogBuffers(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getLogBuffers(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getLogBuffersCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getLogBuffersCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public List<TombstoneProtos$LogBuffer> getLogBuffersList() {
            return Collections.unmodifiableList(((TombstoneProtos$Tombstone) this.instance).getLogBuffersList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$MemoryMapping getMemoryMappings(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getMemoryMappings(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getMemoryMappingsCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getMemoryMappingsCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public List<TombstoneProtos$MemoryMapping> getMemoryMappingsList() {
            return Collections.unmodifiableList(((TombstoneProtos$Tombstone) this.instance).getMemoryMappingsList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$FD getOpenFds(int i11) {
            return ((TombstoneProtos$Tombstone) this.instance).getOpenFds(i11);
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getOpenFdsCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getOpenFdsCount();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public List<TombstoneProtos$FD> getOpenFdsList() {
            return Collections.unmodifiableList(((TombstoneProtos$Tombstone) this.instance).getOpenFdsList());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getPageSize() {
            return ((TombstoneProtos$Tombstone) this.instance).getPageSize();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getPid() {
            return ((TombstoneProtos$Tombstone) this.instance).getPid();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getProcessUptime() {
            return ((TombstoneProtos$Tombstone) this.instance).getProcessUptime();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public String getRevision() {
            return ((TombstoneProtos$Tombstone) this.instance).getRevision();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public ByteString getRevisionBytes() {
            return ((TombstoneProtos$Tombstone) this.instance).getRevisionBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public String getSelinuxLabel() {
            return ((TombstoneProtos$Tombstone) this.instance).getSelinuxLabel();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public ByteString getSelinuxLabelBytes() {
            return ((TombstoneProtos$Tombstone) this.instance).getSelinuxLabelBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Signal getSignalInfo() {
            return ((TombstoneProtos$Tombstone) this.instance).getSignalInfo();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$StackHistoryBuffer getStackHistoryBuffer() {
            return ((TombstoneProtos$Tombstone) this.instance).getStackHistoryBuffer();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        @Deprecated
        public Map<Integer, TombstoneProtos$Thread> getThreads() {
            return getThreadsMap();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getThreadsCount() {
            return ((TombstoneProtos$Tombstone) this.instance).getThreadsMap().size();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public Map<Integer, TombstoneProtos$Thread> getThreadsMap() {
            return Collections.unmodifiableMap(((TombstoneProtos$Tombstone) this.instance).getThreadsMap());
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Thread getThreadsOrDefault(int i11, TombstoneProtos$Thread tombstoneProtos$Thread) {
            Map<Integer, TombstoneProtos$Thread> threadsMap = ((TombstoneProtos$Tombstone) this.instance).getThreadsMap();
            return threadsMap.containsKey(Integer.valueOf(i11)) ? threadsMap.get(Integer.valueOf(i11)) : tombstoneProtos$Thread;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public TombstoneProtos$Thread getThreadsOrThrow(int i11) {
            Map<Integer, TombstoneProtos$Thread> threadsMap = ((TombstoneProtos$Tombstone) this.instance).getThreadsMap();
            if (threadsMap.containsKey(Integer.valueOf(i11))) {
                return threadsMap.get(Integer.valueOf(i11));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getTid() {
            return ((TombstoneProtos$Tombstone) this.instance).getTid();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public String getTimestamp() {
            return ((TombstoneProtos$Tombstone) this.instance).getTimestamp();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public ByteString getTimestampBytes() {
            return ((TombstoneProtos$Tombstone) this.instance).getTimestampBytes();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public int getUid() {
            return ((TombstoneProtos$Tombstone) this.instance).getUid();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public boolean hasSignalInfo() {
            return ((TombstoneProtos$Tombstone) this.instance).hasSignalInfo();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
        public boolean hasStackHistoryBuffer() {
            return ((TombstoneProtos$Tombstone) this.instance).hasStackHistoryBuffer();
        }

        public Builder mergeSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).mergeSignalInfo(tombstoneProtos$Signal);
            return this;
        }

        public Builder mergeStackHistoryBuffer(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).mergeStackHistoryBuffer(tombstoneProtos$StackHistoryBuffer);
            return this;
        }

        public Builder putAllGuestThreads(Map<Integer, TombstoneProtos$Thread> map) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableGuestThreadsMap().putAll(map);
            return this;
        }

        public Builder putAllThreads(Map<Integer, TombstoneProtos$Thread> map) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableThreadsMap().putAll(map);
            return this;
        }

        public Builder putGuestThreads(int i11, TombstoneProtos$Thread tombstoneProtos$Thread) {
            tombstoneProtos$Thread.getClass();
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableGuestThreadsMap().put(Integer.valueOf(i11), tombstoneProtos$Thread);
            return this;
        }

        public Builder putThreads(int i11, TombstoneProtos$Thread tombstoneProtos$Thread) {
            tombstoneProtos$Thread.getClass();
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableThreadsMap().put(Integer.valueOf(i11), tombstoneProtos$Thread);
            return this;
        }

        public Builder removeCauses(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).removeCauses(i11);
            return this;
        }

        public Builder removeCrashDetails(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).removeCrashDetails(i11);
            return this;
        }

        public Builder removeGuestThreads(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableGuestThreadsMap().remove(Integer.valueOf(i11));
            return this;
        }

        public Builder removeLogBuffers(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).removeLogBuffers(i11);
            return this;
        }

        public Builder removeMemoryMappings(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).removeMemoryMappings(i11);
            return this;
        }

        public Builder removeOpenFds(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).removeOpenFds(i11);
            return this;
        }

        public Builder removeThreads(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).getMutableThreadsMap().remove(Integer.valueOf(i11));
            return this;
        }

        public Builder setAbortMessage(String str) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setAbortMessage(str);
            return this;
        }

        public Builder setAbortMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setAbortMessageBytes(byteString);
            return this;
        }

        public Builder setArch(TombstoneProtos$Architecture tombstoneProtos$Architecture) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setArch(tombstoneProtos$Architecture);
            return this;
        }

        public Builder setArchValue(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setArchValue(i11);
            return this;
        }

        public Builder setBuildFingerprint(String str) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setBuildFingerprint(str);
            return this;
        }

        public Builder setBuildFingerprintBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setBuildFingerprintBytes(byteString);
            return this;
        }

        public Builder setCauses(int i11, TombstoneProtos$Cause tombstoneProtos$Cause) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setCauses(i11, tombstoneProtos$Cause);
            return this;
        }

        public Builder setCommandLine(int i11, String str) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setCommandLine(i11, str);
            return this;
        }

        public Builder setCrashDetails(int i11, TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setCrashDetails(i11, tombstoneProtos$CrashDetail);
            return this;
        }

        public Builder setGuestArch(TombstoneProtos$Architecture tombstoneProtos$Architecture) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setGuestArch(tombstoneProtos$Architecture);
            return this;
        }

        public Builder setGuestArchValue(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setGuestArchValue(i11);
            return this;
        }

        public Builder setHasBeen16KbMode(boolean z11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setHasBeen16KbMode(z11);
            return this;
        }

        public Builder setLogBuffers(int i11, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setLogBuffers(i11, tombstoneProtos$LogBuffer);
            return this;
        }

        public Builder setMemoryMappings(int i11, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setMemoryMappings(i11, tombstoneProtos$MemoryMapping);
            return this;
        }

        public Builder setOpenFds(int i11, TombstoneProtos$FD tombstoneProtos$FD) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setOpenFds(i11, tombstoneProtos$FD);
            return this;
        }

        public Builder setPageSize(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setPageSize(i11);
            return this;
        }

        public Builder setPid(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setPid(i11);
            return this;
        }

        public Builder setProcessUptime(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setProcessUptime(i11);
            return this;
        }

        public Builder setRevision(String str) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setRevision(str);
            return this;
        }

        public Builder setRevisionBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setRevisionBytes(byteString);
            return this;
        }

        public Builder setSelinuxLabel(String str) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setSelinuxLabel(str);
            return this;
        }

        public Builder setSelinuxLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setSelinuxLabelBytes(byteString);
            return this;
        }

        public Builder setSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setSignalInfo(tombstoneProtos$Signal);
            return this;
        }

        public Builder setStackHistoryBuffer(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setStackHistoryBuffer(tombstoneProtos$StackHistoryBuffer);
            return this;
        }

        public Builder setTid(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setTid(i11);
            return this;
        }

        public Builder setTimestamp(String str) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setTimestamp(str);
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setTimestampBytes(byteString);
            return this;
        }

        public Builder setUid(int i11) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setUid(i11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$Tombstone.DEFAULT_INSTANCE);
        }

        public Builder addCauses(int i11, TombstoneProtos$Cause tombstoneProtos$Cause) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCauses(i11, tombstoneProtos$Cause);
            return this;
        }

        public Builder addCrashDetails(int i11, TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCrashDetails(i11, tombstoneProtos$CrashDetail);
            return this;
        }

        public Builder addLogBuffers(int i11, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addLogBuffers(i11, tombstoneProtos$LogBuffer);
            return this;
        }

        public Builder addMemoryMappings(int i11, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addMemoryMappings(i11, tombstoneProtos$MemoryMapping);
            return this;
        }

        public Builder addOpenFds(int i11, TombstoneProtos$FD tombstoneProtos$FD) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addOpenFds(i11, tombstoneProtos$FD);
            return this;
        }

        public Builder setCauses(int i11, TombstoneProtos$Cause.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setCauses(i11, builder.build());
            return this;
        }

        public Builder setCrashDetails(int i11, TombstoneProtos$CrashDetail.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setCrashDetails(i11, builder.build());
            return this;
        }

        public Builder setLogBuffers(int i11, TombstoneProtos$LogBuffer.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setLogBuffers(i11, builder.build());
            return this;
        }

        public Builder setMemoryMappings(int i11, TombstoneProtos$MemoryMapping.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setMemoryMappings(i11, builder.build());
            return this;
        }

        public Builder setOpenFds(int i11, TombstoneProtos$FD.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setOpenFds(i11, builder.build());
            return this;
        }

        public Builder setSignalInfo(TombstoneProtos$Signal.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setSignalInfo(builder.build());
            return this;
        }

        public Builder setStackHistoryBuffer(TombstoneProtos$StackHistoryBuffer.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).setStackHistoryBuffer(builder.build());
            return this;
        }

        public Builder addCauses(TombstoneProtos$Cause.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCauses(builder.build());
            return this;
        }

        public Builder addCrashDetails(TombstoneProtos$CrashDetail.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCrashDetails(builder.build());
            return this;
        }

        public Builder addLogBuffers(TombstoneProtos$LogBuffer.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addLogBuffers(builder.build());
            return this;
        }

        public Builder addMemoryMappings(TombstoneProtos$MemoryMapping.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addMemoryMappings(builder.build());
            return this;
        }

        public Builder addOpenFds(TombstoneProtos$FD.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addOpenFds(builder.build());
            return this;
        }

        public Builder addCauses(int i11, TombstoneProtos$Cause.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCauses(i11, builder.build());
            return this;
        }

        public Builder addCrashDetails(int i11, TombstoneProtos$CrashDetail.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addCrashDetails(i11, builder.build());
            return this;
        }

        public Builder addLogBuffers(int i11, TombstoneProtos$LogBuffer.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addLogBuffers(i11, builder.build());
            return this;
        }

        public Builder addMemoryMappings(int i11, TombstoneProtos$MemoryMapping.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addMemoryMappings(i11, builder.build());
            return this;
        }

        public Builder addOpenFds(int i11, TombstoneProtos$FD.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$Tombstone) this.instance).addOpenFds(i11, builder.build());
            return this;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final u<Integer, TombstoneProtos$Thread> f67163a = u.d(WireFormat$FieldType.UINT32, 0, WireFormat$FieldType.MESSAGE, TombstoneProtos$Thread.getDefaultInstance());
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final u<Integer, TombstoneProtos$Thread> f67164a = u.d(WireFormat$FieldType.UINT32, 0, WireFormat$FieldType.MESSAGE, TombstoneProtos$Thread.getDefaultInstance());
    }

    static {
        TombstoneProtos$Tombstone tombstoneProtos$Tombstone = new TombstoneProtos$Tombstone();
        DEFAULT_INSTANCE = tombstoneProtos$Tombstone;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Tombstone.class, tombstoneProtos$Tombstone);
    }

    private TombstoneProtos$Tombstone() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCauses(Iterable<? extends TombstoneProtos$Cause> iterable) {
        ensureCausesIsMutable();
        AbstractMessageLite.addAll(iterable, this.causes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommandLine(Iterable<String> iterable) {
        ensureCommandLineIsMutable();
        AbstractMessageLite.addAll(iterable, this.commandLine_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCrashDetails(Iterable<? extends TombstoneProtos$CrashDetail> iterable) {
        ensureCrashDetailsIsMutable();
        AbstractMessageLite.addAll(iterable, this.crashDetails_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogBuffers(Iterable<? extends TombstoneProtos$LogBuffer> iterable) {
        ensureLogBuffersIsMutable();
        AbstractMessageLite.addAll(iterable, this.logBuffers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemoryMappings(Iterable<? extends TombstoneProtos$MemoryMapping> iterable) {
        ensureMemoryMappingsIsMutable();
        AbstractMessageLite.addAll(iterable, this.memoryMappings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOpenFds(Iterable<? extends TombstoneProtos$FD> iterable) {
        ensureOpenFdsIsMutable();
        AbstractMessageLite.addAll(iterable, this.openFds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCauses(TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.add(tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandLine(String str) {
        str.getClass();
        ensureCommandLineIsMutable();
        this.commandLine_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandLineBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCommandLineIsMutable();
        this.commandLine_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrashDetails(TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        tombstoneProtos$CrashDetail.getClass();
        ensureCrashDetailsIsMutable();
        this.crashDetails_.add(tombstoneProtos$CrashDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogBuffers(TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.add(tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryMappings(TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.add(tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenFds(TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.add(tombstoneProtos$FD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbortMessage() {
        this.abortMessage_ = getDefaultInstance().getAbortMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArch() {
        this.arch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildFingerprint() {
        this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCauses() {
        this.causes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommandLine() {
        this.commandLine_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashDetails() {
        this.crashDetails_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuestArch() {
        this.guestArch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasBeen16KbMode() {
        this.hasBeen16KbMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogBuffers() {
        this.logBuffers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryMappings() {
        this.memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenFds() {
        this.openFds_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessUptime() {
        this.processUptime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = getDefaultInstance().getRevision();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelinuxLabel() {
        this.selinuxLabel_ = getDefaultInstance().getSelinuxLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignalInfo() {
        this.signalInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStackHistoryBuffer() {
        this.stackHistoryBuffer_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = getDefaultInstance().getTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = 0;
    }

    private void ensureCausesIsMutable() {
        Internal.e<TombstoneProtos$Cause> eVar = this.causes_;
        if (eVar.isModifiable()) {
            return;
        }
        this.causes_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureCommandLineIsMutable() {
        Internal.e<String> eVar = this.commandLine_;
        if (eVar.isModifiable()) {
            return;
        }
        this.commandLine_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureCrashDetailsIsMutable() {
        Internal.e<TombstoneProtos$CrashDetail> eVar = this.crashDetails_;
        if (eVar.isModifiable()) {
            return;
        }
        this.crashDetails_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureLogBuffersIsMutable() {
        Internal.e<TombstoneProtos$LogBuffer> eVar = this.logBuffers_;
        if (eVar.isModifiable()) {
            return;
        }
        this.logBuffers_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureMemoryMappingsIsMutable() {
        Internal.e<TombstoneProtos$MemoryMapping> eVar = this.memoryMappings_;
        if (eVar.isModifiable()) {
            return;
        }
        this.memoryMappings_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureOpenFdsIsMutable() {
        Internal.e<TombstoneProtos$FD> eVar = this.openFds_;
        if (eVar.isModifiable()) {
            return;
        }
        this.openFds_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static TombstoneProtos$Tombstone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, TombstoneProtos$Thread> getMutableGuestThreadsMap() {
        return internalGetMutableGuestThreads();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, TombstoneProtos$Thread> getMutableThreadsMap() {
        return internalGetMutableThreads();
    }

    private v<Integer, TombstoneProtos$Thread> internalGetGuestThreads() {
        return this.guestThreads_;
    }

    private v<Integer, TombstoneProtos$Thread> internalGetMutableGuestThreads() {
        if (!this.guestThreads_.i()) {
            this.guestThreads_ = this.guestThreads_.m();
        }
        return this.guestThreads_;
    }

    private v<Integer, TombstoneProtos$Thread> internalGetMutableThreads() {
        if (!this.threads_.i()) {
            this.threads_ = this.threads_.m();
        }
        return this.threads_;
    }

    private v<Integer, TombstoneProtos$Thread> internalGetThreads() {
        return this.threads_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
        tombstoneProtos$Signal.getClass();
        TombstoneProtos$Signal tombstoneProtos$Signal2 = this.signalInfo_;
        if (tombstoneProtos$Signal2 == null || tombstoneProtos$Signal2 == TombstoneProtos$Signal.getDefaultInstance()) {
            this.signalInfo_ = tombstoneProtos$Signal;
        } else {
            this.signalInfo_ = TombstoneProtos$Signal.newBuilder(this.signalInfo_).mergeFrom((TombstoneProtos$Signal.Builder) tombstoneProtos$Signal).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStackHistoryBuffer(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
        tombstoneProtos$StackHistoryBuffer.getClass();
        TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer2 = this.stackHistoryBuffer_;
        if (tombstoneProtos$StackHistoryBuffer2 == null || tombstoneProtos$StackHistoryBuffer2 == TombstoneProtos$StackHistoryBuffer.getDefaultInstance()) {
            this.stackHistoryBuffer_ = tombstoneProtos$StackHistoryBuffer;
        } else {
            this.stackHistoryBuffer_ = TombstoneProtos$StackHistoryBuffer.newBuilder(this.stackHistoryBuffer_).mergeFrom((TombstoneProtos$StackHistoryBuffer.Builder) tombstoneProtos$StackHistoryBuffer).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Tombstone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$Tombstone> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCauses(int i11) {
        ensureCausesIsMutable();
        this.causes_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCrashDetails(int i11) {
        ensureCrashDetailsIsMutable();
        this.crashDetails_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogBuffers(int i11) {
        ensureLogBuffersIsMutable();
        this.logBuffers_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMemoryMappings(int i11) {
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOpenFds(int i11) {
        ensureOpenFdsIsMutable();
        this.openFds_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbortMessage(String str) {
        str.getClass();
        this.abortMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbortMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.abortMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArch(TombstoneProtos$Architecture tombstoneProtos$Architecture) {
        this.arch_ = tombstoneProtos$Architecture.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchValue(int i11) {
        this.arch_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildFingerprint(String str) {
        str.getClass();
        this.buildFingerprint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildFingerprintBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buildFingerprint_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCauses(int i11, TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.set(i11, tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandLine(int i11, String str) {
        str.getClass();
        ensureCommandLineIsMutable();
        this.commandLine_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashDetails(int i11, TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        tombstoneProtos$CrashDetail.getClass();
        ensureCrashDetailsIsMutable();
        this.crashDetails_.set(i11, tombstoneProtos$CrashDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuestArch(TombstoneProtos$Architecture tombstoneProtos$Architecture) {
        this.guestArch_ = tombstoneProtos$Architecture.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuestArchValue(int i11) {
        this.guestArch_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasBeen16KbMode(boolean z11) {
        this.hasBeen16KbMode_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogBuffers(int i11, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.set(i11, tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryMappings(int i11, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.set(i11, tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenFds(int i11, TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.set(i11, tombstoneProtos$FD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i11) {
        this.pageSize_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(int i11) {
        this.pid_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessUptime(int i11) {
        this.processUptime_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(String str) {
        str.getClass();
        this.revision_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevisionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.revision_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelinuxLabel(String str) {
        str.getClass();
        this.selinuxLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelinuxLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selinuxLabel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
        tombstoneProtos$Signal.getClass();
        this.signalInfo_ = tombstoneProtos$Signal;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStackHistoryBuffer(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
        tombstoneProtos$StackHistoryBuffer.getClass();
        this.stackHistoryBuffer_ = tombstoneProtos$StackHistoryBuffer;
        this.bitField0_ |= 2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i11) {
        this.uid_ = i11;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public boolean containsGuestThreads(int i11) {
        return internalGetGuestThreads().containsKey(Integer.valueOf(i11));
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public boolean containsThreads(int i11) {
        return internalGetThreads().containsKey(Integer.valueOf(i11));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$Tombstone();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0002\u0006\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b\u0015\u001b\u0016\u000b\u0017\u0007\u0018\f\u00192\u001aဉ\u0001", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", TombstoneProtos$Cause.class, "threads_", b.f67164a, "memoryMappings_", TombstoneProtos$MemoryMapping.class, "logBuffers_", TombstoneProtos$LogBuffer.class, "openFds_", TombstoneProtos$FD.class, "processUptime_", "crashDetails_", TombstoneProtos$CrashDetail.class, "pageSize_", "hasBeen16KbMode_", "guestArch_", "guestThreads_", a.f67163a, "stackHistoryBuffer_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$Tombstone> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$Tombstone.class) {
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

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public String getAbortMessage() {
        return this.abortMessage_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public ByteString getAbortMessageBytes() {
        return ByteString.copyFromUtf8(this.abortMessage_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Architecture getArch() {
        TombstoneProtos$Architecture forNumber = TombstoneProtos$Architecture.forNumber(this.arch_);
        return forNumber == null ? TombstoneProtos$Architecture.UNRECOGNIZED : forNumber;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getArchValue() {
        return this.arch_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public String getBuildFingerprint() {
        return this.buildFingerprint_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public ByteString getBuildFingerprintBytes() {
        return ByteString.copyFromUtf8(this.buildFingerprint_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Cause getCauses(int i11) {
        return this.causes_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getCausesCount() {
        return this.causes_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public List<TombstoneProtos$Cause> getCausesList() {
        return this.causes_;
    }

    public TombstoneProtos$CauseOrBuilder getCausesOrBuilder(int i11) {
        return this.causes_.get(i11);
    }

    public List<? extends TombstoneProtos$CauseOrBuilder> getCausesOrBuilderList() {
        return this.causes_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public String getCommandLine(int i11) {
        return this.commandLine_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public ByteString getCommandLineBytes(int i11) {
        return ByteString.copyFromUtf8(this.commandLine_.get(i11));
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getCommandLineCount() {
        return this.commandLine_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public List<String> getCommandLineList() {
        return this.commandLine_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$CrashDetail getCrashDetails(int i11) {
        return this.crashDetails_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getCrashDetailsCount() {
        return this.crashDetails_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public List<TombstoneProtos$CrashDetail> getCrashDetailsList() {
        return this.crashDetails_;
    }

    public TombstoneProtos$CrashDetailOrBuilder getCrashDetailsOrBuilder(int i11) {
        return this.crashDetails_.get(i11);
    }

    public List<? extends TombstoneProtos$CrashDetailOrBuilder> getCrashDetailsOrBuilderList() {
        return this.crashDetails_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Architecture getGuestArch() {
        TombstoneProtos$Architecture forNumber = TombstoneProtos$Architecture.forNumber(this.guestArch_);
        return forNumber == null ? TombstoneProtos$Architecture.UNRECOGNIZED : forNumber;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getGuestArchValue() {
        return this.guestArch_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    @Deprecated
    public Map<Integer, TombstoneProtos$Thread> getGuestThreads() {
        return getGuestThreadsMap();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getGuestThreadsCount() {
        return internalGetGuestThreads().size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public Map<Integer, TombstoneProtos$Thread> getGuestThreadsMap() {
        return Collections.unmodifiableMap(internalGetGuestThreads());
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Thread getGuestThreadsOrDefault(int i11, TombstoneProtos$Thread tombstoneProtos$Thread) {
        v<Integer, TombstoneProtos$Thread> internalGetGuestThreads = internalGetGuestThreads();
        return internalGetGuestThreads.containsKey(Integer.valueOf(i11)) ? internalGetGuestThreads.get(Integer.valueOf(i11)) : tombstoneProtos$Thread;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Thread getGuestThreadsOrThrow(int i11) {
        v<Integer, TombstoneProtos$Thread> internalGetGuestThreads = internalGetGuestThreads();
        if (internalGetGuestThreads.containsKey(Integer.valueOf(i11))) {
            return internalGetGuestThreads.get(Integer.valueOf(i11));
        }
        throw new IllegalArgumentException();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public boolean getHasBeen16KbMode() {
        return this.hasBeen16KbMode_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$LogBuffer getLogBuffers(int i11) {
        return this.logBuffers_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getLogBuffersCount() {
        return this.logBuffers_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public List<TombstoneProtos$LogBuffer> getLogBuffersList() {
        return this.logBuffers_;
    }

    public TombstoneProtos$LogBufferOrBuilder getLogBuffersOrBuilder(int i11) {
        return this.logBuffers_.get(i11);
    }

    public List<? extends TombstoneProtos$LogBufferOrBuilder> getLogBuffersOrBuilderList() {
        return this.logBuffers_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$MemoryMapping getMemoryMappings(int i11) {
        return this.memoryMappings_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getMemoryMappingsCount() {
        return this.memoryMappings_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public List<TombstoneProtos$MemoryMapping> getMemoryMappingsList() {
        return this.memoryMappings_;
    }

    public TombstoneProtos$MemoryMappingOrBuilder getMemoryMappingsOrBuilder(int i11) {
        return this.memoryMappings_.get(i11);
    }

    public List<? extends TombstoneProtos$MemoryMappingOrBuilder> getMemoryMappingsOrBuilderList() {
        return this.memoryMappings_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$FD getOpenFds(int i11) {
        return this.openFds_.get(i11);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getOpenFdsCount() {
        return this.openFds_.size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public List<TombstoneProtos$FD> getOpenFdsList() {
        return this.openFds_;
    }

    public TombstoneProtos$FDOrBuilder getOpenFdsOrBuilder(int i11) {
        return this.openFds_.get(i11);
    }

    public List<? extends TombstoneProtos$FDOrBuilder> getOpenFdsOrBuilderList() {
        return this.openFds_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getPid() {
        return this.pid_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getProcessUptime() {
        return this.processUptime_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public String getRevision() {
        return this.revision_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public ByteString getRevisionBytes() {
        return ByteString.copyFromUtf8(this.revision_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public String getSelinuxLabel() {
        return this.selinuxLabel_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public ByteString getSelinuxLabelBytes() {
        return ByteString.copyFromUtf8(this.selinuxLabel_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Signal getSignalInfo() {
        TombstoneProtos$Signal tombstoneProtos$Signal = this.signalInfo_;
        return tombstoneProtos$Signal == null ? TombstoneProtos$Signal.getDefaultInstance() : tombstoneProtos$Signal;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$StackHistoryBuffer getStackHistoryBuffer() {
        TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer = this.stackHistoryBuffer_;
        return tombstoneProtos$StackHistoryBuffer == null ? TombstoneProtos$StackHistoryBuffer.getDefaultInstance() : tombstoneProtos$StackHistoryBuffer;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    @Deprecated
    public Map<Integer, TombstoneProtos$Thread> getThreads() {
        return getThreadsMap();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getThreadsCount() {
        return internalGetThreads().size();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public Map<Integer, TombstoneProtos$Thread> getThreadsMap() {
        return Collections.unmodifiableMap(internalGetThreads());
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Thread getThreadsOrDefault(int i11, TombstoneProtos$Thread tombstoneProtos$Thread) {
        v<Integer, TombstoneProtos$Thread> internalGetThreads = internalGetThreads();
        return internalGetThreads.containsKey(Integer.valueOf(i11)) ? internalGetThreads.get(Integer.valueOf(i11)) : tombstoneProtos$Thread;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public TombstoneProtos$Thread getThreadsOrThrow(int i11) {
        v<Integer, TombstoneProtos$Thread> internalGetThreads = internalGetThreads();
        if (internalGetThreads.containsKey(Integer.valueOf(i11))) {
            return internalGetThreads.get(Integer.valueOf(i11));
        }
        throw new IllegalArgumentException();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getTid() {
        return this.tid_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public String getTimestamp() {
        return this.timestamp_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public ByteString getTimestampBytes() {
        return ByteString.copyFromUtf8(this.timestamp_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public int getUid() {
        return this.uid_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public boolean hasSignalInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$TombstoneOrBuilder
    public boolean hasStackHistoryBuffer() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(TombstoneProtos$Tombstone tombstoneProtos$Tombstone) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Tombstone);
    }

    public static TombstoneProtos$Tombstone parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCauses(int i11, TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.add(i11, tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrashDetails(int i11, TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        tombstoneProtos$CrashDetail.getClass();
        ensureCrashDetailsIsMutable();
        this.crashDetails_.add(i11, tombstoneProtos$CrashDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogBuffers(int i11, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.add(i11, tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryMappings(int i11, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.add(i11, tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenFds(int i11, TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.add(i11, tombstoneProtos$FD);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$Tombstone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Tombstone parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$Tombstone parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$Tombstone parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
