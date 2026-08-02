package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.shared.data;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "context", "Landroid/content/Context;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PointPinStates$PinStyles;", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapperUtilsKt {
    @NotNull
    public static final HotelsMapInfoV4VO.PinsDisplaySettings toVO(@NotNull HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(pinsDisplaySettings, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new HotelsMapInfoV4VO.PinsDisplaySettings(ResourceExtKt.toPx(pinsDisplaySettings.getLatitudeCellPxSize(), context), ResourceExtKt.toPx(pinsDisplaySettings.getLongitudeCellPxSize(), context), pinsDisplaySettings.getLowRankedPercentPerCell() / 100.0f, pinsDisplaySettings.getLowRankedPerCellMin(), pinsDisplaySettings.getLowRankedPerCellMax(), pinsDisplaySettings.getShowHighRankedZoom() != null ? Float.valueOf(r8.intValue()) : null);
    }

    @NotNull
    public static final HotelsMapInfoV4VO.PointPinStates toVO(@NotNull HotelsMapInfoV4DTO.PointPinStates pointPinStates, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(pointPinStates, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        HotelsMapInfoV4VO.PointPinStates.PinStyles vo = toVO(pointPinStates.getDefault(), context);
        HotelsMapInfoV4DTO.PointPinStates.PinStyles selected = pointPinStates.getSelected();
        HotelsMapInfoV4VO.PointPinStates.PinStyles vo2 = selected != null ? toVO(selected, context) : null;
        HotelsMapInfoV4DTO.PointPinStates.PinStyles viewed = pointPinStates.getViewed();
        return new HotelsMapInfoV4VO.PointPinStates(vo, vo2, viewed != null ? toVO(viewed, context) : null);
    }

    private static final HotelsMapInfoV4VO.PointPinStates.PinStyles toVO(HotelsMapInfoV4DTO.PointPinStates.PinStyles pinStyles, Context context) {
        String backgroundColor = pinStyles.getBackgroundColor();
        String borderColor = pinStyles.getBorderColor();
        int px = ResourceExtKt.toPx(pinStyles.getEdgeSize(), context);
        Integer borderWidth = pinStyles.getBorderWidth();
        return new HotelsMapInfoV4VO.PointPinStates.PinStyles(px, backgroundColor, borderWidth != null ? ResourceExtKt.toPxF(borderWidth.intValue(), context) : 0.0f, borderColor);
    }
}
