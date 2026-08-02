package ru.ozon.app.android.travel.calendar.viewModel;

import G.g;
import Lm0.a;
import Sc.o;
import android.content.Context;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.calendar.extensions.CalendarExtensionsKt;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.app.android.travel.calendar.view.vo.DateConfigVO;
import ru.ozon.app.android.travel.calendar.view.vo.TripMode;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u0003123B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ=\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0004\b\u001a\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00100¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroid/content/Context;", "context", "Lorg/joda/time/LocalDate;", "date", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "oldVO", "", "processDateClick", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;)V", "processDatesIncorrectOrder", "thereDate", "backDate", "", "isSelectingReturnDate", "updateCalendar", "(Landroid/content/Context;Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "Landroidx/lifecycle/P;", "calendarLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$Event;", "calendarTokenizedEventLiveData", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$SelectionModel;", "selectionLiveData", "calendarVO", "isDynamicPricesSupported", "setUpViewModel", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;Z)V", "onResetCalendarClicked", "(Landroid/content/Context;)V", "onResetBackDateClicked", "onDateClicked", "(Landroid/content/Context;Lorg/joda/time/LocalDate;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "prepareActionForDate", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lorg/joda/time/LocalDate;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "calendarEventLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Z", "Companion", "Event", "SelectionModel", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean isDynamicPricesSupported;

    @NotNull
    private final SingleLiveEvent<Event> calendarEventLiveData = new SingleLiveEvent<>();

    @NotNull
    private final V<CalendarVO> calendarLiveData = new V<>();

    @NotNull
    private final BroadcastSingleLiveEvent<SelectionModel> selectionLiveData = new BroadcastSingleLiveEvent<>();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$Companion;", "", "<init>", "()V", "KEY_START_DATE", "", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$Event;", "", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "formattedDate", "Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "dateConfig", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Ljava/lang/String;", "getFormattedDate", "Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "getDateConfig", "()Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event {
        private final DateConfigVO dateConfig;

        @NotNull
        private final String formattedDate;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Event(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull String formattedDate, DateConfigVO dateConfigVO) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
            this.trackingInfo = trackingInfo;
            this.formattedDate = formattedDate;
            this.dateConfig = dateConfigVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return Intrinsics.d(this.trackingInfo, event.trackingInfo) && Intrinsics.d(this.formattedDate, event.formattedDate) && Intrinsics.d(this.dateConfig, event.dateConfig);
        }

        public final DateConfigVO getDateConfig() {
            return this.dateConfig;
        }

        @NotNull
        public final String getFormattedDate() {
            return this.formattedDate;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.trackingInfo.hashCode() * 31, 31, this.formattedDate);
            DateConfigVO dateConfigVO = this.dateConfig;
            return a11 + (dateConfigVO == null ? 0 : dateConfigVO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Event(trackingInfo=" + this.trackingInfo + ", formattedDate=" + this.formattedDate + ", dateConfig=" + this.dateConfig + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$SelectionModel;", "", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/LocalDate;", "getStartDate", "()Lorg/joda/time/LocalDate;", "getEndDate", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionModel {
        private final LocalDate endDate;
        private final LocalDate startDate;

        public SelectionModel(LocalDate localDate, LocalDate localDate2) {
            this.startDate = localDate;
            this.endDate = localDate2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionModel)) {
                return false;
            }
            SelectionModel selectionModel = (SelectionModel) other;
            return Intrinsics.d(this.startDate, selectionModel.startDate) && Intrinsics.d(this.endDate, selectionModel.endDate);
        }

        public final LocalDate getEndDate() {
            return this.endDate;
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public int hashCode() {
            LocalDate localDate = this.startDate;
            int hashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.endDate;
            return hashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SelectionModel(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void processDateClick(Context context, LocalDate date, CalendarVO oldVO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[oldVO.getTripMode().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            updateCalendar$default(this, context, oldVO, date, null, false, 16, null);
        } else {
            if (!oldVO.getIsSelectingReturnDate()) {
                updateCalendar(context, oldVO, date, null, true);
                return;
            }
            LocalDate startSelectedDate = oldVO.getStartSelectedDate();
            if (startSelectedDate == null || !startSelectedDate.e(date)) {
                updateCalendar$default(this, context, oldVO, oldVO.getStartSelectedDate(), date, false, 16, null);
            } else {
                processDatesIncorrectOrder(context, date, oldVO);
            }
        }
    }

    private final void processDatesIncorrectOrder(Context context, LocalDate date, CalendarVO oldVO) {
        if (oldVO.getTripKind() == TripKind.AVIA || oldVO.getTripKind() == TripKind.RAILWAY) {
            updateCalendar(context, oldVO, date, null, true);
        } else {
            updateCalendar$default(this, context, oldVO, date, oldVO.getStartSelectedDate(), false, 16, null);
        }
    }

    private final void updateCalendar(Context context, CalendarVO oldVO, LocalDate thereDate, LocalDate backDate, boolean isSelectingReturnDate) {
        if (oldVO.getTripKind() != TripKind.HOTEL || backDate == null || thereDate == null || thereDate.compareTo(backDate) != 0) {
            this.calendarLiveData.setValue(CalendarVO.copy$default(oldVO, null, null, null, null, null, null, null, thereDate, backDate, CalendarExtensionsKt.mapCalendarAsWeekItems(context, oldVO.getTripKind(), oldVO.getTripMode(), thereDate, backDate, oldVO.getStartShownDate(), oldVO.getEndShownDate(), oldVO.getMinAvailableDate(), oldVO.getMaxAvailableDate(), this.isDynamicPricesSupported ? null : oldVO.getDatesConfigs(), oldVO.getCountDayRound(), oldVO.getIsWeekendsSupported(), oldVO.getIsIndicatorsSupported()), null, isSelectingReturnDate, null, 0, null, false, false, 128123, null));
        } else {
            a.f17149a.d("Selected same date, do nothing", new Object[0]);
        }
    }

    static /* synthetic */ void updateCalendar$default(CalendarViewModel calendarViewModel, Context context, CalendarVO calendarVO, LocalDate localDate, LocalDate localDate2, boolean z11, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        calendarViewModel.updateCalendar(context, calendarVO, localDate, localDate2, z11);
    }

    @NotNull
    public final P<CalendarVO> calendarLiveData() {
        return this.calendarLiveData;
    }

    @NotNull
    public final P<Event> calendarTokenizedEventLiveData() {
        return this.calendarEventLiveData;
    }

    public final void onDateClicked(@NotNull Context context, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(date, "date");
        CalendarVO value = this.calendarLiveData.getValue();
        if (value == null) {
            return;
        }
        processDateClick(context, date, value);
        CalendarVO value2 = this.calendarLiveData.getValue();
        if (value2 != null) {
            this.selectionLiveData.setValue(new SelectionModel(value2.getStartSelectedDate(), value2.getEndSelectedDate()));
            Map<String, TokenizedTrackingInfo> dateTrackingInfo = value2.getDateTrackingInfo();
            if (dateTrackingInfo != null) {
                SingleLiveEvent<Event> singleLiveEvent = this.calendarEventLiveData;
                String E11 = date.E("yyyy-MM-dd");
                Intrinsics.checkNotNullExpressionValue(E11, "toString(...)");
                Map<LocalDate, DateConfigVO> datesConfigs = value2.getDatesConfigs();
                singleLiveEvent.setValue(new Event(dateTrackingInfo, E11, datesConfigs != null ? datesConfigs.get(date) : null));
            }
        }
    }

    public final void onResetBackDateClicked(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CalendarVO value = this.calendarLiveData.getValue();
        if (value != null) {
            updateCalendar$default(this, context, value, value.getStartSelectedDate(), null, false, 16, null);
            this.selectionLiveData.setValue(new SelectionModel(value.getStartSelectedDate(), null));
        }
    }

    public final void onResetCalendarClicked(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CalendarVO value = this.calendarLiveData.getValue();
        if (value != null) {
            updateCalendar$default(this, context, value, null, null, false, 16, null);
            this.selectionLiveData.setValue(new SelectionModel(null, null));
        }
    }

    @NotNull
    public final AtomAction prepareActionForDate(@NotNull AtomActionDTO action, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(date, "date");
        Map<String, String> params = action.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        u11.put("startDate", date.E("yyyy-MM-dd"));
        return AtomActionMapperKt.toAtomAction(AtomActionDTO.copy$default(action, null, null, null, u11, null, 23, null), null);
    }

    @NotNull
    public final P<SelectionModel> selectionLiveData() {
        return this.selectionLiveData;
    }

    public final void setUpViewModel(@NotNull CalendarVO calendarVO, boolean isDynamicPricesSupported) {
        Intrinsics.checkNotNullParameter(calendarVO, "calendarVO");
        this.calendarLiveData.setValue(calendarVO);
        this.isDynamicPricesSupported = isDynamicPricesSupported;
    }
}
