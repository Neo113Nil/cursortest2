package ru.ozon.app.android.universalwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class WidgetUniversalObjectScrollBinding implements a {

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final RecyclerView rootView;

    private WidgetUniversalObjectScrollBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.itemsRv = recyclerView2;
    }

    @NonNull
    public static WidgetUniversalObjectScrollBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetUniversalObjectScrollBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
