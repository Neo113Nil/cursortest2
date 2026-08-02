package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchDTO;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchMapper;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class ProductPickerSearchNetworkDataSource$retrieveData$1 extends C7735q implements Function1<ProductPickerSearchDTO, ProductPickerSearchVO> {
    ProductPickerSearchNetworkDataSource$retrieveData$1(Object obj) {
        super(1, obj, ProductPickerSearchMapper.class, "mapDTOtoVO", "mapDTOtoVO(Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO;)Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ProductPickerSearchVO invoke(ProductPickerSearchDTO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((ProductPickerSearchMapper) this.receiver).mapDTOtoVO(p02);
    }
}
