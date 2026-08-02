package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.d0;
import com.facebook.g0;
import com.facebook.internal.k0;
import com.facebook.login.LoginClient;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.ba4;
import defpackage.cqa;
import defpackage.cw3;
import defpackage.ke0;
import defpackage.ph0;
import defpackage.rgh;
import defpackage.u94;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w {
    public static final t b = new t();
    public static final Set c = ph0.a0(new String[]{"ads_management", "create_event", "rsvp_event"});
    public static volatile w d;
    public final SharedPreferences a;

    static {
        w.class.toString().getClass();
    }

    public w() {
        com.facebook.internal.h.k();
        SharedPreferences sharedPreferences = com.facebook.w.a().getSharedPreferences("com.facebook.loginManager", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        if (!com.facebook.w.n || com.facebook.internal.h.c() == null) {
            return;
        }
        ba4.a(com.facebook.w.a(), "com.android.chrome", new b());
        Context a = com.facebook.w.a();
        String packageName = com.facebook.w.a().getPackageName();
        if (packageName == null) {
            return;
        }
        Context applicationContext = a.getApplicationContext();
        try {
            ba4.a(applicationContext, packageName, new u94(applicationContext));
        } catch (SecurityException unused) {
        }
    }

    public static void a(Context context, int i, Map map, com.facebook.q qVar, boolean z, LoginClient.Request request) {
        r a = v.a.a(context);
        if (request == null) {
            ScheduledExecutorService scheduledExecutorService = r.d;
            if (cw3.a.contains(r.class)) {
                return;
            }
            try {
                a.b("fb_mobile_login_complete", "");
                return;
            } catch (Throwable th) {
                cw3.a(r.class, th);
                return;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z ? "1" : "0");
        hashMap.put("from_sso", "false");
        String str = request.g;
        String str2 = request.o ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        ScheduledExecutorService scheduledExecutorService2 = r.d;
        if (cw3.a.contains(a)) {
            return;
        }
        try {
            Bundle t = f1.t(str);
            if (i != 0) {
                t.putString("2_result", com.appsflyer.internal.i.c(i));
            }
            if ((qVar != null ? qVar.getMessage() : null) != null) {
                t.putString("5_error_message", qVar.getMessage());
            }
            JSONObject jSONObject = hashMap.isEmpty() ? null : new JSONObject(hashMap);
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
                t.putString("6_extras", jSONObject.toString());
            }
            a.a(t, str2);
            if (i != 1 || cw3.a.contains(a)) {
                return;
            }
            try {
                r.d.schedule(new com.facebook.v(5, a, f1.t(str)), 5L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                cw3.a(a, th2);
            }
        } catch (Throwable th3) {
            cw3.a(a, th3);
        }
    }

    public final void b() {
        Date date = AccessToken.l;
        com.facebook.i.f.i().c(null, true);
        com.facebook.appevents.j.x(null);
        com.facebook.k.f.j().a(null, true);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, Intent intent, cqa cqaVar) {
        int i2;
        boolean z;
        com.facebook.q qVar;
        AccessToken accessToken;
        Map map;
        LoginClient.Request request;
        AuthenticationToken authenticationToken;
        AccessToken accessToken2;
        boolean z2;
        Parcelable parcelable;
        x xVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request2 = result.f;
                i2 = result.a;
                if (i != -1) {
                    if (i != 0) {
                        qVar = null;
                        accessToken2 = null;
                        parcelable = accessToken2;
                        z2 = false;
                        AccessToken accessToken3 = accessToken2;
                        map = result.g;
                        accessToken = accessToken3;
                        request = request2;
                        authenticationToken = parcelable;
                        z = z2;
                    } else {
                        z2 = true;
                        qVar = null;
                        accessToken2 = null;
                        parcelable = null;
                        AccessToken accessToken32 = accessToken2;
                        map = result.g;
                        accessToken = accessToken32;
                        request = request2;
                        authenticationToken = parcelable;
                        z = z2;
                    }
                } else if (i2 == 1) {
                    AccessToken accessToken4 = result.b;
                    z2 = false;
                    parcelable = result.c;
                    accessToken2 = accessToken4;
                    qVar = null;
                    AccessToken accessToken322 = accessToken2;
                    map = result.g;
                    accessToken = accessToken322;
                    request = request2;
                    authenticationToken = parcelable;
                    z = z2;
                } else {
                    qVar = new com.facebook.n(result.d);
                    accessToken2 = null;
                    parcelable = accessToken2;
                    z2 = false;
                    AccessToken accessToken3222 = accessToken2;
                    map = result.g;
                    accessToken = accessToken3222;
                    request = request2;
                    authenticationToken = parcelable;
                    z = z2;
                }
            }
            i2 = 3;
            qVar = null;
            accessToken = null;
            map = null;
            request = null;
            authenticationToken = 0;
            z = false;
        } else {
            if (i == 0) {
                i2 = 2;
                z = true;
                qVar = null;
                accessToken = null;
                map = null;
                request = null;
                authenticationToken = 0;
            }
            i2 = 3;
            qVar = null;
            accessToken = null;
            map = null;
            request = null;
            authenticationToken = 0;
            z = false;
        }
        if (qVar == null && accessToken == null && !z) {
            qVar = new com.facebook.q("Unexpected call to LoginManager.onActivityResult");
        }
        com.facebook.q qVar2 = qVar;
        a(null, i2, map, qVar2, true, request);
        if (accessToken != null) {
            Date date = AccessToken.l;
            com.facebook.i.f.i().c(accessToken, true);
            AccessToken p = com.facebook.appevents.g.p();
            if (p != null) {
                if (com.facebook.appevents.g.q()) {
                    k0.p(new com.facebook.b(6), p.e);
                } else {
                    com.facebook.k.f.j().a(null, true);
                }
            }
        }
        if (authenticationToken != 0) {
            com.facebook.appevents.j.x(authenticationToken);
        }
        if (cqaVar != null) {
            final rgh rghVar = (rgh) cqaVar.a;
            if (accessToken != null && request != null) {
                Set set = request.b;
                LinkedHashSet V0 = CollectionsKt.V0(CollectionsKt.W(accessToken.b));
                if (request.h) {
                    V0.retainAll(set);
                }
                LinkedHashSet V02 = CollectionsKt.V0(CollectionsKt.W(set));
                V02.removeAll(V0);
                xVar = new x(accessToken, authenticationToken, V0, V02);
            }
            if (z || (xVar != null && xVar.c.isEmpty())) {
                rghVar.a();
                return;
            }
            if (qVar2 != null) {
                rghVar.a();
                Calendar calendar = ke0.a;
                ke0.g(rghVar.a, "Facebook error: " + qVar2.getLocalizedMessage(), 0);
                return;
            }
            if (accessToken == null || xVar == null) {
                return;
            }
            SharedPreferences.Editor edit = this.a.edit();
            edit.putBoolean("express_login_allowed", true);
            edit.apply();
            final AccessToken accessToken5 = xVar.a;
            String str = d0.j;
            h0.B(accessToken5, "/me?fields=id,name,email", new com.facebook.z() { // from class: pgh
                @Override // com.facebook.z
                public final void a(g0 g0Var) {
                    g0Var.getClass();
                    JSONObject jSONObject = g0Var.b;
                    rgh rghVar2 = rgh.this;
                    if (jSONObject == null) {
                        rghVar2.a();
                        return;
                    }
                    xw3.L(wca.x(rghVar2.a.getLifecycle()), null, null, new v1f(jSONObject, accessToken5, rghVar2, (rq3) null, 20), 3);
                }
            }).d();
        }
    }
}
