package ru.ozon.app.android.checkout.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.checkout.R$layout;

/* loaded from: classes11.dex */
public final class ItemHorizontalSplitCarouselBinding implements a {

    @NonNull
    public final ImageView carouselImageIV;

    @NonNull
    private final ImageView rootView;

    private ItemHorizontalSplitCarouselBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = imageView;
        this.carouselImageIV = imageView2;
    }

    @NonNull
    public static ItemHorizontalSplitCarouselBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new ItemHorizontalSplitCarouselBinding(imageView, imageView);
    }

    @NonNull
    public static ItemHorizontalSplitCarouselBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_horizontal_split_carousel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
