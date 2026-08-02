package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.data;

import Ve.C4598rp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarDayVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarItemVO;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J:\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J*\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J2\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/data/CalendarBuilder;", "", "monthNames", "", "", "startDate", "Lorg/joda/time/LocalDate;", "endDate", "selectedDepartureDate", "selectedReturnDate", "isOneDaySelection", "", "daysRound", "", "<init>", "([Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZI)V", "[Ljava/lang/String;", "firstAvailableDate", "lastAvailableDate", "kotlin.jvm.PlatformType", "Lorg/joda/time/LocalDate;", "build", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;", "calculateStartDatePadding", "calculateEndDatePadding", "generateMonth", "Lkotlin/Pair;", "currentDate", "currentMonth", "currentYear", "endDateWithPadding", "generateWeek", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarDayVO;", "generateDays", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarBuilder {
    private final int daysRound;

    @NotNull
    private final LocalDate endDate;

    @NotNull
    private final LocalDate firstAvailableDate;
    private final boolean isOneDaySelection;
    private final LocalDate lastAvailableDate;

    @NotNull
    private final String[] monthNames;
    private final LocalDate selectedDepartureDate;
    private final LocalDate selectedReturnDate;

    @NotNull
    private final LocalDate startDate;

    public CalendarBuilder(@NotNull String[] monthNames, @NotNull LocalDate startDate, @NotNull LocalDate endDate, LocalDate localDate, LocalDate localDate2, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(monthNames, "monthNames");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.monthNames = monthNames;
        this.startDate = startDate;
        this.endDate = endDate;
        this.selectedDepartureDate = localDate;
        this.selectedReturnDate = localDate2;
        this.isOneDaySelection = z11;
        this.daysRound = i11;
        this.firstAvailableDate = startDate;
        this.lastAvailableDate = endDate.u(1);
    }

    private final LocalDate calculateEndDatePadding() {
        LocalDate C11 = this.endDate.C(Math.min(15 - this.endDate.j(), (this.endDate.g().f() + 1) - this.endDate.i()));
        Intrinsics.checkNotNullExpressionValue(C11, "plusDays(...)");
        return C11;
    }

    private final LocalDate calculateStartDatePadding() {
        LocalDate u11 = this.startDate.u(Math.min(this.startDate.j() + 6, this.startDate.i() - 1));
        Intrinsics.checkNotNullExpressionValue(u11, "minusDays(...)");
        return u11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x016c, code lost:
    
        if (ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt.isSameDay(r5, r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fe, code lost:
    
        if (ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt.isSameDay(r5, r10) != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Pair<LocalDate, List<CalendarDayVO>> generateDays(LocalDate currentDate, int currentMonth, LocalDate endDateWithPadding) {
        CalendarDayVO.DayState dayState;
        ArrayList arrayList = new ArrayList();
        LocalDate localDate = currentDate;
        do {
            LocalDate localDate2 = this.selectedDepartureDate;
            boolean z11 = false;
            boolean isSameDay = localDate2 != null ? DateExtensionsKt.isSameDay(localDate2, localDate) : false;
            LocalDate localDate3 = this.selectedReturnDate;
            boolean isSameDay2 = localDate3 != null ? DateExtensionsKt.isSameDay(localDate3, localDate) : false;
            LocalDate localDate4 = this.firstAvailableDate;
            LocalDate lastAvailableDate = this.lastAvailableDate;
            Intrinsics.checkNotNullExpressionValue(lastAvailableDate, "lastAvailableDate");
            if (localDate.compareTo(lastAvailableDate) <= 0 && localDate.compareTo(localDate4) >= 0) {
                z11 = true;
            }
            if (!z11) {
                dayState = CalendarDayVO.DayState.DEFAULT;
            } else if (this.selectedDepartureDate == null) {
                dayState = CalendarDayVO.DayState.DEFAULT;
            } else if (isSameDay && this.daysRound > 0 && DateExtensionsKt.isSameDay(localDate, this.firstAvailableDate)) {
                dayState = CalendarDayVO.DayState.START_INTERVAL;
            } else {
                if (isSameDay && this.daysRound > 0) {
                    LocalDate lastAvailableDate2 = this.lastAvailableDate;
                    Intrinsics.checkNotNullExpressionValue(lastAvailableDate2, "lastAvailableDate");
                    if (DateExtensionsKt.isSameDay(localDate, lastAvailableDate2)) {
                        dayState = CalendarDayVO.DayState.END_INTERVAL;
                    }
                }
                if (isSameDay && this.daysRound > 0) {
                    dayState = CalendarDayVO.DayState.MEDIUM_INTERVAL;
                } else if (isSameDay && (this.isOneDaySelection || this.selectedReturnDate == null)) {
                    dayState = CalendarDayVO.DayState.SINGLE_SELECTION;
                } else if (isSameDay && isSameDay2) {
                    dayState = CalendarDayVO.DayState.MATCHED;
                } else if (isSameDay) {
                    dayState = CalendarDayVO.DayState.START_INTERVAL;
                } else if (this.selectedReturnDate == null && this.daysRound == 0) {
                    dayState = CalendarDayVO.DayState.DEFAULT;
                } else {
                    if (isSameDay2 && this.daysRound > 0) {
                        LocalDate lastAvailableDate3 = this.lastAvailableDate;
                        Intrinsics.checkNotNullExpressionValue(lastAvailableDate3, "lastAvailableDate");
                        if (DateExtensionsKt.isSameDay(localDate, lastAvailableDate3)) {
                            dayState = CalendarDayVO.DayState.END_INTERVAL;
                        }
                    }
                    if (isSameDay2 && this.daysRound > 0) {
                        dayState = CalendarDayVO.DayState.MEDIUM_INTERVAL;
                    } else if (isSameDay2) {
                        dayState = CalendarDayVO.DayState.END_INTERVAL;
                    } else {
                        int i11 = this.daysRound;
                        if (i11 > 0) {
                            LocalDate u11 = this.selectedDepartureDate.u(i11);
                            if (DateExtensionsKt.isSameDay(u11, localDate) || (u11.compareTo(this.firstAvailableDate) < 0 && DateExtensionsKt.isSameDay(localDate, this.firstAvailableDate))) {
                                dayState = CalendarDayVO.DayState.START_PART;
                            }
                        }
                        int i12 = this.daysRound;
                        if (i12 > 0 && this.selectedReturnDate == null) {
                            LocalDate C11 = this.selectedDepartureDate.C(i12);
                            if (!DateExtensionsKt.isSameDay(C11, localDate)) {
                                if (C11.compareTo(this.lastAvailableDate) > 0) {
                                    LocalDate lastAvailableDate4 = this.lastAvailableDate;
                                    Intrinsics.checkNotNullExpressionValue(lastAvailableDate4, "lastAvailableDate");
                                }
                            }
                            dayState = CalendarDayVO.DayState.END_PART;
                        }
                        int i13 = this.daysRound;
                        if (i13 > 0) {
                            LocalDate u12 = this.selectedDepartureDate.u(i13 - 1);
                            if (localDate.compareTo(this.selectedDepartureDate) <= 0 && localDate.compareTo(u12) >= 0) {
                                dayState = CalendarDayVO.DayState.PART;
                            }
                        }
                        int i14 = this.daysRound;
                        if (i14 > 0 && this.selectedReturnDate == null) {
                            LocalDate localDate5 = this.selectedDepartureDate;
                            LocalDate C12 = localDate5.C(i14);
                            Intrinsics.checkNotNullExpressionValue(C12, "plusDays(...)");
                            if (localDate.compareTo(C12) <= 0 && localDate.compareTo(localDate5) >= 0) {
                                dayState = CalendarDayVO.DayState.PART;
                            }
                        }
                        LocalDate localDate6 = this.selectedReturnDate;
                        if (localDate6 == null) {
                            dayState = CalendarDayVO.DayState.DEFAULT;
                        } else {
                            int i15 = this.daysRound;
                            if (i15 > 0) {
                                LocalDate C13 = localDate6.C(i15);
                                if (!DateExtensionsKt.isSameDay(C13, localDate)) {
                                    if (C13.compareTo(this.lastAvailableDate) > 0) {
                                        LocalDate lastAvailableDate5 = this.lastAvailableDate;
                                        Intrinsics.checkNotNullExpressionValue(lastAvailableDate5, "lastAvailableDate");
                                    }
                                }
                                dayState = CalendarDayVO.DayState.END_PART;
                            }
                            LocalDate localDate7 = this.selectedDepartureDate;
                            LocalDate C14 = this.selectedReturnDate.C(this.daysRound);
                            Intrinsics.checkNotNullExpressionValue(C14, "plusDays(...)");
                            dayState = (localDate.compareTo(C14) > 0 || localDate.compareTo(localDate7) < 0) ? CalendarDayVO.DayState.DEFAULT : CalendarDayVO.DayState.PART;
                        }
                    }
                }
            }
            arrayList.add(new CalendarDayVO(z11, dayState, String.valueOf(localDate.i()), localDate, DateExtensionsKt.isSameDay(localDate, this.firstAvailableDate), DateExtensionsKt.isWeekend(localDate)));
            localDate = localDate.C(1);
            if (localDate.n() != currentMonth || DateExtensionsKt.isMonday(localDate)) {
                break;
            }
        } while (localDate.compareTo(endDateWithPadding) < 0);
        return new Pair<>(localDate, arrayList);
    }

    private final Pair<LocalDate, List<CalendarItemVO>> generateMonth(LocalDate currentDate, int currentMonth, int currentYear, LocalDate endDateWithPadding) {
        ArrayList arrayList = new ArrayList();
        while (currentDate.n() == currentMonth && currentDate.compareTo(endDateWithPadding) < 0) {
            String str = currentYear + "#" + currentDate.p();
            Pair<LocalDate, List<CalendarDayVO>> generateWeek = generateWeek(currentDate, endDateWithPadding);
            LocalDate a11 = generateWeek.a();
            arrayList.add(new CalendarItemVO.CalendarMonthWeekVO(str, generateWeek.b()));
            currentDate = a11;
        }
        arrayList.add(0, new CalendarItemVO.CalendarMonthTitleVO(C4598rp.c(currentYear, this.monthNames[currentMonth - 1], " ")));
        return new Pair<>(currentDate, arrayList);
    }

    private final Pair<LocalDate, List<CalendarDayVO>> generateWeek(LocalDate currentDate, LocalDate endDateWithPadding) {
        ArrayList arrayList = new ArrayList();
        if (!DateExtensionsKt.isMonday(currentDate)) {
            int j11 = currentDate.j() - 1;
            for (int i11 = 0; i11 < j11; i11++) {
                arrayList.add(CalendarDayVO.INSTANCE.newEmptyDay());
            }
        }
        Pair<LocalDate, List<CalendarDayVO>> generateDays = generateDays(currentDate, currentDate.n(), endDateWithPadding);
        LocalDate a11 = generateDays.a();
        arrayList.addAll(generateDays.b());
        if (!DateExtensionsKt.isMonday(a11)) {
            int j12 = 8 - a11.j();
            for (int i12 = 0; i12 < j12; i12++) {
                arrayList.add(CalendarDayVO.INSTANCE.newEmptyDay());
            }
        }
        return new Pair<>(a11, arrayList);
    }

    @NotNull
    public final List<CalendarItemVO> build() {
        LocalDate calculateStartDatePadding = calculateStartDatePadding();
        LocalDate calculateEndDatePadding = calculateEndDatePadding();
        ArrayList arrayList = new ArrayList();
        while (calculateStartDatePadding.compareTo(calculateEndDatePadding) < 0) {
            Pair<LocalDate, List<CalendarItemVO>> generateMonth = generateMonth(calculateStartDatePadding, calculateStartDatePadding.n(), calculateStartDatePadding.s(), calculateEndDatePadding);
            LocalDate a11 = generateMonth.a();
            arrayList.addAll(generateMonth.b());
            calculateStartDatePadding = a11;
        }
        return arrayList;
    }
}
