package ru.ozon.app.android.travel.calendar.extensions;

import Sc.o;
import android.content.Context;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.calendar.R$array;
import ru.ozon.app.android.travel.calendar.view.data.CalendarBuilder;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarDayVO;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.app.android.travel.calendar.view.vo.DateConfigVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.calendar.view.vo.IndicatorColor;
import ru.ozon.app.android.travel.calendar.view.vo.TripMode;
import ru.ozon.app.android.travel.molecules.dto.calendar.CalendarDTO;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;
import ru.ozon.app.android.travel.utils.PriceFormatter;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u008a\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016\u001a\u0012\u0010\u0018\u001a\u00020\u0012*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001aB\u0010\u0018\u001a\u00020\u001c*\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016\u001a'\u0010 \u001a\u0004\u0018\u00010\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010#\u001a\f\u0010$\u001a\u00020%*\u00020&H\u0002\u001a\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)0(H\u0002¨\u0006*"}, d2 = {"mapCalendarAsWeekItems", "", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "context", "Landroid/content/Context;", "tripKind", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripMode", "Lru/ozon/app/android/travel/calendar/view/vo/TripMode;", "thereDate", "Lorg/joda/time/LocalDate;", "backDate", "startShownDate", "endShownDate", "startAvailableDate", "endAvailableDate", "datesConfigs", "", "Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "countDayRound", "", "isWeekendsSupported", "", "isIndicatorsSupported", "toVO", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$DateItemDTO;", "priceFormatter", "Lru/ozon/app/android/travel/utils/PriceFormatter;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO;", "isInitialMapping", "isSelectingReturnDate", "calculateScrollPosition", "items", "preScrollDate", "(Ljava/util/List;Lorg/joda/time/LocalDate;)Ljava/lang/Integer;", "toColorIndicator", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/molecules/dto/calendar/CalendarDTO$PriceCategory;", "provideDefaultIndicatorsColors", "Ljava/util/EnumMap;", "Lru/ozon/app/android/travel/calendar/view/vo/IndicatorColor;", "calendar_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarExtensionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CalendarDTO.PriceCategory.values().length];
            try {
                iArr[CalendarDTO.PriceCategory.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarDTO.PriceCategory.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarDTO.PriceCategory.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Integer calculateScrollPosition(List<? extends CalendarRowItemVO> list, LocalDate localDate) {
        CalendarDayVO calendarDayVO;
        ListIterator<? extends CalendarRowItemVO> listIterator = list.listIterator();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (num == null && listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            CalendarRowItemVO next = listIterator.next();
            if (next instanceof CalendarRowItemVO.CalendarMonthTitleVO) {
                num3 = Integer.valueOf(nextIndex);
            }
            if (num2 == null && localDate != null && (next instanceof CalendarRowItemVO.CalendarMonthWeekVO)) {
                List<CalendarDayVO> days = ((CalendarRowItemVO.CalendarMonthWeekVO) next).getDays();
                ListIterator<CalendarDayVO> listIterator2 = days.listIterator(days.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        calendarDayVO = null;
                        break;
                    }
                    calendarDayVO = listIterator2.previous();
                    if (calendarDayVO.getDate() != null) {
                        break;
                    }
                }
                CalendarDayVO calendarDayVO2 = calendarDayVO;
                LocalDate date = calendarDayVO2 != null ? calendarDayVO2.getDate() : null;
                if (date != null && date.compareTo(localDate) >= 0) {
                    num2 = num3;
                }
            }
            if (next instanceof CalendarRowItemVO.CalendarMonthWeekVO) {
                List<CalendarDayVO> days2 = ((CalendarRowItemVO.CalendarMonthWeekVO) next).getDays();
                if (!(days2 instanceof Collection) || !days2.isEmpty()) {
                    Iterator<T> it = days2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((CalendarDayVO) it.next()).getState() instanceof CalendarDayVO.SelectedDayState) {
                            num = num3;
                            break;
                        }
                    }
                }
            }
        }
        return num == null ? num2 : num;
    }

    @NotNull
    public static final List<CalendarRowItemVO> mapCalendarAsWeekItems(@NotNull Context context, @NotNull TripKind tripKind, @NotNull TripMode tripMode, LocalDate localDate, LocalDate localDate2, @NotNull LocalDate startShownDate, @NotNull LocalDate endShownDate, LocalDate localDate3, LocalDate localDate4, Map<LocalDate, DateConfigVO> map, int i11, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        Intrinsics.checkNotNullParameter(startShownDate, "startShownDate");
        Intrinsics.checkNotNullParameter(endShownDate, "endShownDate");
        String[] stringArray = context.getResources().getStringArray(R$array.calendar_month_names);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return new CalendarBuilder(tripKind, stringArray, localDate3 == null ? new LocalDate() : localDate3, localDate4 == null ? endShownDate : localDate4, startShownDate, endShownDate, localDate, localDate2, tripMode == TripMode.THERE, map, i11, z11, z12).build();
    }

    private static final EnumMap<Indicator.ColorIndicator, IndicatorColor> provideDefaultIndicatorsColors() {
        EnumMap<Indicator.ColorIndicator, IndicatorColor> enumMap = new EnumMap<>((Class<Indicator.ColorIndicator>) Indicator.ColorIndicator.class);
        enumMap.put((EnumMap<Indicator.ColorIndicator, IndicatorColor>) Indicator.ColorIndicator.LOW, (Indicator.ColorIndicator) new IndicatorColor(UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken(), null, 2, null));
        enumMap.put((EnumMap<Indicator.ColorIndicator, IndicatorColor>) Indicator.ColorIndicator.MEDIUM, (Indicator.ColorIndicator) new IndicatorColor(UniColors.GRAPHIC_DARKER_NEUTRAL_ON_LIGHT.getToken(), null, 2, null));
        enumMap.put((EnumMap<Indicator.ColorIndicator, IndicatorColor>) Indicator.ColorIndicator.HIGH, (Indicator.ColorIndicator) new IndicatorColor(UniColors.TEXT_NEGATIVE.getToken(), null, 2, null));
        return enumMap;
    }

    private static final Indicator.ColorIndicator toColorIndicator(CalendarDTO.PriceCategory priceCategory) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[priceCategory.ordinal()];
        if (i11 == 1) {
            return Indicator.ColorIndicator.LOW;
        }
        if (i11 == 2) {
            return Indicator.ColorIndicator.MEDIUM;
        }
        if (i11 == 3) {
            return Indicator.ColorIndicator.HIGH;
        }
        throw new o();
    }

    @NotNull
    public static final DateConfigVO toVO(@NotNull CalendarDTO.DateItemDTO dateItemDTO, @NotNull PriceFormatter priceFormatter) {
        TextDTO text;
        Intrinsics.checkNotNullParameter(dateItemDTO, "<this>");
        Intrinsics.checkNotNullParameter(priceFormatter, "priceFormatter");
        Indicator indicator = null;
        if (dateItemDTO.getPrice() != null) {
            Float price = dateItemDTO.getPrice();
            if (price != null) {
                float floatValue = price.floatValue();
                boolean d11 = Intrinsics.d(dateItemDTO.isMin(), Boolean.TRUE);
                indicator = new Indicator.PriceIndicator(new TextDTO(OzonSpannableStringKt.toOzonSpannableString(PriceFormatter.formatF$default(priceFormatter, Float.valueOf(floatValue), null, null, false, 6, null)), TextDTO.TextAlignment.CENTER, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_200_X_SMALL.getToken(), (d11 ? UniColors.TEXT_POSITIVE : UniColors.TEXT_SECONDARY).getToken(), null, null, null, null, false, null, null, null, null, 1, 261692, null), floatValue, d11);
            }
        } else if (dateItemDTO.getPriceCategory() != null) {
            CalendarDTO.PriceCategory priceCategory = dateItemDTO.getPriceCategory();
            if (priceCategory != null) {
                indicator = toColorIndicator(priceCategory);
            }
        } else if (dateItemDTO.getText() != null && (text = dateItemDTO.getText()) != null) {
            indicator = new Indicator.TextIndicator(text);
        }
        return new DateConfigVO(Intrinsics.d(dateItemDTO.isDisabled(), Boolean.TRUE), indicator, dateItemDTO.isWorkday());
    }

    @NotNull
    public static final CalendarVO toVO(@NotNull CalendarDTO calendarDTO, @NotNull Context context, @NotNull TripKind tripKind, @NotNull TripMode tripMode, boolean z11, boolean z12, boolean z13) {
        LinkedHashMap linkedHashMap;
        LocalDate localDate;
        Intrinsics.checkNotNullParameter(calendarDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tripKind, "tripKind");
        Intrinsics.checkNotNullParameter(tripMode, "tripMode");
        b b11 = a.b("yyyy-MM-dd");
        String startShownDate = calendarDTO.getStartShownDate();
        int i11 = LocalDate.f79031c;
        LocalDate e11 = b11.e(startShownDate);
        LocalDate e12 = b11.e(calendarDTO.getEndShownDate());
        LocalDate e13 = calendarDTO.getMinAvailableDate() != null ? b11.e(calendarDTO.getMinAvailableDate()) : null;
        LocalDate e14 = calendarDTO.getMaxAvailableDate() != null ? b11.e(calendarDTO.getMaxAvailableDate()) : null;
        LocalDate e15 = calendarDTO.getStartSelectedDate() != null ? b11.e(calendarDTO.getStartSelectedDate()) : null;
        LocalDate e16 = calendarDTO.getEndSelectedDate() != null ? b11.e(calendarDTO.getEndSelectedDate()) : null;
        PriceFormatter priceFormatter = new PriceFormatter();
        List<CalendarDTO.DateItemDTO> dateItems = calendarDTO.getDateItems();
        if (dateItems != null) {
            List<CalendarDTO.DateItemDTO> list = dateItems;
            int h11 = U.h(C7714v.z(list, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
            for (CalendarDTO.DateItemDTO dateItemDTO : list) {
                Pair pair = new Pair(b11.e(dateItemDTO.getDate()), toVO(dateItemDTO, priceFormatter));
                linkedHashMap2.put(pair.e(), pair.f());
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        boolean z14 = false;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((DateConfigVO) ((Map.Entry) it.next()).getValue()).getIndicator() != null) {
                    z14 = true;
                    break;
                }
            }
        }
        boolean z15 = z14;
        LocalDate e17 = calendarDTO.getPreScrollDate() != null ? b11.e(calendarDTO.getPreScrollDate()) : e13;
        List<CalendarRowItemVO> mapCalendarAsWeekItems = mapCalendarAsWeekItems(context, tripKind, tripMode, e15, e16, e11, e12, e13, e14, linkedHashMap, calendarDTO.getCountDayRound(), z13, z15);
        Integer calculateScrollPosition = z11 ? calculateScrollPosition(mapCalendarAsWeekItems, e17) : null;
        LocalDate e18 = calendarDTO.getStartSelectedDate() != null ? b11.e(calendarDTO.getStartSelectedDate()) : null;
        LocalDate e19 = calendarDTO.getEndSelectedDate() != null ? b11.e(calendarDTO.getEndSelectedDate()) : null;
        Map<String, TokenizedTrackingInfo> dateTrackingInfo = calendarDTO.getDateTrackingInfo();
        int countDayRound = calendarDTO.getCountDayRound();
        EnumMap<Indicator.ColorIndicator, IndicatorColor> provideDefaultIndicatorsColors = provideDefaultIndicatorsColors();
        List<CalendarDTO.PriceCategoryColorDTO> priceCategoryColors = calendarDTO.getPriceCategoryColors();
        if (priceCategoryColors != null) {
            for (CalendarDTO.PriceCategoryColorDTO priceCategoryColorDTO : priceCategoryColors) {
                CalendarDTO.PriceCategory priceCategory = priceCategoryColorDTO.getPriceCategory();
                Indicator.ColorIndicator colorIndicator = priceCategory != null ? toColorIndicator(priceCategory) : null;
                if (colorIndicator != null) {
                    localDate = e19;
                    provideDefaultIndicatorsColors.put((EnumMap<Indicator.ColorIndicator, IndicatorColor>) colorIndicator, (Indicator.ColorIndicator) new IndicatorColor(priceCategoryColorDTO.getColor(), priceCategoryColorDTO.getSelectedColor()));
                } else {
                    localDate = e19;
                }
                e19 = localDate;
            }
        }
        return new CalendarVO(tripMode, tripKind, calculateScrollPosition, e11, e12, e13, e14, e18, e19, mapCalendarAsWeekItems, linkedHashMap, z12, dateTrackingInfo, countDayRound, provideDefaultIndicatorsColors, z13, z15);
    }
}
