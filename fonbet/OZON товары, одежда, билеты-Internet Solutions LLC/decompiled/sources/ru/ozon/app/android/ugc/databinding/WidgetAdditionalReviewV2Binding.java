package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes2.dex */
public final class WidgetAdditionalReviewV2Binding implements a {

    @NonNull
    public final IconView bonusIV;

    @NonNull
    public final IconButtonV3View hideIconButton;

    @NonNull
    public final TextAtomV2View hideTitle;

    @NonNull
    public final Image productIV;

    @NonNull
    public final RatingView reviewRatingView;

    @NonNull
    public final IconButtonV3View rightCornerButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private WidgetAdditionalReviewV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull Image image, @NonNull RatingView ratingView, @NonNull IconButtonV3View iconButtonV3View2, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.bonusIV = iconView;
        this.hideIconButton = iconButtonV3View;
        this.hideTitle = textAtomV2View;
        this.productIV = image;
        this.reviewRatingView = ratingView;
        this.rightCornerButton = iconButtonV3View2;
        this.subtitle = textAtomV2View2;
        this.title = textAtomV2View3;
    }

    @NonNull
    public static WidgetAdditionalReviewV2Binding bind(@NonNull View view) {
        int i11 = R$id.bonusIV;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.hideIconButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.hideTitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.productIV;
                    Image image = (Image) C2548q.d(i11, view);
                    if (image != null) {
                        i11 = R$id.reviewRatingView;
                        RatingView ratingView = (RatingView) C2548q.d(i11, view);
                        if (ratingView != null) {
                            i11 = R$id.rightCornerButton;
                            IconButtonV3View iconButtonV3View2 = (IconButtonV3View) C2548q.d(i11, view);
                            if (iconButtonV3View2 != null) {
                                i11 = R$id.subtitle;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View2 != null) {
                                    i11 = R$id.title;
                                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View3 != null) {
                                        return new WidgetAdditionalReviewV2Binding((ConstraintLayout) view, iconView, iconButtonV3View, textAtomV2View, image, ratingView, iconButtonV3View2, textAtomV2View2, textAtomV2View3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
