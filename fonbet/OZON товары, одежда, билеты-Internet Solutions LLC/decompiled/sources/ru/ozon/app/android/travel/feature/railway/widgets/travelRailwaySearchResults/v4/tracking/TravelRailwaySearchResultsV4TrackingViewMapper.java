package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.tracking;

import WZ.x;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4DTO;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingVO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0006\u001a\u00020\u00022\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/tracking/TravelRailwaySearchResultsV4TrackingViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO;", "Lru/ozon/app/android/travel/utils/listtracking/ListTrackingVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TrackingViewMapper extends r<TravelRailwaySearchResultsV4DTO, ListTrackingVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof TravelRailwaySearchResultsV4DTO)) {
            return false;
        }
        TravelRailwaySearchResultsV4DTO travelRailwaySearchResultsV4DTO = (TravelRailwaySearchResultsV4DTO) state;
        return (travelRailwaySearchResultsV4DTO.getTrackingInfo() == null || travelRailwaySearchResultsV4DTO.getTrains().isEmpty()) ? false : true;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ListTrackingVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new TravelRailwaySearchResultsV4TrackingHolder(container.X());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ListTrackingVO> map(@NotNull TravelRailwaySearchResultsV4DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        List<ListTrackingVO> list = null;
        if (trackingInfo != null) {
            long hashCode = info.d().hashCode();
            list = C7714v.a0(new ListTrackingVO(hashCode, x.b(trackingInfo, Long.valueOf(hashCode), null)));
        }
        return list == null ? K.f71697a : list;
    }
}
