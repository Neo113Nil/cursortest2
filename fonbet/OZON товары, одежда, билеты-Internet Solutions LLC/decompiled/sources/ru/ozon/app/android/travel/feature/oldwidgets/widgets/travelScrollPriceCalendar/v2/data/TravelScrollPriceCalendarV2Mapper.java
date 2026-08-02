package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data;

import Sc.o;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2DTO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2VO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0003j\u0002`\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$DateTabDTO;", "item", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "tabSettings", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Content$DateTabVO;", "mapDateTabDTO", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO$DateTabDTO;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Content$DateTabVO;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "mapTravelWidgetSettingsDTO", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;)Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarV2Mapper implements Function2<TravelScrollPriceCalendarV2DTO, d, List<? extends TravelScrollPriceCalendarV2VO>>, AsyncWidgetStateMapper<TravelScrollPriceCalendarV2DTO, TravelScrollPriceCalendarV2VO.State> {

    @NotNull
    private final Context context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TravelScrollPriceCalendarV2DTO.AsyncBehaviorType.values().length];
            try {
                iArr[TravelScrollPriceCalendarV2DTO.AsyncBehaviorType.NO_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TravelScrollPriceCalendarV2DTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TravelScrollPriceCalendarV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final TravelScrollPriceCalendarV2VO.State extractState(TravelScrollPriceCalendarV2DTO state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getAsyncBehaviorType().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return new TravelScrollPriceCalendarV2VO.State.Loading(state.getViewTracking());
            }
            throw new o();
        }
        Iterator<TravelScrollPriceCalendarV2DTO.DateTabDTO> it = state.getDateTabs().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().isSelected()) {
                break;
            }
            i12++;
        }
        TravelWidgetSettingsVO mapTravelWidgetSettingsDTO = mapTravelWidgetSettingsDTO(state.getTabSettings());
        List<TravelScrollPriceCalendarV2DTO.DateTabDTO> dateTabs = state.getDateTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(dateTabs, 10));
        Iterator<T> it2 = dateTabs.iterator();
        while (it2.hasNext()) {
            arrayList.add(mapDateTabDTO((TravelScrollPriceCalendarV2DTO.DateTabDTO) it2.next(), mapTravelWidgetSettingsDTO));
        }
        Integer valueOf = Integer.valueOf(i12);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        return new TravelScrollPriceCalendarV2VO.State.Content(state.getViewTracking(), arrayList, valueOf, state.getHasBackground());
    }

    private final TravelScrollPriceCalendarV2VO.State.Content.DateTabVO mapDateTabDTO(TravelScrollPriceCalendarV2DTO.DateTabDTO item, TravelWidgetSettingsVO tabSettings) {
        OzonSpannableString text;
        TextDTO price = item.getPrice();
        if (price == null || (text = price.getText()) == null) {
            text = item.getDate().getText();
        }
        return new TravelScrollPriceCalendarV2VO.State.Content.DateTabVO(text.hashCode(), item.getDate(), item.getPrice(), item.getRightPriceIcon(), item.getBorderColor(), item.isSelected(), AtomActionMapperKt.toAtomAction(item.getClickAction(), item.getTrackingInfo()), tabSettings, item.getTrackingInfo());
    }

    private final TravelWidgetSettingsVO mapTravelWidgetSettingsDTO(TravelWidgetSettingsDTO state) {
        CornerRadius cornerRadius;
        Paddings paddings;
        Paddings paddings2;
        Paddings paddings3;
        Paddings paddings4;
        TravelWidgetSettingsDTO.PaddingsSetting paddings5;
        TravelWidgetSettingsDTO.PaddingsSetting paddings6;
        TravelWidgetSettingsDTO.PaddingsSetting paddings7;
        TravelWidgetSettingsDTO.PaddingsSetting paddings8;
        TravelWidgetSettingsDTO.CornersSetting corners;
        String backgroundColor = state != null ? state.getBackgroundColor() : null;
        if (state == null || (corners = state.getCorners()) == null || (cornerRadius = corners.getTopRadius()) == null) {
            cornerRadius = CornerRadius.RADIUS_500;
        }
        TravelWidgetSettingsVO.CornersVO cornersVO = new TravelWidgetSettingsVO.CornersVO(ResourceExtKt.toPxF(cornerRadius.getPx(), this.context), 0.0f);
        if (state == null || (paddings8 = state.getPaddings()) == null || (paddings = paddings8.getLeftPadding()) == null) {
            paddings = Paddings.PADDING_350;
        }
        int px = ResourceExtKt.toPx(paddings.getPx());
        if (state == null || (paddings7 = state.getPaddings()) == null || (paddings2 = paddings7.getRightPadding()) == null) {
            paddings2 = Paddings.PADDING_350;
        }
        int px2 = ResourceExtKt.toPx(paddings2.getPx());
        if (state == null || (paddings6 = state.getPaddings()) == null || (paddings3 = paddings6.getTopPadding()) == null) {
            paddings3 = Paddings.PADDING_350;
        }
        int px3 = ResourceExtKt.toPx(paddings3.getPx());
        if (state == null || (paddings5 = state.getPaddings()) == null || (paddings4 = paddings5.getBottomPadding()) == null) {
            paddings4 = Paddings.PADDING_350;
        }
        return new TravelWidgetSettingsVO(backgroundColor, cornersVO, new TravelWidgetSettingsVO.PaddingsVO(px, px2, px3, ResourceExtKt.toPx(paddings4.getPx())));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelScrollPriceCalendarV2VO> invoke(@NotNull TravelScrollPriceCalendarV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new TravelScrollPriceCalendarV2VO(widgetInfo.d().hashCode(), widgetInfo.c().a(), extractState(state)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public TravelScrollPriceCalendarV2VO.State mapAsyncState(@NotNull TravelScrollPriceCalendarV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }
}
