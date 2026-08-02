package lb;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f55744a;

    static {
        HashMap hashMap = new HashMap();
        f55744a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(Intent intent) {
        AbstractC3191o.m(intent);
        AbstractC3191o.a(d(intent));
        return (Status) E9.c.b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(EventKeys.ERROR_CODE);
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f55744a;
                if (map.containsKey(string)) {
                    return AbstractC5433l.a(((String) map.get(string)) + ":" + string2);
                }
            }
            return AbstractC5433l.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            return AbstractC5433l.a("WEB_INTERNAL_ERROR:" + str + "[ " + e10.getLocalizedMessage() + " ]");
        }
    }

    public static void c(Intent intent, Status status) {
        E9.c.e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean d(Intent intent) {
        AbstractC3191o.m(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
