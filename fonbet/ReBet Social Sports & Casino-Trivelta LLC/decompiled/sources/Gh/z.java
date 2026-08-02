package Gh;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4216c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4218b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("description");
            if (optString == null) {
                optString = "";
            }
            String optString2 = jSONObject.optString("externalId");
            return new z(optString, optString2 != null ? optString2 : "");
        }

        public final z[] b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            z[] zVarArr = new z[length];
            for (int i10 = 0; i10 < length; i10++) {
                zVarArr[i10] = z.f4216c.a(jSONArray.optJSONObject(i10));
            }
            Object[] array = ArraysKt.filterNotNull(zVarArr).toArray(new z[0]);
            if (array != null) {
                return (z[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final JSONArray c(z[] zVarArr) {
            if (zVarArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (z zVar : zVarArr) {
                jSONArray.put(zVar.a());
            }
            return jSONArray;
        }

        public a() {
        }
    }

    public z(String description, String externalId) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        this.f4217a = description;
        this.f4218b = externalId;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("description", this.f4217a);
        jSONObject.putOpt("externalId", this.f4218b);
        return jSONObject;
    }
}
