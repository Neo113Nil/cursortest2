package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.data;

import android.graphics.PointF;
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
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.data.HotelsPageMapPreviewV2DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2VO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$MapSettings;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$MapSettings;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$Pin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$Pin;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$Pin;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$Pin;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;Ll20/d;)Ljava/util/List;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewV2Mapper implements Function2<HotelsPageMapPreviewV2DTO, d, List<? extends HotelsPageMapPreviewV2VO>> {
    private final HotelsPageMapPreviewV2VO.MapSettings toVO(HotelsPageMapPreviewV2DTO.MapSettings mapSettings) {
        AtomActionDTO action;
        n latLngBounds = MapExtKt.toLatLngBounds(mapSettings.getVisibleRegion());
        HotelsPageMapPreviewV2VO.Pin vo = toVO(mapSettings.getPin());
        CommonControlSettings commonControlSettings = mapSettings.getCommonControlSettings();
        return new HotelsPageMapPreviewV2VO.MapSettings(latLngBounds, vo, (commonControlSettings == null || (action = commonControlSettings.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, mapSettings.getCommonControlSettings().getTrackingInfo()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageMapPreviewV2VO> invoke(@NotNull HotelsPageMapPreviewV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO address = state.getAddress();
        IconButtonV3DTO copyButton = state.getCopyButton();
        HotelsPageMapPreviewV2VO.MapSettings vo = toVO(state.getMap());
        List<CellDTO> pointsOfInterests = state.getPointsOfInterests();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new HotelsPageMapPreviewV2VO(hashCode, title, address, copyButton, vo, pointsOfInterests, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final HotelsPageMapPreviewV2VO.Pin toVO(HotelsPageMapPreviewV2DTO.Pin pin) {
        m latLng = MapExtKt.toLatLng(pin.getCoordinate());
        IconDTO icon = pin.getIcon();
        PointF pointF = MapExtKt.toPointF(pin.getAnchorPoint());
        CommonAtomIconDTO icon2 = pin.getIcon().getIcon();
        return new HotelsPageMapPreviewV2VO.Pin(latLng, icon, pointF, String.valueOf(icon2 != null ? icon2.hashCode() : 0));
    }
}
