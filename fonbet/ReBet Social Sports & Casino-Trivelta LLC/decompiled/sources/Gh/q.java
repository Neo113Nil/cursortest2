package Gh;

import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: l, reason: collision with root package name */
    public static final a f4167l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4168a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4169b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4170c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4171d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4172e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4173f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4174g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4175h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4176i;

    /* renamed from: j, reason: collision with root package name */
    public final double f4177j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4178k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("_id");
            String str = optString == null ? "" : optString;
            String optString2 = jSONObject.optString("name");
            String str2 = optString2 == null ? "" : optString2;
            String optString3 = jSONObject.optString(EventKeys.ERROR_CODE);
            String str3 = optString3 == null ? "" : optString3;
            String optString4 = jSONObject.optString("type");
            String str4 = optString4 == null ? "" : optString4;
            String optString5 = jSONObject.optString("flag");
            return new q(str, str2, str3, str4, optString5 == null ? null : optString5, jSONObject.optBoolean("allowed"), jSONObject.optBoolean("passed"), jSONObject.optBoolean("inExclusionZone"), jSONObject.optBoolean("inBufferZone"), jSONObject.optDouble("distanceToBorder"), jSONObject.optBoolean("expected"));
        }

        public a() {
        }
    }

    public q(String _id, String name, String code, String type, String str, boolean z10, boolean z11, boolean z12, boolean z13, double d10, boolean z14) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f4168a = _id;
        this.f4169b = name;
        this.f4170c = code;
        this.f4171d = type;
        this.f4172e = str;
        this.f4173f = z10;
        this.f4174g = z11;
        this.f4175h = z12;
        this.f4176i = z13;
        this.f4177j = d10;
        this.f4178k = z14;
    }

    public final double a() {
        return this.f4177j;
    }

    public final String b() {
        return this.f4168a;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this.f4168a);
        jSONObject.putOpt("name", this.f4169b);
        jSONObject.putOpt(EventKeys.ERROR_CODE, this.f4170c);
        jSONObject.putOpt("type", this.f4171d);
        jSONObject.putOpt("flag", this.f4172e);
        jSONObject.putOpt("allowed", Boolean.valueOf(this.f4173f));
        jSONObject.putOpt("passed", Boolean.valueOf(this.f4174g));
        jSONObject.putOpt("inExclusionZone", Boolean.valueOf(this.f4175h));
        jSONObject.putOpt("inBufferZone", Boolean.valueOf(this.f4176i));
        if (!Double.isNaN(this.f4177j)) {
            jSONObject.putOpt("distanceToBorder", Double.valueOf(this.f4177j));
        }
        jSONObject.putOpt("expected", Boolean.valueOf(this.f4178k));
        return jSONObject;
    }
}
