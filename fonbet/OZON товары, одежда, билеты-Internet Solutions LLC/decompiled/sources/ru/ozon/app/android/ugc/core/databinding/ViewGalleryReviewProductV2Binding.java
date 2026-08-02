package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;

/* loaded from: classes2.dex */
public final class ViewGalleryReviewProductV2Binding implements a {

    @NonNull
    public final AppCompatImageButton addToCartBtn;

    @NonNull
    public final PriceView priceAtomView;

    @NonNull
    public final ConstraintLayout productContainerCl;

    @NonNull
    public final TextAtomV2View productDescriptionTAV;

    @NonNull
    public final ShapeableImageView productIv;

    @NonNull
    private final ConstraintLayout rootView;

    private ViewGalleryReviewProductV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull PriceView priceView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull ShapeableImageView shapeableImageView) {
        this.rootView = constraintLayout;
        this.addToCartBtn = appCompatImageButton;
        this.priceAtomView = priceView;
        this.productContainerCl = constraintLayout2;
        this.productDescriptionTAV = textAtomV2View;
        this.productIv = shapeableImageView;
    }

    @NonNull
    public static ViewGalleryReviewProductV2Binding bind(@NonNull View view) {
        int i11 = R$id.addToCartBtn;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2548q.d(i11, view);
        if (appCompatImageButton != null) {
            i11 = R$id.priceAtomView;
            PriceView priceView = (PriceView) C2548q.d(i11, view);
            if (priceView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.productDescriptionTAV;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.productIv;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                    if (shapeableImageView != null) {
                        return new ViewGalleryReviewProductV2Binding(constraintLayout, appCompatImageButton, priceView, constraintLayout, textAtomV2View, shapeableImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewGalleryReviewProductV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_gallery_review_product_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
