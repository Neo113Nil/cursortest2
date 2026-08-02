package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Long;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/VideoBannerV2Events;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$3 extends AbstractC7737t implements Function1<Long, VideoBannerV2Events> {
    final /* synthetic */ AdvVideoBannerV2AnalyticsListenerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$3(AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl) {
        super(1);
        this.this$0 = advVideoBannerV2AnalyticsListenerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final VideoBannerV2Events invoke(Long it) {
        VideoBannerV2Events castToPlayerEvent;
        Intrinsics.checkNotNullParameter(it, "it");
        castToPlayerEvent = this.this$0.castToPlayerEvent(it.longValue());
        return castToPlayerEvent;
    }
}
