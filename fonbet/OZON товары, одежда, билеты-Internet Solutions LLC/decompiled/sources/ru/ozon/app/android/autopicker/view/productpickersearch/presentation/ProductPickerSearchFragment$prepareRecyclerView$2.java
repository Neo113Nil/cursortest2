package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductPickerSearchFragment$prepareRecyclerView$2 extends AbstractC7737t implements Function2<ProductPickerSearchVO.ProductPickerSearchItem, Integer, Unit> {
    final /* synthetic */ ProductPickerSearchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductPickerSearchFragment$prepareRecyclerView$2(ProductPickerSearchFragment productPickerSearchFragment) {
        super(2);
        this.this$0 = productPickerSearchFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem, Integer num) {
        invoke(productPickerSearchItem, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(ProductPickerSearchVO.ProductPickerSearchItem item, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        Function2<ProductPickerSearchVO.ProductPickerSearchItem, Integer, Unit> onNodeClicked = this.this$0.getOnNodeClicked();
        if (onNodeClicked != null) {
            onNodeClicked.invoke(item, Integer.valueOf(i11));
        }
    }
}
