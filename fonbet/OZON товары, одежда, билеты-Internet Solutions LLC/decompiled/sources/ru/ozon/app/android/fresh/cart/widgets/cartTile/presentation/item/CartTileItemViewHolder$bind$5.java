package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemViewHolder$bind$5 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CartTileVO.TileItem $item;
    final /* synthetic */ Function1<t, Unit> $onViewEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTileItemViewHolder$bind$5(CartTileVO.TileItem tileItem, Function1<? super t, Unit> function1) {
        super(0);
        this.$item = tileItem;
        this.$onViewEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t swipeTokenizedEvent = this.$item.getSwipeTokenizedEvent();
        if (swipeTokenizedEvent != null) {
            this.$onViewEvent.invoke(swipeTokenizedEvent);
        }
    }
}
