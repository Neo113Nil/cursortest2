package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes11.dex */
public final class WidgetDeliveryReviewFormHeaderBinding implements a {

    @NonNull
    public final TextView newReviewTitleTv;

    @NonNull
    public final VectorRatingBar ratingRb;

    @NonNull
    public final TextView ratingTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetDeliveryReviewFormHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull VectorRatingBar vectorRatingBar, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.newReviewTitleTv = textView;
        this.ratingRb = vectorRatingBar;
        this.ratingTv = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static WidgetDeliveryReviewFormHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.newReviewTitleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.ratingRb;
            VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
            if (vectorRatingBar != null) {
                i11 = R$id.ratingTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.titleTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        return new WidgetDeliveryReviewFormHeaderBinding((LinearLayout) view, textView, vectorRatingBar, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
