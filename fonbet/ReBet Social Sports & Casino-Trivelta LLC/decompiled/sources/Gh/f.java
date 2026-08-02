package Gh;

import Gh.q;
import com.appsflyer.AdRevenueScheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4066f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final o f4067a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4068b;

    /* renamed from: c, reason: collision with root package name */
    public final q f4069c;

    /* renamed from: d, reason: collision with root package name */
    public final q f4070d;

    /* renamed from: e, reason: collision with root package name */
    public final q f4071e;

    @NotNull
    private final j[] geofences;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            j[] c10 = j.f4139h.c(obj.getJSONArray("geofences"));
            if (c10 == null) {
                c10 = new j[0];
            }
            j[] jVarArr = c10;
            o a10 = o.f4157h.a(obj.optJSONObject("place"));
            q.a aVar = q.f4167l;
            return new f(jVarArr, a10, aVar.a(obj.optJSONObject(AdRevenueScheme.COUNTRY)), aVar.a(obj.optJSONObject("state")), aVar.a(obj.optJSONObject("dma")), aVar.a(obj.optJSONObject("postalCode")));
        }

        public a() {
        }
    }

    public f(j[] geofences, o oVar, q qVar, q qVar2, q qVar3, q qVar4) {
        Intrinsics.checkNotNullParameter(geofences, "geofences");
        this.geofences = geofences;
        this.f4067a = oVar;
        this.f4068b = qVar;
        this.f4069c = qVar2;
        this.f4070d = qVar3;
        this.f4071e = qVar4;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("geofences", j.f4139h.e(this.geofences));
        o oVar = this.f4067a;
        jSONObject.putOpt("place", oVar != null ? oVar.c() : null);
        q qVar = this.f4068b;
        jSONObject.putOpt(AdRevenueScheme.COUNTRY, qVar != null ? qVar.c() : null);
        q qVar2 = this.f4069c;
        jSONObject.putOpt("state", qVar2 != null ? qVar2.c() : null);
        q qVar3 = this.f4070d;
        jSONObject.putOpt("dma", qVar3 != null ? qVar3.c() : null);
        q qVar4 = this.f4071e;
        jSONObject.putOpt("postalCode", qVar4 != null ? qVar4.c() : null);
        return jSONObject;
    }
}
