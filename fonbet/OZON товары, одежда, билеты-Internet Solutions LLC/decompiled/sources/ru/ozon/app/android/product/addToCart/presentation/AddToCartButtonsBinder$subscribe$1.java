package ru.ozon.app.android.product.addToCart.presentation;

import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1", f = "AddToCartButtonsBinder.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartButtonsBinder$subscribe$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddToCartButtonsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartButtonsBinder$subscribe$1(AddToCartButtonsBinder addToCartButtonsBinder, d<? super AddToCartButtonsBinder$subscribe$1> dVar) {
        super(2, dVar);
        this.this$0 = addToCartButtonsBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartButtonsBinder$subscribe$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            final I i12 = new I(n.a(CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null)));
            final AddToCartButtonsBinder addToCartButtonsBinder = this.this$0;
            InterfaceC2395h<CartState> interfaceC2395h = new InterfaceC2395h<CartState>() { // from class: ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1$invokeSuspend$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ AddToCartButtonsBinder this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1$invokeSuspend$$inlined$filter$1$2", f = "AddToCartButtonsBinder.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, AddToCartButtonsBinder addToCartButtonsBinder) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = addToCartButtonsBinder;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
                    
                        if ((r2 != null ? r2.getQuantityButton() : null) != null) goto L23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        AddToCartButtonDTO addToCartButtonDTO;
                        AddToCartButtonDTO addToCartButtonDTO2;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    addToCartButtonDTO = this.this$0.firstButtonDTO;
                                    if ((addToCartButtonDTO != null ? addToCartButtonDTO.getQuantityButton() : null) == null) {
                                        addToCartButtonDTO2 = this.this$0.secondButtonDTO;
                                    }
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
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
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super CartState> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, addToCartButtonsBinder), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            final AddToCartButtonsBinder addToCartButtonsBinder2 = this.this$0;
            InterfaceC2397i<? super CartState> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1.2

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
                @e(c = "ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1$2$1", f = "AddToCartButtonsBinder.kt", l = {}, m = "invokeSuspend")
                /* renamed from: ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$subscribe$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
                    final /* synthetic */ CartItemInfo $skuState;
                    int label;
                    final /* synthetic */ AddToCartButtonsBinder this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AddToCartButtonsBinder addToCartButtonsBinder, CartItemInfo cartItemInfo, d<? super AnonymousClass1> dVar) {
                        super(2, dVar);
                        this.this$0 = addToCartButtonsBinder;
                        this.$skuState = cartItemInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final d<Unit> create(Object obj, d<?> dVar) {
                        return new AnonymousClass1(this.this$0, this.$skuState, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        WeakReference weakReference;
                        AddToCartButtonDTO addToCartButtonDTO;
                        Long l11;
                        Function0 function0;
                        Function1 function1;
                        WeakReference weakReference2;
                        AddToCartButtonDTO addToCartButtonDTO2;
                        Long l12;
                        Function0 function02;
                        Function1 function12;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        AddToCartButtonsBinder addToCartButtonsBinder = this.this$0;
                        weakReference = addToCartButtonsBinder.firstButton;
                        AddToCartButtonView addToCartButtonView = weakReference != null ? (AddToCartButtonView) weakReference.get() : null;
                        addToCartButtonDTO = this.this$0.firstButtonDTO;
                        CartItemInfo cartItemInfo = this.$skuState;
                        l11 = this.this$0.firstButtonWidgetId;
                        function0 = this.this$0.onPlusClicked;
                        function1 = this.this$0.onSuccess;
                        addToCartButtonsBinder.bindButton(addToCartButtonView, addToCartButtonDTO, cartItemInfo, l11, function0, function1);
                        AddToCartButtonsBinder addToCartButtonsBinder2 = this.this$0;
                        weakReference2 = addToCartButtonsBinder2.secondButton;
                        AddToCartButtonView addToCartButtonView2 = weakReference2 != null ? (AddToCartButtonView) weakReference2.get() : null;
                        addToCartButtonDTO2 = this.this$0.secondButtonDTO;
                        CartItemInfo cartItemInfo2 = this.$skuState;
                        l12 = this.this$0.secondButtonWidgetId;
                        function02 = this.this$0.onPlusClicked;
                        function12 = this.this$0.onSuccess;
                        addToCartButtonsBinder2.bindButton(addToCartButtonView2, addToCartButtonDTO2, cartItemInfo2, l12, function02, function12);
                        return Unit.f71690a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(M m11, d<? super Unit> dVar) {
                        return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }
                }

                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((CartState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(CartState cartState, d<? super Unit> dVar) {
                    Long skuId;
                    skuId = AddToCartButtonsBinder.this.getSkuId();
                    CartItemInfo cartItemInfo = skuId != null ? cartState.getItems().get(new Long(skuId.longValue())) : null;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object f7 = C10727i.f(De.s.f6650a, new AnonymousClass1(AddToCartButtonsBinder.this, cartItemInfo, null), dVar);
                    return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
                }
            };
            this.label = 1;
            if (interfaceC2395h.collect(interfaceC2397i, this) == aVar) {
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
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddToCartButtonsBinder$subscribe$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
