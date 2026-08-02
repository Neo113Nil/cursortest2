package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation;

import B0.C2454a;
import BT.b;
import Bc.f;
import Bc.i;
import Bc.r;
import C.o0;
import Dp.C2877a;
import G.g;
import Kk.c;
import Lz.d;
import Mc.a;
import WZ.t;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u0002HIB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00132\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001d\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070%8\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010*R!\u0010<\u001a\f\u0012\b\u0012\u00060:j\u0002`;0%8\u0006¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010*R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010D\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "api", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;)V", "", "direction", "", "sendEventByDirection", "(I)V", "newPosition", "oldPosition", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "days", "changeIsSelected", "(IILjava/util/List;)V", "", "", "provideRequestBody", "()Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO;", "item", "setup", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO;)V", "flightDirection", "changePosition", "(II)V", "scrollFinished", "getTotalPrice", "()Ljava/lang/String;", "actionName", "params", "onFindTicketsClicked", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$NewPosition;", "daysFromLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getDaysFromLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "daysToLiveData", "getDaysToLiveData", "scrollFromLiveData", "getScrollFromLiveData", "scrollToLiveData", "getScrollToLiveData", "Landroidx/lifecycle/V;", "", "loadingStateLiveData", "Landroidx/lifecycle/V;", "getLoadingStateLiveData", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action;", "actionLiveData", "getActionLiveData", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingLiveData", "getTrackingLiveData", "listOfDaysFrom", "Ljava/util/List;", "listOfDaysTo", "positionFrom", "I", "positionTo", "haveDirectionTo", "Z", "lastTrackedDate", "Ljava/lang/Integer;", "NewPosition", "Action", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final TravelCommonActionResultApi api;

    @NotNull
    private final SingleLiveEvent<NewPosition> daysFromLiveData;

    @NotNull
    private final SingleLiveEvent<NewPosition> daysToLiveData;
    private boolean haveDirectionTo;
    private Integer lastTrackedDate;

    @NotNull
    private List<PricesHistogramVO.MonthVO.DayVO> listOfDaysFrom;

    @NotNull
    private List<PricesHistogramVO.MonthVO.DayVO> listOfDaysTo;

    @NotNull
    private final V<Boolean> loadingStateLiveData;
    private int positionFrom;
    private int positionTo;

    @NotNull
    private final SingleLiveEvent<NewPosition> scrollFromLiveData;

    @NotNull
    private final SingleLiveEvent<NewPosition> scrollToLiveData;

    @NotNull
    private final SingleLiveEvent<t> trackingLiveData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action;", "", "Error", "Success", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action$Success;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 325826154;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action$Success;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;

            public Success(@NotNull AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.atomAction, ((Success) other).atomAction);
            }

            @NotNull
            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public int hashCode() {
                return this.atomAction.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Success(atomAction=", ")", this.atomAction);
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$NewPosition;", "", "", "position", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "days", "", "totalPrice", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Ljava/util/List;", "getDays", "()Ljava/util/List;", "Ljava/lang/String;", "getTotalPrice", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewPosition {

        @NotNull
        private final List<PricesHistogramVO.MonthVO.DayVO> days;
        private final int position;

        @NotNull
        private final String totalPrice;

        public NewPosition(int i11, @NotNull List<PricesHistogramVO.MonthVO.DayVO> days, @NotNull String totalPrice) {
            Intrinsics.checkNotNullParameter(days, "days");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            this.position = i11;
            this.days = days;
            this.totalPrice = totalPrice;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewPosition)) {
                return false;
            }
            NewPosition newPosition = (NewPosition) other;
            return this.position == newPosition.position && Intrinsics.d(this.days, newPosition.days) && Intrinsics.d(this.totalPrice, newPosition.totalPrice);
        }

        @NotNull
        public final List<PricesHistogramVO.MonthVO.DayVO> getDays() {
            return this.days;
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final String getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            return this.totalPrice.hashCode() + g.b(Integer.hashCode(this.position) * 31, 31, this.days);
        }

        @NotNull
        public String toString() {
            int i11 = this.position;
            List<PricesHistogramVO.MonthVO.DayVO> list = this.days;
            String str = this.totalPrice;
            StringBuilder sb2 = new StringBuilder("NewPosition(position=");
            sb2.append(i11);
            sb2.append(", days=");
            sb2.append(list);
            sb2.append(", totalPrice=");
            return o0.c(sb2, str, ")");
        }
    }

    public PricesHistogramViewModel(@NotNull TravelCommonActionResultApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.daysFromLiveData = new SingleLiveEvent<>();
        this.daysToLiveData = new SingleLiveEvent<>();
        this.scrollFromLiveData = new SingleLiveEvent<>();
        this.scrollToLiveData = new SingleLiveEvent<>();
        this.loadingStateLiveData = new V<>();
        this.actionLiveData = new SingleLiveEvent<>();
        this.trackingLiveData = new SingleLiveEvent<>();
        this.listOfDaysFrom = new ArrayList();
        this.listOfDaysTo = new ArrayList();
        this.positionFrom = -1;
        this.positionTo = -1;
    }

    private final void changeIsSelected(int newPosition, int oldPosition, List<PricesHistogramVO.MonthVO.DayVO> days) {
        days.set(oldPosition, PricesHistogramVO.MonthVO.DayVO.copy$default(days.get(oldPosition), 0, null, null, null, false, null, 0, false, null, null, null, 2031, null));
        days.set(newPosition, PricesHistogramVO.MonthVO.DayVO.copy$default(days.get(newPosition), 0, null, null, null, true, null, 0, false, null, null, null, 2031, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomAction onFindTicketsClicked$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AtomAction) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFindTicketsClicked$lambda$6(PricesHistogramViewModel pricesHistogramViewModel) {
        pricesHistogramViewModel.loadingStateLiveData.setValue(Boolean.FALSE);
    }

    private final Map<String, String> provideRequestBody() {
        if (!this.haveDirectionTo) {
            return C2454a.b("from", this.listOfDaysFrom.get(this.positionFrom).getDate());
        }
        return U.j(new Pair("from", this.listOfDaysFrom.get(this.positionFrom).getDate()), new Pair("to", this.listOfDaysTo.get(this.positionTo).getDate()));
    }

    private final void sendEventByDirection(int direction) {
        t daySelectionTracking;
        t daySelectionTracking2;
        Integer num = this.lastTrackedDate;
        int i11 = this.positionFrom;
        if (num == null || num.intValue() != i11) {
            Integer num2 = this.lastTrackedDate;
            int i12 = this.positionTo;
            if (num2 == null || num2.intValue() != i12) {
                if (direction == 0) {
                    PricesHistogramVO.MonthVO.DayVO dayVO = (PricesHistogramVO.MonthVO.DayVO) C7714v.Q(this.positionFrom, this.listOfDaysFrom);
                    if (dayVO != null && (daySelectionTracking = dayVO.getDaySelectionTracking()) != null) {
                        this.trackingLiveData.setValue(daySelectionTracking);
                    }
                    this.lastTrackedDate = Integer.valueOf(this.positionFrom);
                    return;
                }
                if (direction != 1) {
                    return;
                }
                PricesHistogramVO.MonthVO.DayVO dayVO2 = (PricesHistogramVO.MonthVO.DayVO) C7714v.Q(this.positionTo, this.listOfDaysTo);
                if (dayVO2 != null && (daySelectionTracking2 = dayVO2.getDaySelectionTracking()) != null) {
                    this.trackingLiveData.setValue(daySelectionTracking2);
                }
                this.lastTrackedDate = Integer.valueOf(this.positionTo);
                return;
            }
        }
        this.lastTrackedDate = null;
    }

    public final void changePosition(int newPosition, int flightDirection) {
        int i11;
        int i12;
        if (flightDirection == 0 && (i12 = this.positionFrom) != -1) {
            changeIsSelected(newPosition, i12, this.listOfDaysFrom);
            this.positionFrom = newPosition;
            this.daysFromLiveData.setValue(new NewPosition(newPosition, this.listOfDaysFrom, getTotalPrice()));
        } else {
            if (flightDirection != 1 || this.positionFrom == -1 || (i11 = this.positionTo) == -1) {
                return;
            }
            changeIsSelected(newPosition, i11, this.listOfDaysTo);
            this.positionTo = newPosition;
            this.daysToLiveData.setValue(new NewPosition(newPosition, this.listOfDaysTo, getTotalPrice()));
        }
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final SingleLiveEvent<NewPosition> getDaysFromLiveData() {
        return this.daysFromLiveData;
    }

    @NotNull
    public final SingleLiveEvent<NewPosition> getDaysToLiveData() {
        return this.daysToLiveData;
    }

    @NotNull
    public final V<Boolean> getLoadingStateLiveData() {
        return this.loadingStateLiveData;
    }

    @NotNull
    public final SingleLiveEvent<NewPosition> getScrollFromLiveData() {
        return this.scrollFromLiveData;
    }

    @NotNull
    public final SingleLiveEvent<NewPosition> getScrollToLiveData() {
        return this.scrollToLiveData;
    }

    @NotNull
    public final String getTotalPrice() {
        int i11 = this.positionFrom;
        if (i11 != -1 && this.positionTo != -1 && this.listOfDaysFrom.get(i11).getPrice() != 0 && this.listOfDaysTo.get(this.positionTo).getPrice() != 0) {
            return String.valueOf(this.listOfDaysTo.get(this.positionTo).getPrice() + this.listOfDaysFrom.get(this.positionFrom).getPrice());
        }
        int i12 = this.positionFrom;
        return (i12 == -1 || this.positionTo != -1 || this.listOfDaysFrom.get(i12).getPrice() == 0) ? "" : String.valueOf(this.listOfDaysFrom.get(this.positionFrom).getPrice());
    }

    @NotNull
    public final SingleLiveEvent<t> getTrackingLiveData() {
        return this.trackingLiveData;
    }

    public final void onFindTicketsClicked(@NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C5415f.a(this).d();
        LinkedHashMap u11 = U.u(provideRequestBody());
        if (params != null) {
            u11.putAll(params);
        }
        y<TravelCommonActionResponse> performAction = this.api.performAction(actionName, u11);
        Cw.c cVar = new Cw.c(PricesHistogramViewModel$onFindTicketsClicked$1.INSTANCE, 9);
        performAction.getClass();
        C5415f.a(this).a(new f(new i(new r(performAction, cVar).j(a.b()).g(C8125a.a()), new b(new PricesHistogramViewModel$onFindTicketsClicked$2(this), 6)), new InterfaceC9019a() { // from class: hP.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                PricesHistogramViewModel.onFindTicketsClicked$lambda$6(PricesHistogramViewModel.this);
            }
        }).h(new d(new PricesHistogramViewModel$onFindTicketsClicked$4(this), 3), new C2877a(new PricesHistogramViewModel$onFindTicketsClicked$5(this), 7)));
    }

    public final void scrollFinished(int direction) {
        int i11;
        int i12;
        sendEventByDirection(direction);
        if (!this.haveDirectionTo || (i11 = this.positionFrom) <= (i12 = this.positionTo)) {
            return;
        }
        if (direction == 0) {
            changeIsSelected(i11, i12, this.listOfDaysTo);
            int i13 = this.positionFrom;
            this.positionTo = i13;
            this.scrollToLiveData.setValue(new NewPosition(i13, this.listOfDaysTo, getTotalPrice()));
        }
        if (direction == 1) {
            changeIsSelected(this.positionTo, this.positionFrom, this.listOfDaysFrom);
            int i14 = this.positionTo;
            this.positionFrom = i14;
            this.scrollFromLiveData.setValue(new NewPosition(i14, this.listOfDaysFrom, getTotalPrice()));
        }
    }

    public final void setup(@NotNull PricesHistogramVO item) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        this.listOfDaysFrom.addAll(item.getListDaysFrom());
        Iterator<PricesHistogramVO.MonthVO.DayVO> it = this.listOfDaysFrom.iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = -1;
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (it.next().getIsSelected()) {
                break;
            } else {
                i13++;
            }
        }
        this.positionFrom = i13;
        if (item.getListDaysTo() != null) {
            this.haveDirectionTo = true;
            this.listOfDaysTo.addAll(item.getListDaysTo());
            Iterator<PricesHistogramVO.MonthVO.DayVO> it2 = this.listOfDaysTo.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().getIsSelected()) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            this.positionTo = i11;
        }
    }
}
