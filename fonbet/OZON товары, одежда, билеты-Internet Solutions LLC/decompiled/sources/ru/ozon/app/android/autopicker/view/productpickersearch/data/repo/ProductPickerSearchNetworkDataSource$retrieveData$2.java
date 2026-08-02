package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class ProductPickerSearchNetworkDataSource$retrieveData$2 extends C7735q implements Function1<ProductPickerSearchVO, ProductPickerSearchVO> {
    ProductPickerSearchNetworkDataSource$retrieveData$2(Object obj) {
        super(1, obj, ProductPickerSearchNetworkDataSource.class, "updateParams", "updateParams(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;)Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ProductPickerSearchVO invoke(ProductPickerSearchVO p02) {
        ProductPickerSearchVO updateParams;
        Intrinsics.checkNotNullParameter(p02, "p0");
        updateParams = ((ProductPickerSearchNetworkDataSource) this.receiver).updateParams(p02);
        return updateParams;
    }
}
