package ru.ozon.app.android.storefront.ui.separator.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.separator.presentation.RatioHeightView;

/* loaded from: classes7.dex */
public final class WidgetSeparatorBinding implements a {

    @NonNull
    private final RatioHeightView rootView;

    @NonNull
    public final RatioHeightView separatorV;

    private WidgetSeparatorBinding(@NonNull RatioHeightView ratioHeightView, @NonNull RatioHeightView ratioHeightView2) {
        this.rootView = ratioHeightView;
        this.separatorV = ratioHeightView2;
    }

    @NonNull
    public static WidgetSeparatorBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RatioHeightView ratioHeightView = (RatioHeightView) view;
        return new WidgetSeparatorBinding(ratioHeightView, ratioHeightView);
    }

    @Override // X4.a
    @NonNull
    public RatioHeightView getRoot() {
        return this.rootView;
    }
}
