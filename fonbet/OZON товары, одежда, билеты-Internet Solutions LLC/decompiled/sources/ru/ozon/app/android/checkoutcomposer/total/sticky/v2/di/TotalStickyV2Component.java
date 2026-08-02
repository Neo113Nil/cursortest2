package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di;

import BD.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2Mapper;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewModel;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 (2\u00060\u0001j\u0002`\u0002:\u0001(R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "getViewModel", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "viewModel", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2Mapper;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2Mapper;", "mapper", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "getTotalVisibilityViewModel", "()Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getGetReferrerValueController", "()Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getReferrerValueController", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "viewedPond", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "getCartEventController", "()Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventController", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TotalStickyV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TotalStickyV2Component create$lambda$0(C7475g c7475g) {
            return new TotalStickyV2Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<TotalStickyV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TotalStickyV2Component.class), new a(storage, 9));
        }
    }

    @NotNull
    AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider();

    @NotNull
    CartEventsController getCartEventController();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ReferrerValueController getGetReferrerValueController();

    @NotNull
    TotalStickyV2Mapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    TotalVisibilityViewModel getTotalVisibilityViewModel();

    @NotNull
    TotalStickyV2ViewModel getViewModel();

    @NotNull
    f getViewedPond();
}
