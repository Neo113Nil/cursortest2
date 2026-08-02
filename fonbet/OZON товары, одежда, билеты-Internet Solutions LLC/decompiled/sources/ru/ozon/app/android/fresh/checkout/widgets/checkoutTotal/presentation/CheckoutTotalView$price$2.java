package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import De.C2860c;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutTotalView$price$2 extends AbstractC7737t implements Function0<PriceAtomView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckoutTotalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutTotalView$price$2(Context context, CheckoutTotalView checkoutTotalView) {
        super(0);
        this.$context = context;
        this.this$0 = checkoutTotalView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PriceAtomView invoke() {
        PriceAtomView priceAtomView = new PriceAtomView(this.$context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.checkoutTotalFullPrice, -2, -2);
        int i11 = R$id.checkoutTotalTitle;
        b11.f41636i = i11;
        b11.f41642l = i11;
        b11.f41634h = 0;
        b11.f41630f = i11;
        b11.f41598E = 1.0f;
        priceAtomView.setLayoutParams(b11);
        this.this$0.addView(priceAtomView);
        return priceAtomView;
    }
}
