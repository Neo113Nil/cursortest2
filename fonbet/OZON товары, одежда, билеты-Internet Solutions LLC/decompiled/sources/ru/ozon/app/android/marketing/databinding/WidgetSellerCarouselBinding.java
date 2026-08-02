package ru.ozon.app.android.marketing.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.view.SellerCarouselView;

/* loaded from: classes12.dex */
public final class WidgetSellerCarouselBinding implements a {

    @NonNull
    public final SellerCarouselView root;

    @NonNull
    private final SellerCarouselView rootView;

    private WidgetSellerCarouselBinding(@NonNull SellerCarouselView sellerCarouselView, @NonNull SellerCarouselView sellerCarouselView2) {
        this.rootView = sellerCarouselView;
        this.root = sellerCarouselView2;
    }

    @NonNull
    public static WidgetSellerCarouselBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SellerCarouselView sellerCarouselView = (SellerCarouselView) view;
        return new WidgetSellerCarouselBinding(sellerCarouselView, sellerCarouselView);
    }

    @Override // X4.a
    @NonNull
    public SellerCarouselView getRoot() {
        return this.rootView;
    }
}
