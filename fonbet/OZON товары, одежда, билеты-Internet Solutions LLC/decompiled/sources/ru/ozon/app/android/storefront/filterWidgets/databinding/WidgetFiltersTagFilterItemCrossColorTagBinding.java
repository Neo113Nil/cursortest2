package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.tags.CrossColorTagAtomView;

/* loaded from: classes2.dex */
public final class WidgetFiltersTagFilterItemCrossColorTagBinding implements a {

    @NonNull
    public final CrossColorTagAtomView crossColorTag;

    @NonNull
    private final CrossColorTagAtomView rootView;

    private WidgetFiltersTagFilterItemCrossColorTagBinding(@NonNull CrossColorTagAtomView crossColorTagAtomView, @NonNull CrossColorTagAtomView crossColorTagAtomView2) {
        this.rootView = crossColorTagAtomView;
        this.crossColorTag = crossColorTagAtomView2;
    }

    @NonNull
    public static WidgetFiltersTagFilterItemCrossColorTagBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CrossColorTagAtomView crossColorTagAtomView = (CrossColorTagAtomView) view;
        return new WidgetFiltersTagFilterItemCrossColorTagBinding(crossColorTagAtomView, crossColorTagAtomView);
    }

    @Override // X4.a
    @NonNull
    public CrossColorTagAtomView getRoot() {
        return this.rootView;
    }
}
