package ru.ozon.app.android.ui.widgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class WidgetTextBinding implements a {

    @NonNull
    private final RecyclerView rootView;

    @NonNull
    public final RecyclerView widgetTextRootRV;

    private WidgetTextBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.widgetTextRootRV = recyclerView2;
    }

    @NonNull
    public static WidgetTextBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetTextBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
