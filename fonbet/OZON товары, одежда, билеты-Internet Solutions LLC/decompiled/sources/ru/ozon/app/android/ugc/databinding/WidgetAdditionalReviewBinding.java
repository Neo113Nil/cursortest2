package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.widgets.additionalReview.presentation.RatingStarView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class WidgetAdditionalReviewBinding implements a {

    @NonNull
    public final CardView additionalReviewCV;

    @NonNull
    public final ConstraintLayout additionalReviewCl;

    @NonNull
    public final View bonusBackgroundV;

    @NonNull
    public final Group bonusGroup;

    @NonNull
    public final ImageView bonusIconIv;

    @NonNull
    public final TextView bonusTitleTv;

    @NonNull
    public final Guideline guideline1;

    @NonNull
    public final Image productIv;

    @NonNull
    public final TextAtomV2View productNameTav;

    @NonNull
    public final RatingStarView ratingStarView;

    @NonNull
    public final TextAtomV2View reviewTextTav;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final View separator;

    private WidgetAdditionalReviewBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Group group, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View, @NonNull RatingStarView ratingStarView, @NonNull TextAtomV2View textAtomV2View2, @NonNull View view2) {
        this.rootView = cardView;
        this.additionalReviewCV = cardView2;
        this.additionalReviewCl = constraintLayout;
        this.bonusBackgroundV = view;
        this.bonusGroup = group;
        this.bonusIconIv = imageView;
        this.bonusTitleTv = textView;
        this.guideline1 = guideline;
        this.productIv = image;
        this.productNameTav = textAtomV2View;
        this.ratingStarView = ratingStarView;
        this.reviewTextTav = textAtomV2View2;
        this.separator = view2;
    }

    @NonNull
    public static WidgetAdditionalReviewBinding bind(@NonNull View view) {
        View d11;
        View d12;
        CardView cardView = (CardView) view;
        int i11 = R$id.additionalReviewCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null && (d11 = C2548q.d((i11 = R$id.bonusBackgroundV), view)) != null) {
            i11 = R$id.bonusGroup;
            Group group = (Group) C2548q.d(i11, view);
            if (group != null) {
                i11 = R$id.bonusIconIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.bonusTitleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.guideline1;
                        Guideline guideline = (Guideline) C2548q.d(i11, view);
                        if (guideline != null) {
                            i11 = R$id.productIv;
                            Image image = (Image) C2548q.d(i11, view);
                            if (image != null) {
                                i11 = R$id.productNameTav;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View != null) {
                                    i11 = R$id.ratingStarView;
                                    RatingStarView ratingStarView = (RatingStarView) C2548q.d(i11, view);
                                    if (ratingStarView != null) {
                                        i11 = R$id.reviewTextTav;
                                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View2 != null && (d12 = C2548q.d((i11 = R$id.separator), view)) != null) {
                                            return new WidgetAdditionalReviewBinding(cardView, cardView, constraintLayout, d11, group, imageView, textView, guideline, image, textAtomV2View, ratingStarView, textAtomV2View2, d12);
                                        }
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

    @NonNull
    public static WidgetAdditionalReviewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_additional_review, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}
