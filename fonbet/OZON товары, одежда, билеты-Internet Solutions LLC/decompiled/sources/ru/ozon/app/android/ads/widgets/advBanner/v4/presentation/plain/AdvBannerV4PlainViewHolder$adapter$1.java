package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AdvBannerV4PlainViewHolder$adapter$1 extends C7735q implements Function1<AdvBannerV4ItemVO, Unit> {
    AdvBannerV4PlainViewHolder$adapter$1(Object obj) {
        super(1, obj, AdvBannerV4PlainViewHolder.class, "trackItemClick", "trackItemClick(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdvBannerV4ItemVO advBannerV4ItemVO) {
        invoke2(advBannerV4ItemVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdvBannerV4ItemVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AdvBannerV4PlainViewHolder) this.receiver).trackItemClick(p02);
    }
}
