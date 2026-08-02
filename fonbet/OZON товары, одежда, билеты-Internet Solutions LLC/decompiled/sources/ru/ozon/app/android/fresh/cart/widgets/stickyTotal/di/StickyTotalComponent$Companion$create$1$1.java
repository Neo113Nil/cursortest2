package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalMapper;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000f0\u000f0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR(\u0010\u0013\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00120\u00120\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0019\u001a\u00060\u0015j\u0002`\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ru/ozon/app/android/fresh/cart/widgets/stickyTotal/di/StickyTotalComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/di/StickyTotalComponent;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewModel;", "viewModelPDPProvider", "getViewModelPDPProvider", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "cartTotalVisibilityViewModelProvider", "getCartTotalVisibilityViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyTotalComponent$Companion$create$1$1 implements StickyTotalComponent {
    final /* synthetic */ C7475g $storage;
    private final a<StickyTotalPDPViewModel> viewModelPDPProvider;
    private final a<StickyTotalViewModel> viewModelProvider;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(StickyTotalComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<TotalVisibilityViewModel> cartTotalVisibilityViewModelProvider = new HU.a(1);

    StickyTotalComponent$Companion$create$1$1(final C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new a() { // from class: Ot.a
            @Override // Pc.a
            public final Object get() {
                StickyTotalViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = StickyTotalComponent$Companion$create$1$1.viewModelProvider$lambda$0(C7475g.this);
                return viewModelProvider$lambda$0;
            }
        };
        this.viewModelPDPProvider = new a() { // from class: Ot.b
            @Override // Pc.a
            public final Object get() {
                StickyTotalPDPViewModel viewModelPDPProvider$lambda$1;
                viewModelPDPProvider$lambda$1 = StickyTotalComponent$Companion$create$1$1.viewModelPDPProvider$lambda$1(C7475g.this);
                return viewModelPDPProvider$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TotalVisibilityViewModel cartTotalVisibilityViewModelProvider$lambda$2() {
        return new TotalVisibilityViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StickyTotalPDPViewModel viewModelPDPProvider$lambda$1(C7475g c7475g) {
        return new StickyTotalPDPViewModel(((CartServiceApi) c7475g.getComponent(CartServiceApi.class)).getCartService(), ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getJsonDeserializer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StickyTotalViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        return new StickyTotalViewModel(((CartServiceApi) c7475g.getComponent(CartServiceApi.class)).getCartService(), ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getJsonDeserializer(), ((ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository());
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent
    public a<TotalVisibilityViewModel> getCartTotalVisibilityViewModelProvider() {
        return this.cartTotalVisibilityViewModelProvider;
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent
    public FeatureChecker getFeatureChecker() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getFeatureChecker();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent
    public StickyTotalMapper getMapper() {
        return (StickyTotalMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent
    public a<StickyTotalPDPViewModel> getViewModelPDPProvider() {
        return this.viewModelPDPProvider;
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent
    public a<StickyTotalViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
