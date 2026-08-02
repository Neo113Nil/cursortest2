package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons;

import Hj.C3143a;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons.PolygonsRepository;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import we0.i;
import xe.C10727i;
import xe.M;
import ze.x;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ7\u0010\"\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ#\u0010'\u001a\u00020\r2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050%\"\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010(J=\u0010,\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u001f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0)¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u001f¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020*2\u0006\u00100\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\r¢\u0006\u0004\b3\u0010\u000fJ\r\u00104\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108R\u0016\u00109\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010:R\u0018\u0010@\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/polygons/PolygonsManager;", "", "Lxe/M;", "scope", "Lze/x;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction;", "actionChannel", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonsRepository;", "polygonsRepository", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;", "analyticsHelper", "<init>", "(Lxe/M;Lze/x;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonsRepository;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;)V", "", "resetVisibilityFlags", "()V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "vo", "", "zoom", "calculateColorAlpha", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;I)Ljava/lang/Integer;", "Lwe0/i;", "visibleArea", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon;", "findVisiblePolygons", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Lwe0/i;)Ljava/util/List;", "showPolygonsPanel", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;)V", "hidePolygonsPanel", "", "visiblePolygons", "polygonsAlpha", "showPolygons", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;FLjava/util/List;I)V", "hidePolygons", "", "actions", "send", "([Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction;)V", "Lkotlin/Function1;", "", "onChangedState", "onClickPolygonPanel", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Lwe0/i;FLkotlin/jvm/functions/Function1;)V", "togglePolygons", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Lwe0/i;F)V", "newVo", "isPolygonEnabled", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onStop", "onRefresh", "Lxe/M;", "Lze/x;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonsRepository;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;", "isPolygonsPanelVisible", "Z", "isPolygonsVisible", "", "alphaByZoom", "Ljava/util/Map;", "isPolygonsEnable", "canShowPolygons", "Ljava/lang/Boolean;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PolygonsManager {

    @NotNull
    private final x<MapAction> actionChannel;

    @NotNull
    private final Map<Integer, Integer> alphaByZoom;

    @NotNull
    private final AnalyticsHelper analyticsHelper;
    private volatile Boolean canShowPolygons;
    private volatile boolean isPolygonsEnable;
    private boolean isPolygonsPanelVisible;
    private boolean isPolygonsVisible;

    @NotNull
    private final PolygonsRepository polygonsRepository;

    @NotNull
    private final M scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PolygonsManager(@NotNull M scope, @NotNull x<? super MapAction> actionChannel, @NotNull PolygonsRepository polygonsRepository, @NotNull AnalyticsHelper analyticsHelper) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(actionChannel, "actionChannel");
        Intrinsics.checkNotNullParameter(polygonsRepository, "polygonsRepository");
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        this.scope = scope;
        this.actionChannel = actionChannel;
        this.polygonsRepository = polygonsRepository;
        this.analyticsHelper = analyticsHelper;
        this.alphaByZoom = new LinkedHashMap();
    }

    private final Integer calculateColorAlpha(HotelsMapInfoV4VO vo, int zoom) {
        int d11;
        Integer num = this.alphaByZoom.get(Integer.valueOf(zoom));
        if (num != null) {
            d11 = num.intValue();
        } else {
            DistrictsVO districts = vo.getDistricts();
            if (districts == null) {
                return null;
            }
            Float showLabelsZoom = vo.getDistricts().getShowLabelsZoom();
            float floatValue = showLabelsZoom != null ? showLabelsZoom.floatValue() : 10.0f;
            float startColorAlpha = districts.getStartColorAlpha();
            float endColorAlpha = districts.getEndColorAlpha();
            d11 = (int) (h.d(C3143a.d(startColorAlpha, endColorAlpha, h.d((21.0f - zoom) / (21.0f - floatValue), 0.0f, 1.0f), endColorAlpha), endColorAlpha, startColorAlpha) * 255);
            this.alphaByZoom.put(Integer.valueOf(zoom), Integer.valueOf(d11));
        }
        return Integer.valueOf(d11);
    }

    private final List<DistrictsVO.Polygon> findVisiblePolygons(HotelsMapInfoV4VO vo, i visibleArea) {
        ConcurrentHashMap<String, DistrictsVO.Polygon> polygons;
        Collection<DistrictsVO.Polygon> values;
        DistrictsVO districts = vo.getDistricts();
        if (districts == null || (polygons = districts.getPolygons()) == null || (values = polygons.values()) == null) {
            return K.f71697a;
        }
        InterfaceC7663b<Double> latitudeRange = MapExtKt.getLatitudeRange(visibleArea);
        InterfaceC7663b<Double> longitudeRange = MapExtKt.getLongitudeRange(visibleArea);
        InterfaceC7663b<Double> expandRange = MapExtKt.expandRange(latitudeRange, 0.5f);
        InterfaceC7663b<Double> expandRange2 = MapExtKt.expandRange(longitudeRange, 0.5f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (MapExtKt.hasIntersection(((DistrictsVO.Polygon) obj).getPath(), expandRange, expandRange2)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void hidePolygons() {
        if (this.isPolygonsVisible) {
            send(new MapAction.TogglePolygons(K.f71697a, false, false, 0));
            this.isPolygonsVisible = false;
        }
    }

    private final void hidePolygonsPanel() {
        if (this.isPolygonsPanelVisible) {
            send(new MapAction.TogglePolygonsPanel(false));
            this.isPolygonsPanelVisible = false;
        }
    }

    private final void resetVisibilityFlags() {
        this.isPolygonsVisible = false;
        this.isPolygonsPanelVisible = false;
    }

    private final void showPolygons(HotelsMapInfoV4VO vo, float zoom, List<DistrictsVO.Polygon> visiblePolygons, int polygonsAlpha) {
        DistrictsVO districts;
        Float showLabelsZoom;
        send(new MapAction.TogglePolygons(visiblePolygons, true, zoom >= ((vo == null || (districts = vo.getDistricts()) == null || (showLabelsZoom = districts.getShowLabelsZoom()) == null) ? 0.0f : showLabelsZoom.floatValue()), polygonsAlpha));
        this.isPolygonsVisible = true;
    }

    private final void showPolygonsPanel(HotelsMapInfoV4VO vo) {
        DistrictsVO districts;
        DistrictsVO.PolygonControlPanel panel;
        if (this.isPolygonsPanelVisible) {
            return;
        }
        send(new MapAction.TogglePolygonsPanel(((vo == null || (districts = vo.getDistricts()) == null || (panel = districts.getPanel()) == null) ? null : panel.getPanel()) != null));
        this.isPolygonsPanelVisible = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isPolygonEnabled(@NotNull HotelsMapInfoV4VO hotelsMapInfoV4VO, @NotNull d<? super Boolean> dVar) {
        PolygonsManager$isPolygonEnabled$1 polygonsManager$isPolygonEnabled$1;
        int i11;
        Boolean bool;
        PolygonsManager polygonsManager;
        HotelsMapInfoV4VO hotelsMapInfoV4VO2;
        PolygonsManager polygonsManager2;
        Boolean isSelected;
        DistrictsVO.PolygonControlPanel panel;
        CellDTO panel2;
        CellDTO.RightBlock rightBlock;
        if (dVar instanceof PolygonsManager$isPolygonEnabled$1) {
            polygonsManager$isPolygonEnabled$1 = (PolygonsManager$isPolygonEnabled$1) dVar;
            int i12 = polygonsManager$isPolygonEnabled$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                polygonsManager$isPolygonEnabled$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = polygonsManager$isPolygonEnabled$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = polygonsManager$isPolygonEnabled$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    bool = this.canShowPolygons;
                    if (bool != null) {
                        polygonsManager = this;
                        hotelsMapInfoV4VO2 = hotelsMapInfoV4VO;
                        polygonsManager2 = polygonsManager;
                        polygonsManager2.canShowPolygons = bool;
                        DistrictsVO districts = hotelsMapInfoV4VO2.getDistricts();
                        AtomDTO control = (districts != null || (panel = districts.getPanel()) == null || (panel2 = panel.getPanel()) == null || (rightBlock = panel2.getRightBlock()) == null) ? null : rightBlock.getControl();
                        ToggleDTO toggleDTO = control instanceof ToggleDTO ? (ToggleDTO) control : null;
                        polygonsManager.isPolygonsEnable = !((toggleDTO != null || (isSelected = toggleDTO.isSelected()) == null) ? false : isSelected.booleanValue()) && Intrinsics.d(polygonsManager.canShowPolygons, Boolean.TRUE);
                        return Boolean.valueOf(polygonsManager.isPolygonsEnable);
                    }
                    PolygonsRepository polygonsRepository = this.polygonsRepository;
                    polygonsManager$isPolygonEnabled$1.L$0 = this;
                    polygonsManager$isPolygonEnabled$1.L$1 = hotelsMapInfoV4VO;
                    polygonsManager$isPolygonEnabled$1.L$2 = this;
                    polygonsManager$isPolygonEnabled$1.label = 1;
                    obj = polygonsRepository.canShow(polygonsManager$isPolygonEnabled$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    polygonsManager = this;
                    hotelsMapInfoV4VO2 = hotelsMapInfoV4VO;
                    polygonsManager2 = polygonsManager;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    polygonsManager2 = (PolygonsManager) polygonsManager$isPolygonEnabled$1.L$2;
                    hotelsMapInfoV4VO2 = (HotelsMapInfoV4VO) polygonsManager$isPolygonEnabled$1.L$1;
                    polygonsManager = (PolygonsManager) polygonsManager$isPolygonEnabled$1.L$0;
                    s.b(obj);
                }
                bool = (Boolean) obj;
                polygonsManager2.canShowPolygons = bool;
                DistrictsVO districts2 = hotelsMapInfoV4VO2.getDistricts();
                if (districts2 != null) {
                }
                if (control instanceof ToggleDTO) {
                }
                polygonsManager.isPolygonsEnable = !((toggleDTO != null || (isSelected = toggleDTO.isSelected()) == null) ? false : isSelected.booleanValue()) && Intrinsics.d(polygonsManager.canShowPolygons, Boolean.TRUE);
                return Boolean.valueOf(polygonsManager.isPolygonsEnable);
            }
        }
        polygonsManager$isPolygonEnabled$1 = new PolygonsManager$isPolygonEnabled$1(this, dVar);
        Object obj2 = polygonsManager$isPolygonEnabled$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = polygonsManager$isPolygonEnabled$1.label;
        if (i11 != 0) {
        }
        bool = (Boolean) obj2;
        polygonsManager2.canShowPolygons = bool;
        DistrictsVO districts22 = hotelsMapInfoV4VO2.getDistricts();
        if (districts22 != null) {
        }
        if (control instanceof ToggleDTO) {
        }
        polygonsManager.isPolygonsEnable = !((toggleDTO != null || (isSelected = toggleDTO.isSelected()) == null) ? false : isSelected.booleanValue()) && Intrinsics.d(polygonsManager.canShowPolygons, Boolean.TRUE);
        return Boolean.valueOf(polygonsManager.isPolygonsEnable);
    }

    public final void onClickPolygonPanel(HotelsMapInfoV4VO vo, i visibleArea, float zoom, @NotNull Function1<? super Boolean, Unit> onChangedState) {
        DistrictsVO districts;
        DistrictsVO.PolygonControlPanel panel;
        Intrinsics.checkNotNullParameter(onChangedState, "onChangedState");
        this.isPolygonsEnable = !this.isPolygonsEnable;
        onChangedState.invoke(Boolean.valueOf(this.isPolygonsEnable));
        this.analyticsHelper.trackDistrictToggle((vo == null || (districts = vo.getDistricts()) == null || (panel = districts.getPanel()) == null) ? null : panel.getDistrictToggleTrackingInfo(), this.isPolygonsEnable);
        togglePolygons(vo, visibleArea, zoom);
        C10727i.c(this.scope, null, null, new PolygonsManager$onClickPolygonPanel$1(this, null), 3);
    }

    public final void onRefresh() {
        resetVisibilityFlags();
    }

    public final void onStop() {
        resetVisibilityFlags();
    }

    public void send(@NotNull MapAction... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        C10727i.c(this.scope, null, null, new PolygonsManager$send$1(actions, this, null), 3);
    }

    public final void togglePolygons(HotelsMapInfoV4VO vo, i visibleArea, float zoom) {
        Float showDistrictsZoom;
        if (vo == null || visibleArea == null) {
            return;
        }
        DistrictsVO districts = vo.getDistricts();
        if (districts != null && (showDistrictsZoom = districts.getShowDistrictsZoom()) != null && zoom <= showDistrictsZoom.floatValue()) {
            send(MapAction.HideDistricts.INSTANCE);
            return;
        }
        List<DistrictsVO.Polygon> findVisiblePolygons = findVisiblePolygons(vo, visibleArea);
        if (!this.isPolygonsEnable || findVisiblePolygons.isEmpty()) {
            hidePolygons();
        } else {
            Integer calculateColorAlpha = calculateColorAlpha(vo, C6915b.c(zoom));
            if (calculateColorAlpha == null) {
                return;
            } else {
                showPolygons(vo, zoom, findVisiblePolygons, calculateColorAlpha.intValue());
            }
        }
        if (findVisiblePolygons.isEmpty()) {
            hidePolygonsPanel();
        } else {
            showPolygonsPanel(vo);
        }
    }
}
