package ru.ozon.app.android.travel.feature.general.common.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.feature.general.common.deeplink.BonusCardInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.ChangePaymentsMethodDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.ConfirmIconSwitchDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.MissionCommentsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.MissionDetailsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.MissionNewCommentPopupDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.ModalCalendarDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.ModalGuestsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.ModalWaitForCallDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.PassengersDirectoryDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.PassengersMatcherDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.PromoNativeDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.ReturnPolicyDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TopTravelModalDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelAccountBalanceInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelAccountBalanceReplenishmentDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelBookingTimeoutDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelCalendarDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelCheckoutDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelCheckoutModalDeepLinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelCountriesDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelCreditLimitPaymentDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelFeedDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelFilterValuesDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelFiltersDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelFullScreenDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelIconThemeChooserDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelMainDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelMainHotelDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelModalDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelModalEditableSearchFormDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelModalFiltersDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelModalPaymentsListDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelModalReferralLinkDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelOrderDetailsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelOrderInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelOrderListDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelOrderSegmentInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelOrderServiceInfoDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelPassengerCategorySelectionDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelPopularBankListDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelPriceDetailInformationDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelPromoNativeDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelRegionDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelRegionReviewCommentsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelRegionReviewCurtainDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelSearchBankListDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelSearchPointsDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelSnapshotTestDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelSupportDeeplinkHandler;
import ru.ozon.app.android.travel.feature.general.common.deeplink.TravelThankYouDeeplinkHandler;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.BackgroundColorDestinationBehavior;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/di/TravelGeneralNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "travelFunnelFullScreenDestinationBehavior", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/BackgroundColorDestinationBehavior;", "travelFunnelBackgroundDestinationBehavior", "LHZ/a;", "deeplinkHandlersCache", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/BackgroundColorDestinationBehavior;LHZ/a;)Ljava/util/Set;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelGeneralNavigationModule {

    @NotNull
    public static final TravelGeneralNavigationModule INSTANCE = new TravelGeneralNavigationModule();

    private TravelGeneralNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull FullScreenDestinationBehavior travelFunnelFullScreenDestinationBehavior, @NotNull BackgroundColorDestinationBehavior travelFunnelBackgroundDestinationBehavior, @NotNull HZ.a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(travelFunnelFullScreenDestinationBehavior, "travelFunnelFullScreenDestinationBehavior");
        Intrinsics.checkNotNullParameter(travelFunnelBackgroundDestinationBehavior, "travelFunnelBackgroundDestinationBehavior");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        return e0.b(new TravelSearchPointsDeeplinkHandler(), new TravelCalendarDeeplinkHandler(), new BonusCardInfoDeeplinkHandler(authDestinationInterceptor), new TravelCreditLimitPaymentDeeplinkHandler(authDestinationInterceptor), new TravelFiltersDeeplinkHandler(deeplinkHandlersCache), new ModalWaitForCallDeeplinkHandler(), new TravelFilterValuesDeeplinkHandler(), new TravelModalReferralLinkDeeplinkHandler(authDestinationInterceptor), new TravelModalPaymentsListDeeplinkHandler(authDestinationInterceptor), new TravelOrderInfoDeeplinkHandler(authDestinationInterceptor), new TravelOrderSegmentInfoDeeplinkHandler(authDestinationInterceptor), new TravelOrderServiceInfoDeeplinkHandler(), new TravelPassengerCategorySelectionDeeplinkHandler(), new TravelPriceDetailInformationDeeplinkHandler(), new ReturnPolicyDeeplinkHandler(), new TravelMainDeeplinkHandler(), new TravelMainHotelDeeplinkHandler(), new PassengersDirectoryDeeplinkHandler(authDestinationInterceptor), new PassengersMatcherDeeplinkHandler(authDestinationInterceptor, travelFunnelFullScreenDestinationBehavior), new TopTravelModalDeeplinkHandler(authDestinationInterceptor), new TravelFullScreenDeeplinkHandler(), new TravelAccountBalanceInfoDeeplinkHandler(), new TravelAccountBalanceReplenishmentDeeplinkHandler(), new TravelModalDeeplinkHandler(deeplinkHandlersCache), new TravelModalEditableSearchFormDeeplinkHandler(), new TravelThankYouDeeplinkHandler(), new TravelSnapshotTestDeeplinkHandler(atMostQaUserDestinationInterceptor, travelFunnelFullScreenDestinationBehavior, travelFunnelBackgroundDestinationBehavior), new TravelBookingTimeoutDeeplinkHandler(), new TravelCountriesDeeplinkHandler(), new ChangePaymentsMethodDeeplinkHandler(), new TravelSearchBankListDeeplinkHandler(authDestinationInterceptor), new TravelPopularBankListDeeplinkHandler(authDestinationInterceptor), new MissionDetailsDeeplinkHandler(authDestinationInterceptor), new MissionCommentsDeeplinkHandler(authDestinationInterceptor), new MissionNewCommentPopupDeeplinkHandler(authDestinationInterceptor), new ModalCalendarDeeplinkHandler(), new ModalGuestsDeeplinkHandler(), new TravelPromoNativeDeeplinkHandler(deeplinkHandlersCache), new TravelModalFiltersDeeplinkHandler(), new TravelFeedDeeplinkHandler(), new TravelRegionDeeplinkHandler(), new TravelRegionReviewCommentsDeeplinkHandler(), new TravelRegionReviewCurtainDeeplinkHandler(), new PromoNativeDeeplinkHandler(), new TravelSupportDeeplinkHandler(authDestinationInterceptor), new TravelCheckoutModalDeepLinkHandler(authDestinationInterceptor), new TravelCheckoutDeeplinkHandler(authDestinationInterceptor), new TravelOrderDetailsDeeplinkHandler(authDestinationInterceptor), new TravelOrderListDeeplinkHandler(), new TravelIconThemeChooserDeeplinkHandler(), new ConfirmIconSwitchDeeplinkHandler());
    }
}
