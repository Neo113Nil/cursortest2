package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.databinding.PdpCartbuttonInCartPlusMinusV4Binding;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/databinding/PdpCartbuttonInCartPlusMinusV4Binding;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartQuantQuantView$plusMinusButtonLazy$1 extends AbstractC7737t implements Function0<PdpCartbuttonInCartPlusMinusV4Binding> {
    final /* synthetic */ CartQuantQuantView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartQuantQuantView$plusMinusButtonLazy$1(CartQuantQuantView cartQuantQuantView) {
        super(0);
        this.this$0 = cartQuantQuantView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PdpCartbuttonInCartPlusMinusV4Binding invoke() {
        View inflate = ViewGroupExtKt.inflate(this.this$0, R$layout.pdp_cartbutton_in_cart_plus_minus_v4);
        this.this$0.addView(inflate);
        return PdpCartbuttonInCartPlusMinusV4Binding.bind(inflate);
    }
}
