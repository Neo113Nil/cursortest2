package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemBinding;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$4 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ CartSplitV2ItemWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$4(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder) {
        super(1);
        this.this$0 = cartSplitV2ItemWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        WidgetCartSplitV2ItemBinding widgetCartSplitV2ItemBinding;
        widgetCartSplitV2ItemBinding = this.this$0.binding;
        widgetCartSplitV2ItemBinding.increaseQuantityBtn.setEnabled(bool.booleanValue());
    }
}
