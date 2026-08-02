package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class ProductPickerSearchBinder$bind$3 extends C7735q implements Function1<ProductPickerSearchVO.ProductPickerSearchItem, Unit> {
    ProductPickerSearchBinder$bind$3(Object obj) {
        super(1, obj, ProductPickerSearchViewModel.class, "onLeafClicked", "onLeafClicked(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem) {
        invoke2(productPickerSearchItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductPickerSearchVO.ProductPickerSearchItem p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ProductPickerSearchViewModel) this.receiver).onLeafClicked(p02);
    }
}
