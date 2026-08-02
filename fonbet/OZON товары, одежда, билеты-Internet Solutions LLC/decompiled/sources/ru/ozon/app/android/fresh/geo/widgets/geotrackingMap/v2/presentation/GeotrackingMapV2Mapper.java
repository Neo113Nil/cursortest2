package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import WZ.t;
import android.graphics.PointF;
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
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.TooltipVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.TooltipVOKt;
import ru.ozon.app.android.fresh.geo.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data.GeotrackingMapV2DTO;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 62*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u00016B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004*\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u000b\u001a\u00020\u0017*\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u000b\u0010\u001dJ\u001d\u0010\u000b\u001a\u00020 *\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u000b\u0010!J\u0013\u0010\u000b\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b\u000b\u0010$J\u0013\u0010\u000b\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b\u000b\u0010'J*\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010(\u001a\u00020\u00022\n\u0010*\u001a\u00060\u0003j\u0002`)H\u0096\u0002¢\u0006\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVo", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;J)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "", "", "toFraction", "(I)D", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;", "pins", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "calculateLargestPinSize", "(Ljava/util/List;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;", "toModificationsList", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;J)Ljava/util/List;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification$Modification;", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;", "tooltipVO", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification$Modification;JLru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;", "", "isCourier", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;Z)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Coordinates;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Coordinates;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin$Icon;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;Ll20/d;)Ljava/util/List;", "Landroid/graphics/PointF;", "bottomAnchorPoint$delegate", "LSc/j;", "getBottomAnchorPoint", "()Landroid/graphics/PointF;", "bottomAnchorPoint", "centerAnchorPoint$delegate", "getCenterAnchorPoint", "centerAnchorPoint", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingMapV2Mapper implements Function2<GeotrackingMapV2DTO, d, List<? extends GeotrackingMapV2VO>> {

    /* renamed from: bottomAnchorPoint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomAnchorPoint = k.b(GeotrackingMapV2Mapper$bottomAnchorPoint$2.INSTANCE);

    /* renamed from: centerAnchorPoint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j centerAnchorPoint = k.b(GeotrackingMapV2Mapper$centerAnchorPoint$2.INSTANCE);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GeotrackingMapV2DTO.Pin.Icon.Options.Gravity.values().length];
            try {
                iArr[GeotrackingMapV2DTO.Pin.Icon.Options.Gravity.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeotrackingMapV2DTO.Pin.Icon.Options.Gravity.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final GeotrackingMapV2VO.PinSize calculateLargestPinSize(List<GeotrackingMapV2DTO.Pin> pins) {
        Double valueOf;
        List<GeotrackingMapV2DTO.Pin> list = pins;
        Iterator<T> it = list.iterator();
        Double d11 = null;
        if (it.hasNext()) {
            double height = ((GeotrackingMapV2DTO.Pin) it.next()).getIcon().getOptions().getHeight();
            while (it.hasNext()) {
                height = Math.max(height, ((GeotrackingMapV2DTO.Pin) it.next()).getIcon().getOptions().getHeight());
            }
            valueOf = Double.valueOf(height);
        } else {
            valueOf = null;
        }
        int doubleValue = valueOf != null ? (int) valueOf.doubleValue() : 0;
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            double width = ((GeotrackingMapV2DTO.Pin) it2.next()).getIcon().getOptions().getWidth();
            while (it2.hasNext()) {
                width = Math.max(width, ((GeotrackingMapV2DTO.Pin) it2.next()).getIcon().getOptions().getWidth());
            }
            d11 = Double.valueOf(width);
        }
        return new GeotrackingMapV2VO.PinSize(d11 != null ? (int) d11.doubleValue() : 0, doubleValue);
    }

    private final PointF getBottomAnchorPoint() {
        return (PointF) this.bottomAnchorPoint.getValue();
    }

    private final PointF getCenterAnchorPoint() {
        return (PointF) this.centerAnchorPoint.getValue();
    }

    private final double toFraction(int i11) {
        return i11 / 100.0d;
    }

    private final List<GeotrackingMapV2VO.Pin.Modification> toModificationsList(GeotrackingMapV2DTO.CourierPinModification courierPinModification, long j11) {
        List<GeotrackingMapV2DTO.CourierPinModification.Modification> modifications = courierPinModification.getModifications();
        ArrayList arrayList = new ArrayList(C7714v.z(modifications, 10));
        Iterator<T> it = modifications.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((GeotrackingMapV2DTO.CourierPinModification.Modification) it.next(), j11, TooltipVOKt.toTooltipVO(courierPinModification.getTooltip())));
        }
        return arrayList;
    }

    private final GeotrackingMapV2VO toVo(GeotrackingMapV2DTO geotrackingMapV2DTO, long j11) {
        List<GeotrackingMapV2VO.Pin.Modification> list;
        GeotrackingMapV2VO.Pin vo = toVo(geotrackingMapV2DTO.getCourierPin(), true);
        GeotrackingMapV2VO.Pin vo2 = toVo(geotrackingMapV2DTO.getDestinationPin(), false);
        GeotrackingMapV2VO.Pin vo3 = toVo(geotrackingMapV2DTO.getDarkStorePin(), false);
        GeotrackingMapV2VO.PinSize calculateLargestPinSize = calculateLargestPinSize(C7714v.b0(geotrackingMapV2DTO.getDarkStorePin(), geotrackingMapV2DTO.getCourierPin(), geotrackingMapV2DTO.getDestinationPin()));
        String orderStatus = geotrackingMapV2DTO.getOrderStatus();
        boolean isReceived = geotrackingMapV2DTO.isReceived();
        Integer defaultSheetHeightRatio = geotrackingMapV2DTO.getDefaultSheetHeightRatio();
        double fraction = defaultSheetHeightRatio != null ? toFraction(defaultSheetHeightRatio.intValue()) : 0.46d;
        Map<String, TokenizedTrackingInfo> locationTrackingInfo = geotrackingMapV2DTO.getLocationTrackingInfo();
        t tokenizedEvent$default = locationTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(locationTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> defaultSheetTrackingInfo = geotrackingMapV2DTO.getDefaultSheetTrackingInfo();
        t tokenizedEvent$default2 = defaultSheetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(defaultSheetTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> expandedSheetTrackingInfo = geotrackingMapV2DTO.getExpandedSheetTrackingInfo();
        t tokenizedEvent$default3 = expandedSheetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(expandedSheetTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        String webSocketURL = geotrackingMapV2DTO.getWebSocketURL();
        GeotrackingMapV2DTO.CourierPinModification courierPinModification = geotrackingMapV2DTO.getCourierPinModification();
        t tVar = tokenizedEvent$default;
        if (courierPinModification == null || (list = toModificationsList(courierPinModification, j11)) == null) {
            list = K.f71697a;
        }
        return new GeotrackingMapV2VO(j11, vo, vo2, vo3, calculateLargestPinSize, orderStatus, isReceived, fraction, tVar, tokenizedEvent$default2, tokenizedEvent$default3, webSocketURL, list);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<GeotrackingMapV2VO> invoke(@NotNull GeotrackingMapV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, ExtensionsKt.getId(widgetInfo)));
    }

    private final GeotrackingMapV2VO.Pin.Modification toVo(GeotrackingMapV2DTO.CourierPinModification.Modification modification, long j11, TooltipVO tooltipVO) {
        TooltipVO tooltipVO2;
        TextDTO textDTO;
        String type = modification.getType();
        String animatedIconUrl = modification.getAnimatedIconUrl();
        String tooltipTitle = modification.getTooltipTitle();
        if (tooltipTitle != null) {
            TextDTO copy$default = TextDTO.copy$default(tooltipVO.getTitle(), OzonSpannableStringKt.toOzonSpannableString(tooltipTitle), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
            String tooltipSubtitle = modification.getTooltipSubtitle();
            if (tooltipSubtitle != null) {
                TextDTO subtitle = tooltipVO.getSubtitle();
                textDTO = subtitle != null ? TextDTO.copy$default(subtitle, OzonSpannableStringKt.toOzonSpannableString(tooltipSubtitle), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null) : null;
            } else {
                textDTO = null;
            }
            tooltipVO2 = TooltipVO.copy$default(tooltipVO, copy$default, textDTO, false, null, null, 0, null, false, 0, 0, null, null, 4092, null);
        } else {
            tooltipVO2 = null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = modification.getTrackingInfo();
        return new GeotrackingMapV2VO.Pin.Modification(type, animatedIconUrl, tooltipVO2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final GeotrackingMapV2VO.Pin toVo(GeotrackingMapV2DTO.Pin pin, boolean z11) {
        GeotrackingMapV2DTO.Pin.Coordinates coordinates = pin.getCoordinates();
        GeotrackingMapV2VO.Pin.Coordinates vo = coordinates != null ? toVo(coordinates) : null;
        GeotrackingMapV2VO.Pin.Icon vo2 = toVo(pin.getIcon());
        Double direction = pin.getDirection();
        return new GeotrackingMapV2VO.Pin(vo, direction != null ? direction.doubleValue() : 0.0d, vo2, z11, null);
    }

    private final GeotrackingMapV2VO.Pin.Coordinates toVo(GeotrackingMapV2DTO.Pin.Coordinates coordinates) {
        return new GeotrackingMapV2VO.Pin.Coordinates(coordinates.getLongitude(), coordinates.getLatitude());
    }

    private final GeotrackingMapV2VO.Pin.Icon toVo(GeotrackingMapV2DTO.Pin.Icon icon) {
        PointF bottomAnchorPoint;
        int i11 = WhenMappings.$EnumSwitchMapping$0[icon.getOptions().getGravity().ordinal()];
        if (i11 == 1) {
            bottomAnchorPoint = getBottomAnchorPoint();
        } else if (i11 == 2) {
            bottomAnchorPoint = getCenterAnchorPoint();
        } else {
            throw new o();
        }
        String url = icon.getUrl();
        String animatedIconUrl = icon.getAnimatedIconUrl();
        if (animatedIconUrl == null) {
            animatedIconUrl = "";
        }
        return new GeotrackingMapV2VO.Pin.Icon(url, animatedIconUrl, new GeotrackingMapV2VO.Pin.Icon.Options(new GeotrackingMapV2VO.PinSize((int) icon.getOptions().getWidth(), (int) icon.getOptions().getHeight()), bottomAnchorPoint));
    }
}
