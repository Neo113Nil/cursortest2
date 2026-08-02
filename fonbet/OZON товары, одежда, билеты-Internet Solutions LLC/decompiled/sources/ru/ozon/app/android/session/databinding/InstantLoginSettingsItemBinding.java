package ru.ozon.app.android.session.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleView;

/* loaded from: classes2.dex */
public final class InstantLoginSettingsItemBinding implements a {

    @NonNull
    public final CellWithSubtitleToggleView instantSettingsItem;

    @NonNull
    private final CellWithSubtitleToggleView rootView;

    private InstantLoginSettingsItemBinding(@NonNull CellWithSubtitleToggleView cellWithSubtitleToggleView, @NonNull CellWithSubtitleToggleView cellWithSubtitleToggleView2) {
        this.rootView = cellWithSubtitleToggleView;
        this.instantSettingsItem = cellWithSubtitleToggleView2;
    }

    @NonNull
    public static InstantLoginSettingsItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleToggleView cellWithSubtitleToggleView = (CellWithSubtitleToggleView) view;
        return new InstantLoginSettingsItemBinding(cellWithSubtitleToggleView, cellWithSubtitleToggleView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleToggleView getRoot() {
        return this.rootView;
    }
}
