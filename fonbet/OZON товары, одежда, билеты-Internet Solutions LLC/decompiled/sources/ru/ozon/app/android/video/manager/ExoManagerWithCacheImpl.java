package ru.ozon.app.android.video.manager;

import D3.a;
import D3.d;
import D3.i;
import D3.m;
import F3.InterfaceC3018x;
import I3.n;
import Sc.InterfaceC4008j;
import Sc.k;
import We.E;
import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j3.C7275q;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.N;
import o3.InterfaceC8635b;
import org.jetbrains.annotations.NotNull;
import p3.j;
import p3.n;
import p3.p;
import q3.c;
import q3.n;
import q3.q;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.logger.OzonLogger;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.download.DownloadListener;
import ru.ozon.app.android.video.download.DownloadListenersStorage;
import ru.ozon.app.android.video.player.CacheObserver;
import ru.ozon.app.android.video.player.performance.PlayerNamespaceKt;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import t3.C9740f;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u001c\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R0\u0010:\u001a\u001e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020806j\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/ozon/app/android/video/manager/ExoManagerWithCacheImpl;", "Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "Lru/ozon/app/android/video/manager/Cacheable;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lo3/b;", "databaseProvider", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "cacheTransferListener", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;Lru/ozon/app/android/network/abtool/FeatureChecker;LWe/E;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lo3/b;Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;)V", "", "videoUrl", "Lru/ozon/app/android/video/download/DownloadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "downloadVideo", "(Ljava/lang/String;Lru/ozon/app/android/video/download/DownloadListener;)V", "removeListener", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "widgetInfo", "LF3/x;", "getMediaSource", "(Ljava/lang/String;Ljava/lang/String;)LF3/x;", "Lru/ozon/app/android/video/player/CacheObserver;", "getCacheObserver", "()Lru/ozon/app/android/video/player/CacheObserver;", "Landroid/content/Context;", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "LWe/E;", "Lp3/p;", "httpDataSourceFactory$delegate", "LSc/j;", "getHttpDataSourceFactory", "()Lp3/p;", "httpDataSourceFactory", "cacheObserver", "Lru/ozon/app/android/video/player/CacheObserver;", "Lp3/j$a;", "defaultDataSourceFactory$delegate", "getDefaultDataSourceFactory", "()Lp3/j$a;", "defaultDataSourceFactory", "Lq3/c$a;", "cacheDataSourceFactory", "Lq3/c$a;", "Ljava/util/HashMap;", "Landroid/net/Uri;", "LD3/c;", "Lkotlin/collections/HashMap;", "downloads", "Ljava/util/HashMap;", "Lq3/q;", "simpleCache", "Lq3/q;", "LD3/m;", "downloadManager", "LD3/m;", "Lru/ozon/app/android/video/download/DownloadListenersStorage;", "listenersStorage", "Lru/ozon/app/android/video/download/DownloadListenersStorage;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExoManagerWithCacheImpl implements ExoManagerWithCache, Cacheable {

    @NotNull
    private final c.a cacheDataSourceFactory;

    @NotNull
    private final CacheObserver cacheObserver;

    @NotNull
    private final Context context;

    /* renamed from: defaultDataSourceFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultDataSourceFactory;

    @NotNull
    private final m downloadManager;

    @NotNull
    private final HashMap<Uri, D3.c> downloads;

    /* renamed from: httpDataSourceFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j httpDataSourceFactory;

    @NotNull
    private final DownloadListenersStorage listenersStorage;

    @NotNull
    private final E okHttpClient;

    @NotNull
    private final q simpleCache;

    @NotNull
    private final VideoDomainReplacementService videoDomainReplacementService;

    public ExoManagerWithCacheImpl(@NotNull Context context, @NotNull VideoDomainReplacementService videoDomainReplacementService, @NotNull FeatureChecker featureChecker, @NotNull E okHttpClient, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull InterfaceC8635b databaseProvider, @NotNull CacheTransferInfoProvider cacheTransferListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cacheTransferListener, "cacheTransferListener");
        this.context = context;
        this.videoDomainReplacementService = videoDomainReplacementService;
        this.okHttpClient = okHttpClient;
        this.httpDataSourceFactory = k.b(new ExoManagerWithCacheImpl$httpDataSourceFactory$2(this, featureChecker, videoPerfMetricsManager));
        this.cacheObserver = new CacheObserver();
        this.defaultDataSourceFactory = k.b(new ExoManagerWithCacheImpl$defaultDataSourceFactory$2(this));
        this.downloads = new HashMap<>();
        this.listenersStorage = new DownloadListenersStorage();
        q qVar = new q(new File(context.getFilesDir(), "media"), new n(Runtime.getRuntime().maxMemory() / 8), databaseProvider);
        this.simpleCache = qVar;
        c.a aVar = new c.a();
        aVar.f(qVar);
        aVar.h(getDefaultDataSourceFactory());
        n.a aVar2 = new n.a();
        aVar2.a(cacheTransferListener);
        aVar.g(aVar2);
        this.cacheDataSourceFactory = aVar;
        a aVar3 = new a(databaseProvider);
        this.downloadManager = new m(context, databaseProvider, qVar, getHttpDataSourceFactory(), Executors.newSingleThreadExecutor());
        try {
            d h11 = aVar3.h(new int[0]);
            while (h11.moveToNext()) {
                try {
                    D3.c V11 = h11.V();
                    Intrinsics.checkNotNullExpressionValue(V11, "getDownload(...)");
                    this.downloads.put(V11.f5620a.f5703b, V11);
                } finally {
                }
            }
            Unit unit = Unit.f71690a;
            h11.close();
        } catch (IOException e11) {
            Lm0.a.f17149a.e(e11);
        }
        this.downloadManager.d(new m.c() { // from class: ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl.3
            @Override // D3.m.c
            public void onDownloadChanged(m downloadManager, D3.c download, Exception finalException) {
                Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
                Intrinsics.checkNotNullParameter(download, "download");
                ExoManagerWithCacheImpl.this.downloads.put(download.f5620a.f5703b, download);
            }

            @Override // D3.m.c
            public void onDownloadRemoved(m downloadManager, D3.c download) {
                Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
                Intrinsics.checkNotNullParameter(download, "download");
                ExoManagerWithCacheImpl.this.downloads.remove(download.f5620a.f5703b);
            }
        });
    }

    private final j.a getDefaultDataSourceFactory() {
        return (j.a) this.defaultDataSourceFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getHttpDataSourceFactory() {
        return (p) this.httpDataSourceFactory.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl$downloadVideo$1] */
    @Override // ru.ozon.app.android.video.manager.ExoManagerWithCache
    public void downloadVideo(@NotNull String videoUrl, @NotNull final DownloadListener listener) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final String urlWithActualDomain = this.videoDomainReplacementService.getUrlWithActualDomain(videoUrl);
        final Uri parse = Uri.parse(urlWithActualDomain);
        this.listenersStorage.addListener(urlWithActualDomain, listener);
        BxLogger bxLogger = BxLogger.INSTANCE;
        OzonLogger.DefaultImpls.log$default(bxLogger, 0, null, "downloadVideo init " + listener, 3, null);
        D3.c cVar = this.downloads.get(parse);
        if ((cVar != null ? cVar.f5620a : null) != null) {
            this.listenersStorage.notifyAndRemoveListeners(urlWithActualDomain, ExoManagerWithCacheImpl$downloadVideo$2.INSTANCE);
            return;
        }
        C7275q.a aVar = new C7275q.a();
        aVar.i(parse);
        C7275q a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        HlsMediaSource createMediaSource = new HlsMediaSource.Factory(getDefaultDataSourceFactory()).createMediaSource(a11);
        Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        n.d dVar = n.d.f11899X;
        Intrinsics.checkNotNullExpressionValue(dVar, "getDefaults(...)");
        OzonLogger.DefaultImpls.log$default(bxLogger, 0, null, "DownloadHelper prepare " + listener, 3, null);
        C7275q mediaItem = createMediaSource.getMediaItem();
        C9740f c9740f = new C9740f(this.context);
        c.a aVar2 = this.cacheDataSourceFactory;
        n.d dVar2 = i.f5633p;
        i.c cVar2 = new i.c();
        cVar2.b(aVar2);
        cVar2.d(dVar);
        cVar2.c(c9740f);
        cVar2.a(mediaItem).f(new i.a() { // from class: ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl$downloadVideo$1
            @Override // D3.i.a
            public void onPrepareError(i helper, IOException e11) {
                DownloadListenersStorage downloadListenersStorage;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(e11, "e");
                downloadListenersStorage = ExoManagerWithCacheImpl.this.listenersStorage;
                downloadListenersStorage.notifyAndRemoveListeners(urlWithActualDomain, new ExoManagerWithCacheImpl$downloadVideo$1$onPrepareError$1(e11));
                helper.g();
            }

            @Override // D3.i.a
            public void onPrepared(i helper, boolean tracksInfoAvailable) {
                m mVar;
                m mVar2;
                Intrinsics.checkNotNullParameter(helper, "helper");
                D3.p e11 = helper.e(N.f74291c);
                Intrinsics.checkNotNullExpressionValue(e11, "getDownloadRequest(...)");
                mVar = ExoManagerWithCacheImpl.this.downloadManager;
                mVar.c(e11);
                mVar2 = ExoManagerWithCacheImpl.this.downloadManager;
                final Uri uri = parse;
                final DownloadListener downloadListener = listener;
                final ExoManagerWithCacheImpl exoManagerWithCacheImpl = ExoManagerWithCacheImpl.this;
                final String str = urlWithActualDomain;
                mVar2.d(new m.c() { // from class: ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1
                    @Override // D3.m.c
                    public void onDownloadChanged(m downloadManager, D3.c download, Exception finalException) {
                        DownloadListenersStorage downloadListenersStorage;
                        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
                        Intrinsics.checkNotNullParameter(download, "download");
                        Uri uri2 = download.f5620a.f5703b;
                        Intrinsics.checkNotNullExpressionValue(uri2, "uri");
                        BxLogger bxLogger2 = BxLogger.INSTANCE;
                        OzonLogger.DefaultImpls.log$default(bxLogger2, 0, null, "DownloadHelper onDownloadChanged " + uri2 + " " + uri, 3, null);
                        if (!Intrinsics.d(download.f5620a.f5703b, uri)) {
                            OzonLogger.DefaultImpls.log$default(bxLogger2, 0, null, "DownloadError", 3, null);
                            return;
                        }
                        OzonLogger.DefaultImpls.log$default(bxLogger2, 0, null, "DownloadHelper onDownloadChanged passed " + downloadListener, 3, null);
                        downloadListenersStorage = exoManagerWithCacheImpl.listenersStorage;
                        downloadListenersStorage.notifyAndRemoveListeners(str, ExoManagerWithCacheImpl$downloadVideo$1$onPrepared$1$onDownloadChanged$1.INSTANCE);
                        downloadManager.f(this);
                    }
                });
                helper.g();
            }
        });
    }

    @Override // ru.ozon.app.android.video.manager.Cacheable
    @NotNull
    public CacheObserver getCacheObserver() {
        return this.cacheObserver;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManager
    public InterfaceC3018x getMediaSource(@NotNull String videoUrl, String widgetInfo) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        D3.c cVar = this.downloads.get(Uri.parse(videoUrl));
        D3.p pVar = cVar != null ? cVar.f5620a : null;
        if (pVar == null) {
            return null;
        }
        C7275q.a aVar = new C7275q.a();
        aVar.d(pVar.f5702a);
        aVar.i(pVar.f5703b);
        aVar.b(pVar.f5707f);
        aVar.e(pVar.f5704c);
        aVar.f(pVar.f5705d);
        C7275q.a a11 = aVar.a().a();
        a11.h(PlayerNamespaceKt.mapToPlayerNamespace(widgetInfo));
        C7275q a12 = a11.a();
        Intrinsics.checkNotNullExpressionValue(a12, "build(...)");
        return new HlsMediaSource.Factory(this.cacheDataSourceFactory).createMediaSource(a12);
    }

    @Override // ru.ozon.app.android.video.manager.ExoManagerWithCache
    public void removeListener(@NotNull String videoUrl, @NotNull DownloadListener listener) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listenersStorage.removeListener(this.videoDomainReplacementService.getUrlWithActualDomain(videoUrl), listener);
    }
}
