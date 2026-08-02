package ru.ozon.app.android.cs_orders.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class WidgetBarcodeBinding implements a {

    @NonNull
    public final RecyclerView barcodesRv;

    @NonNull
    private final RecyclerView rootView;

    private WidgetBarcodeBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.barcodesRv = recyclerView2;
    }

    @NonNull
    public static WidgetBarcodeBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetBarcodeBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
