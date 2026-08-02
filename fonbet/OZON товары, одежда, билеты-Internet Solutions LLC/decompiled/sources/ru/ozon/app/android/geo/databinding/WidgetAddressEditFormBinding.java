package ru.ozon.app.android.geo.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class WidgetAddressEditFormBinding implements a {

    @NonNull
    public final RecyclerView formBlocksRv;

    @NonNull
    private final RecyclerView rootView;

    private WidgetAddressEditFormBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.formBlocksRv = recyclerView2;
    }

    @NonNull
    public static WidgetAddressEditFormBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetAddressEditFormBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
