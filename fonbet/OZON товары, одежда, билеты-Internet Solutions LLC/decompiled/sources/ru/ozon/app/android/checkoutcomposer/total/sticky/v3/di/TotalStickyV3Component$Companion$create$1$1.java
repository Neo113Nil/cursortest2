package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3Mapper;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewModel;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010'R\u001e\u0010+\u001a\u00060)j\u0002`*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u00020/8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b1\u00102R\u001a\u00105\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0018\u0010A\u001a\u00060=j\u0002`>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"ru/ozon/app/android/checkoutcomposer/total/sticky/v3/di/TotalStickyV3Component$Companion$create$1$1", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/di/TotalStickyV3Component;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "googlePayAvailabilityStorage", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDeps", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3Mapper;", "mapper", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel$delegate", "getTotalVisibilityViewModel", "()Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getReferrerValueController", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getGetReferrerValueController", "()Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel$delegate", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "getComposerWidgetComponentStorage", "()Lk20/g;", "composerWidgetComponentStorage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV3Component$Companion$create$1$1 implements TotalStickyV3Component {
    final /* synthetic */ C7475g $storage;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
    private final AndroidPlatformComponentDependencies androidPlatformComponentDeps;
    private final AppType appType;

    /* renamed from: createAndPayViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayViewModel;
    private final d customActionHandlersStoreFactory;
    private final ReferrerValueController getReferrerValueController;
    private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final l tokenizedAnalytics;

    /* renamed from: totalVisibilityViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j totalVisibilityViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel;

    TotalStickyV3Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.googlePayAvailabilityStorage = ((CheckoutPaymentComponentApi) c7475g.getComponent(CheckoutPaymentComponentApi.class)).getGooglePayAvailabilityStorage();
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        AndroidPlatformComponentDependencies androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
        this.androidPlatformComponentDeps = androidPlatformComponentDependencies;
        this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class);
        this.mapper = k.b(TotalStickyV3Component$Companion$create$1$1$mapper$2.INSTANCE);
        this.totalVisibilityViewModel = k.b(TotalStickyV3Component$Companion$create$1$1$totalVisibilityViewModel$2.INSTANCE);
        this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
        this.getReferrerValueController = ((ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class)).getReferrerValueController();
        this.viewModel = k.b(new TotalStickyV3Component$Companion$create$1$1$viewModel$2(c7475g));
        this.tokenizedAnalytics = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
        this.createAndPayViewModel = k.b(new TotalStickyV3Component$Companion$create$1$1$createAndPayViewModel$2(c7475g, this));
        this.appType = androidPlatformComponentDependencies.getAppType();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
        return ((CartServiceApi) this.$storage.getComponent(CartServiceApi.class)).getAsyncCartViewModelProvider();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    /* renamed from: getComposerWidgetComponentStorage, reason: from getter */
    public C7475g get$storage() {
        return this.$storage;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public CreateAndPayViewModel getCreateAndPayViewModel() {
        return (CreateAndPayViewModel) this.createAndPayViewModel.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersStoreFactory;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public ReferrerValueController getGetReferrerValueController() {
        return this.getReferrerValueController;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public TotalStickyV3Mapper getMapper() {
        return (TotalStickyV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public TotalVisibilityViewModel getTotalVisibilityViewModel() {
        return (TotalVisibilityViewModel) this.totalVisibilityViewModel.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component
    public TotalStickyV3ViewModel getViewModel() {
        return (TotalStickyV3ViewModel) this.viewModel.getValue();
    }
}
