package Gh;

import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4185c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final double f4186a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4187b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            double optDouble = jSONObject.optDouble(EventKeys.VALUE_KEY);
            String optString = jSONObject.optString("text");
            if (optString == null) {
                optString = "";
            }
            return new t(optDouble, optString);
        }

        public a() {
        }
    }

    public t(double d10, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f4186a = d10;
        this.f4187b = text;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(EventKeys.VALUE_KEY, Double.valueOf(this.f4186a));
        jSONObject.putOpt("text", this.f4187b);
        return jSONObject;
    }
}
