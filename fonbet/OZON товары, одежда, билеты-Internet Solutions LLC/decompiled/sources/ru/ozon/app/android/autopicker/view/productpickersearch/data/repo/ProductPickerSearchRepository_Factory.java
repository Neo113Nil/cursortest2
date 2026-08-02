package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import Jb.e;
import Pc.a;

/* loaded from: classes11.dex */
public final class ProductPickerSearchRepository_Factory implements e<ProductPickerSearchRepository> {
    private final a<ProductPickerSearchLocalDataSource> localDataSourceProvider;
    private final a<ProductPickerSearchNetworkDataSource> networkDataSourceProvider;

    public ProductPickerSearchRepository_Factory(a<ProductPickerSearchLocalDataSource> aVar, a<ProductPickerSearchNetworkDataSource> aVar2) {
        this.localDataSourceProvider = aVar;
        this.networkDataSourceProvider = aVar2;
    }

    public static ProductPickerSearchRepository_Factory create(a<ProductPickerSearchLocalDataSource> aVar, a<ProductPickerSearchNetworkDataSource> aVar2) {
        return new ProductPickerSearchRepository_Factory(aVar, aVar2);
    }

    public static ProductPickerSearchRepository newInstance(ProductPickerSearchLocalDataSource productPickerSearchLocalDataSource, ProductPickerSearchNetworkDataSource productPickerSearchNetworkDataSource) {
        return new ProductPickerSearchRepository(productPickerSearchLocalDataSource, productPickerSearchNetworkDataSource);
    }

    @Override // Pc.a
    public ProductPickerSearchRepository get() {
        return newInstance(this.localDataSourceProvider.get(), this.networkDataSourceProvider.get());
    }
}
