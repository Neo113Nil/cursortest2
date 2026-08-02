package bo.app;

import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y4 {
    public static final String b() {
        return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
    }

    public static final String c() {
        return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
    }

    public static final String d() {
        return "Returning false for shouldReportPushPermissionsAsGranted.";
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject2.opt(next);
            Object opt2 = jSONObject.opt(next);
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        if (opt2 != null && JsonUtils.areJsonObjectsEqual((JSONObject) opt, (JSONObject) opt2)) {
                        }
                        jSONObject3.put(next, opt);
                    } else if (!Intrinsics.areEqual(opt, opt2)) {
                        jSONObject3.put(next, opt);
                    }
                } catch (JSONException e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.jd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.y4.a();
                        }
                    }, 4, (Object) null);
                    return null;
                }
            }
        }
        return jSONObject3;
    }

    public static final String a() {
        return "Caught json exception while creating the diff. Returning null";
    }

    public final boolean a(JSONObject cachedDeviceJson, JSONObject liveDeviceJson, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cachedDeviceJson, "cachedDeviceJson");
        Intrinsics.checkNotNullParameter(liveDeviceJson, "liveDeviceJson");
        boolean z10 = i11 >= 33;
        boolean z11 = i10 < 33 && z10;
        DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
        boolean optBoolean = liveDeviceJson.optBoolean(deviceKey.getKey(), false);
        boolean z12 = optBoolean && !cachedDeviceJson.optBoolean(deviceKey.getKey(), false);
        if (z10 && z12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.gd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y4.b();
                }
            }, 7, (Object) null);
            return true;
        }
        if (optBoolean && z11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.hd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y4.c();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.id
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.y4.d();
            }
        }, 6, (Object) null);
        return false;
    }
}
