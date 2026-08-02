package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class WidgetFiltersRangeFilterBinding implements a {

    @NonNull
    public final RangeFilterView rangeFilter;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View separator;

    private WidgetFiltersRangeFilterBinding(@NonNull LinearLayout linearLayout, @NonNull RangeFilterView rangeFilterView, @NonNull View view) {
        this.rootView = linearLayout;
        this.rangeFilter = rangeFilterView;
        this.separator = view;
    }

    @NonNull
    public static WidgetFiltersRangeFilterBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.rangeFilter;
        RangeFilterView rangeFilterView = (RangeFilterView) C2548q.d(i11, view);
        if (rangeFilterView == null || (d11 = C2548q.d((i11 = R$id.separator), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new WidgetFiltersRangeFilterBinding((LinearLayout) view, rangeFilterView, d11);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
