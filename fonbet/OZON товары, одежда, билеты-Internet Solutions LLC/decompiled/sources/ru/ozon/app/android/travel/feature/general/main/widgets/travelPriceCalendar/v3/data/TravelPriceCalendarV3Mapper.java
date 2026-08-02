package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data;

import Sc.o;
import android.content.Context;
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
import ru.ozon.app.android.travel.calendar.extensions.CalendarExtensionsKt;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.app.android.travel.calendar.view.vo.TripMode;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data.TravelPriceCalendarV3DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.TravelPriceCalendarV3VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.dynamic.TravelPriceCalendarV3DynamicUpdateVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicUpdateVO;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "", "isInitialMapping", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "mapCalendar", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO;Z)Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO$SelectionMode;", "selectionMode", "Lru/ozon/app/android/travel/calendar/view/vo/TripMode;", "mapTripMode", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO$SelectionMode;)Lru/ozon/app/android/travel/calendar/view/vo/TripMode;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicUpdateVO;", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceCalendarV3Mapper implements Function2<TravelPriceCalendarV3DTO, d, List<? extends TravelPriceCalendarV3VO>>, AsyncWidgetStateMapper<TravelPriceCalendarV3DTO, TravelPriceCalendarV3DynamicUpdateVO> {

    @NotNull
    private final Context context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TravelPriceCalendarV3DTO.SelectionMode.values().length];
            try {
                iArr[TravelPriceCalendarV3DTO.SelectionMode.SINGLE_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TravelPriceCalendarV3DTO.SelectionMode.DAYS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TravelPriceCalendarV3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final CalendarVO mapCalendar(TravelPriceCalendarV3DTO state, boolean isInitialMapping) {
        return CalendarExtensionsKt.toVO(state.getCalendar(), this.context, state.getTripKind(), mapTripMode(state.getSelectionMode()), isInitialMapping, state.getCalendar().getStartSelectedDate() != null && state.getCalendar().getEndSelectedDate() == null, true);
    }

    private final TripMode mapTripMode(TravelPriceCalendarV3DTO.SelectionMode selectionMode) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[selectionMode.ordinal()];
        if (i11 == 1) {
            return TripMode.THERE;
        }
        if (i11 == 2) {
            return TripMode.ROUND_TRIP;
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPriceCalendarV3VO> invoke(@NotNull TravelPriceCalendarV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String a11 = widgetInfo.c().a();
        CalendarVO mapCalendar = mapCalendar(state, true);
        AtomActionDTO oneClickDateAction = state.getOneClickDateAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new TravelPriceCalendarV3VO(hashCode, mapCalendar, oneClickDateAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, (!Intrinsics.d(state.getShouldUpdateAfterSelect(), Boolean.TRUE) || a11 == null) ? TravelPriceCalendarV3VO.Behavior.Static.INSTANCE : new TravelPriceCalendarV3VO.Behavior.Dynamic(a11)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public TravelPriceCalendarV3DynamicUpdateVO mapAsyncState(@NotNull TravelPriceCalendarV3DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TravelPriceCalendarV3DynamicUpdateVO(mapCalendar(state, false));
    }
}
