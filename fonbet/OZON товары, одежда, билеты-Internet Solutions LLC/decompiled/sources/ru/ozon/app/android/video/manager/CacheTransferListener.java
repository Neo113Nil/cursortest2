package ru.ozon.app.android.video.manager;

import He.b;
import Je.InterfaceC3394a;
import Je.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p3.InterfaceC8846f;
import p3.i;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J%\u0010 \u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u001f2\n\u0010\u001e\u001a\u00060\u0006j\u0002`\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\t2\n\u0010\u001e\u001a\u00060\u0006j\u0002`\u001dH\u0016¢\u0006\u0004\b\"\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R.\u0010%\u001a\u001c\u0012\b\u0012\u00060\u0006j\u0002`\u001d\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u001f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/video/manager/CacheTransferListener;", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "<init>", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;)V", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "", "addUrlToCacheMap", "(Ljava/lang/String;)V", "Lxe/M;", "getOrCreateScope", "()Lxe/M;", "Lp3/f;", "source", "Lp3/i;", "dataSpec", "", "isNetwork", "onTransferInitializing", "(Lp3/f;Lp3/i;Z)V", "onTransferStart", "", "bytesTransferred", "onBytesTransferred", "(Lp3/f;Lp3/i;ZI)V", "onTransferEnd", "Lru/ozon/app/android/video/player/performance/metricsManager/BaseVideoUrl;", "baseUrl", "", "getCachedUrlsByBaseUrl", "(Ljava/lang/String;)Ljava/util/Set;", "removeCacheByBaseUrl", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "", "cacheAccessUrlsMap", "Ljava/util/Map;", "scope", "Lxe/M;", "LJe/a;", "mutex", "LJe/a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheTransferListener implements CacheTransferInfoProvider {

    @NotNull
    private final Map<String, Set<String>> cacheAccessUrlsMap;

    @NotNull
    private final InterfaceC3394a mutex;

    @NotNull
    private M scope;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    public CacheTransferListener(@NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper) {
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.cacheAccessUrlsMap = new LinkedHashMap();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b.plus(X0.b()));
        this.mutex = e.a();
    }

    private final void addUrlToCacheMap(String videoUrl) {
        C10727i.c(getOrCreateScope(), null, null, new CacheTransferListener$addUrlToCacheMap$1(this, videoUrl, null), 3);
    }

    private final M getOrCreateScope() {
        if (!N.f(this.scope)) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.scope = N.a(b.f10879b.plus(X0.b()));
        }
        return this.scope;
    }

    @Override // ru.ozon.app.android.video.manager.CacheTransferInfoProvider
    @NotNull
    public Set<String> getCachedUrlsByBaseUrl(@NotNull String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Set<String> set = this.cacheAccessUrlsMap.get(baseUrl);
        return set == null ? kotlin.collections.M.f71699a : set;
    }

    @Override // p3.z
    public void onBytesTransferred(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork, int bytesTransferred) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
    }

    @Override // p3.z
    public void onTransferEnd(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
    }

    @Override // p3.z
    public void onTransferInitializing(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork) {
        String str;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        if (isNetwork || (str = dataSpec.f80073h) == null) {
            return;
        }
        addUrlToCacheMap(str);
    }

    @Override // p3.z
    public void onTransferStart(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
    }

    @Override // ru.ozon.app.android.video.manager.CacheTransferInfoProvider
    public void removeCacheByBaseUrl(@NotNull String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.cacheAccessUrlsMap.remove(baseUrl);
    }
}
