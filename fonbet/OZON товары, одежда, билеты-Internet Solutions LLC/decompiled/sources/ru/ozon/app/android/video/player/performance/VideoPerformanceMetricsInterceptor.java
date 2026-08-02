package ru.ozon.app.android.video.player.performance;

import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/player/performance/VideoPerformanceMetricsInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "<init>", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoPerformanceMetricsInterceptor extends BXInterceptor {

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    public VideoPerformanceMetricsInterceptor(@NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        this.videoPerfMetricsManager = videoPerfMetricsManager;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        L proceed = chain.proceed(request);
        String a11 = request.j().toString();
        String d11 = request.d(FormPageDTO.Field.FIELD_TYPE_RANGE);
        if (d11 == null) {
            d11 = "";
        }
        this.videoPerfMetricsManager.extractAndPutServerTimingMetrics(new VideoAsset(a11, d11), proceed.r());
        return proceed;
    }
}
