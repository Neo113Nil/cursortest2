package ru.ozon.app.android.travel.calendar.view.data;

import Ve.C4598rp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarDayVO;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.app.android.travel.calendar.view.vo.DateConfigVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ:\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\bH\u0002J*\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001d0 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0002J2\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001d0 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\bH\u0002R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/calendar/view/data/CalendarBuilder;", "", "tripKind", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "monthNames", "", "", "startAvailableDate", "Lorg/joda/time/LocalDate;", "endAvailableDate", "startDate", "endDate", "selectedDepartureDate", "selectedReturnDate", "isOneDaySelection", "", "datesConfigs", "", "Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "countDayRound", "", "isWeekendsSupported", "isIndicatorsSupported", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;[Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZLjava/util/Map;IZZ)V", "[Ljava/lang/String;", "todayDate", "isHotelCalendar", "build", "", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "generateMonth", "Lkotlin/Pair;", "currentDate", "currentMonth", "currentYear", "endDateWithPadding", "generateWeek", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "generateDays", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarBuilder {
    private final int countDayRound;
    private final Map<LocalDate, DateConfigVO> datesConfigs;

    @NotNull
    private final LocalDate endAvailableDate;

    @NotNull
    private final LocalDate endDate;
    private final boolean isHotelCalendar;
    private final boolean isIndicatorsSupported;
    private final boolean isOneDaySelection;
    private final boolean isWeekendsSupported;

    @NotNull
    private final String[] monthNames;
    private final LocalDate selectedDepartureDate;
    private final LocalDate selectedReturnDate;

    @NotNull
    private final LocalDate startAvailableDate;

    @NotNull
    private final LocalDate startDate;

    @NotNull
    private final LocalDate todayDate;

    public CalendarBuilder(@NotNull TripKind tripKind, @NotNull String[] monthNames, @NotNull LocalDate startAvailableDate, @NotNull LocalDate endAvailableDate, @NotNull LocalDate startDate, @NotNull LocalDate endDate, LocalDate localDate, LocalDate localDate2, boolean z11, Map<LocalDate, DateConfigVO> map, int i11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(monthNames, "monthNames");
        Intrinsics.checkNotNullParameter(startAvailableDate, "startAvailableDate");
        Intrinsics.checkNotNullParameter(endAvailableDate, "endAvailableDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.monthNames = monthNames;
        this.startAvailableDate = startAvailableDate;
        this.endAvailableDate = endAvailableDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.selectedDepartureDate = localDate;
        this.selectedReturnDate = localDate2;
        this.isOneDaySelection = z11;
        this.datesConfigs = map;
        this.countDayRound = i11;
        this.isWeekendsSupported = z12;
        this.isIndicatorsSupported = z13;
        this.todayDate = new LocalDate();
        this.isHotelCalendar = tripKind == TripKind.HOTEL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x017c, code lost:
    
        if (r7.compareTo(r6) >= 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a4, code lost:
    
        if (r2 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ac, code lost:
    
        if (ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt.isSameDay(r16.startAvailableDate, r7) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ae, code lost:
    
        r2 = r16.selectedDepartureDate.u(r16.countDayRound);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "minusDays(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01bd, code lost:
    
        if (ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt.isSameDay(r2, r7) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c0, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c3, code lost:
    
        if (r4 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01cb, code lost:
    
        if (ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt.isSameDay(r16.endAvailableDate, r7) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01cd, code lost:
    
        r4 = r16.selectedReturnDate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01cf, code lost:
    
        if (r4 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d1, code lost:
    
        r4 = r16.selectedDepartureDate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d3, code lost:
    
        r4 = r4.C(r16.countDayRound);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "plusDays(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e0, code lost:
    
        if (ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt.isSameDay(r4, r7) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e3, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e6, code lost:
    
        r5 = new ru.ozon.app.android.travel.calendar.view.vo.CalendarDayVO.DayState.Part(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e5, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01c2, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01a0, code lost:
    
        if (r7.compareTo(r6) >= 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0254, code lost:
    
        if (ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt.isWeekend(r7) == false) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027c A[ADDED_TO_REGION, EDGE_INSN: B:65:0x027c->B:60:0x027c BREAK  A[LOOP:0: B:2:0x0009->B:63:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Pair<LocalDate, List<CalendarDayVO>> generateDays(LocalDate currentDate, int currentMonth, LocalDate endDateWithPadding) {
        boolean z11;
        boolean z12;
        CalendarDayVO.DayState dayState;
        CalendarDayVO.DayState part;
        LocalDate localDate;
        CalendarDayVO.DayState.StartInterval startInterval;
        Map<LocalDate, DateConfigVO> map;
        DateConfigVO dateConfigVO;
        boolean z13;
        Boolean isWorkday;
        LocalDate localDate2;
        ArrayList arrayList = new ArrayList();
        LocalDate localDate3 = currentDate;
        do {
            boolean isMonday = DateExtensionsKt.isMonday(localDate3);
            boolean isSunday = DateExtensionsKt.isSunday(localDate3);
            boolean isFirsMonthDay = DateExtensionsKt.isFirsMonthDay(localDate3);
            boolean isLastMonthDay = DateExtensionsKt.isLastMonthDay(localDate3);
            LocalDate localDate4 = this.selectedDepartureDate;
            boolean z14 = false;
            boolean isSameDay = localDate4 != null ? DateExtensionsKt.isSameDay(localDate4, localDate3) : false;
            LocalDate localDate5 = this.selectedReturnDate;
            boolean isSameDay2 = localDate5 != null ? DateExtensionsKt.isSameDay(localDate5, localDate3) : false;
            LocalDate localDate6 = this.startAvailableDate;
            if (localDate3.compareTo(this.endAvailableDate) > 0 || localDate3.compareTo(localDate6) < 0) {
                z11 = isSunday;
                z12 = false;
            } else {
                z11 = isSunday;
                z12 = true;
            }
            boolean z15 = isMonday || isFirsMonthDay;
            boolean z16 = z11 || isLastMonthDay;
            boolean isSameDay3 = DateExtensionsKt.isSameDay(localDate3, this.todayDate);
            if (this.isHotelCalendar && !z12 && (localDate2 = this.selectedDepartureDate) != null) {
                LocalDate u11 = localDate3.u(1);
                Intrinsics.checkNotNullExpressionValue(u11, "minusDays(...)");
                if (DateExtensionsKt.isSameDay(localDate2, u11)) {
                    dayState = new CalendarDayVO.DayState.Part(z15, true);
                    part = dayState;
                    map = this.datesConfigs;
                    if (map != null || (dateConfigVO = map.get(localDate3)) == null || (this.isHotelCalendar && isSameDay2)) {
                        dateConfigVO = null;
                    }
                    String valueOf = String.valueOf(localDate3.i());
                    boolean z17 = !(dateConfigVO == null && dateConfigVO.getIsDisabled());
                    if ((dateConfigVO == null ? dateConfigVO.getIndicator() : null) == null) {
                        z13 = false;
                        z14 = true;
                    } else {
                        z13 = false;
                    }
                    Indicator indicator = dateConfigVO != null ? dateConfigVO.getIndicator() : null;
                    boolean z18 = z13;
                    boolean z19 = this.isIndicatorsSupported;
                    if (this.isWeekendsSupported) {
                        if (dateConfigVO != null && (isWorkday = dateConfigVO.getIsWorkday()) != null) {
                            z18 = isWorkday.booleanValue();
                        }
                        arrayList.add(new CalendarDayVO(z12, z17, part, valueOf, localDate3, z14, indicator, z19, z18));
                        localDate3 = localDate3.C(1);
                        if (localDate3.n() != currentMonth || DateExtensionsKt.isMonday(localDate3)) {
                            break;
                            break;
                        }
                    }
                    z18 = true;
                    arrayList.add(new CalendarDayVO(z12, z17, part, valueOf, localDate3, z14, indicator, z19, z18));
                    localDate3 = localDate3.C(1);
                    if (localDate3.n() != currentMonth) {
                        break;
                    }
                }
            }
            if (!z12 || this.selectedDepartureDate == null) {
                dayState = isSameDay3 ? CalendarDayVO.DayState.Today.INSTANCE : CalendarDayVO.DayState.Default.INSTANCE;
            } else {
                if (isSameDay && this.isHotelCalendar) {
                    startInterval = new CalendarDayVO.DayState.StartInterval(!z16);
                } else if (isSameDay && this.countDayRound > 0 && DateExtensionsKt.isSameDay(localDate3, this.startAvailableDate)) {
                    startInterval = new CalendarDayVO.DayState.StartInterval(!z16);
                } else if (isSameDay && this.countDayRound > 0 && DateExtensionsKt.isSameDay(localDate3, this.endAvailableDate)) {
                    dayState = new CalendarDayVO.DayState.EndInterval(!z15);
                } else {
                    if (isSameDay && this.countDayRound > 0) {
                        part = new CalendarDayVO.DayState.MediumInterval(!z15, !z16);
                    } else if (isSameDay && (this.isOneDaySelection || this.selectedReturnDate == null)) {
                        dayState = CalendarDayVO.DayState.SingleSelection.INSTANCE;
                    } else if (isSameDay && isSameDay2) {
                        dayState = CalendarDayVO.DayState.Matched.INSTANCE;
                    } else if (isSameDay) {
                        startInterval = new CalendarDayVO.DayState.StartInterval(!z16);
                    } else {
                        if (this.isHotelCalendar && ((localDate = this.selectedReturnDate) == null || DateExtensionsKt.isSameDay(this.selectedDepartureDate, localDate))) {
                            LocalDate localDate7 = this.selectedDepartureDate;
                            LocalDate u12 = localDate3.u(1);
                            Intrinsics.checkNotNullExpressionValue(u12, "minusDays(...)");
                            if (DateExtensionsKt.isSameDay(localDate7, u12)) {
                                dayState = new CalendarDayVO.DayState.Part(z15, true);
                            }
                        }
                        if (this.selectedReturnDate == null && this.countDayRound == 0) {
                            dayState = isSameDay3 ? CalendarDayVO.DayState.Today.INSTANCE : CalendarDayVO.DayState.Default.INSTANCE;
                        } else if (isSameDay2 && this.countDayRound > 0 && DateExtensionsKt.isSameDay(localDate3, this.endAvailableDate)) {
                            dayState = new CalendarDayVO.DayState.EndInterval(!z15);
                        } else if (isSameDay2 && this.countDayRound > 0) {
                            part = new CalendarDayVO.DayState.MediumInterval(!z15, !z16);
                        } else if (isSameDay2) {
                            dayState = new CalendarDayVO.DayState.EndInterval(!z15);
                        } else {
                            if (this.selectedReturnDate == null) {
                                LocalDate u13 = this.selectedDepartureDate.u(this.countDayRound);
                                LocalDate C11 = this.selectedDepartureDate.C(this.countDayRound);
                                Intrinsics.checkNotNullExpressionValue(C11, "plusDays(...)");
                                if (localDate3.compareTo(C11) <= 0) {
                                }
                            }
                            if (this.selectedReturnDate != null) {
                                LocalDate u14 = this.selectedDepartureDate.u(this.countDayRound);
                                LocalDate C12 = this.selectedReturnDate.C(this.countDayRound);
                                Intrinsics.checkNotNullExpressionValue(C12, "plusDays(...)");
                                if (localDate3.compareTo(C12) <= 0) {
                                }
                            }
                            dayState = isSameDay3 ? CalendarDayVO.DayState.Today.INSTANCE : CalendarDayVO.DayState.Default.INSTANCE;
                        }
                    }
                    map = this.datesConfigs;
                    if (map != null) {
                    }
                    dateConfigVO = null;
                    String valueOf2 = String.valueOf(localDate3.i());
                    boolean z172 = !(dateConfigVO == null && dateConfigVO.getIsDisabled());
                    if ((dateConfigVO == null ? dateConfigVO.getIndicator() : null) == null) {
                    }
                    if (dateConfigVO != null) {
                    }
                    boolean z182 = z13;
                    boolean z192 = this.isIndicatorsSupported;
                    if (this.isWeekendsSupported) {
                    }
                    z182 = true;
                    arrayList.add(new CalendarDayVO(z12, z172, part, valueOf2, localDate3, z14, indicator, z192, z182));
                    localDate3 = localDate3.C(1);
                    if (localDate3.n() != currentMonth) {
                    }
                }
                part = startInterval;
                map = this.datesConfigs;
                if (map != null) {
                }
                dateConfigVO = null;
                String valueOf22 = String.valueOf(localDate3.i());
                boolean z1722 = !(dateConfigVO == null && dateConfigVO.getIsDisabled());
                if ((dateConfigVO == null ? dateConfigVO.getIndicator() : null) == null) {
                }
                if (dateConfigVO != null) {
                }
                boolean z1822 = z13;
                boolean z1922 = this.isIndicatorsSupported;
                if (this.isWeekendsSupported) {
                }
                z1822 = true;
                arrayList.add(new CalendarDayVO(z12, z1722, part, valueOf22, localDate3, z14, indicator, z1922, z1822));
                localDate3 = localDate3.C(1);
                if (localDate3.n() != currentMonth) {
                }
            }
            part = dayState;
            map = this.datesConfigs;
            if (map != null) {
            }
            dateConfigVO = null;
            String valueOf222 = String.valueOf(localDate3.i());
            boolean z17222 = !(dateConfigVO == null && dateConfigVO.getIsDisabled());
            if ((dateConfigVO == null ? dateConfigVO.getIndicator() : null) == null) {
            }
            if (dateConfigVO != null) {
            }
            boolean z18222 = z13;
            boolean z19222 = this.isIndicatorsSupported;
            if (this.isWeekendsSupported) {
            }
            z18222 = true;
            arrayList.add(new CalendarDayVO(z12, z17222, part, valueOf222, localDate3, z14, indicator, z19222, z18222));
            localDate3 = localDate3.C(1);
            if (localDate3.n() != currentMonth) {
            }
        } while (localDate3.compareTo(endDateWithPadding) < 0);
        return new Pair<>(localDate3, arrayList);
    }

    private final Pair<LocalDate, List<CalendarRowItemVO>> generateMonth(LocalDate currentDate, int currentMonth, int currentYear, LocalDate endDateWithPadding) {
        ArrayList arrayList = new ArrayList();
        while (currentDate.n() == currentMonth && currentDate.compareTo(endDateWithPadding) < 0) {
            String str = currentYear + "#" + currentDate.p();
            Pair<LocalDate, List<CalendarDayVO>> generateWeek = generateWeek(currentDate, endDateWithPadding);
            LocalDate a11 = generateWeek.a();
            arrayList.add(new CalendarRowItemVO.CalendarMonthWeekVO(str, generateWeek.b()));
            currentDate = a11;
        }
        arrayList.add(0, new CalendarRowItemVO.CalendarMonthTitleVO(C4598rp.c(currentYear, this.monthNames[currentMonth - 1], " ")));
        return new Pair<>(currentDate, arrayList);
    }

    private final Pair<LocalDate, List<CalendarDayVO>> generateWeek(LocalDate currentDate, LocalDate endDateWithPadding) {
        ArrayList arrayList = new ArrayList();
        int j11 = currentDate.j() - 1;
        for (int i11 = 0; i11 < j11; i11++) {
            arrayList.add(CalendarDayVO.INSTANCE.getEMPTY());
        }
        Pair<LocalDate, List<CalendarDayVO>> generateDays = generateDays(currentDate, currentDate.n(), endDateWithPadding);
        LocalDate a11 = generateDays.a();
        arrayList.addAll(generateDays.b());
        if (!DateExtensionsKt.isMonday(a11)) {
            int j12 = 8 - a11.j();
            for (int i12 = 0; i12 < j12; i12++) {
                arrayList.add(CalendarDayVO.INSTANCE.getEMPTY());
            }
        }
        return new Pair<>(a11, arrayList);
    }

    @NotNull
    public final List<CalendarRowItemVO> build() {
        LocalDate C11 = this.endDate.C(1);
        ArrayList arrayList = new ArrayList();
        LocalDate localDate = this.startDate;
        while (localDate.compareTo(C11) < 0) {
            Pair<LocalDate, List<CalendarRowItemVO>> generateMonth = generateMonth(localDate, localDate.n(), localDate.s(), C11);
            LocalDate a11 = generateMonth.a();
            arrayList.addAll(generateMonth.b());
            localDate = a11;
        }
        return arrayList;
    }
}
