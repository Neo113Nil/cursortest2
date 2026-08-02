package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AdvVideoBannerV2AnalyticsListenerImpl$onEvents$2 extends C7735q implements Function1<VideoBannerV2Events, Unit> {
    AdvVideoBannerV2AnalyticsListenerImpl$onEvents$2(Object obj) {
        super(1, obj, AdvVideoBannerV2AnalyticsSender.class, "sendEvent", "sendEvent(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VideoBannerV2Events videoBannerV2Events) {
        invoke2(videoBannerV2Events);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VideoBannerV2Events p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AdvVideoBannerV2AnalyticsSender) this.receiver).sendEvent(p02);
    }
}
