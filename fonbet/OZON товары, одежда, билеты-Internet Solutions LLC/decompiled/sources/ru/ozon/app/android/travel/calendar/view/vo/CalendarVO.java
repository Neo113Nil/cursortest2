package ru.ozon.app.android.travel.calendar.view.vo;

import B0.C2454a;
import D40.c;
import G.g;
import Kk.C3532b;
import Pk0.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b \u0010!Jò\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b8\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b9\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b:\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b;\u00106R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\b\u0016\u0010CR%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\bD\u0010AR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010'R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00128\u0006¢\u0006\f\n\u0004\b\u001d\u0010?\u001a\u0004\bG\u0010AR\u0017\u0010\u001e\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010B\u001a\u0004\b\u001e\u0010CR\u0017\u0010\u001f\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010B\u001a\u0004\b\u001f\u0010C¨\u0006H"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "", "Lru/ozon/app/android/travel/calendar/view/vo/TripMode;", "tripMode", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripKind", "", "scrollPosition", "Lorg/joda/time/LocalDate;", "startShownDate", "endShownDate", "minAvailableDate", "maxAvailableDate", "startSelectedDate", "endSelectedDate", "", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "calendarItems", "", "Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "datesConfigs", "", "isSelectingReturnDate", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "dateTrackingInfo", "countDayRound", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/IndicatorColor;", "indicatorsColors", "isWeekendsSupported", "isIndicatorsSupported", "<init>", "(Lru/ozon/app/android/travel/calendar/view/vo/TripMode;Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Ljava/lang/Integer;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/Map;ZLjava/util/Map;ILjava/util/Map;ZZ)V", "copy", "(Lru/ozon/app/android/travel/calendar/view/vo/TripMode;Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Ljava/lang/Integer;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/Map;ZLjava/util/Map;ILjava/util/Map;ZZ)Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/calendar/view/vo/TripMode;", "getTripMode", "()Lru/ozon/app/android/travel/calendar/view/vo/TripMode;", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "getTripKind", "()Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "Ljava/lang/Integer;", "getScrollPosition", "()Ljava/lang/Integer;", "Lorg/joda/time/LocalDate;", "getStartShownDate", "()Lorg/joda/time/LocalDate;", "getEndShownDate", "getMinAvailableDate", "getMaxAvailableDate", "getStartSelectedDate", "getEndSelectedDate", "Ljava/util/List;", "getCalendarItems", "()Ljava/util/List;", "Ljava/util/Map;", "getDatesConfigs", "()Ljava/util/Map;", "Z", "()Z", "getDateTrackingInfo", "I", "getCountDayRound", "getIndicatorsColors", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CalendarVO {

    @NotNull
    private final List<CalendarRowItemVO> calendarItems;
    private final int countDayRound;
    private final Map<String, TokenizedTrackingInfo> dateTrackingInfo;
    private final Map<LocalDate, DateConfigVO> datesConfigs;
    private final LocalDate endSelectedDate;

    @NotNull
    private final LocalDate endShownDate;

    @NotNull
    private final Map<Indicator.ColorIndicator, IndicatorColor> indicatorsColors;
    private final boolean isIndicatorsSupported;
    private final boolean isSelectingReturnDate;
    private final boolean isWeekendsSupported;
    private final LocalDate maxAvailableDate;
    private final LocalDate minAvailableDate;
    private final Integer scrollPosition;
    private final LocalDate startSelectedDate;

    @NotNull
    private final LocalDate startShownDate;

    @NotNull
    private final TripKind tripKind;

    @NotNull
    private final TripMode tripMode;

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarVO(@NotNull TripMode tripMode, @NotNull TripKind tripKind, Integer num, @NotNull LocalDate startShownDate, @NotNull LocalDate endShownDate, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, @NotNull List<? extends CalendarRowItemVO> calendarItems, Map<LocalDate, DateConfigVO> map, boolean z11, Map<String, TokenizedTrackingInfo> map2, int i11, @NotNull Map<Indicator.ColorIndicator, IndicatorColor> indicatorsColors, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(startShownDate, "startShownDate");
        Intrinsics.checkNotNullParameter(endShownDate, "endShownDate");
        Intrinsics.checkNotNullParameter(calendarItems, "calendarItems");
        Intrinsics.checkNotNullParameter(indicatorsColors, "indicatorsColors");
        this.tripMode = tripMode;
        this.tripKind = tripKind;
        this.scrollPosition = num;
        this.startShownDate = startShownDate;
        this.endShownDate = endShownDate;
        this.minAvailableDate = localDate;
        this.maxAvailableDate = localDate2;
        this.startSelectedDate = localDate3;
        this.endSelectedDate = localDate4;
        this.calendarItems = calendarItems;
        this.datesConfigs = map;
        this.isSelectingReturnDate = z11;
        this.dateTrackingInfo = map2;
        this.countDayRound = i11;
        this.indicatorsColors = indicatorsColors;
        this.isWeekendsSupported = z12;
        this.isIndicatorsSupported = z13;
    }

    public static /* synthetic */ CalendarVO copy$default(CalendarVO calendarVO, TripMode tripMode, TripKind tripKind, Integer num, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, LocalDate localDate5, LocalDate localDate6, List list, Map map, boolean z11, Map map2, int i11, Map map3, boolean z12, boolean z13, int i12, Object obj) {
        boolean z14;
        boolean z15;
        TripMode tripMode2;
        CalendarVO calendarVO2;
        Map map4;
        TripKind tripKind2;
        Integer num2;
        LocalDate localDate7;
        LocalDate localDate8;
        LocalDate localDate9;
        LocalDate localDate10;
        LocalDate localDate11;
        LocalDate localDate12;
        List list2;
        Map map5;
        boolean z16;
        Map map6;
        int i13;
        TripMode tripMode3 = (i12 & 1) != 0 ? calendarVO.tripMode : tripMode;
        TripKind tripKind3 = (i12 & 2) != 0 ? calendarVO.tripKind : tripKind;
        Integer num3 = (i12 & 4) != 0 ? calendarVO.scrollPosition : num;
        LocalDate localDate13 = (i12 & 8) != 0 ? calendarVO.startShownDate : localDate;
        LocalDate localDate14 = (i12 & 16) != 0 ? calendarVO.endShownDate : localDate2;
        LocalDate localDate15 = (i12 & 32) != 0 ? calendarVO.minAvailableDate : localDate3;
        LocalDate localDate16 = (i12 & 64) != 0 ? calendarVO.maxAvailableDate : localDate4;
        LocalDate localDate17 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? calendarVO.startSelectedDate : localDate5;
        LocalDate localDate18 = (i12 & 256) != 0 ? calendarVO.endSelectedDate : localDate6;
        List list3 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? calendarVO.calendarItems : list;
        Map map7 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? calendarVO.datesConfigs : map;
        boolean z17 = (i12 & 2048) != 0 ? calendarVO.isSelectingReturnDate : z11;
        Map map8 = (i12 & 4096) != 0 ? calendarVO.dateTrackingInfo : map2;
        int i14 = (i12 & 8192) != 0 ? calendarVO.countDayRound : i11;
        TripMode tripMode4 = tripMode3;
        Map map9 = (i12 & 16384) != 0 ? calendarVO.indicatorsColors : map3;
        boolean z18 = (i12 & 32768) != 0 ? calendarVO.isWeekendsSupported : z12;
        if ((i12 & 65536) != 0) {
            z15 = z18;
            z14 = calendarVO.isIndicatorsSupported;
            map4 = map9;
            tripKind2 = tripKind3;
            num2 = num3;
            localDate7 = localDate13;
            localDate8 = localDate14;
            localDate9 = localDate15;
            localDate10 = localDate16;
            localDate11 = localDate17;
            localDate12 = localDate18;
            list2 = list3;
            map5 = map7;
            z16 = z17;
            map6 = map8;
            i13 = i14;
            tripMode2 = tripMode4;
            calendarVO2 = calendarVO;
        } else {
            z14 = z13;
            z15 = z18;
            tripMode2 = tripMode4;
            calendarVO2 = calendarVO;
            map4 = map9;
            tripKind2 = tripKind3;
            num2 = num3;
            localDate7 = localDate13;
            localDate8 = localDate14;
            localDate9 = localDate15;
            localDate10 = localDate16;
            localDate11 = localDate17;
            localDate12 = localDate18;
            list2 = list3;
            map5 = map7;
            z16 = z17;
            map6 = map8;
            i13 = i14;
        }
        return calendarVO2.copy(tripMode2, tripKind2, num2, localDate7, localDate8, localDate9, localDate10, localDate11, localDate12, list2, map5, z16, map6, i13, map4, z15, z14);
    }

    @NotNull
    public final CalendarVO copy(@NotNull TripMode tripMode, @NotNull TripKind tripKind, Integer scrollPosition, @NotNull LocalDate startShownDate, @NotNull LocalDate endShownDate, LocalDate minAvailableDate, LocalDate maxAvailableDate, LocalDate startSelectedDate, LocalDate endSelectedDate, @NotNull List<? extends CalendarRowItemVO> calendarItems, Map<LocalDate, DateConfigVO> datesConfigs, boolean isSelectingReturnDate, Map<String, TokenizedTrackingInfo> dateTrackingInfo, int countDayRound, @NotNull Map<Indicator.ColorIndicator, IndicatorColor> indicatorsColors, boolean isWeekendsSupported, boolean isIndicatorsSupported) {
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(startShownDate, "startShownDate");
        Intrinsics.checkNotNullParameter(endShownDate, "endShownDate");
        Intrinsics.checkNotNullParameter(calendarItems, "calendarItems");
        Intrinsics.checkNotNullParameter(indicatorsColors, "indicatorsColors");
        return new CalendarVO(tripMode, tripKind, scrollPosition, startShownDate, endShownDate, minAvailableDate, maxAvailableDate, startSelectedDate, endSelectedDate, calendarItems, datesConfigs, isSelectingReturnDate, dateTrackingInfo, countDayRound, indicatorsColors, isWeekendsSupported, isIndicatorsSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarVO)) {
            return false;
        }
        CalendarVO calendarVO = (CalendarVO) other;
        return this.tripMode == calendarVO.tripMode && this.tripKind == calendarVO.tripKind && Intrinsics.d(this.scrollPosition, calendarVO.scrollPosition) && Intrinsics.d(this.startShownDate, calendarVO.startShownDate) && Intrinsics.d(this.endShownDate, calendarVO.endShownDate) && Intrinsics.d(this.minAvailableDate, calendarVO.minAvailableDate) && Intrinsics.d(this.maxAvailableDate, calendarVO.maxAvailableDate) && Intrinsics.d(this.startSelectedDate, calendarVO.startSelectedDate) && Intrinsics.d(this.endSelectedDate, calendarVO.endSelectedDate) && Intrinsics.d(this.calendarItems, calendarVO.calendarItems) && Intrinsics.d(this.datesConfigs, calendarVO.datesConfigs) && this.isSelectingReturnDate == calendarVO.isSelectingReturnDate && Intrinsics.d(this.dateTrackingInfo, calendarVO.dateTrackingInfo) && this.countDayRound == calendarVO.countDayRound && Intrinsics.d(this.indicatorsColors, calendarVO.indicatorsColors) && this.isWeekendsSupported == calendarVO.isWeekendsSupported && this.isIndicatorsSupported == calendarVO.isIndicatorsSupported;
    }

    @NotNull
    public final List<CalendarRowItemVO> getCalendarItems() {
        return this.calendarItems;
    }

    public final int getCountDayRound() {
        return this.countDayRound;
    }

    public final Map<String, TokenizedTrackingInfo> getDateTrackingInfo() {
        return this.dateTrackingInfo;
    }

    public final Map<LocalDate, DateConfigVO> getDatesConfigs() {
        return this.datesConfigs;
    }

    public final LocalDate getEndSelectedDate() {
        return this.endSelectedDate;
    }

    @NotNull
    public final LocalDate getEndShownDate() {
        return this.endShownDate;
    }

    @NotNull
    public final Map<Indicator.ColorIndicator, IndicatorColor> getIndicatorsColors() {
        return this.indicatorsColors;
    }

    public final LocalDate getMaxAvailableDate() {
        return this.maxAvailableDate;
    }

    public final LocalDate getMinAvailableDate() {
        return this.minAvailableDate;
    }

    public final Integer getScrollPosition() {
        return this.scrollPosition;
    }

    public final LocalDate getStartSelectedDate() {
        return this.startSelectedDate;
    }

    @NotNull
    public final LocalDate getStartShownDate() {
        return this.startShownDate;
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
        int hashCode = (this.tripKind.hashCode() + (this.tripMode.hashCode() * 31)) * 31;
        Integer num = this.scrollPosition;
        int hashCode2 = (this.endShownDate.hashCode() + ((this.startShownDate.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        LocalDate localDate = this.minAvailableDate;
        int hashCode3 = (hashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.maxAvailableDate;
        int hashCode4 = (hashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.startSelectedDate;
        int hashCode5 = (hashCode4 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.endSelectedDate;
        int b11 = g.b((hashCode5 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31, 31, this.calendarItems);
        Map<LocalDate, DateConfigVO> map = this.datesConfigs;
        int a11 = C3532b.a((b11 + (map == null ? 0 : map.hashCode())) * 31, 31, this.isSelectingReturnDate);
        Map<String, TokenizedTrackingInfo> map2 = this.dateTrackingInfo;
        return Boolean.hashCode(this.isIndicatorsSupported) + C3532b.a(c.a(this.indicatorsColors, C2454a.a(this.countDayRound, (a11 + (map2 != null ? map2.hashCode() : 0)) * 31, 31), 31), 31, this.isWeekendsSupported);
    }

    /* renamed from: isIndicatorsSupported, reason: from getter */
    public final boolean getIsIndicatorsSupported() {
        return this.isIndicatorsSupported;
    }

    /* renamed from: isSelectingReturnDate, reason: from getter */
    public final boolean getIsSelectingReturnDate() {
        return this.isSelectingReturnDate;
    }

    /* renamed from: isWeekendsSupported, reason: from getter */
    public final boolean getIsWeekendsSupported() {
        return this.isWeekendsSupported;
    }

    @NotNull
    public String toString() {
        TripMode tripMode = this.tripMode;
        TripKind tripKind = this.tripKind;
        Integer num = this.scrollPosition;
        LocalDate localDate = this.startShownDate;
        LocalDate localDate2 = this.endShownDate;
        LocalDate localDate3 = this.minAvailableDate;
        LocalDate localDate4 = this.maxAvailableDate;
        LocalDate localDate5 = this.startSelectedDate;
        LocalDate localDate6 = this.endSelectedDate;
        List<CalendarRowItemVO> list = this.calendarItems;
        Map<LocalDate, DateConfigVO> map = this.datesConfigs;
        boolean z11 = this.isSelectingReturnDate;
        Map<String, TokenizedTrackingInfo> map2 = this.dateTrackingInfo;
        int i11 = this.countDayRound;
        Map<Indicator.ColorIndicator, IndicatorColor> map3 = this.indicatorsColors;
        boolean z12 = this.isWeekendsSupported;
        boolean z13 = this.isIndicatorsSupported;
        StringBuilder sb2 = new StringBuilder("CalendarVO(tripMode=");
        sb2.append(tripMode);
        sb2.append(", tripKind=");
        sb2.append(tripKind);
        sb2.append(", scrollPosition=");
        sb2.append(num);
        sb2.append(", startShownDate=");
        sb2.append(localDate);
        sb2.append(", endShownDate=");
        sb2.append(localDate2);
        sb2.append(", minAvailableDate=");
        sb2.append(localDate3);
        sb2.append(", maxAvailableDate=");
        sb2.append(localDate4);
        sb2.append(", startSelectedDate=");
        sb2.append(localDate5);
        sb2.append(", endSelectedDate=");
        sb2.append(localDate6);
        sb2.append(", calendarItems=");
        sb2.append(list);
        sb2.append(", datesConfigs=");
        sb2.append(map);
        sb2.append(", isSelectingReturnDate=");
        sb2.append(z11);
        sb2.append(", dateTrackingInfo=");
        sb2.append(map2);
        sb2.append(", countDayRound=");
        sb2.append(i11);
        sb2.append(", indicatorsColors=");
        sb2.append(map3);
        sb2.append(", isWeekendsSupported=");
        sb2.append(z12);
        sb2.append(", isIndicatorsSupported=");
        return a.a(")", sb2, z13);
    }
}
