package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2Mapper;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewModel;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001e\u0010(\u001a\u00060&j\u0002`'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"ru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component$Companion$create$1$1", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartService", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "getCartService", "()Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "viewModel", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2Mapper;", "mapper", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel$delegate", "getTotalVisibilityViewModel", "()Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getReferrerValueController", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getGetReferrerValueController", "()Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "getCartEventController", "()Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventController", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV2Component$Companion$create$1$1 implements TotalStickyV2Component {
    final /* synthetic */ C7475g $storage;
    private final CartServiceApi cartService;
    private final d customActionHandlersStoreFactory;
    private final FeatureChecker featureChecker;
    private final ReferrerValueController getReferrerValueController;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TotalStickyV2Component$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: totalVisibilityViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j totalVisibilityViewModel = k.b(TotalStickyV2Component$Companion$create$1$1$totalVisibilityViewModel$2.INSTANCE);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel;
    private final f viewedPond;

    TotalStickyV2Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.cartService = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.viewModel = k.b(new TotalStickyV2Component$Companion$create$1$1$viewModel$2(this, c7475g));
        this.getReferrerValueController = ((ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class)).getReferrerValueController();
        this.viewedPond = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getViewedPond();
        this.featureChecker = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getFeatureChecker();
        this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
        return this.cartService.getAsyncCartViewModelProvider();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public CartEventsController getCartEventController() {
        return ((CartComponentApi) this.$storage.getComponent(CartComponentApi.class)).getCartEventsController();
    }

    public final CartServiceApi getCartService() {
        return this.cartService;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersStoreFactory;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public ReferrerValueController getGetReferrerValueController() {
        return this.getReferrerValueController;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public TotalStickyV2Mapper getMapper() {
        return (TotalStickyV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public TotalVisibilityViewModel getTotalVisibilityViewModel() {
        return (TotalVisibilityViewModel) this.totalVisibilityViewModel.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public TotalStickyV2ViewModel getViewModel() {
        return (TotalStickyV2ViewModel) this.viewModel.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component
    public f getViewedPond() {
        return this.viewedPond;
    }
}
