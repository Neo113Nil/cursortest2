package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import WZ.t;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBoxV2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsMapperExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.shared.data.MapperUtilsKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.FetchPinsActionResponseVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.awardBadge.AwardBadgeVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0015\u001a\u00020\u0014*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0015\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0019J\u0013\u0010\u0015\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u0015\u0010\u001cJ\u0013\u0010\u0015\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u0015\u0010\u001fJ\u001b\u0010\u0015\u001a\u00020!*\u00020 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\"J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b*\u0010+JA\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140-2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010(\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;", "pinMapperDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/CardInfoDTO;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "cardStyle", "", "favoriteIds", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/CardInfoDTO;Ljava/lang/Long;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Ljava/util/List;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinTypes;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinTypes;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$TrackingInfo;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$TrackingInfo;J)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "dto", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "mapPinsResponse", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;Ljava/lang/Long;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchCardsActionResponse;", "", "mapCardsResponse", "(Ljava/lang/Long;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchCardsActionResponse;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Ljava/util/List;)Ljava/util/Map;", "Landroid/content/Context;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4Mapper implements Function2<HotelsMapInfoV4DTO, d, List<? extends HotelsMapInfoV4VO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final PinMapperDelegate pinMapperDelegate;

    public HotelsMapInfoV4Mapper(@NotNull Context context, @NotNull PinMapperDelegate pinMapperDelegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinMapperDelegate, "pinMapperDelegate");
        this.context = context;
        this.pinMapperDelegate = pinMapperDelegate;
    }

    private final HotelsMapInfoV4VO.Card toVO(CardInfoDTO cardInfoDTO, Long l11, HotelsMapInfoV4DTO.CardStyle cardStyle, List<String> list) {
        BadgeDTO badgeDTO;
        FavoriteProductModel favoriteProductModel;
        String str;
        t tVar;
        String str2;
        AwardBadgeVI awardBadgeVI;
        t tVar2;
        IconButtonV3DTO unfavoriteButton;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        IconButtonV3DTO favoriteButton;
        CommonControlSettings common2;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        FavoriteProductModel model;
        Map<String, TokenizedTrackingInfo> trackingInfo3;
        AtomActionDTO action;
        BadgeDTO.CustomStyle customStyle;
        BadgeDTO.CustomStyle customStyle2;
        String id2 = cardInfoDTO.getId();
        List<String> images = cardInfoDTO.getImages();
        ArrayList arrayList = new ArrayList(C7714v.z(images, 10));
        for (String str3 : images) {
            arrayList.add(new HotelsMapInfoV4VO.ImageVO(str3.hashCode(), str3));
        }
        TextDTO copy$default = TextDTO.copy$default(cardStyle.getTitle(), OzonSpannableStringKt.toOzonSpannableString(cardInfoDTO.getTitle()), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        if (cardInfoDTO.getRating() != null) {
            BadgeDTO.CustomStyle customBadgeStyle = cardStyle.getRatingBadge().getCustomBadgeStyle();
            BadgeDTO ratingBadge = cardStyle.getRatingBadge();
            String rating = cardInfoDTO.getRating();
            BadgeDTO.Style styleType = cardStyle.getRatingBadge().getStyleType();
            if (cardInfoDTO.getRatingBackgroundColor() != null) {
                if (customBadgeStyle != null) {
                    BadgeDTO.CustomBackground backgroundColor = customBadgeStyle.getBackgroundColor();
                    customStyle2 = BadgeDTO.CustomStyle.copy$default(customBadgeStyle, backgroundColor != null ? BadgeDTO.CustomBackground.copy$default(backgroundColor, cardInfoDTO.getRatingBackgroundColor(), null, 2, null) : null, null, null, null, null, 30, null);
                } else {
                    customStyle2 = null;
                }
                if (customStyle2 != null) {
                    customStyle = customStyle2;
                    badgeDTO = BadgeDTO.copy$default(ratingBadge, rating, null, null, styleType, customStyle, null, null, null, null, null, null, null, 4070, null);
                }
            }
            customStyle = customBadgeStyle;
            badgeDTO = BadgeDTO.copy$default(ratingBadge, rating, null, null, styleType, customStyle, null, null, null, null, null, null, null, 4070, null);
        } else {
            badgeDTO = null;
        }
        IconDTO reviewsIcon = cardInfoDTO.getReviewsText() != null ? cardStyle.getReviewsIcon() : null;
        TextDTO copy$default2 = cardInfoDTO.getReviewsText() != null ? TextDTO.copy$default(cardStyle.getReviews(), OzonSpannableStringKt.toOzonSpannableString(cardInfoDTO.getReviewsText()), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null) : null;
        String priceText = cardInfoDTO.getPriceText();
        TextDTO copy$default3 = priceText != null ? TextDTO.copy$default(cardInfoDTO.getPrice() == null ? cardStyle.getSoldOutText() : cardStyle.getPriceText(), OzonSpannableStringKt.toOzonSpannableString(priceText), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null) : null;
        BadgeDTO copy$default4 = cardInfoDTO.getBadgeText() != null ? BadgeDTO.copy$default(cardStyle.getMilesBadge(), cardInfoDTO.getBadgeText(), null, null, null, null, null, null, null, null, null, null, null, 4094, null) : null;
        HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant layoutVariant = cardStyle.getLayoutVariant();
        PriceDTO price = cardInfoDTO.getPrice();
        CommonControlSettings common3 = cardInfoDTO.getCommon();
        AtomAction atomAction = (common3 == null || (action = common3.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null);
        CommonControlSettings common4 = cardInfoDTO.getCommon();
        t b11 = (common4 == null || (trackingInfo3 = common4.getTrackingInfo()) == null) ? null : x.b(trackingInfo3, l11, null);
        FavoriteProductMoleculeV4 favoriteButton2 = cardInfoDTO.getFavoriteButton();
        if (favoriteButton2 == null || (model = FavoriteProductModelKt.toModel(favoriteButton2)) == null) {
            favoriteProductModel = null;
        } else {
            boolean contains = list.contains(cardInfoDTO.getId());
            IconButtonV3DTO favoriteButton3 = cardInfoDTO.getFavoriteButton().getFavoriteButton();
            CommonControlSettings common5 = cardInfoDTO.getFavoriteButton().getFavoriteButton().getCommon();
            IconButtonV3DTO copy$default5 = IconButtonV3DTO.copy$default(favoriteButton3, null, null, null, null, null, null, null, common5 != null ? CommonControlSettings.copy$default(common5, null, null, null, 5, null) : null, null, null, null, null, null, null, 16255, null);
            IconButtonV3DTO unfavoriteButton2 = cardInfoDTO.getFavoriteButton().getUnfavoriteButton();
            CommonControlSettings common6 = cardInfoDTO.getFavoriteButton().getUnfavoriteButton().getCommon();
            favoriteProductModel = FavoriteProductModel.copy$default(model, 0L, contains, copy$default5, IconButtonV3DTO.copy$default(unfavoriteButton2, null, null, null, null, null, null, null, common6 != null ? CommonControlSettings.copy$default(common6, null, null, null, 5, null) : null, null, null, null, null, null, null, 16255, null), null, null, 49, null);
        }
        Map<String, TokenizedTrackingInfo> galleryTrackingInfo = cardInfoDTO.getGalleryTrackingInfo();
        t b12 = galleryTrackingInfo != null ? x.b(galleryTrackingInfo, l11, null) : null;
        FavoriteProductMoleculeV4 favoriteButton4 = cardInfoDTO.getFavoriteButton();
        if (favoriteButton4 == null || (favoriteButton = favoriteButton4.getFavoriteButton()) == null || (common2 = favoriteButton.getCommon()) == null || (trackingInfo2 = common2.getTrackingInfo()) == null) {
            str = id2;
            tVar = null;
        } else {
            str = id2;
            tVar = x.b(trackingInfo2, l11, null);
        }
        FavoriteProductMoleculeV4 favoriteButton5 = cardInfoDTO.getFavoriteButton();
        if (favoriteButton5 == null || (unfavoriteButton = favoriteButton5.getUnfavoriteButton()) == null || (common = unfavoriteButton.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null) {
            str2 = str;
            awardBadgeVI = null;
            tVar2 = null;
        } else {
            str2 = str;
            awardBadgeVI = null;
            tVar2 = x.b(trackingInfo, l11, null);
        }
        AwardBadgeDTO awardBadge = cardStyle.getAwardBadge();
        return new HotelsMapInfoV4VO.Card(str2, false, arrayList, copy$default, favoriteProductModel, badgeDTO, reviewsIcon, copy$default2, price, copy$default3, copy$default4, layoutVariant, atomAction, b11, b12, tVar, tVar2, awardBadge != null ? MapperExtKt.toVI(awardBadge) : awardBadgeVI, cardInfoDTO.isOzonChoice(), 2, null);
    }

    @NotNull
    public final Map<String, HotelsMapInfoV4VO.Card> mapCardsResponse(Long widgetId, @NotNull FetchCardsActionResponse dto, @NotNull HotelsMapInfoV4DTO.CardStyle cardStyle, @NotNull List<String> favoriteIds) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(favoriteIds, "favoriteIds");
        List<CardInfoDTO> cards = dto.getCards();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CardInfoDTO cardInfoDTO : cards) {
            linkedHashMap.put(cardInfoDTO.getId(), toVO(cardInfoDTO, widgetId, cardStyle, favoriteIds));
        }
        return linkedHashMap;
    }

    @NotNull
    public final FetchPinsActionResponseVO mapPinsResponse(@NotNull FetchPinsActionResponse dto, Long widgetId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.pinMapperDelegate.mapPinsResponse(dto, widgetId);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsMapInfoV4VO> invoke(@NotNull HotelsMapInfoV4DTO state, @NotNull d widgetInfo) {
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
        NotificationDTO outOfBoundsBar = state.getOutOfBoundsBar();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(mapPinsResponse.getPins());
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        DistrictsDTO districts = state.getDistricts();
        DistrictsVO vo3 = districts != null ? DistrictsMapperExtKt.toVO(districts, hashCode) : null;
        AtomAction.DismissRefresh dismissRefresh = new AtomAction.DismissRefresh(null, state.m1323getMobileSettingsie92oRg(), null, null, null, null, 53, null);
        AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(state.getActions().getFetchCardsAction(), null);
        String regionHash = state.getRegionHash();
        HotelsMapInfoV4DTO.PinLimits pinLimits = state.getPinLimits();
        HotelsMapInfoV4DTO.DelaySettings delaySettings = state.getDelaySettings();
        HotelsMapInfoV4DTO.TrackingInfo tracking = state.getTracking();
        return C7714v.a0(new HotelsMapInfoV4VO(hashCode, latLngBounds, mVar, latLng, vo, atomAction, downloadPinsAction, vo2, cardStyle, outOfBoundsBar, concurrentHashMap, concurrentHashMap2, vo3, dismissRefresh, atomAction2, regionHash, null, pinLimits, delaySettings, tracking != null ? toVO(tracking, hashCode) : null, false, 1114112, null));
    }

    private final HotelsMapInfoV4VO.PinTypes toVO(HotelsMapInfoV4DTO.PinTypes pinTypes, Context context) {
        return new HotelsMapInfoV4VO.PinTypes(toVO(pinTypes.getHighRanked()), MapperUtilsKt.toVO(pinTypes.getLowRanked(), context));
    }

    private final HotelsMapInfoV4VO.PricePinStates toVO(HotelsMapInfoV4DTO.PricePinStates pricePinStates) {
        HotelsMapInfoV4VO.PricePinStates.PinStyles vo = toVO(pricePinStates.getDefault());
        HotelsMapInfoV4DTO.PricePinStates.PinStyles selected = pricePinStates.getSelected();
        HotelsMapInfoV4VO.PricePinStates.PinStyles vo2 = selected != null ? toVO(selected) : null;
        HotelsMapInfoV4DTO.PricePinStates.PinStyles viewed = pricePinStates.getViewed();
        return new HotelsMapInfoV4VO.PricePinStates(vo, vo2, viewed != null ? toVO(viewed) : null, null, null, 24, null);
    }

    private final HotelsMapInfoV4VO.PricePinStates.PinStyles toVO(HotelsMapInfoV4DTO.PricePinStates.PinStyles pinStyles) {
        return new HotelsMapInfoV4VO.PricePinStates.PinStyles(pinStyles.getBackgroundColor(), pinStyles.getBorderColor(), null, pinStyles.getText(), pinStyles.getDiscountIcon(), pinStyles.getFavoriteIcon(), pinStyles.getIcons());
    }

    private final HotelsMapInfoV4VO.TrackingEvents toVO(HotelsMapInfoV4DTO.TrackingInfo trackingInfo, long j11) {
        Map<String, TokenizedTrackingInfo> readyTrackingInfo = trackingInfo.getReadyTrackingInfo();
        t b11 = readyTrackingInfo != null ? x.b(readyTrackingInfo, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> pinCommonTrackingInfo = trackingInfo.getPinCommonTrackingInfo();
        t b12 = pinCommonTrackingInfo != null ? x.b(pinCommonTrackingInfo, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> loaderTrackingInfo = trackingInfo.getLoaderTrackingInfo();
        return new HotelsMapInfoV4VO.TrackingEvents(b11, b12, loaderTrackingInfo != null ? x.b(loaderTrackingInfo, Long.valueOf(j11), null) : null);
    }
}
