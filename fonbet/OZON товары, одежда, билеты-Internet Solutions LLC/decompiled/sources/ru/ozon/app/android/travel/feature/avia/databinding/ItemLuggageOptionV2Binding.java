package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;

/* loaded from: classes8.dex */
public final class ItemLuggageOptionV2Binding implements a {

    @NonNull
    public final CellWithSubtitleCheckboxRadioCounterView luggageOptionV2CellView;

    @NonNull
    private final FrameLayout rootView;

    private ItemLuggageOptionV2Binding(@NonNull FrameLayout frameLayout, @NonNull CellWithSubtitleCheckboxRadioCounterView cellWithSubtitleCheckboxRadioCounterView) {
        this.rootView = frameLayout;
        this.luggageOptionV2CellView = cellWithSubtitleCheckboxRadioCounterView;
    }

    @NonNull
    public static ItemLuggageOptionV2Binding bind(@NonNull View view) {
        int i11 = R$id.luggageOptionV2CellView;
        CellWithSubtitleCheckboxRadioCounterView cellWithSubtitleCheckboxRadioCounterView = (CellWithSubtitleCheckboxRadioCounterView) C2548q.d(i11, view);
        if (cellWithSubtitleCheckboxRadioCounterView != null) {
            return new ItemLuggageOptionV2Binding((FrameLayout) view, cellWithSubtitleCheckboxRadioCounterView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemLuggageOptionV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_luggage_option_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
