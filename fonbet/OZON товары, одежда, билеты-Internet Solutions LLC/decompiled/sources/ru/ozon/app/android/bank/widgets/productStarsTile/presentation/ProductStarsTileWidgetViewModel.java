package ru.ozon.app.android.bank.widgets.productStarsTile.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import fd.InterfaceC6511n;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "", "handleCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;)V", "onCleared", "()V", "", "productId", "setProductId", "(Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/x0;", "countItem", "LAe/x0;", "getCountItem", "()LAe/x0;", "Ljava/lang/String;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductStarsTileWidgetViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final x0<String> countItem;
    private String productId;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$1", f = "ProductStarsTileWidgetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = ProductStarsTileWidgetViewModel.this.new AnonymousClass1(dVar);
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
            CartState cartState = (CartState) this.L$0;
            ProductStarsTileWidgetViewModel productStarsTileWidgetViewModel = ProductStarsTileWidgetViewModel.this;
            Intrinsics.f(cartState);
            productStarsTileWidgetViewModel.handleCartState(cartState);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartState cartState, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$2", f = "ProductStarsTileWidgetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super CartState>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super CartState> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    public ProductStarsTileWidgetViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.actionV2Repository = actionV2Repository;
        this.countItem = O0.a("");
        InterfaceC2395h o11 = C2399j.o(n.a(CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null)));
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2399j.C(new C(new C2408n0(C2399j.B(o11, b.f10879b), new AnonymousClass1(null)), new AnonymousClass2(null)), androidx.lifecycle.x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCartState(CartState cartState) {
        String str;
        Long y02;
        if (cartState.getSource() == CartSource.LOCAL || (str = this.productId) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ProductStarsTileWidgetViewModel$handleCartState$1$1(this, y02.longValue(), null), 3);
    }

    @NotNull
    public final x0<String> getCountItem() {
        return this.countItem;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    public final void setProductId(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
    }
}
