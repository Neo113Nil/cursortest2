package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes11.dex */
public final class AtomRatingBinding implements a {

    @NonNull
    public final VectorRatingBar ratingBar;

    @NonNull
    public final TextView reviewsCountTv;

    @NonNull
    private final View rootView;

    private AtomRatingBinding(@NonNull View view, @NonNull VectorRatingBar vectorRatingBar, @NonNull TextView textView) {
        this.rootView = view;
        this.ratingBar = vectorRatingBar;
        this.reviewsCountTv = textView;
    }

    @NonNull
    public static AtomRatingBinding bind(@NonNull View view) {
        int i11 = R$id.ratingBar;
        VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
        if (vectorRatingBar != null) {
            i11 = R$id.reviewsCountTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new AtomRatingBinding(view, vectorRatingBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomRatingBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_rating, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
