package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes11.dex */
public final class ProductPickerSearchTreeFilter_Factory implements e<ProductPickerSearchTreeFilter> {
    private final a<Context> contextProvider;

    public ProductPickerSearchTreeFilter_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static ProductPickerSearchTreeFilter_Factory create(a<Context> aVar) {
        return new ProductPickerSearchTreeFilter_Factory(aVar);
    }

    public static ProductPickerSearchTreeFilter newInstance(Context context) {
        return new ProductPickerSearchTreeFilter(context);
    }

    @Override // Pc.a
    public ProductPickerSearchTreeFilter get() {
        return newInstance(this.contextProvider.get());
    }
}
