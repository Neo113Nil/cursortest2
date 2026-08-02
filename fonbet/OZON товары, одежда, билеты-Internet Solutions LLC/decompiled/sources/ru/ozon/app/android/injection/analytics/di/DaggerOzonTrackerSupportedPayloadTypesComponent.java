package ru.ozon.app.android.injection.analytics.di;

import YZ.a;
import com.google.common.collect.A;
import java.util.Set;
import ru.ozon.app.android.cart.domain.di.module.CartDomainAnalyticsPayloadTypesModule;
import ru.ozon.app.android.cart.domain.di.module.CartDomainAnalyticsPayloadTypesModule_ProvideSupportedPayloadTypes$cart_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.checkoutgeo.di.payload.CheckoutGeoAnalyticsPayloadTypesModule;
import ru.ozon.app.android.checkoutgeo.di.payload.CheckoutGeoAnalyticsPayloadTypesModule_ProvideSupportedPayloadTypes$checkout_geo_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.common.widgets.FreshSupportedPayloadTypesModule;
import ru.ozon.app.android.fresh.common.widgets.FreshSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.injection.analytics.di.OzonTrackerSupportedPayloadTypesComponent;
import ru.ozon.app.android.monetization.di.MonetizationOzonTrackerSupportedPayloadTypesModule;
import ru.ozon.app.android.monetization.di.MonetizationOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$monetization_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.search.di.SearchOzonTrackerSupportedPayloadTypesModule;
import ru.ozon.app.android.search.di.SearchOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$search_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.di.StoreFrontOzonTrackerSupportedPayloadTypesModule;
import ru.ozon.app.android.storefront.di.StoreFrontOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewsOzonTrackerSupportedPayloadTypesModule;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewsOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$core_prodGoogleAllVendorsReleaseFactory;

/* loaded from: classes6.dex */
public final class DaggerOzonTrackerSupportedPayloadTypesComponent {

    private static final class Factory implements OzonTrackerSupportedPayloadTypesComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.injection.analytics.di.OzonTrackerSupportedPayloadTypesComponent.Factory
        public OzonTrackerSupportedPayloadTypesComponent create() {
            return new OzonTrackerSupportedPayloadTypesComponentImpl(new OzonTrackerSupportedPayloadTypesModule(), new SearchOzonTrackerSupportedPayloadTypesModule(), new ReviewsOzonTrackerSupportedPayloadTypesModule(), new FreshSupportedPayloadTypesModule(), new CartDomainAnalyticsPayloadTypesModule(), new StoreFrontOzonTrackerSupportedPayloadTypesModule(), new MonetizationOzonTrackerSupportedPayloadTypesModule(), new CheckoutGeoAnalyticsPayloadTypesModule(), 0);
        }

