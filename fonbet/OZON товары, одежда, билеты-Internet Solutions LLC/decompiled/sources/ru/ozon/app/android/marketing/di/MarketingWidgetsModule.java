package ru.ozon.app.android.marketing.di;

import I00.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/marketing/di/MarketingWidgetsModule;", "", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MarketingWidgetsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/di/MarketingWidgetsModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListConfig;", "couponListConfig", "Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListViewMapper;", "couponListViewMapper", "Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoViewMapper;", "couponPromoViewMapper", "Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoNoUiViewMapper;", "couponPromoNoUiViewMapper", "Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoConfig;", "couponPromoConfig", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListConfig;", "sellerCategoryListConfig", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListViewMapper;", "sellerCategoryListViewHolderFactory", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/core/SellerNavigationConfig;", "sellerNavigationConfig", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/core/SellerNavigationViewMapper;", "sellerNavigationViewMapper", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselConfig;", "sellerCarouselConfig", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselViewMapper;", "sellerCarouselViewMapper", "", "Lru/ozon/app/android/composer/di/Widget;", "provideWidget", "(Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListConfig;Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListViewMapper;Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoViewMapper;Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoNoUiViewMapper;Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoConfig;Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListConfig;Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListViewMapper;Lru/ozon/app/android/marketing/widgets/sellerNavigation/core/SellerNavigationConfig;Lru/ozon/app/android/marketing/widgets/sellerNavigation/core/SellerNavigationViewMapper;Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselConfig;Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselViewMapper;)Ljava/util/Set;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget> provideWidget(@NotNull CouponListConfig couponListConfig, @NotNull CouponListViewMapper couponListViewMapper, @NotNull CouponPromoViewMapper couponPromoViewMapper, @NotNull CouponPromoNoUiViewMapper couponPromoNoUiViewMapper, @NotNull CouponPromoConfig couponPromoConfig, @NotNull SellerCategoryListConfig sellerCategoryListConfig, @NotNull SellerCategoryListViewMapper sellerCategoryListViewHolderFactory, @NotNull SellerNavigationConfig sellerNavigationConfig, @NotNull SellerNavigationViewMapper sellerNavigationViewMapper, @NotNull SellerCarouselConfig sellerCarouselConfig, @NotNull SellerCarouselViewMapper sellerCarouselViewMapper) {
            Intrinsics.checkNotNullParameter(couponListConfig, "couponListConfig");
            Intrinsics.checkNotNullParameter(couponListViewMapper, "couponListViewMapper");
            Intrinsics.checkNotNullParameter(couponPromoViewMapper, "couponPromoViewMapper");
            Intrinsics.checkNotNullParameter(couponPromoNoUiViewMapper, "couponPromoNoUiViewMapper");
            Intrinsics.checkNotNullParameter(couponPromoConfig, "couponPromoConfig");
            Intrinsics.checkNotNullParameter(sellerCategoryListConfig, "sellerCategoryListConfig");
            Intrinsics.checkNotNullParameter(sellerCategoryListViewHolderFactory, "sellerCategoryListViewHolderFactory");
            Intrinsics.checkNotNullParameter(sellerNavigationConfig, "sellerNavigationConfig");
            Intrinsics.checkNotNullParameter(sellerNavigationViewMapper, "sellerNavigationViewMapper");
            Intrinsics.checkNotNullParameter(sellerCarouselConfig, "sellerCarouselConfig");
            Intrinsics.checkNotNullParameter(sellerCarouselViewMapper, "sellerCarouselViewMapper");
            return e0.a(new Widget("marketingInfo", "couponList", couponListConfig, new CouponListViewMapper[]{couponListViewMapper}), new Widget("cms", "couponPromo", couponPromoConfig, new d[]{couponPromoViewMapper, couponPromoNoUiViewMapper}), new Widget("marketing", "sellerCategoryList", sellerCategoryListConfig, new SellerCategoryListViewMapper[]{sellerCategoryListViewHolderFactory}), new Widget("marketing", "sellerNavigation", sellerNavigationConfig, new SellerNavigationViewMapper[]{sellerNavigationViewMapper}), new Widget("cms", "sellerCarousel", sellerCarouselConfig, new SellerCarouselViewMapper[]{sellerCarouselViewMapper}));
        }

        private Companion() {
        }
    }
}
