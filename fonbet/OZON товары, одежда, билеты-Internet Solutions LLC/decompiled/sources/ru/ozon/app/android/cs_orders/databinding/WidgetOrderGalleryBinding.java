package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetOrderGalleryBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView shipmentsRv;

    private WidgetOrderGalleryBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.shipmentsRv = recyclerView;
    }

    @NonNull
    public static WidgetOrderGalleryBinding bind(@NonNull View view) {
        int i11 = R$id.shipmentsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetOrderGalleryBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
