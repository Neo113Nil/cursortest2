package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation;

import AA.a;
import AA.d;
import Bc.i;
import Bc.k;
import Bc.r;
import Kk.c;
import Lz.C3602a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.TravelOrderListMobileViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "api", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;)V", "", "actionName", "", "params", "", "performApiAction", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "", "progressLiveData", "Landroidx/lifecycle/V;", "getProgressLiveData", "()Landroidx/lifecycle/V;", "Action", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListMobileViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final TravelCommonActionResultApi api;

    @NotNull
    private final V<Boolean> progressLiveData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action;", "", "Error", "Execute", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action$Execute;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 729887808;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action$Execute;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "task", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getTask", "()Lru/ozon/uni/atoms/af/AtomAction;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Execute implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction task;

            public Execute(@NotNull AtomAction task) {
                Intrinsics.checkNotNullParameter(task, "task");
                this.task = task;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Execute) && Intrinsics.d(this.task, ((Execute) other).task);
            }

            @NotNull
            public final AtomAction getTask() {
                return this.task;
            }

            public int hashCode() {
                return this.task.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Execute(task=", ")", this.task);
            }
        }
    }

    public TravelOrderListMobileViewModel(@NotNull TravelCommonActionResultApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.actionLiveData = new SingleLiveEvent<>();
        this.progressLiveData = new V<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomAction performApiAction$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AtomAction) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performApiAction$lambda$2(TravelOrderListMobileViewModel travelOrderListMobileViewModel) {
        travelOrderListMobileViewModel.progressLiveData.setValue(Boolean.FALSE);
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final V<Boolean> getProgressLiveData() {
        return this.progressLiveData;
    }

    public final void performApiAction(@NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C5415f.a(this).d();
        C8486a a11 = C5415f.a(this);
        TravelCommonActionResultApi travelCommonActionResultApi = this.api;
        if (params == null) {
            params = U.c();
        }
        y<TravelCommonActionResponse> performAction = travelCommonActionResultApi.performAction(actionName, params);
        a aVar = new a(TravelOrderListMobileViewModel$performApiAction$1.INSTANCE, 7);
        performAction.getClass();
        InterfaceC8487b h11 = new k(new i(new r(performAction, aVar).j(Mc.a.b()).g(C8125a.a()), new C3602a(new TravelOrderListMobileViewModel$performApiAction$2(this), 6)), new InterfaceC9019a() { // from class: jR.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                TravelOrderListMobileViewModel.performApiAction$lambda$2(TravelOrderListMobileViewModel.this);
            }
        }).h(new d(new TravelOrderListMobileViewModel$performApiAction$4(this), 9), new Cw.c(new TravelOrderListMobileViewModel$performApiAction$5(this), 10));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }
}
