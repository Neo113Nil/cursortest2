package ru.ozon.app.android.video.player.fromexoplayer;

import F3.C2998c;
import F3.C3013s;
import F3.F;
import F3.InterfaceC3017w;
import F3.J;
import F3.T;
import F3.U;
import F3.d0;
import I3.y;
import J3.i;
import J3.j;
import N3.A;
import N3.C3663n;
import N3.E;
import N3.G;
import N3.H;
import N3.M;
import N3.r;
import a4.C4940b;
import android.net.Uri;
import android.os.Handler;
import j3.C7253I;
import j3.C7272n;
import j3.t;
import j3.u;
import j3.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m3.C8050C;
import m3.C8067i;
import m3.N;
import m3.s;
import p3.InterfaceC8846f;
import p3.i;
import p3.x;
import ru.ozon.app.android.video.player.fromexoplayer.OzIcyDataSource;
import s3.f;
import t3.C9730B;
import t3.I;
import w3.i;

/* loaded from: classes7.dex */
final class OzProgressiveMediaPeriod implements InterfaceC3017w, r, j.a<ExtractingLoadable>, j.e, T.c {
    private static final C7272n ICY_FORMAT;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private final J3.b allocator;
    private InterfaceC3017w.a callback;
    private final long continueLoadingCheckIntervalBytes;
    private final String customCacheKey;
    private final InterfaceC8846f dataSource;
    private int dataType;
    private final long defaultChunkLength;
    private final i.a drmEventDispatcher;
    private final w3.j drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final long firstChunkLength;
    private final Handler handler;
    private boolean haveAudioVideoTracks;
    private C4940b icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final C8067i loadCondition;
    private final J3.i loadErrorHandlingPolicy;
    private final j loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final F.a mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private boolean pendingInitialDiscontinuity;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final J progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private T[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private H seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;
    private final C7272n singleTrackFormat;
    private final int singleTrackId;
    private TrackState trackState;
    private final Uri uri;

    final class ExtractingLoadable implements j.d, OzIcyDataSource.Listener {
        private final x dataSource;
        private final r extractorOutput;
        private M icyTrackOutput;
        private volatile boolean loadCanceled;
        private final C8067i loadCondition;
        private final J progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final G positionHolder = new G();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = C3013s.a();
        private p3.i dataSpec = buildDataSpec(0);

        public ExtractingLoadable(Uri uri, InterfaceC8846f interfaceC8846f, J j11, r rVar, C8067i c8067i) {
            this.uri = uri;
            this.dataSource = new x(interfaceC8846f);
            this.progressiveMediaExtractor = j11;
            this.extractorOutput = rVar;
            this.loadCondition = c8067i;
        }

        private p3.i buildDataSpec(long j11) {
            long j12 = j11 == 0 ? OzProgressiveMediaPeriod.this.firstChunkLength : OzProgressiveMediaPeriod.this.defaultChunkLength;
            i.a aVar = new i.a();
            aVar.i(this.uri);
            aVar.h(j11);
            aVar.g(j12);
            aVar.f(OzProgressiveMediaPeriod.this.customCacheKey);
            aVar.b(6);
            aVar.e(OzProgressiveMediaPeriod.ICY_METADATA_HEADERS);
            return aVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j11, long j12) {
            this.positionHolder.f18501a = j11;
            this.seekTimeUs = j12;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        @Override // J3.j.d
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // J3.j.d
        public void load() throws IOException {
            int i11 = 0;
            while (i11 == 0 && !this.loadCanceled) {
                try {
                    long j11 = this.positionHolder.f18501a;
                    p3.i buildDataSpec = buildDataSpec(j11);
                    this.dataSpec = buildDataSpec;
                    long open = this.dataSource.open(buildDataSpec);
                    if (this.loadCanceled) {
                        if (i11 != 1 && ((C2998c) this.progressiveMediaExtractor).b() != -1) {
                            this.positionHolder.f18501a = ((C2998c) this.progressiveMediaExtractor).b();
                        }
                        Hj0.T.b(this.dataSource);
                        return;
                    }
                    if (open != -1) {
                        open += j11;
                        OzProgressiveMediaPeriod.this.onLengthKnown();
                    }
                    long j12 = open;
                    OzProgressiveMediaPeriod.this.icyHeaders = C4940b.d(this.dataSource.getResponseHeaders());
                    InterfaceC8846f interfaceC8846f = this.dataSource;
                    if (OzProgressiveMediaPeriod.this.icyHeaders != null && OzProgressiveMediaPeriod.this.icyHeaders.f36259f != -1) {
                        interfaceC8846f = new OzIcyDataSource(this.dataSource, OzProgressiveMediaPeriod.this.icyHeaders.f36259f, this);
                        M icyTrack = OzProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = icyTrack;
                        icyTrack.a(OzProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    ((C2998c) this.progressiveMediaExtractor).c(interfaceC8846f, this.uri, this.dataSource.getResponseHeaders(), j11, j12, this.extractorOutput);
                    if (OzProgressiveMediaPeriod.this.icyHeaders != null) {
                        ((C2998c) this.progressiveMediaExtractor).a();
                    }
                    if (this.pendingExtractorSeek) {
                        ((C2998c) this.progressiveMediaExtractor).f(j11, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (i11 == 0 && !this.loadCanceled) {
                        try {
                            this.loadCondition.a();
                            i11 = ((C2998c) this.progressiveMediaExtractor).d(this.positionHolder);
                            long b11 = ((C2998c) this.progressiveMediaExtractor).b();
                            if (b11 > OzProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j11) {
                                this.loadCondition.e();
                                OzProgressiveMediaPeriod.this.handler.post(OzProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                                j11 = b11;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (((C2998c) this.progressiveMediaExtractor).b() != -1) {
                        this.positionHolder.f18501a = ((C2998c) this.progressiveMediaExtractor).b();
                    }
                    Hj0.T.b(this.dataSource);
                } catch (Throwable th2) {
                    if (i11 != 1 && ((C2998c) this.progressiveMediaExtractor).b() != -1) {
                        this.positionHolder.f18501a = ((C2998c) this.progressiveMediaExtractor).b();
                    }
                    Hj0.T.b(this.dataSource);
                    throw th2;
                }
            }
        }

        @Override // ru.ozon.app.android.video.player.fromexoplayer.OzIcyDataSource.Listener
        public void onIcyMetadata(C8050C c8050c) {
            long max = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(OzProgressiveMediaPeriod.o(OzProgressiveMediaPeriod.this), this.seekTimeUs);
            int a11 = c8050c.a();
            M m11 = this.icyTrackOutput;
            m11.getClass();
            m11.e(a11, c8050c);
            m11.b(max, 1, a11, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    interface Listener {
        void onSourceInfoRefreshed(long j11, H h11, boolean z11);
    }

    private final class SampleStreamImpl implements U {
        private final int track;

        public SampleStreamImpl(int i11) {
            this.track = i11;
        }

        @Override // F3.U
        public boolean isReady() {
            return OzProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // F3.U
        public void maybeThrowError() throws IOException {
            OzProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // F3.U
        public int readData(C9730B c9730b, f fVar, int i11) {
            return OzProgressiveMediaPeriod.this.readData(this.track, c9730b, fVar, i11);
        }

        @Override // F3.U
        public int skipData(long j11) {
            return OzProgressiveMediaPeriod.this.skipData(this.track, j11);
        }
    }

    private static final class TrackId {

        /* renamed from: id, reason: collision with root package name */
        public final int f94584id;
        public final boolean isIcyTrack;

        public TrackId(int i11, boolean z11) {
            this.f94584id = i11;
            this.isIcyTrack = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && TrackId.class == obj.getClass()) {
                TrackId trackId = (TrackId) obj;
                if (this.f94584id == trackId.f94584id && this.isIcyTrack == trackId.isIcyTrack) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f94584id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    private static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final d0 tracks;

        public TrackState(d0 d0Var, boolean[] zArr) {
            this.tracks = d0Var;
            this.trackIsAudioVideoFlags = zArr;
            int i11 = d0Var.f8644a;
            this.trackEnabledStates = new boolean[i11];
            this.trackNotifiedDownstreamFormats = new boolean[i11];
        }
    }

    static {
        C7272n.a aVar = new C7272n.a();
        aVar.j0("icy");
        aVar.y0("application/x-icy");
        ICY_FORMAT = aVar.P();
    }

    public OzProgressiveMediaPeriod(Uri uri, InterfaceC8846f interfaceC8846f, J j11, w3.j jVar, i.a aVar, J3.i iVar, F.a aVar2, Listener listener, J3.b bVar, String str, int i11, int i12, C7272n c7272n, long j12, K3.b bVar2, long j13, long j14) {
        this.uri = uri;
        this.dataSource = interfaceC8846f;
        this.drmSessionManager = jVar;
        this.drmEventDispatcher = aVar;
        this.loadErrorHandlingPolicy = iVar;
        this.mediaSourceEventDispatcher = aVar2;
        this.listener = listener;
        this.allocator = bVar;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i11;
        this.singleTrackId = i12;
        this.singleTrackFormat = c7272n;
        this.firstChunkLength = j13;
        this.defaultChunkLength = j14;
        this.loader = bVar2 != null ? new j(bVar2) : new j("OzProgressiveMediaPeriod");
        this.progressiveMediaExtractor = j11;
        this.singleSampleDurationUs = j12;
        this.loadCondition = new C8067i();
        this.maybeFinishPrepareRunnable = new Runnable() { // from class: ru.ozon.app.android.video.player.fromexoplayer.c
            @Override // java.lang.Runnable
            public final void run() {
                OzProgressiveMediaPeriod.this.maybeFinishPrepare();
            }
        };
        this.onContinueLoadingRequestedRunnable = new Runnable() { // from class: ru.ozon.app.android.video.player.fromexoplayer.d
            @Override // java.lang.Runnable
            public final void run() {
                OzProgressiveMediaPeriod.this.lambda$new$0();
            }
        };
        this.handler = N.p(null);
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new T[0];
        this.pendingResetPositionUs = -9223372036854775807L;
        this.dataType = 1;
    }

    private void assertPrepared() {
        G10.a.h(this.prepared);
        this.trackState.getClass();
        this.seekMap.getClass();
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i11) {
        H h11;
        if (this.isLengthKnown || !((h11 = this.seekMap) == null || h11.getDurationUs() == -9223372036854775807L)) {
            this.extractedSamplesCountAtStartOfLoad = i11;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (T t2 : this.sampleQueues) {
            t2.H(false);
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int getExtractedSamplesCount() {
        int i11 = 0;
        for (T t2 : this.sampleQueues) {
            i11 += t2.w();
        }
        return i11;
    }

    private long getLargestQueuedTimestampUs(boolean z11) {
        int i11;
        long j11 = Long.MIN_VALUE;
        while (i11 < this.sampleQueues.length) {
            if (!z11) {
                TrackState trackState = this.trackState;
                trackState.getClass();
                i11 = trackState.trackEnabledStates[i11] ? 0 : i11 + 1;
            }
            j11 = Math.max(j11, this.sampleQueues[i11].p());
        }
        return j11;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0() {
        if (this.released) {
            return;
        }
        InterfaceC3017w.a aVar = this.callback;
        aVar.getClass();
        aVar.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLengthKnown$2() {
        this.isLengthKnown = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        int i11;
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (T t2 : this.sampleQueues) {
            if (t2.v() == null) {
                return;
            }
        }
        this.loadCondition.e();
        int length = this.sampleQueues.length;
        C7253I[] c7253iArr = new C7253I[length];
        boolean[] zArr = new boolean[length];
        for (int i12 = 0; i12 < length; i12++) {
            C7272n v11 = this.sampleQueues[i12].v();
            v11.getClass();
            String str = v11.f69127o;
            boolean i13 = u.i(str);
            boolean z11 = i13 || u.l(str);
            zArr[i12] = z11;
            this.haveAudioVideoTracks = z11 | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != -9223372036854775807L && length == 1 && u.j(str);
            C4940b c4940b = this.icyHeaders;
            if (c4940b != null) {
                if (i13 || this.sampleQueueTrackIds[i12].isIcyTrack) {
                    t tVar = v11.f69124l;
                    t tVar2 = tVar == null ? new t(c4940b) : tVar.a(c4940b);
                    C7272n.a a11 = v11.a();
                    a11.r0(tVar2);
                    v11 = a11.P();
                }
                if (i13 && v11.f69120h == -1 && v11.f69121i == -1 && (i11 = c4940b.f36254a) != -1) {
                    C7272n.a a12 = v11.a();
                    a12.S(i11);
                    v11 = a12.P();
                }
            }
            C7272n b11 = v11.b(this.drmSessionManager.b(v11));
            c7253iArr[i12] = new C7253I(Integer.toString(i12), b11);
            this.pendingInitialDiscontinuity = b11.f69133u | this.pendingInitialDiscontinuity;
        }
        this.trackState = new TrackState(new d0(c7253iArr), zArr);
        if (this.isSingleSample && this.durationUs == -9223372036854775807L) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new A(this.seekMap) { // from class: ru.ozon.app.android.video.player.fromexoplayer.OzProgressiveMediaPeriod.1
                @Override // N3.A, N3.H
                public long getDurationUs() {
                    return OzProgressiveMediaPeriod.this.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap, this.isLive);
        this.prepared = true;
        InterfaceC3017w.a aVar = this.callback;
        aVar.getClass();
        aVar.e(this);
    }

    private void maybeNotifyDownstreamFormat(int i11) {
        assertPrepared();
        TrackState trackState = this.trackState;
        boolean[] zArr = trackState.trackNotifiedDownstreamFormats;
        if (zArr[i11]) {
            return;
        }
        C7272n a11 = trackState.tracks.a(i11).a(0);
        this.mediaSourceEventDispatcher.c(u.h(a11.f69127o), a11, 0, null, this.lastSeekPositionUs);
        zArr[i11] = true;
    }

    private void maybeStartDeferredRetry(int i11) {
        assertPrepared();
        if (this.pendingDeferredRetry) {
            if ((!this.haveAudioVideoTracks || this.trackState.trackIsAudioVideoFlags[i11]) && !this.sampleQueues[i11].z(false)) {
                this.pendingResetPositionUs = 0L;
                this.pendingDeferredRetry = false;
                this.notifyDiscontinuity = true;
                this.lastSeekPositionUs = 0L;
                this.extractedSamplesCountAtStartOfLoad = 0;
                for (T t2 : this.sampleQueues) {
                    t2.H(false);
                }
                InterfaceC3017w.a aVar = this.callback;
                aVar.getClass();
                aVar.c(this);
            }
        }
    }

    static /* bridge */ /* synthetic */ long o(OzProgressiveMediaPeriod ozProgressiveMediaPeriod) {
        return ozProgressiveMediaPeriod.getLargestQueuedTimestampUs(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new Runnable() { // from class: ru.ozon.app.android.video.player.fromexoplayer.a
            @Override // java.lang.Runnable
            public final void run() {
                OzProgressiveMediaPeriod.this.lambda$onLengthKnown$2();
            }
        });
    }

    private M prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (trackId.equals(this.sampleQueueTrackIds[i11])) {
                return this.sampleQueues[i11];
            }
        }
        if (this.sampleQueuesBuilt) {
            s.f("OzProgressiveMediaPrd", "Extractor added new track (id=" + trackId.f94584id + ") after finishing tracks.");
            return new C3663n();
        }
        T g10 = T.g(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        g10.M(this);
        int i12 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i12);
        trackIdArr[length] = trackId;
        int i13 = N.f74289a;
        this.sampleQueueTrackIds = trackIdArr;
        T[] tArr = (T[]) Arrays.copyOf(this.sampleQueues, i12);
        tArr[length] = g10;
        this.sampleQueues = tArr;
        return g10;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j11, boolean z11) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            T t2 = this.sampleQueues[i11];
            if (t2.s() != 0 || !z11) {
                if (!(this.isSingleSample ? t2.I(t2.o()) : t2.J(j11, this.loadingFinished)) && (zArr[i11] || !this.haveAudioVideoTracks)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void lambda$seekMap$1(H h11) {
        this.seekMap = this.icyHeaders == null ? h11 : new H.b(-9223372036854775807L);
        this.durationUs = h11.getDurationUs();
        boolean z11 = !this.isLengthKnown && h11.getDurationUs() == -9223372036854775807L;
        this.isLive = z11;
        this.dataType = z11 ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, h11, z11);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            G10.a.h(isPendingReset());
            long j11 = this.durationUs;
            if (j11 != -9223372036854775807L && this.pendingResetPositionUs > j11) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = -9223372036854775807L;
                return;
            }
            H h11 = this.seekMap;
            h11.getClass();
            extractingLoadable.setLoadPosition(h11.getSeekPoints(this.pendingResetPositionUs).f18502a.f18508b, this.pendingResetPositionUs);
            for (T t2 : this.sampleQueues) {
                t2.L(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = -9223372036854775807L;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.loader.l(extractingLoadable, this, this.loadErrorHandlingPolicy.b(this.dataType));
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // F3.V
    public boolean continueLoading(androidx.media3.exoplayer.M m11) {
        if (this.loadingFinished || this.loader.h() || this.pendingDeferredRetry) {
            return false;
        }
        if ((this.prepared || this.singleTrackFormat != null) && this.enabledTrackCount == 0) {
            return false;
        }
        boolean g10 = this.loadCondition.g();
        if (this.loader.i()) {
            return g10;
        }
        startLoading();
        return true;
    }

    @Override // F3.InterfaceC3017w
    public void discardBuffer(long j11, boolean z11) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.sampleQueues[i11].i(j11, z11, zArr[i11]);
        }
    }

    @Override // N3.r
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // F3.InterfaceC3017w
    public long getAdjustedSeekPositionUs(long j11, I i11) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        H.a seekPoints = this.seekMap.getSeekPoints(j11);
        return i11.a(j11, seekPoints.f18502a.f18507a, seekPoints.f18503b.f18507a);
    }

    @Override // F3.V
    public long getBufferedPositionUs() {
        long j11;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            j11 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                TrackState trackState = this.trackState;
                if (trackState.trackIsAudioVideoFlags[i11] && trackState.trackEnabledStates[i11] && !this.sampleQueues[i11].y()) {
                    j11 = Math.min(j11, this.sampleQueues[i11].p());
                }
            }
        } else {
            j11 = Long.MAX_VALUE;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = getLargestQueuedTimestampUs(false);
        }
        return j11 == Long.MIN_VALUE ? this.lastSeekPositionUs : j11;
    }

    @Override // F3.V
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // F3.InterfaceC3017w
    public d0 getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    M icyTrack() {
        return prepareTrackOutput(new TrackId(0, true));
    }

    @Override // F3.V
    public boolean isLoading() {
        return this.loader.i() && this.loadCondition.f();
    }

    boolean isReady(int i11) {
        return !suppressRead() && this.sampleQueues[i11].z(this.loadingFinished);
    }

    void maybeThrowError(int i11) throws IOException {
        this.sampleQueues[i11].B();
        maybeThrowError();
    }

    @Override // F3.InterfaceC3017w
    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw v.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // J3.j.e
    public void onLoaderReleased() {
        for (T t2 : this.sampleQueues) {
            t2.G();
        }
        ((C2998c) this.progressiveMediaExtractor).e();
    }

    @Override // F3.T.c
    public void onUpstreamFormatChanged(C7272n c7272n) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // F3.InterfaceC3017w
    public void prepare(InterfaceC3017w.a aVar, long j11) {
        this.callback = aVar;
        if (this.singleTrackFormat == null) {
            this.loadCondition.g();
            startLoading();
        } else {
            track(this.singleTrackId, 3).a(this.singleTrackFormat);
            lambda$seekMap$1(new E(-9223372036854775807L, new long[]{0}, new long[]{0}));
            endTracks();
            this.pendingResetPositionUs = j11;
        }
    }

    int readData(int i11, C9730B c9730b, f fVar, int i12) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i11);
        int F11 = this.sampleQueues[i11].F(c9730b, fVar, i12, this.loadingFinished);
        if (F11 == -3) {
            maybeStartDeferredRetry(i11);
        }
        return F11;
    }

    @Override // F3.InterfaceC3017w
    public long readDiscontinuity() {
        if (this.pendingInitialDiscontinuity) {
            this.pendingInitialDiscontinuity = false;
            return this.lastSeekPositionUs;
        }
        if (!this.notifyDiscontinuity) {
            return -9223372036854775807L;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return -9223372036854775807L;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    @Override // F3.V
    public void reevaluateBuffer(long j11) {
    }

    public void release() {
        if (this.prepared) {
            for (T t2 : this.sampleQueues) {
                t2.E();
            }
        }
        this.loader.k(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // N3.r
    public void seekMap(final H h11) {
        this.handler.post(new Runnable() { // from class: ru.ozon.app.android.video.player.fromexoplayer.b
            @Override // java.lang.Runnable
            public final void run() {
                OzProgressiveMediaPeriod.this.lambda$seekMap$1(h11);
            }
        });
    }

    @Override // F3.InterfaceC3017w
    public long seekToUs(long j11) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j11 = 0;
        }
        this.notifyDiscontinuity = false;
        boolean z11 = this.lastSeekPositionUs == j11;
        this.lastSeekPositionUs = j11;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j11;
            return j11;
        }
        if (this.dataType == 7 || ((!this.loadingFinished && !this.loader.i()) || !seekInsideBufferUs(zArr, j11, z11))) {
            this.pendingDeferredRetry = false;
            this.pendingResetPositionUs = j11;
            this.loadingFinished = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.i()) {
                for (T t2 : this.sampleQueues) {
                    t2.j();
                }
                this.loader.e();
                return j11;
            }
            this.loader.f();
            for (T t11 : this.sampleQueues) {
                t11.H(false);
            }
        }
        return j11;
    }

    @Override // F3.InterfaceC3017w
    public long selectTracks(y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        y yVar;
        assertPrepared();
        TrackState trackState = this.trackState;
        d0 d0Var = trackState.tracks;
        boolean[] zArr3 = trackState.trackEnabledStates;
        int i11 = this.enabledTrackCount;
        int i12 = 0;
        for (int i13 = 0; i13 < yVarArr.length; i13++) {
            U u11 = uArr[i13];
            if (u11 != null && (yVarArr[i13] == null || !zArr[i13])) {
                int i14 = ((SampleStreamImpl) u11).track;
                G10.a.h(zArr3[i14]);
                this.enabledTrackCount--;
                zArr3[i14] = false;
                uArr[i13] = null;
            }
        }
        boolean z11 = !this.seenFirstTrackSelection ? j11 == 0 || this.isSingleSample : i11 != 0;
        for (int i15 = 0; i15 < yVarArr.length; i15++) {
            if (uArr[i15] == null && (yVar = yVarArr[i15]) != null) {
                G10.a.h(yVar.length() == 1);
                G10.a.h(yVar.c(0) == 0);
                int c11 = d0Var.c(yVar.g());
                G10.a.h(!zArr3[c11]);
                this.enabledTrackCount++;
                zArr3[c11] = true;
                this.pendingInitialDiscontinuity = yVar.j().f69133u | this.pendingInitialDiscontinuity;
                uArr[i15] = new SampleStreamImpl(c11);
                zArr2[i15] = true;
                if (!z11) {
                    T t2 = this.sampleQueues[c11];
                    z11 = (t2.s() == 0 || t2.J(j11, true)) ? false : true;
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.i()) {
                T[] tArr = this.sampleQueues;
                int length = tArr.length;
                while (i12 < length) {
                    tArr[i12].j();
                    i12++;
                }
                this.loader.e();
            } else {
                this.loadingFinished = false;
                for (T t11 : this.sampleQueues) {
                    t11.H(false);
                }
            }
        } else if (z11) {
            j11 = seekToUs(j11);
            while (i12 < uArr.length) {
                if (uArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j11;
    }

    int skipData(int i11, long j11) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i11);
        T t2 = this.sampleQueues[i11];
        int u11 = t2.u(j11, this.loadingFinished);
        t2.N(u11);
        if (u11 == 0) {
            maybeStartDeferredRetry(i11);
        }
        return u11;
    }

    @Override // N3.r
    public M track(int i11, int i12) {
        return prepareTrackOutput(new TrackId(i11, false));
    }

    @Override // J3.j.a
    public void onLoadCanceled(ExtractingLoadable extractingLoadable, long j11, long j12, boolean z11) {
        x xVar = extractingLoadable.dataSource;
        p3.i iVar = extractingLoadable.dataSpec;
        xVar.getClass();
        C3013s c3013s = new C3013s(iVar, xVar.k(), j12);
        this.loadErrorHandlingPolicy.getClass();
        this.mediaSourceEventDispatcher.d(c3013s, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z11) {
            return;
        }
        for (T t2 : this.sampleQueues) {
            t2.H(false);
        }
        if (this.enabledTrackCount > 0) {
            InterfaceC3017w.a aVar = this.callback;
            aVar.getClass();
            aVar.c(this);
        }
    }

    @Override // J3.j.a
    public void onLoadCompleted(ExtractingLoadable extractingLoadable, long j11, long j12) {
        if (this.durationUs == -9223372036854775807L && this.seekMap != null) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j13 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j13;
            this.listener.onSourceInfoRefreshed(j13, this.seekMap, this.isLive);
        }
        x xVar = extractingLoadable.dataSource;
        p3.i iVar = extractingLoadable.dataSpec;
        xVar.getClass();
        C3013s c3013s = new C3013s(iVar, xVar.k(), j12);
        this.loadErrorHandlingPolicy.getClass();
        this.mediaSourceEventDispatcher.e(c3013s, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        InterfaceC3017w.a aVar = this.callback;
        aVar.getClass();
        aVar.c(this);
    }

    @Override // J3.j.a
    public j.b onLoadError(ExtractingLoadable extractingLoadable, long j11, long j12, IOException iOException, int i11) {
        ExtractingLoadable extractingLoadable2;
        j.b g10;
        x xVar = extractingLoadable.dataSource;
        p3.i iVar = extractingLoadable.dataSpec;
        xVar.getClass();
        C3013s c3013s = new C3013s(iVar, xVar.k(), j12);
        N.g0(extractingLoadable.seekTimeUs);
        N.g0(this.durationUs);
        long a11 = this.loadErrorHandlingPolicy.a(new i.c(i11, iOException));
        if (a11 == -9223372036854775807L) {
            g10 = j.f13800f;
            extractingLoadable2 = extractingLoadable;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            extractingLoadable2 = extractingLoadable;
            g10 = configureRetry(extractingLoadable2, extractedSamplesCount) ? j.g(a11, extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad) : j.f13799e;
        }
        boolean c11 = g10.c();
        this.mediaSourceEventDispatcher.f(c3013s, 1, -1, null, 0, null, extractingLoadable2.seekTimeUs, this.durationUs, iOException, !c11);
        if (!c11) {
            this.loadErrorHandlingPolicy.getClass();
        }
        return g10;
    }

    @Override // J3.j.a
    public void onLoadStarted(ExtractingLoadable extractingLoadable, long j11, long j12, int i11) {
        C3013s c3013s;
        x xVar = extractingLoadable.dataSource;
        if (i11 == 0) {
            c3013s = new C3013s(extractingLoadable.dataSpec);
        } else {
            p3.i iVar = extractingLoadable.dataSpec;
            xVar.getClass();
            c3013s = new C3013s(iVar, xVar.k(), j12);
        }
        this.mediaSourceEventDispatcher.g(c3013s, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, i11);
    }

    void maybeThrowError() throws IOException {
        this.loader.j(this.loadErrorHandlingPolicy.b(this.dataType));
    }
}
