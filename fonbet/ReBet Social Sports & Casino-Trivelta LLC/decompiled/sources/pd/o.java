package pd;

import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f63158a = new o();

    public static final int a(String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject b10 = f63158a.b(response);
        if (b10 == null || !b10.has(EventKeys.ERROR_CODE) || b10.isNull(EventKeys.ERROR_CODE) || !(b10.get(EventKeys.ERROR_CODE) instanceof Integer)) {
            return -1;
        }
        return b10.getInt(EventKeys.ERROR_CODE);
    }

    public static final String c(String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject b10 = f63158a.b(response);
        if (b10 == null || !b10.has("message") || b10.isNull("message") || !(b10.get("message") instanceof String)) {
            return "";
        }
        String string = b10.getString("message");
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final JSONObject b(String str) {
        if (str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error") && !jSONObject.isNull("error") && (jSONObject.get("error") instanceof JSONObject)) {
                return jSONObject.getJSONObject("error");
            }
        }
        return null;
    }
}
