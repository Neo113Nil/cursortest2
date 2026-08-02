package ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.data.RailwayTrainInformationDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.RailwayTrainInformationVO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$PriceInfo;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$PriceInfoVO;", "toVO", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$PriceInfo;)Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$PriceInfoVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Segment;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$SegmentVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Segment;)Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$SegmentVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Station;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Station;)Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO;Ll20/d;)Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayTrainInformationMapper implements Function2<RailwayTrainInformationDTO, d, List<? extends RailwayTrainInformationVO>> {
    private final RailwayTrainInformationVO.PriceInfoVO toVO(RailwayTrainInformationDTO.PriceInfo priceInfo) {
        return new RailwayTrainInformationVO.PriceInfoVO(priceInfo.getPrice(), priceInfo.getDescription());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RailwayTrainInformationVO> invoke(@NotNull RailwayTrainInformationDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        TimerDTO timer = state.getTimer();
        RailwayTrainInformationDTO.PriceInfo priceInfo = state.getPriceInfo();
        RailwayTrainInformationVO.PriceInfoVO vo = priceInfo != null ? toVO(priceInfo) : null;
        List<RailwayTrainInformationDTO.Segment> segments = state.getSegments();
        ArrayList arrayList = new ArrayList(C7714v.z(segments, 10));
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((RailwayTrainInformationDTO.Segment) it.next()));
        }
        TextAtom localTimeInfo = state.getLocalTimeInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new RailwayTrainInformationVO(hashCode, title, timer, vo, arrayList, localTimeInfo, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final RailwayTrainInformationVO.SegmentVO toVO(RailwayTrainInformationDTO.Segment segment) {
        long hashCode = (segment.getDepartureStation() + " " + segment.getArrivalStation()).hashCode();
        TextAtom title = segment.getTitle();
        LinkButtonDTO routeButton = segment.getRouteButton();
        return new RailwayTrainInformationVO.SegmentVO(hashCode, title, routeButton != null ? MapperExtKt.toVO(routeButton) : null, toVO(segment.getDepartureStation()), toVO(segment.getArrivalStation()), segment.getDuration(), segment.getCarriageInfo());
    }

    private final RailwayTrainInformationVO.StationVO toVO(RailwayTrainInformationDTO.Station station) {
        return new RailwayTrainInformationVO.StationVO(station.getName(), station.getAdditionalName(), station.getTime(), station.getDate());
    }
}
