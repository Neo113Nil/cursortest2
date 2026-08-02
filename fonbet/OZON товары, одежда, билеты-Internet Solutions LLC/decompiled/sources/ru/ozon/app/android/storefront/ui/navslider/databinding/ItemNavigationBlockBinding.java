package ru.ozon.app.android.storefront.ui.navslider.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ItemNavigationBlockBinding implements a {

    @NonNull
    public final RecyclerView naviBlockRv;

    @NonNull
    private final RecyclerView rootView;

    private ItemNavigationBlockBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.naviBlockRv = recyclerView2;
    }

    @NonNull
    public static ItemNavigationBlockBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new ItemNavigationBlockBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
