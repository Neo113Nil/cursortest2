package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemAdapter$onSwipeDeleteItem$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ boolean $isTap;
    final /* synthetic */ CartTileVO.TileItem $item;
    final /* synthetic */ CartTileItemAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTileItemAdapter$onSwipeDeleteItem$2(CartTileVO.TileItem tileItem, CartTileItemAdapter cartTileItemAdapter, boolean z11) {
        super(0);
        this.$item = tileItem;
        this.this$0 = cartTileItemAdapter;
        this.$isTap = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        AtomAction deleteAction = this.$item.getDeleteAction();
        LinkedHashMap linkedHashMap = null;
        AtomAction.Click click = deleteAction instanceof AtomAction.Click ? (AtomAction.Click) deleteAction : null;
        if (click == null) {
            return;
        }
        this.this$0.processDeleteAnalytics(this.$item, this.$isTap);
        function1 = this.this$0.actionHandler;
        Map<String, String> params = click.getParams();
        if (params != null) {
            linkedHashMap = U.u(params);
            linkedHashMap.put("SWIPE_ACTION", "true");
            Unit unit = Unit.f71690a;
        }
        function1.invoke(AtomAction.Click.copy$default(click, null, null, null, linkedHashMap, null, null, 55, null));
    }
}
