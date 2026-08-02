package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sd {
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
    public final td a(final JSONObject jsonData, boolean z10) {
        boolean z11;
        Long l10;
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        td tdVar = new td();
        boolean z12 = true;
        boolean z13 = false;
        if (!z10) {
            try {
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Ra
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.sd.b();
                    }
                }, 4, (Object) null);
            }
            if (!jsonData.getBoolean(ViewProps.ENABLED)) {
                z11 = false;
                tdVar.f26084a = z11;
                if (jsonData.has("authorization_code")) {
                    tdVar.f26086c = jsonData.getString("authorization_code");
                }
                if (jsonData.has("expiration_time")) {
                    tdVar.f26085b = Long.valueOf(jsonData.getLong("expiration_time"));
                }
                JSONObject jSONObject = jsonData.getJSONObject("batching_config");
                tdVar.f26087d = jSONObject.getLong("flush_interval_size");
                tdVar.f26088e = jSONObject.getLong("flush_interval_seconds");
                long j10 = jSONObject.getLong("max_payload_size");
                tdVar.f26089f = j10;
                if (tdVar.f26087d > 0 || tdVar.f26088e <= 0 || j10 <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Pa
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.sd.a(jsonData);
                        }
                    }, 7, (Object) null);
                    z13 = true;
                }
                l10 = tdVar.f26085b;
                if (l10 != null || l10.longValue() >= DateTimeUtils.nowInSeconds()) {
                    z12 = z13;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Qa
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.sd.a();
                        }
                    }, 7, (Object) null);
                }
                return !z12 ? new td() : tdVar;
            }
        }
        z11 = true;
        tdVar.f26084a = z11;
        if (jsonData.has("authorization_code")) {
        }
        if (jsonData.has("expiration_time")) {
        }
        JSONObject jSONObject2 = jsonData.getJSONObject("batching_config");
        tdVar.f26087d = jSONObject2.getLong("flush_interval_size");
        tdVar.f26088e = jSONObject2.getLong("flush_interval_seconds");
        long j102 = jSONObject2.getLong("max_payload_size");
        tdVar.f26089f = j102;
        if (tdVar.f26087d > 0) {
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Pa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.sd.a(jsonData);
            }
        }, 7, (Object) null);
        z13 = true;
        l10 = tdVar.f26085b;
        if (l10 != null) {
        }
        z12 = z13;
        if (!z12) {
        }
    }

    public static final String a(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public static final String a() {
        return "SDK Debugger expiration time is in the past. Disabling SDK debugging.";
    }
}
