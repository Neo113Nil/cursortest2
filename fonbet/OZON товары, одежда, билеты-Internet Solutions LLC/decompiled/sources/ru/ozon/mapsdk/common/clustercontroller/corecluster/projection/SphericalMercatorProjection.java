package ru.ozon.mapsdk.common.clustercontroller.corecluster.projection;

import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Point;
import we0.m;

/* loaded from: classes3.dex */
public class SphericalMercatorProjection {
    final double mWorldWidth;

    public SphericalMercatorProjection(double d11) {
        this.mWorldWidth = d11;
    }

    public m toLatLng(Point point) {
        double d11 = point.f97555x;
        double d12 = this.mWorldWidth;
        return new m(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (point.f97556y / d12))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d11 / d12) - 0.5d) * 360.0d);
    }

    public Point toPoint(m mVar) {
        double longitude = (mVar.getLongitude() / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(mVar.getLatitude()));
        double log = ((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d11 = this.mWorldWidth;
        return new Point(longitude * d11, log * d11);
    }
}
