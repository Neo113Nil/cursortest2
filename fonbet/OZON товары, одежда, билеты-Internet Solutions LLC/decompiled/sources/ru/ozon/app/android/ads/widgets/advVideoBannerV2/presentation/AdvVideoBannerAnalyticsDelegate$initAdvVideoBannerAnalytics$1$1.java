package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerAnalyticsDelegate$initAdvVideoBannerAnalytics$1$1 extends AbstractC7737t implements Function1<Pixel, Unit> {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ AdvVideoBannerAnalyticsDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerAnalyticsDelegate$initAdvVideoBannerAnalytics$1$1(AdvVideoBannerAnalyticsDelegate advVideoBannerAnalyticsDelegate, M m11) {
        super(1);
        this.this$0 = advVideoBannerAnalyticsDelegate;
        this.$coroutineScope = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pixel pixel) {
        invoke2(pixel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Pixel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.trackPixel(this.$coroutineScope, it);
    }
}
