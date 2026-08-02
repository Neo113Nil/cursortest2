package ru.ozon.app.android.geo.map.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/map/data/MapRequest;", "", "viewport", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "zoom", "", "isGeoLocation", "", "isMoveToPlacemark", "<init>", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Ljava/lang/Float;Ljava/lang/Boolean;Z)V", "getViewport", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "getZoom", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Ljava/lang/Float;Ljava/lang/Boolean;Z)Lru/ozon/app/android/geo/map/data/MapRequest;", "equals", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MapRequest {
    private final Boolean isGeoLocation;
    private final boolean isMoveToPlacemark;
    private final AddressEditMapVO.ViewPort viewport;
    private final Float zoom;

    public MapRequest() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ MapRequest copy$default(MapRequest mapRequest, AddressEditMapVO.ViewPort viewPort, Float f7, Boolean bool, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            viewPort = mapRequest.viewport;
        }
        if ((i11 & 2) != 0) {
            f7 = mapRequest.zoom;
        }
        if ((i11 & 4) != 0) {
            bool = mapRequest.isGeoLocation;
        }
        if ((i11 & 8) != 0) {
            z11 = mapRequest.isMoveToPlacemark;
        }
        return mapRequest.copy(viewPort, f7, bool, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final AddressEditMapVO.ViewPort getViewport() {
        return this.viewport;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getZoom() {
        return this.zoom;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsGeoLocation() {
        return this.isGeoLocation;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMoveToPlacemark() {
        return this.isMoveToPlacemark;
    }

    @NotNull
    public final MapRequest copy(AddressEditMapVO.ViewPort viewport, Float zoom, Boolean isGeoLocation, boolean isMoveToPlacemark) {
        return new MapRequest(viewport, zoom, isGeoLocation, isMoveToPlacemark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapRequest)) {
            return false;
        }
        MapRequest mapRequest = (MapRequest) other;
        return Intrinsics.d(this.viewport, mapRequest.viewport) && Intrinsics.d(this.zoom, mapRequest.zoom) && Intrinsics.d(this.isGeoLocation, mapRequest.isGeoLocation) && this.isMoveToPlacemark == mapRequest.isMoveToPlacemark;
    }

    public final AddressEditMapVO.ViewPort getViewport() {
        return this.viewport;
    }

    public final Float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        AddressEditMapVO.ViewPort viewPort = this.viewport;
        int hashCode = (viewPort == null ? 0 : viewPort.hashCode()) * 31;
        Float f7 = this.zoom;
        int hashCode2 = (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31;
        Boolean bool = this.isGeoLocation;
        return Boolean.hashCode(this.isMoveToPlacemark) + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final Boolean isGeoLocation() {
        return this.isGeoLocation;
    }

    public final boolean isMoveToPlacemark() {
        return this.isMoveToPlacemark;
    }

    @NotNull
    public String toString() {
        return "MapRequest(viewport=" + this.viewport + ", zoom=" + this.zoom + ", isGeoLocation=" + this.isGeoLocation + ", isMoveToPlacemark=" + this.isMoveToPlacemark + ")";
    }

    public MapRequest(AddressEditMapVO.ViewPort viewPort, Float f7, Boolean bool, boolean z11) {
        this.viewport = viewPort;
        this.zoom = f7;
        this.isGeoLocation = bool;
        this.isMoveToPlacemark = z11;
    }

    public /* synthetic */ MapRequest(AddressEditMapVO.ViewPort viewPort, Float f7, Boolean bool, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : viewPort, (i11 & 2) != 0 ? null : f7, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? false : z11);
    }
}
