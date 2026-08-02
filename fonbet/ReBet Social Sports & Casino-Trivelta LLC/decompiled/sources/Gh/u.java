package Gh;

import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4188c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final double f4189a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4190b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            double optDouble = jSONObject.optDouble(EventKeys.VALUE_KEY);
            String optString = jSONObject.optString("text");
            if (optString == null) {
                optString = "";
            }
            return new u(optDouble, optString);
        }

        public a() {
        }
    }

    public u(double d10, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f4189a = d10;
        this.f4190b = text;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(EventKeys.VALUE_KEY, Double.valueOf(this.f4189a));
        jSONObject.putOpt("text", this.f4190b);
        return jSONObject;
    }
}
