package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

import Ae.I;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.s;
import Wc.a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder$subscribe$1", f = "AddToCartButtonBinder.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddToCartButtonBinder$subscribe$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddToCartButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartButtonBinder$subscribe$1(AddToCartButtonBinder addToCartButtonBinder, d<? super AddToCartButtonBinder$subscribe$1> dVar) {
        super(2, dVar);
        this.this$0 = addToCartButtonBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartButtonBinder$subscribe$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            I i12 = new I(n.a(CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null)));
            final AddToCartButtonBinder addToCartButtonBinder = this.this$0;
            InterfaceC2397i<? super Object> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder$subscribe$1.1

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
                @e(c = "ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder$subscribe$1$1$1", f = "AddToCartButtonBinder.kt", l = {}, m = "invokeSuspend")
                /* renamed from: ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder$subscribe$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C17791 extends j implements Function2<M, d<? super Unit>, Object> {
                    final /* synthetic */ CartItemInfo $skuState;
                    int label;
                    final /* synthetic */ AddToCartButtonBinder this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C17791(AddToCartButtonBinder addToCartButtonBinder, CartItemInfo cartItemInfo, d<? super C17791> dVar) {
                        super(2, dVar);
                        this.this$0 = addToCartButtonBinder;
                        this.$skuState = cartItemInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final d<Unit> create(Object obj, d<?> dVar) {
                        return new C17791(this.this$0, this.$skuState, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        WeakReference weakReference;
                        AddToCartButtonDTO addToCartButtonDTO;
                        Long l11;
                        a aVar = a.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        AddToCartButtonBinder addToCartButtonBinder = this.this$0;
                        weakReference = addToCartButtonBinder.buttonReference;
                        AddToCartButtonView addToCartButtonView = weakReference != null ? (AddToCartButtonView) weakReference.get() : null;
                        addToCartButtonDTO = this.this$0.buttonDTO;
                        CartItemInfo cartItemInfo = this.$skuState;
                        l11 = this.this$0.buttonWidgetId;
                        addToCartButtonBinder.bindButton(addToCartButtonView, addToCartButtonDTO, cartItemInfo, l11);
                        return Unit.f71690a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(M m11, d<? super Unit> dVar) {
                        return ((C17791) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }
                }

                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((CartState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(CartState cartState, d<? super Unit> dVar) {
                    Long skuId;
                    CoroutineDispatcherProvider coroutineDispatcherProvider;
                    skuId = AddToCartButtonBinder.this.getSkuId();
                    CartItemInfo cartItemInfo = skuId != null ? cartState.getItems().get(new Long(skuId.longValue())) : null;
                    coroutineDispatcherProvider = AddToCartButtonBinder.this.dispatcherProvider;
                    Object f7 = C10727i.f(coroutineDispatcherProvider.getMain(), new C17791(AddToCartButtonBinder.this, cartItemInfo, null), dVar);
                    return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
                }
            };
            this.label = 1;
            if (i12.collect(interfaceC2397i, this) == aVar) {
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
        return ((AddToCartButtonBinder$subscribe$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
