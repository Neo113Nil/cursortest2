package ru.ozon.app.android.universalwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class WidgetScrollLayoutBinding implements a {

    @NonNull
    public final RecyclerView productsRv;

    @NonNull
    private final RecyclerView rootView;

    private WidgetScrollLayoutBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.productsRv = recyclerView2;
    }

    @NonNull
    public static WidgetScrollLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetScrollLayoutBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
