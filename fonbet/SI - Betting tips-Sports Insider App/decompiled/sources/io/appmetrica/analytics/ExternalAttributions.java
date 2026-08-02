package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Ac;
import io.appmetrica.analytics.impl.C0124eb;
import io.appmetrica.analytics.impl.C0127ee;
import io.appmetrica.analytics.impl.C0231ie;
import io.appmetrica.analytics.impl.J9;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C0127ee(J9.ADJUST) : new C0231ie(J9.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C0127ee(J9.AIRBRIDGE) : new Ac(J9.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C0127ee(J9.APPSFLYER) : new Ac(J9.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C0127ee(J9.KOCHAVA) : new C0124eb(J9.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C0127ee(J9.SINGULAR) : new Ac(J9.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C0127ee(J9.TENJIN) : new Ac(J9.TENJIN, map);
    }
}
