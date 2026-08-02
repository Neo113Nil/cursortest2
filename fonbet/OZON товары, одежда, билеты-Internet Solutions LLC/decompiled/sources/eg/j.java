package eg;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.Projection;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.Point;

/* loaded from: classes10.dex */
public final class j extends AbstractC6362a<LineString> {

    /* renamed from: d, reason: collision with root package name */
    private final c<?, j, ?, ?, ?, ?> f62282d;

    j(long j11, c<?, j, ?, ?, ?, ?> cVar, JsonObject jsonObject, LineString lineString) {
        super(j11, jsonObject, lineString);
        this.f62282d = cVar;
    }

    @Override // eg.AbstractC6362a
    final String c() {
        return "Line";
    }

    @Override // eg.AbstractC6362a
    final Geometry d(@NonNull Projection projection, @NonNull Yf.c cVar, float f7, float f11) {
        List<Point> coordinates = ((LineString) this.f62240b).coordinates();
        ArrayList arrayList = new ArrayList(coordinates.size());
        for (Point point : coordinates) {
            PointF g10 = projection.g(new LatLng(point.latitude(), point.longitude()));
            g10.x -= cVar.d();
            g10.y -= cVar.f();
            LatLng b11 = projection.b(g10);
            if (b11.getLatitude() > 85.05112877980659d || b11.getLatitude() < -85.05112877980659d) {
                return null;
            }
            arrayList.add(Point.fromLngLat(b11.getLongitude(), b11.getLatitude()));
        }
        return LineString.fromLngLats(arrayList);
    }

    @Override // eg.AbstractC6362a
    final void i() {
        JsonObject jsonObject = this.f62239a;
        boolean z11 = jsonObject.get("line-join") instanceof com.google.gson.k;
        c<?, j, ?, ?, ?, ?> cVar = this.f62282d;
        if (!z11) {
            cVar.j("line-join");
        }
        if (!(jsonObject.get("line-opacity") instanceof com.google.gson.k)) {
            cVar.j("line-opacity");
        }
        if (!(jsonObject.get("line-color") instanceof com.google.gson.k)) {
            cVar.j("line-color");
        }
        if (!(jsonObject.get("line-width") instanceof com.google.gson.k)) {
            cVar.j("line-width");
        }
        if (!(jsonObject.get("line-gap-width") instanceof com.google.gson.k)) {
            cVar.j("line-gap-width");
        }
        if (!(jsonObject.get("line-offset") instanceof com.google.gson.k)) {
            cVar.j("line-offset");
        }
        if (!(jsonObject.get("line-blur") instanceof com.google.gson.k)) {
            cVar.j("line-blur");
        }
        if (jsonObject.get("line-pattern") instanceof com.google.gson.k) {
            return;
        }
        cVar.j("line-pattern");
    }

    public final void j() {
        this.f62239a.addProperty("line-join", "round");
    }
}
