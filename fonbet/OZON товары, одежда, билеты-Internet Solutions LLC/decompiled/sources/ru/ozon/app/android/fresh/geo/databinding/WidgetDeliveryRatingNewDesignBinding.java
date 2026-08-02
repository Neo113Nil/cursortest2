package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetDeliveryRatingNewDesignBinding implements a {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RatingView rating;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    private WidgetDeliveryRatingNewDesignBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull RatingView ratingView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.container = constraintLayout2;
        this.image = imageView;
        this.rating = ratingView;
        this.subtitle = textAtomV2View;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static WidgetDeliveryRatingNewDesignBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.image;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.rating;
            RatingView ratingView = (RatingView) C2548q.d(i11, view);
            if (ratingView != null) {
                i11 = R$id.subtitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetDeliveryRatingNewDesignBinding(constraintLayout, constraintLayout, imageView, ratingView, textAtomV2View, textAtomV2View2);
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
