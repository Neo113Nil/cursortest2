package ru.ozon.app.android.storefront.widgets.appOnboarding.di;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingMapper;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/di/AppOnboardingWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lk20/g;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/core/AppOnboardingMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/core/AppOnboardingMapper;", "mapper", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storefront/widgets/appOnboarding/di/AppOnboardingComponentApi;", "getAppOnboardingComponentApi", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/di/AppOnboardingComponentApi;", "appOnboardingComponentApi", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;", "getAppOnboardingViewModel", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;", "appOnboardingViewModel", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "getAppLaunchAnalytics", "()Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "appLaunchAnalytics", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppOnboardingWidgetComponent implements InterfaceC6958a {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final C7475g storage;

    public AppOnboardingWidgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.mapper = k.b(new AppOnboardingWidgetComponent$mapper$2(this));
    }

    @NotNull
    public final AppLaunchAnalytics getAppLaunchAnalytics() {
        return ((AnalyticsComponentApi) this.storage.getComponent(AnalyticsComponentApi.class)).getAppLaunchAnalytics();
    }

    @NotNull
    public final AppOnboardingComponentApi getAppOnboardingComponentApi() {
        return (AppOnboardingComponentApi) this.storage.getComponent(AppOnboardingComponentApi.class);
    }

    @NotNull
    public final AppOnboardingViewModel getAppOnboardingViewModel() {
        return getAppOnboardingComponentApi().appOnboardingViewModel();
    }

    @NotNull
    public final Context getContext() {
        return ((ContextComponentDependencies) this.storage.getComponent(ContextComponentDependencies.class)).getContext();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final AppOnboardingMapper getMapper() {
        return (AppOnboardingMapper) this.mapper.getValue();
    }

    @NotNull
    public final g getRouter() {
        return ((NavigationComponentApi) this.storage.getComponent(NavigationComponentApi.class)).getOzonRouter();
    }
}
