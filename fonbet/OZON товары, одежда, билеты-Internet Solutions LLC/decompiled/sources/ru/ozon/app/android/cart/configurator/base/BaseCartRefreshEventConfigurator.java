package ru.ozon.app.android.cart.configurator.base;

import Ae.B0;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import BZ.e;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.common.utils.link.CartDeeplinkValidationRules;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeInfo;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H$¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H$¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH$¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001aH\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b+\u0010,J?\u0010.\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001e0-H\u0004¢\u0006\u0004\b.\u0010/J'\u00103\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0004¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bG\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bL\u0010H\u001a\u0004\bM\u0010I\"\u0004\bN\u0010K¨\u0006O"}, d2 = {"Lru/ozon/app/android/cart/configurator/base/BaseCartRefreshEventConfigurator;", "Lru/ozon/app/android/cart/configurator/base/AbstractCartConfigurator;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "LBZ/e;", "currentMiniAppHolder", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;", "cartChangeChecker", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "<init>", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;LBZ/e;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;Lru/ozon/app/android/cart/common/domain/CartNavigationService;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateFlow", "()LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "getAddToCartEvent", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "reason", "", "isAddToCartRefreshReason", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)Z", "", "totalCount", "addToCartEvent", "resolveLocalCartRefreshReason", "(ILru/ozon/app/android/cart/common/domain/CartRefreshReason;Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "cartState", "handleLocalCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)V", "handleRemoteCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;)V", "handleEventAfterRefresh", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;)V", "Lkotlin/Function1;", "resolveOnStartEvent", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "componentStorage", "observeOutOfScreenRefreshEvents", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lk20/g;)V", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "LBZ/e;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "lastUpdateSource", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "getLastUpdateSource", "()Lru/ozon/app/android/cart/common/domain/local/CartSource;", "setLastUpdateSource", "(Lru/ozon/app/android/cart/common/domain/local/CartSource;)V", "cartRefreshState", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "getCartRefreshState", "()Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "setCartRefreshState", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)V", "isNeedRefreshOnStart", "Z", "()Z", "setNeedRefreshOnStart", "(Z)V", "skipRefreshInObserve", "getSkipRefreshInObserve", "setSkipRefreshInObserve", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCartRefreshEventConfigurator extends AbstractCartConfigurator {

    @NotNull
    private final CartChangeChecker cartChangeChecker;

    @NotNull
    private final CartEventsController cartEventsController;

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private final CartNavigationService cartNavigationService;
    private CartRefreshReason cartRefreshState;

    @NotNull
    private final e currentMiniAppHolder;
    private boolean isNeedRefreshOnStart;
    private CartSource lastUpdateSource;
    private boolean skipRefreshInObserve;

    public BaseCartRefreshEventConfigurator(@NotNull CartEventsController cartEventsController, @NotNull e currentMiniAppHolder, @NotNull CartModeManager cartModeManager, @NotNull CartChangeChecker cartChangeChecker, @NotNull CartNavigationService cartNavigationService) {
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(cartChangeChecker, "cartChangeChecker");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        this.cartEventsController = cartEventsController;
        this.currentMiniAppHolder = currentMiniAppHolder;
        this.cartModeManager = cartModeManager;
        this.cartChangeChecker = cartChangeChecker;
        this.cartNavigationService = cartNavigationService;
    }

    @NotNull
    protected abstract CartRefreshReason getAddToCartEvent(@NotNull CartType cartType);

    protected final CartRefreshReason getCartRefreshState() {
        return this.cartRefreshState;
    }

    @NotNull
    protected abstract InterfaceC2395h<CartState> getCartStateFlow();

    protected final boolean getSkipRefreshInObserve() {
        return this.skipRefreshInObserve;
    }

    protected final void handleEventAfterRefresh(@NotNull CartEventsController cartEventsController) {
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        if (this.lastUpdateSource == CartSource.REMOTE) {
            CartRefreshReason lastEvent = cartEventsController.getLastEvent();
            if ((lastEvent instanceof CartRefreshReason.RemoveCartSplit) || (lastEvent instanceof CartRefreshReason.CloseCartShareModal) || (lastEvent instanceof CartRefreshReason.AppEnterForeground) || (lastEvent instanceof CartRefreshReason.CancelOrder) || (lastEvent instanceof CartRefreshReason.MinCheckAddMore)) {
                this.skipRefreshInObserve = true;
            } else {
                this.cartRefreshState = null;
            }
        }
    }

    protected final void handleLocalCartState(@NotNull CartState cartState, @NotNull CartRefreshReason addToCartEvent) {
        Intrinsics.checkNotNullParameter(cartState, "cartState");
        Intrinsics.checkNotNullParameter(addToCartEvent, "addToCartEvent");
        this.skipRefreshInObserve = false;
        this.cartRefreshState = resolveLocalCartRefreshReason(cartState.getTotalCount(), addToCartEvent, cartState.getCartType());
        this.lastUpdateSource = CartSource.LOCAL;
    }

    protected final void handleRemoteCartState(@NotNull CartState cartState, @NotNull CartEventsController cartEventsController) {
        Intrinsics.checkNotNullParameter(cartState, "cartState");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        if (this.lastUpdateSource == null && cartState.getChangeReason() == CartChangeSource.ADD_TO_CART) {
            this.skipRefreshInObserve = true;
            cartEventsController.handleEvent(CartRefreshReason.AddToCartFromAnotherTab.INSTANCE);
        }
        handleEventAfterRefresh(cartEventsController);
        this.isNeedRefreshOnStart = !isResume();
        this.lastUpdateSource = CartSource.REMOTE;
    }

    protected abstract boolean isAddToCartRefreshReason(CartRefreshReason reason);

    protected final void observeOutOfScreenRefreshEvents(@NotNull CartEventsController cartEventsController, C7475g componentStorage) {
        TeensModeService teensModeService;
        B0<TeensModeInfo> teensModeFlow;
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        final B0<CartRefreshReason> cartEventsSharedFlow = cartEventsController.getCartEventsSharedFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<CartRefreshReason>() { // from class: ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$$inlined$filter$1$2", f = "BaseCartRefreshEventConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                CartRefreshReason cartRefreshReason = (CartRefreshReason) obj;
                                if ((cartRefreshReason instanceof CartRefreshReason.RemoveRfbsSplit) || (cartRefreshReason instanceof CartRefreshReason.CheckoutItemQuantityChanged) || (cartRefreshReason instanceof CartRefreshReason.RemoveRestoreCartSplit)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CartRefreshReason> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$2(this, null)), K.a(getOwner()));
        if (componentStorage == null || (teensModeService = ((StorefrontCommonComponentApi) componentStorage.getComponent(StorefrontCommonComponentApi.class)).getTeensModeService()) == null || (teensModeFlow = teensModeService.getTeensModeFlow()) == null) {
            return;
        }
        C2399j.C(new C2408n0(teensModeFlow, new BaseCartRefreshEventConfigurator$observeOutOfScreenRefreshEvents$3(this, null)), K.a(getOwner()));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        final C2408n0 c2408n0 = new C2408n0(new I(getCartStateFlow()), new BaseCartRefreshEventConfigurator$onCreate$1(this, null));
        C2399j.C(new C(new C2408n0(new InterfaceC2395h<CartState>() { // from class: ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$onCreate$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$onCreate$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ BaseCartRefreshEventConfigurator this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$onCreate$$inlined$filter$1$2", f = "BaseCartRefreshEventConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.configurator.base.BaseCartRefreshEventConfigurator$onCreate$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, BaseCartRefreshEventConfigurator baseCartRefreshEventConfigurator) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = baseCartRefreshEventConfigurator;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    e eVar;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                CartState cartState = (CartState) obj;
                                if (cartState.getSource() == CartSource.REMOTE && cartState.getChangeReason() != CartChangeSource.MASTER) {
                                    eVar = this.this$0.currentMiniAppHolder;
                                    if (MiniAppExtKt.isMain(eVar) == this.this$0.getInstanceIsMainMiniApp()) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CartState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new BaseCartRefreshEventConfigurator$onCreate$3(this, null)), new BaseCartRefreshEventConfigurator$onCreate$4(null)), K.a(owner));
        CartEventsController cartEventsController = this.cartEventsController;
        ConfiguratorReferences references = getReferences();
        observeOutOfScreenRefreshEvents(cartEventsController, references != null ? references.getComposerWidgetComponentStorage() : null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        CartRefreshReason resolveOnStartEvent = resolveOnStartEvent(this.cartEventsController, this.cartModeManager, this.cartChangeChecker, new BaseCartRefreshEventConfigurator$onStart$event$1(this));
        if (resolveOnStartEvent == null) {
            return;
        }
        this.cartEventsController.handleEvent(resolveOnStartEvent);
        this.skipRefreshInObserve = true;
        this.isNeedRefreshOnStart = false;
    }

    @NotNull
    protected final CartRefreshReason resolveLocalCartRefreshReason(int totalCount, @NotNull CartRefreshReason addToCartEvent, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(addToCartEvent, "addToCartEvent");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return isActiveFreshTab() ? CartRefreshReason.AddToCartFromFreshTab.INSTANCE : !isActiveCartTab() ? CartRefreshReason.AddToCartFromAnotherTab.INSTANCE : totalCount == 1 ? CartTypeKt.isMainCart(cartType) ? CartRefreshReason.AddToCartFirstProduct.INSTANCE : CartRefreshReason.AddToFamilyCartFirstProduct.INSTANCE : addToCartEvent;
    }

    protected final CartRefreshReason resolveOnStartEvent(@NotNull CartEventsController cartEventsController, @NotNull CartModeManager cartModeManager, @NotNull CartChangeChecker cartChangeChecker, @NotNull Function1<? super CartRefreshReason, Boolean> isAddToCartRefreshReason) {
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(cartChangeChecker, "cartChangeChecker");
        Intrinsics.checkNotNullParameter(isAddToCartRefreshReason, "isAddToCartRefreshReason");
        boolean z11 = cartChangeChecker.getCartWasChangedInAnotherMiniApp() && getInstanceIsMainMiniApp();
        if (cartModeManager.enabledResetPerAction()) {
            this.isNeedRefreshOnStart = cartModeManager.getNeedSetCartViewMode();
        }
        if (!this.isNeedRefreshOnStart && !z11) {
            return null;
        }
        CartRefreshReason cartRefreshReason = this.cartRefreshState;
        CartRefreshReason lastEvent = cartEventsController.getLastEvent();
        if (Intrinsics.d(lastEvent, CartRefreshReason.MinCheckAddMore.INSTANCE) || Intrinsics.d(lastEvent, CartRefreshReason.RemoveRfbsSplit.INSTANCE) || Intrinsics.d(lastEvent, CartRefreshReason.CancelOrder.INSTANCE)) {
            return lastEvent;
        }
        if (isAddToCartRefreshReason.invoke(cartRefreshReason).booleanValue()) {
            return cartRefreshReason;
        }
        String pendingTab = this.cartNavigationService.getPendingTab();
        return (pendingTab == null || CartDeeplinkValidationRules.INSTANCE.isFamilyCartTab(Uri.parse(pendingTab)) || Intrinsics.d(this.cartNavigationService.getCurrentTab(), pendingTab)) ? new CartRefreshReason.BackToCart(z11) : new CartRefreshReason.BackToCartByAnchor(pendingTab);
    }

    protected final void setNeedRefreshOnStart(boolean z11) {
        this.isNeedRefreshOnStart = z11;
    }

    protected final void setSkipRefreshInObserve(boolean z11) {
        this.skipRefreshInObserve = z11;
    }
}
