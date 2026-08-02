package io.radar.sdk.model;

import com.braze.models.BrazeGeofence;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarGeofenceGeometry.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/radar/sdk/model/RadarPolygonGeometry;", "Lio/radar/sdk/model/RadarGeofenceGeometry;", "coordinates", "", "Lio/radar/sdk/model/RadarCoordinate;", "center", BrazeGeofence.RADIUS_METERS, "", "([Lio/radar/sdk/model/RadarCoordinate;Lio/radar/sdk/model/RadarCoordinate;D)V", "getCenter", "()Lio/radar/sdk/model/RadarCoordinate;", "getCoordinates", "()[Lio/radar/sdk/model/RadarCoordinate;", "[Lio/radar/sdk/model/RadarCoordinate;", "getRadius", "()D", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarPolygonGeometry extends RadarGeofenceGeometry {
    private final RadarCoordinate center;
    private final RadarCoordinate[] coordinates;
    private final double radius;

    public /* synthetic */ RadarPolygonGeometry(RadarCoordinate[] radarCoordinateArr, RadarCoordinate radarCoordinate, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : radarCoordinateArr, radarCoordinate, d);
    }

    public final RadarCoordinate[] getCoordinates() {
        return this.coordinates;
    }

    public final RadarCoordinate getCenter() {
        return this.center;
    }

    public final double getRadius() {
        return this.radius;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarPolygonGeometry(RadarCoordinate[] radarCoordinateArr, RadarCoordinate center, double d) {
        super(null);
        Intrinsics.checkNotNullParameter(center, "center");
        this.coordinates = radarCoordinateArr;
        this.center = center;
        this.radius = d;
    }
}
