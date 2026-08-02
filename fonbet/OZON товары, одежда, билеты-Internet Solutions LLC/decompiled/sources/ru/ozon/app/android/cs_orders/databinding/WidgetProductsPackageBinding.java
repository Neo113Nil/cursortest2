package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetProductsPackageBinding implements a {

    @NonNull
    public final RecyclerView productsPackageRv;

    @NonNull
    private final CardView rootView;

    private WidgetProductsPackageBinding(@NonNull CardView cardView, @NonNull RecyclerView recyclerView) {
        this.rootView = cardView;
        this.productsPackageRv = recyclerView;
    }

    @NonNull
    public static WidgetProductsPackageBinding bind(@NonNull View view) {
        int i11 = R$id.productsPackageRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetProductsPackageBinding((CardView) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}
