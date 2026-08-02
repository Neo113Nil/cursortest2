package ru.ozon.app.android.storefront.widgets.navigationSliderV2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2Mapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2ScrollabilityResolver;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.data.NavigationSliderV2OnBoardingDisplayRepository;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2OnBoardingViewModel;

@Metadata(d1 = {"\u0000}\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"ru/ozon/app/android/storefront/widgets/navigationSliderV2/di/NavigationSliderV2WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/di/NavigationSliderV2WidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2OnBoardingDisplayRepository;", "onboardingRepo", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2OnBoardingDisplayRepository;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2Mapper;", "mapper", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;", "resolver$delegate", "getResolver", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;", "resolver", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "LPc/a;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;", "kotlin.jvm.PlatformType", "onBoardingViewModelProvider", "LPc/a;", "getOnBoardingViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LVg/c;", "getActionHandlersStore", "()LVg/c;", "actionHandlersStore", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV2WidgetComponent$Companion$create$1$1 implements NavigationSliderV2WidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final NetworkComponentApi networkComponentApi;
    private final a<NavigationSliderV2OnBoardingViewModel> onBoardingViewModelProvider;
    private final OnBoardingComponentApi onboardingComponentApi;
    private final NavigationSliderV2OnBoardingDisplayRepository onboardingRepo;

    /* renamed from: resolver$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j resolver;
    private final RetainComposerComponentApi retainComponentApi;
    private final l tokenizedAnalytics;

    NavigationSliderV2WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.retainComponentApi = retainComposerComponentApi;
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.onboardingRepo = new NavigationSliderV2OnBoardingDisplayRepository();
        this.mapper = k.b(new NavigationSliderV2WidgetComponent$Companion$create$1$1$mapper$2(this));
        this.resolver = k.b(new NavigationSliderV2WidgetComponent$Companion$create$1$1$resolver$2(this));
        this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
        this.onBoardingViewModelProvider = new a() { // from class: AL.b
            @Override // Pc.a
            public final Object get() {
                NavigationSliderV2OnBoardingViewModel onBoardingViewModelProvider$lambda$0;
                onBoardingViewModelProvider$lambda$0 = NavigationSliderV2WidgetComponent$Companion$create$1$1.onBoardingViewModelProvider$lambda$0(NavigationSliderV2WidgetComponent$Companion$create$1$1.this);
                return onBoardingViewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationSliderV2OnBoardingViewModel onBoardingViewModelProvider$lambda$0(NavigationSliderV2WidgetComponent$Companion$create$1$1 navigationSliderV2WidgetComponent$Companion$create$1$1) {
        return new NavigationSliderV2OnBoardingViewModel(navigationSliderV2WidgetComponent$Companion$create$1$1.onboardingRepo, navigationSliderV2WidgetComponent$Companion$create$1$1.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), navigationSliderV2WidgetComponent$Companion$create$1$1.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent
    public c getActionHandlersStore() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory().create(ComposerActionWithActionHandler.class);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent
    public AdultHandler getAdultHandler() {
        return this.accountComponentApi.getAdultHandler();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent
    public NavigationSliderV2Mapper getMapper() {
        return (NavigationSliderV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent
    public a<NavigationSliderV2OnBoardingViewModel> getOnBoardingViewModelProvider() {
        return this.onBoardingViewModelProvider;
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent
    public NavigationSliderV2ScrollabilityResolver getResolver() {
        return (NavigationSliderV2ScrollabilityResolver) this.resolver.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }
}
