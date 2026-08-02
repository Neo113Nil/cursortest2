package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3TrainMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$CarriageTypeDTO;", "carriageType", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$CarriageTypeVO;", "mapCarriageType", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$CarriageTypeDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$CarriageTypeVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO;Ll20/d;)Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3TrainMapper implements Function2<TravelRailwaySearchResultsV3DTO, d, List<? extends TravelRailwaySearchResultsV3TrainVO>> {
    private final TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO mapCarriageType(TravelRailwaySearchResultsV3DTO.CarriageTypeDTO carriageType) {
        return new TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO(carriageType.getTypeName().getText().hashCode(), carriageType.getTypeName(), carriageType.getSeatsCount(), carriageType.getTypePrice());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelRailwaySearchResultsV3TrainVO> invoke(@NotNull TravelRailwaySearchResultsV3DTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<TravelRailwaySearchResultsV3DTO.TrainDTO> trains = state.getTrains();
        ArrayList arrayList = new ArrayList(C7714v.z(trains, 10));
        Iterator it = trains.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TravelRailwaySearchResultsV3DTO.TrainDTO trainDTO = (TravelRailwaySearchResultsV3DTO.TrainDTO) next;
            OzonSpannableString text = trainDTO.getTrainName().getText();
            long hashCode = (((Object) text) + "-" + widgetInfo.d()).hashCode();
            List<BadgeDTO> promotionBadges = trainDTO.getPromotionBadges();
            boolean z11 = !trainDTO.getPromotionBadges().isEmpty();
            TravelRailwaySearchResultsV3TrainVO.TrainInfo trainInfo = new TravelRailwaySearchResultsV3TrainVO.TrainInfo(trainDTO.getTrainIcon(), trainDTO.getTrainName(), trainDTO.getRoute(), trainDTO.getDepartureStation(), trainDTO.getArrivalStation());
            Iterator it2 = it;
            TravelRailwaySearchResultsV3TrainVO.TimeInfo timeInfo = new TravelRailwaySearchResultsV3TrainVO.TimeInfo(trainDTO.getTravelTime(), trainDTO.getTravelTimeCaption(), trainDTO.getDepartureArrivalTimes(), trainDTO.getDayDifference());
            List<IconButtonV3DTO> services = trainDTO.getServices();
            boolean z12 = !trainDTO.getServices().isEmpty();
            BadgeDTO notificationBadge = trainDTO.getNotificationBadge();
            List<TravelRailwaySearchResultsV3DTO.CarriageTypeDTO> carriageTypes = trainDTO.getCarriageTypes();
            ArrayList arrayList2 = new ArrayList(C7714v.z(carriageTypes, 10));
            Iterator<T> it3 = carriageTypes.iterator();
            while (it3.hasNext()) {
                arrayList2.add(mapCarriageType((TravelRailwaySearchResultsV3DTO.CarriageTypeDTO) it3.next()));
            }
            CommonControlSettings common = trainDTO.getCommon();
            AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, trainDTO.getCommon().getTrackingInfo());
            PriceDTO price = trainDTO.getPrice();
            BadgeDTO milesBadge = trainDTO.getMilesBadge();
            OnBoardingDTO onboardingApp = state.getOnboardingApp();
            OnBoardingDTO onBoardingDTO = (onboardingApp == null || i11 != 0) ? null : onboardingApp;
            CommonControlSettings common2 = trainDTO.getCommon();
            arrayList.add(new TravelRailwaySearchResultsV3TrainVO(hashCode, promotionBadges, z11, trainInfo, timeInfo, services, z12, notificationBadge, arrayList2, atomAction, price, milesBadge, onBoardingDTO, (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null)));
            i11 = i12;
            it = it2;
        }
        return arrayList;
    }
}
