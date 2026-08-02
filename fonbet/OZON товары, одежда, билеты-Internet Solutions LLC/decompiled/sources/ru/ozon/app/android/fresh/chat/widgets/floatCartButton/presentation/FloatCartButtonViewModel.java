package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Ge.n;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "", "newSkuList", "", "setSkuList", "(Ljava/util/List;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "skuList", "Ljava/util/List;", "LAe/x0;", "", "mutableCount", "LAe/x0;", "LAe/M0;", "count", "LAe/M0;", "getCount", "()LAe/M0;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FloatCartButtonViewModel extends w0 {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final M0<Integer> count;

    @NotNull
    private final x0<Integer> mutableCount;

    @NotNull
    private List<Long> skuList;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel$1", f = "FloatCartButtonViewModel.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return FloatCartButtonViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                final InterfaceC2395h a11 = n.a(CartService.DefaultImpls.observeCartState$default(FloatCartButtonViewModel.this.cartService, false, 1, null));
                final FloatCartButtonViewModel floatCartButtonViewModel = FloatCartButtonViewModel.this;
                InterfaceC2395h<Map<Long, ? extends CartItemInfo>> interfaceC2395h = new InterfaceC2395h<Map<Long, ? extends CartItemInfo>>() { // from class: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel$1$invokeSuspend$$inlined$map$1

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC2397i {
                        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                        final /* synthetic */ FloatCartButtonViewModel this$0;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @e(c = "ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel$1$invokeSuspend$$inlined$map$1$2", f = "FloatCartButtonViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(InterfaceC2397i interfaceC2397i, FloatCartButtonViewModel floatCartButtonViewModel) {
                            this.$this_unsafeFlow = interfaceC2397i;
                            this.this$0 = floatCartButtonViewModel;
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
                            List list;
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
                                        Map<Long, CartItemInfo> items = ((CartState) obj).getItems();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry<Long, CartItemInfo> entry : items.entrySet()) {
                                            list = this.this$0.skuList;
                                            if (list.contains(entry.getKey())) {
                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(linkedHashMap, anonymousClass1) == aVar) {
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
                    public Object collect(InterfaceC2397i<? super Map<Long, ? extends CartItemInfo>> interfaceC2397i, d dVar) {
                        Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, floatCartButtonViewModel), dVar);
                        return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                    }
                };
                final FloatCartButtonViewModel floatCartButtonViewModel2 = FloatCartButtonViewModel.this;
                InterfaceC2397i<? super Map<Long, ? extends CartItemInfo>> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel.1.2
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Map<Long, CartItemInfo>) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Map<Long, CartItemInfo> map, d<? super Unit> dVar) {
                        x0 x0Var = FloatCartButtonViewModel.this.mutableCount;
                        Iterator<T> it = map.values().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            i12 += ((CartItemInfo) it.next()).getQuantity();
                        }
                        x0Var.setValue(new Integer(i12));
                        return Unit.f71690a;
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public FloatCartButtonViewModel(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.skuList = K.f71697a;
        x0<Integer> a11 = O0.a(0);
        this.mutableCount = a11;
        this.count = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @NotNull
    public final M0<Integer> getCount() {
        return this.count;
    }

    public final void setSkuList(@NotNull List<Long> newSkuList) {
        Intrinsics.checkNotNullParameter(newSkuList, "newSkuList");
        this.skuList = newSkuList;
        x0<Integer> x0Var = this.mutableCount;
        Map<Long, CartItemInfo> items = this.cartService.getCartState().getItems();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, CartItemInfo> entry : items.entrySet()) {
            if (this.skuList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((CartItemInfo) it.next()).getQuantity();
        }
        x0Var.setValue(Integer.valueOf(i11));
    }
}
