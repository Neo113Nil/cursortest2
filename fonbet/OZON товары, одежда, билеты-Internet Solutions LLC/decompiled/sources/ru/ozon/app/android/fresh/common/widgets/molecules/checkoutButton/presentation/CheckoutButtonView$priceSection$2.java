package ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutButtonView$priceSection$2 extends AbstractC7737t implements Function0<LinearLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckoutButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutButtonView$priceSection$2(Context context, CheckoutButtonView checkoutButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = checkoutButtonView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        CheckoutButtonView.Companion companion;
        CheckoutButtonView.Companion companion2;
        CheckoutButtonView.Companion companion3;
        CheckoutButtonView.Companion companion4;
        LinearLayout linearLayout = new LinearLayout(this.$context);
        linearLayout.setId(R$id.checkoutButtonGroup);
        linearLayout.setOrientation(0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41598E = 1.0f;
        bVar.f41636i = 0;
        bVar.f41634h = 0;
        bVar.f41642l = 0;
        linearLayout.setLayoutParams(bVar);
        linearLayout.setClickable(false);
        linearLayout.setFocusable(false);
        companion = CheckoutButtonView.Companion;
        int priceHorizontalPadding = companion.getPriceHorizontalPadding();
        companion2 = CheckoutButtonView.Companion;
        int priceVerticalPadding = companion2.getPriceVerticalPadding();
        companion3 = CheckoutButtonView.Companion;
        int priceHorizontalPadding2 = companion3.getPriceHorizontalPadding();
        companion4 = CheckoutButtonView.Companion;
        linearLayout.setPadding(priceHorizontalPadding, priceVerticalPadding, priceHorizontalPadding2, companion4.getPriceVerticalPadding());
        this.this$0.addView(linearLayout);
        return linearLayout;
    }
}
