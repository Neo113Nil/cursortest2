package ru.ozon.app.android.search.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;

/* loaded from: classes13.dex */
public final class SelectorDataAllStepCellItemBinding implements a {

    @NonNull
    public final CellWithSubtitleDefaultView allStepCellItem;

    @NonNull
    private final CellWithSubtitleDefaultView rootView;

    private SelectorDataAllStepCellItemBinding(@NonNull CellWithSubtitleDefaultView cellWithSubtitleDefaultView, @NonNull CellWithSubtitleDefaultView cellWithSubtitleDefaultView2) {
        this.rootView = cellWithSubtitleDefaultView;
        this.allStepCellItem = cellWithSubtitleDefaultView2;
    }

    @NonNull
    public static SelectorDataAllStepCellItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleDefaultView cellWithSubtitleDefaultView = (CellWithSubtitleDefaultView) view;
        return new SelectorDataAllStepCellItemBinding(cellWithSubtitleDefaultView, cellWithSubtitleDefaultView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleDefaultView getRoot() {
        return this.rootView;
    }
}
