package eg;

import com.google.gson.JsonObject;
import org.maplibre.geojson.LineString;

/* loaded from: classes10.dex */
public final class m extends r<j> {

    /* renamed from: a, reason: collision with root package name */
    private LineString f62286a;

    /* renamed from: b, reason: collision with root package name */
    private String f62287b;

    /* renamed from: c, reason: collision with root package name */
    private Float f62288c;

    @Override // eg.r
    final j a(long j11, c<?, j, ?, ?, ?, ?> cVar) {
        if (this.f62286a == null) {
            throw new RuntimeException("geometry field is required");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("line-join", (String) null);
        jsonObject.addProperty("line-opacity", (Number) null);
        jsonObject.addProperty("line-color", this.f62287b);
        jsonObject.addProperty("line-width", this.f62288c);
        jsonObject.addProperty("line-gap-width", (Number) null);
        jsonObject.addProperty("line-offset", (Number) null);
        jsonObject.addProperty("line-blur", (Number) null);
        jsonObject.addProperty("line-pattern", (String) null);
        j jVar = new j(j11, cVar, jsonObject, this.f62286a);
        jVar.g(false);
        jVar.f(null);
        return jVar;
    }

    public final void b(LineString lineString) {
        this.f62286a = lineString;
    }

    public final void c(String str) {
        this.f62287b = str;
    }

    public final void d(Float f7) {
        this.f62288c = f7;
    }
}
