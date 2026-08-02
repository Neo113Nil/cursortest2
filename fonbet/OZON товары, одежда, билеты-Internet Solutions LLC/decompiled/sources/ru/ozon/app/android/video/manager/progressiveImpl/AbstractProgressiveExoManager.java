package ru.ozon.app.android.video.manager.progressiveImpl;

import F3.InterfaceC3018x;
import We.E;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o3.InterfaceC8635b;
import org.jetbrains.annotations.NotNull;
import p3.j;
import q3.n;
import q3.q;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;
import ru.ozon.app.android.video.manager.Cacheable;
import ru.ozon.app.android.video.manager.ExoManagerUtilsKt;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import ru.ozon.app.android.video.player.CacheObserver;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u00112\u000e\u0010\"\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/video/manager/progressiveImpl/AbstractProgressiveExoManager;", "Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "Lru/ozon/app/android/video/manager/Cacheable;", "Landroid/content/Context;", "context", "Lo3/b;", "databaseProvider", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "cacheTransferListener", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "", "cacheDirName", "", "enableManualCaching", "supportByteRangeLoading", "<init>", "(Landroid/content/Context;Lo3/b;LWe/E;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;Ljava/lang/String;ZZ)V", ImagesContract.URL, "", "cacheBytesSize", "", "startVideoCaching", "(Ljava/lang/String;J)V", "stopVideoCaching", "(Ljava/lang/String;)V", "videoUrl", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "widgetInfo", "LF3/x;", "getMediaSource", "(Ljava/lang/String;Ljava/lang/String;)LF3/x;", "Lru/ozon/app/android/video/player/CacheObserver;", "getCacheObserver", "()Lru/ozon/app/android/video/player/CacheObserver;", "cacheObserver", "Lru/ozon/app/android/video/player/CacheObserver;", "progressiveCacheDelegate", "Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbstractProgressiveExoManager implements ProgressiveExoManager, Cacheable {

    @NotNull
    private final CacheObserver cacheObserver;

    @NotNull
    private final ProgressiveExoManager progressiveCacheDelegate;

    public AbstractProgressiveExoManager(@NotNull Context context, @NotNull InterfaceC8635b databaseProvider, @NotNull E okHttpClient, @NotNull FeatureService featureService, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull CacheTransferInfoProvider cacheTransferListener, @NotNull VideoDomainReplacementService videoDomainReplacementService, @NotNull String cacheDirName, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(cacheTransferListener, "cacheTransferListener");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        Intrinsics.checkNotNullParameter(cacheDirName, "cacheDirName");
        CacheObserver cacheObserver = new CacheObserver();
        this.cacheObserver = cacheObserver;
        q qVar = new q(new File(context.getCacheDir(), cacheDirName), new n(314572800L), databaseProvider);
        j.a aVar = new j.a(context, ExoManagerUtilsKt.getHttpDataSourceFactory(okHttpClient, featureService, videoPerfMetricsManager));
        aVar.a(cacheObserver);
        this.progressiveCacheDelegate = z11 ? new ProgressiveWithManualCacheDelegate(qVar, aVar, cacheTransferListener, videoDomainReplacementService, featureService, z12) : new ProgressiveNoManualCacheDelegate(qVar, aVar, cacheTransferListener, featureService);
    }

    @Override // ru.ozon.app.android.video.manager.Cacheable
    @NotNull
    public CacheObserver getCacheObserver() {
        return this.cacheObserver;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManager
    public InterfaceC3018x getMediaSource(@NotNull String videoUrl, String widgetInfo) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.progressiveCacheDelegate.stopVideoCaching(videoUrl);
        return this.progressiveCacheDelegate.getMediaSource(videoUrl, widgetInfo);
    }

    @Override // ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void startVideoCaching(@NotNull String url, long cacheBytesSize) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.progressiveCacheDelegate.startVideoCaching(url, cacheBytesSize);
    }

    @Override // ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void stopVideoCaching(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.progressiveCacheDelegate.stopVideoCaching(url);
    }
}
