package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import Wc.a;
import Wc.b;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VOKt;
import we0.i;
import xe.C10737n;
import xe.E0;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/GeoHashAlgorithm;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ClusterizationAlgorithm;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pins", "", "latitudeCellPxSize", "longitudeCellPxSize", "Lwe0/i;", "area", "", "zoom", "", "getClusters", "(Ljava/util/concurrent/ConcurrentHashMap;IILwe0/i;FLkotlin/coroutines/d;)Ljava/lang/Object;", "", "isEnabled", "", "toggleIndivisibleClusters", "(Z)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/IndivisiblePinsDetector;", "indivisiblePinsDetector", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/IndivisiblePinsDetector;", "isIndivisiblePinsEnabled", "Z", "previousZoom", "F", "", "bitMask", "J", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoHashAlgorithm extends ClusterizationAlgorithm {
    private long bitMask;

    @NotNull
    private final IndivisiblePinsDetector indivisiblePinsDetector;
    private volatile boolean isIndivisiblePinsEnabled;
    private float previousZoom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoHashAlgorithm(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.indivisiblePinsDetector = new IndivisiblePinsDetector();
        this.previousZoom = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.ClusterizationAlgorithm, ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.GeoHashAlgorithm] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap<java.lang.String, ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO$Pin>] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Map] */
    public Object getClusters(@NotNull ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> concurrentHashMap, int i11, int i12, @NotNull i iVar, float f7, @NotNull d<? super Map<String, HotelsMapInfoV4VO.Pin>> frame) {
        C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        getClusters().clear();
        getUserTopPins().clear();
        Float showHighRankedZoom = getShowHighRankedZoom();
        boolean z11 = showHighRankedZoom != null && f7 < showHighRankedZoom.floatValue();
        InterfaceC7663b<Double> latitudeRange = MapExtKt.getLatitudeRange(iVar);
        InterfaceC7663b<Double> longitudeRange = MapExtKt.getLongitudeRange(iVar);
        InterfaceC7663b<Double> expandRange = MapExtKt.expandRange(latitudeRange, 0.7f);
        InterfaceC7663b<Double> expandRange2 = MapExtKt.expandRange(longitudeRange, 0.7f);
        if (this.previousZoom != f7) {
            this.bitMask = UtilsKt.mapCellsCountToPrecisionBitMask(latitudeRange, longitudeRange, i11, i12, getScreenHeight(), getScreenWidth());
            this.previousZoom = f7;
        }
        boolean z12 = this.isIndivisiblePinsEnabled && f7 >= 16.0f;
        if (z12) {
            concurrentHashMap = this.indivisiblePinsDetector.findIndivisiblePins(concurrentHashMap, expandRange, expandRange2, c10737n);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            E0.f(c10737n.getContext());
            if (z12 || MapExtKt.isInVisibleArea(((HotelsMapInfoV4VO.Pin) entry.getValue()).getCoords(), expandRange, expandRange2)) {
                if (((HotelsMapInfoV4VO.Pin) entry.getValue()).getIsFavorite() || ((HotelsMapInfoV4VO.Pin) entry.getValue()).getIsSelected()) {
                    Map userTopPins = getUserTopPins();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    HotelsMapInfoV4VO.Pin pin = (HotelsMapInfoV4VO.Pin) value;
                    pin.setTop(!z11);
                    HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(pin);
                    userTopPins.put(key, value);
                } else {
                    long geohash = ((HotelsMapInfoV4VO.Pin) entry.getValue()).getGeohash() & this.bitMask;
                    Map clusters = getClusters();
                    Long l11 = new Long(geohash);
                    Object obj = clusters.get(l11);
                    if (obj == null) {
                        obj = new ClusterCell(getPriorityPinsCountMax(), getComparator());
                        clusters.put(l11, obj);
                    }
                    ClusterCell clusterCell = (ClusterCell) obj;
                    clusterCell.add(entry.getValue());
                    getClusters().put(new Long(geohash), clusterCell);
                }
            }
        }
        rankPinInClusters(c10737n, z11);
        Object n11 = c10737n.n();
        if (n11 == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public final void toggleIndivisibleClusters(boolean isEnabled) {
        this.isIndivisiblePinsEnabled = isEnabled;
    }
}
