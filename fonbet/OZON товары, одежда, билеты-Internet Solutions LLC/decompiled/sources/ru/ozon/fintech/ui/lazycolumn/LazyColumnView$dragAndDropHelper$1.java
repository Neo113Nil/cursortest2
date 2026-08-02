package ru.ozon.fintech.ui.lazycolumn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class LazyColumnView$dragAndDropHelper$1 extends C7735q implements Function2<Integer, Integer, Unit> {
    LazyColumnView$dragAndDropHelper$1(Object obj) {
        super(2, obj, LazyColumnView.class, "moveItem", "moveItem(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, int i12) {
        ((LazyColumnView) this.receiver).moveItem(i11, i12);
    }
}
