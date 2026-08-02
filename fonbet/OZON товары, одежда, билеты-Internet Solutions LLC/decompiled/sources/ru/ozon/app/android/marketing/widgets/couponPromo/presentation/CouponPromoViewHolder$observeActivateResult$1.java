package ru.ozon.app.android.marketing.widgets.couponPromo.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/marketing/common/coupon/CouponResult;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponPromoViewHolder$observeActivateResult$1 extends AbstractC7737t implements Function1<CouponResult, Boolean> {
    final /* synthetic */ CouponPromoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponPromoViewHolder$observeActivateResult$1(CouponPromoViewHolder couponPromoViewHolder) {
        super(1);
        this.this$0 = couponPromoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CouponResult it) {
        CouponPromoVO couponPromoVO;
        CouponPromoVO.PromoCodeVO promoCode;
        Intrinsics.checkNotNullParameter(it, "it");
        String id2 = it.getId();
        couponPromoVO = this.this$0.couponPromoVO;
        return Boolean.valueOf(Intrinsics.d(id2, (couponPromoVO == null || (promoCode = couponPromoVO.getPromoCode()) == null) ? null : promoCode.getPromoCode()));
    }
}
