package ru.ozon.app.android.product.cartdelegate;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ef0.c;
import Ge.n;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.product.cartdelegate.CartButtonDelegate;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10720e0;
import xe.I;
import xe.J;
import xe.L;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "cancelJob", "()V", "Lru/ozon/app/android/cart/common/domain/CartState;", "Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate$ButtonState;", "mapButtonState", "(Lru/ozon/app/android/cart/common/domain/CartState;)Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate$ButtonState;", "Lkotlin/Function1;", "onCartStateChanged", "observeButtonState", "(Lkotlin/jvm/functions/Function1;)V", "", "productId", "selectedDeliverySchema", "bindProductInfo", "(Ljava/lang/Long;Ljava/lang/Long;)V", "", "isProductInCart", "(Ljava/lang/Long;)Z", "detach", "clear", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lxe/M;", "scope", "Lxe/M;", "Lxe/B0;", "job", "Lxe/B0;", "Ljava/lang/Long;", "ButtonState", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonDelegate {

    @NotNull
    private final CartService cartService;
    private B0 job;
    private Long productId;

    @NotNull
    private final M scope;
    private Long selectedDeliverySchema;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate$ButtonState;", "", "", "inCart", "addActionDisabled", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getInCart", "()Z", "getAddActionDisabled", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonState {
        private final boolean addActionDisabled;
        private final boolean inCart;

        public ButtonState(boolean z11, boolean z12) {
            this.inCart = z11;
            this.addActionDisabled = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) other;
            return this.inCart == buttonState.inCart && this.addActionDisabled == buttonState.addActionDisabled;
        }

        public final boolean getAddActionDisabled() {
            return this.addActionDisabled;
        }

        public final boolean getInCart() {
            return this.inCart;
        }

        public int hashCode() {
            return Boolean.hashCode(this.addActionDisabled) + (Boolean.hashCode(this.inCart) * 31);
        }

        @NotNull
        public String toString() {
            return c.c("ButtonState(inCart=", ", addActionDisabled=", ")", this.inCart, this.addActionDisabled);
        }
    }

    public CartButtonDelegate(@NotNull CartService cartService, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.cartService = cartService;
        I mainImmediate = dispatcherProvider.getMainImmediate();
        Intrinsics.checkNotNullExpressionValue("CartButtonDelegate", "getSimpleName(...)");
        this.scope = N.a(mainImmediate.plus(new L("CartButtonDelegate")).plus(new CartButtonDelegate$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    private final void cancelJob() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonState mapButtonState(CartState cartState) {
        Long l11 = this.productId;
        boolean z11 = false;
        if (l11 == null) {
            return new ButtonState(false, false);
        }
        long longValue = l11.longValue();
        CartItemInfo cartItemInfo = cartState.getItems().get(l11);
        if (cartItemInfo != null && this.selectedDeliverySchema != null && !Intrinsics.d(cartItemInfo.getSelectedDeliverySchema(), this.selectedDeliverySchema)) {
            z11 = true;
        }
        return new ButtonState(cartState.hasProduct(longValue), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeButtonState$suspendConversion0(Function1 function1, ButtonState buttonState, d dVar) {
        function1.invoke(buttonState);
        return Unit.f71690a;
    }

    public final void bindProductInfo(Long productId, Long selectedDeliverySchema) {
        this.productId = productId;
        this.selectedDeliverySchema = selectedDeliverySchema;
    }

    public final void clear() {
        this.productId = null;
        cancelJob();
    }

    public final void detach() {
        cancelJob();
    }

    public final boolean isProductInCart(Long productId) {
        if (productId == null) {
            return false;
        }
        return CartService.DefaultImpls.isProductInCart$default(this.cartService, productId.longValue(), null, 2, null);
    }

    public final void observeButtonState(@NotNull Function1<? super ButtonState, Unit> onCartStateChanged) {
        Intrinsics.checkNotNullParameter(onCartStateChanged, "onCartStateChanged");
        final InterfaceC2395h a11 = n.a(CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null));
        this.job = C2399j.C(new C(new C2408n0(C2399j.B(new InterfaceC2395h<ButtonState>() { // from class: ru.ozon.app.android.product.cartdelegate.CartButtonDelegate$observeButtonState$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.product.cartdelegate.CartButtonDelegate$observeButtonState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ CartButtonDelegate this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.product.cartdelegate.CartButtonDelegate$observeButtonState$$inlined$map$1$2", f = "CartButtonDelegate.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.product.cartdelegate.CartButtonDelegate$observeButtonState$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CartButtonDelegate cartButtonDelegate) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = cartButtonDelegate;
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
                    CartButtonDelegate.ButtonState mapButtonState;
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
                                CartButtonDelegate cartButtonDelegate = this.this$0;
                                Intrinsics.f(cartState);
                                mapButtonState = cartButtonDelegate.mapButtonState(cartState);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(mapButtonState, anonymousClass1) == aVar) {
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
            public Object collect(InterfaceC2397i<? super CartButtonDelegate.ButtonState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, C10720e0.a()), new CartButtonDelegate$observeButtonState$2(onCartStateChanged)), new CartButtonDelegate$observeButtonState$3(null)), this.scope);
    }
}
