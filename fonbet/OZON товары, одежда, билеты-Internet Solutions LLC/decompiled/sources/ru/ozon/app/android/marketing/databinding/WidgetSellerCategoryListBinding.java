package ru.ozon.app.android.marketing.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class WidgetSellerCategoryListBinding implements a {

    @NonNull
    private final RecyclerView rootView;

    @NonNull
    public final RecyclerView sellerCategoriesRv;

    private WidgetSellerCategoryListBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.sellerCategoriesRv = recyclerView2;
    }

    @NonNull
    public static WidgetSellerCategoryListBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetSellerCategoryListBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
