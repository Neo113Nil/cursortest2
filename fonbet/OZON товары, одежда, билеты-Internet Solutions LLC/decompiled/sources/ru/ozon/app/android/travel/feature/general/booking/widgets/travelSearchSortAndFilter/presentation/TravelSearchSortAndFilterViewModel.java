package ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation;

import Bc.r;
import Kk.c;
import Lz.C3602a;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "api", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result;", "atomActionLiveData", "()Landroidx/lifecycle/P;", "", "actionName", "", "params", "", "performAction", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Result", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelSearchSortAndFilterViewModel extends w0 {

    @NotNull
    private final TravelCommonActionResultApi api;

    @NotNull
    private final SingleLiveEvent<Result> atomActionLiveData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result;", "", "Error", "Success", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result$Error;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result$Success;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Result {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result$Error;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Result {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -812153892;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result$Success;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements Result {

            @NotNull
            private final AtomAction action;

            public Success(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.action, ((Success) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Success(action=", ")", this.action);
            }
        }
    }

    public TravelSearchSortAndFilterViewModel(@NotNull TravelCommonActionResultApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.atomActionLiveData = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomAction performAction$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AtomAction) function1.invoke(p02);
    }

    @NotNull
    public final P<Result> atomActionLiveData() {
        return this.atomActionLiveData;
    }

    public final void performAction(@NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C5415f.a(this).d();
        TravelCommonActionResultApi travelCommonActionResultApi = this.api;
        if (params == null) {
            params = U.c();
        }
        C5415f.a(this).a(new r(travelCommonActionResultApi.performAction(actionName, params).j(a.b()), new AA.a(TravelSearchSortAndFilterViewModel$performAction$1.INSTANCE, 6)).g(C8125a.a()).h(new C3602a(new TravelSearchSortAndFilterViewModel$performAction$2(this), 5), new AA.c(new TravelSearchSortAndFilterViewModel$performAction$3(this), 4)));
    }
}
