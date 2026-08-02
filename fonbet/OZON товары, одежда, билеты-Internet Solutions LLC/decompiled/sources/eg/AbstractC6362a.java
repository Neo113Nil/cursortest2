package eg;

import B4.V;
import androidx.annotation.NonNull;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.maplibre.android.maps.Projection;
import org.maplibre.geojson.CoordinateContainer;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.Point;

/* renamed from: eg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC6362a<T extends Geometry> {

    /* renamed from: a, reason: collision with root package name */
    protected JsonObject f62239a;

    /* renamed from: b, reason: collision with root package name */
    protected T f62240b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f62241c;

    AbstractC6362a(long j11, JsonObject jsonObject, CoordinateContainer coordinateContainer) {
        this.f62239a = jsonObject;
        jsonObject.addProperty("id", Long.valueOf(j11));
        this.f62240b = coordinateContainer;
    }

    public final JsonElement a() {
        return this.f62239a.get("custom_data");
    }

    public final long b() {
        return this.f62239a.get("id").getAsLong();
    }

    abstract String c();

    abstract Geometry d(@NonNull Projection projection, @NonNull Yf.c cVar, float f7, float f11);

    public final boolean e() {
        return this.f62241c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC6362a abstractC6362a = (AbstractC6362a) obj;
        if (this.f62241c == abstractC6362a.f62241c && this.f62239a.equals(abstractC6362a.f62239a)) {
            return this.f62240b.equals(abstractC6362a.f62240b);
        }
        return false;
    }

    public final void f(JsonPrimitive jsonPrimitive) {
        this.f62239a.add("custom_data", jsonPrimitive);
    }

    public final void g(boolean z11) {
        this.f62241c = z11;
    }

    public final void h(Point point) {
        this.f62240b = point;
    }

    public final int hashCode() {
        return ((this.f62240b.hashCode() + (this.f62239a.hashCode() * 31)) * 31) + (this.f62241c ? 1 : 0);
    }

    abstract void i();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c());
        sb2.append("{geometry=");
        sb2.append(this.f62240b);
        sb2.append(", properties=");
        sb2.append(this.f62239a);
        sb2.append(", isDraggable=");
        return V.d(sb2, this.f62241c, '}');
    }
}
