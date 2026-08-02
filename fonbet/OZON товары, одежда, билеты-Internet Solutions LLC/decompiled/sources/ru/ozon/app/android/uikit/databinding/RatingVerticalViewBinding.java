package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes2.dex */
public final class RatingVerticalViewBinding implements a {

    @NonNull
    public final VectorRatingBar ratingBar;

    @NonNull
    public final TextView ratingCountTv;

    @NonNull
    private final View rootView;

    private RatingVerticalViewBinding(@NonNull View view, @NonNull VectorRatingBar vectorRatingBar, @NonNull TextView textView) {
        this.rootView = view;
        this.ratingBar = vectorRatingBar;
        this.ratingCountTv = textView;
    }

    @NonNull
    public static RatingVerticalViewBinding bind(@NonNull View view) {
        int i11 = R$id.ratingBar;
        VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
        if (vectorRatingBar != null) {
            i11 = R$id.ratingCountTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new RatingVerticalViewBinding(view, vectorRatingBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
