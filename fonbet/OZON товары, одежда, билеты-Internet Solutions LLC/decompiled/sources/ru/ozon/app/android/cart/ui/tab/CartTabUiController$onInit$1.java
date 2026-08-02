package ru.ozon.app.android.cart.ui.tab;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;
import ru.ozon.app.android.tabbar.ui.utils.BottomNavigationBadgeExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1", f = "CartTabUiController.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CartTabUiController$onInit$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ CartTabUiController this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "totalCount", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$1", f = "CartTabUiController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Integer, d<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ CartTabUiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CartTabUiController cartTabUiController, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = cartTabUiController;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            BaseOzonBottomTabView tabView;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            int i11 = this.I$0;
            tabView = this.this$0.getTabView();
            if (tabView != null) {
                BottomNavigationBadgeExtKt.updateBadgeCount(tabView, i11);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
            return invoke(num.intValue(), dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$2", f = "CartTabUiController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super Integer>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Integer> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTabUiController$onInit$1(CartTabUiController cartTabUiController, d<? super CartTabUiController$onInit$1> dVar) {
        super(2, dVar);
        this.this$0 = cartTabUiController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartTabUiController$onInit$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        CartService cartService2;
        TeensModeService teensModeService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            final InterfaceC2395h observeCartStateFlow$default = CartService.DefaultImpls.observeCartStateFlow$default(cartService, false, 1, null);
            cartService2 = this.this$0.cartService;
            InterfaceC2395h observeFamilyCartStateFlow$default = CartService.DefaultImpls.observeFamilyCartStateFlow$default(cartService2, false, 1, null);
            teensModeService = this.this$0.teensModeService;
            C c11 = new C(new C2408n0(teensModeService.isTeensModeOn() ? new C2417s0(observeCartStateFlow$default, observeFamilyCartStateFlow$default, new CartTabUiController$onInit$1$totalCartCountFlow$1(null)) : new InterfaceC2395h<Integer>() { // from class: ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$invokeSuspend$$inlined$map$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$invokeSuspend$$inlined$map$1$2", f = "CartTabUiController.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.cart.ui.tab.CartTabUiController$onInit$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    Integer num = new Integer(((CartState) obj).getTotalCount());
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(num, anonymousClass1) == aVar) {
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
                public Object collect(InterfaceC2397i<? super Integer> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null));
            this.label = 1;
            if (C2399j.g(c11, this) == aVar) {
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
        return ((CartTabUiController$onInit$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
