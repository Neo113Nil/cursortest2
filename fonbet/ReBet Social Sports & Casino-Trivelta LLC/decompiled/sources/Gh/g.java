package Gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4072c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final double f4073a;

    /* renamed from: b, reason: collision with root package name */
    public final double f4074b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public g(double d10, double d11) {
        this.f4073a = d10;
        this.f4074b = d11;
    }

    public final double a() {
        return this.f4073a;
    }

    public final double b() {
        return this.f4074b;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", "Point");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f4074b);
        jSONArray.put(this.f4073a);
        jSONObject.putOpt("coordinates", jSONArray);
        return jSONObject;
    }
}
