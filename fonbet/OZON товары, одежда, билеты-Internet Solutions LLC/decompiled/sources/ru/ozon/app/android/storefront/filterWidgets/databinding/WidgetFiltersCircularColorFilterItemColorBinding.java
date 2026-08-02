package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.color.ColorView;

/* loaded from: classes2.dex */
public final class WidgetFiltersCircularColorFilterItemColorBinding implements a {

    @NonNull
    public final ColorView color;

    @NonNull
    private final ColorView rootView;

    private WidgetFiltersCircularColorFilterItemColorBinding(@NonNull ColorView colorView, @NonNull ColorView colorView2) {
        this.rootView = colorView;
        this.color = colorView2;
    }

    @NonNull
    public static WidgetFiltersCircularColorFilterItemColorBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ColorView colorView = (ColorView) view;
        return new WidgetFiltersCircularColorFilterItemColorBinding(colorView, colorView);
    }

    @Override // X4.a
    @NonNull
    public ColorView getRoot() {
        return this.rootView;
    }
}
