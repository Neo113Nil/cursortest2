package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class ProductPickerSearchInteractor$observeSearch$1 extends C7735q implements Function1<String, List<? extends ProductPickerSearchVO.ProductPickerSearchItem>> {
    ProductPickerSearchInteractor$observeSearch$1(Object obj) {
        super(1, obj, ProductPickerSearchInteractor.class, "filterItems", "filterItems(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> invoke(String p02) {
        List<ProductPickerSearchVO.ProductPickerSearchItem> filterItems;
        Intrinsics.checkNotNullParameter(p02, "p0");
        filterItems = ((ProductPickerSearchInteractor) this.receiver).filterItems(p02);
        return filterItems;
    }
}
