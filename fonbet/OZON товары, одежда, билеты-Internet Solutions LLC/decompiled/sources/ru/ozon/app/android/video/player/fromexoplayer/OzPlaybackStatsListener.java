package ru.ozon.app.android.video.player.fromexoplayer;

import F3.C3013s;
import F3.C3016v;
import F3.InterfaceC3018x;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import j3.AbstractC7252H;
import j3.C7256L;
import j3.C7272n;
import j3.Q;
import j3.w;
import j3.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m3.N;
import ru.ozon.app.android.video.player.fromexoplayer.OzPlaybackStats;
import u3.InterfaceC9928b;
import u3.O;
import u3.v;

/* loaded from: classes7.dex */
public class OzPlaybackStatsListener implements InterfaceC9928b, O.a {
    private C7272n audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;
    private long discontinuityFromPositionMs;
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private final boolean keepHistory;
    private Exception nonFatalException;
    private C7272n videoFormat;
    private Boolean allowToMergeHistory = Boolean.TRUE;
    private O sessionManager = new v();
    private Map<String, OzPlaybackStatsTracker> OzPlaybackStatsTrackers = new HashMap();
    private Map<String, InterfaceC9928b.a> sessionStartEventTimes = new HashMap();
    private OzPlaybackStats finishedOzPlaybackStats = OzPlaybackStats.EMPTY;
    private AbstractC7252H.b period = new AbstractC7252H.b();
    private Q videoSize = Q.f69042d;

    /* loaded from: classes2.dex */
    public interface Callback {
    }

    private static final class OzPlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final List<OzPlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;
        private C7272n currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;
        private C7272n currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final List<OzPlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final List<OzPlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final List<OzPlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final List<OzPlaybackStats.EventTimeAndFormat> videoFormatHistory;

        public OzPlaybackStatsTracker(boolean z11, InterfaceC9928b.a aVar) {
            this.keepHistory = z11;
            this.playbackStateHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.mediaTimeHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.videoFormatHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.audioFormatHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.fatalErrorHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.nonFatalErrorHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            boolean z12 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = aVar.f99804a;
            this.firstReportedTimeMs = -9223372036854775807L;
            this.maxRebufferTimeMs = -9223372036854775807L;
            InterfaceC3018x.b bVar = aVar.f99807d;
            if (bVar != null && bVar.b()) {
                z12 = true;
            }
            this.isAd = z12;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j11) {
            List<long[]> list = this.mediaTimeHistory;
            return new long[]{j11, list.get(list.size() - 1)[1] + ((long) ((j11 - r0[0]) * this.currentPlaybackSpeed))};
        }

        private static boolean isInvalidJoinTransition(int i11, int i12) {
            return ((i11 != 1 && i11 != 2 && i11 != 14) || i12 == 1 || i12 == 2 || i12 == 14 || i12 == 3 || i12 == 4 || i12 == 9 || i12 == 11) ? false : true;
        }

        private static boolean isPausedState(int i11) {
            return i11 == 4 || i11 == 7;
        }

        private static boolean isReadyState(int i11) {
            return i11 == 3 || i11 == 4 || i11 == 9;
        }

        private static boolean isRebufferingState(int i11) {
            return i11 == 6 || i11 == 7 || i11 == 10;
        }

        private void maybeRecordAudioFormatTime(long j11) {
            C7272n c7272n;
            int i11;
            if (this.currentPlaybackState == 3 && (c7272n = this.currentAudioFormat) != null && (i11 = c7272n.f69122j) != -1) {
                long j12 = (long) ((j11 - this.lastAudioFormatStartTimeMs) * this.currentPlaybackSpeed);
                this.audioFormatTimeMs += j12;
                this.audioFormatBitrateTimeProduct = (j12 * i11) + this.audioFormatBitrateTimeProduct;
            }
            this.lastAudioFormatStartTimeMs = j11;
        }

