package p6;

import T7.C1662b;
import T7.J;
import T7.Y;
import android.content.Context;
import g6.N;
import h6.p;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f63070a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f63071b = MapsKt.hashMapOf(TuplesKt.to(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), TuplesKt.to(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final JSONObject a(a activityType, C1662b c1662b, String str, boolean z10, Context context) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f63071b.get(activityType));
        String e10 = p.f47798b.e();
        if (e10 != null) {
            jSONObject.put("app_user_id", e10);
        }
        Y.F0(jSONObject, c1662b, str, z10, context);
        try {
            Y.G0(jSONObject, context);
        } catch (Exception e11) {
            J.f10993e.c(N.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e11.toString());
        }
        JSONObject C10 = Y.C();
        if (C10 != null) {
            Iterator<String> keys = C10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, C10.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
