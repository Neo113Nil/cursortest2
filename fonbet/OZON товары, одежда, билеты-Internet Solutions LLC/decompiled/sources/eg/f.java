package eg;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.Projection;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

/* loaded from: classes10.dex */
public final class f extends AbstractC6362a<Polygon> {

    /* renamed from: d, reason: collision with root package name */
    private final c<?, f, ?, ?, ?, ?> f62276d;

    f(long j11, c<?, f, ?, ?, ?, ?> cVar, JsonObject jsonObject, Polygon polygon) {
        super(j11, jsonObject, polygon);
        this.f62276d = cVar;
    }

    @Override // eg.AbstractC6362a
    final String c() {
        return "Fill";
    }

    @Override // eg.AbstractC6362a
    final Geometry d(@NonNull Projection projection, @NonNull Yf.c cVar, float f7, float f11) {
        List<List<Point>> coordinates = ((Polygon) this.f62240b).coordinates();
        if (coordinates == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(coordinates.size());
        for (List<Point> list : coordinates) {
            ArrayList arrayList2 = new ArrayList();
            for (Point point : list) {
                PointF g10 = projection.g(new LatLng(point.latitude(), point.longitude()));
                g10.x -= cVar.d();
                g10.y -= cVar.f();
                LatLng b11 = projection.b(g10);
                if (b11.getLatitude() > 85.05112877980659d || b11.getLatitude() < -85.05112877980659d) {
                    return null;
                }
                arrayList2.add(Point.fromLngLat(b11.getLongitude(), b11.getLatitude()));
            }
            arrayList.add(arrayList2);
        }
        return Polygon.fromLngLats(arrayList);
    }

    @Override // eg.AbstractC6362a
    final void i() {
        JsonObject jsonObject = this.f62239a;
        boolean z11 = jsonObject.get("fill-opacity") instanceof com.google.gson.k;
        c<?, f, ?, ?, ?, ?> cVar = this.f62276d;
        if (!z11) {
            cVar.j("fill-opacity");
        }
        if (!(jsonObject.get("fill-color") instanceof com.google.gson.k)) {
            cVar.j("fill-color");
        }
        if (!(jsonObject.get("fill-outline-color") instanceof com.google.gson.k)) {
            cVar.j("fill-outline-color");
        }
        if (jsonObject.get("fill-pattern") instanceof com.google.gson.k) {
            return;
        }
        cVar.j("fill-pattern");
    }
}
