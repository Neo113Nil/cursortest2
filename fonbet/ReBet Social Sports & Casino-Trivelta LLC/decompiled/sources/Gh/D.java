package Gh;

import io.radar.sdk.R0;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: h, reason: collision with root package name */
    public static final a f4003h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C f4004a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4005b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f4006c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4007d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4008e;

    @NotNull
    private final h[] events;

    /* renamed from: f, reason: collision with root package name */
    public final String f4009f;

    @NotNull
    private final String[] failureReasons;

    /* renamed from: g, reason: collision with root package name */
    public final JSONObject f4010g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a(JSONObject jSONObject) {
            String[] strArr;
            if (jSONObject == null) {
                return null;
            }
            C a10 = C.f3984s.a(jSONObject.optJSONObject("user"));
            h[] b10 = h.f4075t.b(jSONObject.optJSONArray("events"));
            String optString = jSONObject.optString("token");
            Date o10 = R0.f49781a.o(jSONObject.optString("expiresAt"));
            int optInt = jSONObject.optInt("expiresIn");
            boolean optBoolean = jSONObject.optBoolean("passed");
            JSONArray optJSONArray = jSONObject.optJSONArray("failureReasons");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                strArr = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    String optString2 = optJSONArray.optString(i10);
                    Intrinsics.checkNotNullExpressionValue(optString2, "failureReasons.optString(it)");
                    strArr[i10] = optString2;
                }
            } else {
                strArr = new String[0];
            }
            String optString3 = jSONObject.optString("_id");
            if (optString3 == null) {
                optString3 = "";
            }
            String str = optString3;
            if (a10 == null || b10 == null || optString == null || o10 == null) {
                return null;
            }
            return new D(a10, b10, optString, o10, optInt, optBoolean, strArr, str, jSONObject);
        }

        public a() {
        }
    }

    public D(C user, h[] events, String token, Date expiresAt, int i10, boolean z10, String[] failureReasons, String _id, JSONObject fullJson) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(failureReasons, "failureReasons");
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(fullJson, "fullJson");
        this.f4004a = user;
        this.events = events;
        this.f4005b = token;
        this.f4006c = expiresAt;
        this.f4007d = i10;
        this.f4008e = z10;
        this.failureReasons = failureReasons;
        this.f4009f = _id;
        this.f4010g = fullJson;
    }

    public final Date a() {
        return this.f4006c;
    }

    public final int b() {
        return this.f4007d;
    }

    public final boolean c() {
        return this.f4008e;
    }

    public final String d() {
        return this.f4005b;
    }

    public final C e() {
        return this.f4004a;
    }

    public final JSONObject f() {
        return this.f4010g;
    }
}
