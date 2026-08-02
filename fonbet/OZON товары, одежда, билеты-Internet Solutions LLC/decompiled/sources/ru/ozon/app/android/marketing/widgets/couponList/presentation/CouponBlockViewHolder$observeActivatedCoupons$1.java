package ru.ozon.app.android.marketing.widgets.couponList.presentation;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Set;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponBlockViewHolder$observeActivatedCoupons$1 extends AbstractC7737t implements Function1<Set<? extends String>, Boolean> {
    final /* synthetic */ CouponBlockViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponBlockViewHolder$observeActivatedCoupons$1(CouponBlockViewHolder couponBlockViewHolder) {
        super(1);
        this.this$0 = couponBlockViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Set<? extends String> set) {
        return invoke2((Set<String>) set);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Set<String> it) {
        BaseCouponVO.CouponVO couponVO;
        Intrinsics.checkNotNullParameter(it, "it");
        couponVO = this.this$0.item;
        String couponCode = couponVO != null ? couponVO.getCouponCode() : null;
        return Boolean.valueOf((couponCode == null || !it.contains(couponCode) || couponVO.getActive()) ? false : true);
    }
}
