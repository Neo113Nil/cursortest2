package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import Jb.e;

/* loaded from: classes11.dex */
public final class ProductPickerSearchLocalDataSource_Factory implements e<ProductPickerSearchLocalDataSource> {

    private static final class InstanceHolder {
        private static final ProductPickerSearchLocalDataSource_Factory INSTANCE = new ProductPickerSearchLocalDataSource_Factory();
    }

    public static ProductPickerSearchLocalDataSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProductPickerSearchLocalDataSource newInstance() {
        return new ProductPickerSearchLocalDataSource();
    }

    @Override // Pc.a
    public ProductPickerSearchLocalDataSource get() {
        return newInstance();
    }
}
