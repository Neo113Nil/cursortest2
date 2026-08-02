package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3;

import WZ.t;
import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.AviaSearchResultV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.FlightV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.molecules.dto.banner.BannerDTO;
import ru.ozon.app.android.travel.molecules.dto.dropDownBanner.DropDownBannerDTO;
import ru.ozon.app.android.travel.molecules.dto.errorState.ErrorStateDTO;
import ru.ozon.app.android.travel.molecules.dto.imageBanner.ImageBannerDTO;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateVO;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TripRouteVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\u00020(2\u0006\u0010\f\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00060,j\u0002`-*\u00020+H\u0002¢\u0006\u0004\b.\u0010/J/\u0010.\u001a\u000601j\u0002`2*\u0002002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u00103J%\u00106\u001a\u0004\u0018\u00010\u00192\b\u00104\u001a\u0004\u0018\u00010\u00192\b\u00105\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b6\u00107J*\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u00108\u001a\u00020\u00022\n\u0010:\u001a\u00060\u0003j\u0002`9H\u0096\u0002¢\u0006\u0004\b;\u0010<J'\u0010>\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010=\u001a\u00020\r¢\u0006\u0004\b>\u0010?J\u008d\u0001\u0010R\u001a\u00020#2\u0006\u0010\f\u001a\u00020#2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010C\u001a\u0004\u0018\u00010A2\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010I\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010H2\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0014\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020O\u0018\u00010N2\u0006\u0010Q\u001a\u00020!¢\u0006\u0004\bR\u0010SR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010T¨\u0006U"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/dto/imageBanner/ImageBannerDTO;", "item", "", "index", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$ImageBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/ImageBannerItem;", "mapImageBanner", "(Lru/ozon/app/android/travel/molecules/dto/imageBanner/ImageBannerDTO;I)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$ImageBannerItem;", "Lru/ozon/app/android/travel/molecules/dto/dropDownBanner/DropDownBannerDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/DropDownBannerItem;", "mapDropDownBanner", "(Lru/ozon/app/android/travel/molecules/dto/dropDownBanner/DropDownBannerDTO;I)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "Lru/ozon/app/android/travel/molecules/dto/banner/BannerDTO;", "", "widgetId", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BannerItem;", "mapBanner", "(Lru/ozon/app/android/travel/molecules/dto/banner/BannerDTO;JI)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO;", "", "stateId", "", "isBonusPay", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "mapAviaSearchResultItemDTO", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO;Ljava/lang/String;IZJ)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;", "flightId", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "mapLuggage", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;JJ)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$RouteBlockDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$RouteBlockVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/RouteBlockVO;", "toVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$RouteBlockDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$RouteBlockVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO$BonusToggle;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/BonusToggleItem;", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO$BonusToggle;ZJI)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;", "timeout", "timeoutDate", "getTimeout", "(Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/Long;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;Ll20/d;)Ljava/util/List;", "offset", "mapSearchResult", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;Ljava/lang/String;I)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "luggageTabs", "Lru/ozon/uni/atoms/data/badge/Badge;", "premiumBadge", "bonusPremiumBadge", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "simplePrice", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "bonusPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButton", "bonusSmallButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "cardClickAction", "bonusCardClickAction", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cardClickTrackingInfo", "isProgressVisible", "updateFlightItem", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Z)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV3Mapper implements Function2<AviaSearchResultV3DTO, d, List<? extends AviaSearchResultVO>> {

    @NotNull
    private final Context context;

    public AviaSearchResultV3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Long getTimeout(Long timeout, String timeoutDate) {
        if (timeout != null) {
            return Long.valueOf(timeout.longValue() + SystemClock.elapsedRealtime());
        }
        if (timeoutDate == null) {
            return null;
        }
        return Long.valueOf((DateTime.i(timeoutDate).getMillis() + SystemClock.elapsedRealtime()) - new DateTime().getMillis());
    }

    private final AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 mapAviaSearchResultItemDTO(FlightV3DTO item, String stateId, int index, boolean isBonusPay, long widgetId) {
        long hashCode = (index + "-" + stateId + "-FlightItem").hashCode();
        List<FlightV3DTO.RouteBlockDTO> routeBlocks = item.getRouteBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(routeBlocks, 10));
        Iterator<T> it = routeBlocks.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((FlightV3DTO.RouteBlockDTO) it.next()));
        }
        AviaSearchResultV3Mapper aviaSearchResultV3Mapper = this;
        List<FlightV3DTO.LuggageTabDTO> luggageTabs = item.getLuggageTabs();
        ArrayList arrayList2 = new ArrayList(C7714v.z(luggageTabs, 10));
        Iterator<T> it2 = luggageTabs.iterator();
        while (it2.hasNext()) {
            long j11 = hashCode;
            arrayList2.add(aviaSearchResultV3Mapper.mapLuggage((FlightV3DTO.LuggageTabDTO) it2.next(), j11, widgetId));
            aviaSearchResultV3Mapper = this;
            hashCode = j11;
        }
        long j12 = hashCode;
        boolean z11 = !item.getLuggageTabs().isEmpty();
        FlightV3DTO.SimplePrice simplePrice = item.getSimplePrice();
        TextAtom remainingTickets = item.getRemainingTickets();
        ButtonV3Atom.SmallButton smallButton = item.getSmallButton();
        ButtonV3Atom.SmallButton bonusSmallButton = item.getBonusSmallButton();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(item.getCardClickAction(), item.getCardClickTrackingInfo());
        List<Badge> routeBadges = item.getRouteBadges();
        boolean z12 = !(routeBadges == null || routeBadges.isEmpty());
        List<Badge> routeBadges2 = item.getRouteBadges();
        if (routeBadges2 == null) {
            routeBadges2 = K.f71697a;
        }
        List<Badge> list = routeBadges2;
        String borderColor = item.getBorderColor();
        String bonusBackgroundColor = item.getBonusBackgroundColor();
        Badge premiumBadge = item.getPremiumBadge();
        Badge bonusPremiumBadge = item.getBonusPremiumBadge();
        boolean z13 = item.getPremiumBadge() != null;
        FlightV3DTO.BonusPrice bonusPrice = item.getBonusPrice();
        AtomActionDTO bonusCardClickAction = item.getBonusCardClickAction();
        AtomAction atomAction2 = bonusCardClickAction != null ? AtomActionMapperKt.toAtomAction(bonusCardClickAction, item.getCardClickTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = item.getViewTrackingInfo();
        return new AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3(j12, false, widgetId, arrayList, arrayList2, z11, simplePrice, bonusPrice, remainingTickets, smallButton, bonusSmallButton, z12, list, borderColor, bonusBackgroundColor, premiumBadge, bonusPremiumBadge, z13, atomAction, atomAction2, viewTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null, isBonusPay, 2, null);
    }

    private final AviaSearchResultVO.AviaSearchResultItemVO.BannerItem mapBanner(BannerDTO item, long widgetId, int index) {
        TextDTO title = item.getTitle();
        return new AviaSearchResultVO.AviaSearchResultItemVO.BannerItem((title + index + "-Banner").hashCode(), MapperExtKt.toVo(item, this.context, Long.valueOf(widgetId)));
    }

    private final AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem mapDropDownBanner(DropDownBannerDTO item, int index) {
        TextAtom title = item.getTitle();
        return new AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem((title + index + "-DropDownBanner").hashCode(), MapperExtKt.toVo(item, this.context));
    }

    private final AviaSearchResultVO.AviaSearchResultItemVO.ImageBannerItem mapImageBanner(ImageBannerDTO item, int index) {
        String darkImageUrl = item.getDarkImageUrl();
        String lightImageUrl = item.getLightImageUrl();
        return new AviaSearchResultVO.AviaSearchResultItemVO.ImageBannerItem((darkImageUrl + lightImageUrl + index + "-ImageBanner").hashCode(), MapperExtKt.toVO(item, this.context, 20));
    }

    private final AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO mapLuggage(FlightV3DTO.LuggageTabDTO item, long flightId, long widgetId) {
        long hashCode = (item.getHandCarryCount() + "-" + item.getHandCarryWeight() + "-" + item.getLuggageCount() + "-" + item.getLuggageWeight() + "-" + flightId).hashCode();
        String image = item.getHandCarryIcon().getImage();
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(this.context, item.getHandCarryIcon().getTintColor());
        String image2 = item.getLuggageIcon().getImage();
        Integer parseColor2 = styleParser.parseColor(this.context, item.getLuggageIcon().getTintColor());
        String handCarryWeight = item.getHandCarryWeight();
        String luggageWeight = item.getLuggageWeight();
        String handCarryCount = item.getHandCarryCount();
        boolean z11 = !(handCarryCount == null || h.K(handCarryCount));
        boolean z12 = false;
        String handCarryCount2 = item.getHandCarryCount();
        String luggageCount = item.getLuggageCount();
        if (luggageCount == null || h.K(luggageCount)) {
            z12 = true;
        }
        boolean z13 = true ^ z12;
        String luggageCount2 = item.getLuggageCount();
        TextAtom price = item.getPrice();
        AtomActionDTO action = item.getAction();
        boolean isSelected = item.isSelected();
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        return new AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO(hashCode, image, parseColor, image2, parseColor2, handCarryWeight, luggageWeight, z11, handCarryCount2, z13, luggageCount2, price, action, isSelected, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null, item.getTotalPrice(), false, flightId, 65536, null);
    }

    public static /* synthetic */ AviaSearchResultVO mapSearchResult$default(AviaSearchResultV3Mapper aviaSearchResultV3Mapper, AviaSearchResultV3DTO aviaSearchResultV3DTO, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return aviaSearchResultV3Mapper.mapSearchResult(aviaSearchResultV3DTO, str, i11);
    }

    private final AviaSearchResultVO.AviaSearchResultItemVO.RouteBlockVO toVO(FlightV3DTO.RouteBlockDTO routeBlockDTO) {
        ArrayList arrayList;
        TripRouteVO vo = MapperExtKt.toVO(routeBlockDTO.getRoute());
        List<InfoBadgeDTO> badges = routeBlockDTO.getBadges();
        if (badges != null) {
            List<InfoBadgeDTO> list = badges;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(MapperExtKt.toVO((InfoBadgeDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new AviaSearchResultVO.AviaSearchResultItemVO.RouteBlockVO(vo, arrayList);
    }

    @NotNull
    public final AviaSearchResultVO mapSearchResult(@NotNull AviaSearchResultV3DTO dto, @NotNull String stateId, int offset) {
        String str;
        int i11;
        long j11;
        boolean z11;
        AviaSearchResultV3Mapper aviaSearchResultV3Mapper = this;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String stateId2 = stateId;
        Intrinsics.checkNotNullParameter(stateId2, "stateId");
        long hashCode = stateId2.hashCode();
        List<Object> resultItems = dto.getResultItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = resultItems.iterator();
        int i12 = 0;
        while (true) {
            AviaSearchResultVO.AviaSearchResultItemVO aviaSearchResultItemVO = null;
            if (!it.hasNext()) {
                ArrayList W02 = C7714v.W0(arrayList);
                ErrorStateVO errorStateVO = null;
                Long timeout = aviaSearchResultV3Mapper.getTimeout(dto.getTimeoutMs(), dto.getTimeoutDate());
                ErrorStateDTO timeoutMessage = dto.getTimeoutMessage();
                ErrorStateVO vo = timeoutMessage != null ? MapperExtKt.toVO(timeoutMessage) : null;
                ErrorStateDTO errorMessage = dto.getErrorMessage();
                if (errorMessage != null) {
                    errorStateVO = MapperExtKt.toVO(errorMessage);
                }
                ErrorStateVO errorStateVO2 = errorStateVO;
                boolean z12 = false;
                AtomActionDTO pollingAction = dto.getPollingAction();
                AtomActionDTO lazyLoadAction = dto.getLazyLoadAction();
                boolean isAllDone = dto.isAllDone();
                Boolean isBonusPay = dto.isBonusPay();
                boolean booleanValue = isBonusPay != null ? isBonusPay.booleanValue() : false;
                if (dto.isBonusPay() != null) {
                    z12 = true;
                }
                return new AviaSearchResultVO(hashCode, stateId, W02, timeout, vo, errorStateVO2, pollingAction, lazyLoadAction, isAllDone, booleanValue, z12);
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            if (next instanceof ImageBannerDTO) {
                aviaSearchResultItemVO = aviaSearchResultV3Mapper.mapImageBanner((ImageBannerDTO) next, i12);
            } else if (next instanceof DropDownBannerDTO) {
                aviaSearchResultItemVO = aviaSearchResultV3Mapper.mapDropDownBanner((DropDownBannerDTO) next, i12);
            } else if (next instanceof BannerDTO) {
                aviaSearchResultItemVO = aviaSearchResultV3Mapper.mapBanner((BannerDTO) next, hashCode, i12);
            } else {
                if (next instanceof AviaSearchResultV3DTO.BonusToggle) {
                    AviaSearchResultV3DTO.BonusToggle bonusToggle = (AviaSearchResultV3DTO.BonusToggle) next;
                    Boolean isBonusPay2 = dto.isBonusPay();
                    aviaSearchResultItemVO = aviaSearchResultV3Mapper.toVO(bonusToggle, isBonusPay2 != null ? isBonusPay2.booleanValue() : false, hashCode, i12);
                } else if (next instanceof FlightV3DTO) {
                    FlightV3DTO flightV3DTO = (FlightV3DTO) next;
                    int i14 = i12 + offset;
                    Boolean isBonusPay3 = dto.isBonusPay();
                    if (isBonusPay3 != null) {
                        str = stateId2;
                        long j12 = hashCode;
                        z11 = isBonusPay3.booleanValue();
                        i11 = i14;
                        j11 = j12;
                    } else {
                        str = stateId2;
                        long j13 = hashCode;
                        i11 = i14;
                        j11 = j13;
                        z11 = false;
                    }
                    aviaSearchResultV3Mapper = this;
                    AviaSearchResultVO.AviaSearchResultItemVO mapAviaSearchResultItemDTO = aviaSearchResultV3Mapper.mapAviaSearchResultItemDTO(flightV3DTO, str, i11, z11, j11);
                    hashCode = j11;
                    aviaSearchResultItemVO = mapAviaSearchResultItemDTO;
                }
                aviaSearchResultV3Mapper = this;
            }
            if (aviaSearchResultItemVO != null) {
                arrayList.add(aviaSearchResultItemVO);
            }
            stateId2 = stateId;
            i12 = i13;
        }
    }

    @NotNull
    public final AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 updateFlightItem(@NotNull AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 item, @NotNull List<FlightV3DTO.LuggageTabDTO> luggageTabs, Badge premiumBadge, Badge bonusPremiumBadge, @NotNull FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, @NotNull ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton bonusSmallButton, AtomActionDTO cardClickAction, AtomActionDTO bonusCardClickAction, Map<String, TokenizedTrackingInfo> cardClickTrackingInfo, boolean isProgressVisible) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(luggageTabs, "luggageTabs");
        Intrinsics.checkNotNullParameter(simplePrice, "simplePrice");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        List<FlightV3DTO.LuggageTabDTO> list = luggageTabs;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapLuggage((FlightV3DTO.LuggageTabDTO) it.next(), item.getId(), item.getWidgetId()));
        }
        return AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3.copy$default(item, 0L, isProgressVisible, 0L, null, arrayList, false, simplePrice, bonusPrice, null, smallButton, bonusSmallButton, false, null, null, null, premiumBadge, bonusPremiumBadge, false, cardClickAction != null ? AtomActionMapperKt.toAtomAction(cardClickAction, cardClickTrackingInfo) : null, bonusCardClickAction != null ? AtomActionMapperKt.toAtomAction(bonusCardClickAction, cardClickTrackingInfo) : null, null, false, 3307821, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaSearchResultVO> invoke(@NotNull AviaSearchResultV3DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapSearchResult$default(this, dto, widgetInfo.d(), 0, 4, null));
    }

    private final AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem toVO(AviaSearchResultV3DTO.BonusToggle bonusToggle, boolean z11, long j11, int i11) {
        long hashCode = (((Object) bonusToggle.getTitle().getText()) + "-" + ((Object) bonusToggle.getSubtitle().getText()) + "-" + i11 + "-BonusToggle").hashCode();
        Icon icon = bonusToggle.getIcon();
        TextAtom title = bonusToggle.getTitle();
        TextAtom subtitle = bonusToggle.getSubtitle();
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = bonusToggle.getViewTrackingInfo();
        t tokenizedEvent$default = viewTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> setTrackingInfo = bonusToggle.getSetTrackingInfo();
        t tokenizedEvent$default2 = setTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(setTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> unsetTrackingInfo = bonusToggle.getUnsetTrackingInfo();
        t tokenizedEvent$default3 = unsetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(unsetTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        AtomActionDTO action = bonusToggle.getAction();
        return new AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem(hashCode, icon, title, subtitle, z11, tokenizedEvent$default, tokenizedEvent$default2, tokenizedEvent$default3, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
    }
}
