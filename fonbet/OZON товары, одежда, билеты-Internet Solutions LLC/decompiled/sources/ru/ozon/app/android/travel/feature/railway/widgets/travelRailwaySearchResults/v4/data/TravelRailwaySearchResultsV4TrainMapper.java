package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4TrainMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$RouteInfoDTO;", "routeInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$RouteInfoVO;", "mapRouteInfo", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$RouteInfoDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$RouteInfoVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$CarriageTypeDTO;", "carriageType", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "mapCarriageType", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$CarriageTypeDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO;Ll20/d;)Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TrainMapper implements Function2<TravelRailwaySearchResultsV4DTO, d, List<? extends TravelRailwaySearchResultsV4TrainVO>> {
    private final TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO mapCarriageType(TravelRailwaySearchResultsV4DTO.CarriageTypeDTO carriageType) {
        return new TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO(carriageType.getTypeName().getText().hashCode(), carriageType.getTypeName(), carriageType.getSeatsCount(), carriageType.getTypePrice());
    }

    private final TravelRailwaySearchResultsV4TrainVO.RouteInfoVO mapRouteInfo(TravelRailwaySearchResultsV4DTO.RouteInfoDTO routeInfo) {
        return new TravelRailwaySearchResultsV4TrainVO.RouteInfoVO(routeInfo.getText().getText().hashCode(), routeInfo.getText(), routeInfo.getIcon());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174 A[LOOP:4: B:41:0x016e->B:43:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd A[LOOP:5: B:46:0x01b7->B:48:0x01bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<TravelRailwaySearchResultsV4TrainVO> invoke(@NotNull TravelRailwaySearchResultsV4DTO state, @NotNull d widgetInfo) {
        ?? r29;
        ?? a02;
        Iterator it;
        Iterator it2;
        CommonControlSettings common;
        Throwable th2;
        t tVar;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        List<String> onboardingKeys;
        TravelRailwaySearchResultsV4TrainMapper travelRailwaySearchResultsV4TrainMapper = this;
        TravelRailwaySearchResultsV4DTO state2 = state;
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TravelRailwaySearchResultsV4DTO.Onboardings onboardings = state2.getOnboardings();
        int i11 = 0;
        Throwable th3 = null;
        if (onboardings != null && (onboardingKeys = onboardings.getOnboardingKeys()) != null) {
            int i12 = 0;
            for (Object obj : onboardingKeys) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                linkedHashMap.put((String) obj, C7714v.Q(i12, state2.getOnboardings().getAppOnboardings()));
                i12 = i13;
            }
        }
        List<TravelRailwaySearchResultsV4DTO.TrainDTO> trains = state2.getTrains();
        int i14 = 10;
        ArrayList arrayList = new ArrayList(C7714v.z(trains, 10));
        for (Object obj2 : trains) {
            int i15 = i11 + 1;
            if (i11 < 0) {
                Throwable th4 = th3;
                C7714v.O0();
                throw th4;
            }
            TravelRailwaySearchResultsV4DTO.TrainDTO trainDTO = (TravelRailwaySearchResultsV4DTO.TrainDTO) obj2;
            List<TextDTO> trainNames = trainDTO.getSummary().getTrainNames();
            ArrayList arrayList2 = new ArrayList(C7714v.z(trainNames, i14));
            Iterator it3 = trainNames.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((TextDTO) it3.next()).getText());
            }
            OzonSpannableString text = trainDTO.getTimeInfo().getTravelTime().getText();
            long hashCode = (arrayList2 + "-" + ((Object) text) + "-" + widgetInfo.d()).hashCode();
            List<String> onboardingKeys2 = trainDTO.getOnboardingKeys();
            if (onboardingKeys2 != null) {
                a02 = new ArrayList();
                Iterator it4 = onboardingKeys2.iterator();
                while (it4.hasNext()) {
                    OnBoardingDTO onBoardingDTO = (OnBoardingDTO) linkedHashMap.get((String) it4.next());
                    if (onBoardingDTO != null) {
                        a02.add(onBoardingDTO);
                    }
                }
            } else if (i11 != 0 || state2.getOnboardingApp() == null) {
                r29 = th3;
                List<BadgeDTO> promotionBadges = trainDTO.getPromotionBadges();
                boolean z11 = !trainDTO.getPromotionBadges().isEmpty();
                TravelRailwaySearchResultsV4TrainVO.TrainSummaryVO trainSummaryVO = new TravelRailwaySearchResultsV4TrainVO.TrainSummaryVO(trainDTO.getSummary().getTrainIcons(), trainDTO.getSummary().getTrainNames(), trainDTO.getSummary().getMobRouteButton());
                TravelRailwaySearchResultsV4TrainVO.TimeInfoVO timeInfoVO = new TravelRailwaySearchResultsV4TrainVO.TimeInfoVO(trainDTO.getTimeInfo().getDepartureArrivalTimes(), trainDTO.getTimeInfo().getDayDifference(), trainDTO.getTimeInfo().getTravelTime());
                List<TravelRailwaySearchResultsV4DTO.RouteInfoDTO> routeInfo = trainDTO.getRouteInfo();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                ArrayList arrayList3 = new ArrayList(C7714v.z(routeInfo, 10));
                it = routeInfo.iterator();
                while (it.hasNext()) {
                    arrayList3.add(travelRailwaySearchResultsV4TrainMapper.mapRouteInfo((TravelRailwaySearchResultsV4DTO.RouteInfoDTO) it.next()));
                }
                boolean z12 = !trainDTO.getRouteInfo().isEmpty();
                List<IconButtonV3DTO> services = trainDTO.getServices();
                boolean z13 = !trainDTO.getServices().isEmpty();
                BadgeDTO notificationBadge = trainDTO.getNotificationBadge();
                List<TravelRailwaySearchResultsV4DTO.CarriageTypeDTO> carriageTypes = trainDTO.getCarriageTypes();
                ArrayList arrayList4 = new ArrayList(C7714v.z(carriageTypes, 10));
                it2 = carriageTypes.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(travelRailwaySearchResultsV4TrainMapper.mapCarriageType((TravelRailwaySearchResultsV4DTO.CarriageTypeDTO) it2.next()));
                }
                boolean z14 = !trainDTO.getCarriageTypes().isEmpty();
                CommonControlSettings common2 = trainDTO.getCommon();
                AtomAction atomAction = common2 == null ? common2.toAtomAction() : null;
                PriceDTO price = trainDTO.getPrice();
                BadgeDTO milesBadge = trainDTO.getMilesBadge();
                TravelRailwaySearchResultsV4DTO.Onboardings onboardings2 = state.getOnboardings();
                List<String> onboardingKeys3 = onboardings2 == null ? onboardings2.getOnboardingKeys() : null;
                common = trainDTO.getCommon();
                if (common != null || (trackingInfo = common.getTrackingInfo()) == null) {
                    th2 = null;
                    tVar = null;
                } else {
                    th2 = null;
                    tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
                }
                arrayList.add(new TravelRailwaySearchResultsV4TrainVO(hashCode, promotionBadges, z11, trainSummaryVO, timeInfoVO, arrayList3, z12, services, z13, notificationBadge, arrayList4, z14, atomAction, price, milesBadge, r29, onboardingKeys3, tVar));
                state2 = state;
                th3 = th2;
                i11 = i15;
                i14 = 10;
                linkedHashMap = linkedHashMap2;
                travelRailwaySearchResultsV4TrainMapper = this;
            } else {
                a02 = C7714v.a0(state2.getOnboardingApp());
            }
            r29 = a02;
            List<BadgeDTO> promotionBadges2 = trainDTO.getPromotionBadges();
            boolean z112 = !trainDTO.getPromotionBadges().isEmpty();
            TravelRailwaySearchResultsV4TrainVO.TrainSummaryVO trainSummaryVO2 = new TravelRailwaySearchResultsV4TrainVO.TrainSummaryVO(trainDTO.getSummary().getTrainIcons(), trainDTO.getSummary().getTrainNames(), trainDTO.getSummary().getMobRouteButton());
            TravelRailwaySearchResultsV4TrainVO.TimeInfoVO timeInfoVO2 = new TravelRailwaySearchResultsV4TrainVO.TimeInfoVO(trainDTO.getTimeInfo().getDepartureArrivalTimes(), trainDTO.getTimeInfo().getDayDifference(), trainDTO.getTimeInfo().getTravelTime());
            List<TravelRailwaySearchResultsV4DTO.RouteInfoDTO> routeInfo2 = trainDTO.getRouteInfo();
            LinkedHashMap linkedHashMap22 = linkedHashMap;
            ArrayList arrayList32 = new ArrayList(C7714v.z(routeInfo2, 10));
            it = routeInfo2.iterator();
            while (it.hasNext()) {
            }
            boolean z122 = !trainDTO.getRouteInfo().isEmpty();
            List<IconButtonV3DTO> services2 = trainDTO.getServices();
            boolean z132 = !trainDTO.getServices().isEmpty();
            BadgeDTO notificationBadge2 = trainDTO.getNotificationBadge();
            List<TravelRailwaySearchResultsV4DTO.CarriageTypeDTO> carriageTypes2 = trainDTO.getCarriageTypes();
            ArrayList arrayList42 = new ArrayList(C7714v.z(carriageTypes2, 10));
            it2 = carriageTypes2.iterator();
            while (it2.hasNext()) {
            }
            boolean z142 = !trainDTO.getCarriageTypes().isEmpty();
            CommonControlSettings common22 = trainDTO.getCommon();
            if (common22 == null) {
            }
            PriceDTO price2 = trainDTO.getPrice();
            BadgeDTO milesBadge2 = trainDTO.getMilesBadge();
            TravelRailwaySearchResultsV4DTO.Onboardings onboardings22 = state.getOnboardings();
            if (onboardings22 == null) {
            }
            common = trainDTO.getCommon();
            if (common != null) {
            }
            th2 = null;
            tVar = null;
            arrayList.add(new TravelRailwaySearchResultsV4TrainVO(hashCode, promotionBadges2, z112, trainSummaryVO2, timeInfoVO2, arrayList32, z122, services2, z132, notificationBadge2, arrayList42, z142, atomAction, price2, milesBadge2, r29, onboardingKeys3, tVar));
            state2 = state;
            th3 = th2;
            i11 = i15;
            i14 = 10;
            linkedHashMap = linkedHashMap22;
            travelRailwaySearchResultsV4TrainMapper = this;
        }
        return arrayList;
    }
}
