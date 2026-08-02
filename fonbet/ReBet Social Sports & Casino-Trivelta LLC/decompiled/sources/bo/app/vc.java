package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vc implements q9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26144a;

    public vc(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f26144a = json.optInt("re_eligibility", -1);
    }

    public static final String b() {
        return "Could not convert ReEligibilityConfig to JSON";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            return new JSONObject().put("re_eligibility", this.f26144a);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Gb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.vc.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
