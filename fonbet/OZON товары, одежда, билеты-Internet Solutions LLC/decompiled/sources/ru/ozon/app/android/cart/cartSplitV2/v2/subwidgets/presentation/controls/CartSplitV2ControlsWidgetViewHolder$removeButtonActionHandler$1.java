package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2ControlsWidgetViewHolder$removeButtonActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ CartSplitV2ControlsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ControlsWidgetViewHolder$removeButtonActionHandler$1(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        super(1);
        this.this$0 = cartSplitV2ControlsWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r2 = r1.this$0.getRemoveAction();
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction it) {
        AtomAction.Click removeAction;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof AtomAction.Click) || removeAction == null) {
            return;
        }
        this.this$0.actionHandler.invoke(removeAction);
    }
}
