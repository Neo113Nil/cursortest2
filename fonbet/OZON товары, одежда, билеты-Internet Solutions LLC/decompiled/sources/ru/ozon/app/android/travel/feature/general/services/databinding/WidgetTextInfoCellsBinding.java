package ru.ozon.app.android.travel.feature.general.services.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellsView;

/* loaded from: classes4.dex */
public final class WidgetTextInfoCellsBinding implements a {

    @NonNull
    private final TextInfoCellsView rootView;

    @NonNull
    public final TextInfoCellsView textInfoCellsView;

    private WidgetTextInfoCellsBinding(@NonNull TextInfoCellsView textInfoCellsView, @NonNull TextInfoCellsView textInfoCellsView2) {
        this.rootView = textInfoCellsView;
        this.textInfoCellsView = textInfoCellsView2;
    }

    @NonNull
    public static WidgetTextInfoCellsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextInfoCellsView textInfoCellsView = (TextInfoCellsView) view;
        return new WidgetTextInfoCellsBinding(textInfoCellsView, textInfoCellsView);
    }

    @Override // X4.a
    @NonNull
    public TextInfoCellsView getRoot() {
        return this.rootView;
    }
}
