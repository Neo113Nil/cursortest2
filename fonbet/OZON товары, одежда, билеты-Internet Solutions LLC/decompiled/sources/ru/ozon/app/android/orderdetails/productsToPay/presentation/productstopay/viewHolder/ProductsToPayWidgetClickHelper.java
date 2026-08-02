package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.w0;
import C.o0;
import Wc.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetClickHelper;", "", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "", "processAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetClickHelper$ClickEvent;", "event", "handleClick", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetClickHelper$ClickEvent;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "state", "onItemClick", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "", "quantity", "onCounterClick", "(Lru/ozon/uni/atoms/af/AtomAction;ILjava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lxe/M;", "scope", "initFlow", "(Lxe/M;)V", "Lkotlin/jvm/functions/Function1;", "LAe/w0;", "debounceSharedFlow", "LAe/w0;", "Companion", "ClickEvent", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsToPayWidgetClickHelper {

    @NotNull
    private final w0<ClickEvent> debounceSharedFlow;

    @NotNull
    private final Function1<AtomAction.Click, Unit> processAction;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetClickHelper$ClickEvent;", "", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "quantity", "", "state", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "Ljava/lang/Integer;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getState", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class ClickEvent {

        @NotNull
        private final AtomAction.Click action;
        private final Integer quantity;
        private final String state;

        public ClickEvent(@NotNull AtomAction.Click action, Integer num, String str) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.quantity = num;
            this.state = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClickEvent)) {
                return false;
            }
            ClickEvent clickEvent = (ClickEvent) other;
            return Intrinsics.d(this.action, clickEvent.action) && Intrinsics.d(this.quantity, clickEvent.quantity) && Intrinsics.d(this.state, clickEvent.state);
        }

        @NotNull
        public final AtomAction.Click getAction() {
            return this.action;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Integer num = this.quantity;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.state;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomAction.Click click = this.action;
            Integer num = this.quantity;
            String str = this.state;
            StringBuilder sb2 = new StringBuilder("ClickEvent(action=");
            sb2.append(click);
            sb2.append(", quantity=");
            sb2.append(num);
            sb2.append(", state=");
            return o0.c(sb2, str, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductsToPayWidgetClickHelper(@NotNull Function1<? super AtomAction.Click, Unit> processAction) {
        Intrinsics.checkNotNullParameter(processAction, "processAction");
        this.processAction = processAction;
        this.debounceSharedFlow = E0.b(0, 0, null, 6);
    }

    private final void handleClick(ClickEvent event) {
        Map<String, String> params = event.getAction().getParams();
        if (params == null) {
            params = U.c();
        }
        LinkedHashMap u11 = U.u(params);
        Integer quantity = event.getQuantity();
        if (quantity != null) {
            u11.put("qty", String.valueOf(quantity.intValue()));
        }
        String state = event.getState();
        if (state != null) {
            u11.put("state", state);
        }
        this.processAction.invoke(AtomAction.Click.copy$default(event.getAction(), null, null, null, u11, null, null, 55, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object initFlow$handleClick(ProductsToPayWidgetClickHelper productsToPayWidgetClickHelper, ClickEvent clickEvent, d dVar) {
        productsToPayWidgetClickHelper.handleClick(clickEvent);
        return Unit.f71690a;
    }

    public final void initFlow(@NotNull M scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        C2399j.C(new C2408n0(C2399j.l(this.debounceSharedFlow, 300L), new ProductsToPayWidgetClickHelper$initFlow$1(this)), scope);
    }

    public final Object onCounterClick(@NotNull AtomAction atomAction, int i11, String str, @NotNull d<? super Unit> dVar) {
        Object emit;
        return ((atomAction instanceof AtomAction.Click) && (emit = this.debounceSharedFlow.emit(new ClickEvent((AtomAction.Click) atomAction, new Integer(i11), str), dVar)) == a.COROUTINE_SUSPENDED) ? emit : Unit.f71690a;
    }

    public final void onItemClick(@NotNull AtomAction action, String state) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            handleClick(new ClickEvent((AtomAction.Click) action, null, state));
        }
    }
}
