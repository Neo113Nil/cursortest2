package Gh;

import Gh.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: g, reason: collision with root package name */
    public static final a f4194g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final s f4195a;

    /* renamed from: b, reason: collision with root package name */
    public final s f4196b;

    /* renamed from: c, reason: collision with root package name */
    public final s f4197c;

    /* renamed from: d, reason: collision with root package name */
    public final s f4198d;

    /* renamed from: e, reason: collision with root package name */
    public final s f4199e;

    /* renamed from: f, reason: collision with root package name */
    public final s f4200f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            s.a aVar = s.f4181d;
            return new x(aVar.a(jSONObject.optJSONObject("geodesic")), aVar.a(jSONObject.optJSONObject("foot")), aVar.a(jSONObject.optJSONObject("bike")), aVar.a(jSONObject.optJSONObject("car")), aVar.a(jSONObject.optJSONObject("truck")), aVar.a(jSONObject.optJSONObject("motorbike")));
        }

        public a() {
        }
    }

    public x(s sVar, s sVar2, s sVar3, s sVar4, s sVar5, s sVar6) {
        this.f4195a = sVar;
        this.f4196b = sVar2;
        this.f4197c = sVar3;
        this.f4198d = sVar4;
        this.f4199e = sVar5;
        this.f4200f = sVar6;
    }

    public final s a() {
        return this.f4197c;
    }

    public final s b() {
        return this.f4198d;
    }

    public final s c() {
        return this.f4196b;
    }

    public final s d() {
        return this.f4200f;
    }

    public final s e() {
        return this.f4199e;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        s sVar = this.f4195a;
        jSONObject.putOpt("geodesic", sVar != null ? sVar.b() : null);
        s sVar2 = this.f4196b;
        jSONObject.putOpt("foot", sVar2 != null ? sVar2.b() : null);
        s sVar3 = this.f4197c;
        jSONObject.putOpt("bike", sVar3 != null ? sVar3.b() : null);
        s sVar4 = this.f4198d;
        jSONObject.putOpt("car", sVar4 != null ? sVar4.b() : null);
        s sVar5 = this.f4199e;
        jSONObject.putOpt("truck", sVar5 != null ? sVar5.b() : null);
        s sVar6 = this.f4200f;
        jSONObject.putOpt("motorbike", sVar6 != null ? sVar6.b() : null);
        return jSONObject;
    }
}
