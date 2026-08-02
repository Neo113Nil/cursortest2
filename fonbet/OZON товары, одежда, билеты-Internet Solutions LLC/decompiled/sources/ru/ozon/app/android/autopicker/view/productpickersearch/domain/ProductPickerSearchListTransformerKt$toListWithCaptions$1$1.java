package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "invoke", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductPickerSearchListTransformerKt$toListWithCaptions$1$1 extends AbstractC7737t implements Function1<ProductPickerSearchVO.ProductPickerSearchItem, Boolean> {
    public static final ProductPickerSearchListTransformerKt$toListWithCaptions$1$1 INSTANCE = new ProductPickerSearchListTransformerKt$toListWithCaptions$1$1();

    ProductPickerSearchListTransformerKt$toListWithCaptions$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ProductPickerSearchVO.ProductPickerSearchItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getType() != Type.CAPTION);
    }
}
