package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;

/* loaded from: classes2.dex */
public final class FilterValuesItemCheckboxBinding implements a {

    @NonNull
    public final CellWithSubtitleCheckboxRadioCounterView filterValueItemCheckbox;

    @NonNull
    private final CellWithSubtitleCheckboxRadioCounterView rootView;

    private FilterValuesItemCheckboxBinding(@NonNull CellWithSubtitleCheckboxRadioCounterView cellWithSubtitleCheckboxRadioCounterView, @NonNull CellWithSubtitleCheckboxRadioCounterView cellWithSubtitleCheckboxRadioCounterView2) {
        this.rootView = cellWithSubtitleCheckboxRadioCounterView;
        this.filterValueItemCheckbox = cellWithSubtitleCheckboxRadioCounterView2;
    }

    @NonNull
    public static FilterValuesItemCheckboxBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleCheckboxRadioCounterView cellWithSubtitleCheckboxRadioCounterView = (CellWithSubtitleCheckboxRadioCounterView) view;
        return new FilterValuesItemCheckboxBinding(cellWithSubtitleCheckboxRadioCounterView, cellWithSubtitleCheckboxRadioCounterView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleCheckboxRadioCounterView getRoot() {
        return this.rootView;
    }
}
