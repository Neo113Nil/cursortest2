package ru.ozon.app.android.marketing.widgets.couponList.presentation;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponBlockViewHolder$observeActivatedCoupons$2 extends AbstractC7737t implements Function1<Set<? extends String>, Unit> {
    final /* synthetic */ CouponBlockViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponBlockViewHolder$observeActivatedCoupons$2(CouponBlockViewHolder couponBlockViewHolder) {
        super(1);
        this.this$0 = couponBlockViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
        invoke2((Set<String>) set);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Set<String> set) {
        BaseCouponVO.CouponVO couponVO;
        InterfaceC7851b interfaceC7851b;
        couponVO = this.this$0.item;
        if (couponVO != null) {
            interfaceC7851b = this.this$0.bus;
            InterfaceC7851b.a.e(interfaceC7851b, null, null, null, 7);
        }
    }
}
