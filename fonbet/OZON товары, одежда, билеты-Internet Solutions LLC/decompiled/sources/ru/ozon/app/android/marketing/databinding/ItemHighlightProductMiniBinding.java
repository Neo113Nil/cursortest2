package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$layout;

/* loaded from: classes12.dex */
public final class ItemHighlightProductMiniBinding implements a {

    @NonNull
    public final ImageView highlightIcon;

    @NonNull
    public final ImageView highlightProductBadge;

    @NonNull
    public final CardView highlightProductBadgeContainer;

    @NonNull
    public final FrameLayout highlightProductContainer;

    @NonNull
    public final ShapeableImageView highlightProductImage;

    @NonNull
    private final FrameLayout rootView;

    private ItemHighlightProductMiniBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull FrameLayout frameLayout2, @NonNull ShapeableImageView shapeableImageView) {
        this.rootView = frameLayout;
        this.highlightIcon = imageView;
        this.highlightProductBadge = imageView2;
        this.highlightProductBadgeContainer = cardView;
        this.highlightProductContainer = frameLayout2;
        this.highlightProductImage = shapeableImageView;
    }

    @NonNull
    public static ItemHighlightProductMiniBinding bind(@NonNull View view) {
        int i11 = R$id.highlightIcon;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.highlightProductBadge;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.highlightProductBadgeContainer;
                CardView cardView = (CardView) C2548q.d(i11, view);
                if (cardView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = R$id.highlightProductImage;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                    if (shapeableImageView != null) {
                        return new ItemHighlightProductMiniBinding(frameLayout, imageView, imageView2, cardView, frameLayout, shapeableImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHighlightProductMiniBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_highlight_product_mini, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
