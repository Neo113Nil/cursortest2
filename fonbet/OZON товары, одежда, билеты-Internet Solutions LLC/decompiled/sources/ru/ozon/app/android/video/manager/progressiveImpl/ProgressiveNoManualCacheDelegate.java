package ru.ozon.app.android.video.manager.progressiveImpl;

import F3.InterfaceC3018x;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p3.InterfaceC8846f;
import p3.j;
import p3.n;
import q3.c;
import q3.q;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\f2\u000e\u0010\u0017\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/video/manager/progressiveImpl/ProgressiveNoManualCacheDelegate;", "Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "Lq3/q;", "cache", "Lp3/j$a;", "defaultDataSourceFactory", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "cacheTransferListener", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lq3/q;Lp3/j$a;Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", ImagesContract.URL, "", "cacheBytesSize", "", "startVideoCaching", "(Ljava/lang/String;J)V", "stopVideoCaching", "(Ljava/lang/String;)V", "videoUrl", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "widgetInfo", "LF3/x;", "getMediaSource", "(Ljava/lang/String;Ljava/lang/String;)LF3/x;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lp3/f$a;", "dataSourceFactory", "Lp3/f$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressiveNoManualCacheDelegate implements ProgressiveExoManager {

    @NotNull
    private final InterfaceC8846f.a dataSourceFactory;

    @NotNull
    private final FeatureService featureService;

    public ProgressiveNoManualCacheDelegate(@NotNull q cache, @NotNull j.a defaultDataSourceFactory, @NotNull CacheTransferInfoProvider cacheTransferListener, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(defaultDataSourceFactory, "defaultDataSourceFactory");
        Intrinsics.checkNotNullParameter(cacheTransferListener, "cacheTransferListener");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
        c.a aVar = new c.a();
        aVar.f(cache);
        aVar.h(defaultDataSourceFactory);
        n.a aVar2 = new n.a();
        aVar2.a(cacheTransferListener);
        aVar.g(aVar2);
        this.dataSourceFactory = aVar;
    }

    @Override // ru.ozon.app.android.video.manager.ExoManager
    public InterfaceC3018x getMediaSource(@NotNull String videoUrl, String widgetInfo) {
        InterfaceC3018x createMediaSource;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        createMediaSource = ProgressiveCacheDelegatesKt.createMediaSource(videoUrl, widgetInfo, true, this.dataSourceFactory, this.featureService);
        return createMediaSource;
    }

    @Override // ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void startVideoCaching(@NotNull String url, long cacheBytesSize) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void stopVideoCaching(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
