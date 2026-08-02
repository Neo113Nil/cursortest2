package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.SquareAspectColorVariantView;
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.image.RatioFrameLayout;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2ImageLayoutBinding implements a {

    @NonNull
    public final SquareAspectColorVariantView colorView;

    @NonNull
    public final ShapeableImageView imageView;

    @NonNull
    public final RatioFrameLayout ratioGroup;

    @NonNull
    private final RatioFrameLayout rootView;

    private WidgetAspectsCompactV2ImageLayoutBinding(@NonNull RatioFrameLayout ratioFrameLayout, @NonNull SquareAspectColorVariantView squareAspectColorVariantView, @NonNull ShapeableImageView shapeableImageView, @NonNull RatioFrameLayout ratioFrameLayout2) {
        this.rootView = ratioFrameLayout;
        this.colorView = squareAspectColorVariantView;
        this.imageView = shapeableImageView;
        this.ratioGroup = ratioFrameLayout2;
    }

    @NonNull
    public static WidgetAspectsCompactV2ImageLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.colorView;
        SquareAspectColorVariantView squareAspectColorVariantView = (SquareAspectColorVariantView) C2548q.d(i11, view);
        if (squareAspectColorVariantView != null) {
            i11 = R$id.imageView;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
            if (shapeableImageView != null) {
                RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) view;
                return new WidgetAspectsCompactV2ImageLayoutBinding(ratioFrameLayout, squareAspectColorVariantView, shapeableImageView, ratioFrameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public RatioFrameLayout getRoot() {
        return this.rootView;
    }
}
