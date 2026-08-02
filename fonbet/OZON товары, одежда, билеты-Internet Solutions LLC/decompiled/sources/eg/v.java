package eg;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.geojson.Point;

/* loaded from: classes10.dex */
public final class v extends r<s> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f62293a;

    /* renamed from: b, reason: collision with root package name */
    private JsonPrimitive f62294b;

    /* renamed from: c, reason: collision with root package name */
    private Point f62295c;

    /* renamed from: d, reason: collision with root package name */
    private Float f62296d;

    /* renamed from: e, reason: collision with root package name */
    private Float f62297e;

    /* renamed from: f, reason: collision with root package name */
    private String f62298f;

    /* renamed from: g, reason: collision with root package name */
    private Float f62299g;

    /* renamed from: h, reason: collision with root package name */
    private Float[] f62300h;

    /* renamed from: i, reason: collision with root package name */
    private String f62301i;

    /* renamed from: j, reason: collision with root package name */
    private Float f62302j;

    @Override // eg.r
    final s a(long j11, c<?, s, ?, ?, ?, ?> cVar) {
        JsonArray jsonArray;
        if (this.f62295c == null) {
            throw new RuntimeException("geometry field is required");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("symbol-sort-key", this.f62296d);
        jsonObject.addProperty("icon-size", this.f62297e);
        jsonObject.addProperty("icon-image", this.f62298f);
        jsonObject.addProperty("icon-rotate", this.f62299g);
        Float[] fArr = this.f62300h;
        if (fArr != null) {
            jsonArray = new JsonArray();
            for (Float f7 : fArr) {
                jsonArray.add(f7);
            }
        } else {
            jsonArray = null;
        }
        jsonObject.add("icon-offset", jsonArray);
        jsonObject.addProperty("icon-anchor", this.f62301i);
        jsonObject.addProperty("text-field", (String) null);
        jsonObject.add("text-font", null);
        jsonObject.addProperty("text-size", (Number) null);
        jsonObject.addProperty("text-max-width", (Number) null);
        jsonObject.addProperty("text-letter-spacing", (Number) null);
        jsonObject.addProperty("text-justify", (String) null);
        jsonObject.addProperty("text-radial-offset", (Number) null);
        jsonObject.addProperty("text-anchor", (String) null);
        jsonObject.addProperty("text-rotate", (Number) null);
        jsonObject.addProperty("text-transform", (String) null);
        jsonObject.add("text-offset", null);
        jsonObject.addProperty("icon-opacity", this.f62302j);
        jsonObject.addProperty("icon-color", (String) null);
        jsonObject.addProperty("icon-halo-color", (String) null);
        jsonObject.addProperty("icon-halo-width", (Number) null);
        jsonObject.addProperty("icon-halo-blur", (Number) null);
        jsonObject.addProperty("text-opacity", (Number) null);
        jsonObject.addProperty("text-color", (String) null);
        jsonObject.addProperty("text-halo-color", (String) null);
        jsonObject.addProperty("text-halo-width", (Number) null);
        jsonObject.addProperty("text-halo-blur", (Number) null);
        s sVar = new s(j11, cVar, jsonObject, this.f62295c);
        sVar.g(this.f62293a);
        sVar.f(this.f62294b);
        return sVar;
    }

    public final void b(JsonPrimitive jsonPrimitive) {
        this.f62294b = jsonPrimitive;
    }

    public final void c(boolean z11) {
        this.f62293a = z11;
    }

    public final void d(String str) {
        this.f62301i = str;
    }

    public final void e(String str) {
        this.f62298f = str;
    }

    public final void f(Float[] fArr) {
        this.f62300h = fArr;
    }

    public final void g(Float f7) {
        this.f62302j = f7;
    }

    public final void h(Float f7) {
        this.f62299g = f7;
    }

    public final void i(Float f7) {
        this.f62297e = f7;
    }

    public final void j(LatLng latLng) {
        this.f62295c = Point.fromLngLat(latLng.getLongitude(), latLng.getLatitude());
    }

    public final void k(Float f7) {
        this.f62296d = f7;
    }
}
