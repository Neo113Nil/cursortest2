package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TileGrid2ReserveButtonViewHolder$wishlistSubscriber$1 extends C7735q implements Function1<Boolean, Unit> {
    TileGrid2ReserveButtonViewHolder$wishlistSubscriber$1(Object obj) {
        super(1, obj, TileGrid2ReserveButtonViewHolder.class, "bindOverlay", "bindOverlay(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((TileGrid2ReserveButtonViewHolder) this.receiver).bindOverlay(z11);
    }
}
