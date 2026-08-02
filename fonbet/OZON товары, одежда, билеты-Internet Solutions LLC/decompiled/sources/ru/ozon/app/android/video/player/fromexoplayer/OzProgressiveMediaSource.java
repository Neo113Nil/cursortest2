package ru.ozon.app.android.video.player.fromexoplayer;

import F3.AbstractC2996a;
import F3.AbstractC3012q;
import F3.C2998c;
import F3.F;
import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import F3.J;
import F3.X;
import J3.h;
import J3.i;
import N3.C3662m;
import N3.H;
import N3.u;
import O7.p;
import android.net.Uri;
import android.os.Looper;
import j3.AbstractC7252H;
import j3.C7272n;
import j3.C7275q;
import m3.N;
import p3.InterfaceC8846f;
import p3.z;
import ru.ozon.app.android.video.player.fromexoplayer.OzProgressiveMediaPeriod;
import u3.P;
import w3.f;
import w3.i;
import w3.j;
import w3.k;

/* loaded from: classes7.dex */
public final class OzProgressiveMediaSource extends AbstractC2996a implements OzProgressiveMediaPeriod.Listener {
    private final int continueLoadingCheckIntervalBytes;
    private final InterfaceC8846f.a dataSourceFactory;
    private Long defaultLength;
    private final p<K3.b> downloadExecutorSupplier;
    private final j drmSessionManager;
    private Long firstChunkLength;
    private final i loadableLoadErrorHandlingPolicy;
    private C7275q mediaItem;
    private final J.a progressiveMediaExtractorFactory;
    private final C7272n singleTrackFormat;
    private final int singleTrackId;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;
    private z transferListener;

    public static final class Factory implements InterfaceC3018x.a {
        private int continueLoadingCheckIntervalBytes;
        private final InterfaceC8846f.a dataSourceFactory;
        private Long defaultLength;
        private p<K3.b> downloadExecutorSupplier;
        private k drmSessionManagerProvider;
        private Long firstChunkLength;
        private i loadErrorHandlingPolicy;
        private J.a progressiveMediaExtractorFactory;
        private C7272n singleTrackFormat;
        private int singleTrackId;

        public Factory(InterfaceC8846f.a aVar) {
            this(aVar, new C3662m());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ J lambda$new$0(u uVar, P p11) {
            return new C2998c(uVar);
        }

        public Factory setByteRange(Long l11, Long l12) {
            this.firstChunkLength = l11;
            this.defaultLength = l12;
            return this;
        }

        public Factory(InterfaceC8846f.a aVar, u uVar) {
            this(aVar, new AY.a(uVar));
        }

        @Override // F3.InterfaceC3018x.a
        public OzProgressiveMediaSource createMediaSource(C7275q c7275q) {
            c7275q.f69184b.getClass();
            return new OzProgressiveMediaSource(c7275q, this.dataSourceFactory, this.progressiveMediaExtractorFactory, this.drmSessionManagerProvider.a(c7275q), this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes, this.singleTrackId, this.singleTrackFormat, this.downloadExecutorSupplier, this.firstChunkLength, this.defaultLength, 0);
        }

        @Override // F3.InterfaceC3018x.a
        public Factory setDrmSessionManagerProvider(k kVar) {
            G10.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.drmSessionManagerProvider = kVar;
            return this;
        }

        public Factory(InterfaceC8846f.a aVar, J.a aVar2) {
            this(aVar, aVar2, new f(), new h(), 1048576);
        }

        public Factory(InterfaceC8846f.a aVar, J.a aVar2, k kVar, i iVar, int i11) {
            this.firstChunkLength = -1L;
            this.defaultLength = -1L;
            this.dataSourceFactory = aVar;
            this.progressiveMediaExtractorFactory = aVar2;
            this.drmSessionManagerProvider = kVar;
            this.loadErrorHandlingPolicy = iVar;
            this.continueLoadingCheckIntervalBytes = i11;
        }
    }

    /* synthetic */ OzProgressiveMediaSource(C7275q c7275q, InterfaceC8846f.a aVar, J.a aVar2, j jVar, i iVar, int i11, int i12, C7272n c7272n, p pVar, Long l11, Long l12, int i13) {
        this(c7275q, aVar, aVar2, jVar, iVar, i11, i12, c7272n, pVar, l11, l12);
    }

    private C7275q.f getLocalConfiguration() {
        C7275q.f fVar = getMediaItem().f69184b;
        fVar.getClass();
        return fVar;
    }

