package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchApi;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchMapper;

/* loaded from: classes11.dex */
public final class ProductPickerSearchNetworkDataSource_Factory implements e<ProductPickerSearchNetworkDataSource> {
    private final a<ProductPickerSearchApi> apiProvider;
    private final a<ProductPickerSearchMapper> mapperProvider;

    public ProductPickerSearchNetworkDataSource_Factory(a<ProductPickerSearchApi> aVar, a<ProductPickerSearchMapper> aVar2) {
        this.apiProvider = aVar;
        this.mapperProvider = aVar2;
    }

    public static ProductPickerSearchNetworkDataSource_Factory create(a<ProductPickerSearchApi> aVar, a<ProductPickerSearchMapper> aVar2) {
        return new ProductPickerSearchNetworkDataSource_Factory(aVar, aVar2);
    }

    public static ProductPickerSearchNetworkDataSource newInstance(ProductPickerSearchApi productPickerSearchApi, ProductPickerSearchMapper productPickerSearchMapper) {
        return new ProductPickerSearchNetworkDataSource(productPickerSearchApi, productPickerSearchMapper);
    }

    @Override // Pc.a
    public ProductPickerSearchNetworkDataSource get() {
        return newInstance(this.apiProvider.get(), this.mapperProvider.get());
    }
}
