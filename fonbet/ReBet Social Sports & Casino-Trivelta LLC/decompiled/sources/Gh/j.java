package Gh;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final a f4139h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4141b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4142c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4143d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f4144e;

    /* renamed from: f, reason: collision with root package name */
    public final n f4145f;

    /* renamed from: g, reason: collision with root package name */
    public final k f4146g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final j b(JSONObject jSONObject) {
            String str;
            String str2;
            String str3;
            String str4;
            k kVar;
            k kVar2;
            k c1167d;
            String str5;
            String str6;
            String str7;
            String str8;
            boolean z10;
            g gVar;
            JSONArray optJSONArray;
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("_id");
            String str9 = optString == null ? "" : optString;
            String optString2 = jSONObject.optString("description");
            String str10 = optString2 == null ? "" : optString2;
            String optString3 = jSONObject.optString("tag");
            String str11 = optString3 == null ? null : optString3;
            String optString4 = jSONObject.optString("externalId");
            String str12 = optString4 == null ? null : optString4;
            JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
            JSONObject jSONObject2 = optJSONObject == null ? null : optJSONObject;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("operatingHours");
            n a10 = optJSONObject2 != null ? n.f4155b.a(optJSONObject2) : null;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("geometryCenter");
            int i10 = 1;
            boolean z11 = false;
            g gVar2 = (optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("coordinates")) == null) ? new g(0.0d, 0.0d) : new g(optJSONArray.optDouble(1), optJSONArray.optDouble(0));
            double optDouble = jSONObject.optDouble("geometryRadius");
            String optString5 = jSONObject.optString("type");
            if (optString5 != null) {
                int hashCode = optString5.hashCode();
                if (hashCode == -1360216880) {
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    kVar = null;
                    if (optString5.equals("circle")) {
                        c1167d = new C1167d(gVar2, optDouble);
                    }
                    kVar2 = kVar;
                    if (kVar2 == null) {
                    }
                    return new j(str, str2, str3, str4, jSONObject2, a10, kVar2);
                }
                if (hashCode == -397519558 ? optString5.equals("polygon") : hashCode == 418067294 && optString5.equals("isochrone")) {
                    JSONObject optJSONObject4 = jSONObject.optJSONObject("geometry");
                    JSONArray optJSONArray2 = optJSONObject4 != null ? optJSONObject4.optJSONArray("coordinates") : null;
                    if (optJSONArray2 != null) {
                        JSONArray optJSONArray3 = optJSONArray2.optJSONArray(0);
                        if (optJSONArray3 == null) {
                            str = str9;
                            str2 = str10;
                            str3 = str11;
                            str4 = str12;
                            kVar2 = null;
                            if (kVar2 == null) {
                                kVar2 = new C1167d(new g(0.0d, 0.0d), 0.0d);
                            }
                            return new j(str, str2, str3, str4, jSONObject2, a10, kVar2);
                        }
                        int length = optJSONArray3.length();
                        g[] gVarArr = new g[length];
                        int i11 = 0;
                        while (i11 < length) {
                            JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i11);
                            if (optJSONArray4 != null) {
                                Intrinsics.checkNotNullExpressionValue(optJSONArray4, "optJSONArray(index)");
                                str5 = str9;
                                str6 = str10;
                                double optDouble2 = optJSONArray4.optDouble(i10);
                                str7 = str11;
                                str8 = str12;
                                z10 = false;
                                gVar = new g(optDouble2, optJSONArray4.optDouble(0));
                            } else {
                                str5 = str9;
                                str6 = str10;
                                str7 = str11;
                                str8 = str12;
                                z10 = z11;
                                gVar = new g(0.0d, 0.0d);
                            }
                            gVarArr[i11] = gVar;
                            i11++;
                            z11 = z10;
                            str11 = str7;
                            str9 = str5;
                            str10 = str6;
                            str12 = str8;
                            i10 = 1;
                        }
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        c1167d = new p(gVarArr, gVar2, optDouble);
                    } else {
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        c1167d = new p(null, gVar2, optDouble);
                    }
                }
                kVar2 = c1167d;
                if (kVar2 == null) {
                }
                return new j(str, str2, str3, str4, jSONObject2, a10, kVar2);
            }
            str = str9;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            kVar = null;
            kVar2 = kVar;
            if (kVar2 == null) {
            }
            return new j(str, str2, str3, str4, jSONObject2, a10, kVar2);
        }

        public final j[] c(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            j[] jVarArr = new j[length];
            for (int i10 = 0; i10 < length; i10++) {
                jVarArr[i10] = j.f4139h.b(jSONArray.optJSONObject(i10));
            }
            Object[] array = ArraysKt.filterNotNull(jVarArr).toArray(new j[0]);
            if (array != null) {
                return (j[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final JSONArray d(g[] gVarArr) {
            if (gVarArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (g gVar : gVarArr) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(gVar.b());
                jSONArray2.put(gVar.a());
                jSONArray.put(jSONArray2);
            }
            return jSONArray;
        }

        public final JSONArray e(j[] jVarArr) {
            if (jVarArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (j jVar : jVarArr) {
                jSONArray.put(jVar.e());
            }
            return jSONArray;
        }

        public a() {
        }
    }

    public j(String _id, String description, String str, String str2, JSONObject jSONObject, n nVar, k kVar) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f4140a = _id;
        this.f4141b = description;
        this.f4142c = str;
        this.f4143d = str2;
        this.f4144e = jSONObject;
        this.f4145f = nVar;
        this.f4146g = kVar;
    }

    public static final JSONArray d(j[] jVarArr) {
        return f4139h.e(jVarArr);
    }

    public final k a() {
        return this.f4146g;
    }

    public final JSONObject b() {
        return this.f4144e;
    }

    public final String c() {
        return this.f4140a;
    }

    public final JSONObject e() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("_id", this.f4140a);
        jSONObject2.putOpt("tag", this.f4142c);
        jSONObject2.putOpt("externalId", this.f4143d);
        jSONObject2.putOpt("description", this.f4141b);
        jSONObject2.putOpt("metadata", this.f4144e);
        n nVar = this.f4145f;
        if (nVar == null || (jSONObject = nVar.a()) == null) {
            jSONObject = null;
        }
        jSONObject2.putOpt("operatingHours", jSONObject);
        k kVar = this.f4146g;
        if (kVar == null) {
            return jSONObject2;
        }
        if (kVar instanceof C1167d) {
            C1167d c1167d = (C1167d) kVar;
            jSONObject2.putOpt("geometryCenter", c1167d.a().c());
            jSONObject2.putOpt("geometryRadius", Double.valueOf(c1167d.b()));
            jSONObject2.putOpt("type", "Circle");
            return jSONObject2;
        }
        if (!(kVar instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar = (p) kVar;
        jSONObject2.putOpt("geometryCenter", pVar.a().c());
        jSONObject2.putOpt("geometryRadius", Double.valueOf(pVar.c()));
        if (pVar.b() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(f4139h.d(pVar.b()));
            jSONObject2.putOpt("coordinates", jSONArray);
        }
        jSONObject2.putOpt("type", "Polygon");
        return jSONObject2;
    }
}
