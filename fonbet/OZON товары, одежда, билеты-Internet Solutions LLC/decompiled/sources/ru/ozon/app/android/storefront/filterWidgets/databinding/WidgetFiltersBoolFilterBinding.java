package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleCounterView;

/* loaded from: classes2.dex */
public final class WidgetFiltersBoolFilterBinding implements a {

    @NonNull
    public final CellWithSubtitleToggleCounterView cell;

    @NonNull
    private final CellWithSubtitleToggleCounterView rootView;

    private WidgetFiltersBoolFilterBinding(@NonNull CellWithSubtitleToggleCounterView cellWithSubtitleToggleCounterView, @NonNull CellWithSubtitleToggleCounterView cellWithSubtitleToggleCounterView2) {
        this.rootView = cellWithSubtitleToggleCounterView;
        this.cell = cellWithSubtitleToggleCounterView2;
    }

    @NonNull
    public static WidgetFiltersBoolFilterBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleToggleCounterView cellWithSubtitleToggleCounterView = (CellWithSubtitleToggleCounterView) view;
        return new WidgetFiltersBoolFilterBinding(cellWithSubtitleToggleCounterView, cellWithSubtitleToggleCounterView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleToggleCounterView getRoot() {
        return this.rootView;
    }
}
