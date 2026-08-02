package ru.ozon.app.android.injection;

import GZ.g;
import GZ.k;
import IZ.a;
import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.navigation.BankAuthDestinationInterceptor;
import ru.ozon.app.android.bank.navigation.BankDeeplinkHandler;
import ru.ozon.app.android.bank.navigation.BankGlobalDeeplinkInterceptor;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.core.navigation.deeplink.ClearToRootTabDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.CloseMiniAppDeeplink;
import ru.ozon.app.android.core.navigation.deeplink.ExternalBrowserDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.ExternalOzonAppDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.LimbDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.ModalDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.commonNavigation.ClearAppBackStackDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.commonNavigation.PopBackStackDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.miniapp.MiniAppWebViewDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.storefront.SwitchProfileDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.storefront.search.SearchResultDeeplinkHandler;
import ru.ozon.app.android.core.navigation.deeplink.storefront.web.WebViewAuthDestinationInterceptor;
import ru.ozon.app.android.core.navigation.deeplink.storefront.web.WebViewDeeplinkHandler;
import ru.ozon.app.android.deeplinks.KeepActivityHandler;
import ru.ozon.app.android.fakeOzon.FakeOzonAppHandler;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.messenger.deeplink.ChatDeeplinkHandler;
import ru.ozon.app.android.messenger.deeplink.ChatListDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerChatsDeeplinkHandler;
import ru.ozon.app.android.navigation.KeepActivityHandlerImpl;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.pdp.deeplink.PdfViewerDeeplinkHandler;
import ru.ozon.app.android.pdp.deeplink.ProductDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.AIConversationDeeplinkHandler;
import ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler;
import ru.ozon.app.android.session.deeplinks.ConfirmAgeWithMaxStatusDeeplinkHandler;
import ru.ozon.app.android.session.loginWithApp.ConfirmAuthWithAppDeeplinkHandler;
import ru.ozon.app.android.session.loginWithApp.ConfirmAuthWithQrDeeplinkHandler;
import ru.ozon.app.android.session.vkid.MyOzonIdOzonIdDeeplinkHandler;
import ru.ozon.app.android.session.vkid.StartVKIDLinkToOzonIdDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.onboarding.NewcomerOnboardingDeeplinkHandler;
import ru.ozon.app.android.ugc.core.deeplink.ProfileReviewsDeeplinkHandler;
import ru.ozon.app.android.web.webview.ai.CheckAiConversation;
import ru.ozon.app.android.whitelist.common.WhiteListDomainsOzonAppsHandler;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/injection/NavigationModule;", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NavigationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJÓ\u0001\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u001d2\b\b\u0001\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u000e\b\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u000e\b\u0001\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)2\u000e\b\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/injection/NavigationModule$Companion;", "", "<init>", "()V", "LGZ/k;", "routeFactory", "Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;", "bankGlobalDeeplinkInterceptor", "Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "provideKeepDeeplinkActivityOnExternalDeeplink", "(LGZ/k;Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;)Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "Lru/ozon/app/android/core/navigation/deeplink/storefront/web/WebViewAuthDestinationInterceptor;", "webViewAuthDestinationInterceptor", "Lru/ozon/app/android/whitelist/common/WhiteListDomainsOzonAppsHandler;", "whiteListDomainsOzonAppsHandler", "LHZ/a;", "deeplinkHandlersCache", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "freshPdpInBottomSheetHandler", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "externalFintechSettingsBank", "externalFintechSettingsRko", "externalFintechSettingsPay", "LGZ/g;", "ozonRouter", "LOb0/a;", "ozonIdAppApi", "Lru/ozon/app/android/bank/navigation/BankAuthDestinationInterceptor;", "bankAuthDestinationInterceptor", "Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "checkAiConversation", "LIb/a;", "Lru/ozon/android/messenger/api/a;", "messengerFeature", "aiMessengerFeature", "bloggerMessengerFeature", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Landroid/content/Context;Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;Lru/ozon/app/android/core/navigation/deeplink/storefront/web/WebViewAuthDestinationInterceptor;Lru/ozon/app/android/whitelist/common/WhiteListDomainsOzonAppsHandler;LHZ/a;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;LGZ/g;LOb0/a;Lru/ozon/app/android/bank/navigation/BankAuthDestinationInterceptor;Lru/ozon/app/android/web/webview/ai/CheckAiConversation;LIb/a;LIb/a;LIb/a;Lru/ozon/app/android/cart/common/domain/CartService;)Ljava/util/Set;", "LBZ/a;", "provideFakeOzonAppHandler", "()LBZ/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<a> provideDeeplinkHandlersSet(@NotNull Context context, @NotNull DomainsInteractor domainsInteractor, @NotNull WebViewAuthDestinationInterceptor webViewAuthDestinationInterceptor, @NotNull WhiteListDomainsOzonAppsHandler whiteListDomainsOzonAppsHandler, @NotNull HZ.a deeplinkHandlersCache, @NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler, @NotNull ExternalFintechSettings externalFintechSettingsBank, @NotNull ExternalFintechSettings externalFintechSettingsRko, @NotNull ExternalFintechSettings externalFintechSettingsPay, @NotNull g ozonRouter, @NotNull Ob0.a ozonIdAppApi, @NotNull BankAuthDestinationInterceptor bankAuthDestinationInterceptor, @NotNull CheckAiConversation checkAiConversation, @NotNull Ib.a<ru.ozon.android.messenger.api.a> messengerFeature, @NotNull Ib.a<ru.ozon.android.messenger.api.a> aiMessengerFeature, @NotNull Ib.a<ru.ozon.android.messenger.api.a> bloggerMessengerFeature, @NotNull CartService cartService) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
            Intrinsics.checkNotNullParameter(webViewAuthDestinationInterceptor, "webViewAuthDestinationInterceptor");
            Intrinsics.checkNotNullParameter(whiteListDomainsOzonAppsHandler, "whiteListDomainsOzonAppsHandler");
            Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
            Intrinsics.checkNotNullParameter(freshPdpInBottomSheetHandler, "freshPdpInBottomSheetHandler");
            Intrinsics.checkNotNullParameter(externalFintechSettingsBank, "externalFintechSettingsBank");
            Intrinsics.checkNotNullParameter(externalFintechSettingsRko, "externalFintechSettingsRko");
            Intrinsics.checkNotNullParameter(externalFintechSettingsPay, "externalFintechSettingsPay");
            Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
            Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
            Intrinsics.checkNotNullParameter(bankAuthDestinationInterceptor, "bankAuthDestinationInterceptor");
            Intrinsics.checkNotNullParameter(checkAiConversation, "checkAiConversation");
            Intrinsics.checkNotNullParameter(messengerFeature, "messengerFeature");
            Intrinsics.checkNotNullParameter(aiMessengerFeature, "aiMessengerFeature");
            Intrinsics.checkNotNullParameter(bloggerMessengerFeature, "bloggerMessengerFeature");
            Intrinsics.checkNotNullParameter(cartService, "cartService");
            return e0.b(new ExternalBrowserDeeplinkHandler(), new ExternalOzonAppDeeplinkHandler(whiteListDomainsOzonAppsHandler), new BankDeeplinkHandler(context, externalFintechSettingsRko, externalFintechSettingsBank, externalFintechSettingsPay, bankAuthDestinationInterceptor), new WebViewDeeplinkHandler(domainsInteractor, featureChecker, checkAiConversation, webViewAuthDestinationInterceptor), new LimbDeeplinkHandler(), new PdfViewerDeeplinkHandler(domainsInteractor), new MiniAppWebViewDeeplinkHandler(), new PopBackStackDeeplinkHandler(), new ClearAppBackStackDeeplinkHandler(), new CloseMiniAppDeeplink(), new SwitchProfileDeeplinkHandler(), new ModalDeeplinkHandler(deeplinkHandlersCache), new NewcomerOnboardingDeeplinkHandler(), new ClearToRootTabDeeplinkHandler(), new ProfileReviewsDeeplinkHandler(authDestinationInterceptor), new AccountRecoveryStartDeeplinkHandler(authDestinationInterceptor, ozonRouter, ozonIdAppApi), new StartVKIDLinkToOzonIdDeeplinkHandler(ozonIdAppApi), new MyOzonIdOzonIdDeeplinkHandler(), new ConfirmAuthWithAppDeeplinkHandler(authDestinationInterceptor), new ConfirmAuthWithQrDeeplinkHandler(authDestinationInterceptor), new ConfirmAgeWithMaxStatusDeeplinkHandler(authDestinationInterceptor), new ChatListDeeplinkHandler(messengerFeature, cartService, ozonRouter), new ChatDeeplinkHandler(authDestinationInterceptor, messengerFeature, cartService, ozonRouter), new AIConversationDeeplinkHandler(aiMessengerFeature, cartService, ozonRouter, featureChecker), new BloggerChatsDeeplinkHandler(bloggerMessengerFeature), new ProductDeeplinkHandler(featureChecker, freshPdpInBottomSheetHandler), new SearchResultDeeplinkHandler(featureChecker, featureService));
        }

        @NotNull
        public final BZ.a provideFakeOzonAppHandler() {
            return new FakeOzonAppHandler();
        }

        @NotNull
        public final KeepActivityHandler provideKeepDeeplinkActivityOnExternalDeeplink(@NotNull k routeFactory, @NotNull BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor) {
            Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
            Intrinsics.checkNotNullParameter(bankGlobalDeeplinkInterceptor, "bankGlobalDeeplinkInterceptor");
            return new KeepActivityHandlerImpl(bankGlobalDeeplinkInterceptor, routeFactory);
        }

        private Companion() {
        }
    }
}
