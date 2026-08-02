package com.facebook.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import defpackage.a70;
import defpackage.aqd;
import defpackage.bzd;
import defpackage.cw3;
import defpackage.gjc;
import defpackage.md;
import defpackage.q19;
import defpackage.qv0;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ r(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        switch (this.a) {
            case 0:
                String str = this.c;
                Context context = this.b;
                String str2 = this.d;
                str.getClass();
                s sVar = s.a;
                JSONObject a = s.a();
                if (a.length() != 0) {
                    s.e(str, a);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, a.toString()).apply();
                    s.e = Long.valueOf(System.currentTimeMillis());
                }
                s.f();
                s.b.set(false);
                break;
            default:
                Context context2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                x xVar = x.a;
                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                u uVar = null;
                String string = sharedPreferences.getString(str3, null);
                if (!k0.A(string)) {
                    if (string == null) {
                        a70.r("Required value was null.");
                        break;
                    } else {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            com.facebook.w wVar = com.facebook.w.a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            uVar = x.e(str4, jSONObject);
                        }
                    }
                }
                JSONObject a2 = x.a();
                x.e(str4, a2);
                sharedPreferences.edit().putString(str3, a2.toString()).apply();
                if (uVar != null) {
                    String str5 = uVar.i;
                    if (!x.f && str5 != null && str5.length() > 0) {
                        x.f = true;
                    }
                }
                s sVar2 = s.a;
                JSONObject a3 = s.a();
                com.facebook.w.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str4}, 1)), a3.toString()).apply();
                s.e(str4, a3);
                com.facebook.appevents.k kVar = qv0.a;
                Context a4 = com.facebook.w.a();
                String b = com.facebook.w.b();
                if (com.facebook.k0.c() && (a4 instanceof Application)) {
                    Application application = (Application) a4;
                    if (!com.facebook.w.q.get()) {
                        com.facebook.t.a("The Facebook sdk must be initialized before calling activateApp");
                        break;
                    } else {
                        if (!com.facebook.appevents.c.c) {
                            if (com.facebook.appevents.l.b() == null) {
                                com.facebook.appevents.j.s();
                            }
                            ScheduledThreadPoolExecutor b2 = com.facebook.appevents.l.b();
                            if (b2 == null) {
                                a70.r("Required value was null.");
                                break;
                            } else {
                                b2.execute(new com.appsflyer.internal.w(2));
                            }
                        }
                        com.facebook.appevents.u uVar2 = com.facebook.appevents.u.a;
                        if (!cw3.a.contains(com.facebook.appevents.u.class)) {
                            try {
                                if (!com.facebook.appevents.u.c.get()) {
                                    com.facebook.appevents.u.a.b();
                                }
                            } catch (Throwable th) {
                                cw3.a(com.facebook.appevents.u.class, th);
                            }
                        }
                        Set set = cw3.a;
                        if (!set.contains(com.facebook.w.class)) {
                            try {
                                Context applicationContext = application.getApplicationContext();
                                if (applicationContext != null) {
                                    if (!s.b("app_events_killswitch", com.facebook.w.b(), false)) {
                                        com.facebook.w.c().execute(new com.facebook.v(0, applicationContext, b));
                                    }
                                    if (q.b(o.OnDeviceEventProcessing) && aqd.a() && !set.contains(aqd.class)) {
                                        try {
                                            com.facebook.w.c().execute(new gjc(10, com.facebook.w.a(), b));
                                        } catch (Throwable th2) {
                                            cw3.a(aqd.class, th2);
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                cw3.a(com.facebook.w.class, th3);
                            }
                        }
                        md.c(application, b);
                        if (q.b(o.GPSPACAProcessing)) {
                            bzd bzdVar = bzd.a;
                            if (!cw3.a.contains(bzdVar)) {
                                try {
                                    if (!bzd.c) {
                                        bzd.a();
                                    }
                                    if (bzd.b) {
                                        bzdVar.b(b, "fb_mobile_app_install");
                                    }
                                } catch (Throwable th4) {
                                    cw3.a(bzdVar, th4);
                                }
                            }
                        }
                        if (q.b(o.GPSARATriggers)) {
                            q19.a.d(b, new com.facebook.appevents.e("unknown", "MOBILE_INSTALL_EVENT", null, null, false, md.j == 0, md.b(), null));
                        }
                    }
                }
                x.d.set(x.c.containsKey(str4) ? w.c : w.d);
                xVar.j();
                break;
        }
    }

    public /* synthetic */ r(String str, Context context, String str2) {
        this.c = str;
        this.b = context;
        this.d = str2;
    }
}
