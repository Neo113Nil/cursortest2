package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.SquareAspectColorVariantView;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantFrameLayout;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2ColorLayoutBinding implements a {

    @NonNull
    public final SquareAspectColorVariantView colorView;

    @NonNull
    public final VariantFrameLayout rootFl;

    @NonNull
    private final VariantFrameLayout rootView;

    private WidgetAspectsCompactV2ColorLayoutBinding(@NonNull VariantFrameLayout variantFrameLayout, @NonNull SquareAspectColorVariantView squareAspectColorVariantView, @NonNull VariantFrameLayout variantFrameLayout2) {
        this.rootView = variantFrameLayout;
        this.colorView = squareAspectColorVariantView;
        this.rootFl = variantFrameLayout2;
    }

    @NonNull
    public static WidgetAspectsCompactV2ColorLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.colorView;
        SquareAspectColorVariantView squareAspectColorVariantView = (SquareAspectColorVariantView) C2548q.d(i11, view);
        if (squareAspectColorVariantView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        VariantFrameLayout variantFrameLayout = (VariantFrameLayout) view;
        return new WidgetAspectsCompactV2ColorLayoutBinding(variantFrameLayout, squareAspectColorVariantView, variantFrameLayout);
    }

    @Override // X4.a
    @NonNull
    public VariantFrameLayout getRoot() {
        return this.rootView;
    }
}
