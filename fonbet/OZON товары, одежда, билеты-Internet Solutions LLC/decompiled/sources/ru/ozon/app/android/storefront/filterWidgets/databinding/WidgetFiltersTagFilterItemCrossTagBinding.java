package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.tags.CrossTagAtomView;

/* loaded from: classes2.dex */
public final class WidgetFiltersTagFilterItemCrossTagBinding implements a {

    @NonNull
    public final CrossTagAtomView crossTag;

    @NonNull
    private final CrossTagAtomView rootView;

    private WidgetFiltersTagFilterItemCrossTagBinding(@NonNull CrossTagAtomView crossTagAtomView, @NonNull CrossTagAtomView crossTagAtomView2) {
        this.rootView = crossTagAtomView;
        this.crossTag = crossTagAtomView2;
    }

    @NonNull
    public static WidgetFiltersTagFilterItemCrossTagBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CrossTagAtomView crossTagAtomView = (CrossTagAtomView) view;
        return new WidgetFiltersTagFilterItemCrossTagBinding(crossTagAtomView, crossTagAtomView);
    }

    @Override // X4.a
    @NonNull
    public CrossTagAtomView getRoot() {
        return this.rootView;
    }
}
