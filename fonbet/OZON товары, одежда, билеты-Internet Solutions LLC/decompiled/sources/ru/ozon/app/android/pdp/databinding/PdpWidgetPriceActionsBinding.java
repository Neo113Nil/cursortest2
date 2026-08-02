package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class PdpWidgetPriceActionsBinding implements a {

    @NonNull
    public final RecyclerView priceActionsRv;

    @NonNull
    private final RecyclerView rootView;

    private PdpWidgetPriceActionsBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.priceActionsRv = recyclerView2;
    }

    @NonNull
    public static PdpWidgetPriceActionsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new PdpWidgetPriceActionsBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
