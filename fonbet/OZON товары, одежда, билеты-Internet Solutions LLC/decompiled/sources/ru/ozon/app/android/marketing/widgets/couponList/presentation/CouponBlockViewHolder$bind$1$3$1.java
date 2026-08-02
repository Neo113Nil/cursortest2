package ru.ozon.app.android.marketing.widgets.couponList.presentation;

import GZ.g;
import WZ.l;
import WZ.t;
import android.view.View;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModel;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponBlockViewHolder$bind$1$3$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ BaseCouponVO $item;
    final /* synthetic */ CouponBlockViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponBlockViewHolder$bind$1$3$1(BaseCouponVO baseCouponVO, CouponBlockViewHolder couponBlockViewHolder) {
        super(1);
        this.$item = baseCouponVO;
        this.this$0 = couponBlockViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        InterfaceC7851b interfaceC7851b;
        CouponViewModel couponViewModel;
        CouponPromoRouter couponPromoRouter;
        l lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        t tokenizedEvent = ((BaseCouponVO.CouponVO) this.$item).getActionButton().getTokenizedEvent();
        if (tokenizedEvent != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(lVar, tokenizedEvent, null, 2, null);
        }
        if (((BaseCouponVO.CouponVO) this.$item).getActive()) {
            couponPromoRouter = this.this$0.couponRouter;
            g.a.a(couponPromoRouter.getScreenRouter(), ((BaseCouponVO.CouponVO) this.$item).getActionButton().getDeepLink(), null, null, 6);
        } else {
            interfaceC7851b = this.this$0.bus;
            interfaceC7851b.e(new l.a.C1079a(0L, null, 3));
            couponViewModel = this.this$0.viewModel;
            couponViewModel.activateCode(((BaseCouponVO.CouponVO) this.$item).getCouponCode());
        }
    }
}
