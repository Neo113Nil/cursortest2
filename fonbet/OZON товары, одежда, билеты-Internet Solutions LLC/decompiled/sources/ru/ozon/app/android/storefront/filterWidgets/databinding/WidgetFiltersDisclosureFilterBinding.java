package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCounterView;

/* loaded from: classes2.dex */
public final class WidgetFiltersDisclosureFilterBinding implements a {

    @NonNull
    public final CellWithSubtitleCounterView disclosureFilterView;

    @NonNull
    private final CellWithSubtitleCounterView rootView;

    private WidgetFiltersDisclosureFilterBinding(@NonNull CellWithSubtitleCounterView cellWithSubtitleCounterView, @NonNull CellWithSubtitleCounterView cellWithSubtitleCounterView2) {
        this.rootView = cellWithSubtitleCounterView;
        this.disclosureFilterView = cellWithSubtitleCounterView2;
    }

    @NonNull
    public static WidgetFiltersDisclosureFilterBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleCounterView cellWithSubtitleCounterView = (CellWithSubtitleCounterView) view;
        return new WidgetFiltersDisclosureFilterBinding(cellWithSubtitleCounterView, cellWithSubtitleCounterView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleCounterView getRoot() {
        return this.rootView;
    }
}
