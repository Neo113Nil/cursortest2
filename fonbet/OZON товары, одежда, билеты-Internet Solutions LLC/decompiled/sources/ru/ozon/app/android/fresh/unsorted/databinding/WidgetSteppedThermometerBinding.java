package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.uni.android.cell.CellView;

/* loaded from: classes12.dex */
public final class WidgetSteppedThermometerBinding implements a {

    @NonNull
    public final CellView deliveryInfoCell;

    @NonNull
    public final ConstraintLayout rootContainer;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetSteppedThermometerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellView cellView, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.deliveryInfoCell = cellView;
        this.rootContainer = constraintLayout2;
    }

    @NonNull
    public static WidgetSteppedThermometerBinding bind(@NonNull View view) {
        int i11 = R$id.deliveryInfoCell;
        CellView cellView = (CellView) C2548q.d(i11, view);
        if (cellView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new WidgetSteppedThermometerBinding(constraintLayout, cellView, constraintLayout);
    }

    @NonNull
    public static WidgetSteppedThermometerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetSteppedThermometerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_stepped_thermometer, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
