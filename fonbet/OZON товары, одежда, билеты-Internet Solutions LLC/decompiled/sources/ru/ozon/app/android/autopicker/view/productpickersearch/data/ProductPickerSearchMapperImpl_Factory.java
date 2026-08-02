package ru.ozon.app.android.autopicker.view.productpickersearch.data;

import Jb.e;

/* loaded from: classes11.dex */
public final class ProductPickerSearchMapperImpl_Factory implements e<ProductPickerSearchMapperImpl> {

    private static final class InstanceHolder {
        private static final ProductPickerSearchMapperImpl_Factory INSTANCE = new ProductPickerSearchMapperImpl_Factory();
    }

    public static ProductPickerSearchMapperImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProductPickerSearchMapperImpl newInstance() {
        return new ProductPickerSearchMapperImpl();
    }

    @Override // Pc.a
    public ProductPickerSearchMapperImpl get() {
        return newInstance();
    }
}
