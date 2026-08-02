package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaComplexSearchFormWidgetViewHolder$bind$2 extends C7735q implements Function2<Boolean, Integer, Unit> {
    AviaComplexSearchFormWidgetViewHolder$bind$2(Object obj) {
        super(2, obj, AviaComplexSearchFormViewModel.class, "onItemSwiped", "onItemSwiped(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num) {
        invoke(bool.booleanValue(), num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, int i11) {
        ((AviaComplexSearchFormViewModel) this.receiver).onItemSwiped(z11, i11);
    }
}
