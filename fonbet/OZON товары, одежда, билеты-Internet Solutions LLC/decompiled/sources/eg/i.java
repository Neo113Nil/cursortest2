package eg;

import com.google.gson.JsonObject;
import org.maplibre.geojson.Polygon;

/* loaded from: classes10.dex */
public final class i extends r<f> {

    /* renamed from: a, reason: collision with root package name */
    private Polygon f62280a;

    /* renamed from: b, reason: collision with root package name */
    private String f62281b;

    @Override // eg.r
    final f a(long j11, c<?, f, ?, ?, ?, ?> cVar) {
        if (this.f62280a == null) {
            throw new RuntimeException("geometry field is required");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fill-opacity", (Number) null);
        jsonObject.addProperty("fill-color", this.f62281b);
        jsonObject.addProperty("fill-outline-color", (String) null);
        jsonObject.addProperty("fill-pattern", (String) null);
        f fVar = new f(j11, cVar, jsonObject, this.f62280a);
        fVar.g(false);
        fVar.f(null);
        return fVar;
    }

    public final void b(String str) {
        this.f62281b = str;
    }

    public final void c(Polygon polygon) {
        this.f62280a = polygon;
    }
}
