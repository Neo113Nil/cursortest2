package com.braze.managers;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c1 {
    public static final String b() {
        return "Error getting required SDK debugging fields in SdkDebugManager. Disabling SDK debugging.";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:33:0x0014, B:4:0x0025, B:6:0x002d, B:7:0x0033, B:9:0x0039, B:10:0x0043, B:12:0x0069, B:16:0x0085, B:18:0x0089, B:20:0x0095, B:31:0x0073), top: B:32:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:33:0x0014, B:4:0x0025, B:6:0x002d, B:7:0x0033, B:9:0x0039, B:10:0x0043, B:12:0x0069, B:16:0x0085, B:18:0x0089, B:20:0x0095, B:31:0x0073), top: B:32:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d1 a(final JSONObject jsonData, boolean z) {
        boolean z2;
        Long l;
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        d1 d1Var = new d1();
        boolean z3 = true;
        boolean z4 = false;
        if (!z) {
            try {
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.c1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c1.b();
                    }
                }, 4, (Object) null);
            }
            if (!jsonData.getBoolean("enabled")) {
                z2 = false;
                d1Var.f580a = z2;
                if (jsonData.has("authorization_code")) {
                    d1Var.c = jsonData.getString("authorization_code");
                }
                if (jsonData.has("expiration_time")) {
                    d1Var.b = Long.valueOf(jsonData.getLong("expiration_time"));
                }
                JSONObject jSONObject = jsonData.getJSONObject("batching_config");
                d1Var.d = jSONObject.getLong("flush_interval_size");
                d1Var.e = jSONObject.getLong("flush_interval_seconds");
                long j = jSONObject.getLong("max_payload_size");
                d1Var.f = j;
                if (d1Var.d > 0 || d1Var.e <= 0 || j <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.c1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c1.a(jsonData);
                        }
                    }, 7, (Object) null);
                    z4 = true;
                }
                l = d1Var.b;
                if (l != null || l.longValue() >= DateTimeUtils.nowInSeconds()) {
                    z3 = z4;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.c1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c1.a();
                        }
                    }, 7, (Object) null);
                }
                return !z3 ? new d1() : d1Var;
            }
        }
        z2 = true;
        d1Var.f580a = z2;
        if (jsonData.has("authorization_code")) {
        }
        if (jsonData.has("expiration_time")) {
        }
        JSONObject jSONObject2 = jsonData.getJSONObject("batching_config");
        d1Var.d = jSONObject2.getLong("flush_interval_size");
        d1Var.e = jSONObject2.getLong("flush_interval_seconds");
        long j2 = jSONObject2.getLong("max_payload_size");
        d1Var.f = j2;
        if (d1Var.d > 0) {
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.c1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1.a(jsonData);
            }
        }, 7, (Object) null);
        z4 = true;
        l = d1Var.b;
        if (l != null) {
        }
        z3 = z4;
        if (!z3) {
        }
    }

    public static final String a(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public static final String a() {
        return "SDK Debugger expiration time is in the past. Disabling SDK debugging.";
    }
}
