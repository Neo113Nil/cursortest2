package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.bank.widgets.adBanner.data.AnalyticEventType;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class AdBannerViewHolder$adapter$1 extends C7735q implements Function2<AdBannerItemVO, AnalyticEventType, Unit> {
    AdBannerViewHolder$adapter$1(Object obj) {
        super(2, obj, AdBannerViewHolder.class, "trackAnalyticEvent", "trackAnalyticEvent(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AdBannerItemVO adBannerItemVO, AnalyticEventType analyticEventType) {
        invoke2(adBannerItemVO, analyticEventType);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdBannerItemVO p02, AnalyticEventType p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((AdBannerViewHolder) this.receiver).trackAnalyticEvent(p02, p12);
    }
}
