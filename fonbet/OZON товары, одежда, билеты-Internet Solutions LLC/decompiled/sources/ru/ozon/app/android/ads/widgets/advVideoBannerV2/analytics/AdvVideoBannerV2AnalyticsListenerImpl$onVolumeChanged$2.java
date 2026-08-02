package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdvVideoBannerV2AnalyticsListenerImpl$onVolumeChanged$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AdvVideoBannerV2AnalyticsListenerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2AnalyticsListenerImpl$onVolumeChanged$2(AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl) {
        super(0);
        this.this$0 = advVideoBannerV2AnalyticsListenerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AdvVideoBannerV2AnalyticsSender advVideoBannerV2AnalyticsSender;
        advVideoBannerV2AnalyticsSender = this.this$0.analyticsSender;
        advVideoBannerV2AnalyticsSender.sendEvent(VideoBannerV2Events.VOLUME_ON);
    }
}
