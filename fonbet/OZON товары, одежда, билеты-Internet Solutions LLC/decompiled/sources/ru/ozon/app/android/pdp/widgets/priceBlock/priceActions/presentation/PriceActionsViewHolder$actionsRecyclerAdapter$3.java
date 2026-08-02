package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PriceActionsViewHolder$actionsRecyclerAdapter$3 extends C7735q implements Function2<Boolean, Function0<? extends Unit>, Unit> {
    PriceActionsViewHolder$actionsRecyclerAdapter$3(Object obj) {
        super(2, obj, PriceActionsViewHolder.class, "visibilityStateAlert", "visibilityStateAlert(ZLkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Function0<? extends Unit> function0) {
        invoke(bool.booleanValue(), (Function0<Unit>) function0);
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, Function0<Unit> function0) {
        ((PriceActionsViewHolder) this.receiver).visibilityStateAlert(z11, function0);
    }
}
