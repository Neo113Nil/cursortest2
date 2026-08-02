package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2AnalyticsSender$trackPixel$1 extends AbstractC7737t implements Function1<Pixel, Unit> {
    public static final AdvVideoBannerV2AnalyticsSender$trackPixel$1 INSTANCE = new AdvVideoBannerV2AnalyticsSender$trackPixel$1();

    AdvVideoBannerV2AnalyticsSender$trackPixel$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Pixel it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pixel pixel) {
        invoke2(pixel);
        return Unit.f71690a;
    }
}
