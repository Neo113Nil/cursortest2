package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutStickyTotalOverlayViewHolder$buttonContainer$2 extends AbstractC7737t implements Function0<FrameLayout> {
    final /* synthetic */ CheckoutStickyTotalOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutStickyTotalOverlayViewHolder$buttonContainer$2(CheckoutStickyTotalOverlayViewHolder checkoutStickyTotalOverlayViewHolder) {
        super(0);
        this.this$0 = checkoutStickyTotalOverlayViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        Context context;
        context = this.this$0.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        CheckoutStickyTotalOverlayViewHolder checkoutStickyTotalOverlayViewHolder = this.this$0;
        frameLayout.setId(R$id.checkoutStickyTotalButtonContainer);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setBackgroundResource(UniColors.LAYER_FLOOR_1.getResId());
        View view = checkoutStickyTotalOverlayViewHolder.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(frameLayout, 1);
        }
        return frameLayout;
    }
}
