package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class BarcodeProductsListView$itemsListAnimationManager$1 extends C7735q implements Function1<Float, Unit> {
    BarcodeProductsListView$itemsListAnimationManager$1(Object obj) {
        super(1, obj, BarcodeProductsListView.class, "onExpandItemList", "onExpandItemList(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        ((BarcodeProductsListView) this.receiver).onExpandItemList(f7);
    }
}
