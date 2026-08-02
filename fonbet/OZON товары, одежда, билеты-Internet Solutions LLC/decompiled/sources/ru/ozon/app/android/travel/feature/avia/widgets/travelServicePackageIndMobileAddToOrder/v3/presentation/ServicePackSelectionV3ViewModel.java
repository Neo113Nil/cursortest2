package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation;

import BO.b;
import Bc.f;
import Bc.i;
import Bc.r;
import Fy.C3065c;
import Gy.c;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3ViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "api", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;)V", "Landroidx/lifecycle/P;", "", "progressLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action;", "actionLiveData", "", "actionName", "", "params", "", "performApiAction", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Action", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackSelectionV3ViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final TravelCommonActionResultApi api;

    @NotNull
    private final V<Boolean> progressLiveData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action;", "", "Error", "Success", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action$Success;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 598888407;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action$Success;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "shouldCloseFlow", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "getShouldCloseFlow", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;
            private final boolean shouldCloseFlow;

            public Success(@NotNull AtomAction atomAction, boolean z11) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
                this.shouldCloseFlow = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.atomAction, success.atomAction) && this.shouldCloseFlow == success.shouldCloseFlow;
            }

            @NotNull
            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public final boolean getShouldCloseFlow() {
                return this.shouldCloseFlow;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldCloseFlow) + (this.atomAction.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Success(atomAction=" + this.atomAction + ", shouldCloseFlow=" + this.shouldCloseFlow + ")";
            }
        }
    }

    public ServicePackSelectionV3ViewModel(@NotNull TravelCommonActionResultApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.progressLiveData = new V<>();
        this.actionLiveData = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Action.Success performApiAction$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Action.Success) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performApiAction$lambda$2(ServicePackSelectionV3ViewModel servicePackSelectionV3ViewModel) {
        servicePackSelectionV3ViewModel.progressLiveData.setValue(Boolean.FALSE);
    }

    @NotNull
    public final P<Action> actionLiveData() {
        return this.actionLiveData;
    }

    public final void performApiAction(@NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C5415f.a(this).d();
        TravelCommonActionResultApi travelCommonActionResultApi = this.api;
        if (params == null) {
            params = U.c();
        }
        C5415f.a(this).a(new f(new i(new r(travelCommonActionResultApi.performAction(actionName, params).j(a.b()), new C3065c(ServicePackSelectionV3ViewModel$performApiAction$1.INSTANCE, 12)).g(C8125a.a()), new Gy.a(new ServicePackSelectionV3ViewModel$performApiAction$2(this), 8)), new InterfaceC9019a() { // from class: kN.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                ServicePackSelectionV3ViewModel.performApiAction$lambda$2(ServicePackSelectionV3ViewModel.this);
            }
        }).h(new c(new ServicePackSelectionV3ViewModel$performApiAction$4(this), 6), new b(new ServicePackSelectionV3ViewModel$performApiAction$5(this), 9)));
    }

    @NotNull
    public final P<Boolean> progressLiveData() {
        return this.progressLiveData;
    }
}
