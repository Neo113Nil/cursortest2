package ru.ozon.app.android.video.player.performance.cronet;

import Qj0.B;
import Qj0.C3882b;
import Qj0.U;
import Qj0.t0;
import We.InterfaceC4865g;
import We.v;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u00020\"*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/video/player/performance/cronet/VideoCronetPerformanceEventListener;", "LWe/v;", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "", ImagesContract.URL, FormPageDTO.Field.FIELD_TYPE_RANGE, "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "<init>", "(Lqj/a;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)V", "", "time", "", "calculateTotalTime", "(J)V", "LWe/g;", "call", "callStart", "(LWe/g;)V", "callEnd", "Ljava/io/IOException;", "ioe", "callFailed", "(LWe/g;Ljava/io/IOException;)V", "Ljava/lang/String;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "totalTimeStart", "J", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "videoAsset", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "", "getNanoToMs", "(J)D", "nanoToMs", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoCronetPerformanceEventListener extends v {

    @NotNull
    private final String range;
    private long totalTimeStart;

    @NotNull
    private final String url;

    @NotNull
    private final VideoAsset videoAsset;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    public VideoCronetPerformanceEventListener(@NotNull C9067a networkInfoProvider, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull String url, @NotNull String range, @NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        this.url = url;
        this.range = range;
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        this.videoAsset = new VideoAsset(url, range);
        U beginTrace = performanceTrackerDelegate.beginTrace(url);
        t0 t0Var = new t0(url);
        int i11 = U.f23535i;
        beginTrace.n(t0Var, true);
        beginTrace.n(new C3882b(C9067a.g(networkInfoProvider)), true);
        beginTrace.n(new B(ObjectTypes.CUSTOM), true);
    }

    private final void calculateTotalTime(long time) {
        long j11 = this.totalTimeStart;
        if (j11 != 0) {
            this.videoPerfMetricsManager.handleMetricActionByUrl(this.videoAsset, new VideoPerfMetricAction.PutAppMetricAction("totalTime", Double.valueOf(getNanoToMs(time - j11))));
            this.totalTimeStart = 0L;
        }
    }

    private final double getNanoToMs(long j11) {
        return Math.floor(j11 / 1000000.0d);
    }

    @Override // We.v
    public void callEnd(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        calculateTotalTime(System.nanoTime());
    }

    @Override // We.v
    public void callFailed(@NotNull InterfaceC4865g call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        calculateTotalTime(System.nanoTime());
    }

    @Override // We.v
    public void callStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.totalTimeStart = System.nanoTime();
    }
}
