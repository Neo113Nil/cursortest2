package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchRepository;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "filteredItems", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductPickerSearchInteractor$observeSearch$2 extends AbstractC7737t implements Function1<List<? extends ProductPickerSearchVO.ProductPickerSearchItem>, Unit> {
    final /* synthetic */ ProductPickerSearchInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductPickerSearchInteractor$observeSearch$2(ProductPickerSearchInteractor productPickerSearchInteractor) {
        super(1);
        this.this$0 = productPickerSearchInteractor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductPickerSearchVO.ProductPickerSearchItem> list) {
        invoke2((List<ProductPickerSearchVO.ProductPickerSearchItem>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProductPickerSearchVO.ProductPickerSearchItem> list) {
        ProductPickerSearchRepository productPickerSearchRepository;
        ProductPickerSearchRepository productPickerSearchRepository2;
        if (list != null) {
            ProductPickerSearchInteractor productPickerSearchInteractor = this.this$0;
            productPickerSearchRepository = productPickerSearchInteractor.repository;
            productPickerSearchRepository.setItems(list);
            productPickerSearchRepository2 = productPickerSearchInteractor.repository;
            productPickerSearchRepository2.scrollToPosition(0);
        }
    }
}
