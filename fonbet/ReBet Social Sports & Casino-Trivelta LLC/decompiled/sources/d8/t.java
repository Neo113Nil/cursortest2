package d8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.LoginClient;
import h6.C4470F;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final a f45113d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f45114e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a, reason: collision with root package name */
    public final String f45115a;

    /* renamed from: b, reason: collision with root package name */
    public final C4470F f45116b;

    /* renamed from: c, reason: collision with root package name */
    public String f45117c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }

        public a() {
        }
    }

    public t(Context context, String applicationId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f45115a = applicationId;
        this.f45116b = new C4470F(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f45117c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void h(t this$0, Bundle bundle) {
        if (Y7.a.d(t.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bundle, "$bundle");
            this$0.f45116b.g("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th2) {
            Y7.a.b(th2, t.class);
        }
    }

    public static /* synthetic */ void k(t tVar, String str, String str2, String str3, int i10, Object obj) {
        if (Y7.a.d(t.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            tVar.j(str, str2, str3);
        } catch (Throwable th2) {
            Y7.a.b(th2, t.class);
        }
    }

    public final String b() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f45115a;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void c(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f45113d.b(str);
            if (str3 != null) {
                b10.putString("2_result", str3);
            }
            if (str4 != null) {
                b10.putString("5_error_message", str4);
            }
            if (str5 != null) {
                b10.putString("4_error_code", str5);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                b10.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            b10.putString("3_method", str2);
            this.f45116b.g(str6, b10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void d(String str, String str2, String str3) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f45113d.b(str);
            b10.putString("3_method", str2);
            this.f45116b.g(str3, b10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void e(String str, String str2, String str3) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f45113d.b(str);
            b10.putString("3_method", str2);
            this.f45116b.g(str3, b10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void f(String str, Map loggingExtras, LoginClient.Result.a aVar, Map map, Exception exc, String str2) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
            Bundle b10 = f45113d.b(str);
            if (aVar != null) {
                b10.putString("2_result", aVar.b());
            }
            if ((exc == null ? null : exc.getMessage()) != null) {
                b10.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ? null : new JSONObject(loggingExtras);
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                b10.putString("6_extras", jSONObject.toString());
            }
            this.f45116b.g(str2, b10);
            if (aVar == LoginClient.Result.a.SUCCESS) {
                g(str);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void g(String str) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            final Bundle b10 = f45113d.b(str);
            f45114e.schedule(new Runnable() { // from class: d8.s
                @Override // java.lang.Runnable
                public final void run() {
                    t.h(t.this, b10);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void i(LoginClient.Request pendingLoginRequest, String str) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pendingLoginRequest, "pendingLoginRequest");
            Bundle b10 = f45113d.b(pendingLoginRequest.getAuthId());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.getLoginBehavior().toString());
                jSONObject.put("request_code", LoginClient.INSTANCE.b());
                jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.getPermissions()));
                jSONObject.put("default_audience", pendingLoginRequest.getDefaultAudience().toString());
                jSONObject.put("isReauthorize", pendingLoginRequest.getIsRerequest());
                String str2 = this.f45117c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (pendingLoginRequest.getLoginTargetApp() != null) {
                    jSONObject.put("target_app", pendingLoginRequest.getLoginTargetApp().toString());
                }
                b10.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f45116b.g(str, b10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void j(String str, String str2, String str3) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f45113d.b("");
            b10.putString("2_result", LoginClient.Result.a.ERROR.b());
            b10.putString("5_error_message", str2);
            b10.putString("3_method", str3);
            this.f45116b.g(str, b10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
