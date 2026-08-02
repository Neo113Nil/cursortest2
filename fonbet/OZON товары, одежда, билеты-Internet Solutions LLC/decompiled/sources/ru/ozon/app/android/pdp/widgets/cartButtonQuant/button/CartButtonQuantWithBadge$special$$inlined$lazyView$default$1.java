package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class CartButtonQuantWithBadge$special$$inlined$lazyView$default$1 extends AbstractC7737t implements Function0<CartButtonQuant> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonQuantWithBadge$special$$inlined$lazyView$default$1(ViewGroup viewGroup, Context context) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CartButtonQuant invoke() {
        CartButtonQuant cartButtonQuant = new CartButtonQuant(this.$context$inlined, null, 0, 6, null);
        cartButtonQuant.setId(R$id.cartButtonWithBadge_Button);
        cartButtonQuant.setLayoutParams(new ConstraintLayout.b(0, -2));
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(cartButtonQuant);
        }
        return cartButtonQuant;
    }
}
