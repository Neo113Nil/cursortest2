package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data;

import WZ.t;
import WZ.x;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBoxV2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsMapperExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.shared.data.MapperUtilsKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.PinMapperDelegate;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.FetchPinsActionResponseVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data.HotelsMapInfoV5DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0013J/\u0010\u000f\u001a\u00020\u001a*\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000f\u0010\u001bJ\u001b\u0010\u000f\u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u000f\u0010 J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;", "pinMapperDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;", "", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icons", "favoriteIcon", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;J)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV5Mapper implements Function2<HotelsMapInfoV5DTO, d, List<? extends HotelsMapInfoV4VO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final PinMapperDelegate pinMapperDelegate;

    public HotelsMapInfoV5Mapper(@NotNull Context context, @NotNull PinMapperDelegate pinMapperDelegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinMapperDelegate, "pinMapperDelegate");
        this.context = context;
        this.pinMapperDelegate = pinMapperDelegate;
    }

    private final HotelsMapInfoV4VO.PinTypes toVO(HotelsMapInfoV5DTO.PinTypes pinTypes, Context context) {
        return new HotelsMapInfoV4VO.PinTypes(toVO(pinTypes.getHighRanked()), MapperUtilsKt.toVO(pinTypes.getLowRanked(), context));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsMapInfoV4VO> invoke(@NotNull HotelsMapInfoV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        FetchPinsActionResponseVO mapPinsResponse = this.pinMapperDelegate.mapPinsResponse(state.getActions().getInitialFetchResponse(), Long.valueOf(hashCode));
        m latLng = MapExtKt.toLatLng(state.getLocationPoint());
        BoundingBoxV2 visibleRegion = state.getVisibleRegion();
        n latLngBounds = visibleRegion != null ? MapExtKt.toLatLngBounds(visibleRegion) : null;
        BoundingBoxV2 visibleRegion2 = state.getVisibleRegion();
        m center = visibleRegion2 != null ? MapExtKt.getCenter(visibleRegion2) : null;
        HotelsMapInfoV4VO.PinsDisplaySettings vo = MapperUtilsKt.toVO(state.getPinsDisplaySettings(), this.context);
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(state.getActions().getFetchPinsAction(), null);
        m mVar = center;
        HotelsMapInfoV4VO.DownloadPinsAction downloadPinsAction = new HotelsMapInfoV4VO.DownloadPinsAction(mapPinsResponse.getNextAction(), mapPinsResponse.getNextFetchInterval());
        HotelsMapInfoV4VO.PinTypes vo2 = toVO(state.getPinTypes(), this.context);
        HotelsMapInfoV4DTO.CardStyle cardStyle = state.getCardStyle();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(mapPinsResponse.getPins());
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        DistrictsDTO districts = state.getDistricts();
        DistrictsVO vo3 = districts != null ? DistrictsMapperExtKt.toVO(districts, hashCode) : null;
        AtomAction.DismissRefresh dismissRefresh = new AtomAction.DismissRefresh(null, state.m1336getMobileSettingsie92oRg(), null, null, null, null, 53, null);
        AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(state.getActions().getFetchCardsAction(), null);
        String regionHash = state.getRegionHash();
        HotelsMapInfoV4DTO.PinLimits pinLimits = state.getPinLimits();
        HotelsMapInfoV5DTO.TrackingInfo tracking = state.getTracking();
        return C7714v.a0(new HotelsMapInfoV4VO(hashCode, latLngBounds, mVar, latLng, vo, atomAction, downloadPinsAction, vo2, cardStyle, null, concurrentHashMap, concurrentHashMap2, vo3, dismissRefresh, atomAction2, regionHash, null, pinLimits, null, tracking != null ? toVO(tracking, hashCode) : null, true, 65536, null));
    }

    private final HotelsMapInfoV4VO.PricePinStates toVO(HotelsMapInfoV5DTO.PricePinStates pricePinStates) {
        HotelsMapInfoV4VO.PricePinStates.PinStyles vo = toVO(pricePinStates.getDefault(), pricePinStates.getIcons(), pricePinStates.getFavoriteIcon());
        HotelsMapInfoV5DTO.PricePinStates.PinStyles selected = pricePinStates.getSelected();
        HotelsMapInfoV4VO.PricePinStates.PinStyles vo2 = selected != null ? toVO(selected, pricePinStates.getIcons(), pricePinStates.getFavoriteIcon()) : null;
        HotelsMapInfoV5DTO.PricePinStates.PinStyles viewed = pricePinStates.getViewed();
        return new HotelsMapInfoV4VO.PricePinStates(vo, vo2, viewed != null ? toVO(viewed, pricePinStates.getIcons(), pricePinStates.getFavoriteIcon()) : null, pricePinStates.getSinglePinTemplateTitle(), pricePinStates.getClusterPinTemplateTitle());
    }

    private final HotelsMapInfoV4VO.PricePinStates.PinStyles toVO(HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles, Map<Integer, IconDTO> map, IconDTO iconDTO) {
        return new HotelsMapInfoV4VO.PricePinStates.PinStyles(pinStyles.getBackgroundColor(), pinStyles.getBorderColor(), pinStyles.getClusterBadge(), pinStyles.getText(), null, iconDTO, map);
    }

    private final HotelsMapInfoV4VO.TrackingEvents toVO(HotelsMapInfoV5DTO.TrackingInfo trackingInfo, long j11) {
        Map<String, TokenizedTrackingInfo> readyTrackingInfo = trackingInfo.getReadyTrackingInfo();
        t b11 = readyTrackingInfo != null ? x.b(readyTrackingInfo, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> pinCommonTrackingInfo = trackingInfo.getPinCommonTrackingInfo();
        t b12 = pinCommonTrackingInfo != null ? x.b(pinCommonTrackingInfo, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> loaderTrackingInfo = trackingInfo.getLoaderTrackingInfo();
        return new HotelsMapInfoV4VO.TrackingEvents(b11, b12, loaderTrackingInfo != null ? x.b(loaderTrackingInfo, Long.valueOf(j11), null) : null);
    }
}
