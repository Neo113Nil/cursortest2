package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import Bc.i;
import Bc.k;
import Bc.o;
import DM.c;
import DM.h;
import V.e;
import Xc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.format.b;
import qc.InterfaceC9019a;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.data.CalendarFullMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarFullVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.TripMode;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import vc.l;
import vc.n;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001CB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J_\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\f*\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\"¢\u0006\u0004\b&\u0010$J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\"¢\u0006\u0004\b'\u0010$J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0004\b(\u0010$J\u0015\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u000e¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0016¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0012¢\u0006\u0004\b6\u00104J\r\u00107\u001a\u00020\u0016¢\u0006\u0004\b7\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010;R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010=R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010;R\u001c\u0010?\u001a\n >*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "api", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/data/CalendarFullMapper;", "calendarFullMapper", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/data/CalendarFullMapper;)V", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripKind", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "tripMode", "", "complexSegmentId", "Lorg/joda/time/LocalDate;", "thereDate", "backDate", "daysRound", "", "isDaysRoundChecked", "isInitialMapping", "isRailwayRoundTripEnabled", "", "updateCalendar", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;ZZZ)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;", "vo", "", "prepareRequestParams", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;)Ljava/util/Map;", "Lorg/joda/time/format/b;", "dateTimeFormatter", "toString", "(Lorg/joda/time/LocalDate;Lorg/joda/time/format/b;)Ljava/lang/String;", "Landroidx/lifecycle/P;", "calendarLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel$Action;", "actionLiveData", "progressLiveData", "customAnalyticsLiveData", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarVO;", "calendarVO", "setUpViewModel", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarVO;)V", "date", "onDateClicked", "(Lorg/joda/time/LocalDate;)V", "onReadyButtonClicked", "()V", "isStartDateControl", "onDateControlClicked", "(Z)V", "isRoundTrip", "onTripTypeSwitched", "onDaysRoundControlClicked", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/data/CalendarFullMapper;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "kotlin.jvm.PlatformType", "dateFormatter", "Lorg/joda/time/format/b;", "actionName", "Ljava/lang/String;", "Action", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private String actionName;

    @NotNull
    private final TravelCommonCompletableApi api;

    @NotNull
    private final CalendarFullMapper calendarFullMapper;

    @NotNull
    private final V<CalendarFullVO> calendarLiveData;

    @NotNull
    private final SingleLiveEvent<Unit> customAnalyticsLiveData;
    private final b dateFormatter;

    @NotNull
    private final V<Boolean> progressLiveData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel$Action;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "DISMISS_AND_REFRESH", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ERROR = new Action("ERROR", 0);
        public static final Action DISMISS_AND_REFRESH = new Action("DISMISS_AND_REFRESH", 1);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{ERROR, DISMISS_AND_REFRESH};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Action(String str, int i11) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TripMode.values().length];
            try {
                iArr[TripMode.ROUND_TRIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TripMode.THERE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TripMode.BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TripKind.values().length];
            try {
                iArr2[TripKind.RAILWAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TripKind.TOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TripKind.HOTEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public CalendarViewModel(@NotNull TravelCommonCompletableApi api, @NotNull CalendarFullMapper calendarFullMapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(calendarFullMapper, "calendarFullMapper");
        this.api = api;
        this.calendarFullMapper = calendarFullMapper;
        this.calendarLiveData = new V<>();
        this.actionLiveData = new SingleLiveEvent<>();
        this.customAnalyticsLiveData = new SingleLiveEvent<>();
        this.progressLiveData = new V<>();
        this.dateFormatter = org.joda.time.format.a.b("yyyy-MM-dd");
        this.actionName = "travelMainSaveField";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReadyButtonClicked$lambda$2(CalendarViewModel calendarViewModel) {
        calendarViewModel.progressLiveData.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReadyButtonClicked$lambda$3(CalendarViewModel calendarViewModel) {
        calendarViewModel.actionLiveData.setValue(Action.DISMISS_AND_REFRESH);
    }

    private final Map<String, String> prepareRequestParams(CalendarFullVO vo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = WhenMappings.$EnumSwitchMapping$1[vo.getTripKind().ordinal()];
        if (i11 == 1) {
            LocalDate selectedDepartureDate = vo.getSelectedDepartureDate();
            b dateFormatter = this.dateFormatter;
            Intrinsics.checkNotNullExpressionValue(dateFormatter, "dateFormatter");
            linkedHashMap.put("travelSearchRailwayDate", toString(selectedDepartureDate, dateFormatter));
            if (vo.getTripMode() == TripMode.ROUND_TRIP) {
                LocalDate selectedReturnDate = vo.getSelectedReturnDate();
                b dateFormatter2 = this.dateFormatter;
                Intrinsics.checkNotNullExpressionValue(dateFormatter2, "dateFormatter");
                linkedHashMap.put("travelSearchReturnRailwayDate", toString(selectedReturnDate, dateFormatter2));
            }
            Unit unit = Unit.f71690a;
            return linkedHashMap;
        }
        if (i11 == 2) {
            LocalDate selectedDepartureDate2 = vo.getSelectedDepartureDate();
            b dateFormatter3 = this.dateFormatter;
            Intrinsics.checkNotNullExpressionValue(dateFormatter3, "dateFormatter");
            linkedHashMap.put("startDate", toString(selectedDepartureDate2, dateFormatter3));
            linkedHashMap.put("countDayRound", vo.getIsDaysRoundChecked() ? vo.getDaysRound() : "0");
            Unit unit2 = Unit.f71690a;
            return linkedHashMap;
        }
        if (i11 != 3) {
            if (vo.getComplexRouteSegmentId() == null) {
                new CalendarViewModel$prepareRequestParams$2(linkedHashMap, this, vo);
                return linkedHashMap;
            }
            String b11 = e.b(new Object[]{vo.getComplexRouteSegmentId()}, 1, "travelSearchFlightDate%s", "format(...)");
            LocalDate selectedDepartureDate3 = vo.getSelectedDepartureDate();
            b dateFormatter4 = this.dateFormatter;
            Intrinsics.checkNotNullExpressionValue(dateFormatter4, "dateFormatter");
            linkedHashMap.put(b11, toString(selectedDepartureDate3, dateFormatter4));
            Unit unit3 = Unit.f71690a;
            return linkedHashMap;
        }
        LocalDate selectedReturnDate2 = vo.getSelectedReturnDate();
        if (selectedReturnDate2 == null) {
            LocalDate selectedDepartureDate4 = vo.getSelectedDepartureDate();
            selectedReturnDate2 = selectedDepartureDate4 != null ? selectedDepartureDate4.C(1) : null;
        }
        LocalDate selectedDepartureDate5 = vo.getSelectedDepartureDate();
        b dateFormatter5 = this.dateFormatter;
        Intrinsics.checkNotNullExpressionValue(dateFormatter5, "dateFormatter");
        linkedHashMap.put("travelSearchHotelsCheckIn", toString(selectedDepartureDate5, dateFormatter5));
        b dateFormatter6 = this.dateFormatter;
        Intrinsics.checkNotNullExpressionValue(dateFormatter6, "dateFormatter");
        linkedHashMap.put("travelSearchHotelsCheckOut", toString(selectedReturnDate2, dateFormatter6));
        Unit unit4 = Unit.f71690a;
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toString(LocalDate localDate, b bVar) {
        String h11 = localDate != null ? bVar.h(localDate) : null;
        return h11 == null ? "" : h11;
    }

    private final void updateCalendar(final TripKind tripKind, final TripMode tripMode, final String complexSegmentId, final LocalDate thereDate, final LocalDate backDate, final String daysRound, final boolean isDaysRoundChecked, final boolean isInitialMapping, final boolean isRailwayRoundTripEnabled) {
        C5415f.a(this).d();
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = new k(new i(new o(new Callable() { // from class: bQ.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CalendarFullVO updateCalendar$lambda$5;
                updateCalendar$lambda$5 = CalendarViewModel.updateCalendar$lambda$5(CalendarViewModel.this, tripKind, tripMode, complexSegmentId, thereDate, backDate, daysRound, isDaysRoundChecked, isRailwayRoundTripEnabled, isInitialMapping);
                return updateCalendar$lambda$5;
            }
        }).j(Mc.a.a()).g(C8125a.a()), new BF.b(new CalendarViewModel$updateCalendar$2(this), 8)), new InterfaceC9019a() { // from class: bQ.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                CalendarViewModel.updateCalendar$lambda$7(CalendarViewModel.this);
            }
        }).h(new c(new CalendarViewModel$updateCalendar$4(this.calendarLiveData), 4), new Fw.b(new CalendarViewModel$updateCalendar$5(this), 4));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    static /* synthetic */ void updateCalendar$default(CalendarViewModel calendarViewModel, TripKind tripKind, TripMode tripMode, String str, LocalDate localDate, LocalDate localDate2, String str2, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        calendarViewModel.updateCalendar(tripKind, tripMode, str, localDate, localDate2, str2, z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CalendarFullVO updateCalendar$lambda$5(CalendarViewModel calendarViewModel, TripKind tripKind, TripMode tripMode, String str, LocalDate localDate, LocalDate localDate2, String str2, boolean z11, boolean z12, boolean z13) {
        return calendarViewModel.calendarFullMapper.map(tripKind, tripMode, str, localDate, localDate2, str2, z11, z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCalendar$lambda$7(CalendarViewModel calendarViewModel) {
        calendarViewModel.progressLiveData.setValue(Boolean.FALSE);
    }

    @NotNull
    public final P<Action> actionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final P<CalendarFullVO> calendarLiveData() {
        return this.calendarLiveData;
    }

    @NotNull
    public final P<Unit> customAnalyticsLiveData() {
        return this.customAnalyticsLiveData;
    }

    public final void onDateClicked(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        CalendarFullVO value = this.calendarLiveData.getValue();
        if (value == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[value.getTripMode().ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new Sc.o();
            }
            updateCalendar$default(this, value.getTripKind(), value.getTripMode(), value.getComplexRouteSegmentId(), date, null, value.getDaysRound(), value.getIsDaysRoundChecked(), false, value.getIsRailwayRoundTripEnabled(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
            return;
        }
        if (!value.getIsSelectingReturnDate()) {
            updateCalendar$default(this, value.getTripKind(), value.getTripMode(), value.getComplexRouteSegmentId(), date, null, value.getDaysRound(), value.getIsDaysRoundChecked(), false, value.getIsRailwayRoundTripEnabled(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
            return;
        }
        if (value.getTripKind() == TripKind.HOTEL && Intrinsics.d(value.getSelectedDepartureDate(), date)) {
            return;
        }
        LocalDate selectedDepartureDate = value.getSelectedDepartureDate();
        if (selectedDepartureDate == null || !selectedDepartureDate.e(date)) {
            updateCalendar$default(this, value.getTripKind(), value.getTripMode(), value.getComplexRouteSegmentId(), value.getSelectedDepartureDate(), date, value.getDaysRound(), value.getIsDaysRoundChecked(), false, value.getIsRailwayRoundTripEnabled(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
        } else {
            updateCalendar$default(this, value.getTripKind(), value.getTripMode(), value.getComplexRouteSegmentId(), date, value.getSelectedDepartureDate(), value.getDaysRound(), value.getIsDaysRoundChecked(), false, value.getIsRailwayRoundTripEnabled(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
        }
    }

    public final void onDateControlClicked(boolean isStartDateControl) {
        CalendarFullVO value = this.calendarLiveData.getValue();
        if (value == null) {
            return;
        }
        this.calendarLiveData.setValue(CalendarFullVO.copy$default(value, null, null, null, false, false, false, false, null, null, null, null, null, null, !isStartDateControl, null, false, null, null, false, 516095, null));
    }

    public final void onDaysRoundControlClicked() {
        CalendarFullVO value = this.calendarLiveData.getValue();
        if (value == null) {
            return;
        }
        updateCalendar$default(this, value.getTripKind(), value.getTripMode(), value.getComplexRouteSegmentId(), value.getSelectedDepartureDate(), value.getSelectedReturnDate(), value.getDaysRound(), !value.getIsDaysRoundChecked(), false, !value.getIsRailwayRoundTripEnabled(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    public final void onReadyButtonClicked() {
        CalendarFullVO value = this.calendarLiveData.getValue();
        if (value == null) {
            return;
        }
        C5415f.a(this).d();
        Map<String, String> prepareRequestParams = prepareRequestParams(value);
        C8486a a11 = C5415f.a(this);
        n g10 = new l(this.api.completableResponse(this.actionName, prepareRequestParams).k(Mc.a.b()), C8125a.a()).f(new DM.e(new CalendarViewModel$onReadyButtonClicked$1(this), 3)).g(new InterfaceC9019a() { // from class: bQ.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                CalendarViewModel.onReadyButtonClicked$lambda$2(CalendarViewModel.this);
            }
        });
        uc.i iVar = new uc.i(new h(new CalendarViewModel$onReadyButtonClicked$4(this), 3), new InterfaceC9019a() { // from class: bQ.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                CalendarViewModel.onReadyButtonClicked$lambda$3(CalendarViewModel.this);
            }
        });
        g10.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }

    public final void onTripTypeSwitched(boolean isRoundTrip) {
        CalendarFullVO value = this.calendarLiveData.getValue();
        if (value == null) {
            return;
        }
        TripMode tripMode = isRoundTrip ? TripMode.ROUND_TRIP : TripMode.THERE;
        if (isRoundTrip && value.getTripKind() == TripKind.RAILWAY) {
            this.customAnalyticsLiveData.call();
        }
        updateCalendar$default(this, value.getTripKind(), tripMode, value.getComplexRouteSegmentId(), value.getSelectedDepartureDate(), null, value.getDaysRound(), value.getIsDaysRoundChecked(), false, value.getIsRailwayRoundTripEnabled(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @NotNull
    public final P<Boolean> progressLiveData() {
        return this.progressLiveData;
    }

    public final void setUpViewModel(@NotNull CalendarVO calendarVO) {
        Intrinsics.checkNotNullParameter(calendarVO, "calendarVO");
        if (this.calendarLiveData.getValue() == null) {
            String action = calendarVO.getAction();
            if (action == null) {
                action = calendarVO.getTripKind() == TripKind.TOUR ? "tourConfirmFieldV1" : "travelMainSaveField";
            }
            this.actionName = action;
            updateCalendar(calendarVO.getTripKind(), calendarVO.getTripMode(), calendarVO.getComplexSegmentId(), calendarVO.getThereDate(), calendarVO.getBackDate(), calendarVO.getDaysRound(), calendarVO.getIsDaysRoundChecked(), true, calendarVO.getIsRailwayRoundTripEnabled());
        }
    }
}
