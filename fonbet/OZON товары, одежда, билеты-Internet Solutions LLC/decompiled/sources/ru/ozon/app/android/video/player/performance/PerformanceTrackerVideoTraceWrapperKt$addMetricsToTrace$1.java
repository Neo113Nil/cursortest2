package ru.ozon.app.android.video.player.performance;

import Qj0.A0;
import Qj0.B;
import Qj0.C3882b;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.F;
import Qj0.L;
import Qj0.U;
import Qj0.t0;
import Qj0.y0;
import Qj0.z0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class PerformanceTrackerVideoTraceWrapperKt$addMetricsToTrace$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ MetricsVideoTraceEntity $metricsTraceEntity;
    final /* synthetic */ VideoTraceEntity $videoTraceEntity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceTrackerVideoTraceWrapperKt$addMetricsToTrace$1(VideoTraceEntity videoTraceEntity, MetricsVideoTraceEntity metricsVideoTraceEntity) {
        super(1);
        this.$videoTraceEntity = videoTraceEntity;
        this.$metricsTraceEntity = metricsVideoTraceEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        C3882b c3882b = new C3882b(this.$videoTraceEntity.getConnectionType());
        int i11 = U.f23535i;
        beginTrace.n(c3882b, true);
        beginTrace.n(new t0(this.$videoTraceEntity.getVideoUrl()), true);
        beginTrace.n(new B(this.$videoTraceEntity.getObjectTypes()), true);
        String widgetName = this.$videoTraceEntity.getWidgetName();
        if (widgetName != null) {
            beginTrace.n(new A0(widgetName), true);
        }
        Integer videoIndex = this.$videoTraceEntity.getVideoIndex();
        if (videoIndex != null) {
            beginTrace.n(new y0(videoIndex.intValue()), true);
        }
        String pageViewId = this.$videoTraceEntity.getPageViewId();
        if (pageViewId != null) {
            beginTrace.n(new F(pageViewId), true);
        }
        String currentPage = this.$videoTraceEntity.getCurrentPage();
        if (currentPage != null) {
            beginTrace.n(new C3884d(currentPage), true);
        }
        String currentUrl = this.$videoTraceEntity.getCurrentUrl();
        if (currentUrl != null) {
            beginTrace.n(new C3885e(currentUrl), true);
        }
        String requestId = this.$videoTraceEntity.getRequestId();
        if (requestId != null) {
            beginTrace.n(new L(requestId), true);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer otherErrorCount = this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getOtherErrorCount();
        if (otherErrorCount != null) {
            linkedHashMap.put("other", Integer.valueOf(otherErrorCount.intValue()));
        }
        Integer startupFailedCount = this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getStartupFailedCount();
        if (startupFailedCount != null) {
            linkedHashMap.put("startupFailed", Integer.valueOf(startupFailedCount.intValue()));
        }
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails errorDetails = this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getErrorDetails();
        Integer valueOf = Integer.valueOf(errorDetails.getCount());
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType fatalErrorType = errorDetails.getFatalErrorType();
        beginTrace.q(new z0(this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getIndex(), this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getStallCount(), this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getStallDuration(), this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getStartupTime(), this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getViewTime(), this.$metricsTraceEntity.getPutVideoPlaybackMetricAction().getProductType(), linkedHashMap, this.$metricsTraceEntity.getManifestsMetricsList(), this.$metricsTraceEntity.getFilesMetricsList(), new z0.a(valueOf, fatalErrorType != null ? fatalErrorType.name() : null, Boolean.valueOf(errorDetails.getIsTimeoutError()))));
    }
}
