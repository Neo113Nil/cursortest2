package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class WidgetDeliveryDateSelectorV2Binding implements a {

    @NonNull
    public final RecyclerView dateTabRecyclerView;

    @NonNull
    private final RecyclerView rootView;

    private WidgetDeliveryDateSelectorV2Binding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.dateTabRecyclerView = recyclerView2;
    }

    @NonNull
    public static WidgetDeliveryDateSelectorV2Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetDeliveryDateSelectorV2Binding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
