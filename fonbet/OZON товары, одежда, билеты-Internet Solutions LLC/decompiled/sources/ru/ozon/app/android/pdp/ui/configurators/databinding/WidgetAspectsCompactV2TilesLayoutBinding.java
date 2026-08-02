package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantConstraintLayout;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

/* loaded from: classes13.dex */
public final class WidgetAspectsCompactV2TilesLayoutBinding implements a {

    @NonNull
    public final ShapeableImageView imageIv;

    @NonNull
    public final FrameLayout infoFl;

    @NonNull
    public final TextView notAvailableTv;

    @NonNull
    public final PriceAtomView pricePa;

    @NonNull
    private final VariantConstraintLayout rootView;

    private WidgetAspectsCompactV2TilesLayoutBinding(@NonNull VariantConstraintLayout variantConstraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull PriceAtomView priceAtomView) {
        this.rootView = variantConstraintLayout;
        this.imageIv = shapeableImageView;
        this.infoFl = frameLayout;
        this.notAvailableTv = textView;
        this.pricePa = priceAtomView;
    }

    @NonNull
    public static WidgetAspectsCompactV2TilesLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.imageIv;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            i11 = R$id.infoFl;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.notAvailableTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.pricePa;
                    PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                    if (priceAtomView != null) {
                        return new WidgetAspectsCompactV2TilesLayoutBinding((VariantConstraintLayout) view, shapeableImageView, frameLayout, textView, priceAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetAspectsCompactV2TilesLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_aspects_compact_v2_tiles_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public VariantConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
