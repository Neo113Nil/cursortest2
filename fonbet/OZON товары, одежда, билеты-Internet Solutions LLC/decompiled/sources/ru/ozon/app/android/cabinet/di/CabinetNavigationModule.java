package ru.ozon.app.android.cabinet.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.cabinet.deeplink.AddLegalAddressDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.AddLegalDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.AddLegalInnDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.AuthDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.CabinetDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ChangeNameDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ChangeOrderRecipientDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.CheckLegalInfoDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ComplainDeliveryDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.CurrencySelectorDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ExternalVerificationDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.LanguageSelectorDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.LoginDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.OzonIdRecoveryDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ProfileBirthdayDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ProfileGenderDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ProfilePointsDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ProfileSettingsDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.ProfileSettingsSecurityDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.SberIdAuthDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.SelectOrderCardDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.SocialProfileSettingsDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.TechLoginDeeplinkHandler;
import ru.ozon.app.android.cabinet.deeplink.UserCardsDeeplinkHandler;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;
import ru.ozon.app.android.domain.session.repository.mappers.AuthFlowMapper;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cabinet/di/CabinetNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;", "authDeeplinkReceiver", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "authInteractor", "Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "authFlowMapper", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "Lru/ozon/app/android/utils/AppType;", "appType", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/account/user/UserManager;Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;Lru/ozon/app/android/domain/session/interactors/AuthInteractor;Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CabinetNavigationModule {

    @NotNull
    public static final CabinetNavigationModule INSTANCE = new CabinetNavigationModule();

    private CabinetNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull UserManager userManager, @NotNull AuthDeeplinkReceiver authDeeplinkReceiver, @NotNull AuthInteractor authInteractor, @NotNull AuthFlowMapper authFlowMapper, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(authDeeplinkReceiver, "authDeeplinkReceiver");
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(authFlowMapper, "authFlowMapper");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return e0.b(new LoginDeeplinkHandler(authDestinationInterceptor), new ProfileSettingsDeeplinkHandler(authDestinationInterceptor), new ChangeNameDeeplinkHandler(userManager), new ComplainDeliveryDeeplinkHandler(), new CurrencySelectorDeeplinkHandler(), new ExternalVerificationDeeplinkHandler(), new ProfileBirthdayDeeplinkHandler(authDestinationInterceptor), new ProfileGenderDeeplinkHandler(authDestinationInterceptor), new ProfilePointsDeeplinkHandler(authDestinationInterceptor), new ProfileSettingsSecurityDeeplinkHandler(authDestinationInterceptor), new AuthDeeplinkHandler(authDestinationInterceptor), new OzonIdRecoveryDeeplinkHandler(authDestinationInterceptor), new SberIdAuthDeeplinkHandler(authDeeplinkReceiver), new TechLoginDeeplinkHandler(authInteractor, authFlowMapper, atMostQaUserDestinationInterceptor), new UserCardsDeeplinkHandler(authDestinationInterceptor), new ChangeOrderRecipientDeeplinkHandler(authDestinationInterceptor), new AddLegalDeeplinkHandler(), new AddLegalInnDeeplinkHandler(authDestinationInterceptor), new AddLegalAddressDeeplinkHandler(authDestinationInterceptor), new CheckLegalInfoDeeplinkHandler(authDestinationInterceptor), new LanguageSelectorDeeplinkHandler(), new SocialProfileSettingsDeeplinkHandler(appType, authDestinationInterceptor), new SelectOrderCardDeeplinkHandler(authDestinationInterceptor), new CabinetDeeplinkHandler());
    }
}
