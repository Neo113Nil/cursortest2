package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo;

import B0.C2454a;
import Ds.C2880a;
import G.g;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\b\u0081\b\u0018\u00002\u00020\u0001:\u0002JKB±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 Jà\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b6\u00104R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b\f\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b=\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bA\u0010@R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b\u0018\u00104R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\bE\u0010$R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b\u001a\u00104R\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\bF\u0010$R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b\u001e\u00104¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;", "", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripKind", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "tripMode", "", "complexRouteSegmentId", "", "hasSelectedDate", "areDateControlsVisible", "areTourDateControlsVisible", "isReturnDateControlEnabled", "", "scrollPosition", "Lorg/joda/time/LocalDate;", "selectedDepartureDate", "selectedReturnDate", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;", "selectedDepartureDateSpanInfo", "selectedReturnDateSpanInfo", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;", "calendarItems", "isSelectingReturnDate", "daysRound", "isDaysRoundChecked", "daysRoundReadableText", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "readyButton", "isRailwayRoundTripEnabled", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;Ljava/lang/String;ZZZZLjava/lang/Integer;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;Z)V", "copy", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;Ljava/lang/String;ZZZZLjava/lang/Integer;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;Z)Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "getTripKind", "()Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "getTripMode", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "Ljava/lang/String;", "getComplexRouteSegmentId", "Z", "getHasSelectedDate", "()Z", "getAreDateControlsVisible", "getAreTourDateControlsVisible", "Ljava/lang/Integer;", "getScrollPosition", "()Ljava/lang/Integer;", "Lorg/joda/time/LocalDate;", "getSelectedDepartureDate", "()Lorg/joda/time/LocalDate;", "getSelectedReturnDate", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;", "getSelectedDepartureDateSpanInfo", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;", "getSelectedReturnDateSpanInfo", "Ljava/util/List;", "getCalendarItems", "()Ljava/util/List;", "getDaysRound", "getDaysRoundReadableText", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "getReadyButton", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "ReadyButtonVO", "SpanDateInfoVO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarFullVO {
    private final boolean areDateControlsVisible;
    private final boolean areTourDateControlsVisible;

    @NotNull
    private final List<CalendarItemVO> calendarItems;
    private final String complexRouteSegmentId;

    @NotNull
    private final String daysRound;

    @NotNull
    private final String daysRoundReadableText;
    private final boolean hasSelectedDate;
    private final boolean isDaysRoundChecked;
    private final boolean isRailwayRoundTripEnabled;
    private final boolean isReturnDateControlEnabled;
    private final boolean isSelectingReturnDate;

    @NotNull
    private final ReadyButtonVO readyButton;
    private final Integer scrollPosition;
    private final LocalDate selectedDepartureDate;
    private final SpanDateInfoVO selectedDepartureDateSpanInfo;
    private final LocalDate selectedReturnDate;
    private final SpanDateInfoVO selectedReturnDateSpanInfo;

    @NotNull
    private final TripKind tripKind;

    @NotNull
    private final TripMode tripMode;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "", "", "isVisible", "", "text", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getText", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReadyButtonVO {
        private final boolean isVisible;

        @NotNull
        private final String text;

        public ReadyButtonVO(boolean z11, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.isVisible = z11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadyButtonVO)) {
                return false;
            }
            ReadyButtonVO readyButtonVO = (ReadyButtonVO) other;
            return this.isVisible == readyButtonVO.isVisible && Intrinsics.d(this.text, readyButtonVO.text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Boolean.hashCode(this.isVisible) * 31);
        }

        /* renamed from: isVisible, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return "ReadyButtonVO(isVisible=" + this.isVisible + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;", "", "", "date", "", "startIndex", "endIndex", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "I", "getStartIndex", "getEndIndex", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpanDateInfoVO {

        @NotNull
        private final String date;
        private final int endIndex;
        private final int startIndex;

        public SpanDateInfoVO(@NotNull String date, int i11, int i12) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
            this.startIndex = i11;
            this.endIndex = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpanDateInfoVO)) {
                return false;
            }
            SpanDateInfoVO spanDateInfoVO = (SpanDateInfoVO) other;
            return Intrinsics.d(this.date, spanDateInfoVO.date) && this.startIndex == spanDateInfoVO.startIndex && this.endIndex == spanDateInfoVO.endIndex;
        }

        @NotNull
        public final String getDate() {
            return this.date;
        }

        public final int getEndIndex() {
            return this.endIndex;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.endIndex) + C2454a.a(this.startIndex, this.date.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.date;
            return b.e(this.endIndex, ")", C3660k.c(this.startIndex, "SpanDateInfoVO(date=", str, ", startIndex=", ", endIndex="));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarFullVO(@NotNull TripKind tripKind, @NotNull TripMode tripMode, String str, boolean z11, boolean z12, boolean z13, boolean z14, Integer num, LocalDate localDate, LocalDate localDate2, SpanDateInfoVO spanDateInfoVO, SpanDateInfoVO spanDateInfoVO2, @NotNull List<? extends CalendarItemVO> calendarItems, boolean z15, @NotNull String daysRound, boolean z16, @NotNull String daysRoundReadableText, @NotNull ReadyButtonVO readyButton, boolean z17) {
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        Intrinsics.checkNotNullParameter(calendarItems, "calendarItems");
        Intrinsics.checkNotNullParameter(daysRound, "daysRound");
        Intrinsics.checkNotNullParameter(daysRoundReadableText, "daysRoundReadableText");
        Intrinsics.checkNotNullParameter(readyButton, "readyButton");
        this.tripKind = tripKind;
        this.tripMode = tripMode;
        this.complexRouteSegmentId = str;
        this.hasSelectedDate = z11;
        this.areDateControlsVisible = z12;
        this.areTourDateControlsVisible = z13;
        this.isReturnDateControlEnabled = z14;
        this.scrollPosition = num;
        this.selectedDepartureDate = localDate;
        this.selectedReturnDate = localDate2;
        this.selectedDepartureDateSpanInfo = spanDateInfoVO;
        this.selectedReturnDateSpanInfo = spanDateInfoVO2;
        this.calendarItems = calendarItems;
        this.isSelectingReturnDate = z15;
        this.daysRound = daysRound;
        this.isDaysRoundChecked = z16;
        this.daysRoundReadableText = daysRoundReadableText;
        this.readyButton = readyButton;
        this.isRailwayRoundTripEnabled = z17;
    }

    public static /* synthetic */ CalendarFullVO copy$default(CalendarFullVO calendarFullVO, TripKind tripKind, TripMode tripMode, String str, boolean z11, boolean z12, boolean z13, boolean z14, Integer num, LocalDate localDate, LocalDate localDate2, SpanDateInfoVO spanDateInfoVO, SpanDateInfoVO spanDateInfoVO2, List list, boolean z15, String str2, boolean z16, String str3, ReadyButtonVO readyButtonVO, boolean z17, int i11, Object obj) {
        boolean z18;
        ReadyButtonVO readyButtonVO2;
        TripKind tripKind2 = (i11 & 1) != 0 ? calendarFullVO.tripKind : tripKind;
        TripMode tripMode2 = (i11 & 2) != 0 ? calendarFullVO.tripMode : tripMode;
        String str4 = (i11 & 4) != 0 ? calendarFullVO.complexRouteSegmentId : str;
        boolean z19 = (i11 & 8) != 0 ? calendarFullVO.hasSelectedDate : z11;
        boolean z21 = (i11 & 16) != 0 ? calendarFullVO.areDateControlsVisible : z12;
        boolean z22 = (i11 & 32) != 0 ? calendarFullVO.areTourDateControlsVisible : z13;
        boolean z23 = (i11 & 64) != 0 ? calendarFullVO.isReturnDateControlEnabled : z14;
        Integer num2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? calendarFullVO.scrollPosition : num;
        LocalDate localDate3 = (i11 & 256) != 0 ? calendarFullVO.selectedDepartureDate : localDate;
        LocalDate localDate4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? calendarFullVO.selectedReturnDate : localDate2;
        SpanDateInfoVO spanDateInfoVO3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? calendarFullVO.selectedDepartureDateSpanInfo : spanDateInfoVO;
        SpanDateInfoVO spanDateInfoVO4 = (i11 & 2048) != 0 ? calendarFullVO.selectedReturnDateSpanInfo : spanDateInfoVO2;
        List list2 = (i11 & 4096) != 0 ? calendarFullVO.calendarItems : list;
        boolean z24 = (i11 & 8192) != 0 ? calendarFullVO.isSelectingReturnDate : z15;
        TripKind tripKind3 = tripKind2;
        String str5 = (i11 & 16384) != 0 ? calendarFullVO.daysRound : str2;
        boolean z25 = (i11 & 32768) != 0 ? calendarFullVO.isDaysRoundChecked : z16;
        String str6 = (i11 & 65536) != 0 ? calendarFullVO.daysRoundReadableText : str3;
        ReadyButtonVO readyButtonVO3 = (i11 & 131072) != 0 ? calendarFullVO.readyButton : readyButtonVO;
        if ((i11 & 262144) != 0) {
            readyButtonVO2 = readyButtonVO3;
            z18 = calendarFullVO.isRailwayRoundTripEnabled;
        } else {
            z18 = z17;
            readyButtonVO2 = readyButtonVO3;
        }
        return calendarFullVO.copy(tripKind3, tripMode2, str4, z19, z21, z22, z23, num2, localDate3, localDate4, spanDateInfoVO3, spanDateInfoVO4, list2, z24, str5, z25, str6, readyButtonVO2, z18);
    }

    @NotNull
    public final CalendarFullVO copy(@NotNull TripKind tripKind, @NotNull TripMode tripMode, String complexRouteSegmentId, boolean hasSelectedDate, boolean areDateControlsVisible, boolean areTourDateControlsVisible, boolean isReturnDateControlEnabled, Integer scrollPosition, LocalDate selectedDepartureDate, LocalDate selectedReturnDate, SpanDateInfoVO selectedDepartureDateSpanInfo, SpanDateInfoVO selectedReturnDateSpanInfo, @NotNull List<? extends CalendarItemVO> calendarItems, boolean isSelectingReturnDate, @NotNull String daysRound, boolean isDaysRoundChecked, @NotNull String daysRoundReadableText, @NotNull ReadyButtonVO readyButton, boolean isRailwayRoundTripEnabled) {
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        Intrinsics.checkNotNullParameter(calendarItems, "calendarItems");
        Intrinsics.checkNotNullParameter(daysRound, "daysRound");
        Intrinsics.checkNotNullParameter(daysRoundReadableText, "daysRoundReadableText");
        Intrinsics.checkNotNullParameter(readyButton, "readyButton");
        return new CalendarFullVO(tripKind, tripMode, complexRouteSegmentId, hasSelectedDate, areDateControlsVisible, areTourDateControlsVisible, isReturnDateControlEnabled, scrollPosition, selectedDepartureDate, selectedReturnDate, selectedDepartureDateSpanInfo, selectedReturnDateSpanInfo, calendarItems, isSelectingReturnDate, daysRound, isDaysRoundChecked, daysRoundReadableText, readyButton, isRailwayRoundTripEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarFullVO)) {
            return false;
        }
        CalendarFullVO calendarFullVO = (CalendarFullVO) other;
        return this.tripKind == calendarFullVO.tripKind && this.tripMode == calendarFullVO.tripMode && Intrinsics.d(this.complexRouteSegmentId, calendarFullVO.complexRouteSegmentId) && this.hasSelectedDate == calendarFullVO.hasSelectedDate && this.areDateControlsVisible == calendarFullVO.areDateControlsVisible && this.areTourDateControlsVisible == calendarFullVO.areTourDateControlsVisible && this.isReturnDateControlEnabled == calendarFullVO.isReturnDateControlEnabled && Intrinsics.d(this.scrollPosition, calendarFullVO.scrollPosition) && Intrinsics.d(this.selectedDepartureDate, calendarFullVO.selectedDepartureDate) && Intrinsics.d(this.selectedReturnDate, calendarFullVO.selectedReturnDate) && Intrinsics.d(this.selectedDepartureDateSpanInfo, calendarFullVO.selectedDepartureDateSpanInfo) && Intrinsics.d(this.selectedReturnDateSpanInfo, calendarFullVO.selectedReturnDateSpanInfo) && Intrinsics.d(this.calendarItems, calendarFullVO.calendarItems) && this.isSelectingReturnDate == calendarFullVO.isSelectingReturnDate && Intrinsics.d(this.daysRound, calendarFullVO.daysRound) && this.isDaysRoundChecked == calendarFullVO.isDaysRoundChecked && Intrinsics.d(this.daysRoundReadableText, calendarFullVO.daysRoundReadableText) && Intrinsics.d(this.readyButton, calendarFullVO.readyButton) && this.isRailwayRoundTripEnabled == calendarFullVO.isRailwayRoundTripEnabled;
    }

    public final boolean getAreDateControlsVisible() {
        return this.areDateControlsVisible;
    }

    public final boolean getAreTourDateControlsVisible() {
        return this.areTourDateControlsVisible;
    }

    @NotNull
    public final List<CalendarItemVO> getCalendarItems() {
        return this.calendarItems;
    }

    public final String getComplexRouteSegmentId() {
        return this.complexRouteSegmentId;
    }

    @NotNull
    public final String getDaysRound() {
        return this.daysRound;
    }

    @NotNull
    public final String getDaysRoundReadableText() {
        return this.daysRoundReadableText;
    }

    public final boolean getHasSelectedDate() {
        return this.hasSelectedDate;
    }

    @NotNull
    public final ReadyButtonVO getReadyButton() {
        return this.readyButton;
    }

    public final Integer getScrollPosition() {
        return this.scrollPosition;
    }

    public final LocalDate getSelectedDepartureDate() {
        return this.selectedDepartureDate;
    }

    public final SpanDateInfoVO getSelectedDepartureDateSpanInfo() {
        return this.selectedDepartureDateSpanInfo;
    }

    public final LocalDate getSelectedReturnDate() {
        return this.selectedReturnDate;
    }

    public final SpanDateInfoVO getSelectedReturnDateSpanInfo() {
        return this.selectedReturnDateSpanInfo;
    }

    @NotNull
    public final TripKind getTripKind() {
        return this.tripKind;
    }

    @NotNull
    public final TripMode getTripMode() {
        return this.tripMode;
    }

    public int hashCode() {
        int hashCode = (this.tripMode.hashCode() + (this.tripKind.hashCode() * 31)) * 31;
        String str = this.complexRouteSegmentId;
        int a11 = C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasSelectedDate), 31, this.areDateControlsVisible), 31, this.areTourDateControlsVisible), 31, this.isReturnDateControlEnabled);
        Integer num = this.scrollPosition;
        int hashCode2 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        LocalDate localDate = this.selectedDepartureDate;
        int hashCode3 = (hashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.selectedReturnDate;
        int hashCode4 = (hashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        SpanDateInfoVO spanDateInfoVO = this.selectedDepartureDateSpanInfo;
        int hashCode5 = (hashCode4 + (spanDateInfoVO == null ? 0 : spanDateInfoVO.hashCode())) * 31;
        SpanDateInfoVO spanDateInfoVO2 = this.selectedReturnDateSpanInfo;
        return Boolean.hashCode(this.isRailwayRoundTripEnabled) + ((this.readyButton.hashCode() + g.a(C3532b.a(g.a(C3532b.a(g.b((hashCode5 + (spanDateInfoVO2 != null ? spanDateInfoVO2.hashCode() : 0)) * 31, 31, this.calendarItems), 31, this.isSelectingReturnDate), 31, this.daysRound), 31, this.isDaysRoundChecked), 31, this.daysRoundReadableText)) * 31);
    }

    /* renamed from: isDaysRoundChecked, reason: from getter */
    public final boolean getIsDaysRoundChecked() {
        return this.isDaysRoundChecked;
    }

    /* renamed from: isRailwayRoundTripEnabled, reason: from getter */
    public final boolean getIsRailwayRoundTripEnabled() {
        return this.isRailwayRoundTripEnabled;
    }

    /* renamed from: isReturnDateControlEnabled, reason: from getter */
    public final boolean getIsReturnDateControlEnabled() {
        return this.isReturnDateControlEnabled;
    }

    /* renamed from: isSelectingReturnDate, reason: from getter */
    public final boolean getIsSelectingReturnDate() {
        return this.isSelectingReturnDate;
    }

    @NotNull
    public String toString() {
        TripKind tripKind = this.tripKind;
        TripMode tripMode = this.tripMode;
        String str = this.complexRouteSegmentId;
        boolean z11 = this.hasSelectedDate;
        boolean z12 = this.areDateControlsVisible;
        boolean z13 = this.areTourDateControlsVisible;
        boolean z14 = this.isReturnDateControlEnabled;
        Integer num = this.scrollPosition;
        LocalDate localDate = this.selectedDepartureDate;
        LocalDate localDate2 = this.selectedReturnDate;
        SpanDateInfoVO spanDateInfoVO = this.selectedDepartureDateSpanInfo;
        SpanDateInfoVO spanDateInfoVO2 = this.selectedReturnDateSpanInfo;
        List<CalendarItemVO> list = this.calendarItems;
        boolean z15 = this.isSelectingReturnDate;
        String str2 = this.daysRound;
        boolean z16 = this.isDaysRoundChecked;
        String str3 = this.daysRoundReadableText;
        ReadyButtonVO readyButtonVO = this.readyButton;
        boolean z17 = this.isRailwayRoundTripEnabled;
        StringBuilder sb2 = new StringBuilder("CalendarFullVO(tripKind=");
        sb2.append(tripKind);
        sb2.append(", tripMode=");
        sb2.append(tripMode);
        sb2.append(", complexRouteSegmentId=");
        C2880a.c(str, ", hasSelectedDate=", ", areDateControlsVisible=", sb2, z11);
        f.c(", areTourDateControlsVisible=", ", isReturnDateControlEnabled=", sb2, z12, z13);
        sb2.append(z14);
        sb2.append(", scrollPosition=");
        sb2.append(num);
        sb2.append(", selectedDepartureDate=");
        sb2.append(localDate);
        sb2.append(", selectedReturnDate=");
        sb2.append(localDate2);
        sb2.append(", selectedDepartureDateSpanInfo=");
        sb2.append(spanDateInfoVO);
        sb2.append(", selectedReturnDateSpanInfo=");
        sb2.append(spanDateInfoVO2);
        sb2.append(", calendarItems=");
        sb2.append(list);
        sb2.append(", isSelectingReturnDate=");
        sb2.append(z15);
        sb2.append(", daysRound=");
        C2880a.c(str2, ", isDaysRoundChecked=", ", daysRoundReadableText=", sb2, z16);
        sb2.append(str3);
        sb2.append(", readyButton=");
        sb2.append(readyButtonVO);
        sb2.append(", isRailwayRoundTripEnabled=");
        return a.a(")", sb2, z17);
    }
}
