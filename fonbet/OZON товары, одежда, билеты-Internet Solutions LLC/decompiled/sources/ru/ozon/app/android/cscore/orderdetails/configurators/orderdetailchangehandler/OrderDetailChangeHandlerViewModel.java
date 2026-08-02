package ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.s;
import Sh.b;
import Wc.a;
import androidx.lifecycle.w0;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeEvent;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "manager", "<init>", "(Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;)V", "", "Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action;", "comingActions", "appendToPendingActions", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "LAe/x0;", "_action", "LAe/x0;", "LAe/M0;", "action", "LAe/M0;", "getAction", "()LAe/M0;", "Action", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDetailChangeHandlerViewModel extends w0 {

    @NotNull
    private final x0<List<Action>> _action;

    @NotNull
    private final M0<List<Action>> action;

    @NotNull
    private final OrderChangeManager manager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailChangeHandlerViewModel$1", f = "OrderDetailChangeHandlerViewModel.kt", l = {21}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailChangeHandlerViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return OrderDetailChangeHandlerViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h<Set<OrderChangeEvent>> eventEmitter = OrderDetailChangeHandlerViewModel.this.manager.getEventEmitter();
                final OrderDetailChangeHandlerViewModel orderDetailChangeHandlerViewModel = OrderDetailChangeHandlerViewModel.this;
                InterfaceC2397i<? super Set<OrderChangeEvent>> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailChangeHandlerViewModel.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Set<? extends OrderChangeEvent>) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Set<? extends OrderChangeEvent> set, d<? super Unit> dVar) {
                        List<Action> actions = MapperKt.toActions(set);
                        x0 x0Var = OrderDetailChangeHandlerViewModel.this._action;
                        if (OrderDetailChangeHandlerViewModel.this._action.getSubscriptionCount().getValue().intValue() <= 0) {
                            actions = OrderDetailChangeHandlerViewModel.this.appendToPendingActions(actions);
                        }
                        x0Var.setValue(actions);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (eventEmitter.collect(interfaceC2397i, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action;", "", "<init>", "()V", "RefreshPage", "ShowMessage", "Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action$RefreshPage;", "Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action$ShowMessage;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action$RefreshPage;", "Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action;", "", "timestamp", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RefreshPage extends Action {
            private final long timestamp;

            public RefreshPage() {
                this(0L, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RefreshPage) && this.timestamp == ((RefreshPage) other).timestamp;
            }

            public int hashCode() {
                return Long.hashCode(this.timestamp);
            }

            @NotNull
            public String toString() {
                return b.b(this.timestamp, "RefreshPage(timestamp=", ")");
            }

            public /* synthetic */ RefreshPage(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? System.currentTimeMillis() : j11);
            }

            public RefreshPage(long j11) {
                super(null);
                this.timestamp = j11;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action$ShowMessage;", "Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel$Action;", "", "message", "", "iconId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getIconId", "()Ljava/lang/Integer;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowMessage extends Action {
            private final Integer iconId;

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowMessage(@NotNull String message, Integer num) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
                this.iconId = num;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowMessage)) {
                    return false;
                }
                ShowMessage showMessage = (ShowMessage) other;
                return Intrinsics.d(this.message, showMessage.message) && Intrinsics.d(this.iconId, showMessage.iconId);
            }

            public final Integer getIconId() {
                return this.iconId;
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                int hashCode = this.message.hashCode() * 31;
                Integer num = this.iconId;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @NotNull
            public String toString() {
                return "ShowMessage(message=" + this.message + ", iconId=" + this.iconId + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public OrderDetailChangeHandlerViewModel(@NotNull OrderChangeManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.manager = manager;
        x0<List<Action>> a11 = O0.a(K.f71697a);
        this._action = a11;
        this.action = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Action> appendToPendingActions(List<? extends Action> comingActions) {
        List<Action> value = this._action.getValue();
        C7714v.W0(value).addAll(comingActions);
        return value;
    }

    @NotNull
    public final M0<List<Action>> getAction() {
        return this.action;
    }
}
