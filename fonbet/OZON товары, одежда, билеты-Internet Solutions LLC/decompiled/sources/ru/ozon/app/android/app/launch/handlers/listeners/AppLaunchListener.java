package ru.ozon.app.android.app.launch.handlers.listeners;

import L00.d;
import L00.g;
import Ol.C3710a;
import Ol.b;
import YY.a;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.app.launch.handlers.fetch.FetchActions;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cdn.host.manager.CdnChooserSdkManager;
import ru.ozon.app.android.common.homeprefetch.HomeCacheGroup;
import ru.ozon.app.android.composer.network.util.ComposerRequestsKt;
import ru.ozon.app.android.network.homeprefetch.PrefetchHomePageFacade;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import tc.InterfaceC9800b;
import vc.i;
import vc.r;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 &2\u00020\u0001:\u0001&BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00172\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u00172\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener;", "", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "tabConfigUpdateDelegate", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "cartPrefetchController", "LL00/d;", "callFactory", "Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;", "prefetchHomePageFacade", "LPc/a;", "Lru/ozon/app/android/app/launch/handlers/fetch/FetchActions;", "fetchActionsProvider", "Lru/ozon/app/android/cdn/host/manager/CdnChooserSdkManager;", "cdnChooserSdkManager", "LYY/a;", "cdnChooserSdk", "<init>", "(Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;LL00/d;Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;LPc/a;Lru/ozon/app/android/cdn/host/manager/CdnChooserSdkManager;LYY/a;)V", "", "miniAppName", "", "onLaunch", "(Ljava/lang/String;)V", "prefetchHome", "()V", "initCart", "onActivityCreated", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "LL00/d;", "Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;", "LPc/a;", "Lru/ozon/app/android/cdn/host/manager/CdnChooserSdkManager;", "LYY/a;", "Companion", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLaunchListener {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static boolean wasOnLaunchCalled;

    @NotNull
    private final d callFactory;

    @NotNull
    private final CartPrefetchController cartPrefetchController;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final a cdnChooserSdk;

    @NotNull
    private final CdnChooserSdkManager cdnChooserSdkManager;

    @NotNull
    private final Pc.a<FetchActions> fetchActionsProvider;

    @NotNull
    private final PrefetchHomePageFacade prefetchHomePageFacade;

    @NotNull
    private final TabConfigUpdateDelegate tabConfigUpdateDelegate;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/listeners/AppLaunchListener$Companion;", "", "<init>", "()V", "MAX_RETRY_ATTEMPTS", "", "wasOnLaunchCalled", "", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AppLaunchListener(@NotNull TabConfigUpdateDelegate tabConfigUpdateDelegate, @NotNull CartService cartService, @NotNull CartPrefetchController cartPrefetchController, @NotNull d callFactory, @NotNull PrefetchHomePageFacade prefetchHomePageFacade, @NotNull Pc.a<FetchActions> fetchActionsProvider, @NotNull CdnChooserSdkManager cdnChooserSdkManager, @NotNull a cdnChooserSdk) {
        Intrinsics.checkNotNullParameter(tabConfigUpdateDelegate, "tabConfigUpdateDelegate");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cartPrefetchController, "cartPrefetchController");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(prefetchHomePageFacade, "prefetchHomePageFacade");
        Intrinsics.checkNotNullParameter(fetchActionsProvider, "fetchActionsProvider");
        Intrinsics.checkNotNullParameter(cdnChooserSdkManager, "cdnChooserSdkManager");
        Intrinsics.checkNotNullParameter(cdnChooserSdk, "cdnChooserSdk");
        this.tabConfigUpdateDelegate = tabConfigUpdateDelegate;
        this.cartService = cartService;
        this.cartPrefetchController = cartPrefetchController;
        this.callFactory = callFactory;
        this.prefetchHomePageFacade = prefetchHomePageFacade;
        this.fetchActionsProvider = fetchActionsProvider;
        this.cdnChooserSdkManager = cdnChooserSdkManager;
        this.cdnChooserSdk = cdnChooserSdk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initCart(String miniAppName) {
        this.cartPrefetchController.prefetchOnAppStart();
        AbstractC7094b updateCart$default = CartService.DefaultImpls.updateCart$default(this.cartService, null, miniAppName, 1, null);
        updateCart$default.getClass();
        new i((updateCart$default instanceof InterfaceC9800b ? ((InterfaceC9800b) updateCart$default).a() : new r(updateCart$default)).h()).k(Mc.a.b()).a(new uc.i(new b(new AppLaunchListener$initCart$2(Lm0.a.f17149a), 0), new C3710a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCart$lambda$0() {
    }

    public static /* synthetic */ void onActivityCreated$default(AppLaunchListener appLaunchListener, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        appLaunchListener.onActivityCreated(str);
    }

    private final void onLaunch(String miniAppName) {
        this.cdnChooserSdkManager.receiveActualDomain();
        this.cdnChooserSdk.b();
        this.fetchActionsProvider.get().fetch();
        prefetchHome();
        this.tabConfigUpdateDelegate.updateTabConfig("main");
        initCart(miniAppName);
    }

    private final void prefetchHome() {
        if (this.prefetchHomePageFacade.shouldNotCallPrefetch()) {
            return;
        }
        this.prefetchHomePageFacade.setIsHomePrefetched();
        M scope = this.prefetchHomePageFacade.getScope();
        g.a aVar = new g.a();
        aVar.g("/home");
        aVar.b();
        g.a prefetch = ComposerRequestsKt.prefetch(ComposerRequestsKt.forceNetwork(aVar));
        prefetch.k(HomeCacheGroup.class, HomeCacheGroup.INSTANCE);
        C10727i.c(scope, null, null, new AppLaunchListener$prefetchHome$1(this, prefetch.a(), null), 3);
    }

    public final void onActivityCreated(String miniAppName) {
        if (wasOnLaunchCalled) {
            return;
        }
        wasOnLaunchCalled = true;
        onLaunch(miniAppName);
    }
}
