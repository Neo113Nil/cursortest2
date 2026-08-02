package ru.ozon.app.android.marketing.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.marketing.widgets.couponList.core.CouponListConfig;
import ru.ozon.app.android.marketing.widgets.couponList.core.CouponListViewMapper;
import ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoConfig;
import ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoNoUiViewMapper;
import ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.core.SellerCarouselConfig;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.core.SellerCarouselViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.core.SellerCategoryListConfig;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.core.SellerCategoryListViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.core.SellerNavigationConfig;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.core.SellerNavigationViewMapper;

/* loaded from: classes6.dex */
public final class MarketingWidgetsModule_Companion_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(CouponListConfig couponListConfig, CouponListViewMapper couponListViewMapper, CouponPromoViewMapper couponPromoViewMapper, CouponPromoNoUiViewMapper couponPromoNoUiViewMapper, CouponPromoConfig couponPromoConfig, SellerCategoryListConfig sellerCategoryListConfig, SellerCategoryListViewMapper sellerCategoryListViewMapper, SellerNavigationConfig sellerNavigationConfig, SellerNavigationViewMapper sellerNavigationViewMapper, SellerCarouselConfig sellerCarouselConfig, SellerCarouselViewMapper sellerCarouselViewMapper) {
        Set<Widget> provideWidget = MarketingWidgetsModule.INSTANCE.provideWidget(couponListConfig, couponListViewMapper, couponPromoViewMapper, couponPromoNoUiViewMapper, couponPromoConfig, sellerCategoryListConfig, sellerCategoryListViewMapper, sellerNavigationConfig, sellerNavigationViewMapper, sellerCarouselConfig, sellerCarouselViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
