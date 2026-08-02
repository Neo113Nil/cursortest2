package Gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4191a = new a(null);

    @Nullable
    private final g[] coordinates;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(JSONObject jSONObject) {
            JSONArray optJSONArray;
            g gVar;
            if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("coordinates")) == null) {
                return null;
            }
            int length = optJSONArray.length();
            g[] gVarArr = new g[length];
            for (int i10 = 0; i10 < length; i10++) {
                JSONArray optJSONArray2 = optJSONArray.optJSONArray(i10);
                if (optJSONArray2 != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray2, "optJSONArray(index)");
                    gVar = new g(optJSONArray2.optDouble(1), optJSONArray2.optDouble(0));
                } else {
                    gVar = new g(0.0d, 0.0d);
                }
                gVarArr[i10] = gVar;
            }
            return new v(gVarArr);
        }

        public a() {
        }
    }

    public v(g[] gVarArr) {
        this.coordinates = gVarArr;
    }

    public final g[] a() {
        return this.coordinates;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", "LineString");
        JSONArray jSONArray = new JSONArray();
        g[] gVarArr = this.coordinates;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(gVar.b());
                jSONArray2.put(gVar.a());
                jSONArray.put(jSONArray2);
            }
        }
        jSONObject.putOpt("coordinates", jSONArray);
        return jSONObject;
    }
}
