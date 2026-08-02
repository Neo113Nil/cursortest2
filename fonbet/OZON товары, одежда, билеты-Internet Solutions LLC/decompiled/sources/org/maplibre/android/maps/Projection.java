package org.maplibre.android.maps;

import Xf.b;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;

/* loaded from: classes10.dex */
public class Projection {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final NativeMap f79817a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final MapView f79818b;

    Projection(@NonNull NativeMap nativeMap, @NonNull MapView mapView) {
        this.f79817a = nativeMap;
        this.f79818b = mapView;
    }

    static double a(double d11) {
        return ((d11 % 360.0d) * 3.141592653589793d) / 180.0d;
    }

    @NonNull
    public final LatLng b(@NonNull PointF pointF) {
        return this.f79817a.I(pointF);
    }

    final float c() {
        return this.f79818b.getHeight();
    }

    public final double d(double d11) {
        return this.f79817a.q(d11);
    }

    @NonNull
    public final b e() {
        MapView mapView = this.f79818b;
        float width = mapView.getWidth();
        float height = mapView.getHeight();
        PointF pointF = new PointF(((width - 0.0f) / 2.0f) + 0.0f, ((height - 0.0f) / 2.0f) + 0.0f);
        NativeMap nativeMap = this.f79817a;
        LatLng I11 = nativeMap.I(pointF);
        LatLng I12 = nativeMap.I(new PointF(0.0f, 0.0f));
        LatLng I13 = nativeMap.I(new PointF(width, 0.0f));
        LatLng I14 = nativeMap.I(new PointF(width, height));
        LatLng I15 = nativeMap.I(new PointF(0.0f, height));
        ArrayList arrayList = new ArrayList();
        arrayList.add(I13);
        arrayList.add(I14);
        arrayList.add(I15);
        arrayList.add(I12);
        Iterator it = arrayList.iterator();
        double d11 = -90.0d;
        double d12 = 90.0d;
        double d13 = 0.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        double d16 = 0.0d;
        while (it.hasNext()) {
            LatLng latLng = (LatLng) it.next();
            double a11 = a(I11.getLongitude());
            double a12 = a(latLng.getLongitude());
            double a13 = a(I11.getLatitude());
            double a14 = a(latLng.getLatitude());
            double d17 = a12 - a11;
            double cos = Math.cos(a14) * Math.sin(d17);
            double sin = Math.sin(a14) * Math.cos(a13);
            double cos2 = Math.cos(d17) * Math.cos(a14) * Math.sin(a13);
            Iterator it2 = it;
            if (((Math.atan2(cos, sin - cos2) % 6.283185307179586d) * 180.0d) / 3.141592653589793d >= 0.0d) {
                double longitude = latLng.getLongitude();
                double longitude2 = I11.getLongitude();
                double abs = Math.abs(longitude - longitude2);
                if (longitude <= longitude2) {
                    abs = 360.0d - abs;
                }
                if (abs > d14) {
                    d15 = latLng.getLongitude();
                    d14 = abs;
                }
            } else {
                double longitude3 = I11.getLongitude();
                double longitude4 = latLng.getLongitude();
                double abs2 = Math.abs(longitude3 - longitude4);
                if (longitude3 <= longitude4) {
                    abs2 = 360.0d - abs2;
                }
                if (abs2 > d13) {
                    d16 = latLng.getLongitude();
                    d13 = abs2;
                }
            }
            if (d11 < latLng.getLatitude()) {
                d11 = latLng.getLatitude();
            }
            if (d12 > latLng.getLatitude()) {
                d12 = latLng.getLatitude();
            }
            it = it2;
        }
        return d15 < d16 ? new b(I12, I13, I15, I14, LatLngBounds.from(d11, d15 + 360.0d, d12, d16)) : new b(I12, I13, I15, I14, LatLngBounds.from(d11, d15, d12, d16));
    }

    final float f() {
        return this.f79818b.getWidth();
    }

    @NonNull
    public final PointF g(@NonNull LatLng latLng) {
        return this.f79817a.n(latLng);
    }
}
