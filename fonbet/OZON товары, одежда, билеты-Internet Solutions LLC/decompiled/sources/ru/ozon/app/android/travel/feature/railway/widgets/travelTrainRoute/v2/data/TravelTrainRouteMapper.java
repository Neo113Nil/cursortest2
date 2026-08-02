package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data.TravelTrainRouteDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.DropDownItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.FooterItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.HeaderItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainListItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainStationItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TransferItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TravelTrainRouteVO;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004H\u0002¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010\n\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J*\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010-\u001a\u00020\u00022\n\u0010/\u001a\u00060\u0003j\u0002`.H\u0096\u0002¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "dto", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$InfoBadgeWrapper;", "mapInfoBadge", "(Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$InfoBadgeWrapper;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList;", "trainList", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "headerText", "footerText", "dropDownText", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "mapTrainList", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)Ljava/util/List;", "fullTrainList", "mapShortTrainList", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;)Ljava/util/List;", "list", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$StopSegment;", "findStopSegments", "(Ljava/util/List;)Ljava/util/List;", "mapTrainStopList", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer;", "mapTrainTransfersList", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TransferItem;", "mapTransferItem", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TransferItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList$StopStation;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainStationItem;", "mapTrainStationItem", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList$StopStation;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainStationItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer$Train;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainItem;", "mapTrainItem", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer$Train;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainItem;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO;Ll20/d;)Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteMapper implements Function2<TravelTrainRouteDTO, d, List<? extends TravelTrainRouteVO>> {
    private final List<TravelTrainRouteVO.StopSegment> findStopSegments(List<? extends TrainListItem> list) {
        ArrayList arrayList = new ArrayList();
        int P11 = C7714v.P(list);
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        for (Object obj : list) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TrainListItem trainListItem = (TrainListItem) obj;
            if ((trainListItem instanceof TrainStationItem) && !((TrainStationItem) trainListItem).getIsHidden()) {
                if (i12 == -1) {
                    i12 = i11;
                } else {
                    i13 = i11;
                }
            }
            if (i13 != -1 && (i11 > i13 || i11 == P11)) {
                arrayList.add(new TravelTrainRouteVO.StopSegment(i12, i13));
                i12 = -1;
                i13 = -1;
            }
            i11 = i14;
        }
        return arrayList;
    }

    private final TravelTrainRouteVO.InfoBadgeWrapper mapInfoBadge(InfoBadgeDTO dto) {
        return new TravelTrainRouteVO.InfoBadgeWrapper(dto.getText().getText().hashCode(), MapperExtKt.toVO(dto));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<TrainListItem> mapShortTrainList(List<? extends TrainListItem> fullTrainList, TextAtom dropDownText) {
        if (dropDownText == null) {
            return fullTrainList;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : fullTrainList) {
            TrainListItem trainListItem = (TrainListItem) obj;
            if (!(trainListItem instanceof TrainStationItem) || !((TrainStationItem) trainListItem).getIsHidden()) {
                arrayList.add(obj);
            }
        }
        Iterator it = fullTrainList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((TrainListItem) it.next()) instanceof DropDownItem) {
                break;
            }
            i11++;
        }
        if (i11 != -1) {
            arrayList.set(i11, new DropDownItem(dropDownText.getText().hashCode(), dropDownText, R$drawable.ic_m_disclosure_down));
        }
        return arrayList;
    }

    private final TrainItem mapTrainItem(TravelTrainRouteDTO.TrainTransfer.Train dto) {
        return new TrainItem(dto.getName().getText().hashCode(), dto.getIcon(), dto.getName(), dto.getDescription());
    }

    private final List<TrainListItem> mapTrainList(List<TravelTrainRouteDTO.TrainStopList> trainList, TextAtom headerText, TextAtom footerText, TextAtom dropDownText) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HeaderItem(headerText.getText().hashCode(), headerText));
        if (dropDownText != null) {
            arrayList.add(new DropDownItem(dropDownText.getText().hashCode(), dropDownText, R$drawable.ic_m_disclosure_up));
        }
        C7714v.p(mapTrainStopList(trainList), arrayList);
        arrayList.add(new FooterItem(footerText.getText().hashCode(), footerText));
        return arrayList;
    }

    private final TrainStationItem mapTrainStationItem(TravelTrainRouteDTO.TrainStopList.StopStation dto) {
        return new TrainStationItem(dto.getStation().getText().hashCode(), dto.getArrivalTime(), dto.getStopTime(), dto.getDepartureTime(), dto.getStation(), dto.isHidden(), dto.getStopTime() != null);
    }

    private final List<TrainListItem> mapTrainStopList(List<TravelTrainRouteDTO.TrainStopList> list) {
        TransferItem mapTransferItem;
        ArrayList arrayList = new ArrayList();
        for (TravelTrainRouteDTO.TrainStopList trainStopList : list) {
            TravelTrainRouteDTO.Transfer transfer = trainStopList.getTransfer();
            if (transfer != null && (mapTransferItem = mapTransferItem(transfer)) != null) {
                arrayList.add(mapTransferItem);
            }
            List<TravelTrainRouteDTO.TrainStopList.StopStation> stations = trainStopList.getStations();
            ArrayList arrayList2 = new ArrayList(C7714v.z(stations, 10));
            Iterator<T> it = stations.iterator();
            while (it.hasNext()) {
                arrayList2.add(mapTrainStationItem((TravelTrainRouteDTO.TrainStopList.StopStation) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private final List<TrainListItem> mapTrainTransfersList(List<TravelTrainRouteDTO.TrainTransfer> list) {
        TransferItem mapTransferItem;
        ArrayList arrayList = new ArrayList();
        for (TravelTrainRouteDTO.TrainTransfer trainTransfer : list) {
            TravelTrainRouteDTO.Transfer transfer = trainTransfer.getTransfer();
            if (transfer != null && (mapTransferItem = mapTransferItem(transfer)) != null) {
                arrayList.add(mapTransferItem);
            }
            arrayList.add(mapTrainItem(trainTransfer.getTrain()));
        }
        return arrayList;
    }

    private final TransferItem mapTransferItem(TravelTrainRouteDTO.Transfer dto) {
        return new TransferItem(dto.getTitle().getText().hashCode(), dto.getIcon(), dto.getTitle(), dto.getTime(), dto.getStationTransition());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelTrainRouteVO> invoke(@NotNull TravelTrainRouteDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (state.getTrainsList().isEmpty()) {
            return K.f71697a;
        }
        List<TrainListItem> mapTrainList = mapTrainList(state.getTrainsList(), state.getStopsHeader(), state.getRouteDescription(), state.getHideDetails());
        List<TrainListItem> mapShortTrainList = mapShortTrainList(mapTrainList, state.getShowDetails());
        long hashCode = widgetInfo.d().hashCode();
        TextAtom routeTitle = state.getRouteTitle();
        List<InfoBadgeDTO> notificationBadge = state.getNotificationBadge();
        ArrayList arrayList = new ArrayList(C7714v.z(notificationBadge, 10));
        Iterator<T> it = notificationBadge.iterator();
        while (it.hasNext()) {
            arrayList.add(mapInfoBadge((InfoBadgeDTO) it.next()));
        }
        return C7714v.a0(new TravelTrainRouteVO(hashCode, routeTitle, arrayList, !state.getNotificationBadge().isEmpty(), state.getDate(), mapTrainTransfersList(state.getTrainsTransfer()), !state.getTrainsTransfer().isEmpty(), mapShortTrainList, mapTrainList, findStopSegments(mapShortTrainList), findStopSegments(mapTrainList)));
    }
}
