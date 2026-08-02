package Gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4181d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final t f4182a;

    /* renamed from: b, reason: collision with root package name */
    public final u f4183b;

    /* renamed from: c, reason: collision with root package name */
    public final v f4184c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new s(t.f4185c.a(jSONObject.optJSONObject("distance")), u.f4188c.a(jSONObject.optJSONObject("duration")), v.f4191a.a(jSONObject.optJSONObject("geometry")));
        }

        public a() {
        }
    }

    public s(t tVar, u uVar, v vVar) {
        this.f4182a = tVar;
        this.f4183b = uVar;
        this.f4184c = vVar;
    }

    public final v a() {
        return this.f4184c;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        t tVar = this.f4182a;
        jSONObject.putOpt("distance", tVar != null ? tVar.a() : null);
        u uVar = this.f4183b;
        jSONObject.putOpt("duration", uVar != null ? uVar.a() : null);
        v vVar = this.f4184c;
        jSONObject.putOpt("geometry", vVar != null ? vVar.b() : null);
        return jSONObject;
    }
}
