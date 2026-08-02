package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchRepository;

/* loaded from: classes11.dex */
public final class ProductPickerSearchInteractor_Factory implements e<ProductPickerSearchInteractor> {
    private final a<ProductPickerSearchListFilter> listFilterProvider;
    private final a<ProductPickerSearchRepository> repositoryProvider;
    private final a<ProductPickerSearchTreeFilter> treeFilterProvider;

    public ProductPickerSearchInteractor_Factory(a<ProductPickerSearchRepository> aVar, a<ProductPickerSearchTreeFilter> aVar2, a<ProductPickerSearchListFilter> aVar3) {
        this.repositoryProvider = aVar;
        this.treeFilterProvider = aVar2;
        this.listFilterProvider = aVar3;
    }

    public static ProductPickerSearchInteractor_Factory create(a<ProductPickerSearchRepository> aVar, a<ProductPickerSearchTreeFilter> aVar2, a<ProductPickerSearchListFilter> aVar3) {
        return new ProductPickerSearchInteractor_Factory(aVar, aVar2, aVar3);
    }

    public static ProductPickerSearchInteractor newInstance(ProductPickerSearchRepository productPickerSearchRepository, ProductPickerSearchTreeFilter productPickerSearchTreeFilter, ProductPickerSearchListFilter productPickerSearchListFilter) {
        return new ProductPickerSearchInteractor(productPickerSearchRepository, productPickerSearchTreeFilter, productPickerSearchListFilter);
    }

    @Override // Pc.a
    public ProductPickerSearchInteractor get() {
        return newInstance(this.repositoryProvider.get(), this.treeFilterProvider.get(), this.listFilterProvider.get());
    }
}
