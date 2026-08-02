package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.C2454a;
import C.o0;
import D40.c;
import D40.d;
import De.C2859b;
import G.g;
import Je.InterfaceC3394a;
import Je.e;
import Kk.C3532b;
import Ns.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
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
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FlightSeatsSchemeV2FooterMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2BlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001:\f\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J \u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b/\u00100JE\u00109\u001a\u00020\f2\u0006\u00102\u001a\u0002012\u0018\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020104032\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0706H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020 0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010I\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00130H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\"\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\"\u0010M\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020$048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010JR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020N0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010GR\u0018\u0010P\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010XR\u0016\u0010Z\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010[R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010[R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020a0d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020i0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010cR\u001d\u0010k\u001a\b\u0012\u0004\u0012\u00020i0d8\u0006¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bl\u0010hR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020m0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010cR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020m0d8\u0006¢\u0006\f\n\u0004\bo\u0010f\u001a\u0004\bp\u0010hR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020q0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010cR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020q0d8\u0006¢\u0006\f\n\u0004\bs\u0010f\u001a\u0004\bt\u0010hR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\f0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010cR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020\f0d8\u0006¢\u0006\f\n\u0004\bv\u0010f\u001a\u0004\bw\u0010hR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\f0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010cR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020\f0d8\u0006¢\u0006\f\n\u0004\by\u0010f\u001a\u0004\bz\u0010hR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020{0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010cR\u001d\u0010}\u001a\b\u0012\u0004\u0012\u00020{0d8\u0006¢\u0006\f\n\u0004\b}\u0010f\u001a\u0004\b~\u0010hR\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0`8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010cR \u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0d8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010f\u001a\u0005\b\u0082\u0001\u0010hR\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160`8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010cR \u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160d8\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010f\u001a\u0005\b\u0084\u0001\u0010hR\u001e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R#\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0088\u00018\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u00138BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0096\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "api", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "footerMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "schemeBlockMapper", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State$Content;", "content", "", "setUpScheme", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State$Content;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "item", "setUpFooter", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;)V", "", "getDisplayWidth", "()Ljava/lang/Integer;", "", "getIsProcessingClickSeats", "()Z", "width", "setDisplayWidth", "(Ljava/lang/Integer;)V", "isVisible", "onVisibilityLiteralsChanged", "(Z)V", "position", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "passenger", "onPassengerTabClicked", "(ILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "seat", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "selectAction", "onSeatClicked", "(ILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "addParams", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "targetIndex", "selectPassengerInternal", "(ILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "link", "", "", "paramList", "Ljava/util/Deque;", "Lkotlin/Function0;", "undoOperations", "syncSelectionWithServer", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)V", "sendNonFatalLog", "()V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "LJe/a;", "mutex", "LJe/a;", "selectedPassengerTabPosition", "I", "", "passengerTabs", "Ljava/util/List;", "", "seatNumberToPassengerMap", "Ljava/util/Map;", "passengerToSeatNumberMap", "passengerToSeatPositionMap", "seatTypes", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "schemeItems", "selectedSeatTemplate", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "", "Lxe/B0;", "networkJobs", "[Lxe/B0;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;", "selectedStyle", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;", "defaultStyle", "switchPassengerOnReservedSeatClick", "Z", "displayWidth", "Ljava/lang/Integer;", "isPassengersEmpty", "isProcessingClickSeats", "LAe/w0;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSelection;", "_passengerTabSelectionFlow", "LAe/w0;", "LAe/B0;", "passengerTabSelectionFlow", "LAe/B0;", "getPassengerTabSelectionFlow", "()LAe/B0;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSeatUpdate;", "_passengerTabSeatUpdateFlow", "passengerTabSeatUpdateFlow", "getPassengerTabSeatUpdateFlow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SeatSelection;", "_seatSelectionFlow", "seatSelectionFlow", "getSeatSelectionFlow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$ScrollToSeat;", "_scrollToSchemeRowFlow", "scrollToSchemeRowFlow", "getScrollToSchemeRowFlow", "_seatSelectionErrorFlow", "seatSelectionErrorFlow", "getSeatSelectionErrorFlow", "_networkErrorFlow", "networkErrorFlow", "getNetworkErrorFlow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerBlockUpdate;", "_passengersBlockUpdateVoFlow", "passengersBlockUpdateVoFlow", "getPassengersBlockUpdateVoFlow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate;", "_schemeUpdateVoFlow", "schemeUpdateVoFlow", "getSchemeUpdateVoFlow", "_isClearButtonVisibleFlow", "isClearButtonVisibleFlow", "LAe/x0;", "_showLiteralsFlow", "LAe/x0;", "LAe/M0;", "showLiteralsFlow", "LAe/M0;", "getShowLiteralsFlow", "()LAe/M0;", "getSelectedPassengerId", "()I", "selectedPassengerId", "PassengerTabSelection", "PassengerTabSeatUpdate", "SeatSelection", "ScrollToSeat", "PassengerBlockUpdate", "SchemeUpdate", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2ViewModel extends w0 {

    @NotNull
    private final Ae.w0<Boolean> _isClearButtonVisibleFlow;

    @NotNull
    private final Ae.w0<Unit> _networkErrorFlow;

    @NotNull
    private final Ae.w0<PassengerTabSeatUpdate> _passengerTabSeatUpdateFlow;

    @NotNull
    private final Ae.w0<PassengerTabSelection> _passengerTabSelectionFlow;

    @NotNull
    private final Ae.w0<PassengerBlockUpdate> _passengersBlockUpdateVoFlow;

    @NotNull
    private final Ae.w0<SchemeUpdate> _schemeUpdateVoFlow;

    @NotNull
    private final Ae.w0<ScrollToSeat> _scrollToSchemeRowFlow;

    @NotNull
    private final Ae.w0<Unit> _seatSelectionErrorFlow;

    @NotNull
    private final Ae.w0<SeatSelection> _seatSelectionFlow;

    @NotNull
    private final x0<Boolean> _showLiteralsFlow;

    @NotNull
    private final ActionV2Repository api;
    private FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI defaultStyle;
    private Integer displayWidth;

    @NotNull
    private final FlightSeatsSchemeV2FooterMapper footerMapper;

    @NotNull
    private final B0<Boolean> isClearButtonVisibleFlow;
    private boolean isPassengersEmpty;
    private boolean isProcessingClickSeats;

    @NotNull
    private final InterfaceC3394a mutex;

    @NotNull
    private final B0<Unit> networkErrorFlow;

    @NotNull
    private xe.B0[] networkJobs;

    @NotNull
    private final B0<PassengerTabSeatUpdate> passengerTabSeatUpdateFlow;

    @NotNull
    private final B0<PassengerTabSelection> passengerTabSelectionFlow;

    @NotNull
    private List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengerTabs;

    @NotNull
    private Map<Integer, String> passengerToSeatNumberMap;

    @NotNull
    private Map<Integer, Integer> passengerToSeatPositionMap;

    @NotNull
    private final B0<PassengerBlockUpdate> passengersBlockUpdateVoFlow;

    @NotNull
    private final FlightSeatsSchemeV2BlockMapper schemeBlockMapper;

    @NotNull
    private List<FlightSeatsSchemeV2Item> schemeItems;

    @NotNull
    private final B0<SchemeUpdate> schemeUpdateVoFlow;

    @NotNull
    private final B0<ScrollToSeat> scrollToSchemeRowFlow;

    @NotNull
    private Map<String, Integer> seatNumberToPassengerMap;

    @NotNull
    private final B0<Unit> seatSelectionErrorFlow;

    @NotNull
    private final B0<SeatSelection> seatSelectionFlow;

    @NotNull
    private Map<String, AirplaneSeatTypeV2VI> seatTypes;
    private int selectedPassengerTabPosition;
    private AirplaneSeatTypeV2VI selectedSeatTemplate;
    private FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI selectedStyle;

    @NotNull
    private final M0<Boolean> showLiteralsFlow;
    private boolean switchPassengerOnReservedSeatClick;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSeatUpdate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "item", "", "position", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "getItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "I", "getPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerTabSeatUpdate {

        @NotNull
        private final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item;
        private final int position;

        public PassengerTabSeatUpdate(@NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item, int i11) {
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
        public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI getItem() {
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B\u0099\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b*\u0010!R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b+\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate;", "", "", "firstSelectedSeatIndex", "", "", "seatNumberToPassengerMap", "passengerToSeatNumberMap", "passengerToSeatPositionMap", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "schemeItems", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate$FooterBlockUpdate;", "footerBlockUpdate", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "clickEvent", "payloads", "subtitleName", "<init>", "(Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate$FooterBlockUpdate;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getFirstSelectedSeatIndex", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getSeatNumberToPassengerMap", "()Ljava/util/Map;", "getPassengerToSeatNumberMap", "getPassengerToSeatPositionMap", "Ljava/util/List;", "getSchemeItems", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate$FooterBlockUpdate;", "getFooterBlockUpdate", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate$FooterBlockUpdate;", "getClickEvent", "getPayloads", "Ljava/lang/String;", "getSubtitleName", "FooterBlockUpdate", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SchemeUpdate {
        private final Map<String, TokenizedTrackingInfo> clickEvent;
        private final Integer firstSelectedSeatIndex;

        @NotNull
        private final FooterBlockUpdate footerBlockUpdate;

        @NotNull
        private final Map<Integer, String> passengerToSeatNumberMap;

        @NotNull
        private final Map<Integer, Integer> passengerToSeatPositionMap;
        private final Map<String, String> payloads;

        @NotNull
        private final List<FlightSeatsSchemeV2Item> schemeItems;

        @NotNull
        private final Map<String, Integer> seatNumberToPassengerMap;
        private final String subtitleName;

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b2\u0010(¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate$FooterBlockUpdate;", "", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "passengers", "", "selectedPassengerIndex", "Lru/ozon/uni/atoms/data/text/TextDTO;", "caption", "price", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "infoIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "hideInfo", "skipButton", "<init>", "(Ljava/util/List;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/af/AtomAction;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "I", "getSelectedPassengerIndex", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "getHideInfo", "()Z", "getSkipButton", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FooterBlockUpdate {
            private final AtomAction action;

            @NotNull
            private final TextDTO caption;
            private final boolean hideInfo;
            private final CommonAtomIconDTO infoIcon;

            @NotNull
            private final List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengers;

            @NotNull
            private final TextDTO price;
            private final int selectedPassengerIndex;
            private final ButtonV3DTO skipButton;

            @NotNull
            private final ButtonV3DTO submitButton;

            public FooterBlockUpdate(@NotNull List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengers, int i11, @NotNull TextDTO caption, @NotNull TextDTO price, @NotNull ButtonV3DTO submitButton, CommonAtomIconDTO commonAtomIconDTO, AtomAction atomAction, boolean z11, ButtonV3DTO buttonV3DTO) {
                Intrinsics.checkNotNullParameter(passengers, "passengers");
                Intrinsics.checkNotNullParameter(caption, "caption");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(submitButton, "submitButton");
                this.passengers = passengers;
                this.selectedPassengerIndex = i11;
                this.caption = caption;
                this.price = price;
                this.submitButton = submitButton;
                this.infoIcon = commonAtomIconDTO;
                this.action = atomAction;
                this.hideInfo = z11;
                this.skipButton = buttonV3DTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FooterBlockUpdate)) {
                    return false;
                }
                FooterBlockUpdate footerBlockUpdate = (FooterBlockUpdate) other;
                return Intrinsics.d(this.passengers, footerBlockUpdate.passengers) && this.selectedPassengerIndex == footerBlockUpdate.selectedPassengerIndex && Intrinsics.d(this.caption, footerBlockUpdate.caption) && Intrinsics.d(this.price, footerBlockUpdate.price) && Intrinsics.d(this.submitButton, footerBlockUpdate.submitButton) && Intrinsics.d(this.infoIcon, footerBlockUpdate.infoIcon) && Intrinsics.d(this.action, footerBlockUpdate.action) && this.hideInfo == footerBlockUpdate.hideInfo && Intrinsics.d(this.skipButton, footerBlockUpdate.skipButton);
            }

            @NotNull
            public final TextDTO getCaption() {
                return this.caption;
            }

            public final boolean getHideInfo() {
                return this.hideInfo;
            }

            public final CommonAtomIconDTO getInfoIcon() {
                return this.infoIcon;
            }

            @NotNull
            public final List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> getPassengers() {
                return this.passengers;
            }

            @NotNull
            public final TextDTO getPrice() {
                return this.price;
            }

            public final int getSelectedPassengerIndex() {
                return this.selectedPassengerIndex;
            }

            public final ButtonV3DTO getSkipButton() {
                return this.skipButton;
            }

            @NotNull
            public final ButtonV3DTO getSubmitButton() {
                return this.submitButton;
            }

            public int hashCode() {
                int c11 = C2859b.c(this.submitButton, b.a(this.price, b.a(this.caption, C2454a.a(this.selectedPassengerIndex, this.passengers.hashCode() * 31, 31), 31), 31), 31);
                CommonAtomIconDTO commonAtomIconDTO = this.infoIcon;
                int hashCode = (c11 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
                AtomAction atomAction = this.action;
                int a11 = C3532b.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.hideInfo);
                ButtonV3DTO buttonV3DTO = this.skipButton;
                return a11 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> list = this.passengers;
                int i11 = this.selectedPassengerIndex;
                TextDTO textDTO = this.caption;
                TextDTO textDTO2 = this.price;
                ButtonV3DTO buttonV3DTO = this.submitButton;
                CommonAtomIconDTO commonAtomIconDTO = this.infoIcon;
                AtomAction atomAction = this.action;
                boolean z11 = this.hideInfo;
                ButtonV3DTO buttonV3DTO2 = this.skipButton;
                StringBuilder sb2 = new StringBuilder("FooterBlockUpdate(passengers=");
                sb2.append(list);
                sb2.append(", selectedPassengerIndex=");
                sb2.append(i11);
                sb2.append(", caption=");
                d.e(", price=", ", submitButton=", sb2, textDTO, textDTO2);
                sb2.append(buttonV3DTO);
                sb2.append(", infoIcon=");
                sb2.append(commonAtomIconDTO);
                sb2.append(", action=");
                sb2.append(atomAction);
                sb2.append(", hideInfo=");
                sb2.append(z11);
                sb2.append(", skipButton=");
                sb2.append(buttonV3DTO2);
                sb2.append(")");
                return sb2.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SchemeUpdate(Integer num, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull List<? extends FlightSeatsSchemeV2Item> schemeItems, @NotNull FooterBlockUpdate footerBlockUpdate, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, String str) {
            Intrinsics.checkNotNullParameter(seatNumberToPassengerMap, "seatNumberToPassengerMap");
            Intrinsics.checkNotNullParameter(passengerToSeatNumberMap, "passengerToSeatNumberMap");
            Intrinsics.checkNotNullParameter(passengerToSeatPositionMap, "passengerToSeatPositionMap");
            Intrinsics.checkNotNullParameter(schemeItems, "schemeItems");
            Intrinsics.checkNotNullParameter(footerBlockUpdate, "footerBlockUpdate");
            this.firstSelectedSeatIndex = num;
            this.seatNumberToPassengerMap = seatNumberToPassengerMap;
            this.passengerToSeatNumberMap = passengerToSeatNumberMap;
            this.passengerToSeatPositionMap = passengerToSeatPositionMap;
            this.schemeItems = schemeItems;
            this.footerBlockUpdate = footerBlockUpdate;
            this.clickEvent = map;
            this.payloads = map2;
            this.subtitleName = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SchemeUpdate)) {
                return false;
            }
            SchemeUpdate schemeUpdate = (SchemeUpdate) other;
            return Intrinsics.d(this.firstSelectedSeatIndex, schemeUpdate.firstSelectedSeatIndex) && Intrinsics.d(this.seatNumberToPassengerMap, schemeUpdate.seatNumberToPassengerMap) && Intrinsics.d(this.passengerToSeatNumberMap, schemeUpdate.passengerToSeatNumberMap) && Intrinsics.d(this.passengerToSeatPositionMap, schemeUpdate.passengerToSeatPositionMap) && Intrinsics.d(this.schemeItems, schemeUpdate.schemeItems) && Intrinsics.d(this.footerBlockUpdate, schemeUpdate.footerBlockUpdate) && Intrinsics.d(this.clickEvent, schemeUpdate.clickEvent) && Intrinsics.d(this.payloads, schemeUpdate.payloads) && Intrinsics.d(this.subtitleName, schemeUpdate.subtitleName);
        }

        public final Map<String, TokenizedTrackingInfo> getClickEvent() {
            return this.clickEvent;
        }

        public final Integer getFirstSelectedSeatIndex() {
            return this.firstSelectedSeatIndex;
        }

        @NotNull
        public final FooterBlockUpdate getFooterBlockUpdate() {
            return this.footerBlockUpdate;
        }

        @NotNull
        public final Map<Integer, String> getPassengerToSeatNumberMap() {
            return this.passengerToSeatNumberMap;
        }

        @NotNull
        public final Map<Integer, Integer> getPassengerToSeatPositionMap() {
            return this.passengerToSeatPositionMap;
        }

        public final Map<String, String> getPayloads() {
            return this.payloads;
        }

        @NotNull
        public final List<FlightSeatsSchemeV2Item> getSchemeItems() {
            return this.schemeItems;
        }

        @NotNull
        public final Map<String, Integer> getSeatNumberToPassengerMap() {
            return this.seatNumberToPassengerMap;
        }

        public final String getSubtitleName() {
            return this.subtitleName;
        }

        public int hashCode() {
            Integer num = this.firstSelectedSeatIndex;
            int hashCode = (this.footerBlockUpdate.hashCode() + g.b(c.a(this.passengerToSeatPositionMap, c.a(this.passengerToSeatNumberMap, c.a(this.seatNumberToPassengerMap, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31), 31, this.schemeItems)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.clickEvent;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.payloads;
            int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
            String str = this.subtitleName;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.firstSelectedSeatIndex;
            Map<String, Integer> map = this.seatNumberToPassengerMap;
            Map<Integer, String> map2 = this.passengerToSeatNumberMap;
            Map<Integer, Integer> map3 = this.passengerToSeatPositionMap;
            List<FlightSeatsSchemeV2Item> list = this.schemeItems;
            FooterBlockUpdate footerBlockUpdate = this.footerBlockUpdate;
            Map<String, TokenizedTrackingInfo> map4 = this.clickEvent;
            Map<String, String> map5 = this.payloads;
            String str = this.subtitleName;
            StringBuilder sb2 = new StringBuilder("SchemeUpdate(firstSelectedSeatIndex=");
            sb2.append(num);
            sb2.append(", seatNumberToPassengerMap=");
            sb2.append(map);
            sb2.append(", passengerToSeatNumberMap=");
            Tl.b.g(sb2, map2, ", passengerToSeatPositionMap=", map3, ", schemeItems=");
            sb2.append(list);
            sb2.append(", footerBlockUpdate=");
            sb2.append(footerBlockUpdate);
            sb2.append(", clickEvent=");
            Tl.b.g(sb2, map4, ", payloads=", map5, ", subtitleName=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SeatSelection;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "item", "", "position", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "getItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "I", "getPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatSelection {

        @NotNull
        private final FlightSchemeContentRowV2 item;
        private final int position;

        public SeatSelection(@NotNull FlightSchemeContentRowV2 item, int i11) {
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
        public final FlightSchemeContentRowV2 getItem() {
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

    public FlightSeatsSchemeV2ViewModel(@NotNull ActionV2Repository api, @NotNull FlightSeatsSchemeV2FooterMapper footerMapper, @NotNull FlightSeatsSchemeV2BlockMapper schemeBlockMapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(schemeBlockMapper, "schemeBlockMapper");
        this.api = api;
        this.footerMapper = footerMapper;
        this.schemeBlockMapper = schemeBlockMapper;
        this.mutex = e.a();
        this.passengerTabs = new ArrayList();
        this.seatNumberToPassengerMap = new LinkedHashMap();
        this.passengerToSeatNumberMap = new LinkedHashMap();
        this.passengerToSeatPositionMap = new LinkedHashMap();
        this.seatTypes = U.c();
        this.schemeItems = new ArrayList();
        this.networkJobs = new xe.B0[0];
        this.isPassengersEmpty = true;
        C0 b11 = E0.b(0, 0, null, 7);
        this._passengerTabSelectionFlow = b11;
        this.passengerTabSelectionFlow = C2399j.a(b11);
        C0 b12 = E0.b(0, 0, null, 7);
        this._passengerTabSeatUpdateFlow = b12;
        this.passengerTabSeatUpdateFlow = C2399j.a(b12);
        C0 b13 = E0.b(0, 0, null, 7);
        this._seatSelectionFlow = b13;
        this.seatSelectionFlow = C2399j.a(b13);
        C0 b14 = E0.b(0, 0, null, 7);
        this._scrollToSchemeRowFlow = b14;
        this.scrollToSchemeRowFlow = C2399j.a(b14);
        C0 b15 = E0.b(0, 0, null, 7);
        this._seatSelectionErrorFlow = b15;
        this.seatSelectionErrorFlow = C2399j.a(b15);
        C0 b16 = E0.b(0, 0, null, 7);
        this._networkErrorFlow = b16;
        this.networkErrorFlow = C2399j.a(b16);
        C0 b17 = E0.b(0, 0, null, 7);
        this._passengersBlockUpdateVoFlow = b17;
        this.passengersBlockUpdateVoFlow = C2399j.a(b17);
        C0 b18 = E0.b(0, 0, null, 7);
        this._schemeUpdateVoFlow = b18;
        this.schemeUpdateVoFlow = C2399j.a(b18);
        C0 b19 = E0.b(1, 0, null, 6);
        this._isClearButtonVisibleFlow = b19;
        this.isClearButtonVisibleFlow = C2399j.a(b19);
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._showLiteralsFlow = a11;
        this.showLiteralsFlow = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSelectedPassengerId() {
        return this.passengerTabs.get(this.selectedPassengerTabPosition).getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0136, code lost:
    
        if (r1.emit(r6, r3) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fb, code lost:
    
        if (r6.emit(r8, r3) != r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object selectPassengerInternal(int i11, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI, kotlin.coroutines.d<? super Unit> dVar) {
        FlightSeatsSchemeV2ViewModel$selectPassengerInternal$1 flightSeatsSchemeV2ViewModel$selectPassengerInternal$1;
        a aVar;
        int i12;
        FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI deselect;
        FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI select;
        int i13;
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel;
        Ae.w0<PassengerTabSelection> w0Var;
        PassengerTabSelection passengerTabSelection;
        int i14;
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel2;
        int i15 = i11;
        if (dVar instanceof FlightSeatsSchemeV2ViewModel$selectPassengerInternal$1) {
            flightSeatsSchemeV2ViewModel$selectPassengerInternal$1 = (FlightSeatsSchemeV2ViewModel$selectPassengerInternal$1) dVar;
            int i16 = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label;
            if ((i16 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label = i16 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i12 = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    int i17 = this.selectedPassengerTabPosition;
                    if (i15 == i17) {
                        return Unit.f71690a;
                    }
                    this.selectedPassengerTabPosition = i15;
                    deselect = this.footerMapper.deselect(this.passengerTabs.get(i17));
                    select = this.footerMapper.select(passengerV2VI);
                    this.passengerTabs.set(i17, deselect);
                    this.passengerTabs.set(i15, select);
                    Ae.w0<PassengerBlockUpdate> w0Var2 = this._passengersBlockUpdateVoFlow;
                    PassengerBlockUpdate passengerBlockUpdate = new PassengerBlockUpdate(C7714v.U0(this.passengerTabs), this.selectedPassengerTabPosition, select.getSubtitleName());
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0 = this;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$1 = deselect;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$2 = select;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.I$0 = i15;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.I$1 = i17;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label = 1;
                    if (w0Var2.emit(passengerBlockUpdate, flightSeatsSchemeV2ViewModel$selectPassengerInternal$1) != aVar) {
                        i13 = i17;
                        flightSeatsSchemeV2ViewModel = this;
                    }
                    return aVar;
                }
                if (i12 == 1) {
                    int i18 = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.I$1;
                    int i19 = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.I$0;
                    FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI2 = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$2;
                    deselect = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$1;
                    FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel3 = (FlightSeatsSchemeV2ViewModel) flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0;
                    s.b(obj);
                    flightSeatsSchemeV2ViewModel = flightSeatsSchemeV2ViewModel3;
                    i13 = i18;
                    i15 = i19;
                    select = passengerV2VI2;
                } else if (i12 == 2) {
                    int i21 = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.I$0;
                    select = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$1;
                    FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel4 = (FlightSeatsSchemeV2ViewModel) flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0;
                    s.b(obj);
                    i14 = i21;
                    flightSeatsSchemeV2ViewModel2 = flightSeatsSchemeV2ViewModel4;
                    Ae.w0<PassengerTabSelection> w0Var3 = flightSeatsSchemeV2ViewModel2._passengerTabSelectionFlow;
                    PassengerTabSelection passengerTabSelection2 = new PassengerTabSelection(select, i14, true);
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0 = flightSeatsSchemeV2ViewModel2;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$1 = null;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label = 3;
                } else {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    flightSeatsSchemeV2ViewModel2 = (FlightSeatsSchemeV2ViewModel) flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0;
                    s.b(obj);
                    Integer num = flightSeatsSchemeV2ViewModel2.passengerToSeatPositionMap.get(new Integer(flightSeatsSchemeV2ViewModel2.getSelectedPassengerId()));
                    if (num == null) {
                        return Unit.f71690a;
                    }
                    String str = flightSeatsSchemeV2ViewModel2.passengerToSeatNumberMap.get(new Integer(flightSeatsSchemeV2ViewModel2.getSelectedPassengerId()));
                    Ae.w0<ScrollToSeat> w0Var4 = flightSeatsSchemeV2ViewModel2._scrollToSchemeRowFlow;
                    ScrollToSeat scrollToSeat = new ScrollToSeat(num.intValue(), str);
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0 = null;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label = 4;
                }
                w0Var = flightSeatsSchemeV2ViewModel._passengerTabSelectionFlow;
                passengerTabSelection = new PassengerTabSelection(deselect, i13, false, 4, null);
                flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0 = flightSeatsSchemeV2ViewModel;
                flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$1 = select;
                flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$2 = null;
                flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.I$0 = i15;
                flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label = 2;
                if (w0Var.emit(passengerTabSelection, flightSeatsSchemeV2ViewModel$selectPassengerInternal$1) != aVar) {
                    FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel5 = flightSeatsSchemeV2ViewModel;
                    i14 = i15;
                    flightSeatsSchemeV2ViewModel2 = flightSeatsSchemeV2ViewModel5;
                    Ae.w0<PassengerTabSelection> w0Var32 = flightSeatsSchemeV2ViewModel2._passengerTabSelectionFlow;
                    PassengerTabSelection passengerTabSelection22 = new PassengerTabSelection(select, i14, true);
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0 = flightSeatsSchemeV2ViewModel2;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$1 = null;
                    flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label = 3;
                }
                return aVar;
            }
        }
        flightSeatsSchemeV2ViewModel$selectPassengerInternal$1 = new FlightSeatsSchemeV2ViewModel$selectPassengerInternal$1(this, dVar);
        Object obj2 = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i12 = flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label;
        if (i12 != 0) {
        }
        w0Var = flightSeatsSchemeV2ViewModel._passengerTabSelectionFlow;
        passengerTabSelection = new PassengerTabSelection(deselect, i13, false, 4, null);
        flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$0 = flightSeatsSchemeV2ViewModel;
        flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$1 = select;
        flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.L$2 = null;
        flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.I$0 = i15;
        flightSeatsSchemeV2ViewModel$selectPassengerInternal$1.label = 2;
        if (w0Var.emit(passengerTabSelection, flightSeatsSchemeV2ViewModel$selectPassengerInternal$1) != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNonFatalLog() {
        LoggerExtKt.sendNonFatal$default(new IndexOutOfBoundsException("Passengers in FlightSeatsSchemeV2ViewModel is empty. Widget flightSeatsScheme-v2"), "Passengers in FlightSeatsSchemeV2ViewModel is empty. Widget flightSeatsScheme-v2", null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncSelectionWithServer(String link, List<? extends Map<String, String>> paramList, Deque<Function0<Unit>> undoOperations) {
        this.networkJobs[this.selectedPassengerTabPosition] = C10727i.c(androidx.lifecycle.x0.a(this), new FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this, undoOperations), null, new FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$1(paramList, undoOperations, this, link, null), 2);
    }

    @NotNull
    public final AtomAction addParams(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction) || this.isPassengersEmpty) {
            return action;
        }
        Tc.d builder = new Tc.d();
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        builder.put("passengerID", String.valueOf(getSelectedPassengerId()));
        builder.put("isSelected", "true");
        Intrinsics.checkNotNullParameter(builder, "builder");
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, builder.u(), null, null, 27, null);
    }

    public final Integer getDisplayWidth() {
        return this.displayWidth;
    }

    public final boolean getIsProcessingClickSeats() {
        return this.isProcessingClickSeats;
    }

    @NotNull
    public final B0<Unit> getNetworkErrorFlow() {
        return this.networkErrorFlow;
    }

    @NotNull
    public final B0<PassengerTabSeatUpdate> getPassengerTabSeatUpdateFlow() {
        return this.passengerTabSeatUpdateFlow;
    }

    @NotNull
    public final B0<PassengerTabSelection> getPassengerTabSelectionFlow() {
        return this.passengerTabSelectionFlow;
    }

    @NotNull
    public final B0<PassengerBlockUpdate> getPassengersBlockUpdateVoFlow() {
        return this.passengersBlockUpdateVoFlow;
    }

    @NotNull
    public final B0<SchemeUpdate> getSchemeUpdateVoFlow() {
        return this.schemeUpdateVoFlow;
    }

    @NotNull
    public final B0<ScrollToSeat> getScrollToSchemeRowFlow() {
        return this.scrollToSchemeRowFlow;
    }

    @NotNull
    public final B0<Unit> getSeatSelectionErrorFlow() {
        return this.seatSelectionErrorFlow;
    }

    @NotNull
    public final B0<SeatSelection> getSeatSelectionFlow() {
        return this.seatSelectionFlow;
    }

    @NotNull
    public final M0<Boolean> getShowLiteralsFlow() {
        return this.showLiteralsFlow;
    }

    @NotNull
    public final B0<Boolean> isClearButtonVisibleFlow() {
        return this.isClearButtonVisibleFlow;
    }

    public final void onPassengerTabClicked(int position, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passenger) {
        if (passenger == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new FlightSeatsSchemeV2ViewModel$onPassengerTabClicked$1(this, position, passenger, null), 3);
    }

    public final void onSeatClicked(int position, @NotNull AirplaneSeatTypeV2VI seat, AtomActionDTO selectAction) {
        String number;
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI;
        Intrinsics.checkNotNullParameter(seat, "seat");
        if ((selectAction != null ? selectAction.getLink() : null) == null) {
            return;
        }
        xe.B0 b02 = this.networkJobs[this.selectedPassengerTabPosition];
        if ((b02 != null && b02.isActive()) || (number = seat.getNumber()) == null || (airplaneSeatTypeV2VI = this.selectedSeatTemplate) == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new FlightSeatsSchemeV2ViewModel$onSeatClicked$1(this, number, position, airplaneSeatTypeV2VI, selectAction, null), 3);
    }

    public final void onVisibilityLiteralsChanged(boolean isVisible) {
        this._showLiteralsFlow.setValue(Boolean.valueOf(isVisible));
    }

    public final void setDisplayWidth(Integer width) {
        this.displayWidth = width;
    }

    public final void setUpFooter(@NotNull FlightSeatsSchemeV2FooterBlockVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengers = item.getPassengers();
        int selectedPassengerIndex = item.getSelectedPassengerIndex();
        if (item.getIsUpdatedFromRemote()) {
            xe.B0[] b0Arr = this.networkJobs;
            int length = b0Arr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                xe.B0 b02 = b0Arr[i11];
                if (b02 != null) {
                    b02.j(null);
                }
                i11++;
            }
            int size = passengers.size();
            xe.B0[] b0Arr2 = new xe.B0[size];
            for (int i12 = 0; i12 < size; i12++) {
                b0Arr2[i12] = null;
            }
            this.networkJobs = b0Arr2;
            if (selectedPassengerIndex == -1) {
                selectedPassengerIndex = 0;
            }
            this.selectedPassengerTabPosition = selectedPassengerIndex;
            this.passengerTabs = C7714v.W0(passengers);
            FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) C7714v.M(item.getPassengers());
            this.selectedStyle = passengerV2VI != null ? passengerV2VI.getSelectedStyle() : null;
            FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI2 = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) C7714v.M(item.getPassengers());
            this.defaultStyle = passengerV2VI2 != null ? passengerV2VI2.getDefaultStyle() : null;
            this.isPassengersEmpty = this.passengerTabs.isEmpty();
        }
    }

    public final void setUpScheme(@NotNull FlightSeatsSchemeV2VI.State.Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        FlightSeatsSchemeV2BlockVI schemeBlock = content.getSchemeBlock();
        if (content.getIsUpdatedFromRemote()) {
            List<FlightSeatsSchemeV2Item> schemeItems = schemeBlock.getSchemeItems();
            this.schemeItems = schemeItems != null ? C7714v.W0(schemeItems) : new ArrayList();
            this.seatNumberToPassengerMap = U.u(schemeBlock.getSeatNumberToPassengerMap());
            this.passengerToSeatNumberMap = U.u(schemeBlock.getPassengerToSeatNumberMap());
            this.seatTypes = schemeBlock.getSeatTypes();
            this.passengerToSeatPositionMap = U.u(schemeBlock.getPassengerToSeatPositionMap());
            this.selectedSeatTemplate = schemeBlock.getSelectedSeatTemplate();
            this.switchPassengerOnReservedSeatClick = schemeBlock.getSwitchPassengerOnReservedSeatClick();
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new FlightSeatsSchemeV2ViewModel$setUpScheme$1(this, null), 3);
        Integer firstSelectedSeatIndex = schemeBlock.getFirstSelectedSeatIndex();
        if (firstSelectedSeatIndex != null) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new FlightSeatsSchemeV2ViewModel$setUpScheme$2$1(this, firstSelectedSeatIndex.intValue(), null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$ScrollToSeat;", "", "", "position", "", "seatNumber", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Ljava/lang/String;", "getSeatNumber", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            return Nh.a.c(this.position, "ScrollToSeat(position=", ", seatNumber=", this.seatNumber, ")");
        }

        public /* synthetic */ ScrollToSeat(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerBlockUpdate;", "", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "passengers", "", "selectedPosition", "", "subtitleName", "<init>", "(Ljava/util/List;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "I", "getSelectedPosition", "Ljava/lang/String;", "getSubtitleName", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerBlockUpdate {

        @NotNull
        private final List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengers;
        private final int selectedPosition;
        private final String subtitleName;

        public PassengerBlockUpdate(@NotNull List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> passengers, int i11, String str) {
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            this.passengers = passengers;
            this.selectedPosition = i11;
            this.subtitleName = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerBlockUpdate)) {
                return false;
            }
            PassengerBlockUpdate passengerBlockUpdate = (PassengerBlockUpdate) other;
            return Intrinsics.d(this.passengers, passengerBlockUpdate.passengers) && this.selectedPosition == passengerBlockUpdate.selectedPosition && Intrinsics.d(this.subtitleName, passengerBlockUpdate.subtitleName);
        }

        @NotNull
        public final List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> getPassengers() {
            return this.passengers;
        }

        public final int getSelectedPosition() {
            return this.selectedPosition;
        }

        public final String getSubtitleName() {
            return this.subtitleName;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.selectedPosition, this.passengers.hashCode() * 31, 31);
            String str = this.subtitleName;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> list = this.passengers;
            int i11 = this.selectedPosition;
            String str = this.subtitleName;
            StringBuilder sb2 = new StringBuilder("PassengerBlockUpdate(passengers=");
            sb2.append(list);
            sb2.append(", selectedPosition=");
            sb2.append(i11);
            sb2.append(", subtitleName=");
            return o0.c(sb2, str, ")");
        }

        public /* synthetic */ PassengerBlockUpdate(List list, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i11, (i12 & 4) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSelection;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "item", "", "position", "", "shouldScrollToPosition", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "getItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "I", "getPosition", "Z", "getShouldScrollToPosition", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerTabSelection {

        @NotNull
        private final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item;
        private final int position;
        private final boolean shouldScrollToPosition;

        public PassengerTabSelection(@NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item, int i11, boolean z11) {
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
        public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI getItem() {
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
            FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI = this.item;
            int i11 = this.position;
            boolean z11 = this.shouldScrollToPosition;
            StringBuilder sb2 = new StringBuilder("PassengerTabSelection(item=");
            sb2.append(passengerV2VI);
            sb2.append(", position=");
            sb2.append(i11);
            sb2.append(", shouldScrollToPosition=");
            return Pk0.a.a(")", sb2, z11);
        }

        public /* synthetic */ PassengerTabSelection(FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(passengerV2VI, i11, (i12 & 4) != 0 ? false : z11);
        }
    }
}
