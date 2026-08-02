package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import B90.C2618u;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutTotalView$buttonView$2 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckoutTotalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutTotalView$buttonView$2(Context context, CheckoutTotalView checkoutTotalView) {
        super(0);
        this.$context = context;
        this.this$0 = checkoutTotalView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        CheckoutTotalView.Companion companion;
        ButtonV3View buttonV3View = new ButtonV3View(this.$context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.checkoutTotalButton, -1, -2);
        e11.f41638j = R$id.checkoutTotalPrices;
        companion = CheckoutTotalView.Companion;
        ((ViewGroup.MarginLayoutParams) e11).topMargin = companion.getPricesVerticalMargin();
        e11.f41634h = 0;
        e11.f41628e = 0;
        buttonV3View.setLayoutParams(e11);
        buttonV3View.setNestedScrollingEnabled(false);
        this.this$0.addView(buttonV3View);
        return buttonV3View;
    }
}
