package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper;

import Vc.a;
import WZ.x;
import android.content.Context;
import android.graphics.Point;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.ParseTextStyleHelper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeBitmapLoader;
import ru.ozon.app.android.travel.molecules.dto.tabsSelector.TabSelectorDTO;
import ru.ozon.app.android.travel.molecules.extensions.TextBlockParams;
import ru.ozon.app.android.travel.molecules.extensions.TextParams;
import ru.ozon.app.android.travel.molecules.extensions.TextRowsParams;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0015J\u0017\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0010\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J*\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\n\u0010#\u001a\u00060\u0003j\u0002`\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010\u0010\u001a\u00020(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b\u0010\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectWithSchemeV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;", "loader", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$GenderIndicatorDTO;", "genderIndicator", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$GenderIndicatorVO;", "mapToVO", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$GenderIndicatorDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$GenderIndicatorVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TextRectangle;", "textRectangle", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TextRectangleVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TextRectangle;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TextRectangleVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatTypeDTO;", "seatTypeDTO", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatTypeDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatTypeVO;", "", "getHashCodeForCache", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TextRectangle;)Ljava/lang/String;", "Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "toTabs", "(Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;)Lru/ozon/uni/atoms/data/tabs/Tabs;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatDTO;", "seatDTO", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "Landroid/content/Context;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper;", "parseTextStyleHelper", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper;", "", "dpMultiplier", "I", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectWithSchemeV2Mapper implements Function2<TravelRailwaySeatSelectWithSchemeV2DTO, d, List<? extends TravelRailwaySeatSelectWithSchemeVO>> {

    @NotNull
    private final Context context;
    private final int dpMultiplier;

    @NotNull
    private final TravelRailwaySchemeBitmapLoader loader;

    @NotNull
    private final ParseTextStyleHelper parseTextStyleHelper;

    public TravelRailwaySeatSelectWithSchemeV2Mapper(@NotNull Context context, @NotNull TravelRailwaySchemeBitmapLoader loader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.context = context;
        this.loader = loader;
        this.parseTextStyleHelper = new ParseTextStyleHelper();
        this.dpMultiplier = ResourceExtKt.toPx(1, context);
    }

    private final String getHashCodeForCache(TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle textRectangle) {
        return String.valueOf(Arrays.hashCode(new Object[]{textRectangle.getText(), textRectangle.getTextRectangleLayout(), textRectangle.getTextStyle(), textRectangle.getTextColor()}));
    }

    private final Tabs toTabs(TabSelectorDTO tabSelectorDTO) {
        List<TabSelectorDTO.TabDTO> tabs = tabSelectorDTO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        for (TabSelectorDTO.TabDTO tabDTO : tabs) {
            arrayList.add(new Tabs.TabsItem(OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, tabDTO.getTitle(), 0, 2, null), tabDTO.isSelected(), tabDTO.getAction(), null, null, tabDTO.getTrackingInfo(), 24, null));
        }
        return new Tabs(arrayList, UniColors.LAYER_FLOOR_0.getToken(), UniColors.LAYER_FLOOR_1.getToken(), false, null, null, null, 120, null);
    }

    @NotNull
    public final TravelRailwaySeatSelectWithSchemeVO.SeatVO mapToVO(@NotNull TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO seatDTO) {
        TravelRailwaySeatSelectWithSchemeVO.TooltipVO tooltipVO;
        String typographyToken;
        OzonSpannableString text;
        Intrinsics.checkNotNullParameter(seatDTO, "seatDTO");
        Integer x11 = seatDTO.getX();
        Integer y11 = seatDTO.getY();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(x11);
        sb2.append(y11);
        int hashCode = sb2.toString().hashCode();
        String seatTypeName = seatDTO.getSeatTypeName();
        TextDTO number = seatDTO.getNumber();
        String obj = (number == null || (text = number.getText()) == null) ? null : text.toString();
        TextDTO number2 = seatDTO.getNumber();
        String textColor = number2 != null ? number2.getTextColor() : null;
        TextDTO number3 = seatDTO.getNumber();
        ParseTextStyleHelper.ParsedTextStyle styleAttributes = (number3 == null || (typographyToken = number3.getTypographyToken()) == null) ? null : this.parseTextStyleHelper.getStyleAttributes(this.context, typographyToken, R$style.TextStyle_Body_M);
        TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO selectedSeat = seatDTO.getSelectedSeat();
        IconDTO icon = selectedSeat != null ? selectedSeat.getIcon() : null;
        TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO selectedSeat2 = seatDTO.getSelectedSeat();
        if ((selectedSeat2 != null ? selectedSeat2.getTooltipTitle() : null) == null || seatDTO.getSelectedSeat().getTooltipDescription() == null) {
            tooltipVO = null;
        } else {
            tooltipVO = new TravelRailwaySeatSelectWithSchemeVO.TooltipVO(seatDTO.getSelectedSeat().getTooltipPosition() == TravelRailwaySeatSelectWithSchemeV2DTO.TooltipPosition.TOP, seatDTO.getSelectedSeat().getTooltipTitle(), seatDTO.getSelectedSeat().getTooltipDescription());
        }
        Boolean isTopLayer = seatDTO.isTopLayer();
        boolean booleanValue = isTopLayer != null ? isTopLayer.booleanValue() : false;
        Point point = (seatDTO.getX() == null || seatDTO.getY() == null) ? null : new Point(seatDTO.getX().intValue(), seatDTO.getY().intValue());
        AtomActionDTO action = seatDTO.getAction();
        return new TravelRailwaySeatSelectWithSchemeVO.SeatVO(hashCode, seatTypeName, obj, textColor, styleAttributes, icon, tooltipVO, point, booleanValue, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, seatDTO.getSelectedSeat() != null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelRailwaySeatSelectWithSchemeVO> invoke(@NotNull TravelRailwaySeatSelectWithSchemeV2DTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> seats = state.getSeats();
        ArrayList arrayList3 = new ArrayList(C7714v.z(seats, 10));
        Iterator<T> it = seats.iterator();
        while (it.hasNext()) {
            arrayList3.add(mapToVO((TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO) it.next()));
        }
        List I02 = C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.TravelRailwaySeatSelectWithSchemeV2Mapper$invoke$lambda$5$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(Integer.valueOf(((TravelRailwaySeatSelectWithSchemeVO.SeatVO) t2).getId()), Integer.valueOf(((TravelRailwaySeatSelectWithSchemeVO.SeatVO) t11).getId()));
            }
        }, arrayList3);
        TabSelectorDTO tabSelector = state.getTabSelector();
        Tabs tabs = tabSelector != null ? toTabs(tabSelector) : null;
        boolean z11 = state.getTabSelector() != null;
        List<TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle> compartmentGenders = state.getCompartmentGenders();
        if (compartmentGenders != null) {
            List<TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle> list = compartmentGenders;
            ArrayList arrayList4 = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(mapToVO((TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle) it2.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List<TravelRailwaySeatSelectWithSchemeV2DTO.GenderIndicatorDTO> genderIndicator = state.getGenderIndicator();
        if (genderIndicator != null) {
            List<TravelRailwaySeatSelectWithSchemeV2DTO.GenderIndicatorDTO> list2 = genderIndicator;
            ArrayList arrayList5 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList5.add(mapToVO((TravelRailwaySeatSelectWithSchemeV2DTO.GenderIndicatorDTO) it3.next()));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatTypeDTO> seatTypes = state.getSeatTypes();
        ArrayList arrayList6 = new ArrayList(C7714v.z(seatTypes, 10));
        Iterator<T> it4 = seatTypes.iterator();
        while (it4.hasNext()) {
            arrayList6.add(mapToVO((TravelRailwaySeatSelectWithSchemeV2DTO.SeatTypeDTO) it4.next()));
        }
        String darkSchemeLink = state.getDarkSchemeLink();
        String lightSchemeLink = state.getLightSchemeLink();
        TravelRailwaySeatSelectWithSchemeVO.TrainDirectionVO trainDirectionVO = state.getTrainDirection() != null ? new TravelRailwaySeatSelectWithSchemeVO.TrainDirectionVO(state.getTrainDirection().getDescription(), state.getTrainDirection().getIcon()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        TravelRailwaySeatSelectWithSchemeVO travelRailwaySeatSelectWithSchemeVO = new TravelRailwaySeatSelectWithSchemeVO(hashCode, tabs, z11, I02, arrayList, arrayList2, arrayList6, darkSchemeLink, lightSchemeLink, null, trainDirectionVO, false, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, MapperExtKt.findScrollXPosition(I02), 2560, null);
        this.loader.preloadBackground(state.getDarkSchemeLink(), state.getLightSchemeLink(), travelRailwaySeatSelectWithSchemeVO.getSchemeVO());
        return C7714v.a0(travelRailwaySeatSelectWithSchemeVO);
    }

    private final TravelRailwaySeatSelectWithSchemeVO.GenderIndicatorVO mapToVO(TravelRailwaySeatSelectWithSchemeV2DTO.GenderIndicatorDTO genderIndicator) {
        return new TravelRailwaySeatSelectWithSchemeVO.GenderIndicatorVO(genderIndicator.getIcon(), genderIndicator.getLayout().getX(), genderIndicator.getLayout().getY());
    }

    private final TravelRailwaySeatSelectWithSchemeVO.TextRectangleVO mapToVO(TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle textRectangle) {
        ParseTextStyleHelper.ParsedTextStyle styleAttributes = this.parseTextStyleHelper.getStyleAttributes(this.context, textRectangle.getTextStyle(), R$style.TextStyle_Body_M);
        String hashCodeForCache = getHashCodeForCache(textRectangle);
        String text = textRectangle.getText();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(styleAttributes.getFontFamily());
        textPaint.setTextSize(styleAttributes.getTextSize() / this.dpMultiplier);
        textPaint.setLetterSpacing(styleAttributes.getLetterSpacing());
        textPaint.setColor(StyleParser.INSTANCE.parseColor(this.context, textRectangle.getTextColor(), UniColors.TEXT_ORIGINALPRICE_AVAILABLE.getResId()));
        Unit unit = Unit.f71690a;
        return new TravelRailwaySeatSelectWithSchemeVO.TextRectangleVO(hashCodeForCache, new TextParams(text, textPaint, false, 0, 0, 28, null), new TextRowsParams(0, 0.0f, styleAttributes.getLineSpacingMultiplier(), textRectangle.getTextRectangleLayout().getWidth(), null, 0, 51, null), new TextBlockParams(textRectangle.getTextRectangleLayout().getX(), textRectangle.getTextRectangleLayout().getY(), textRectangle.getTextRectangleLayout().getWidth(), null, null, 24, null));
    }

    private final TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO mapToVO(TravelRailwaySeatSelectWithSchemeV2DTO.SeatTypeDTO seatTypeDTO) {
        this.loader.preloadItem(seatTypeDTO.getDarkImageLink(), seatTypeDTO.getLightImageLink());
        return new TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO(seatTypeDTO.getName(), seatTypeDTO.getDarkImageLink(), seatTypeDTO.getLightImageLink(), null, null, null, 56, null);
    }
}