    private void notifySourceInfoRefreshed() {
        AbstractC7252H x11 = new X(this.timelineDurationUs, this.timelineIsSeekable, this.timelineIsLive, getMediaItem());
        if (this.timelineIsPlaceholder) {
            x11 = new AbstractC3012q(x11) { // from class: ru.ozon.app.android.video.player.fromexoplayer.OzProgressiveMediaSource.1
                @Override // F3.AbstractC3012q, j3.AbstractC7252H
                public AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
                    super.getPeriod(i11, bVar, z11);
                    bVar.f68942f = true;
                    return bVar;
                }

                @Override // F3.AbstractC3012q, j3.AbstractC7252H
                public AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
                    super.getWindow(i11, cVar, j11);
                    cVar.f68956k = true;
                    return cVar;
                }
            };
        }
        refreshSourceInfo(x11);
    }

    @Override // F3.InterfaceC3018x
    public InterfaceC3017w createPeriod(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        InterfaceC8846f createDataSource = this.dataSourceFactory.createDataSource();
        z zVar = this.transferListener;
        if (zVar != null) {
            createDataSource.addTransferListener(zVar);
        }
        C7275q.f localConfiguration = getLocalConfiguration();
        Uri uri = localConfiguration.f69240a;
        J a11 = this.progressiveMediaExtractorFactory.a(P.f99799d);
        j jVar = this.drmSessionManager;
        i.a createDrmEventDispatcher = createDrmEventDispatcher(bVar);
        J3.i iVar = this.loadableLoadErrorHandlingPolicy;
        F.a createEventDispatcher = createEventDispatcher(bVar);
        int i11 = this.continueLoadingCheckIntervalBytes;
        int i12 = this.singleTrackId;
        C7272n c7272n = this.singleTrackFormat;
        long Q11 = N.Q(localConfiguration.f69247h);
        p<K3.b> pVar = this.downloadExecutorSupplier;
        return new OzProgressiveMediaPeriod(uri, createDataSource, a11, jVar, createDrmEventDispatcher, iVar, createEventDispatcher, this, bVar2, localConfiguration.f69244e, i11, i12, c7272n, Q11, pVar != null ? pVar.get() : null, this.firstChunkLength.longValue(), this.defaultLength.longValue());
    }

    @Override // F3.InterfaceC3018x
    public synchronized C7275q getMediaItem() {
        return this.mediaItem;
    }

    @Override // F3.InterfaceC3018x
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // ru.ozon.app.android.video.player.fromexoplayer.OzProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long j11, H h11, boolean z11) {
        if (j11 == -9223372036854775807L) {
            j11 = this.timelineDurationUs;
        }
        boolean isSeekable = h11.isSeekable();
        if (!this.timelineIsPlaceholder && this.timelineDurationUs == j11 && this.timelineIsSeekable == isSeekable && this.timelineIsLive == z11) {
            return;
        }
        this.timelineDurationUs = j11;
        this.timelineIsSeekable = isSeekable;
        this.timelineIsLive = z11;
        this.timelineIsPlaceholder = false;
        notifySourceInfoRefreshed();
    }

    @Override // F3.AbstractC2996a
    protected void prepareSourceInternal(z zVar) {
        this.transferListener = zVar;
        j jVar = this.drmSessionManager;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        jVar.c(myLooper, getPlayerId());
        this.drmSessionManager.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // F3.InterfaceC3018x
    public void releasePeriod(InterfaceC3017w interfaceC3017w) {
        ((OzProgressiveMediaPeriod) interfaceC3017w).release();
    }

    @Override // F3.AbstractC2996a
    protected void releaseSourceInternal() {
        this.drmSessionManager.release();
    }

    @Override // F3.InterfaceC3018x
    public synchronized void updateMediaItem(C7275q c7275q) {
        this.mediaItem = c7275q;
    }

    private OzProgressiveMediaSource(C7275q c7275q, InterfaceC8846f.a aVar, J.a aVar2, j jVar, J3.i iVar, int i11, int i12, C7272n c7272n, p<K3.b> pVar, Long l11, Long l12) {
        this.mediaItem = c7275q;
        this.dataSourceFactory = aVar;
        this.progressiveMediaExtractorFactory = aVar2;
        this.drmSessionManager = jVar;
        this.loadableLoadErrorHandlingPolicy = iVar;
        this.continueLoadingCheckIntervalBytes = i11;
        this.singleTrackFormat = c7272n;
        this.singleTrackId = i12;
        this.timelineIsPlaceholder = true;
        this.timelineDurationUs = -9223372036854775807L;
        this.downloadExecutorSupplier = pVar;
        this.firstChunkLength = l11;
        this.defaultLength = l12;
    }
}
