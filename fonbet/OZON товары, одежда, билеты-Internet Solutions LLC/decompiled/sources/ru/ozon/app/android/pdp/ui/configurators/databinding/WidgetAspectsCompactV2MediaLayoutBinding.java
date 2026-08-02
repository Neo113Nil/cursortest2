package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2MediaLayoutBinding implements a {

    @NonNull
    public final ShapeableImageView imageIv;

    @NonNull
    public final PriceAtomView pricePa;

    @NonNull
    public final VariantConstraintLayout root;

    @NonNull
    private final VariantConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetAspectsCompactV2MediaLayoutBinding(@NonNull VariantConstraintLayout variantConstraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull PriceAtomView priceAtomView, @NonNull VariantConstraintLayout variantConstraintLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = variantConstraintLayout;
        this.imageIv = shapeableImageView;
        this.pricePa = priceAtomView;
        this.root = variantConstraintLayout2;
        this.subtitleTav = textAtomV2View;
        this.titleTav = textAtomV2View2;
    }

    @NonNull
    public static WidgetAspectsCompactV2MediaLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.imageIv;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            i11 = R$id.pricePa;
            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
            if (priceAtomView != null) {
                VariantConstraintLayout variantConstraintLayout = (VariantConstraintLayout) view;
                i11 = R$id.subtitleTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.titleTav;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetAspectsCompactV2MediaLayoutBinding(variantConstraintLayout, shapeableImageView, priceAtomView, variantConstraintLayout, textAtomV2View, textAtomV2View2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public VariantConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
