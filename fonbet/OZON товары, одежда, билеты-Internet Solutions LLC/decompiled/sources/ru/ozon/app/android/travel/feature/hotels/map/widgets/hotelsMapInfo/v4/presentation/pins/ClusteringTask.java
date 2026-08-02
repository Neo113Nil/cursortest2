package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import B0.C2454a;
import Pk0.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import we0.i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R/\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ClusteringTask;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pins", "", "latitudeCellPxSize", "longitudeCellPxSize", "Lwe0/i;", "area", "", "zoom", "Lkotlin/Function1;", "", "", "onFinish", "<init>", "(Ljava/util/concurrent/ConcurrentHashMap;IILwe0/i;FLkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "getPins", "()Ljava/util/concurrent/ConcurrentHashMap;", "I", "getLatitudeCellPxSize", "getLongitudeCellPxSize", "Lwe0/i;", "getArea", "()Lwe0/i;", "F", "getZoom", "()F", "Lkotlin/jvm/functions/Function1;", "getOnFinish", "()Lkotlin/jvm/functions/Function1;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ClusteringTask {

    @NotNull
    private final i area;
    private final int latitudeCellPxSize;
    private final int longitudeCellPxSize;

    @NotNull
    private final Function1<Map<String, HotelsMapInfoV4VO.Pin>, Unit> onFinish;

    @NotNull
    private final ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins;
    private final float zoom;

    /* JADX WARN: Multi-variable type inference failed */
    public ClusteringTask(@NotNull ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins, int i11, int i12, @NotNull i area, float f7, @NotNull Function1<? super Map<String, HotelsMapInfoV4VO.Pin>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.pins = pins;
        this.latitudeCellPxSize = i11;
        this.longitudeCellPxSize = i12;
        this.area = area;
        this.zoom = f7;
        this.onFinish = onFinish;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClusteringTask)) {
            return false;
        }
        ClusteringTask clusteringTask = (ClusteringTask) other;
        return Intrinsics.d(this.pins, clusteringTask.pins) && this.latitudeCellPxSize == clusteringTask.latitudeCellPxSize && this.longitudeCellPxSize == clusteringTask.longitudeCellPxSize && Intrinsics.d(this.area, clusteringTask.area) && Float.compare(this.zoom, clusteringTask.zoom) == 0 && Intrinsics.d(this.onFinish, clusteringTask.onFinish);
    }

    @NotNull
    public final i getArea() {
        return this.area;
    }

    public final int getLatitudeCellPxSize() {
        return this.latitudeCellPxSize;
    }

    public final int getLongitudeCellPxSize() {
        return this.longitudeCellPxSize;
    }

    @NotNull
    public final Function1<Map<String, HotelsMapInfoV4VO.Pin>, Unit> getOnFinish() {
        return this.onFinish;
    }

    @NotNull
    public final ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> getPins() {
        return this.pins;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return this.onFinish.hashCode() + b.a(this.zoom, (this.area.hashCode() + C2454a.a(this.longitudeCellPxSize, C2454a.a(this.latitudeCellPxSize, this.pins.hashCode() * 31, 31), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ClusteringTask(pins=" + this.pins + ", latitudeCellPxSize=" + this.latitudeCellPxSize + ", longitudeCellPxSize=" + this.longitudeCellPxSize + ", area=" + this.area + ", zoom=" + this.zoom + ", onFinish=" + this.onFinish + ")";
    }
}
