package ru.ozon.app.android.travel.feature.hotels.map.shared.data;

import Nk.a;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import we0.m;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0004\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0004\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;J)Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "districts", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon;", "mapDistricts", "(Ljava/util/List;Ljava/lang/Long;)Ljava/util/concurrent/ConcurrentHashMap;", "id", "", "badgeHash", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;Ljava/lang/String;ILjava/lang/Long;)Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon;", "Lwe0/m;", "path", "calculateCenterForPolygon", "(Ljava/util/List;)Lwe0/m;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;)Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DistrictsMapperExtKt {
    private static final m calculateCenterForPolygon(List<m> list) {
        int size = list.size();
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i11 = 0;
        double d13 = 0.0d;
        while (i11 < size) {
            double latitude = list.get(i11).getLatitude();
            double longitude = list.get(i11).getLongitude();
            i11++;
            double latitude2 = list.get(i11 % list.size()).getLatitude();
            double longitude2 = list.get(i11 % list.size()).getLongitude();
            double d14 = (latitude * longitude2) - (latitude2 * longitude);
            d11 += d14;
            d13 += (latitude + latitude2) * d14;
            d12 += (longitude + longitude2) * d14;
        }
        double d15 = 6 * (d11 / 2);
        return new m(d13 / d15, d12 / d15);
    }

    @NotNull
    public static final ConcurrentHashMap<String, DistrictsVO.Polygon> mapDistricts(@NotNull List<DistrictsDTO.Polygon> districts, Long l11) {
        Intrinsics.checkNotNullParameter(districts, "districts");
        ConcurrentHashMap<String, DistrictsVO.Polygon> concurrentHashMap = new ConcurrentHashMap<>(districts.size());
        for (DistrictsDTO.Polygon polygon : districts) {
            int hashCode = polygon.getLabel().getBadge().hashCode();
            String id2 = polygon.getId();
            if (id2 == null) {
                id2 = String.valueOf(hashCode);
            }
            concurrentHashMap.put(id2, toVO(polygon, id2, hashCode, l11));
        }
        return concurrentHashMap;
    }

    @NotNull
    public static final DistrictsVO toVO(@NotNull DistrictsDTO districtsDTO, long j11) {
        Intrinsics.checkNotNullParameter(districtsDTO, "<this>");
        return new DistrictsVO(mapDistricts(districtsDTO.getDistricts(), Long.valueOf(j11)), toVO(districtsDTO.getControlShowPanel()), h.d(districtsDTO.getStartFillColorZoomAlpha(), 0.0f, 1.0f), h.d(districtsDTO.getEndFillColorZoomAlpha(), 0.0f, 1.0f), districtsDTO.getShowLabelsZoom() != null ? Float.valueOf(r9.intValue()) : null, districtsDTO.getShowDistrictsZoom() != null ? Float.valueOf(r8.intValue()) : null);
    }

    @NotNull
    public static final DistrictsVO.Polygon toVO(@NotNull DistrictsDTO.Polygon polygon, @NotNull String id2, int i11, Long l11) {
        m calculateCenterForPolygon;
        AtomActionDTO action;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        List<DistrictsDTO.PolygonPoint> points = polygon.getPoints();
        ArrayList arrayList = new ArrayList(C7714v.z(points, 10));
        Iterator<T> it = points.iterator();
        while (it.hasNext()) {
            arrayList.add(MapExtKt.toLatLng(((DistrictsDTO.PolygonPoint) it.next()).getPoint()));
        }
        List<DistrictsDTO.ExcludedPath> excludedPaths = polygon.getExcludedPaths();
        ArrayList arrayList2 = new ArrayList(C7714v.z(excludedPaths, 10));
        Iterator<T> it2 = excludedPaths.iterator();
        while (it2.hasNext()) {
            List<DistrictsDTO.PolygonPoint> points2 = ((DistrictsDTO.ExcludedPath) it2.next()).getPoints();
            ArrayList arrayList3 = new ArrayList(C7714v.z(points2, 10));
            Iterator<T> it3 = points2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(MapExtKt.toLatLng(((DistrictsDTO.PolygonPoint) it3.next()).getPoint()));
            }
            arrayList2.add(arrayList3);
        }
        String strokeColor = polygon.getStrokeColor();
        Float strokeWidth = polygon.getStrokeWidth();
        float floatValue = strokeWidth != null ? strokeWidth.floatValue() : 0.0f;
        String fillColor = polygon.getFillColor();
        float zIndex = polygon.getZIndex();
        String b11 = a.b("polygonPin_", id2);
        double[] coords = polygon.getLabel().getCoords();
        if (coords == null || (calculateCenterForPolygon = MapExtKt.toLatLng(coords)) == null) {
            calculateCenterForPolygon = calculateCenterForPolygon(arrayList);
        }
        m mVar = calculateCenterForPolygon;
        BadgeDTO badge = polygon.getLabel().getBadge();
        CommonControlSettings common = polygon.getLabel().getBadge().getCommon();
        AtomAction atomAction = null;
        t mapToTokenizedEvent$default = (common == null || (trackingInfo = common.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null);
        CommonControlSettings common2 = polygon.getLabel().getBadge().getCommon();
        if (common2 != null && (action = common2.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, null);
        }
        return new DistrictsVO.Polygon(id2, arrayList, arrayList2, strokeColor, floatValue, fillColor, zIndex, new DistrictsVO.Polygon.PolygonPin(b11, mVar, badge, mapToTokenizedEvent$default, i11, atomAction));
    }

    private static final DistrictsVO.PolygonControlPanel toVO(DistrictsDTO.ControlShowPanel controlShowPanel) {
        CellDTO.RightBlock rightBlock;
        CommonControlSettings common;
        CommonControlSettings common2;
        CellDTO panel = controlShowPanel.getPanel();
        CellDTO.RightBlock rightBlock2 = controlShowPanel.getPanel().getRightBlock();
        Map<String, TokenizedTrackingInfo> map = null;
        if (rightBlock2 != null) {
            CellDTO.RightBlock rightBlock3 = controlShowPanel.getPanel().getRightBlock();
            rightBlock = CellDTO.RightBlock.copy$default(rightBlock2, (rightBlock3 == null || (common2 = rightBlock3.getCommon()) == null) ? null : CommonControlSettings.copy$default(common2, null, null, null, 5, null), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
        } else {
            rightBlock = null;
        }
        CellDTO copy$default = CellDTO.copy$default(panel, null, null, null, rightBlock, null, 23, null);
        OnBoardingDTO onboardingApp = controlShowPanel.getOnboardingApp();
        CellDTO.RightBlock rightBlock4 = controlShowPanel.getPanel().getRightBlock();
        if (rightBlock4 != null && (common = rightBlock4.getCommon()) != null) {
            map = common.getTrackingInfo();
        }
        return new DistrictsVO.PolygonControlPanel(copy$default, onboardingApp, map);
    }
}
