package Gh;

import com.twilio.voice.EventKeys;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: h, reason: collision with root package name */
    public static final a f4157h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4159b;

    /* renamed from: c, reason: collision with root package name */
    public final C1166c f4160c;

    @NotNull
    private final String[] categories;

    /* renamed from: d, reason: collision with root package name */
    public final g f4161d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4162e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONObject f4163f;

    /* renamed from: g, reason: collision with root package name */
    public final C1164a f4164g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(JSONObject jSONObject) {
            String[] strArr;
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("_id");
            String str = optString == null ? "" : optString;
            String optString2 = jSONObject.optString("name");
            String str2 = optString2 == null ? "" : optString2;
            JSONArray optJSONArray = jSONObject.optJSONArray("categories");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                strArr = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    String optString3 = optJSONArray.optString(i10);
                    Intrinsics.checkNotNullExpressionValue(optString3, "categoriesArr.optString(it)");
                    strArr[i10] = optString3;
                }
            } else {
                strArr = new String[0];
            }
            C1166c a10 = C1166c.f4055e.a(jSONObject.optJSONObject("chain"));
            JSONObject optJSONObject = jSONObject.optJSONObject("location");
            JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray("coordinates") : null;
            g gVar = new g(optJSONArray2 != null ? optJSONArray2.optDouble(1) : 0.0d, optJSONArray2 != null ? optJSONArray2.optDouble(0) : 0.0d);
            String optString4 = jSONObject.optString(EventKeys.EVENT_GROUP);
            String str3 = optString4 == null ? null : optString4;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("metadata");
            JSONObject jSONObject2 = optJSONObject2 == null ? null : optJSONObject2;
            jSONObject.optJSONObject("address");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("address");
            return new o(str, str2, strArr, a10, gVar, str3, jSONObject2, optJSONObject3 != null ? C1164a.f4011z.a(optJSONObject3) : null);
        }

        public final o[] b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            o[] oVarArr = new o[length];
            for (int i10 = 0; i10 < length; i10++) {
                oVarArr[i10] = o.f4157h.a(jSONArray.optJSONObject(i10));
            }
            Object[] array = ArraysKt.filterNotNull(oVarArr).toArray(new o[0]);
            if (array != null) {
                return (o[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final JSONArray c(o[] oVarArr) {
            if (oVarArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (o oVar : oVarArr) {
                jSONArray.put(oVar.c());
            }
            return jSONArray;
        }

        public a() {
        }
    }

    public o(String _id, String name, String[] categories, C1166c c1166c, g location, String str, JSONObject jSONObject, C1164a c1164a) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4158a = _id;
        this.f4159b = name;
        this.categories = categories;
        this.f4160c = c1166c;
        this.f4161d = location;
        this.f4162e = str;
        this.f4163f = jSONObject;
        this.f4164g = c1164a;
    }

    public static final JSONArray b(o[] oVarArr) {
        return f4157h.c(oVarArr);
    }

    public final String a() {
        return this.f4158a;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this.f4158a);
        jSONObject.putOpt("name", this.f4159b);
        JSONArray jSONArray = new JSONArray();
        for (String str : this.categories) {
            jSONArray.put(str);
        }
        jSONObject.putOpt("categories", jSONArray);
        C1166c c1166c = this.f4160c;
        jSONObject.putOpt("chain", c1166c != null ? c1166c.a() : null);
        jSONObject.putOpt(EventKeys.EVENT_GROUP, this.f4162e);
        jSONObject.putOpt("metadata", this.f4163f);
        jSONObject.putOpt("location", this.f4161d.c());
        C1164a c1164a = this.f4164g;
        jSONObject.putOpt("address", c1164a != null ? c1164a.k() : null);
        return jSONObject;
    }
}
