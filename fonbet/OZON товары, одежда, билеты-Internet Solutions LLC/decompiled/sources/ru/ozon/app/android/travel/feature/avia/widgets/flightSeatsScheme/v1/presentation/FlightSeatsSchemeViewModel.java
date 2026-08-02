package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation;

import B0.C2454a;
import D40.c;
import G.g;
import Je.InterfaceC3394a;
import Je.e;
import Nh.a;
import T7.P;
import Tl.b;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatCommand;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatDeselectCommand;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.command.FlightSeatSelectCommand;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContentRow;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.B0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0007bcdefghB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f¢\u0006\u0004\b\u0017\u0010\u000fJ\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\f¢\u0006\u0004\b\u0018\u0010\u000fJ\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f¢\u0006\u0004\b\u001a\u0010\u000fJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f¢\u0006\u0004\b\u001c\u0010\u000fJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\f¢\u0006\u0004\b\u001e\u0010\u000fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f¢\u0006\u0004\b \u0010\u000fJ\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f¢\u0006\u0004\b\"\u0010\u000fJ\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\f¢\u0006\u0004\b#\u0010\u000fJ\u0015\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J'\u00102\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u001d¢\u0006\u0004\b5\u00106JE\u0010?\u001a\u00020\u00162\u0006\u00108\u001a\u0002072\u0018\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002070:092\u0012\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160=0<H\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020*0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020(0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010P\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u0002070M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\"\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\"\u0010R\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020.0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010OR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020S0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010LR\u0018\u0010U\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\\R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\\R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\\R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\\R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\\R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\\R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\\R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\\R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\\R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\\R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010^R\u0014\u0010a\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006i"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "api", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "passengersBlockMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "schemeBlockMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;", "orderDetailsMapper", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSelection;", "passengerTabSelectionLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSeatUpdate;", "passengerTabSeatUpdateLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SeatSelection;", "seatSelectionLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$ScrollToSeat;", "scrollToSchemeRowLiveData", "", "seatSelectionError", "networkErrorLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$OrderDetailsInfo;", "orderDetailsLiveData", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "updateOrderTotalLiveData", "", "changeOrderTotalVisibilityLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerBlockUpdate;", "passengersBlockUpdateVoLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SchemeUpdate;", "schemeUpdateVoLiveData", "isClearButtonVisible", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "item", "setUp", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;)V", "", "position", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "passenger", "onPassengerTabClicked", "(ILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;)V", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "seat", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "selectAction", "onSeatClicked", "(ILru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "isVisible", "changeOrderTotalVisibility", "(Z)V", "", "link", "", "", "paramList", "Ljava/util/Deque;", "Lkotlin/Function0;", "undoOperations", "syncSelectionWithServer", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;", "LJe/a;", "mutex", "LJe/a;", "selectedPassengerTabPosition", "I", "", "passengerTabs", "Ljava/util/List;", "", "seatNumberToPassengerMap", "Ljava/util/Map;", "passengerToSeatNumberMap", "passengerToSeatPositionMap", "seatTypes", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "schemeItems", "selectedSeatTemplate", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "", "Lxe/B0;", "networkJobs", "[Lxe/B0;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "getSelectedPassengerId", "()I", "selectedPassengerId", "PassengerTabSelection", "PassengerTabSeatUpdate", "SeatSelection", "ScrollToSeat", "OrderDetailsInfo", "PassengerBlockUpdate", "SchemeUpdate", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeViewModel extends w0 {

    @NotNull
    private final ActionV2Repository api;

    @NotNull
    private final SingleLiveEvent<Boolean> changeOrderTotalVisibilityLiveData;

    @NotNull
    private final V<Boolean> isClearButtonVisible;

    @NotNull
    private final InterfaceC3394a mutex;

    @NotNull
    private final SingleLiveEvent<Unit> networkErrorLiveData;

    @NotNull
    private B0[] networkJobs;

    @NotNull
    private final SingleLiveEvent<OrderDetailsInfo> orderDetailsLiveData;

    @NotNull
    private final FlightSeatsSchemeOrderDetailsMapper orderDetailsMapper;

    @NotNull
    private final SingleLiveEvent<PassengerTabSeatUpdate> passengerTabSeatUpdateLiveData;

    @NotNull
    private final SingleLiveEvent<PassengerTabSelection> passengerTabSelectionLiveData;

    @NotNull
    private List<FlightSeatsSchemePassengersBlockVO.Passenger> passengerTabs;

    @NotNull
    private Map<Integer, String> passengerToSeatNumberMap;

    @NotNull
    private Map<Integer, Integer> passengerToSeatPositionMap;

    @NotNull
    private final FlightSeatsSchemePassengersBlockMapper passengersBlockMapper;

    @NotNull
    private final SingleLiveEvent<PassengerBlockUpdate> passengersBlockUpdateVoLiveData;

    @NotNull
    private final FlightSeatsSchemeBlockMapper schemeBlockMapper;

    @NotNull
    private List<FlightSeatsSchemeItem> schemeItems;

    @NotNull
    private final SingleLiveEvent<SchemeUpdate> schemeUpdateVoLiveData;

    @NotNull
    private final SingleLiveEvent<ScrollToSeat> scrollToSchemeRowLiveData;

    @NotNull
    private Map<String, Integer> seatNumberToPassengerMap;

    @NotNull
    private final SingleLiveEvent<Unit> seatSelectionError;

    @NotNull
    private final SingleLiveEvent<SeatSelection> seatSelectionLiveData;

    @NotNull
    private Map<String, AirplaneSeatVO> seatTypes;
    private int selectedPassengerTabPosition;
    private AirplaneSeatVO selectedSeatTemplate;

    @NotNull
    private final SingleLiveEvent<OrderTotalVO> updateOrderTotalLiveData;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$OrderDetailsInfo;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "schemeDetails", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "clickEvent", "payloads", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "getSchemeDetails", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "Ljava/util/Map;", "getClickEvent", "()Ljava/util/Map;", "getPayloads", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderDetailsInfo {
        private final Map<String, TokenizedTrackingInfo> clickEvent;
        private final Map<String, String> payloads;
        private final FlightSeatsSchemeOrderDetailsVO schemeDetails;

        public OrderDetailsInfo(FlightSeatsSchemeOrderDetailsVO flightSeatsSchemeOrderDetailsVO, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2) {
            this.schemeDetails = flightSeatsSchemeOrderDetailsVO;
            this.clickEvent = map;
            this.payloads = map2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderDetailsInfo)) {
                return false;
            }
            OrderDetailsInfo orderDetailsInfo = (OrderDetailsInfo) other;
            return Intrinsics.d(this.schemeDetails, orderDetailsInfo.schemeDetails) && Intrinsics.d(this.clickEvent, orderDetailsInfo.clickEvent) && Intrinsics.d(this.payloads, orderDetailsInfo.payloads);
        }

        public final Map<String, TokenizedTrackingInfo> getClickEvent() {
            return this.clickEvent;
        }

        public final Map<String, String> getPayloads() {
            return this.payloads;
        }

        public final FlightSeatsSchemeOrderDetailsVO getSchemeDetails() {
            return this.schemeDetails;
        }

        public int hashCode() {
            FlightSeatsSchemeOrderDetailsVO flightSeatsSchemeOrderDetailsVO = this.schemeDetails;
            int hashCode = (flightSeatsSchemeOrderDetailsVO == null ? 0 : flightSeatsSchemeOrderDetailsVO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.clickEvent;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.payloads;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            FlightSeatsSchemeOrderDetailsVO flightSeatsSchemeOrderDetailsVO = this.schemeDetails;
            Map<String, TokenizedTrackingInfo> map = this.clickEvent;
            Map<String, String> map2 = this.payloads;
            StringBuilder sb2 = new StringBuilder("OrderDetailsInfo(schemeDetails=");
            sb2.append(flightSeatsSchemeOrderDetailsVO);
            sb2.append(", clickEvent=");
            sb2.append(map);
            sb2.append(", payloads=");
            return P.f(sb2, map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerBlockUpdate;", "", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "passengers", "", "selectedPosition", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "I", "getSelectedPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerBlockUpdate {

        @NotNull
        private final List<FlightSeatsSchemePassengersBlockVO.Passenger> passengers;
        private final int selectedPosition;

        public PassengerBlockUpdate(@NotNull List<FlightSeatsSchemePassengersBlockVO.Passenger> passengers, int i11) {
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            this.passengers = passengers;
            this.selectedPosition = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerBlockUpdate)) {
                return false;
            }
            PassengerBlockUpdate passengerBlockUpdate = (PassengerBlockUpdate) other;
            return Intrinsics.d(this.passengers, passengerBlockUpdate.passengers) && this.selectedPosition == passengerBlockUpdate.selectedPosition;
        }

        @NotNull
        public final List<FlightSeatsSchemePassengersBlockVO.Passenger> getPassengers() {
            return this.passengers;
        }

        public final int getSelectedPosition() {
            return this.selectedPosition;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedPosition) + (this.passengers.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PassengerBlockUpdate(passengers=" + this.passengers + ", selectedPosition=" + this.selectedPosition + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSeatUpdate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "item", "", "position", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "getItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "I", "getPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerTabSeatUpdate {

        @NotNull
        private final FlightSeatsSchemePassengersBlockVO.Passenger item;
        private final int position;

        public PassengerTabSeatUpdate(@NotNull FlightSeatsSchemePassengersBlockVO.Passenger item, int i11) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.position = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerTabSeatUpdate)) {
                return false;
            }
            PassengerTabSeatUpdate passengerTabSeatUpdate = (PassengerTabSeatUpdate) other;
            return Intrinsics.d(this.item, passengerTabSeatUpdate.item) && this.position == passengerTabSeatUpdate.position;
        }

        @NotNull
        public final FlightSeatsSchemePassengersBlockVO.Passenger getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.position) + (this.item.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PassengerTabSeatUpdate(item=" + this.item + ", position=" + this.position + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SchemeUpdate;", "", "", "firstSelectedSeatIndex", "", "", "seatNumberToPassengerMap", "passengerToSeatNumberMap", "passengerToSeatPositionMap", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "schemeItems", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "passengerTabs", "<init>", "(Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getFirstSelectedSeatIndex", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getSeatNumberToPassengerMap", "()Ljava/util/Map;", "getPassengerToSeatNumberMap", "getPassengerToSeatPositionMap", "Ljava/util/List;", "getSchemeItems", "()Ljava/util/List;", "getPassengerTabs", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SchemeUpdate {
        private final Integer firstSelectedSeatIndex;

        @NotNull
        private final List<FlightSeatsSchemePassengersBlockVO.Passenger> passengerTabs;

        @NotNull
        private final Map<Integer, String> passengerToSeatNumberMap;

        @NotNull
        private final Map<Integer, Integer> passengerToSeatPositionMap;

        @NotNull
        private final List<FlightSeatsSchemeItem> schemeItems;

        @NotNull
        private final Map<String, Integer> seatNumberToPassengerMap;

        /* JADX WARN: Multi-variable type inference failed */
        public SchemeUpdate(Integer num, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull List<? extends FlightSeatsSchemeItem> schemeItems, @NotNull List<FlightSeatsSchemePassengersBlockVO.Passenger> passengerTabs) {
            Intrinsics.checkNotNullParameter(seatNumberToPassengerMap, "seatNumberToPassengerMap");
            Intrinsics.checkNotNullParameter(passengerToSeatNumberMap, "passengerToSeatNumberMap");
            Intrinsics.checkNotNullParameter(passengerToSeatPositionMap, "passengerToSeatPositionMap");
            Intrinsics.checkNotNullParameter(schemeItems, "schemeItems");
            Intrinsics.checkNotNullParameter(passengerTabs, "passengerTabs");
            this.firstSelectedSeatIndex = num;
            this.seatNumberToPassengerMap = seatNumberToPassengerMap;
            this.passengerToSeatNumberMap = passengerToSeatNumberMap;
            this.passengerToSeatPositionMap = passengerToSeatPositionMap;
            this.schemeItems = schemeItems;
            this.passengerTabs = passengerTabs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SchemeUpdate)) {
                return false;
            }
            SchemeUpdate schemeUpdate = (SchemeUpdate) other;
            return Intrinsics.d(this.firstSelectedSeatIndex, schemeUpdate.firstSelectedSeatIndex) && Intrinsics.d(this.seatNumberToPassengerMap, schemeUpdate.seatNumberToPassengerMap) && Intrinsics.d(this.passengerToSeatNumberMap, schemeUpdate.passengerToSeatNumberMap) && Intrinsics.d(this.passengerToSeatPositionMap, schemeUpdate.passengerToSeatPositionMap) && Intrinsics.d(this.schemeItems, schemeUpdate.schemeItems) && Intrinsics.d(this.passengerTabs, schemeUpdate.passengerTabs);
        }

        public final Integer getFirstSelectedSeatIndex() {
            return this.firstSelectedSeatIndex;
        }

        @NotNull
        public final List<FlightSeatsSchemePassengersBlockVO.Passenger> getPassengerTabs() {
            return this.passengerTabs;
        }

        @NotNull
        public final Map<Integer, String> getPassengerToSeatNumberMap() {
            return this.passengerToSeatNumberMap;
        }

        @NotNull
        public final Map<Integer, Integer> getPassengerToSeatPositionMap() {
            return this.passengerToSeatPositionMap;
        }

        @NotNull
        public final List<FlightSeatsSchemeItem> getSchemeItems() {
            return this.schemeItems;
        }

        @NotNull
        public final Map<String, Integer> getSeatNumberToPassengerMap() {
            return this.seatNumberToPassengerMap;
        }

        public int hashCode() {
            Integer num = this.firstSelectedSeatIndex;
            return this.passengerTabs.hashCode() + g.b(c.a(this.passengerToSeatPositionMap, c.a(this.passengerToSeatNumberMap, c.a(this.seatNumberToPassengerMap, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31), 31, this.schemeItems);
        }

        @NotNull
        public String toString() {
            Integer num = this.firstSelectedSeatIndex;
            Map<String, Integer> map = this.seatNumberToPassengerMap;
            Map<Integer, String> map2 = this.passengerToSeatNumberMap;
            Map<Integer, Integer> map3 = this.passengerToSeatPositionMap;
            List<FlightSeatsSchemeItem> list = this.schemeItems;
            List<FlightSeatsSchemePassengersBlockVO.Passenger> list2 = this.passengerTabs;
            StringBuilder sb2 = new StringBuilder("SchemeUpdate(firstSelectedSeatIndex=");
            sb2.append(num);
            sb2.append(", seatNumberToPassengerMap=");
            sb2.append(map);
            sb2.append(", passengerToSeatNumberMap=");
            b.g(sb2, map2, ", passengerToSeatPositionMap=", map3, ", schemeItems=");
            sb2.append(list);
            sb2.append(", passengerTabs=");
            sb2.append(list2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SeatSelection;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "item", "", "position", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "getItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "I", "getPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatSelection {

        @NotNull
        private final FlightSchemeContentRow item;
        private final int position;

        public SeatSelection(@NotNull FlightSchemeContentRow item, int i11) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.position = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatSelection)) {
                return false;
            }
            SeatSelection seatSelection = (SeatSelection) other;
            return Intrinsics.d(this.item, seatSelection.item) && this.position == seatSelection.position;
        }

        @NotNull
        public final FlightSchemeContentRow getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.position) + (this.item.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SeatSelection(item=" + this.item + ", position=" + this.position + ")";
        }
    }

    public FlightSeatsSchemeViewModel(@NotNull ActionV2Repository api, @NotNull FlightSeatsSchemePassengersBlockMapper passengersBlockMapper, @NotNull FlightSeatsSchemeBlockMapper schemeBlockMapper, @NotNull FlightSeatsSchemeOrderDetailsMapper orderDetailsMapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(passengersBlockMapper, "passengersBlockMapper");
        Intrinsics.checkNotNullParameter(schemeBlockMapper, "schemeBlockMapper");
        Intrinsics.checkNotNullParameter(orderDetailsMapper, "orderDetailsMapper");
        this.api = api;
        this.passengersBlockMapper = passengersBlockMapper;
        this.schemeBlockMapper = schemeBlockMapper;
        this.orderDetailsMapper = orderDetailsMapper;
        this.mutex = e.a();
        this.passengerTabs = new ArrayList();
        this.seatNumberToPassengerMap = new LinkedHashMap();
        this.passengerToSeatNumberMap = new LinkedHashMap();
        this.passengerToSeatPositionMap = new LinkedHashMap();
        this.seatTypes = U.c();
        this.schemeItems = new ArrayList();
        this.networkJobs = new B0[0];
        this.passengerTabSelectionLiveData = new SingleLiveEvent<>();
        this.passengerTabSeatUpdateLiveData = new SingleLiveEvent<>();
        this.seatSelectionLiveData = new SingleLiveEvent<>();
        this.scrollToSchemeRowLiveData = new SingleLiveEvent<>();
        this.seatSelectionError = new SingleLiveEvent<>();
        this.networkErrorLiveData = new SingleLiveEvent<>();
        this.orderDetailsLiveData = new SingleLiveEvent<>();
        this.updateOrderTotalLiveData = new SingleLiveEvent<>();
        this.changeOrderTotalVisibilityLiveData = new SingleLiveEvent<>();
        this.passengersBlockUpdateVoLiveData = new SingleLiveEvent<>();
        this.schemeUpdateVoLiveData = new SingleLiveEvent<>();
        this.isClearButtonVisible = new V<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSelectedPassengerId() {
        return this.passengerTabs.get(this.selectedPassengerTabPosition).getId();
    }

    private final void syncSelectionWithServer(String link, List<? extends Map<String, String>> paramList, Deque<Function0<Unit>> undoOperations) {
        this.networkJobs[this.selectedPassengerTabPosition] = C10727i.c(x0.a(this), new FlightSeatsSchemeViewModel$syncSelectionWithServer$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this, undoOperations), null, new FlightSeatsSchemeViewModel$syncSelectionWithServer$1(paramList, undoOperations, this, link, null), 2);
    }

    public final void changeOrderTotalVisibility(boolean isVisible) {
        this.changeOrderTotalVisibilityLiveData.setValue(Boolean.valueOf(isVisible));
    }

    @NotNull
    public final androidx.lifecycle.P<Boolean> changeOrderTotalVisibilityLiveData() {
        return LiveDataOperatorsKt.distinct(this.changeOrderTotalVisibilityLiveData);
    }

    @NotNull
    public final androidx.lifecycle.P<Boolean> isClearButtonVisible() {
        return this.isClearButtonVisible;
    }

    @NotNull
    public final androidx.lifecycle.P<Unit> networkErrorLiveData() {
        return this.networkErrorLiveData;
    }

    public final void onPassengerTabClicked(int position, FlightSeatsSchemePassengersBlockVO.Passenger passenger) {
        if (passenger == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new FlightSeatsSchemeViewModel$onPassengerTabClicked$1(this, position, passenger, null), 3);
    }

    public final void onSeatClicked(int position, @NotNull AirplaneSeatVO seat, AtomActionDTO selectAction) {
        String number;
        AirplaneSeatVO airplaneSeatVO;
        Intrinsics.checkNotNullParameter(seat, "seat");
        if ((selectAction != null ? selectAction.getLink() : null) == null) {
            return;
        }
        B0 b02 = this.networkJobs[this.selectedPassengerTabPosition];
        if ((b02 != null && b02.isActive()) || (number = seat.getNumber()) == null || (airplaneSeatVO = this.selectedSeatTemplate) == null) {
            return;
        }
        Integer num = this.seatNumberToPassengerMap.get(number);
        boolean z11 = num == null;
        boolean z12 = num != null && num.intValue() == getSelectedPassengerId();
        if (!z11 && !z12) {
            this.seatSelectionError.call();
            return;
        }
        LinkedList linkedList = new LinkedList();
        if (z12) {
            linkedList.add(new FlightSeatDeselectCommand(getSelectedPassengerId(), number, this.passengerToSeatNumberMap, this.seatNumberToPassengerMap, this.passengerToSeatPositionMap, this.schemeBlockMapper, this.passengersBlockMapper, this.seatTypes, this.schemeItems, position, this.passengerTabs, this.selectedPassengerTabPosition, airplaneSeatVO, this.seatSelectionLiveData, this.passengerTabSeatUpdateLiveData, this.passengersBlockUpdateVoLiveData, this.isClearButtonVisible, this.mutex, x0.a(this)));
        } else {
            AirplaneSeatVO airplaneSeatVO2 = airplaneSeatVO;
            if (z11) {
                String str = this.passengerToSeatNumberMap.get(Integer.valueOf(getSelectedPassengerId()));
                Integer num2 = this.passengerToSeatPositionMap.get(Integer.valueOf(getSelectedPassengerId()));
                if (str != null && num2 != null) {
                    FlightSeatDeselectCommand flightSeatDeselectCommand = new FlightSeatDeselectCommand(getSelectedPassengerId(), str, this.passengerToSeatNumberMap, this.seatNumberToPassengerMap, this.passengerToSeatPositionMap, this.schemeBlockMapper, this.passengersBlockMapper, this.seatTypes, this.schemeItems, num2.intValue(), this.passengerTabs, this.selectedPassengerTabPosition, airplaneSeatVO2, this.seatSelectionLiveData, this.passengerTabSeatUpdateLiveData, this.passengersBlockUpdateVoLiveData, this.isClearButtonVisible, this.mutex, x0.a(this));
                    airplaneSeatVO2 = airplaneSeatVO2;
                    linkedList.add(flightSeatDeselectCommand);
                }
                linkedList.add(new FlightSeatSelectCommand(getSelectedPassengerId(), number, this.passengerToSeatNumberMap, this.seatNumberToPassengerMap, this.passengerToSeatPositionMap, this.schemeBlockMapper, this.passengersBlockMapper, this.seatTypes, this.schemeItems, position, this.passengerTabs, this.selectedPassengerTabPosition, airplaneSeatVO2, this.seatSelectionLiveData, this.passengerTabSeatUpdateLiveData, this.passengersBlockUpdateVoLiveData, this.isClearButtonVisible, this.mutex, x0.a(this)));
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((FlightSeatCommand) it.next()).execute();
        }
        Map<String, String> params = selectAction.getParams();
        if (params == null) {
            params = U.c();
        }
        LinkedList linkedList2 = new LinkedList();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            linkedList2.add(new FlightSeatsSchemeViewModel$onSeatClicked$undoOperations$1$1((FlightSeatCommand) it2.next()));
        }
        String link = selectAction.getLink();
        if (link == null) {
            link = "";
        }
        ArrayList arrayList = new ArrayList(C7714v.z(linkedList, 10));
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            arrayList.add(U.m(params, ((FlightSeatCommand) it3.next()).params()));
        }
        syncSelectionWithServer(link, arrayList, linkedList2);
    }

    @NotNull
    public final androidx.lifecycle.P<OrderDetailsInfo> orderDetailsLiveData() {
        return this.orderDetailsLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<PassengerTabSeatUpdate> passengerTabSeatUpdateLiveData() {
        return this.passengerTabSeatUpdateLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<PassengerTabSelection> passengerTabSelectionLiveData() {
        return this.passengerTabSelectionLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<PassengerBlockUpdate> passengersBlockUpdateVoLiveData() {
        return this.passengersBlockUpdateVoLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<SchemeUpdate> schemeUpdateVoLiveData() {
        return this.schemeUpdateVoLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<ScrollToSeat> scrollToSchemeRowLiveData() {
        return this.scrollToSchemeRowLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<Unit> seatSelectionError() {
        return this.seatSelectionError;
    }

    @NotNull
    public final androidx.lifecycle.P<SeatSelection> seatSelectionLiveData() {
        return this.seatSelectionLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setUp(@NotNull FlightSeatsSchemeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FlightSeatsSchemeBlockVO schemeBlock = item.getSchemeBlock();
        FlightSeatsSchemePassengersBlockVO passengersBlock = item.getPassengersBlock();
        String str = null;
        Object[] objArr = 0;
        if (item.getIsUpdatedFromRemote()) {
            for (B0 b02 : this.networkJobs) {
                if (b02 != null) {
                    b02.j(null);
                }
            }
            int size = passengersBlock.getPassengers().size();
            B0[] b0Arr = new B0[size];
            for (int i11 = 0; i11 < size; i11++) {
                b0Arr[i11] = null;
            }
            this.networkJobs = b0Arr;
            this.selectedPassengerTabPosition = passengersBlock.getSelectedPassengerIndex();
            this.passengerTabs = C7714v.W0(passengersBlock.getPassengers());
            List<FlightSeatsSchemeItem> schemeItems = schemeBlock.getSchemeItems();
            this.schemeItems = schemeItems != null ? C7714v.W0(schemeItems) : new ArrayList();
            this.seatNumberToPassengerMap = U.u(schemeBlock.getSeatNumberToPassengerMap());
            this.passengerToSeatNumberMap = U.u(schemeBlock.getPassengerToSeatNumberMap());
            this.seatTypes = schemeBlock.getSeatTypes();
            this.passengerToSeatPositionMap = U.u(schemeBlock.getPassengerToSeatPositionMap());
            this.selectedSeatTemplate = schemeBlock.getSelectedSeatTemplate();
        }
        Integer firstSelectedSeatIndex = schemeBlock.getFirstSelectedSeatIndex();
        if (firstSelectedSeatIndex != null) {
            this.scrollToSchemeRowLiveData.setValue(new ScrollToSeat(firstSelectedSeatIndex.intValue(), str, 2, objArr == true ? 1 : 0));
        }
    }

    @NotNull
    public final androidx.lifecycle.P<OrderTotalVO> updateOrderTotalLiveData() {
        return this.updateOrderTotalLiveData;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$ScrollToSeat;", "", "", "position", "", "seatNumber", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Ljava/lang/String;", "getSeatNumber", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollToSeat {
        private final int position;
        private final String seatNumber;

        public ScrollToSeat(int i11, String str) {
            this.position = i11;
            this.seatNumber = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollToSeat)) {
                return false;
            }
            ScrollToSeat scrollToSeat = (ScrollToSeat) other;
            return this.position == scrollToSeat.position && Intrinsics.d(this.seatNumber, scrollToSeat.seatNumber);
        }

        public final int getPosition() {
            return this.position;
        }

        public final String getSeatNumber() {
            return this.seatNumber;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.position) * 31;
            String str = this.seatNumber;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return a.c(this.position, "ScrollToSeat(position=", ", seatNumber=", this.seatNumber, ")");
        }

        public /* synthetic */ ScrollToSeat(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSelection;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "item", "", "position", "", "shouldScrollToPosition", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "getItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "I", "getPosition", "Z", "getShouldScrollToPosition", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerTabSelection {

        @NotNull
        private final FlightSeatsSchemePassengersBlockVO.Passenger item;
        private final int position;
        private final boolean shouldScrollToPosition;

        public PassengerTabSelection(@NotNull FlightSeatsSchemePassengersBlockVO.Passenger item, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.position = i11;
            this.shouldScrollToPosition = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerTabSelection)) {
                return false;
            }
            PassengerTabSelection passengerTabSelection = (PassengerTabSelection) other;
            return Intrinsics.d(this.item, passengerTabSelection.item) && this.position == passengerTabSelection.position && this.shouldScrollToPosition == passengerTabSelection.shouldScrollToPosition;
        }

        @NotNull
        public final FlightSeatsSchemePassengersBlockVO.Passenger getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        public final boolean getShouldScrollToPosition() {
            return this.shouldScrollToPosition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldScrollToPosition) + C2454a.a(this.position, this.item.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            FlightSeatsSchemePassengersBlockVO.Passenger passenger = this.item;
            int i11 = this.position;
            boolean z11 = this.shouldScrollToPosition;
            StringBuilder sb2 = new StringBuilder("PassengerTabSelection(item=");
            sb2.append(passenger);
            sb2.append(", position=");
            sb2.append(i11);
            sb2.append(", shouldScrollToPosition=");
            return Pk0.a.a(")", sb2, z11);
        }

        public /* synthetic */ PassengerTabSelection(FlightSeatsSchemePassengersBlockVO.Passenger passenger, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(passenger, i11, (i12 & 4) != 0 ? false : z11);
        }
    }
}
