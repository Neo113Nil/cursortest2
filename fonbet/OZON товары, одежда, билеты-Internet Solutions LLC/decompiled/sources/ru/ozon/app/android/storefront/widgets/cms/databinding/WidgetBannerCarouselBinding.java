package ru.ozon.app.android.storefront.widgets.cms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.widgets.cms.R$id;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel.CarouselViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes2.dex */
public final class WidgetBannerCarouselBinding implements a {

    @NonNull
    public final CarouselViewPager carouselVp;

    @NonNull
    public final ScrollingPagerIndicator pageIndicatorPiv;

    @NonNull
    public final ConstraintLayout root;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetBannerCarouselBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CarouselViewPager carouselViewPager, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.carouselVp = carouselViewPager;
        this.pageIndicatorPiv = scrollingPagerIndicator;
        this.root = constraintLayout2;
    }

    @NonNull
    public static WidgetBannerCarouselBinding bind(@NonNull View view) {
        int i11 = R$id.carouselVp;
        CarouselViewPager carouselViewPager = (CarouselViewPager) C2548q.d(i11, view);
        if (carouselViewPager != null) {
            i11 = R$id.pageIndicatorPiv;
            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
            if (scrollingPagerIndicator != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new WidgetBannerCarouselBinding(constraintLayout, carouselViewPager, scrollingPagerIndicator, constraintLayout);
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
