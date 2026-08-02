package eg;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.Projection;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.Point;

/* loaded from: classes10.dex */
public final class s extends AbstractC6362a<Point> {

    /* renamed from: d, reason: collision with root package name */
    private final c<?, s, ?, ?, ?, ?> f62289d;

    s(long j11, c<?, s, ?, ?, ?, ?> cVar, JsonObject jsonObject, Point point) {
        super(j11, jsonObject, point);
        this.f62289d = cVar;
    }

    @Override // eg.AbstractC6362a
    final String c() {
        return "Symbol";
    }

    @Override // eg.AbstractC6362a
    final Geometry d(@NonNull Projection projection, @NonNull Yf.c cVar, float f7, float f11) {
        LatLng b11 = projection.b(new PointF(cVar.b() - f7, cVar.c() - f11));
        if (b11.getLatitude() > 85.05112877980659d || b11.getLatitude() < -85.05112877980659d) {
            return null;
        }
        return Point.fromLngLat(b11.getLongitude(), b11.getLatitude());
    }

    @Override // eg.AbstractC6362a
    final void i() {
        JsonObject jsonObject = this.f62239a;
        boolean z11 = jsonObject.get("symbol-sort-key") instanceof com.google.gson.k;
        c<?, s, ?, ?, ?, ?> cVar = this.f62289d;
        if (!z11) {
            cVar.j("symbol-sort-key");
        }
        if (!(jsonObject.get("icon-size") instanceof com.google.gson.k)) {
            cVar.j("icon-size");
        }
        if (!(jsonObject.get("icon-image") instanceof com.google.gson.k)) {
            cVar.j("icon-image");
        }
        if (!(jsonObject.get("icon-rotate") instanceof com.google.gson.k)) {
            cVar.j("icon-rotate");
        }
        if (!(jsonObject.get("icon-offset") instanceof com.google.gson.k)) {
            cVar.j("icon-offset");
        }
        if (!(jsonObject.get("icon-anchor") instanceof com.google.gson.k)) {
            cVar.j("icon-anchor");
        }
        if (!(jsonObject.get("text-field") instanceof com.google.gson.k)) {
            cVar.j("text-field");
        }
        if (!(jsonObject.get("text-font") instanceof com.google.gson.k)) {
            cVar.j("text-font");
        }
        if (!(jsonObject.get("text-size") instanceof com.google.gson.k)) {
            cVar.j("text-size");
        }
        if (!(jsonObject.get("text-max-width") instanceof com.google.gson.k)) {
            cVar.j("text-max-width");
        }
        if (!(jsonObject.get("text-letter-spacing") instanceof com.google.gson.k)) {
            cVar.j("text-letter-spacing");
        }
        if (!(jsonObject.get("text-justify") instanceof com.google.gson.k)) {
            cVar.j("text-justify");
        }
        if (!(jsonObject.get("text-radial-offset") instanceof com.google.gson.k)) {
            cVar.j("text-radial-offset");
        }
        if (!(jsonObject.get("text-anchor") instanceof com.google.gson.k)) {
            cVar.j("text-anchor");
        }
        if (!(jsonObject.get("text-rotate") instanceof com.google.gson.k)) {
            cVar.j("text-rotate");
        }
        if (!(jsonObject.get("text-transform") instanceof com.google.gson.k)) {
            cVar.j("text-transform");
        }
        if (!(jsonObject.get("text-offset") instanceof com.google.gson.k)) {
            cVar.j("text-offset");
        }
        if (!(jsonObject.get("icon-opacity") instanceof com.google.gson.k)) {
            cVar.j("icon-opacity");
        }
        if (!(jsonObject.get("icon-color") instanceof com.google.gson.k)) {
            cVar.j("icon-color");
        }
        if (!(jsonObject.get("icon-halo-color") instanceof com.google.gson.k)) {
            cVar.j("icon-halo-color");
        }
        if (!(jsonObject.get("icon-halo-width") instanceof com.google.gson.k)) {
            cVar.j("icon-halo-width");
        }
        if (!(jsonObject.get("icon-halo-blur") instanceof com.google.gson.k)) {
            cVar.j("icon-halo-blur");
        }
        if (!(jsonObject.get("text-opacity") instanceof com.google.gson.k)) {
            cVar.j("text-opacity");
        }
        if (!(jsonObject.get("text-color") instanceof com.google.gson.k)) {
            cVar.j("text-color");
        }
        if (!(jsonObject.get("text-halo-color") instanceof com.google.gson.k)) {
            cVar.j("text-halo-color");
        }
        if (!(jsonObject.get("text-halo-width") instanceof com.google.gson.k)) {
            cVar.j("text-halo-width");
        }
        if (jsonObject.get("text-halo-blur") instanceof com.google.gson.k) {
            return;
        }
        cVar.j("text-halo-blur");
    }

    public final String j() {
        return this.f62239a.get("icon-image").getAsString();
    }

    public final Float k() {
        return Float.valueOf(this.f62239a.get("icon-size").getAsFloat());
    }

    @NonNull
    public final LatLng l() {
        return new LatLng(((Point) this.f62240b).latitude(), ((Point) this.f62240b).longitude());
    }

    public final void m(String str) {
        this.f62239a.addProperty("icon-anchor", str);
    }

    public final void n(String str) {
        this.f62239a.addProperty("icon-image", str);
    }

    public final void o(PointF pointF) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Float.valueOf(pointF.x));
        jsonArray.add(Float.valueOf(pointF.y));
        this.f62239a.add("icon-offset", jsonArray);
    }

    public final void p(Float f7) {
        this.f62239a.addProperty("icon-opacity", f7);
    }

    public final void q(Float f7) {
        this.f62239a.addProperty("icon-rotate", f7);
    }

    public final void r(Float f7) {
        this.f62239a.addProperty("icon-size", f7);
    }

    public final void s(LatLng latLng) {
        this.f62240b = Point.fromLngLat(latLng.getLongitude(), latLng.getLatitude());
    }

    public final void t(Float f7) {
        this.f62239a.addProperty("symbol-sort-key", f7);
    }
}
