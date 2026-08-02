package ru.ozon.app.android.video.manager.progressiveImpl;

import F3.InterfaceC3018x;
import He.b;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p3.j;
import p3.n;
import q3.c;
import q3.i;
import q3.q;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u00132\u000e\u0010\u001e\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/video/manager/progressiveImpl/ProgressiveWithManualCacheDelegate;", "Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "Lq3/q;", "simpleCache", "Lp3/j$a;", "defaultDataSourceFactory", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "cacheTransferListener", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "", "supportByteRangeLoading", "<init>", "(Lq3/q;Lp3/j$a;Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;Lru/ozon/app/android/network/abtool/FeatureService;Z)V", "Lxe/M;", "getOrCreateScope", "()Lxe/M;", "", ImagesContract.URL, "", "cacheBytesSize", "", "startVideoCaching", "(Ljava/lang/String;J)V", "stopVideoCaching", "(Ljava/lang/String;)V", "videoUrl", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "widgetInfo", "LF3/x;", "getMediaSource", "(Ljava/lang/String;Ljava/lang/String;)LF3/x;", "Lq3/q;", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Z", "scope", "Lxe/M;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lq3/i;", "cacheWriters", "Ljava/util/concurrent/ConcurrentHashMap;", "Lq3/c$a;", "cacheDataSourceFactory", "Lq3/c$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressiveWithManualCacheDelegate implements ProgressiveExoManager {

    @NotNull
    private final c.a cacheDataSourceFactory;

    @NotNull
    private final ConcurrentHashMap<String, i> cacheWriters;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private M scope;

    @NotNull
    private final q simpleCache;
    private final boolean supportByteRangeLoading;

    @NotNull
    private final VideoDomainReplacementService videoDomainReplacementService;

    public ProgressiveWithManualCacheDelegate(@NotNull q simpleCache, @NotNull j.a defaultDataSourceFactory, @NotNull CacheTransferInfoProvider cacheTransferListener, @NotNull VideoDomainReplacementService videoDomainReplacementService, @NotNull FeatureService featureService, boolean z11) {
        Intrinsics.checkNotNullParameter(simpleCache, "simpleCache");
        Intrinsics.checkNotNullParameter(defaultDataSourceFactory, "defaultDataSourceFactory");
        Intrinsics.checkNotNullParameter(cacheTransferListener, "cacheTransferListener");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.simpleCache = simpleCache;
        this.videoDomainReplacementService = videoDomainReplacementService;
        this.featureService = featureService;
        this.supportByteRangeLoading = z11;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b.plus(X0.b()));
        this.cacheWriters = new ConcurrentHashMap<>();
        c.a aVar = new c.a();
        aVar.f(simpleCache);
        aVar.h(defaultDataSourceFactory);
        n.a aVar2 = new n.a();
        aVar2.a(cacheTransferListener);
        aVar.g(aVar2);
        this.cacheDataSourceFactory = aVar;
    }

    private final M getOrCreateScope() {
        if (!N.f(this.scope)) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.scope = N.a(b.f10879b.plus(X0.b()));
        }
        return this.scope;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManager
    public InterfaceC3018x getMediaSource(@NotNull String videoUrl, String widgetInfo) {
        InterfaceC3018x createMediaSource;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        createMediaSource = ProgressiveCacheDelegatesKt.createMediaSource(videoUrl, widgetInfo, this.supportByteRangeLoading, this.cacheDataSourceFactory, this.featureService);
        return createMediaSource;
    }

    @Override // ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void startVideoCaching(@NotNull String url, long cacheBytesSize) {
        Intrinsics.checkNotNullParameter(url, "url");
        String urlWithActualDomain = this.videoDomainReplacementService.getUrlWithActualDomain(url);
        if (this.cacheWriters.containsKey(urlWithActualDomain)) {
            return;
        }
        if (this.supportByteRangeLoading && this.simpleCache.m(cacheBytesSize, urlWithActualDomain)) {
            return;
        }
        C10727i.c(getOrCreateScope(), null, null, new ProgressiveWithManualCacheDelegate$startVideoCaching$1(this, urlWithActualDomain, cacheBytesSize, null), 3);
    }

    @Override // ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void stopVideoCaching(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String urlWithActualDomain = this.videoDomainReplacementService.getUrlWithActualDomain(url);
        i iVar = this.cacheWriters.get(urlWithActualDomain);
        if (iVar != null) {
            iVar.b();
        }
        this.cacheWriters.remove(urlWithActualDomain);
    }
}
