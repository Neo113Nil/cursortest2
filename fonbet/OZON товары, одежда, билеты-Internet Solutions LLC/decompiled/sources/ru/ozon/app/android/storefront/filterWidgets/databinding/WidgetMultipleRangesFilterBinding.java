package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class WidgetMultipleRangesFilterBinding implements a {

    @NonNull
    public final WidgetFiltersRangeFilterBinding rangeContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final WidgetFiltersTagFilterBinding tagsContainer;

    private WidgetMultipleRangesFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull WidgetFiltersRangeFilterBinding widgetFiltersRangeFilterBinding, @NonNull WidgetFiltersTagFilterBinding widgetFiltersTagFilterBinding) {
        this.rootView = constraintLayout;
        this.rangeContainer = widgetFiltersRangeFilterBinding;
        this.tagsContainer = widgetFiltersTagFilterBinding;
    }

    @NonNull
    public static WidgetMultipleRangesFilterBinding bind(@NonNull View view) {
        int i11 = R$id.rangeContainer;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            WidgetFiltersRangeFilterBinding bind = WidgetFiltersRangeFilterBinding.bind(d11);
            int i12 = R$id.tagsContainer;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                return new WidgetMultipleRangesFilterBinding((ConstraintLayout) view, bind, WidgetFiltersTagFilterBinding.bind(d12));
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
