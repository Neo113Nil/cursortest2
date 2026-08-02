package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.data;

import WZ.t;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.data.PricesHistogramV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u001c*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u001d\u001a\u00020\u0011*\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010 J\u0013\u0010\u001d\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b\u001d\u0010#J*\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010$\u001a\u00020\u00022\n\u0010&\u001a\u00060\u0003j\u0002`%H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO;", "months", "", "countOfEmptyDays", "", "widgetId", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "getListOfDayVO", "(Ljava/util/List;IJ)Ljava/util/List;", "currentIndexOfMonth", "month", "mapToListOfDaysVO", "(ILru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO;Ljava/util/List;IJ)Ljava/util/List;", "getListWithEmptyDays", "(I)Ljava/util/List;", "", "isCorner", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$MonthVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO;IZ)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$MonthVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO$DayDTO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO$DayDTO;ILjava/util/List;IJ)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$AvailableColorsDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$AvailableColorsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2Mapper implements Function2<PricesHistogramV2DTO, d, List<? extends PricesHistogramV2VO>> {

    @NotNull
    private final Context context;

    public PricesHistogramV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<PricesHistogramV2VO.DayVO> getListOfDayVO(List<PricesHistogramV2DTO.MonthDTO> months, int countOfEmptyDays, long widgetId) {
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
            C7714v.p(mapToListOfDaysVO(i11, (PricesHistogramV2DTO.MonthDTO) obj, months, countOfEmptyDays, widgetId), arrayList2);
            i11 = i12;
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(getListWithEmptyDays(countOfEmptyDays));
        return arrayList;
    }

    private final List<PricesHistogramV2VO.DayVO> getListWithEmptyDays(int countOfEmptyDays) {
        ArrayList arrayList = new ArrayList();
        PricesHistogramV2VO.DayVO dayVO = new PricesHistogramV2VO.DayVO(6, 6, "", "", new TextDTO(new OzonSpannableString(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), false, new TextDTO(new OzonSpannableString(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), new TextDTO(new OzonSpannableString(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), 0, 0, false, null, null, null, 14336, null);
        for (int i11 = 0; i11 < countOfEmptyDays; i11++) {
            arrayList.add(dayVO);
        }
        return arrayList;
    }

    private final List<PricesHistogramV2VO.DayVO> mapToListOfDaysVO(int currentIndexOfMonth, PricesHistogramV2DTO.MonthDTO month, List<PricesHistogramV2DTO.MonthDTO> months, int countOfEmptyDays, long widgetId) {
        List<PricesHistogramV2DTO.MonthDTO.DayDTO> days = month.getDays();
        ArrayList arrayList = new ArrayList(C7714v.z(days, 10));
        Iterator<T> it = days.iterator();
        while (it.hasNext()) {
            int i11 = currentIndexOfMonth;
            arrayList.add(toVO((PricesHistogramV2DTO.MonthDTO.DayDTO) it.next(), i11, months, countOfEmptyDays, widgetId));
            currentIndexOfMonth = i11;
        }
        return arrayList;
    }

    private final PricesHistogramV2VO.MonthVO toVO(PricesHistogramV2DTO.MonthDTO monthDTO, int i11, boolean z11) {
        OzonSpannableString text = monthDTO.getTitle().getText();
        int size = monthDTO.getDays().size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append(size);
        return new PricesHistogramV2VO.MonthVO(sb2.toString().hashCode(), monthDTO.getDays().size(), monthDTO.getTitle(), i11, z11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PricesHistogramV2VO> invoke(@NotNull PricesHistogramV2DTO dto, @NotNull d widgetInfo) {
        Object obj;
        PricesHistogramV2DTO.MonthDTO.DayDTO dayDTO;
        ArrayList arrayList;
        String str;
        String str2;
        t tVar;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CommonControlSettings common2;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        ToggleDTO toggle;
        Boolean isSelected;
        TextDTO title;
        OzonSpannableString text;
        Iterator it;
        boolean z11;
        TextDTO title2;
        Object obj2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int c11 = C6915b.c(((r1.widthPixels / this.context.getResources().getDisplayMetrics().density) / 26) / 2);
        List<PricesHistogramV2DTO.MonthDTO> monthsThere = dto.getMonthsThere();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = monthsThere.iterator();
        while (it2.hasNext()) {
            C7714v.p(((PricesHistogramV2DTO.MonthDTO) it2.next()).getDays(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (((PricesHistogramV2DTO.MonthDTO.DayDTO) obj).isSelected()) {
                break;
            }
        }
        PricesHistogramV2DTO.MonthDTO.DayDTO dayDTO2 = (PricesHistogramV2DTO.MonthDTO.DayDTO) obj;
        if (dayDTO2 == null) {
            return K.f71697a;
        }
        List<PricesHistogramV2DTO.MonthDTO> monthsBack = dto.getMonthsBack();
        if (monthsBack != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = monthsBack.iterator();
            while (it4.hasNext()) {
                C7714v.p(((PricesHistogramV2DTO.MonthDTO) it4.next()).getDays(), arrayList3);
            }
            Iterator it5 = arrayList3.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it5.next();
                if (((PricesHistogramV2DTO.MonthDTO.DayDTO) obj2).isSelected()) {
                    break;
                }
            }
            dayDTO = (PricesHistogramV2DTO.MonthDTO.DayDTO) obj2;
        } else {
            dayDTO = null;
        }
        long hashCode = widgetInfo.d().hashCode();
        PricesHistogramV2DTO.MonthDTO.DayDTO dayDTO3 = dayDTO;
        TextDTO direction = dto.getDirection();
        ChipDTO tabThere = dto.getTabThere();
        ChipDTO tabBack = dto.getTabBack();
        TextDTO copy$default = TextDTO.copy$default(dayDTO2.getTitle(), OzonSpannableStringKt.toOzonSpannableString(((Object) dayDTO2.getTitle().getText()) + " - " + ((Object) ((dayDTO3 == null || (title2 = dayDTO3.getTitle()) == null) ? null : title2.getText()))), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        List<PricesHistogramV2DTO.MonthDTO> monthsThere2 = dto.getMonthsThere();
        ArrayList arrayList4 = new ArrayList(C7714v.z(monthsThere2, 10));
        Iterator<T> it6 = monthsThere2.iterator();
        int i11 = 0;
        while (true) {
            if (!it6.hasNext()) {
                List<PricesHistogramV2DTO.MonthDTO> monthsBack2 = dto.getMonthsBack();
                if (monthsBack2 != null) {
                    List<PricesHistogramV2DTO.MonthDTO> list = monthsBack2;
                    ArrayList arrayList5 = new ArrayList(C7714v.z(list, 10));
                    Iterator it7 = list.iterator();
                    int i12 = 0;
                    while (it7.hasNext()) {
                        Object next = it7.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        PricesHistogramV2DTO.MonthDTO monthDTO = (PricesHistogramV2DTO.MonthDTO) next;
                        if (i12 != 0) {
                            it = it7;
                            if (i12 != dto.getMonthsThere().size() - 1) {
                                z11 = false;
                                arrayList5.add(toVO(monthDTO, c11, z11));
                                i12 = i13;
                                it7 = it;
                            }
                        } else {
                            it = it7;
                        }
                        z11 = true;
                        arrayList5.add(toVO(monthDTO, c11, z11));
                        i12 = i13;
                        it7 = it;
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                ButtonV3DTO findTicketsButton = dto.getFindTicketsButton();
                ToggleTitleSubtitleCellDTO toggleCalendarButton = dto.getToggleCalendarButton();
                boolean z12 = dto.getToggleCalendarButton() != null;
                PricesHistogramV2VO.AvailableColorsVO vo = toVO(dto.getAvailableColors());
                boolean z13 = z12;
                String date = dayDTO2.getDate();
                String date2 = dayDTO3 != null ? dayDTO3.getDate() : null;
                List<PricesHistogramV2VO.DayVO> listOfDayVO = getListOfDayVO(dto.getMonthsThere(), c11, hashCode);
                List<PricesHistogramV2DTO.MonthDTO> monthsBack3 = dto.getMonthsBack();
                List<PricesHistogramV2VO.DayVO> listOfDayVO2 = monthsBack3 != null ? getListOfDayVO(monthsBack3, c11, hashCode) : null;
                String obj3 = dayDTO2.getTitle().getText().toString();
                List<PricesHistogramV2VO.DayVO> list2 = listOfDayVO2;
                Intrinsics.checkNotNullExpressionValue(obj3, "toString(...)");
                String obj4 = (dayDTO3 == null || (title = dayDTO3.getTitle()) == null || (text = title.getText()) == null) ? null : text.toString();
                TextDTO title3 = dayDTO2.getTitle();
                TextDTO priceOrMessage = dayDTO2.getPriceOrMessage();
                ToggleTitleSubtitleCellDTO toggleCalendarButton2 = dto.getToggleCalendarButton();
                boolean booleanValue = (toggleCalendarButton2 == null || (toggle = toggleCalendarButton2.getToggle()) == null || (isSelected = toggle.isSelected()) == null) ? false : isSelected.booleanValue();
                ChipDTO tabThere2 = dto.getTabThere();
                if (tabThere2 == null || (common2 = tabThere2.getCommon()) == null || (trackingInfo2 = common2.getTrackingInfo()) == null) {
                    str = obj3;
                    str2 = obj4;
                    tVar = null;
                } else {
                    str = obj3;
                    str2 = obj4;
                    tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null);
                }
                ChipDTO tabBack2 = dto.getTabBack();
                return C7714v.a0(new PricesHistogramV2VO(hashCode, direction, copy$default, tabThere, tabBack, arrayList4, arrayList, findTicketsButton, toggleCalendarButton, z13, vo, date, date2, listOfDayVO, list2, str, str2, title3, priceOrMessage, c11, booleanValue, tVar, (tabBack2 == null || (common = tabBack2.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null)));
            }
            Object next2 = it6.next();
            int i14 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList4.add(toVO((PricesHistogramV2DTO.MonthDTO) next2, c11, i11 == 0 || i11 == dto.getMonthsThere().size() + (-1)));
            i11 = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PricesHistogramV2VO.DayVO toVO(PricesHistogramV2DTO.MonthDTO.DayDTO dayDTO, int i11, List<PricesHistogramV2DTO.MonthDTO> list, int i12, long j11) {
        TextDTO title;
        TextDTO title2;
        TextDTO title3;
        TextDTO textDTO;
        int parseInt = Integer.parseInt(dayDTO.getNumber());
        int parseInt2 = Integer.parseInt(((PricesHistogramV2DTO.MonthDTO.DayDTO) C7714v.X(list.get(i11).getDays())).getNumber());
        int i13 = i12 - 3;
        if (parseInt <= i13 && i11 >= 1) {
            title = list.get(i11 - 1).getTitle();
            title2 = list.get(i11).getTitle();
        } else if (parseInt > parseInt2 - i13 && i11 < list.size() - 1) {
            title = list.get(i11).getTitle();
            title2 = list.get(i11 + 1).getTitle();
        } else {
            if (parseInt > i13 && parseInt <= i12) {
                textDTO = list.get(i11).getTitle();
                title3 = null;
            } else if (parseInt > parseInt2 - i12 && parseInt2 > 27) {
                title3 = list.get(i11).getTitle();
                textDTO = null;
            } else {
                title = list.get(i11).getTitle();
                title2 = list.get(i11).getTitle();
            }
            int dayHeight = dayDTO.getDayHeight();
            int dayHeightDirect = dayDTO.getDayHeightDirect();
            String number = dayDTO.getNumber();
            String date = dayDTO.getDate();
            boolean isSelected = dayDTO.isSelected();
            int price = dayDTO.getPrice();
            int priceDirect = dayDTO.getPriceDirect();
            TextDTO title4 = dayDTO.getTitle();
            TextDTO priceOrMessage = dayDTO.getPriceOrMessage();
            TextDTO priceOrMessageDirect = dayDTO.getPriceOrMessageDirect();
            Map<String, TokenizedTrackingInfo> daySelectionTracking = dayDTO.getDaySelectionTracking();
            return new PricesHistogramV2VO.DayVO(dayHeight, dayHeightDirect, number, date, title4, isSelected, priceOrMessage, priceOrMessageDirect, price, priceDirect, false, title3, textDTO, daySelectionTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(daySelectionTracking, Long.valueOf(j11), null, 2, null) : null, UserVerificationMethods.USER_VERIFY_ALL, null);
        }
        textDTO = title2;
        title3 = title;
        int dayHeight2 = dayDTO.getDayHeight();
        int dayHeightDirect2 = dayDTO.getDayHeightDirect();
        String number2 = dayDTO.getNumber();
        String date2 = dayDTO.getDate();
        boolean isSelected2 = dayDTO.isSelected();
        int price2 = dayDTO.getPrice();
        int priceDirect2 = dayDTO.getPriceDirect();
        TextDTO title42 = dayDTO.getTitle();
        TextDTO priceOrMessage2 = dayDTO.getPriceOrMessage();
        TextDTO priceOrMessageDirect2 = dayDTO.getPriceOrMessageDirect();
        Map<String, TokenizedTrackingInfo> daySelectionTracking2 = dayDTO.getDaySelectionTracking();
        return new PricesHistogramV2VO.DayVO(dayHeight2, dayHeightDirect2, number2, date2, title42, isSelected2, priceOrMessage2, priceOrMessageDirect2, price2, priceDirect2, false, title3, textDTO, daySelectionTracking2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(daySelectionTracking2, Long.valueOf(j11), null, 2, null) : null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    private final PricesHistogramV2VO.AvailableColorsVO toVO(PricesHistogramV2DTO.AvailableColorsDTO availableColorsDTO) {
        StyleParser styleParser = StyleParser.INSTANCE;
        return new PricesHistogramV2VO.AvailableColorsVO(styleParser.parseColor(this.context, availableColorsDTO.getSelectedColumnColor(), R$color.bg_accent_primary), styleParser.parseColor(this.context, availableColorsDTO.getDefaultColumnColor(), R$color.layer_floor_0));
    }
}
