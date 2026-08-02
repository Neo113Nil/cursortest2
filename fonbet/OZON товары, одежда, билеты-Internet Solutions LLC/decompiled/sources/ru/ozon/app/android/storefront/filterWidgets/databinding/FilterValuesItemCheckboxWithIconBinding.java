package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterView;

/* loaded from: classes2.dex */
public final class FilterValuesItemCheckboxWithIconBinding implements a {

    @NonNull
    public final CellWithSubtitle24IconCheckboxRadioCounterView filterValueItemCheckbox24;

    @NonNull
    private final CellWithSubtitle24IconCheckboxRadioCounterView rootView;

    private FilterValuesItemCheckboxWithIconBinding(@NonNull CellWithSubtitle24IconCheckboxRadioCounterView cellWithSubtitle24IconCheckboxRadioCounterView, @NonNull CellWithSubtitle24IconCheckboxRadioCounterView cellWithSubtitle24IconCheckboxRadioCounterView2) {
        this.rootView = cellWithSubtitle24IconCheckboxRadioCounterView;
        this.filterValueItemCheckbox24 = cellWithSubtitle24IconCheckboxRadioCounterView2;
    }

    @NonNull
    public static FilterValuesItemCheckboxWithIconBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitle24IconCheckboxRadioCounterView cellWithSubtitle24IconCheckboxRadioCounterView = (CellWithSubtitle24IconCheckboxRadioCounterView) view;
        return new FilterValuesItemCheckboxWithIconBinding(cellWithSubtitle24IconCheckboxRadioCounterView, cellWithSubtitle24IconCheckboxRadioCounterView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitle24IconCheckboxRadioCounterView getRoot() {
        return this.rootView;
    }
}
