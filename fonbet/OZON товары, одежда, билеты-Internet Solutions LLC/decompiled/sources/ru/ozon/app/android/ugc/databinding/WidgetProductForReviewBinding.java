package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes2.dex */
public final class WidgetProductForReviewBinding implements a {

    @NonNull
    public final FlexboxLayout badgesFl;

    @NonNull
    public final IconButtonV3View hideButton;

    @NonNull
    public final LinearLayout hideCL;

    @NonNull
    public final TextAtomV2View hideTitle;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    public final TextAtomV2View nameTav;

    @NonNull
    public final VectorRatingBar reviewRatingBar;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetProductForReviewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View2, @NonNull VectorRatingBar vectorRatingBar, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.badgesFl = flexboxLayout;
        this.hideButton = iconButtonV3View;
        this.hideCL = linearLayout;
        this.hideTitle = textAtomV2View;
        this.imageIv = imageView;
        this.nameTav = textAtomV2View2;
        this.reviewRatingBar = vectorRatingBar;
        this.rootCl = constraintLayout2;
    }

    @NonNull
    public static WidgetProductForReviewBinding bind(@NonNull View view) {
        int i11 = R$id.badgesFl;
        FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
        if (flexboxLayout != null) {
            i11 = R$id.hideButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.hideCL;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.hideTitle;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.imageIv;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.nameTav;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                i11 = R$id.reviewRatingBar;
                                VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
                                if (vectorRatingBar != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    return new WidgetProductForReviewBinding(constraintLayout, flexboxLayout, iconButtonV3View, linearLayout, textAtomV2View, imageView, textAtomV2View2, vectorRatingBar, constraintLayout);
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
