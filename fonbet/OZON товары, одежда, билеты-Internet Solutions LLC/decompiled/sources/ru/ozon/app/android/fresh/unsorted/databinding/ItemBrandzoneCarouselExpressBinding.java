package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.fresh.unsorted.R$id;

/* loaded from: classes12.dex */
public final class ItemBrandzoneCarouselExpressBinding implements a {

    @NonNull
    public final ImageView bannerIv;

    @NonNull
    public final TextView bodyTv;

    @NonNull
    public final CardView cardCv;

    @NonNull
    public final ShapeableImageView logoIv;

    @NonNull
    private final CardView rootView;

    private ItemBrandzoneCarouselExpressBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull CardView cardView2, @NonNull ShapeableImageView shapeableImageView) {
        this.rootView = cardView;
        this.bannerIv = imageView;
        this.bodyTv = textView;
        this.cardCv = cardView2;
        this.logoIv = shapeableImageView;
    }

    @NonNull
    public static ItemBrandzoneCarouselExpressBinding bind(@NonNull View view) {
        int i11 = R$id.bannerIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.bodyTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                CardView cardView = (CardView) view;
                i11 = R$id.logoIv;
                ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                if (shapeableImageView != null) {
                    return new ItemBrandzoneCarouselExpressBinding(cardView, imageView, textView, cardView, shapeableImageView);
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
