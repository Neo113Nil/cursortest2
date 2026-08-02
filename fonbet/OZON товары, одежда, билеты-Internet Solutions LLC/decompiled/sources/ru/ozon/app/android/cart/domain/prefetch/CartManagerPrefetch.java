package ru.ozon.app.android.cart.domain.prefetch;

import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.K;
import Ae.M0;
import Be.m;
import De.C2862e;
import Ge.f;
import He.b;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.ResetCartModesReason;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.AddProductsToCartParams;
import ru.ozon.app.android.cart.common.models.CartInfoUpdate;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.CartManager;
import ru.ozon.app.android.cart.domain.CartManagerImpl;
import ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeInfo;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010(\u001a\u00020'2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010,J>\u0010(\u001a\u00020'2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b(\u0010-J\u0018\u0010/\u001a\u00020.2\u0006\u0010&\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b*\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020.0?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020.0?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010A¨\u0006E"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/CartManagerPrefetch;", "Lru/ozon/app/android/cart/domain/CartManager;", "Lru/ozon/app/android/cart/domain/CartManagerImpl;", "cartManager", "Lru/ozon/app/android/cart/domain/prefetch/controller/CartPrefetchControllerImpl;", "prefetchController", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "<init>", "(Lru/ozon/app/android/cart/domain/CartManagerImpl;Lru/ozon/app/android/cart/domain/prefetch/controller/CartPrefetchControllerImpl;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;LBZ/e;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;Lru/ozon/app/android/cart/common/domain/CartNavigationService;)V", "Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;", "params", "Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "addProducts", "(Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;)Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "cartPrefetchState", "", "miniAppName", "Lio/reactivex/b;", "updateCart", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;Ljava/lang/String;)Lio/reactivex/b;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "source", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "cartChangeSource", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "", "setItems", "(Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;Lru/ozon/app/android/cart/common/domain/CartType;)V", "clearCart", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;)V", "(Ljava/lang/String;)Lio/reactivex/b;", "(Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;Lru/ozon/app/android/cart/common/domain/CartType;)V", "Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateByCartType", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartState;", "(Lru/ozon/app/android/cart/common/domain/CartType;)V", "Lru/ozon/app/android/cart/domain/CartManagerImpl;", "Lru/ozon/app/android/cart/domain/prefetch/controller/CartPrefetchControllerImpl;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "Lxe/M;", "coroutineScope", "Lxe/M;", "LAe/B0;", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;", "getCartInfoUpdateSharedFlow", "()LAe/B0;", "cartInfoUpdateSharedFlow", "LAe/h;", "getCartStateFlow", "()LAe/h;", "cartStateFlow", "getFamilyCartStateFlow", "familyCartStateFlow", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartManagerPrefetch implements CartManager {

    @NotNull
    private final CartManagerImpl cartManager;

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final CartPrefetchControllerImpl prefetchController;

    @NotNull
    private final TeensModeService teensModeService;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "info", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$1", f = "CartManagerPrefetch.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartInfoUpdate, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = CartManagerPrefetch.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            CartManagerPrefetch.this.prefetchController.prefetch(((CartInfoUpdate) this.L$0).getHasDiff());
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartInfoUpdate cartInfoUpdate, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartInfoUpdate, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$3", f = "CartManagerPrefetch.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<String, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = CartManagerPrefetch.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                AbstractC7094b updateCart = CartManagerPrefetch.this.updateCart(CartPrefetchState.ChangeMiniApp.INSTANCE, (String) this.L$0);
                this.label = 1;
                if (f.a(updateCart, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(str, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$4", f = "CartManagerPrefetch.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements Function2<TeensModeInfo, d<? super Unit>, Object> {
        int label;

        AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return CartManagerPrefetch.this.new AnonymousClass4(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                CartManagerPrefetch.this.cartNavigationService.onTeenModeChanged();
                AbstractC7094b updateCart$default = CartManagerPrefetch.updateCart$default(CartManagerPrefetch.this, null, null, 3, null);
                this.label = 1;
                if (f.a(updateCart$default, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TeensModeInfo teensModeInfo, d<? super Unit> dVar) {
            return ((AnonymousClass4) create(teensModeInfo, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$6", f = "CartManagerPrefetch.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$6, reason: invalid class name */
    static final class AnonymousClass6 extends j implements Function2<String, d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass6(d<? super AnonymousClass6> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(dVar);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Boolean.valueOf(Intrinsics.d((String) this.L$0, "main"));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, d<? super Boolean> dVar) {
            return ((AnonymousClass6) create(str, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$7", f = "CartManagerPrefetch.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$7, reason: invalid class name */
    static final class AnonymousClass7 extends j implements Function2<String, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass7(d<? super AnonymousClass7> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass7 anonymousClass7 = CartManagerPrefetch.this.new AnonymousClass7(dVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            CartManagerPrefetch.this.cartModeManager.resetCartModes(Intrinsics.d((String) this.L$0, "main") ? ResetCartModesReason.CLOSE_MINIAPP : ResetCartModesReason.OPEN_MINIAPP);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, d<? super Unit> dVar) {
            return ((AnonymousClass7) create(str, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public CartManagerPrefetch(@NotNull CartManagerImpl cartManager, @NotNull CartPrefetchControllerImpl prefetchController, @NotNull CartModeManager cartModeManager, @NotNull BZ.e miniAppConfigHolder, @NotNull TeensModeService teensModeService, @NotNull CartNavigationService cartNavigationService) {
        Intrinsics.checkNotNullParameter(cartManager, "cartManager");
        Intrinsics.checkNotNullParameter(prefetchController, "prefetchController");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        this.cartManager = cartManager;
        this.prefetchController = prefetchController;
        this.cartModeManager = cartModeManager;
        this.teensModeService = teensModeService;
        this.cartNavigationService = cartNavigationService;
        CoroutineContext d11 = CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b());
        Intrinsics.checkNotNullExpressionValue("CartManagerPrefetch", "getSimpleName(...)");
        C2862e a11 = N.a(d11.plus(new L("CartManagerPrefetch")).plus(new CartManagerPrefetch$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.coroutineScope = a11;
        C2399j.C(new C2408n0(getCartInfoUpdateSharedFlow(), new AnonymousClass1(null)), a11);
        final I i11 = new I(miniAppConfigHolder.h());
        m D11 = C2399j.D(C2399j.o(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$1$2", f = "CartManagerPrefetch.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$1$2$1, reason: invalid class name */
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
                                String b11 = ((BZ.d) obj).b();
                                if (Intrinsics.d(b11, "main")) {
                                    b11 = null;
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(b11, anonymousClass1) == aVar) {
                                    return aVar;
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
            public Object collect(InterfaceC2397i<? super String> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), new AnonymousClass3(null));
        b bVar = b.f10879b;
        C2399j.C(C2399j.B(D11, bVar), a11);
        C2399j.C(C2399j.B(C2399j.D(C2399j.o(teensModeService.getTeensModeFlow()), new AnonymousClass4(null)), bVar), a11);
        final M0<BZ.d> h11 = miniAppConfigHolder.h();
        C2399j.C(C2399j.B(C2399j.D(new K(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$2$2", f = "CartManagerPrefetch.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch$special$$inlined$map$2$2$1, reason: invalid class name */
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
                                String b11 = ((BZ.d) obj).b();
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(b11, anonymousClass1) == aVar) {
                                    return aVar;
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
            public Object collect(InterfaceC2397i<? super String> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass6(null)), new AnonymousClass7(null)), bVar), a11);
    }

    public static /* synthetic */ AbstractC7094b updateCart$default(CartManagerPrefetch cartManagerPrefetch, CartPrefetchState cartPrefetchState, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cartPrefetchState = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return cartManagerPrefetch.updateCart(cartPrefetchState, str);
    }

    @NotNull
    public y<CartAddItemDTO> addProducts(@NotNull AddProductsToCartParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.prefetchController.setCurrentPrefetchState(CartTypeKt.isFamilyCart(params.getCartType()) ? CartPrefetchState.AddToFamilyCart.INSTANCE : CartPrefetchState.AddToCart.INSTANCE);
        return this.cartManager.addProducts(params);
    }

    @Override // ru.ozon.app.android.cart.domain.CartManager
    public void clearCart(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.cartManager.clearCart(cartType);
    }

    @NotNull
    public B0<CartInfoUpdate> getCartInfoUpdateSharedFlow() {
        return this.cartManager.getCartInfoUpdateSharedFlow();
    }

    @Override // ru.ozon.app.android.cart.domain.CartManager
    @NotNull
    public CartState getCartStateByCartType(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        return this.cartManager.getCartStateByCartType(cartType);
    }

    @NotNull
    public InterfaceC2395h<CartState> getCartStateFlow() {
        return this.cartManager.getCartStateFlow();
    }

    @NotNull
    public InterfaceC2395h<CartState> getFamilyCartStateFlow() {
        return this.cartManager.getFamilyCartStateFlow();
    }

    @Override // ru.ozon.app.android.cart.domain.CartManager
    public void setItems(@NotNull Map<Long, CartItemInfo> items, @NotNull CartSource source, CartChangeSource cartChangeSource, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.cartManager.setItems(items, source, cartChangeSource, cartType);
    }

    @NotNull
    public AbstractC7094b updateCart(String miniAppName) {
        return this.cartManager.updateCart(miniAppName);
    }

    public final void clearCart(@NotNull CartPrefetchState cartPrefetchState) {
        Intrinsics.checkNotNullParameter(cartPrefetchState, "cartPrefetchState");
        this.prefetchController.setCurrentPrefetchState(cartPrefetchState);
        CartManager.DefaultImpls.clearCart$default(this, null, 1, null);
    }

    public final void setItems(@NotNull Map<Long, CartItemInfo> items, @NotNull CartSource source, CartChangeSource cartChangeSource, CartPrefetchState cartPrefetchState, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        if (CartTypeKt.isMainCart(cartType)) {
            this.prefetchController.setCurrentPrefetchState(cartPrefetchState);
        }
        setItems(items, source, cartChangeSource, cartType);
    }

    @NotNull
    public final AbstractC7094b updateCart(CartPrefetchState cartPrefetchState, String miniAppName) {
        this.prefetchController.setCurrentPrefetchState(cartPrefetchState);
        return updateCart(miniAppName);
    }
}
