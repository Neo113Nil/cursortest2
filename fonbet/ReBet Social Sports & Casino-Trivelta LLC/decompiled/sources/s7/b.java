package s7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.twilio.voice.EventKeys;
import g6.C4339K;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C6445a;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static b f64798a;

    /* renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap f64799b;

    /* renamed from: c, reason: collision with root package name */
    public static C6445a f64800c;

    /* renamed from: s7.b$b, reason: collision with other inner class name */
    public static class C0899b extends BroadcastReceiver {
        public C0899b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CompletableFuture completableFuture;
            try {
                JSONObject jSONObject = new JSONObject(intent.getStringExtra("returnPayload"));
                String string = jSONObject.getString("requestID");
                if (!b.f64799b.containsKey(string) || (completableFuture = (CompletableFuture) b.f64799b.remove(string)) == null) {
                    return;
                }
                completableFuture.complete(b.i(jSONObject, string));
            } catch (JSONException unused) {
            }
        }
    }

    public b(Context context) {
        IntentFilter intentFilter = new IntentFilter("com.facebook.gamingservices.DAEMON_RESPONSE");
        HandlerThread handlerThread = new HandlerThread("com.facebook.gamingservices.DAEMON_RESPONSE_HANDLER");
        handlerThread.start();
        context.registerReceiver(new C0899b(), intentFilter, null, new Handler(handlerThread.getLooper()));
        f64799b = new ConcurrentHashMap();
        f64800c = C6445a.b(context);
    }

    public static C4339K c(String str) {
        return d(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
    }

    public static C4339K d(FacebookRequestError facebookRequestError, String str) {
        f64800c.f(facebookRequestError, str);
        return new C4339K(new GraphRequest(), null, facebookRequestError);
    }

    public static C4339K e(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("error");
        return optJSONObject != null ? d(new FacebookRequestError(optJSONObject.optInt(EventKeys.ERROR_CODE), optJSONObject.optString("type"), optJSONObject.optString("message")), str) : c(str);
    }

    public static C4339K f(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONObject("success") != null) {
            f64800c.g(str);
            return new C4339K(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONObject("success"));
        }
        if (jSONObject.optJSONArray("success") == null) {
            return c(str);
        }
        f64800c.g(str);
        return new C4339K(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONArray("success"));
    }

    public static synchronized b g(Context context) {
        b bVar;
        synchronized (b.class) {
            try {
                if (f64798a == null) {
                    f64798a = new b(context);
                }
                bVar = f64798a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static C4339K i(JSONObject jSONObject, String str) {
        return !jSONObject.isNull("success") ? f(jSONObject, str) : !jSONObject.isNull("error") ? e(jSONObject, str) : c(str);
    }

    public synchronized ConcurrentHashMap h() {
        return f64799b;
    }
}
