package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.data;

import G.g;
import Sc.o;
import U7.d;
import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.app.android.travel.calendar.R$array;
import ru.ozon.app.android.travel.calendar.R$plurals;
import ru.ozon.app.android.travel.feature.general.main.R$string;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.utils.CustomShortMonthDateTimeFormatterBuilder;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarDayVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarFullVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarItemVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.TripMode;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J)\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020\u001f*\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u001f*\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b0\u0010/J[\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010!2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001f¢\u0006\u0004\b5\u00106R8\u00109\u001a&\u0012\f\u0012\n 8*\u0004\u0018\u00010!0! 8*\u0012\u0012\u000e\b\u0001\u0012\n 8*\u0004\u0018\u00010!0!07078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010B\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010?¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/data/CalendarFullMapper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripKind", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "tripMode", "Lorg/joda/time/LocalDate;", "thereDate", "backDate", "", "daysRound", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;", "mapCalendarItemsDTO", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;I)Ljava/util/List;", "depth", "calculateCalendarEndDate", "(I)Lorg/joda/time/LocalDate;", "provideCalendarDepth", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;)I", "items", "calculateScrollPosition", "(Ljava/util/List;)Ljava/lang/Integer;", "date", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;", "mapSelectedDate", "(Lorg/joda/time/LocalDate;)Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;", "", "isDaysRoundChecked", "", "daysRoundReadableText", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "mapReadyButtonVO", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZLjava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "formattingDate", "relativeDate", "hideYear", "formatDateRelatively", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)Ljava/lang/String;", "mapDaysRoundReadableText", "(I)Ljava/lang/String;", "that", "isSameYear", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)Z", "isSameMonth", "complexRouteSegmentId", "isRailwayRoundTripEnabled", "isInitialMapping", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;", "map", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;ZZZ)Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;", "", "kotlin.jvm.PlatformType", "monthNames", "[Ljava/lang/String;", "defaultButtonText", "Ljava/lang/String;", "Lorg/joda/time/format/b;", "selectedDateFormatter", "Lorg/joda/time/format/b;", "selectedFullDateFormatter", "selectedSameYearDateFormatter", "selectedSameMonthDateFormatter", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarFullMapper {

    @NotNull
    private final String defaultButtonText;

    @NotNull
    private final String[] monthNames;

    @NotNull
    private final b selectedDateFormatter;

    @NotNull
    private final b selectedFullDateFormatter;

    @NotNull
    private final b selectedSameMonthDateFormatter;

    @NotNull
    private final b selectedSameYearDateFormatter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/data/CalendarFullMapper$Companion;", "", "<init>", "()V", "PATTERN_SELECTED_DATE", "", "PATTERN_SELECTED_DATE_FULL", "PATTERN_SELECTED_DATE_SAME_YEAR", "PATTERN_SELECTED_DATE_SAME_MONTH", "RAILWAY_DAY_DEPTH", "", "DAYS_IN_YEAR", "EMPTY_STRING", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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
            try {
                iArr[TripMode.BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CalendarFullMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] stringArray = context.getResources().getStringArray(R$array.calendar_month_names);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        this.monthNames = stringArray;
        this.defaultButtonText = StringProvider.getString(R$string.common_ready);
        CustomShortMonthDateTimeFormatterBuilder customShortMonthDateTimeFormatterBuilder = new CustomShortMonthDateTimeFormatterBuilder(context);
        this.selectedDateFormatter = customShortMonthDateTimeFormatterBuilder.appendPattern("d MMM, EEE").toFormatter();
        customShortMonthDateTimeFormatterBuilder.clear();
        this.selectedFullDateFormatter = a.b("d MMMM yyyy");
        this.selectedSameYearDateFormatter = a.b("d MMMM");
        this.selectedSameMonthDateFormatter = a.b("d");
    }

    private final LocalDate calculateCalendarEndDate(int depth) {
        LocalDate C11 = new LocalDate().C(depth);
        Intrinsics.checkNotNullExpressionValue(C11, "plusDays(...)");
        return C11;
    }

    private final Integer calculateScrollPosition(List<? extends CalendarItemVO> items) {
        List b02 = C7714v.b0(CalendarDayVO.DayState.SINGLE_SELECTION, CalendarDayVO.DayState.START_INTERVAL, CalendarDayVO.DayState.MEDIUM_INTERVAL, CalendarDayVO.DayState.END_INTERVAL, CalendarDayVO.DayState.MATCHED);
        Iterator<? extends CalendarItemVO> it = items.iterator();
        int i11 = 0;
        loop0: while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            CalendarItemVO next = it.next();
            if (next instanceof CalendarItemVO.CalendarMonthWeekVO) {
                List<CalendarDayVO> days = ((CalendarItemVO.CalendarMonthWeekVO) next).getDays();
                if (!(days instanceof Collection) || !days.isEmpty()) {
                    Iterator<T> it2 = days.iterator();
                    while (it2.hasNext()) {
                        if (b02.contains(((CalendarDayVO) it2.next()).getState())) {
                            break loop0;
                        }
                    }
                }
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    private final String formatDateRelatively(LocalDate formattingDate, LocalDate relativeDate, boolean hideYear) {
        String f7 = formattingDate.f(isSameMonth(formattingDate, relativeDate) ? this.selectedSameMonthDateFormatter : (isSameYear(formattingDate, relativeDate) || hideYear) ? this.selectedSameYearDateFormatter : this.selectedFullDateFormatter);
        Intrinsics.checkNotNullExpressionValue(f7, "toString(...)");
        return f7;
    }

    static /* synthetic */ String formatDateRelatively$default(CalendarFullMapper calendarFullMapper, LocalDate localDate, LocalDate localDate2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return calendarFullMapper.formatDateRelatively(localDate, localDate2, z11);
    }

    private final boolean isSameMonth(LocalDate localDate, LocalDate localDate2) {
        return isSameYear(localDate, localDate2) && localDate.n() == localDate2.n();
    }

    private final boolean isSameYear(LocalDate localDate, LocalDate localDate2) {
        return localDate.s() == localDate2.s();
    }

    private final List<CalendarItemVO> mapCalendarItemsDTO(TripKind tripKind, TripMode tripMode, LocalDate thereDate, LocalDate backDate, int daysRound) {
        String[] strArr = this.monthNames;
        LocalDate localDate = new LocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "now(...)");
        return new CalendarBuilder(strArr, localDate, calculateCalendarEndDate(provideCalendarDepth(tripKind)), thereDate, backDate, tripMode == TripMode.THERE || tripMode == TripMode.BACK, daysRound).build();
    }

    private final String mapDaysRoundReadableText(int daysRound) {
        Integer valueOf = Integer.valueOf(daysRound);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return "";
        }
        int intValue = valueOf.intValue();
        String quantityString = StringProvider.getQuantityString(R$plurals.calendar_days_round_android, intValue, Integer.valueOf(intValue));
        return quantityString != null ? quantityString : "";
    }

    private final CalendarFullVO.ReadyButtonVO mapReadyButtonVO(TripKind tripKind, TripMode tripMode, LocalDate thereDate, LocalDate backDate, boolean isDaysRoundChecked, String daysRoundReadableText) {
        Pair pair;
        int i11 = WhenMappings.$EnumSwitchMapping$0[tripMode.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            if (thereDate != null) {
                pair = new Pair(Boolean.TRUE, d.e(thereDate.f(this.selectedFullDateFormatter), isDaysRoundChecked ? Nk.a.b(" ", daysRoundReadableText) : ""));
            } else {
                pair = new Pair(Boolean.FALSE, this.defaultButtonText);
            }
        } else {
            if (tripKind != TripKind.HOTEL || thereDate == null) {
                pair = (thereDate == null || backDate == null) ? new Pair(Boolean.FALSE, this.defaultButtonText) : new Pair(Boolean.TRUE, g.c(formatDateRelatively$default(this, thereDate, backDate, false, 4, null), " – ", backDate.f(this.selectedFullDateFormatter)));
                return new CalendarFullVO.ReadyButtonVO(((Boolean) pair.a()).booleanValue(), (String) pair.b());
            }
            LocalDate C11 = thereDate.C(1);
            if (backDate == null) {
                backDate = C11;
            }
            int n11 = Days.B(thereDate, backDate).n();
            String formatDateRelatively = formatDateRelatively(thereDate, backDate, true);
            String f7 = backDate.f(this.selectedSameYearDateFormatter);
            String quantityString = StringProvider.getQuantityString(R$plurals.calendar_nights_android, n11, Integer.valueOf(n11));
            pair = new Pair(Boolean.TRUE, formatDateRelatively + " – " + f7 + ", " + quantityString);
        }
        return new CalendarFullVO.ReadyButtonVO(((Boolean) pair.a()).booleanValue(), (String) pair.b());
    }

    private final CalendarFullVO.SpanDateInfoVO mapSelectedDate(LocalDate date) {
        if (date == null) {
            return null;
        }
        String f7 = date.f(this.selectedDateFormatter);
        Intrinsics.f(f7);
        int N11 = h.N(',', 0, 6, f7);
        if (N11 < 0) {
            return null;
        }
        return new CalendarFullVO.SpanDateInfoVO(f7, N11, f7.length());
    }

    private final int provideCalendarDepth(TripKind tripKind) {
        return tripKind == TripKind.RAILWAY ? 120 : 365;
    }

    @NotNull
    public final CalendarFullVO map(@NotNull TripKind tripKind, @NotNull TripMode tripMode, String complexRouteSegmentId, LocalDate thereDate, LocalDate backDate, @NotNull String daysRound, boolean isDaysRoundChecked, boolean isRailwayRoundTripEnabled, boolean isInitialMapping) {
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        Intrinsics.checkNotNullParameter(daysRound, "daysRound");
        boolean z11 = thereDate != null;
        boolean z12 = backDate != null;
        boolean z13 = z11 || z12;
        Integer w02 = h.w0(daysRound);
        int intValue = w02 != null ? w02.intValue() : 0;
        List<CalendarItemVO> mapCalendarItemsDTO = mapCalendarItemsDTO(tripKind, tripMode, thereDate, backDate, isDaysRoundChecked ? intValue : 0);
        boolean z14 = !(z11 && z12) && z11 && tripMode == TripMode.ROUND_TRIP;
        String mapDaysRoundReadableText = mapDaysRoundReadableText(intValue);
        return new CalendarFullVO(tripKind, tripMode, complexRouteSegmentId, z13, z13 && ((tripKind == TripKind.RAILWAY && isRailwayRoundTripEnabled) || (tripKind == TripKind.AVIA && complexRouteSegmentId == null)), tripKind == TripKind.TOUR && z13, tripMode != TripMode.ROUND_TRIP || z11, isInitialMapping ? calculateScrollPosition(mapCalendarItemsDTO) : null, thereDate, backDate, mapSelectedDate(thereDate), mapSelectedDate(backDate), mapCalendarItemsDTO, z14, daysRound, isDaysRoundChecked, mapDaysRoundReadableText, mapReadyButtonVO(tripKind, tripMode, thereDate, backDate, isDaysRoundChecked, mapDaysRoundReadableText), isRailwayRoundTripEnabled);
    }
}
