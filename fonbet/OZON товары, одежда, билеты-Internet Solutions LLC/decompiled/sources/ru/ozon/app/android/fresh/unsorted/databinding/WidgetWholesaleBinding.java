package ru.ozon.app.android.fresh.unsorted.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class WidgetWholesaleBinding implements a {

    @NonNull
    private final RecyclerView rootView;

    @NonNull
    public final RecyclerView wholesaleList;

    private WidgetWholesaleBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.wholesaleList = recyclerView2;
    }

    @NonNull
    public static WidgetWholesaleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetWholesaleBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
