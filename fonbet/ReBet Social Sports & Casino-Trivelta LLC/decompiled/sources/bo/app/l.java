package bo.app;

import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {
    public static final String b() {
        return "Received null inner banner object. Not parsing.";
    }

    public final Banner a(final JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.W4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l.a();
                }
            }, 6, (Object) null);
            return null;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("banner");
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.X4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.l.b();
                    }
                }, 6, (Object) null);
                return null;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("properties");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            JSONObject jSONObject2 = optJSONObject2;
            if (!optJSONObject.isNull("stable_key")) {
                String optString = optJSONObject.optString("stable_key");
                if (optString.length() != 0) {
                    str = optString;
                    String string = optJSONObject.getString(StackTraceHelper.ID_KEY);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = optJSONObject.getString("placement_id");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = optJSONObject.getString("html");
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return new Banner(string, string2, string3, optJSONObject.getBoolean("is_control"), optJSONObject.getLong("expires_at"), optJSONObject.getBoolean("is_test_send"), str, jSONObject2);
                }
            }
            str = null;
            String string4 = optJSONObject.getString(StackTraceHelper.ID_KEY);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string22 = optJSONObject.getString("placement_id");
            Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
            String string32 = optJSONObject.getString("html");
            Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
            return new Banner(string4, string22, string32, optJSONObject.getBoolean("is_control"), optJSONObject.getLong("expires_at"), optJSONObject.getBoolean("is_test_send"), str, jSONObject2);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Y4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l.b(jSONObject);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize banner Json: " + jSONObject;
    }

    public static final String a() {
        return "Received null banner object. Not parsing.";
    }
}
