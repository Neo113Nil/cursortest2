package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class FilterBrandAspectsBinding implements a {

    @NonNull
    public final RecyclerView aspectsRv;

    @NonNull
    public final FilterHeaderUniversalRightBinding headerContainer;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View separator;

    private FilterBrandAspectsBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull FilterHeaderUniversalRightBinding filterHeaderUniversalRightBinding, @NonNull View view) {
        this.rootView = linearLayout;
        this.aspectsRv = recyclerView;
        this.headerContainer = filterHeaderUniversalRightBinding;
        this.separator = view;
    }

    @NonNull
    public static FilterBrandAspectsBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.aspectsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null && (d11 = C2548q.d((i11 = R$id.headerContainer), view)) != null) {
            FilterHeaderUniversalRightBinding bind = FilterHeaderUniversalRightBinding.bind(d11);
            int i12 = R$id.separator;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                return new FilterBrandAspectsBinding((LinearLayout) view, recyclerView, bind, d12);
            }
            i11 = i12;
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
