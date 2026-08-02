package ru.ozon.app.android.fresh.feature.b2b.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;

/* loaded from: classes12.dex */
public final class WidgetAddLegalAddressMobileItemBinding implements a {

    @NonNull
    public final CellWithSubtitleDefaultView legalsAddressCell;

    @NonNull
    private final CellWithSubtitleDefaultView rootView;

    private WidgetAddLegalAddressMobileItemBinding(@NonNull CellWithSubtitleDefaultView cellWithSubtitleDefaultView, @NonNull CellWithSubtitleDefaultView cellWithSubtitleDefaultView2) {
        this.rootView = cellWithSubtitleDefaultView;
        this.legalsAddressCell = cellWithSubtitleDefaultView2;
    }

    @NonNull
    public static WidgetAddLegalAddressMobileItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleDefaultView cellWithSubtitleDefaultView = (CellWithSubtitleDefaultView) view;
        return new WidgetAddLegalAddressMobileItemBinding(cellWithSubtitleDefaultView, cellWithSubtitleDefaultView);
    }

    @Override // X4.a
    @NonNull
    public CellWithSubtitleDefaultView getRoot() {
        return this.rootView;
    }
}
