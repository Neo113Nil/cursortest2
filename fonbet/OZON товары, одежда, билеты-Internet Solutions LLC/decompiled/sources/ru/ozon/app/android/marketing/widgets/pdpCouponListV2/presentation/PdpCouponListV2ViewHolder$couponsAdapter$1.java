package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class PdpCouponListV2ViewHolder$couponsAdapter$1 extends C7735q implements Function1<PdpCouponItemListV2VO, Unit> {
    PdpCouponListV2ViewHolder$couponsAdapter$1(Object obj) {
        super(1, obj, PdpCouponListV2ViewHolder.class, "onHighlightClick", "onHighlightClick(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpCouponItemListV2VO pdpCouponItemListV2VO) {
        invoke2(pdpCouponItemListV2VO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpCouponItemListV2VO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((PdpCouponListV2ViewHolder) this.receiver).onHighlightClick(p02);
    }
}
