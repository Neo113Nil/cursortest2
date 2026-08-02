package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchInteractor;

/* loaded from: classes11.dex */
public final class ProductPickerSearchViewModelImpl_Factory implements e<ProductPickerSearchViewModelImpl> {
    private final a<ProductPickerSearchAnalytics> analyticsProvider;
    private final a<ProductPickerSearchInteractor> interactorProvider;

    public ProductPickerSearchViewModelImpl_Factory(a<ProductPickerSearchInteractor> aVar, a<ProductPickerSearchAnalytics> aVar2) {
        this.interactorProvider = aVar;
        this.analyticsProvider = aVar2;
    }

    public static ProductPickerSearchViewModelImpl_Factory create(a<ProductPickerSearchInteractor> aVar, a<ProductPickerSearchAnalytics> aVar2) {
        return new ProductPickerSearchViewModelImpl_Factory(aVar, aVar2);
    }

    public static ProductPickerSearchViewModelImpl newInstance(ProductPickerSearchInteractor productPickerSearchInteractor, ProductPickerSearchAnalytics productPickerSearchAnalytics) {
        return new ProductPickerSearchViewModelImpl(productPickerSearchInteractor, productPickerSearchAnalytics);
    }

    @Override // Pc.a
    public ProductPickerSearchViewModelImpl get() {
        return newInstance(this.interactorProvider.get(), this.analyticsProvider.get());
    }
}
