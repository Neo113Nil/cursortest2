package ru.ozon.app.android.ugc.di.modules;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.ugc.deeplink.AdditionalReviewDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.EditReviewDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.EditReviewModalDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.EmptyTestPageDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.NewQuestionFormDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.NewReviewDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.NewReviewTestDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.OtherSellersListDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.PdpReviewDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.ProfileInputsBottomSheetDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.QuestionsDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.RateAppTestDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.RatingStatisticBottomSheetDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.ReviewAspectsDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.ReviewFormPolicyWebViewDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.SelectionFormAddProductsDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.SelectionFormDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.SelectionSwipeZoneDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.SelectionViewDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.SelectionsAdultAttentionModalDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.SelectionsDetailsWebViewDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.SelectionsListDeeplinkHandler;
import ru.ozon.app.android.ugc.deeplink.UpdateReviewDeeplinkHandler;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/di/modules/UgcNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "Lru/ozon/app/android/utils/AppType;", "appType", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcNavigationModule {

    @NotNull
    public static final UgcNavigationModule INSTANCE = new UgcNavigationModule();

    private UgcNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FeatureChecker featureChecker, @NotNull DomainsInteractor domainsInteractor, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return e0.b(new PdpReviewDeeplinkHandler(authDestinationInterceptor), new NewReviewTestDeeplinkHandler(), new NewReviewDeeplinkHandler(authDestinationInterceptor), new EditReviewDeeplinkHandler(authDestinationInterceptor), new OtherSellersListDeeplinkHandler(), new QuestionsDeeplinkHandler(), new NewQuestionFormDeeplinkHandler(authDestinationInterceptor), new AdditionalReviewDeeplinkHandler(appType, featureChecker), new UpdateReviewDeeplinkHandler(), new ReviewAspectsDeeplinkHandler(), new ReviewFormPolicyWebViewDeeplinkHandler(domainsInteractor), new SelectionsDetailsWebViewDeeplinkHandler(domainsInteractor), new RatingStatisticBottomSheetDeeplinkHandler(), new SelectionFormDeeplinkHandler(authDestinationInterceptor), new SelectionFormAddProductsDeeplinkHandler(authDestinationInterceptor), new SelectionsAdultAttentionModalDeeplinkHandler(authDestinationInterceptor), new SelectionViewDeeplinkHandler(), new SelectionsListDeeplinkHandler(), new EmptyTestPageDeeplinkHandler(), new RateAppTestDeeplinkHandler(), new ProfileInputsBottomSheetDeeplinkHandler(), new SelectionSwipeZoneDeeplinkHandler(), new EditReviewModalDeeplinkHandler(authDestinationInterceptor));
    }
}
