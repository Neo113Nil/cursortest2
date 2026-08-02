package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di;

import As.C2444a;
import Pc.a;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalMapper;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001b2\u00060\u0001j\u0002`\u0002:\u0001\u001bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0018\u0010\u0016\u001a\u00060\u0012j\u0002`\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/di/StickyTotalComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;", "getMapper", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewModel;", "getViewModelPDPProvider", "viewModelPDPProvider", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "getCartTotalVisibilityViewModelProvider", "cartTotalVisibilityViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StickyTotalComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/di/StickyTotalComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/di/StickyTotalComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StickyTotalComponent create$lambda$0(C7475g c7475g) {
            return new StickyTotalComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<StickyTotalComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(StickyTotalComponent.class), new C2444a(storage, 3));
        }
    }

    @NotNull
    a<TotalVisibilityViewModel> getCartTotalVisibilityViewModelProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    StickyTotalMapper getMapper();

    @NotNull
    a<StickyTotalPDPViewModel> getViewModelPDPProvider();

    @NotNull
    a<StickyTotalViewModel> getViewModelProvider();
}
