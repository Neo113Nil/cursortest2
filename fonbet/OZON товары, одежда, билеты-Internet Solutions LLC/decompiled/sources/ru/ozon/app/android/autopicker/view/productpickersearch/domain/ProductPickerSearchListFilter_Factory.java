package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes11.dex */
public final class ProductPickerSearchListFilter_Factory implements e<ProductPickerSearchListFilter> {
    private final a<Context> contextProvider;

    public ProductPickerSearchListFilter_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ProductPickerSearchListFilter_Factory create(a<Context> aVar) {
        return new ProductPickerSearchListFilter_Factory(aVar);
    }

    public static ProductPickerSearchListFilter newInstance(Context context) {
        return new ProductPickerSearchListFilter(context);
    }

    @Override // Pc.a
    public ProductPickerSearchListFilter get() {
        return newInstance(this.contextProvider.get());
    }
}
