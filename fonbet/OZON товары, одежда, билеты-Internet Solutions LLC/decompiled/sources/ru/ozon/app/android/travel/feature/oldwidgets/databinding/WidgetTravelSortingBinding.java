package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;

/* loaded from: classes4.dex */
public final class WidgetTravelSortingBinding implements a {

    @NonNull
    private final SelectView rootView;

    @NonNull
    public final SelectView sortingSelectView;

    private WidgetTravelSortingBinding(@NonNull SelectView selectView, @NonNull SelectView selectView2) {
        this.rootView = selectView;
        this.sortingSelectView = selectView2;
    }

    @NonNull
    public static WidgetTravelSortingBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SelectView selectView = (SelectView) view;
        return new WidgetTravelSortingBinding(selectView, selectView);
    }

    @Override // X4.a
    @NonNull
    public SelectView getRoot() {
        return this.rootView;
    }
}
