package ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog;

import android.content.res.Resources;
import android.widget.Button;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.coupon.data.ApplyCouponResponse;
import ru.ozon.app.android.marketing.databinding.CouponPromoDialogBinding;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponPromoBottomSheetDialog$onActionButtonCLick$1$1 extends AbstractC7737t implements Function1<ApplyCouponResponse, Unit> {
    final /* synthetic */ CouponPromoBottomSheetDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponPromoBottomSheetDialog$onActionButtonCLick$1$1(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog) {
        super(1);
        this.this$0 = couponPromoBottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApplyCouponResponse applyCouponResponse) {
        invoke2(applyCouponResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApplyCouponResponse applyCouponResponse) {
        CouponPromoDialogBinding couponPromoDialogBinding;
        Button button;
        String str;
        CouponPromoRouter couponPromoRouter = this.this$0.getCouponPromoRouter();
        J viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        Resources resources = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CouponPromoRouter.showSuccessToolTip$default(couponPromoRouter, viewLifecycleOwner, resources, ContextExtKt.getRootView(this.this$0), null, null, 24, null);
        this.this$0.isActivatedPromoCode = true;
        couponPromoDialogBinding = this.this$0.binding;
        if (couponPromoDialogBinding == null || (button = couponPromoDialogBinding.actionBtn) == null) {
            return;
        }
        str = this.this$0.activeStateButton;
        button.setText(str);
    }
}
