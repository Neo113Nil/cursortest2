package Gh;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: Gh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1166c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4055e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4057b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4058c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f4059d;

    /* renamed from: Gh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1166c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("slug");
            if (optString == null) {
                optString = "";
            }
            String optString2 = jSONObject.optString("name");
            String str = optString2 != null ? optString2 : "";
            String optString3 = jSONObject.optString("externalId");
            return new C1166c(optString, str, optString3 != null ? optString3 : null, jSONObject.optJSONObject("metadata"));
        }

        public final C1166c[] b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            C1166c[] c1166cArr = new C1166c[length];
            for (int i10 = 0; i10 < length; i10++) {
                c1166cArr[i10] = C1166c.f4055e.a(jSONArray.optJSONObject(i10));
            }
            Object[] array = ArraysKt.filterNotNull(c1166cArr).toArray(new C1166c[0]);
            if (array != null) {
                return (C1166c[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final JSONArray c(C1166c[] c1166cArr) {
            if (c1166cArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (C1166c c1166c : c1166cArr) {
                jSONArray.put(c1166c.a());
            }
            return jSONArray;
        }

        public a() {
        }
    }

    public C1166c(String slug, String name, String str, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f4056a = slug;
        this.f4057b = name;
        this.f4058c = str;
        this.f4059d = jSONObject;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("slug", this.f4056a);
        jSONObject.putOpt("name", this.f4057b);
        jSONObject.putOpt("externalId", this.f4058c);
        jSONObject.putOpt("metadata", this.f4059d);
        return jSONObject;
    }
}
