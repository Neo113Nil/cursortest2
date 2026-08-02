package ru.ozon.app.android.pdp.ui.configurators.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;

/* loaded from: classes13.dex */
public final class ItemComparisonCharacteristicsFilterBinding implements a {

    @NonNull
    public final CellWithSubtitleCheckboxRadioView filterCell;

    @NonNull
    private final CellWithSubtitleCheckboxRadioView rootView;

    private ItemComparisonCharacteristicsFilterBinding(@NonNull CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView, @NonNull CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView2) {
        this.rootView = cellWithSubtitleCheckboxRadioView;
        this.filterCell = cellWithSubtitleCheckboxRadioView2;
    }

    @NonNull
    public static ItemComparisonCharacteristicsFilterBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView = (CellWithSubtitleCheckboxRadioView) view;
        return new ItemComparisonCharacteristicsFilterBinding(cellWithSubtitleCheckboxRadioView, cellWithSubtitleCheckboxRadioView);
    }

    @NonNull
    public static ItemComparisonCharacteristicsFilterBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_comparison_characteristics_filter, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleCheckboxRadioView getRoot() {
        return this.rootView;
    }
}