        private void maybeRecordVideoFormatTime(long j11) {
            C7272n c7272n;
            if (this.currentPlaybackState == 3 && (c7272n = this.currentVideoFormat) != null) {
                long j12 = (long) ((j11 - this.lastVideoFormatStartTimeMs) * this.currentPlaybackSpeed);
                int i11 = c7272n.f69135w;
                if (i11 != -1) {
                    this.videoFormatHeightTimeMs += j12;
                    this.videoFormatHeightTimeProduct = (i11 * j12) + this.videoFormatHeightTimeProduct;
                }
                int i12 = c7272n.f69122j;
                if (i12 != -1) {
                    this.videoFormatBitrateTimeMs += j12;
                    this.videoFormatBitrateTimeProduct = (j12 * i12) + this.videoFormatBitrateTimeProduct;
                }
            }
            this.lastVideoFormatStartTimeMs = j11;
        }

        private void maybeUpdateAudioFormat(InterfaceC9928b.a aVar, C7272n c7272n) {
            int i11;
            if (Objects.equals(this.currentAudioFormat, c7272n)) {
                return;
            }
            maybeRecordAudioFormatTime(aVar.f99804a);
            if (c7272n != null && this.initialAudioFormatBitrate == -1 && (i11 = c7272n.f69122j) != -1) {
                this.initialAudioFormatBitrate = i11;
            }
            this.currentAudioFormat = c7272n;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new OzPlaybackStats.EventTimeAndFormat(aVar, c7272n));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j11) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j12 = j11 - this.lastRebufferStartTimeMs;
                long j13 = this.maxRebufferTimeMs;
                if (j13 == -9223372036854775807L || j12 > j13) {
                    this.maxRebufferTimeMs = j12;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j11, long j12) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j12 == -9223372036854775807L) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        List<long[]> list = this.mediaTimeHistory;
                        long j13 = list.get(list.size() - 1)[1];
                        if (j13 != j12) {
                            this.mediaTimeHistory.add(new long[]{j11, j13});
                        }
                    }
                }
                if (j12 != -9223372036854775807L) {
                    this.mediaTimeHistory.add(new long[]{j11, j12});
                } else {
                    if (this.mediaTimeHistory.isEmpty()) {
                        return;
                    }
                    this.mediaTimeHistory.add(guessMediaTimeBasedOnElapsedRealtime(j11));
                }
            }
        }

        private void maybeUpdateVideoFormat(InterfaceC9928b.a aVar, C7272n c7272n) {
            int i11;
            int i12;
            if (Objects.equals(this.currentVideoFormat, c7272n)) {
                return;
            }
            maybeRecordVideoFormatTime(aVar.f99804a);
            if (c7272n != null) {
                if (this.initialVideoFormatHeight == -1 && (i12 = c7272n.f69135w) != -1) {
                    this.initialVideoFormatHeight = i12;
                }
                if (this.initialVideoFormatBitrate == -1 && (i11 = c7272n.f69122j) != -1) {
                    this.initialVideoFormatBitrate = i11;
                }
            }
            this.currentVideoFormat = c7272n;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new OzPlaybackStats.EventTimeAndFormat(aVar, c7272n));
            }
        }

        private int resolveNewPlaybackState(y yVar) {
            int P11 = yVar.P();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (!this.isForeground) {
                return this.startedLoading ? 1 : 0;
            }
            if (this.isInterruptedByAd) {
                return 14;
            }
            if (P11 == 4) {
                return 11;
            }
            if (P11 != 2) {
                if (P11 == 3) {
                    if (yVar.n()) {
                        return yVar.F() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (P11 != 1 || this.currentPlaybackState == 0) {
                    return this.currentPlaybackState;
                }
                return 12;
            }
            int i11 = this.currentPlaybackState;
            if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 14) {
                return 2;
            }
            if (yVar.n()) {
                return yVar.F() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void updatePlaybackState(int i11, InterfaceC9928b.a aVar) {
            G10.a.c(aVar.f99804a >= this.currentPlaybackStateStartTimeMs);
            long j11 = this.currentPlaybackStateStartTimeMs;
            long j12 = aVar.f99804a;
            long[] jArr = this.playbackStateDurationsMs;
            int i12 = this.currentPlaybackState;
            jArr[i12] = jArr[i12] + (j12 - j11);
            if (this.firstReportedTimeMs == -9223372036854775807L) {
                this.firstReportedTimeMs = j12;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(i12, i11);
            this.hasBeenReady |= isReadyState(i11);
            this.hasEnded |= i11 == 11;
            if (!isPausedState(this.currentPlaybackState) && isPausedState(i11)) {
                this.pauseCount++;
            }
            if (i11 == 5) {
                this.seekCount++;
            }
            if (!isRebufferingState(this.currentPlaybackState) && isRebufferingState(i11)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = j12;
            }
            if (isRebufferingState(this.currentPlaybackState) && this.currentPlaybackState != 7 && i11 == 7) {
                this.pauseBufferCount++;
            }
            maybeUpdateMaxRebufferTimeMs(j12);
            this.currentPlaybackState = i11;
            this.currentPlaybackStateStartTimeMs = j12;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new OzPlaybackStats.EventTimeAndPlaybackState(aVar, i11));
            }
        }

        public OzPlaybackStats build(boolean z11) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.playbackStateDurationsMs;
            List<long[]> list2 = this.mediaTimeHistory;
            if (z11) {
                jArr = jArr2;
                list = list2;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long[] copyOf = Arrays.copyOf(this.playbackStateDurationsMs, 16);
                long max = Math.max(0L, elapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i11 = this.currentPlaybackState;
                copyOf[i11] = copyOf[i11] + max;
                maybeUpdateMaxRebufferTimeMs(elapsedRealtime);
                maybeRecordVideoFormatTime(elapsedRealtime);
                maybeRecordAudioFormatTime(elapsedRealtime);
                ArrayList arrayList = new ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(elapsedRealtime));
                }
                jArr = copyOf;
                list = arrayList;
            }
            int i12 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j11 = i12 != 0 ? -9223372036854775807L : jArr[2];
            int i13 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z11 ? this.videoFormatHistory : new ArrayList(this.videoFormatHistory);
            List arrayList3 = z11 ? this.audioFormatHistory : new ArrayList(this.audioFormatHistory);
            List arrayList4 = z11 ? this.playbackStateHistory : new ArrayList(this.playbackStateHistory);
            long j12 = this.firstReportedTimeMs;
            boolean z12 = this.isForeground;
            int i14 = !this.hasBeenReady ? 1 : 0;
            boolean z13 = this.hasEnded;
            int i15 = i12 ^ 1;
            int i16 = this.pauseCount;
            int i17 = this.pauseBufferCount;
            int i18 = this.seekCount;
            int i19 = this.rebufferCount;
            long j13 = this.maxRebufferTimeMs;
            boolean z14 = this.isAd;
            long j14 = this.videoFormatHeightTimeMs;
            long j15 = this.videoFormatHeightTimeProduct;
            long j16 = this.videoFormatBitrateTimeMs;
            long j17 = this.videoFormatBitrateTimeProduct;
            long j18 = this.audioFormatTimeMs;
            long j19 = this.audioFormatBitrateTimeProduct;
            int i21 = this.initialVideoFormatHeight;
            int i22 = i21 == -1 ? 0 : 1;
            long j21 = this.initialVideoFormatBitrate;
            int i23 = j21 == -1 ? 0 : 1;
            long j22 = this.initialAudioFormatBitrate;
            int i24 = j22 == -1 ? 0 : 1;
            long j23 = this.bandwidthTimeMs;
            long j24 = this.bandwidthBytes;
            long j25 = this.droppedFrames;
            long j26 = this.audioUnderruns;
            int i25 = this.fatalErrorCount;
            return new OzPlaybackStats(1, jArr, arrayList4, list, j12, z12 ? 1 : 0, i14, z13 ? 1 : 0, i13, j11, i15, i16, i17, i18, i19, j13, z14 ? 1 : 0, arrayList2, arrayList3, j14, j15, j16, j17, j18, j19, i22, i23, i21, j21, i24, j22, j23, j24, j25, j26, i25 > 0 ? 1 : 0, i25, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        public void onEvents(y yVar, InterfaceC9928b.a aVar, boolean z11, long j11, boolean z12, int i11, boolean z13, boolean z14, w wVar, Exception exc, long j12, long j13, C7272n c7272n, C7272n c7272n2, Q q11) {
            if (j11 != -9223372036854775807L) {
                maybeUpdateMediaTimeHistory(aVar.f99804a, j11);
                this.isSeeking = true;
            }
            if (yVar.P() != 2) {
                this.isSeeking = false;
            }
            int P11 = yVar.P();
            if (P11 == 1 || P11 == 4 || z12) {
                this.isInterruptedByAd = false;
            }
            if (wVar != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new OzPlaybackStats.EventTimeAndException(aVar, wVar));
                }
            } else if (yVar.a() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                C7256L i12 = yVar.i();
                if (!i12.c(2)) {
                    maybeUpdateVideoFormat(aVar, null);
                }
                if (!i12.c(1)) {
                    maybeUpdateAudioFormat(aVar, null);
                }
            }
            if (c7272n != null) {
                maybeUpdateVideoFormat(aVar, c7272n);
            }
            if (c7272n2 != null) {
                maybeUpdateAudioFormat(aVar, c7272n2);
            }
            C7272n c7272n3 = this.currentVideoFormat;
            if (c7272n3 != null && c7272n3.f69135w == -1 && q11 != null) {
                C7272n.a a11 = c7272n3.a();
                a11.F0(q11.f69043a);
                a11.h0(q11.f69044b);
                maybeUpdateVideoFormat(aVar, a11.P());
            }
            if (z14) {
                this.startedLoading = true;
            }
            if (z13) {
                this.audioUnderruns++;
            }
            this.droppedFrames += i11;
            this.bandwidthTimeMs += j12;
            this.bandwidthBytes += j13;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new OzPlaybackStats.EventTimeAndException(aVar, exc));
                }
            }
            int resolveNewPlaybackState = resolveNewPlaybackState(yVar);
            float f7 = yVar.d().f69345a;
            if (this.currentPlaybackState != resolveNewPlaybackState || this.currentPlaybackSpeed != f7) {
                maybeUpdateMediaTimeHistory(aVar.f99804a, z11 ? aVar.f99808e : -9223372036854775807L);
                long j14 = aVar.f99804a;
                maybeRecordVideoFormatTime(j14);
                maybeRecordAudioFormatTime(j14);
            }
            this.currentPlaybackSpeed = f7;
            if (this.currentPlaybackState != resolveNewPlaybackState) {
                updatePlaybackState(resolveNewPlaybackState, aVar);
            }
        }

        public void onFinished(InterfaceC9928b.a aVar, boolean z11, long j11) {
            int i11 = 11;
            if (this.currentPlaybackState != 11 && !z11) {
                i11 = 15;
            }
            maybeUpdateMediaTimeHistory(aVar.f99804a, j11);
            long j12 = aVar.f99804a;
            maybeRecordVideoFormatTime(j12);
            maybeRecordAudioFormatTime(j12);
            updatePlaybackState(i11, aVar);
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }
    }

    public OzPlaybackStatsListener(boolean z11, Callback callback) {
        this.keepHistory = z11;
        ((v) this.sessionManager).l(this);
    }

    private Pair<InterfaceC9928b.a, Boolean> findBestEventTime(InterfaceC9928b.C2198b c2198b, String str) {
        InterfaceC3018x.b bVar;
        InterfaceC9928b.a aVar = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < c2198b.d(); i11++) {
            InterfaceC9928b.a c11 = c2198b.c(c2198b.b(i11));
            boolean e11 = ((v) this.sessionManager).e(c11, str);
            if (aVar == null || ((e11 && !z11) || (e11 == z11 && c11.f99804a > aVar.f99804a))) {
                aVar = c11;
                z11 = e11;
            }
        }
        aVar.getClass();
        if (!z11 && (bVar = aVar.f99807d) != null && bVar.b()) {
            AbstractC7252H.b bVar2 = this.period;
            AbstractC7252H abstractC7252H = aVar.f99805b;
            Object obj = bVar.f8751a;
            AbstractC7252H.b periodByUid = abstractC7252H.getPeriodByUid(obj, bVar2);
            int i12 = bVar.f8752b;
            periodByUid.d(i12);
            long j11 = this.period.f68941e;
            InterfaceC3018x.b bVar3 = new InterfaceC3018x.b(bVar.f8754d, obj, i12);
            long g02 = N.g0(j11);
            int i13 = aVar.f99810g;
            InterfaceC3018x.b bVar4 = aVar.f99811h;
            long j12 = aVar.f99804a;
            AbstractC7252H abstractC7252H2 = aVar.f99805b;
            InterfaceC9928b.a aVar2 = new InterfaceC9928b.a(j12, abstractC7252H2, aVar.f99806c, bVar3, g02, abstractC7252H2, i13, bVar4, aVar.f99812i, aVar.f99813j);
            z11 = ((v) this.sessionManager).e(aVar2, str);
            aVar = aVar2;
        }
        return Pair.create(aVar, Boolean.valueOf(z11));
    }

    private boolean hasEvent(InterfaceC9928b.C2198b c2198b, String str, int i11) {
        if (c2198b.a(i11)) {
            return ((v) this.sessionManager).e(c2198b.c(i11), str);
        }
        return false;
    }

    private void maybeAddSessions(InterfaceC9928b.C2198b c2198b) {
        for (int i11 = 0; i11 < c2198b.d(); i11++) {
            int b11 = c2198b.b(i11);
            InterfaceC9928b.a c11 = c2198b.c(b11);
            if (b11 == 0) {
                ((v) this.sessionManager).p(c11);
            } else if (b11 == 11) {
                ((v) this.sessionManager).o(c11, this.discontinuityReason);
            } else {
                ((v) this.sessionManager).n(c11);
            }
        }
    }

    public void deleteHistoryStats() {
        this.finishedOzPlaybackStats = OzPlaybackStats.EMPTY;
    }

    public OzPlaybackStats getCombinedOzPlaybackStats() {
        int i11 = 1;
        OzPlaybackStats[] ozPlaybackStatsArr = new OzPlaybackStats[this.OzPlaybackStatsTrackers.size() + 1];
        ozPlaybackStatsArr[0] = this.finishedOzPlaybackStats;
        Iterator<OzPlaybackStatsTracker> it = this.OzPlaybackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            ozPlaybackStatsArr[i11] = it.next().build(false);
            i11++;
        }
        return OzPlaybackStats.merge(ozPlaybackStatsArr);
    }

    @Override // u3.O.a
    public void onAdPlaybackStarted(InterfaceC9928b.a aVar, String str, String str2) {
        OzPlaybackStatsTracker ozPlaybackStatsTracker = this.OzPlaybackStatsTrackers.get(str);
        ozPlaybackStatsTracker.getClass();
        ozPlaybackStatsTracker.onInterruptedByAd();
    }

    public void onAllowToMergeHistoryChanged(Boolean bool) {
        this.allowToMergeHistory = bool;
    }

    @Override // u3.InterfaceC9928b
    public void onBandwidthEstimate(InterfaceC9928b.a aVar, int i11, long j11, long j12) {
        this.bandwidthTimeMs = i11;
        this.bandwidthBytes = j11;
    }

    @Override // u3.InterfaceC9928b
    public void onDownstreamFormatChanged(InterfaceC9928b.a aVar, C3016v c3016v) {
        int i11 = c3016v.f8745b;
        C7272n c7272n = c3016v.f8746c;
        if (i11 == 2 || i11 == 0) {
            this.videoFormat = c7272n;
        } else if (i11 == 1) {
            this.audioFormat = c7272n;
        }
    }

    @Override // u3.InterfaceC9928b
    public void onDrmSessionManagerError(InterfaceC9928b.a aVar, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // u3.InterfaceC9928b
    public void onDroppedVideoFrames(InterfaceC9928b.a aVar, int i11, long j11) {
        this.droppedFrames = i11;
    }

    @Override // u3.InterfaceC9928b
    public void onEvents(y yVar, InterfaceC9928b.C2198b c2198b) {
        if (c2198b.d() == 0) {
            return;
        }
        maybeAddSessions(c2198b);
        Iterator<String> it = this.OzPlaybackStatsTrackers.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Pair<InterfaceC9928b.a, Boolean> findBestEventTime = findBestEventTime(c2198b, next);
            OzPlaybackStatsTracker ozPlaybackStatsTracker = this.OzPlaybackStatsTrackers.get(next);
            boolean hasEvent = hasEvent(c2198b, next, 11);
            boolean hasEvent2 = hasEvent(c2198b, next, 1018);
            boolean hasEvent3 = hasEvent(c2198b, next, 1011);
            boolean hasEvent4 = hasEvent(c2198b, next, 1000);
            boolean hasEvent5 = hasEvent(c2198b, next, 10);
            boolean z11 = hasEvent(c2198b, next, 1003) || hasEvent(c2198b, next, UserVerificationMethods.USER_VERIFY_ALL);
            boolean hasEvent6 = hasEvent(c2198b, next, 1006);
            boolean hasEvent7 = hasEvent(c2198b, next, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            boolean hasEvent8 = hasEvent(c2198b, next, 25);
            Iterator<String> it2 = it;
            ozPlaybackStatsTracker.onEvents(yVar, (InterfaceC9928b.a) findBestEventTime.first, ((Boolean) findBestEventTime.second).booleanValue(), next.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L, hasEvent, hasEvent2 ? this.droppedFrames : 0, hasEvent3, hasEvent4, hasEvent5 ? yVar.a() : null, z11 ? this.nonFatalException : null, hasEvent6 ? this.bandwidthTimeMs : 0L, hasEvent6 ? this.bandwidthBytes : 0L, hasEvent7 ? this.videoFormat : null, hasEvent7 ? this.audioFormat : null, hasEvent8 ? this.videoSize : null);
            it = it2;
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (c2198b.a(1028)) {
            ((v) this.sessionManager).g(c2198b.c(1028));
        }
    }

    @Override // u3.InterfaceC9928b
    public void onLoadError(InterfaceC9928b.a aVar, C3013s c3013s, C3016v c3016v, IOException iOException, boolean z11) {
        this.nonFatalException = iOException;
    }

    @Override // u3.InterfaceC9928b
    public void onPositionDiscontinuity(InterfaceC9928b.a aVar, y.d dVar, y.d dVar2, int i11) {
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = ((v) this.sessionManager).h();
            this.discontinuityFromPositionMs = dVar.f69356f;
        }
        this.discontinuityReason = i11;
    }

    @Override // u3.O.a
    public void onSessionActive(InterfaceC9928b.a aVar, String str) {
        OzPlaybackStatsTracker ozPlaybackStatsTracker = this.OzPlaybackStatsTrackers.get(str);
        ozPlaybackStatsTracker.getClass();
        ozPlaybackStatsTracker.onForeground();
    }

    @Override // u3.O.a
    public void onSessionCreated(InterfaceC9928b.a aVar, String str) {
        this.OzPlaybackStatsTrackers.put(str, new OzPlaybackStatsTracker(this.keepHistory, aVar));
        this.sessionStartEventTimes.put(str, aVar);
    }

    @Override // u3.O.a
    public void onSessionFinished(InterfaceC9928b.a aVar, String str, boolean z11) {
        OzPlaybackStatsTracker remove = this.OzPlaybackStatsTrackers.remove(str);
        remove.getClass();
        this.sessionStartEventTimes.remove(str).getClass();
        remove.onFinished(aVar, z11, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L);
        OzPlaybackStats build = remove.build(true);
        if (this.allowToMergeHistory.booleanValue()) {
            this.finishedOzPlaybackStats = OzPlaybackStats.merge(this.finishedOzPlaybackStats, build);
        }
    }

    @Override // u3.InterfaceC9928b
    public void onVideoSizeChanged(InterfaceC9928b.a aVar, Q q11) {
        this.videoSize = q11;
    }

    public void reset() {
        this.sessionManager = new v();
        this.OzPlaybackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedOzPlaybackStats = OzPlaybackStats.EMPTY;
        this.period = new AbstractC7252H.b();
        this.videoSize = Q.f69042d;
        ((v) this.sessionManager).l(this);
    }
}
