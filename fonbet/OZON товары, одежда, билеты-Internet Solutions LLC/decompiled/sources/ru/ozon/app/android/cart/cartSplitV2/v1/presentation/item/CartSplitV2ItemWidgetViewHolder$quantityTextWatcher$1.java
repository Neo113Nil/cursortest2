package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item;

import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2ItemWidgetViewHolder$quantityTextWatcher$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ CartSplitV2ItemWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ItemWidgetViewHolder$quantityTextWatcher$1(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder) {
        super(1);
        this.this$0 = cartSplitV2ItemWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        InterfaceC6786a widgetViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        widgetViewModel = this.this$0.getWidgetViewModel();
        CartSplitV2ViewModel cartSplitV2ViewModel = (CartSplitV2ViewModel) widgetViewModel;
        if (cartSplitV2ViewModel != null) {
            cartSplitV2ViewModel.setFromInput(it);
        }
    }
}
