package ru.ozon.app.android.deeplinks;

import Cm.RunnableC2781a;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.g;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener;
import ru.ozon.app.android.deeplinks.di.DaggerDeeplinkActivityComponent;
import ru.ozon.app.android.deeplinks.di.DeeplinkActivityComponent;
import ru.ozon.app.android.deeplinks.di.DeeplinkActivityComponentDependencies;
import ru.ozon.app.android.fresh.feature.entry.R$string;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.select.feature.entry.R$layout;
import ru.ozon.app.android.select.feature.entry.R$style;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.TabsSource;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.ContextUtilsKt;
import yZ.f;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010\rR\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010X\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lru/ozon/app/android/deeplinks/DeeplinkActivity;", "Landroidx/appcompat/app/g;", "LyZ/f;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "disableTransitionAnimation", "", "isOneLink", "", "getContentViewLayoutRes", "(Z)Ljava/lang/Integer;", "modifyStandaloneAppDeeplinkScheme", "isSelectDeeplink", "(Landroid/content/Intent;)Z", "isSelectTechDeeplink", "isTravelDeeplinkScheme", "isTravelTechDeeplink", "isFreshDeeplink", "isFreshTechDeeplink", "getRuntimeTheme", "()I", "Landroid/net/Uri;", "deeplink", "referrer", "generateLaunchIntent", "(Landroid/net/Uri;Landroid/net/Uri;)Landroid/content/Intent;", "Lru/ozon/app/android/deeplinks/ExternalDeeplink;", "navigationModel", "fromOneLink", "navigateByRegularFlow", "(Lru/ozon/app/android/deeplinks/ExternalDeeplink;Z)V", "needWorkaroundAdbIssue", "()Z", "navIntent", "navigateByExternalDeeplink", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "homeDestinationFactory", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "getHomeDestinationFactory", "()Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "setHomeDestinationFactory", "(Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;)V", "Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "tabbarDeeplinksResolver", "Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "getTabbarDeeplinksResolver", "()Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "setTabbarDeeplinksResolver", "(Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;)V", "LPc/a;", "Lru/ozon/app/android/deeplinks/DeeplinkViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider$main_prodGoogleAllVendorsRelease", "()LPc/a;", "setViewModelProvider$main_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "appLaunchListener", "Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "getAppLaunchListener", "()Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "setAppLaunchListener", "(Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;)V", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "getUserStatusStorage", "()Lru/ozon/app/android/storage/user/UserStatusStorage;", "setUserStatusStorage", "(Lru/ozon/app/android/storage/user/UserStatusStorage;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "keepActivityHandler", "Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "getKeepActivityHandler", "()Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "setKeepActivityHandler", "(Lru/ozon/app/android/deeplinks/KeepActivityHandler;)V", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "externalDeeplinkProcessorDelegate", "Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "getExternalDeeplinkProcessorDelegate", "()Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;", "setExternalDeeplinkProcessorDelegate", "(Lru/ozon/app/android/platform/deeplink/ExternalDeeplinkProcessorDelegate;)V", "Landroid/os/Handler;", "handler$delegate", "LSc/j;", "getHandler", "()Landroid/os/Handler;", "handler", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeeplinkActivity extends g implements f {
    public AppLaunchListener appLaunchListener;
    public ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler = k.a(n.NONE, DeeplinkActivity$handler$2.INSTANCE);
    public HomeDestinationFactory homeDestinationFactory;
    public KeepActivityHandler keepActivityHandler;
    public GZ.g ozonRouter;
    public TabbarDeeplinksResolver tabbarDeeplinksResolver;
    public UserStatusStorage userStatusStorage;
    public a<DeeplinkViewModel> viewModelProvider;

    private final void disableTransitionAnimation() {
        if (Build.VERSION.SDK_INT < 34) {
            overridePendingTransition(0, 0);
        } else {
            overrideActivityTransition(1, 0, 0);
            overrideActivityTransition(0, 0, 0);
        }
    }

    private final Intent generateLaunchIntent(Uri deeplink, Uri referrer) {
        Intent a11 = HomeDestinationFactory.DefaultImpls.createActivityDestination$default(getHomeDestinationFactory(), this, null, 2, null).a();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            a11.putExtras(extras);
        }
        a11.putExtra("dkaDeeplink", deeplink);
        a11.putExtra("dkaReferrer", referrer);
        a11.addFlags(335544320);
        return a11;
    }

    private final Integer getContentViewLayoutRes(boolean isOneLink) {
        if (isTaskRoot()) {
            return Integer.valueOf(ContextUtilsKt.isOzonSelectApplication(this) ? R$layout.activity_ozon_select_deeplink : ContextUtilsKt.isOzonTravelApplication(this) ? ru.ozon.app.android.travel.feature.entry.R$layout.activity_ozon_travel_deeplink : ContextUtilsKt.isOzonFreshApplication(this) ? ru.ozon.app.android.fresh.feature.entry.R$layout.activity_ozon_fresh_deeplink : ru.ozon.app.android.main.R$layout.activity_deeplink);
        }
        if (isTaskRoot() || !isOneLink) {
            return null;
        }
        return Integer.valueOf(ru.ozon.app.android.main.R$layout.activity_deeplink_runtime);
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    private final int getRuntimeTheme() {
        return ContextUtilsKt.isOzonSelectApplication(this) ? R$style.OzonSelectTheme : ContextUtilsKt.isOzonTravelApplication(this) ? ru.ozon.app.android.travel.feature.entry.R$style.OzonTravelTheme : ContextUtilsKt.isOzonFreshApplication(this) ? ru.ozon.app.android.fresh.feature.entry.R$style.OzonFreshTheme : ru.ozon.app.android.uikit.R$style.OzonTheme;
    }

    private final boolean isFreshDeeplink(Intent intent) {
        if (!ContextUtilsKt.isOzonFreshApplication(this)) {
            return false;
        }
        String string = StringProvider.getString(R$string.fresh_deeplink_scheme);
        Uri data = intent.getData();
        return Intrinsics.d(data != null ? data.getScheme() : null, string);
    }

    private final boolean isFreshTechDeeplink(Intent intent) {
        if (!ContextUtilsKt.isOzonFreshApplication(this)) {
            return false;
        }
        String string = StringProvider.getString(R$string.fresh_deeplink_tech_scheme);
        Uri data = intent.getData();
        return Intrinsics.d(data != null ? data.getScheme() : null, string);
    }

    private final boolean isSelectDeeplink(Intent intent) {
        if (!ContextUtilsKt.isOzonSelectApplication(this)) {
            return false;
        }
        String string = StringProvider.getString(ru.ozon.app.android.select.feature.entry.R$string.select_deeplink_scheme);
        Uri data = intent.getData();
        return Intrinsics.d(data != null ? data.getScheme() : null, string);
    }

    private final boolean isSelectTechDeeplink(Intent intent) {
        if (!ContextUtilsKt.isOzonSelectApplication(this)) {
            return false;
        }
        String string = StringProvider.getString(ru.ozon.app.android.select.feature.entry.R$string.select_deeplink_tech_scheme);
        Uri data = intent.getData();
        return Intrinsics.d(data != null ? data.getScheme() : null, string);
    }

    private final boolean isTravelDeeplinkScheme(Intent intent) {
        if (!ContextUtilsKt.isOzonTravelApplication(this)) {
            return false;
        }
        String string = StringProvider.getString(ru.ozon.app.android.travel.feature.entry.R$string.travel_deeplink_scheme);
        Uri data = intent.getData();
        return Intrinsics.d(data != null ? data.getScheme() : null, string);
    }

    private final boolean isTravelTechDeeplink(Intent intent) {
        if (!ContextUtilsKt.isOzonTravelApplication(this)) {
            return false;
        }
        String string = StringProvider.getString(ru.ozon.app.android.travel.feature.entry.R$string.travel_deeplink_tech_scheme);
        Uri data = intent.getData();
        return Intrinsics.d(data != null ? data.getScheme() : null, string);
    }

    private final void modifyStandaloneAppDeeplinkScheme(Intent intent) {
        String string;
        Uri.Builder buildUpon;
        Uri.Builder scheme;
        if (isTravelDeeplinkScheme(intent) || isFreshDeeplink(intent) || isSelectDeeplink(intent)) {
            string = StringProvider.getString(ru.ozon.app.android.main.R$string.deeplink_scheme);
        } else if (!isFreshTechDeeplink(intent) && !isSelectTechDeeplink(intent) && !isTravelTechDeeplink(intent)) {
            return;
        } else {
            string = StringProvider.getString(ru.ozon.app.android.main.R$string.deeplink_scheme_tech);
        }
        Uri data = intent.getData();
        intent.setData((data == null || (buildUpon = data.buildUpon()) == null || (scheme = buildUpon.scheme(string)) == null) ? null : scheme.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateByExternalDeeplink(Intent navIntent) {
        Uri deeplink = getExternalDeeplinkProcessorDelegate().getDeeplink(navIntent);
        if (deeplink != null) {
            KeepActivityHandler keepActivityHandler = getKeepActivityHandler();
            String uri = deeplink.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            if (keepActivityHandler.shouldKeepActivityOnExternalDeeplink(uri)) {
                finish();
                getExternalDeeplinkProcessorDelegate().navigate(navIntent);
                return;
            }
        }
        finish();
        startActivity(navIntent);
    }

    private final void navigateByRegularFlow(ExternalDeeplink navigationModel, boolean fromOneLink) {
        Intent generateLaunchIntent = generateLaunchIntent(navigationModel.getLink(), navigationModel.getRef());
        if (isTaskRoot()) {
            startActivity(generateLaunchIntent);
            finish();
        } else if (fromOneLink || !needWorkaroundAdbIssue()) {
            navigateByExternalDeeplink(generateLaunchIntent);
        } else {
            getHandler().post(new RunnableC2781a(9, this, generateLaunchIntent));
        }
    }

    static /* synthetic */ void navigateByRegularFlow$default(DeeplinkActivity deeplinkActivity, ExternalDeeplink externalDeeplink, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        deeplinkActivity.navigateByRegularFlow(externalDeeplink, z11);
    }

    private final boolean needWorkaroundAdbIssue() {
        if (Build.VERSION.SDK_INT > 27) {
            return false;
        }
        return getUserStatusStorage().getIsAutoTestUser();
    }

    @NotNull
    public final AppLaunchListener getAppLaunchListener() {
        AppLaunchListener appLaunchListener = this.appLaunchListener;
        if (appLaunchListener != null) {
            return appLaunchListener;
        }
        Intrinsics.n("appLaunchListener");
        throw null;
    }

    @NotNull
    public final ExternalDeeplinkProcessorDelegate getExternalDeeplinkProcessorDelegate() {
        ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate = this.externalDeeplinkProcessorDelegate;
        if (externalDeeplinkProcessorDelegate != null) {
            return externalDeeplinkProcessorDelegate;
        }
        Intrinsics.n("externalDeeplinkProcessorDelegate");
        throw null;
    }

    @NotNull
    public final HomeDestinationFactory getHomeDestinationFactory() {
        HomeDestinationFactory homeDestinationFactory = this.homeDestinationFactory;
        if (homeDestinationFactory != null) {
            return homeDestinationFactory;
        }
        Intrinsics.n("homeDestinationFactory");
        throw null;
    }

    @NotNull
    public final KeepActivityHandler getKeepActivityHandler() {
        KeepActivityHandler keepActivityHandler = this.keepActivityHandler;
        if (keepActivityHandler != null) {
            return keepActivityHandler;
        }
        Intrinsics.n("keepActivityHandler");
        throw null;
    }

    @NotNull
    public final TabbarDeeplinksResolver getTabbarDeeplinksResolver() {
        TabbarDeeplinksResolver tabbarDeeplinksResolver = this.tabbarDeeplinksResolver;
        if (tabbarDeeplinksResolver != null) {
            return tabbarDeeplinksResolver;
        }
        Intrinsics.n("tabbarDeeplinksResolver");
        throw null;
    }

    @NotNull
    public final UserStatusStorage getUserStatusStorage() {
        UserStatusStorage userStatusStorage = this.userStatusStorage;
        if (userStatusStorage != null) {
            return userStatusStorage;
        }
        Intrinsics.n("userStatusStorage");
        throw null;
    }

    @NotNull
    public final a<DeeplinkViewModel> getViewModelProvider$main_prodGoogleAllVendorsRelease() {
        a<DeeplinkViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    @SuppressLint({"MissingActivityTheme"})
    public void onCreate(Bundle savedInstanceState) {
        if (!isTaskRoot()) {
            setTheme(getRuntimeTheme());
            disableTransitionAnimation();
        }
        DeeplinkActivityComponent.Factory factory = DaggerDeeplinkActivityComponent.factory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage2.b(AnalyticsComponentApi.class);
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(this, OnboardingCheckerComponentApi.class).getDependencyStorage();
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        OnboardingCheckerComponentApi onboardingCheckerComponentApi = (OnboardingCheckerComponentApi) dependencyStorage3.b(OnboardingCheckerComponentApi.class);
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(this, AppLaunchHandlersComponentApi.class).getDependencyStorage();
        if (AppLaunchHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLaunchHandlersComponentApi is not DiComponent");
        }
        AppLaunchHandlersComponentApi appLaunchHandlersComponentApi = (AppLaunchHandlersComponentApi) dependencyStorage4.b(AppLaunchHandlersComponentApi.class);
        if (DeeplinkActivityComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component DeeplinkActivityComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(this, DeeplinkActivityComponentDependencies.class).getDependencyStorage();
        if (DeeplinkActivityComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component DeeplinkActivityComponentDependencies is not DiComponent");
        }
        DeeplinkActivityComponentDependencies deeplinkActivityComponentDependencies = (DeeplinkActivityComponentDependencies) dependencyStorage5.b(DeeplinkActivityComponentDependencies.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage6 = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage6.b(StorageComponentApi.class);
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage7 = C6739a.a(this, TabsComponentApi.class).getDependencyStorage();
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        TabsComponentApi tabsComponentApi = (TabsComponentApi) dependencyStorage7.b(TabsComponentApi.class);
        if (AppOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppOnboardingComponentApi is not DiComponent");
        }
        C6740b dependencyStorage8 = C6739a.a(this, AppOnboardingComponentApi.class).getDependencyStorage();
        if (AppOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppOnboardingComponentApi is not DiComponent");
        }
        AppOnboardingComponentApi appOnboardingComponentApi = (AppOnboardingComponentApi) dependencyStorage8.b(AppOnboardingComponentApi.class);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage9 = C6739a.a(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, analyticsComponentApi, appLaunchHandlersComponentApi, deeplinkActivityComponentDependencies, onboardingCheckerComponentApi, storageComponentApi, tabsComponentApi, appOnboardingComponentApi, (AndroidPlatformComponentApi) dependencyStorage9.b(AndroidPlatformComponentApi.class)).inject(this);
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        modifyStandaloneAppDeeplinkScheme(intent);
        Integer contentViewLayoutRes = getContentViewLayoutRes(AppsFlyerResolver.INSTANCE.isLinkSupported(getIntent().getData()));
        if (contentViewLayoutRes != null) {
            setContentView(contentViewLayoutRes.intValue());
        }
        getTabbarDeeplinksResolver().resolveDeeplinkHandlersForTabs(TabsSource.Cache.INSTANCE);
        AppLaunchListener.onActivityCreated$default(getAppLaunchListener(), null, 1, null);
        DeeplinkViewModel deeplinkViewModel = (DeeplinkViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.deeplinks.DeeplinkActivity$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DeeplinkViewModel deeplinkViewModel2 = DeeplinkActivity.this.getViewModelProvider$main_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(deeplinkViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return deeplinkViewModel2;
            }
        }).a(DeeplinkViewModel.class);
        deeplinkViewModel.init(true ^ ContextUtilsKt.isOzonTravelApplication(this));
        if ((getIntent().getFlags() & 1048576) != 0) {
            navigateByRegularFlow$default(this, new ExternalDeeplink(LinkGenerator.INSTANCE.home(), null), false, 2, null);
            return;
        }
        ExternalDeeplink linkForNavigate = deeplinkViewModel.getLinkForNavigate(getIntent().getData(), getReferrer());
        if (linkForNavigate != null) {
            navigateByRegularFlow$default(this, linkForNavigate, false, 2, null);
        } else {
            deeplinkViewModel.getOneLinkEvent().observe(this, new DeeplinkActivity$sam$androidx_lifecycle_Observer$0(new DeeplinkActivity$onCreate$2(this)));
        }
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        modifyStandaloneAppDeeplinkScheme(intent);
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
