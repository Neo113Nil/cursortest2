package ru.ozon.app.android.video.player.fromexoplayer;

import j3.C7272n;
import java.util.Collections;
import java.util.List;
import u3.InterfaceC9928b;

/* loaded from: classes7.dex */
public final class OzPlaybackStats {
    public static final OzPlaybackStats EMPTY = merge(new OzPlaybackStats[0]);
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    /* loaded from: classes2.dex */
    public static final class EventTimeAndException {
        public final InterfaceC9928b.a eventTime;
        public final Exception exception;

        public EventTimeAndException(InterfaceC9928b.a aVar, Exception exc) {
            this.eventTime = aVar;
            this.exception = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return this.exception.hashCode() + (this.eventTime.hashCode() * 31);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EventTimeAndFormat {
        public final InterfaceC9928b.a eventTime;
        public final C7272n format;

        public EventTimeAndFormat(InterfaceC9928b.a aVar, C7272n c7272n) {
            this.eventTime = aVar;
            this.format = c7272n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTimeAndFormat.class == obj.getClass()) {
                EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
                if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                    return false;
                }
                C7272n c7272n = this.format;
                C7272n c7272n2 = eventTimeAndFormat.format;
                if (c7272n != null) {
                    return c7272n.equals(c7272n2);
                }
                if (c7272n2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.eventTime.hashCode() * 31;
            C7272n c7272n = this.format;
            return hashCode + (c7272n != null ? c7272n.hashCode() : 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EventTimeAndPlaybackState {
        public final InterfaceC9928b.a eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(InterfaceC9928b.a aVar, int i11) {
            this.eventTime = aVar;
            this.playbackState = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    OzPlaybackStats(int i11, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j11, int i12, int i13, int i14, int i15, long j12, int i16, int i17, int i18, int i19, int i21, long j13, int i22, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j14, long j15, long j16, long j17, long j18, long j19, int i23, int i24, int i25, long j21, int i26, long j22, long j23, long j24, long j25, long j26, int i27, int i28, int i29, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i11;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j11;
        this.foregroundPlaybackCount = i12;
        this.abandonedBeforeReadyCount = i13;
        this.endedCount = i14;
        this.backgroundJoiningCount = i15;
        this.totalValidJoinTimeMs = j12;
        this.validJoinTimeCount = i16;
        this.totalPauseCount = i17;
        this.totalPauseBufferCount = i18;
        this.totalSeekCount = i19;
        this.totalRebufferCount = i21;
        this.maxRebufferTimeMs = j13;
        this.adPlaybackCount = i22;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j14;
        this.totalVideoFormatHeightTimeProduct = j15;
        this.totalVideoFormatBitrateTimeMs = j16;
        this.totalVideoFormatBitrateTimeProduct = j17;
        this.totalAudioFormatTimeMs = j18;
        this.totalAudioFormatBitrateTimeProduct = j19;
        this.initialVideoFormatHeightCount = i23;
        this.initialVideoFormatBitrateCount = i24;
        this.totalInitialVideoFormatHeight = i25;
        this.totalInitialVideoFormatBitrate = j21;
        this.initialAudioFormatBitrateCount = i26;
        this.totalInitialAudioFormatBitrate = j22;
        this.totalBandwidthTimeMs = j23;
        this.totalBandwidthBytes = j24;
        this.totalDroppedFrames = j25;
        this.totalAudioUnderruns = j26;
        this.fatalErrorPlaybackCount = i27;
        this.fatalErrorCount = i28;
        this.nonFatalErrorCount = i29;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public static OzPlaybackStats merge(OzPlaybackStats... ozPlaybackStatsArr) {
        OzPlaybackStats[] ozPlaybackStatsArr2 = ozPlaybackStatsArr;
        int i11 = 16;
        long[] jArr = new long[16];
        int length = ozPlaybackStatsArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j21 = 0;
        long j22 = -1;
        long j23 = -1;
        long j24 = -1;
        long j25 = -9223372036854775807L;
        int i28 = -1;
        long j26 = -9223372036854775807L;
        long j27 = -9223372036854775807L;
        int i29 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 < length) {
            long j28 = j22;
            OzPlaybackStats ozPlaybackStats = ozPlaybackStatsArr2[i29];
            i12 += ozPlaybackStats.playbackCount;
            int i33 = 0;
            while (i33 < i11) {
                jArr[i33] = jArr[i33] + ozPlaybackStats.playbackStateDurationsMs[i33];
                i33++;
                i11 = 16;
            }
            if (j26 == -9223372036854775807L) {
                j26 = ozPlaybackStats.firstReportedTimeMs;
            } else {
                long j29 = ozPlaybackStats.firstReportedTimeMs;
                if (j29 != -9223372036854775807L) {
                    j26 = Math.min(j26, j29);
                }
            }
            i13 += ozPlaybackStats.foregroundPlaybackCount;
            i31 += ozPlaybackStats.abandonedBeforeReadyCount;
            i32 += ozPlaybackStats.endedCount;
            i14 += ozPlaybackStats.backgroundJoiningCount;
            if (j27 == -9223372036854775807L) {
                j27 = ozPlaybackStats.totalValidJoinTimeMs;
            } else {
                long j31 = ozPlaybackStats.totalValidJoinTimeMs;
                if (j31 != -9223372036854775807L) {
                    j27 += j31;
                }
            }
            i15 += ozPlaybackStats.validJoinTimeCount;
            i16 += ozPlaybackStats.totalPauseCount;
            i17 += ozPlaybackStats.totalPauseBufferCount;
            i18 += ozPlaybackStats.totalSeekCount;
            i19 += ozPlaybackStats.totalRebufferCount;
            if (j25 == -9223372036854775807L) {
                j25 = ozPlaybackStats.maxRebufferTimeMs;
            } else {
                long j32 = ozPlaybackStats.maxRebufferTimeMs;
                if (j32 != -9223372036854775807L) {
                    j25 = Math.max(j25, j32);
                }
            }
            i21 += ozPlaybackStats.adPlaybackCount;
            j11 += ozPlaybackStats.totalVideoFormatHeightTimeMs;
            j12 += ozPlaybackStats.totalVideoFormatHeightTimeProduct;
            j13 += ozPlaybackStats.totalVideoFormatBitrateTimeMs;
            j14 += ozPlaybackStats.totalVideoFormatBitrateTimeProduct;
            j15 += ozPlaybackStats.totalAudioFormatTimeMs;
            j16 += ozPlaybackStats.totalAudioFormatBitrateTimeProduct;
            i22 += ozPlaybackStats.initialVideoFormatHeightCount;
            i23 += ozPlaybackStats.initialVideoFormatBitrateCount;
            if (i28 == -1) {
                i28 = ozPlaybackStats.totalInitialVideoFormatHeight;
            } else {
                int i34 = ozPlaybackStats.totalInitialVideoFormatHeight;
                if (i34 != -1) {
                    i28 += i34;
                }
            }
            if (j23 == j28) {
                j23 = ozPlaybackStats.totalInitialVideoFormatBitrate;
            } else {
                long j33 = ozPlaybackStats.totalInitialVideoFormatBitrate;
                if (j33 != j28) {
                    j23 += j33;
                }
            }
            i24 += ozPlaybackStats.initialAudioFormatBitrateCount;
            if (j24 == j28) {
                j24 = ozPlaybackStats.totalInitialAudioFormatBitrate;
            } else {
                long j34 = ozPlaybackStats.totalInitialAudioFormatBitrate;
                if (j34 != j28) {
                    j24 += j34;
                }
            }
            j17 += ozPlaybackStats.totalBandwidthTimeMs;
            j18 += ozPlaybackStats.totalBandwidthBytes;
            j19 += ozPlaybackStats.totalDroppedFrames;
            j21 += ozPlaybackStats.totalAudioUnderruns;
            i25 += ozPlaybackStats.fatalErrorPlaybackCount;
            i26 += ozPlaybackStats.fatalErrorCount;
            i27 += ozPlaybackStats.nonFatalErrorCount;
            i29++;
            ozPlaybackStatsArr2 = ozPlaybackStatsArr;
            j22 = j28;
            i11 = 16;
        }
        long j35 = j25;
        List list = Collections.EMPTY_LIST;
        return new OzPlaybackStats(i12, jArr, list, list, j26, i13, i31, i32, i14, j27, i15, i16, i17, i18, i19, j35, i21, list, list, j11, j12, j13, j14, j15, j16, i22, i23, i28, j23, i24, j24, j17, j18, j19, j21, i25, i26, i27, list, list);
    }

    public long getPlaybackStateDurationMs(int i11) {
        return this.playbackStateDurationsMs[i11];
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }
}
