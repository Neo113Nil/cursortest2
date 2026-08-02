package com.braze.models.dust;

import com.braze.support.BrazeLogger;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f625a = new e();

    public static final String b(JSONObject jSONObject) {
        return "Failed to parse json. Returning unknown.\n" + jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r0 > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g a(final JSONObject json) {
        String optString;
        Long l;
        String optString2;
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("type");
        f fVar = f.f626a;
        if (Intrinsics.areEqual(string, "ccr")) {
            return new a();
        }
        String str = null;
        if (Intrinsics.areEqual(string, "ttl")) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("body");
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("t_ms", -1L);
                l = Long.valueOf(optLong);
            }
            l = null;
            if (optJSONObject != null && (optString2 = optJSONObject.optString("rcs")) != null && optString2.length() > 0) {
                str = optString2;
            }
            return new c(l, str);
        }
        if (!Intrinsics.areEqual(string, "ddr")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.models.dust.e$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.b(json);
                }
            }, 7, (Object) null);
            return new d();
        }
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject optJSONObject2 = json.optJSONObject("body");
        long optLong2 = optJSONObject2 != null ? optJSONObject2.optLong("r_ms", 500L) : 500L;
        if (optJSONObject2 != null && (optString = optJSONObject2.optString(JWKParameterNames.RSA_EXPONENT)) != null && optString.length() > 0) {
            str = optString;
        }
        return new b(optLong2, str);
    }
}
