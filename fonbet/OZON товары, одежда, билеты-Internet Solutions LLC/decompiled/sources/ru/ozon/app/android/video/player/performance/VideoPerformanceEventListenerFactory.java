package ru.ozon.app.android.video.player.performance;

import We.G;
import We.InterfaceC4865g;
import We.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.video.player.flags.CronetInPlayerEnabledFlag;
import ru.ozon.app.android.video.player.flags.LvsPerfLoadVideoTrackingEnabledFlag;
import ru.ozon.app.android.video.player.performance.cronet.VideoCronetPerformanceEventListener;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/video/player/performance/VideoPerformanceEventListenerFactory;", "LWe/v$c;", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "ozonTracker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "<init>", "(Lqj/a;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)V", "LWe/g;", "call", "LWe/v;", "create", "(LWe/g;)LWe/v;", "Lqj/a;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoPerformanceEventListenerFactory implements v.c {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private final PerformanceTrackerDelegate ozonTracker;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;
    public static final int $stable = 8;

    public VideoPerformanceEventListenerFactory(@NotNull C9067a networkInfoProvider, @NotNull PerformanceTrackerDelegate ozonTracker, @NotNull FeatureChecker featureChecker, @NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        this.networkInfoProvider = networkInfoProvider;
        this.ozonTracker = ozonTracker;
        this.featureChecker = featureChecker;
        this.videoPerfMetricsManager = videoPerfMetricsManager;
    }

    @Override // We.v.c
    @NotNull
    public v create(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        G request = call.request();
        String a11 = request.j().toString();
        String d11 = request.d(FormPageDTO.Field.FIELD_TYPE_RANGE);
        if (d11 == null) {
            d11 = "";
        }
        String str = d11;
        boolean isEnabled = this.featureChecker.isEnabled(LvsPerfLoadVideoTrackingEnabledFlag.INSTANCE);
        return (isEnabled && this.featureChecker.isEnabled(CronetInPlayerEnabledFlag.INSTANCE)) ? new VideoCronetPerformanceEventListener(this.networkInfoProvider, this.ozonTracker, a11, str, this.videoPerfMetricsManager) : isEnabled ? new VideoPerformanceEventListener(this.networkInfoProvider, this.ozonTracker, a11, str, this.videoPerfMetricsManager) : v.NONE;
    }
}
