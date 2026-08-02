package ru.ozon.app.android.cs_orders.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;

/* loaded from: classes11.dex */
public final class ItemCancelReasonBinding implements a {

    @NonNull
    public final CellWithSubtitleCheckboxRadioView cellV;

    @NonNull
    private final CellWithSubtitleCheckboxRadioView rootView;

    private ItemCancelReasonBinding(@NonNull CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView, @NonNull CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView2) {
        this.rootView = cellWithSubtitleCheckboxRadioView;
        this.cellV = cellWithSubtitleCheckboxRadioView2;
    }

    @NonNull
    public static ItemCancelReasonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView = (CellWithSubtitleCheckboxRadioView) view;
        return new ItemCancelReasonBinding(cellWithSubtitleCheckboxRadioView, cellWithSubtitleCheckboxRadioView);
    }

    @NonNull
    public static ItemCancelReasonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_cancel_reason, viewGroup, false);
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
