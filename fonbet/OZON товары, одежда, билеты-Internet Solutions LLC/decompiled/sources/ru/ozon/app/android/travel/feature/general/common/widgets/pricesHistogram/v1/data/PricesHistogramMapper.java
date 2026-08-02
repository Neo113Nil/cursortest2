package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data.PricesHistogramDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001b\u001a\u00020\u0011*\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u0013\u0010\u001b\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b\u001b\u0010!J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020\u00022\n\u0010$\u001a\u00060\u0003j\u0002`#H\u0096\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO;", "months", "", "countOfEmptyDays", "", "widgetId", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "getListOfDayVO", "(Ljava/util/List;IJ)Ljava/util/List;", "currentIndexOfMonth", "month", "mapToListOfDaysVO", "(ILru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO;Ljava/util/List;IJ)Ljava/util/List;", "getListWithEmptyDays", "(I)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO;I)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;ILjava/util/List;IJ)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramMapper implements Function2<PricesHistogramDTO, d, List<? extends PricesHistogramVO>> {

    @NotNull
    private final Context context;

    public PricesHistogramMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<PricesHistogramVO.MonthVO.DayVO> getListOfDayVO(List<PricesHistogramDTO.MonthDTO> months, int countOfEmptyDays, long widgetId) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getListWithEmptyDays(countOfEmptyDays));
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj : months) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            C7714v.p(mapToListOfDaysVO(i11, (PricesHistogramDTO.MonthDTO) obj, months, countOfEmptyDays, widgetId), arrayList2);
            i11 = i12;
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(getListWithEmptyDays(countOfEmptyDays));
        return arrayList;
    }

    private final List<PricesHistogramVO.MonthVO.DayVO> getListWithEmptyDays(int countOfEmptyDays) {
        ArrayList arrayList = new ArrayList();
        TextAtom textAtom = new TextAtom(new OzonSpannableString(), null, null, null, null, null, null, 126, null);
        int i11 = 6;
        String str = "";
        String str2 = "";
        PricesHistogramVO.MonthVO.DayVO dayVO = new PricesHistogramVO.MonthVO.DayVO(i11, str, str2, new TextAtom(new OzonSpannableString(), null, null, null, null, null, null, 126, null), false, textAtom, 0, false, null, null, null, 1792, null);
        for (int i12 = 0; i12 < countOfEmptyDays; i12++) {
            arrayList.add(dayVO);
        }
        return arrayList;
    }

    private final List<PricesHistogramVO.MonthVO.DayVO> mapToListOfDaysVO(int currentIndexOfMonth, PricesHistogramDTO.MonthDTO month, List<PricesHistogramDTO.MonthDTO> months, int countOfEmptyDays, long widgetId) {
        List<PricesHistogramDTO.MonthDTO.DayDTO> days = month.getDays();
        ArrayList arrayList = new ArrayList(C7714v.z(days, 10));
        Iterator<T> it = days.iterator();
        while (it.hasNext()) {
            int i11 = currentIndexOfMonth;
            arrayList.add(toVO((PricesHistogramDTO.MonthDTO.DayDTO) it.next(), i11, months, countOfEmptyDays, widgetId));
            currentIndexOfMonth = i11;
        }
        return arrayList;
    }

    private final PricesHistogramVO.MonthVO toVO(PricesHistogramDTO.MonthDTO monthDTO, int i11) {
        return new PricesHistogramVO.MonthVO(monthDTO.getDays().size(), monthDTO.getTitle(), i11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PricesHistogramVO> invoke(@NotNull PricesHistogramDTO dto, @NotNull d widgetInfo) {
        Object obj;
        PricesHistogramDTO.MonthDTO.DayDTO dayDTO;
        ArrayList arrayList;
        Object obj2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int i11 = (int) (((displayMetrics.widthPixels / displayMetrics.density) / 26) / 2);
        List<PricesHistogramDTO.MonthDTO> monthsFrom = dto.getMonthsFrom();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = monthsFrom.iterator();
        while (it.hasNext()) {
            C7714v.p(((PricesHistogramDTO.MonthDTO) it.next()).getDays(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((PricesHistogramDTO.MonthDTO.DayDTO) obj).isSelected()) {
                break;
            }
        }
        PricesHistogramDTO.MonthDTO.DayDTO dayDTO2 = (PricesHistogramDTO.MonthDTO.DayDTO) obj;
        List<PricesHistogramDTO.MonthDTO> monthsTo = dto.getMonthsTo();
        if (monthsTo != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = monthsTo.iterator();
            while (it3.hasNext()) {
                C7714v.p(((PricesHistogramDTO.MonthDTO) it3.next()).getDays(), arrayList3);
            }
            Iterator it4 = arrayList3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                if (((PricesHistogramDTO.MonthDTO.DayDTO) obj2).isSelected()) {
                    break;
                }
            }
            dayDTO = (PricesHistogramDTO.MonthDTO.DayDTO) obj2;
        } else {
            dayDTO = null;
        }
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        TextAtom titleFrom = dto.getTitleFrom();
        TextAtom titleTo = dto.getTitleTo();
        ButtonV3Atom.SmallBorderlessButton cancelButton = dto.getCancelButton();
        List<PricesHistogramDTO.MonthDTO> monthsFrom2 = dto.getMonthsFrom();
        ArrayList arrayList4 = new ArrayList(C7714v.z(monthsFrom2, 10));
        Iterator<T> it5 = monthsFrom2.iterator();
        while (it5.hasNext()) {
            arrayList4.add(toVO((PricesHistogramDTO.MonthDTO) it5.next(), i11));
        }
        List<PricesHistogramDTO.MonthDTO> monthsTo2 = dto.getMonthsTo();
        if (monthsTo2 != null) {
            List<PricesHistogramDTO.MonthDTO> list = monthsTo2;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(toVO((PricesHistogramDTO.MonthDTO) it6.next(), i11));
            }
        } else {
            arrayList = null;
        }
        ButtonV3Atom.LargeButton findTicketsButton = dto.getFindTicketsButton();
        PricesHistogramVO.AvailableColorsVO vo = toVO(dto.getAvailableColors());
        String dateFrom = dto.getDateFrom();
        String dateTo = dto.getDateTo();
        TextAtom emptyHistogramMessage = dto.getEmptyHistogramMessage();
        TextAtom mediumPrice = dto.getMediumPrice();
        Integer medianHeight = dto.getMedianHeight();
        List<PricesHistogramVO.MonthVO.DayVO> listOfDayVO = getListOfDayVO(dto.getMonthsFrom(), i11, hashCode);
        List<PricesHistogramDTO.MonthDTO> monthsTo3 = dto.getMonthsTo();
        return C7714v.a0(new PricesHistogramVO(hashCode, title, titleFrom, titleTo, cancelButton, arrayList4, arrayList, findTicketsButton, vo, dateFrom, dateTo, emptyHistogramMessage, mediumPrice, medianHeight, listOfDayVO, monthsTo3 != null ? getListOfDayVO(monthsTo3, i11, hashCode) : null, dayDTO2 != null ? dayDTO2.getTitle() : null, dayDTO != null ? dayDTO.getTitle() : null, dayDTO2 != null ? dayDTO2.getPriceOrMessage() : null, dayDTO != null ? dayDTO.getPriceOrMessage() : null, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PricesHistogramVO.MonthVO.DayVO toVO(PricesHistogramDTO.MonthDTO.DayDTO dayDTO, int i11, List<PricesHistogramDTO.MonthDTO> list, int i12, long j11) {
        TextAtom title;
        TextAtom title2;
        TextAtom title3;
        TextAtom textAtom;
        int parseInt = Integer.parseInt(dayDTO.getNumber());
        int parseInt2 = Integer.parseInt(((PricesHistogramDTO.MonthDTO.DayDTO) C7714v.X(list.get(i11).getDays())).getNumber());
        int i13 = i12 - 3;
        if (parseInt <= i13 && i11 >= 1) {
            title = list.get(i11 - 1).getTitle();
            title2 = list.get(i11).getTitle();
        } else if (parseInt > parseInt2 - i13 && i11 < list.size() - 1) {
            title = list.get(i11).getTitle();
            title2 = list.get(i11 + 1).getTitle();
        } else {
            if (parseInt > i13 && parseInt <= i12) {
                textAtom = list.get(i11).getTitle();
                title3 = null;
            } else if (parseInt > parseInt2 - i12 && parseInt2 > 27) {
                title3 = list.get(i11).getTitle();
                textAtom = null;
            } else {
                title = list.get(i11).getTitle();
                title2 = list.get(i11).getTitle();
            }
            int dayHeight = dayDTO.getDayHeight();
            String number = dayDTO.getNumber();
            Boolean isLowest = dayDTO.isLowest();
            boolean booleanValue = isLowest == null ? isLowest.booleanValue() : false;
            String date = dayDTO.getDate();
            boolean isSelected = dayDTO.isSelected();
            int price = dayDTO.getPrice();
            TextAtom title4 = dayDTO.getTitle();
            TextAtom priceOrMessage = dayDTO.getPriceOrMessage();
            Map<String, TokenizedTrackingInfo> daySelectionTracking = dayDTO.getDaySelectionTracking();
            return new PricesHistogramVO.MonthVO.DayVO(dayHeight, number, date, title4, isSelected, priceOrMessage, price, booleanValue, title3, textAtom, daySelectionTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(daySelectionTracking, Long.valueOf(j11), null, 2, null) : null);
        }
        textAtom = title2;
        title3 = title;
        int dayHeight2 = dayDTO.getDayHeight();
        String number2 = dayDTO.getNumber();
        Boolean isLowest2 = dayDTO.isLowest();
        boolean booleanValue2 = isLowest2 == null ? isLowest2.booleanValue() : false;
        String date2 = dayDTO.getDate();
        boolean isSelected2 = dayDTO.isSelected();
        int price2 = dayDTO.getPrice();
        TextAtom title42 = dayDTO.getTitle();
        TextAtom priceOrMessage2 = dayDTO.getPriceOrMessage();
        Map<String, TokenizedTrackingInfo> daySelectionTracking2 = dayDTO.getDaySelectionTracking();
        return new PricesHistogramVO.MonthVO.DayVO(dayHeight2, number2, date2, title42, isSelected2, priceOrMessage2, price2, booleanValue2, title3, textAtom, daySelectionTracking2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(daySelectionTracking2, Long.valueOf(j11), null, 2, null) : null);
    }

    private final PricesHistogramVO.AvailableColorsVO toVO(PricesHistogramDTO.AvailableColorsDTO availableColorsDTO) {
        StyleParser styleParser = StyleParser.INSTANCE;
        return new PricesHistogramVO.AvailableColorsVO(styleParser.parseColor(this.context, availableColorsDTO.getSelected(), R$color.bg_accent_primary), styleParser.parseColor(this.context, availableColorsDTO.getDefault(), R$color.layer_floor_0), styleParser.parseColor(this.context, availableColorsDTO.getTextSelected(), R$color.bg_light_key), styleParser.parseColor(this.context, availableColorsDTO.getTextDefault(), R$color.text_originalprice_available), styleParser.parseColor(this.context, availableColorsDTO.getLowestPrice(), R$color.graphic_positive_primary));
    }
}
