package t7;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import h6.C4470F;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6445a {

    /* renamed from: f, reason: collision with root package name */
    public static C6445a f65720f;

    /* renamed from: a, reason: collision with root package name */
    public final C4470F f65721a;

    /* renamed from: b, reason: collision with root package name */
    public String f65722b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f65723c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f65724d = null;

    /* renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f65725e = new ConcurrentHashMap();

    public C6445a(Context context) {
        this.f65721a = new C4470F(context);
    }

    public static synchronized C6445a b(Context context) {
        C6445a c6445a;
        synchronized (C6445a.class) {
            try {
                if (f65720f == null) {
                    f65720f = new C6445a(context);
                }
                c6445a = f65720f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6445a;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f65722b;
        if (str != null) {
            bundle.putString(PublisherMetadata.APP_ID, str);
        }
        String str2 = this.f65724d;
        if (str2 != null) {
            bundle.putString("session_id", str2);
        }
        return bundle;
    }

    public final Bundle c(String str) {
        Bundle a10 = a();
        if (str != null) {
            String str2 = (String) this.f65725e.getOrDefault(str, null);
            a10.putString("request_id", str);
            if (str2 != null) {
                a10.putString("function_type", str2);
                this.f65725e.remove(str);
            }
        }
        return a10;
    }

    public final Bundle d(String str, String str2) {
        Bundle a10 = a();
        a10.putString("request_id", str);
        a10.putString("function_type", str2);
        return a10;
    }

    public void e(String str, String str2, JSONObject jSONObject) {
        Bundle d10 = d(str2, str);
        d10.putString(EventKeys.PAYLOAD, jSONObject.toString());
        this.f65721a.g("cloud_games_preparing_request", d10);
    }

    public void f(FacebookRequestError facebookRequestError, String str) {
        Bundle c10 = c(str);
        c10.putString(EventKeys.ERROR_CODE_KEY, Integer.toString(facebookRequestError.getErrorCode()));
        c10.putString("error_type", facebookRequestError.getErrorType());
        c10.putString(EventKeys.ERROR_MESSAGE_KEY, facebookRequestError.d());
        this.f65721a.g("cloud_games_sending_error_response", c10);
    }

    public void g(String str) {
        this.f65721a.g("cloud_games_sending_success_response", c(str));
    }

    public void h(String str, String str2, JSONObject jSONObject) {
        Bundle d10 = d(str2, str);
        this.f65725e.put(str2, str);
        d10.putString(EventKeys.PAYLOAD, jSONObject.toString());
        this.f65721a.g("cloud_games_sent_request", d10);
    }
}
