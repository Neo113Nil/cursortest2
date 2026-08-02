package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class ProductPickerSearchBinder$bind$4 extends C7735q implements Function2<ProductPickerSearchVO.ProductPickerSearchItem, Integer, Unit> {
    ProductPickerSearchBinder$bind$4(Object obj) {
        super(2, obj, ProductPickerSearchViewModel.class, "onNodeClicked", "onNodeClicked(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem, Integer num) {
        invoke(productPickerSearchItem, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(ProductPickerSearchVO.ProductPickerSearchItem p02, int i11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ProductPickerSearchViewModel) this.receiver).onNodeClicked(p02, i11);
    }
}