        private Factory() {
        }
    }

    private static final class OzonTrackerSupportedPayloadTypesComponentImpl implements OzonTrackerSupportedPayloadTypesComponent {
        private final CartDomainAnalyticsPayloadTypesModule cartDomainAnalyticsPayloadTypesModule;
        private final CheckoutGeoAnalyticsPayloadTypesModule checkoutGeoAnalyticsPayloadTypesModule;
        private final FreshSupportedPayloadTypesModule freshSupportedPayloadTypesModule;
        private final MonetizationOzonTrackerSupportedPayloadTypesModule monetizationOzonTrackerSupportedPayloadTypesModule;
        private final OzonTrackerSupportedPayloadTypesComponentImpl ozonTrackerSupportedPayloadTypesComponentImpl;
        private final OzonTrackerSupportedPayloadTypesModule ozonTrackerSupportedPayloadTypesModule;
        private final ReviewsOzonTrackerSupportedPayloadTypesModule reviewsOzonTrackerSupportedPayloadTypesModule;
        private final SearchOzonTrackerSupportedPayloadTypesModule searchOzonTrackerSupportedPayloadTypesModule;
        private final StoreFrontOzonTrackerSupportedPayloadTypesModule storeFrontOzonTrackerSupportedPayloadTypesModule;

        /* synthetic */ OzonTrackerSupportedPayloadTypesComponentImpl(OzonTrackerSupportedPayloadTypesModule ozonTrackerSupportedPayloadTypesModule, SearchOzonTrackerSupportedPayloadTypesModule searchOzonTrackerSupportedPayloadTypesModule, ReviewsOzonTrackerSupportedPayloadTypesModule reviewsOzonTrackerSupportedPayloadTypesModule, FreshSupportedPayloadTypesModule freshSupportedPayloadTypesModule, CartDomainAnalyticsPayloadTypesModule cartDomainAnalyticsPayloadTypesModule, StoreFrontOzonTrackerSupportedPayloadTypesModule storeFrontOzonTrackerSupportedPayloadTypesModule, MonetizationOzonTrackerSupportedPayloadTypesModule monetizationOzonTrackerSupportedPayloadTypesModule, CheckoutGeoAnalyticsPayloadTypesModule checkoutGeoAnalyticsPayloadTypesModule, int i11) {
            this(ozonTrackerSupportedPayloadTypesModule, searchOzonTrackerSupportedPayloadTypesModule, reviewsOzonTrackerSupportedPayloadTypesModule, freshSupportedPayloadTypesModule, cartDomainAnalyticsPayloadTypesModule, storeFrontOzonTrackerSupportedPayloadTypesModule, monetizationOzonTrackerSupportedPayloadTypesModule, checkoutGeoAnalyticsPayloadTypesModule);
        }

        @Override // ru.ozon.app.android.composer.di.OzonTrackerSupportedPayloadTypesComponentApi
        public Set<a> getOzonTrackerSupportedPayloadTypes() {
            A.a m11 = A.m(8);
            m11.l(OzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypesFactory.provideSupportedPayloadTypes(this.ozonTrackerSupportedPayloadTypesModule));
            m11.l(SearchOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$search_prodGoogleAllVendorsReleaseFactory.provideSupportedPayloadTypes$search_prodGoogleAllVendorsRelease(this.searchOzonTrackerSupportedPayloadTypesModule));
            m11.l(ReviewsOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$core_prodGoogleAllVendorsReleaseFactory.provideSupportedPayloadTypes$core_prodGoogleAllVendorsRelease(this.reviewsOzonTrackerSupportedPayloadTypesModule));
            m11.l(FreshSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$widgets_prodGoogleAllVendorsReleaseFactory.provideSupportedPayloadTypes$widgets_prodGoogleAllVendorsRelease(this.freshSupportedPayloadTypesModule));
            m11.l(CartDomainAnalyticsPayloadTypesModule_ProvideSupportedPayloadTypes$cart_prodGoogleAllVendorsReleaseFactory.provideSupportedPayloadTypes$cart_prodGoogleAllVendorsRelease(this.cartDomainAnalyticsPayloadTypesModule));
            m11.l(StoreFrontOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$storefront_prodGoogleAllVendorsReleaseFactory.provideSupportedPayloadTypes$storefront_prodGoogleAllVendorsRelease(this.storeFrontOzonTrackerSupportedPayloadTypesModule));
            m11.l(MonetizationOzonTrackerSupportedPayloadTypesModule_ProvideSupportedPayloadTypes$monetization_prodGoogleAllVendorsReleaseFactory.provideSupportedPayloadTypes$monetization_prodGoogleAllVendorsRelease(this.monetizationOzonTrackerSupportedPayloadTypesModule));
            m11.l(CheckoutGeoAnalyticsPayloadTypesModule_ProvideSupportedPayloadTypes$checkout_geo_prodGoogleAllVendorsReleaseFactory.provideSupportedPayloadTypes$checkout_geo_prodGoogleAllVendorsRelease(this.checkoutGeoAnalyticsPayloadTypesModule));
            return m11.m();
        }

        private OzonTrackerSupportedPayloadTypesComponentImpl(OzonTrackerSupportedPayloadTypesModule ozonTrackerSupportedPayloadTypesModule, SearchOzonTrackerSupportedPayloadTypesModule searchOzonTrackerSupportedPayloadTypesModule, ReviewsOzonTrackerSupportedPayloadTypesModule reviewsOzonTrackerSupportedPayloadTypesModule, FreshSupportedPayloadTypesModule freshSupportedPayloadTypesModule, CartDomainAnalyticsPayloadTypesModule cartDomainAnalyticsPayloadTypesModule, StoreFrontOzonTrackerSupportedPayloadTypesModule storeFrontOzonTrackerSupportedPayloadTypesModule, MonetizationOzonTrackerSupportedPayloadTypesModule monetizationOzonTrackerSupportedPayloadTypesModule, CheckoutGeoAnalyticsPayloadTypesModule checkoutGeoAnalyticsPayloadTypesModule) {
            this.ozonTrackerSupportedPayloadTypesComponentImpl = this;
            this.ozonTrackerSupportedPayloadTypesModule = ozonTrackerSupportedPayloadTypesModule;
            this.searchOzonTrackerSupportedPayloadTypesModule = searchOzonTrackerSupportedPayloadTypesModule;
            this.reviewsOzonTrackerSupportedPayloadTypesModule = reviewsOzonTrackerSupportedPayloadTypesModule;
            this.freshSupportedPayloadTypesModule = freshSupportedPayloadTypesModule;
            this.cartDomainAnalyticsPayloadTypesModule = cartDomainAnalyticsPayloadTypesModule;
            this.storeFrontOzonTrackerSupportedPayloadTypesModule = storeFrontOzonTrackerSupportedPayloadTypesModule;
            this.monetizationOzonTrackerSupportedPayloadTypesModule = monetizationOzonTrackerSupportedPayloadTypesModule;
            this.checkoutGeoAnalyticsPayloadTypesModule = checkoutGeoAnalyticsPayloadTypesModule;
        }
    }

    public static OzonTrackerSupportedPayloadTypesComponent.Factory factory() {
        return new Factory(0);
    }
}
