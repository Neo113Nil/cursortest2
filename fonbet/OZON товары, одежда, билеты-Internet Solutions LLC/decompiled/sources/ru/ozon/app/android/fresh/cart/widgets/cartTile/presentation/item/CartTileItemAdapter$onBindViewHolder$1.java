package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CartTileItemAdapter$onBindViewHolder$1 extends C7735q implements Function2<Integer, Boolean, Unit> {
    CartTileItemAdapter$onBindViewHolder$1(Object obj) {
        super(2, obj, CartTileItemAdapter.class, "onSwipeDeleteItem", "onSwipeDeleteItem(IZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        invoke(num.intValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, boolean z11) {
        ((CartTileItemAdapter) this.receiver).onSwipeDeleteItem(i11, z11);
    }
}
