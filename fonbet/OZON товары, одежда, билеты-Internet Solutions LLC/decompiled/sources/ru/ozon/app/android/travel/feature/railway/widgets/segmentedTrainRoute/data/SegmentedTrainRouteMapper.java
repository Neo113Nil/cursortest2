package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data;

import Tc.b;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data.SegmentedTrainRouteDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.footer.SegmentedTrainRouteFooterVI;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.header.SegmentedTrainRouteHeaderVI;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.skeleton.SegmentedTrainRouteSkeletonVI;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.stop.SegmentedTrainRouteStopVI;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.title.SegmentedTrainRouteTitleVI;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.transfer.SegmentedTrainRouteTransferVI;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020 H\u0002¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;", "<init>", "()V", "mapAsyncState", "state", "mapToWidget", "", "", "dto", "stateId", "", "asyncData", "mapTitleToVO", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/title/SegmentedTrainRouteTitleVI;", "mapHeaderVO", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/header/SegmentedTrainRouteHeaderVI;", "segment", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$SegmentDTO;", "mapTransferToVO", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/transfer/SegmentedTrainRouteTransferVI;", "mapFooterToVO", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/footer/SegmentedTrainRouteFooterVI;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;", "mapStopsToVO", "stops", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopDTO;", "mapWidgetBehaviorType", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$WidgetBehaviorType;", "mapWidgetBehaviorTypeState", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteMapper implements AsyncWidgetStateMapper<SegmentedTrainRouteDTO, SegmentedTrainRouteSkeletonVI.State> {
    private final SegmentedTrainRouteFooterVI mapFooterToVO(SegmentedTrainRouteDTO.StopsBlockDTO footer, String stateId) {
        OzonSpannableString text = footer.getLocalTimeInfo().getText();
        return new SegmentedTrainRouteFooterVI((stateId + ((Object) text)).hashCode(), footer.getLocalTimeInfo(), footer.getToggleDetailsButton());
    }

    private final SegmentedTrainRouteHeaderVI mapHeaderVO(SegmentedTrainRouteDTO.SegmentDTO segment, String stateId) {
        long hashCode = (stateId + ((Object) segment.getTrainInfo().getCenterBlock().getTitle().getText())).hashCode();
        CellDTO trainInfo = segment.getTrainInfo();
        List<BadgeDTO> serviceBadges = segment.getServiceBadges();
        if (serviceBadges == null) {
            serviceBadges = K.f71697a;
        }
        List<BadgeDTO> list = serviceBadges;
        List<BadgeDTO> serviceBadges2 = segment.getServiceBadges();
        return new SegmentedTrainRouteHeaderVI(hashCode, trainInfo, list, !(serviceBadges2 == null || serviceBadges2.isEmpty()));
    }

    private final List<Object> mapStopsToVO(List<SegmentedTrainRouteDTO.StopDTO> stops, String stateId) {
        List<SegmentedTrainRouteDTO.StopDTO> list = stops;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SegmentedTrainRouteDTO.StopDTO stopDTO = (SegmentedTrainRouteDTO.StopDTO) obj;
            SegmentedTrainRouteStopVI.StopPosition stopPosition = i11 == 0 ? SegmentedTrainRouteStopVI.StopPosition.START : i11 == C7714v.P(stops) ? SegmentedTrainRouteStopVI.StopPosition.END : SegmentedTrainRouteStopVI.StopPosition.MIDDLE;
            OzonSpannableString text = stopDTO.getArrivalTime().getText();
            OzonSpannableString text2 = stopDTO.getCity().getText();
            arrayList.add(new SegmentedTrainRouteStopVI((stateId + ((Object) text) + ((Object) text2)).hashCode(), stopDTO.getArrivalTime(), stopDTO.getDepartureTime(), stopDTO.getCity(), stopDTO.getStation(), stopDTO.isBoardingStop(), stopPosition));
            i11 = i12;
        }
        return arrayList;
    }

    private final SegmentedTrainRouteTitleVI mapTitleToVO(SegmentedTrainRouteDTO dto, String stateId) {
        TextDTO textDTO;
        long hashCode = (stateId + ((Object) dto.getTitle().getText())).hashCode();
        TextDTO title = dto.getTitle();
        TextDTO subtitle = dto.getSubtitle();
        if (subtitle != null) {
            subtitle.setTagSupported(true);
            Unit unit = Unit.f71690a;
            textDTO = subtitle;
        } else {
            textDTO = null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new SegmentedTrainRouteTitleVI(hashCode, title, textDTO, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }

    private final SegmentedTrainRouteTransferVI mapTransferToVO(SegmentedTrainRouteDTO.SegmentDTO segment, String stateId) {
        if (segment.getTransferInfo() == null) {
            return null;
        }
        OzonSpannableString text = segment.getTransferInfo().getCenterBlock().getTitle().getText();
        return new SegmentedTrainRouteTransferVI((stateId + ((Object) text)).hashCode(), segment.getTransferInfo());
    }

    private final SegmentedTrainRouteSkeletonVI mapWidgetBehaviorType(SegmentedTrainRouteDTO.WidgetBehaviorType state, String asyncData, String stateId) {
        return new SegmentedTrainRouteSkeletonVI(stateId != null ? stateId.hashCode() : 0, asyncData, mapWidgetBehaviorTypeState(state));
    }

    private final SegmentedTrainRouteSkeletonVI.State mapWidgetBehaviorTypeState(SegmentedTrainRouteDTO.WidgetBehaviorType state) {
        SegmentedTrainRouteDTO.AsyncBehaviorType asyncBehaviorType = state.getAsyncBehaviorType();
        boolean hasTransfer = state.getHasTransfer();
        AtomActionDTO action = state.getAction();
        return new SegmentedTrainRouteSkeletonVI.State(asyncBehaviorType, hasTransfer, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
    }

    @NotNull
    public final List<Object> mapToWidget(@NotNull SegmentedTrainRouteDTO dto, String stateId, String asyncData) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        b builder = C7714v.B();
        builder.add(mapTitleToVO(dto, stateId));
        if (dto.getWidgetBehaviorType().getAsyncBehaviorType() == SegmentedTrainRouteDTO.AsyncBehaviorType.NO_ACTION) {
            for (SegmentedTrainRouteDTO.SegmentDTO segmentDTO : dto.getSegmentList()) {
                SegmentedTrainRouteTransferVI mapTransferToVO = mapTransferToVO(segmentDTO, stateId);
                if (mapTransferToVO != null) {
                    builder.add(mapTransferToVO);
                }
                builder.add(mapHeaderVO(segmentDTO, stateId));
                builder.addAll(mapStopsToVO(segmentDTO.getStopsBlock().getStops(), stateId));
                builder.add(mapFooterToVO(segmentDTO.getStopsBlock(), stateId));
            }
        } else {
            builder.add(mapWidgetBehaviorType(dto.getWidgetBehaviorType(), asyncData, stateId));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public SegmentedTrainRouteSkeletonVI.State mapAsyncState(@NotNull SegmentedTrainRouteDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapWidgetBehaviorTypeState(state.getWidgetBehaviorType());
    }
}
