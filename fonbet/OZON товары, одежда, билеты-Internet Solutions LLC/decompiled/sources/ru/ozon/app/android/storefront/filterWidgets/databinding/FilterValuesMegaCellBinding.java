package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.cell.CellView;

/* loaded from: classes2.dex */
public final class FilterValuesMegaCellBinding implements a {

    @NonNull
    public final CellView filterValueItemCheckbox;

    @NonNull
    private final CellView rootView;

    private FilterValuesMegaCellBinding(@NonNull CellView cellView, @NonNull CellView cellView2) {
        this.rootView = cellView;
        this.filterValueItemCheckbox = cellView2;
    }

    @NonNull
    public static FilterValuesMegaCellBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellView cellView = (CellView) view;
        return new FilterValuesMegaCellBinding(cellView, cellView);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CellView getConstraintLayout() {
        return this.rootView;
    }
}
