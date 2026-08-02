package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCounterView;

/* loaded from: classes2.dex */
public final class BrandFilterBottomItemBinding implements a {

    @NonNull
    public final CellWithSubtitleCounterView brandBottomCell;

    @NonNull
    private final CellWithSubtitleCounterView rootView;

    private BrandFilterBottomItemBinding(@NonNull CellWithSubtitleCounterView cellWithSubtitleCounterView, @NonNull CellWithSubtitleCounterView cellWithSubtitleCounterView2) {
        this.rootView = cellWithSubtitleCounterView;
        this.brandBottomCell = cellWithSubtitleCounterView2;
    }

    @NonNull
    public static BrandFilterBottomItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleCounterView cellWithSubtitleCounterView = (CellWithSubtitleCounterView) view;
        return new BrandFilterBottomItemBinding(cellWithSubtitleCounterView, cellWithSubtitleCounterView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleCounterView getRoot() {
        return this.rootView;
    }
}
