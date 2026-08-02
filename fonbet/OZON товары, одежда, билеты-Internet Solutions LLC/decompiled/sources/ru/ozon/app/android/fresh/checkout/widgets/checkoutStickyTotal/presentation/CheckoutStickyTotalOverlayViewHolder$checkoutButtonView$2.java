package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutStickyTotalOverlayViewHolder$checkoutButtonView$2 extends AbstractC7737t implements Function0<CheckoutButtonView> {
    final /* synthetic */ CheckoutStickyTotalOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutStickyTotalOverlayViewHolder$checkoutButtonView$2(CheckoutStickyTotalOverlayViewHolder checkoutStickyTotalOverlayViewHolder) {
        super(0);
        this.this$0 = checkoutStickyTotalOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CheckoutButtonView invoke() {
        Context context;
        FrameLayout buttonContainer;
        context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "access$getContext(...)");
        CheckoutButtonView checkoutButtonView = new CheckoutButtonView(context, null, 0, 6, null);
        CheckoutStickyTotalOverlayViewHolder checkoutStickyTotalOverlayViewHolder = this.this$0;
        checkoutButtonView.setId(R$id.checkoutStickyTotalCheckoutButton);
        checkoutButtonView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        buttonContainer = checkoutStickyTotalOverlayViewHolder.getButtonContainer();
        buttonContainer.addView(checkoutButtonView);
        return checkoutButtonView;
    }
}
