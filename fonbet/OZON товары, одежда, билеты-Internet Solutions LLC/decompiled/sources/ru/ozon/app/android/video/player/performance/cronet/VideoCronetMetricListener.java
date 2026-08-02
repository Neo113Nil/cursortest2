package ru.ozon.app.android.video.player.performance.cronet;

import Ja.h;
import Ja.i;
import Ma.a;
import Ma.b;
import Ma.d;
import Qj0.C3883c;
import Qj0.Q;
import Qj0.U;
import Sc.InterfaceC4008j;
import Sc.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.metrics.BaseCronetMetricsListener;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000f\u0010\u001dJ)\u0010$\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/video/player/performance/cronet/VideoCronetMetricListener;", "Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/network/cronet/CronetConfig;", "cronetConfig", "<init>", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/network/cronet/CronetConfig;)V", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "videoAsset", "LJa/h;", "protocol", "", "put", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;LJa/h;)V", "LMa/a;", "putTimingMetrics", "(LMa/a;Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;)V", "putConnectionMetrics", "", "key", "", "start", "end", "putInterval", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Ljava/lang/String;JJ)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Ljava/lang/String;J)V", "LMa/b;", "metrics", "LJa/i;", "request", "LMa/d;", "response", "onMetricsCollected", "(LMa/b;LJa/i;LMa/d;)V", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingParser$delegate", "LSc/j;", "getServerTimingParser", "()Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingParser", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoCronetMetricListener extends BaseCronetMetricsListener {

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    /* renamed from: serverTimingParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j serverTimingParser;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.QUIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCronetMetricListener(@NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull CronetConfig cronetConfig) {
        super(cronetConfig.getCronetMetricsKey());
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.serverTimingParser = k.b(VideoCronetMetricListener$serverTimingParser$2.INSTANCE);
    }

    private final ServerTimingsParser getServerTimingParser() {
        return (ServerTimingsParser) this.serverTimingParser.getValue();
    }

    private final void put(VideoAsset videoAsset, h protocol) {
        double d11;
        int i11 = WhenMappings.$EnumSwitchMapping$0[protocol.ordinal()];
        if (i11 == 1) {
            d11 = 1.0d;
        } else if (i11 == 2) {
            d11 = 1.1d;
        } else if (i11 == 3) {
            d11 = 3.0d;
        } else if (i11 != 4) {
            return;
        } else {
            d11 = 2.0d;
        }
        this.videoPerfMetricsManager.handleMetricActionByUrl(videoAsset, new VideoPerfMetricAction.PutAppMetricAction("protocolVersion", Double.valueOf(d11)));
    }

    private final void putConnectionMetrics(a aVar, VideoAsset videoAsset) {
        putInterval(videoAsset, "dnsTime", aVar.d(), aVar.c());
        putInterval(videoAsset, "tlsTime", aVar.j(), aVar.i());
        putInterval(videoAsset, "tcpTime", aVar.b(), aVar.a());
    }

    private final void putInterval(VideoAsset videoAsset, String key, long start, long end) {
        this.videoPerfMetricsManager.handleMetricActionByUrl(videoAsset, new VideoPerfMetricAction.PutAppMetricAction(key, Long.valueOf(end - start)));
    }

    private final void putTimingMetrics(a aVar, VideoAsset videoAsset) {
        if (!aVar.h()) {
            putConnectionMetrics(aVar, videoAsset);
        }
        putInterval(videoAsset, "timeToFirstByte", aVar.l(), aVar.k());
        putInterval(videoAsset, "timeToLastByte", aVar.n(), aVar.m());
        putInterval(videoAsset, "serverTime", aVar.e(), aVar.g());
        putInterval(videoAsset, "responseTime", aVar.g(), aVar.f());
    }

    @Override // Ma.c
    public void onMetricsCollected(@NotNull b metrics, @NotNull i request, d response) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(request, "request");
        String k11 = request.k();
        String c11 = request.c();
        if (c11 == null) {
            c11 = "";
        }
        VideoAsset videoAsset = new VideoAsset(k11, c11);
        U beginTrace = this.performanceTrackerDelegate.beginTrace(k11);
        if (response != null) {
            Q q11 = new Q(response.f());
            int i11 = U.f23535i;
            beginTrace.n(q11, true);
            String b11 = response.b();
            if (b11 != null) {
                beginTrace.n(new C3883c(b11), true);
            }
            h d11 = response.d();
            if (d11 != null) {
                put(videoAsset, d11);
            }
            Long a11 = response.a();
            if (a11 != null) {
                put(videoAsset, "encodedSize", a11.longValue());
            }
            put(videoAsset, "transferSize", response.e());
            getServerTimingParser().e(response.c(), beginTrace);
        }
        putTimingMetrics(metrics.a(), videoAsset);
    }

    private final void put(VideoAsset videoAsset, String key, long value) {
        this.videoPerfMetricsManager.handleMetricActionByUrl(videoAsset, new VideoPerfMetricAction.PutAppMetricAction(key, Long.valueOf(value)));
    }
}
