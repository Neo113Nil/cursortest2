package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics;

import UZ.a;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import WZ.t;
import android.location.Location;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import we0.i;
import we0.m;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 V2\u00020\u0001:\u0001VB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0012\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0013\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J'\u0010\u0014\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J'\u0010\u0015\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J-\u0010'\u001a\u00020\n2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"2\b\u0010&\u001a\u0004\u0018\u00010$¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010/2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b0\u00101J\u001d\u00105\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001e¢\u0006\u0004\b5\u00106J+\u0010;\u001a\u00020\n2\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000207\u0018\u00010\"2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u000209¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010D\u001a\u00020#¢\u0006\u0004\bE\u0010FJ)\u0010H\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010/2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010G\u001a\u000209¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;", "", "LWZ/l;", "tokenizedAnalytics", "<init>", "(LWZ/l;)V", "", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "card", "", "checkAndFillCardParams", "(Ljava/util/Map;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pin", "fillPinParams", "(Ljava/util/Map;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)V", "fillDimensionOneParam", "fillDimensionTwoParam", "fillDimensionFourParam", "fillElementTypeParam", "fillDimensionThreeParam", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "events", "setEvents", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;)V", "", "id", "setWidgetId", "(J)V", "Lwe0/m;", "point", "setStartPoint", "(Lwe0/m;)V", "", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icons", "favoriteIcon", "setPinIcons", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "trackPinClick", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;", "info", "trackCardView", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "trackCardClick", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)V", "Lwe0/i;", "currentVisibleArea", "currentLatLng", "trackMapView", "(Lwe0/i;Lwe0/m;)V", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "districtToggleTrackingInfo", "", "isSelected", "trackDistrictToggle", "(Ljava/util/Map;Z)V", "LWZ/t;", "event", "trackPolygonBadgeClick", "(LWZ/t;)V", "isShown", "trackLoaderStatus", "(Z)V", "imagePosition", "trackSlideImage", "(LWZ/t;I)V", "isFavorite", "trackFavoriteChange", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;Z)V", "LWZ/l;", "widgetId", "Ljava/lang/Long;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "Landroid/location/Location;", "startPoint", "Landroid/location/Location;", "pinIcons", "Ljava/util/Map;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "currentCardInfo", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private ViewedCardInfo currentCardInfo;
    private HotelsMapInfoV4VO.TrackingEvents events;
    private IconDTO favoriteIcon;

    @NotNull
    private Map<Integer, IconDTO> pinIcons;
    private Location startPoint;

    @NotNull
    private final l tokenizedAnalytics;
    private Long widgetId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper$Companion;", "", "<init>", "()V", "PROPERTIES_ROUTE_ID", "", "PROPERTIES_ELEMENT_TYPE_PARAM", "DIMENSION_1_PARAM", "DIMENSION_2_PARAM", "DIMENSION_3_PARAM", "DIMENSION_4_PARAM", "PROPERTIES_NUMBER_PARAM", "PROPERTIES_POINTS_AMOUNT_PARAM", "PROPERTIES_ASPECT_PARAM", "PROPERTIES_LOADER_STATUS_PARAM", "PROPERTIES_DISTANCE_FROM_START_POINT_PARAM", "ANALYTICS_VALUE_0", "ANALYTICS_VALUE_1", "ANALYTICS_VALUE_TOP", "ANALYTICS_VALUE_PRIORITY", "ANALYTICS_VALUE_LOADER_SHOWN", "ANALYTICS_VALUE_LOADER_HIDDEN", "ACTION_TYPE_UNSET", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AnalyticsHelper(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.pinIcons = U.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAndFillCardParams(Map<String, Object> map, HotelsMapInfoV4VO.CardState cardState) {
        ViewedCardInfo viewedCardInfo = this.currentCardInfo;
        if (viewedCardInfo == null || !Intrinsics.d(cardState.getId(), viewedCardInfo.getCard().getId())) {
            LoggerExtKt.sendNonFatal$default(null, "The last viewed card does not match the card in the event", "TRAVEL_MAPS", null, 9, null);
        } else {
            map.put("pointsAmount", Integer.valueOf(viewedCardInfo.getCardPosition()));
            map.put("aspect", viewedCardInfo.getFirstCardId());
        }
    }

    private final void fillDimensionFourParam(Map<String, Object> map, HotelsMapInfoV4VO.Pin pin) {
        map.put("dimension4", String.valueOf(pin.getIsFavorite()));
    }

    private final void fillDimensionOneParam(Map<String, Object> map, HotelsMapInfoV4VO.Pin pin) {
        CommonAtomIconDTO icon;
        CommonAtomIconDTO icon2;
        CommonAtomIconDTO icon3;
        CommonAtomIconDTO icon4;
        String str = null;
        if (pin.getIsFavorite()) {
            IconDTO iconDTO = this.favoriteIcon;
            String icon5 = (iconDTO == null || (icon4 = iconDTO.getIcon()) == null) ? null : icon4.getIcon();
            IconDTO iconDTO2 = this.favoriteIcon;
            if (iconDTO2 != null && (icon3 = iconDTO2.getIcon()) != null) {
                str = icon3.getTintColor();
            }
            map.put("dimension1", icon5 + ProductContainerDTO.RATIO_DELIMITER + str);
            return;
        }
        if (pin.getHasDiscount() && pin.getIsTop()) {
            IconDTO iconDTO3 = this.pinIcons.get(pin.getRightIconId());
            String icon6 = (iconDTO3 == null || (icon2 = iconDTO3.getIcon()) == null) ? null : icon2.getIcon();
            if (iconDTO3 != null && (icon = iconDTO3.getIcon()) != null) {
                str = icon.getTintColor();
            }
            map.put("dimension1", icon6 + ProductContainerDTO.RATIO_DELIMITER + str);
        }
    }

    private final void fillDimensionThreeParam(Map<String, Object> map, HotelsMapInfoV4VO.Pin pin) {
        map.put("dimension3", String.valueOf(pin.getInnerIds().size()));
    }

    private final void fillDimensionTwoParam(Map<String, Object> map, HotelsMapInfoV4VO.Pin pin) {
        map.put("dimension2", (!(pin.getTitle() == null && pin.getPrice() == null) && pin.getIsTop()) ? "1" : "0");
    }

    private final void fillElementTypeParam(Map<String, Object> map, HotelsMapInfoV4VO.Pin pin) {
        map.put("elementType", pin.getIsTop() ? "Топ выдачи" : "Приоритетные");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillPinParams(Map<String, Object> map, HotelsMapInfoV4VO.Pin pin) {
        fillDimensionOneParam(map, pin);
        fillDimensionTwoParam(map, pin);
        if (pin.getIsIndivisiblePin()) {
            fillDimensionThreeParam(map, pin);
        }
        fillDimensionFourParam(map, pin);
        fillElementTypeParam(map, pin);
    }

    public final void setEvents(HotelsMapInfoV4VO.TrackingEvents events) {
        this.events = events;
    }

    public final void setPinIcons(Map<Integer, IconDTO> icons, IconDTO favoriteIcon) {
        this.favoriteIcon = favoriteIcon;
        if (icons == null) {
            icons = U.c();
        }
        this.pinIcons = icons;
    }

    public final void setStartPoint(m point) {
        if (point == null) {
            return;
        }
        Location location = new Location("startPoint");
        location.setLatitude(point.getLatitude());
        location.setLongitude(point.getLongitude());
        this.startPoint = location;
    }

    public final void setWidgetId(long id2) {
        this.widgetId = Long.valueOf(id2);
    }

    public final void trackCardClick(final HotelsMapInfoV4VO.Card card, final HotelsMapInfoV4VO.Pin pin) {
        t tokenizedEvent;
        if (pin == null || card == null || (tokenizedEvent = card.getTokenizedEvent()) == null) {
            return;
        }
        WZ.m.a(this.tokenizedAnalytics, tokenizedEvent, new e() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper$trackCardClick$lambda$6$$inlined$getCustomParamsModifier$1
            @Override // WZ.e
            public final g modifyParams(a aVar, g params) {
                Intrinsics.checkNotNullParameter(aVar, "<unused var>");
                Intrinsics.checkNotNullParameter(params, "params");
                LinkedHashMap a11 = h.a(params.b());
                AnalyticsHelper.this.fillPinParams(a11, pin);
                AnalyticsHelper.this.checkAndFillCardParams(a11, card);
                return g.a(params, a11, null, 2);
            }
        });
    }

    public final void trackCardView(@NotNull final ViewedCardInfo info, final HotelsMapInfoV4VO.Pin pin) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (pin == null) {
            return;
        }
        this.currentCardInfo = info;
        HotelsMapInfoV4VO.CardState card = info.getCard();
        t tokenizedEvent = card instanceof HotelsMapInfoV4VO.Card ? ((HotelsMapInfoV4VO.Card) info.getCard()).getTokenizedEvent() : card instanceof HotelsMapInfoV4VO.PriceLoader ? ((HotelsMapInfoV4VO.PriceLoader) info.getCard()).getPartialState().getTokenizedEvent() : null;
        if (tokenizedEvent != null) {
            WZ.m.b(this.tokenizedAnalytics, tokenizedEvent, new e() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper$trackCardView$lambda$4$$inlined$getCustomParamsModifier$1
                @Override // WZ.e
                public final g modifyParams(a aVar, g params) {
                    Intrinsics.checkNotNullParameter(aVar, "<unused var>");
                    Intrinsics.checkNotNullParameter(params, "params");
                    LinkedHashMap a11 = h.a(params.b());
                    a11.put("pointsAmount", Integer.valueOf(ViewedCardInfo.this.getCardPosition()));
                    a11.put("aspect", ViewedCardInfo.this.getFirstCardId());
                    this.fillPinParams(a11, pin);
                    return g.a(params, a11, null, 2);
                }
            });
        }
    }

    public final void trackDistrictToggle(Map<String, TokenizedTrackingInfo> districtToggleTrackingInfo, boolean isSelected) {
        if (districtToggleTrackingInfo != null) {
            WZ.m.a(this.tokenizedAnalytics, TrackingInfoMapperKt.mapToTokenizedEvent(districtToggleTrackingInfo, this.widgetId, isSelected ? ActionType.SET.INSTANCE.getType() : "unset"), null);
        }
    }

    public final void trackFavoriteChange(final HotelsMapInfoV4VO.Card card, final HotelsMapInfoV4VO.Pin pin, boolean isFavorite) {
        if (card == null || pin == null) {
            return;
        }
        t addToFavoriteEvent = isFavorite ? card.getAddToFavoriteEvent() : card.getRemoveFromFavoriteEvent();
        if (addToFavoriteEvent != null) {
            WZ.m.a(this.tokenizedAnalytics, addToFavoriteEvent, new e() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper$trackFavoriteChange$lambda$16$$inlined$getCustomParamsModifier$1
                @Override // WZ.e
                public final g modifyParams(a aVar, g params) {
                    Intrinsics.checkNotNullParameter(aVar, "<unused var>");
                    Intrinsics.checkNotNullParameter(params, "params");
                    LinkedHashMap a11 = h.a(params.b());
                    AnalyticsHelper.this.fillPinParams(a11, pin);
                    AnalyticsHelper.this.checkAndFillCardParams(a11, card);
                    return g.a(params, a11, null, 2);
                }
            });
        }
    }

    public final void trackLoaderStatus(final boolean isShown) {
        t loaderTrackingInfo;
        HotelsMapInfoV4VO.TrackingEvents trackingEvents = this.events;
        if (trackingEvents == null || (loaderTrackingInfo = trackingEvents.getLoaderTrackingInfo()) == null) {
            return;
        }
        WZ.m.b(this.tokenizedAnalytics, loaderTrackingInfo, new e() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper$trackLoaderStatus$lambda$12$$inlined$getCustomParamsModifier$1
            @Override // WZ.e
            public final g modifyParams(a aVar, g params) {
                Intrinsics.checkNotNullParameter(aVar, "<unused var>");
                Intrinsics.checkNotNullParameter(params, "params");
                LinkedHashMap a11 = h.a(params.b());
                a11.put("status", isShown ? "start" : "end");
                return g.a(params, a11, null, 2);
            }
        });
    }

    public final void trackMapView(@NotNull final i currentVisibleArea, @NotNull m currentLatLng) {
        t readyTrackingInfo;
        Intrinsics.checkNotNullParameter(currentVisibleArea, "currentVisibleArea");
        Intrinsics.checkNotNullParameter(currentLatLng, "currentLatLng");
        Location location = this.startPoint;
        if (location == null) {
            return;
        }
        Location location2 = new Location("endPoint");
        location2.setLatitude(currentLatLng.getLatitude());
        location2.setLongitude(currentLatLng.getLongitude());
        final int distanceTo = (int) location.distanceTo(location2);
        HotelsMapInfoV4VO.TrackingEvents trackingEvents = this.events;
        if (trackingEvents == null || (readyTrackingInfo = trackingEvents.getReadyTrackingInfo()) == null) {
            return;
        }
        WZ.m.b(this.tokenizedAnalytics, readyTrackingInfo, new e() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper$trackMapView$lambda$8$$inlined$getCustomParamsModifier$1
            @Override // WZ.e
            public final g modifyParams(a aVar, g params) {
                Intrinsics.checkNotNullParameter(aVar, "<unused var>");
                Intrinsics.checkNotNullParameter(params, "params");
                LinkedHashMap a11 = h.a(params.b());
                a11.put("dimension1", String.valueOf(i.this.f().getLongitude()));
                a11.put("dimension2", String.valueOf(i.this.f().getLatitude()));
                a11.put("dimension3", String.valueOf(i.this.e().getLongitude()));
                a11.put("dimension4", String.valueOf(i.this.e().getLatitude()));
                a11.put("totalQuantity", Integer.valueOf(distanceTo));
                return g.a(params, a11, null, 2);
            }
        });
    }

    public final void trackPinClick(@NotNull final HotelsMapInfoV4VO.Pin pin) {
        t pinCommonTrackingInfo;
        Intrinsics.checkNotNullParameter(pin, "pin");
        HotelsMapInfoV4VO.TrackingEvents trackingEvents = this.events;
        if (trackingEvents == null || (pinCommonTrackingInfo = trackingEvents.getPinCommonTrackingInfo()) == null) {
            return;
        }
        WZ.m.a(this.tokenizedAnalytics, pinCommonTrackingInfo, new e() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper$trackPinClick$lambda$2$$inlined$getCustomParamsModifier$1
            @Override // WZ.e
            public final g modifyParams(a aVar, g params) {
                Intrinsics.checkNotNullParameter(aVar, "<unused var>");
                Intrinsics.checkNotNullParameter(params, "params");
                LinkedHashMap a11 = h.a(params.b());
                Long y02 = kotlin.text.h.y0(HotelsMapInfoV4VO.Pin.this.getId());
                a11.put("routeId", Long.valueOf(y02 != null ? y02.longValue() : 0L));
                this.fillPinParams(a11, HotelsMapInfoV4VO.Pin.this);
                return g.a(params, a11, null, 2);
            }
        });
    }

    public final void trackPolygonBadgeClick(t event) {
        if (event != null) {
            WZ.m.a(this.tokenizedAnalytics, event, null);
        }
    }

    public final void trackSlideImage(t event, final int imagePosition) {
        if (event != null) {
            WZ.m.a(this.tokenizedAnalytics, event, new e() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper$trackSlideImage$lambda$14$$inlined$getCustomParamsModifier$1
                @Override // WZ.e
                public final g modifyParams(a aVar, g params) {
                    Intrinsics.checkNotNullParameter(aVar, "<unused var>");
                    Intrinsics.checkNotNullParameter(params, "params");
                    LinkedHashMap a11 = h.a(params.b());
                    a11.put("number", Integer.valueOf(imagePosition));
                    return g.a(params, a11, null, 2);
                }
            });
        }
    }
}
