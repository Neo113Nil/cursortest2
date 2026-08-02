package ru.ozon.app.android.di.module;

import AZ.a;
import B90.C2604f;
import Ds.C2880a;
import KZ.c;
import KZ.d;
import android.app.Activity;
import androidx.fragment.app.r;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.navigation.BankGlobalDeeplinkInterceptor;
import ru.ozon.app.android.composer.navigations.ComposerRedirectInterceptor;
import ru.ozon.app.android.core.navigation.page.CommonPageProviderImpl;
import ru.ozon.app.android.di.module.NavigationDependenciesModule;
import ru.ozon.app.android.limb2.Limb2DeeplinkInterceptor;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonFreshGlobalDeeplinkInterceptor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonSelectGlobalDeeplinkInterceptor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonTravelGlobalDeeplinkInterceptor;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.search.deeplink.SourceGlobalDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.BrowserToWebViewGlobalDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.CategoryReviewDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.OzonWebViewDeeplinkInterceptor;
import ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor;
import ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.deeplinkInterceptor.FailedExternalLinkRetryInterceptor;
import ru.ozon.app.android.utils.AppType;
import yZ.InterfaceC10874a;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJe\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001f2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/di/module/NavigationDependenciesModule;", "", "<init>", "()V", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "interactor", "LnZ/a$c;", "provideNavigationConfig", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/navigation/NativePageDomainsInteractor;)LnZ/a$c;", "Lru/ozon/app/android/limb2/Limb2DeeplinkInterceptor;", "limb2DeeplinkInterceptor", "Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;", "bankInterceptor", "Lru/ozon/app/android/search/deeplink/SourceGlobalDeeplinkInterceptor;", "sourceInterceptor", "Lru/ozon/app/android/navigation/globalinterceptors/deeplink/OzonTravelGlobalDeeplinkInterceptor;", "travelInterceptor", "Lru/ozon/app/android/storefront/deeplinkhandlers/CategoryReviewDeeplinkInterceptor;", "categoryInterceptor", "Lru/ozon/app/android/navigation/globalinterceptors/deeplink/OzonFreshGlobalDeeplinkInterceptor;", "freshInterceptor", "Lru/ozon/app/android/navigation/globalinterceptors/deeplink/OzonSelectGlobalDeeplinkInterceptor;", "selectInterceptor", "Lru/ozon/app/android/storefront/deeplinkhandlers/OzonWebViewDeeplinkInterceptor;", "webViewInterceptor", "Lru/ozon/app/android/storefront/deeplinkhandlers/BrowserToWebViewGlobalDeeplinkInterceptor;", "browserInterceptor", "Lru/ozon/app/android/universalwidgets/failedExternalLinkRetry/deeplinkInterceptor/FailedExternalLinkRetryInterceptor;", "failedExternalLinkRetryInterceptor", "", "LKZ/c;", "provideDeeplinkInterceptors", "(Lru/ozon/app/android/limb2/Limb2DeeplinkInterceptor;Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;Lru/ozon/app/android/search/deeplink/SourceGlobalDeeplinkInterceptor;Lru/ozon/app/android/navigation/globalinterceptors/deeplink/OzonTravelGlobalDeeplinkInterceptor;Lru/ozon/app/android/storefront/deeplinkhandlers/CategoryReviewDeeplinkInterceptor;Lru/ozon/app/android/navigation/globalinterceptors/deeplink/OzonFreshGlobalDeeplinkInterceptor;Lru/ozon/app/android/navigation/globalinterceptors/deeplink/OzonSelectGlobalDeeplinkInterceptor;Lru/ozon/app/android/storefront/deeplinkhandlers/OzonWebViewDeeplinkInterceptor;Lru/ozon/app/android/storefront/deeplinkhandlers/BrowserToWebViewGlobalDeeplinkInterceptor;Lru/ozon/app/android/universalwidgets/failedExternalLinkRetry/deeplinkInterceptor/FailedExternalLinkRetryInterceptor;)[LKZ/c;", "Lru/ozon/app/android/switchUser/SwitchUserDestinationInterceptor;", "switchUserDestinationInterceptor", "LKZ/d;", "provideDestinationInterceptors", "(Lru/ozon/app/android/switchUser/SwitchUserDestinationInterceptor;)[LKZ/d;", "LGZ/a;", "provideCommonPageProvider", "()LGZ/a;", "LyZ/a;", "provideCustomActivityNavigatorChecker", "()LyZ/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationDependenciesModule {

    @NotNull
    public static final NavigationDependenciesModule INSTANCE = new NavigationDependenciesModule();

    private NavigationDependenciesModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideCustomActivityNavigatorChecker$lambda$2(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(activity, NetworkOzonIdComponentApi.class).getDependencyStorage();
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        return ((NetworkOzonIdComponentApi) dependencyStorage.b(NetworkOzonIdComponentApi.class)).getOzonIdAppApi().p(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideNavigationConfig$lambda$0(NativePageDomainsInteractor nativePageDomainsInteractor, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return nativePageDomainsInteractor.isHostContainsInNativePageDomains(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideNavigationConfig$lambda$1(a.C0019a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getClass();
        LoggerExtKt.sendLog("OzonCompass", it.a());
    }

    @NotNull
    public final GZ.a provideCommonPageProvider() {
        return new CommonPageProviderImpl();
    }

    @NotNull
    public final InterfaceC10874a provideCustomActivityNavigatorChecker() {
        return new InterfaceC10874a() { // from class: Ds.b
            @Override // yZ.InterfaceC10874a
            public final boolean a(r rVar) {
                boolean provideCustomActivityNavigatorChecker$lambda$2;
                provideCustomActivityNavigatorChecker$lambda$2 = NavigationDependenciesModule.provideCustomActivityNavigatorChecker$lambda$2(rVar);
                return provideCustomActivityNavigatorChecker$lambda$2;
            }
        };
    }

    @NotNull
    public final c[] provideDeeplinkInterceptors(@NotNull Limb2DeeplinkInterceptor limb2DeeplinkInterceptor, @NotNull BankGlobalDeeplinkInterceptor bankInterceptor, @NotNull SourceGlobalDeeplinkInterceptor sourceInterceptor, @NotNull OzonTravelGlobalDeeplinkInterceptor travelInterceptor, @NotNull CategoryReviewDeeplinkInterceptor categoryInterceptor, @NotNull OzonFreshGlobalDeeplinkInterceptor freshInterceptor, @NotNull OzonSelectGlobalDeeplinkInterceptor selectInterceptor, @NotNull OzonWebViewDeeplinkInterceptor webViewInterceptor, @NotNull BrowserToWebViewGlobalDeeplinkInterceptor browserInterceptor, @NotNull FailedExternalLinkRetryInterceptor failedExternalLinkRetryInterceptor) {
        Intrinsics.checkNotNullParameter(limb2DeeplinkInterceptor, "limb2DeeplinkInterceptor");
        Intrinsics.checkNotNullParameter(bankInterceptor, "bankInterceptor");
        Intrinsics.checkNotNullParameter(sourceInterceptor, "sourceInterceptor");
        Intrinsics.checkNotNullParameter(travelInterceptor, "travelInterceptor");
        Intrinsics.checkNotNullParameter(categoryInterceptor, "categoryInterceptor");
        Intrinsics.checkNotNullParameter(freshInterceptor, "freshInterceptor");
        Intrinsics.checkNotNullParameter(selectInterceptor, "selectInterceptor");
        Intrinsics.checkNotNullParameter(webViewInterceptor, "webViewInterceptor");
        Intrinsics.checkNotNullParameter(browserInterceptor, "browserInterceptor");
        Intrinsics.checkNotNullParameter(failedExternalLinkRetryInterceptor, "failedExternalLinkRetryInterceptor");
        return new c[]{limb2DeeplinkInterceptor, bankInterceptor, sourceInterceptor, travelInterceptor, categoryInterceptor, freshInterceptor, selectInterceptor, webViewInterceptor, browserInterceptor, failedExternalLinkRetryInterceptor};
    }

    @NotNull
    public final d[] provideDestinationInterceptors(@NotNull SwitchUserDestinationInterceptor switchUserDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(switchUserDestinationInterceptor, "switchUserDestinationInterceptor");
        return new d[]{new ComposerRedirectInterceptor(), switchUserDestinationInterceptor};
    }

    @NotNull
    public final C8475a.c provideNavigationConfig(@NotNull AppType appType, @NotNull NativePageDomainsInteractor interactor) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        C8475a.c.C1294a c1294a = new C8475a.c.C1294a(appType == AppType.FRESH ? "supermarket" : "main");
        c1294a.d("ozon", "ozonselect", "ozontech", "bank100000000273", "ozonplatiqr", "https", "http");
        c1294a.c(new C2604f(interactor));
        c1294a.b(new C2880a());
        return c1294a.a();
    }
}
