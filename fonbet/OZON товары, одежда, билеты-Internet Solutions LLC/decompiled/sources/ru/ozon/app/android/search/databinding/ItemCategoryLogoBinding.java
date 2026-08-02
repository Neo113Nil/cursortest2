package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class ItemCategoryLogoBinding implements a {

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final CardView itemCv;

    @NonNull
    public final ImageView logoIv;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private ItemCategoryLogoBinding(@NonNull CardView cardView, @NonNull Guideline guideline, @NonNull CardView cardView2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = cardView;
        this.guideline = guideline;
        this.itemCv = cardView2;
        this.logoIv = imageView;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static ItemCategoryLogoBinding bind(@NonNull View view) {
        int i11 = R$id.guideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null) {
            CardView cardView = (CardView) view;
            i11 = R$id.logoIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.subtitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.titleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new ItemCategoryLogoBinding(cardView, guideline, cardView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
