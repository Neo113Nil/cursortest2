package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.autopicker.databinding.FragmentProductPickerSearchBinding;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductPickerSearchFragment$prepareRecyclerView$1$1 extends AbstractC7737t implements Function1<ProductPickerSearchVO.ProductPickerSearchItem, Unit> {
    final /* synthetic */ FragmentProductPickerSearchBinding $this_with;
    final /* synthetic */ ProductPickerSearchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductPickerSearchFragment$prepareRecyclerView$1$1(FragmentProductPickerSearchBinding fragmentProductPickerSearchBinding, ProductPickerSearchFragment productPickerSearchFragment) {
        super(1);
        this.$this_with = fragmentProductPickerSearchBinding;
        this.this$0 = productPickerSearchFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem) {
        invoke2(productPickerSearchItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductPickerSearchVO.ProductPickerSearchItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$this_with.searchV.clearFocus();
        Function1<ProductPickerSearchVO.ProductPickerSearchItem, Unit> onLeafClicked = this.this$0.getOnLeafClicked();
        if (onLeafClicked != null) {
            onLeafClicked.invoke(it);
        }
    }
}
