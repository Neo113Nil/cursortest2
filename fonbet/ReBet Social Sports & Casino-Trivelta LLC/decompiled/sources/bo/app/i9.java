package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i9 f25566a = new i9();

    public static final String b(JSONObject jSONObject) {
        return "Failed to parse json. Returning unknown.\n" + jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r0 > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k9 a(final JSONObject json) {
        String optString;
        Long l10;
        String optString2;
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("type");
        j9 j9Var = j9.f25614a;
        if (Intrinsics.areEqual(string, "ccr")) {
            return new w5();
        }
        String str = null;
        if (Intrinsics.areEqual(string, "ttl")) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("body");
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("t_ms", -1L);
                l10 = Long.valueOf(optLong);
            }
            l10 = null;
            if (optJSONObject != null && (optString2 = optJSONObject.optString("rcs")) != null && optString2.length() > 0) {
                str = optString2;
            }
            return new p6(l10, str);
        }
        if (!Intrinsics.areEqual(string, "ddr")) {
            if (Intrinsics.areEqual(string, "ffr")) {
                return new y5();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.A3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.i9.b(json);
                }
            }, 7, (Object) null);
            return new q6();
        }
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject optJSONObject2 = json.optJSONObject("body");
        long optLong2 = optJSONObject2 != null ? optJSONObject2.optLong("r_ms", 500L) : 500L;
        if (optJSONObject2 != null && (optString = optJSONObject2.optString(com.bumptech.glide.gifdecoder.e.f29601m)) != null && optString.length() > 0) {
            str = optString;
        }
        return new x5(optLong2, str);
    }
}
