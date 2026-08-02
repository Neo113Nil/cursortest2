package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import a1.C4912a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/ComposeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5ButtonView$tooltipComposeView$2 extends AbstractC7737t implements Function0<ComposeView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CartButtonV5ButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ButtonView$tooltipComposeView$2(Context context, CartButtonV5ButtonView cartButtonV5ButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = cartButtonV5ButtonView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ComposeView invoke() {
        ComposeView composeView = new ComposeView(this.$context, null, 6, 0);
        CartButtonV5ButtonView cartButtonV5ButtonView = this.this$0;
        composeView.setId(R$id.cartButtonTooltip);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        composeView.a(new C4912a(true, -87323480, new CartButtonV5ButtonView$tooltipComposeView$2$1$1(cartButtonV5ButtonView)));
        return composeView;
    }
}
