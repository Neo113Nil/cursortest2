package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.zzdf;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.sentry.android.core.w0;
import j$.util.Objects;
import java.util.ArrayDeque;
import s7.c3;
import s7.d1;
import s7.e2;
import s7.f1;
import s7.f3;
import s7.l2;
import s7.n0;
import s7.n2;
import s7.o2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6158a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6159b;

    public m(e2 e2Var) {
        this.f6158a = 1;
        this.f6159b = e2Var;
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f6159b;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e7) {
            w0.n("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e7);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    l8.b bVar = (l8.b) h8.g.c().b(l8.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        l8.c cVar = (l8.c) bVar;
                        if (!m8.b.f20498b.contains("fcm") && m8.b.b("fcm", "_ln")) {
                            j1 j1Var = (j1) cVar.f19409a.f22318b;
                            j1Var.c(new com.google.android.gms.internal.measurement.w0(j1Var, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(AdRevenueConstants.SOURCE_KEY, "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        cVar.a("fcm", "_cmp", bundle2);
                    } else {
                        w0.m("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            m4.g.t(bundle, "_no");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:12:0x0049, B:15:0x0050, B:17:0x0063, B:19:0x006b, B:24:0x007b, B:28:0x0088, B:36:0x002e, B:38:0x0035, B:40:0x0041), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(zzdf zzdfVar, Bundle bundle) {
        f1 f1Var;
        f1 f1Var2;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        e2 e2Var = (e2) this.f6159b;
        try {
            try {
                f1Var2 = (f1) e2Var.f3328a;
                n0 n0Var = f1Var2.f22745f;
                f1.m(n0Var);
                n0Var.f22910n.a("onActivityCreated");
                intent = zzdfVar.f5390c;
            } catch (RuntimeException e7) {
                n0 n0Var2 = ((f1) e2Var.f3328a).f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.b(e7, "Throwable caught in onActivityCreated");
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        f1.k(f1Var2.f22748i);
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            boolean z5 = bundle != null;
                            d1 d1Var = f1Var2.f22746g;
                            f1.m(d1Var);
                            d1Var.s(new b6.j(this, z5, uri, str2, queryParameter));
                            f1Var = (f1) e2Var.f3328a;
                            o2 o2Var = f1Var.f22750l;
                            f1.l(o2Var);
                            o2Var.r(zzdfVar, bundle);
                        }
                        str = "gs";
                        String str22 = str;
                        String queryParameter2 = uri.getQueryParameter("referrer");
                        boolean z52 = bundle != null;
                        d1 d1Var2 = f1Var2.f22746g;
                        f1.m(d1Var2);
                        d1Var2.s(new b6.j(this, z52, uri, str22, queryParameter2));
                        f1Var = (f1) e2Var.f3328a;
                        o2 o2Var2 = f1Var.f22750l;
                        f1.l(o2Var2);
                        o2Var2.r(zzdfVar, bundle);
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                        if (uri != null) {
                            f1.k(f1Var2.f22748i);
                            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                                str = "auto";
                                String str222 = str;
                                String queryParameter22 = uri.getQueryParameter("referrer");
                                boolean z522 = bundle != null;
                                d1 d1Var22 = f1Var2.f22746g;
                                f1.m(d1Var22);
                                d1Var22.s(new b6.j(this, z522, uri, str222, queryParameter22));
                                f1Var = (f1) e2Var.f3328a;
                                o2 o2Var22 = f1Var.f22750l;
                                f1.l(o2Var22);
                                o2Var22.r(zzdfVar, bundle);
                            }
                            str = "gs";
                            String str2222 = str;
                            String queryParameter222 = uri.getQueryParameter("referrer");
                            boolean z5222 = bundle != null;
                            d1 d1Var222 = f1Var2.f22746g;
                            f1.m(d1Var222);
                            d1Var222.s(new b6.j(this, z5222, uri, str2222, queryParameter222));
                            f1Var = (f1) e2Var.f3328a;
                            o2 o2Var222 = f1Var.f22750l;
                            f1.l(o2Var222);
                            o2Var222.r(zzdfVar, bundle);
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
            f1Var = (f1) e2Var.f3328a;
            o2 o2Var2222 = f1Var.f22750l;
            f1.l(o2Var2222);
            o2Var2222.r(zzdfVar, bundle);
        } catch (Throwable th2) {
            o2 o2Var3 = ((f1) e2Var.f3328a).f22750l;
            f1.l(o2Var3);
            o2Var3.r(zzdfVar, bundle);
            throw th2;
        }
    }

    public void k(zzdf zzdfVar) {
        o2 o2Var = ((f1) ((e2) this.f6159b).f3328a).f22750l;
        f1.l(o2Var);
        synchronized (o2Var.f22937l) {
            try {
                if (Objects.equals(o2Var.f22933g, zzdfVar)) {
                    o2Var.f22933g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((f1) o2Var.f3328a).f22743d.x()) {
            o2Var.f22932f.remove(Integer.valueOf(zzdfVar.f5388a));
        }
    }

    public void l(zzdf zzdfVar) {
        f1 f1Var = (f1) ((e2) this.f6159b).f3328a;
        o2 o2Var = f1Var.f22750l;
        f1.l(o2Var);
        synchronized (o2Var.f22937l) {
            o2Var.f22936k = false;
            o2Var.f22934h = true;
        }
        f1 f1Var2 = (f1) o2Var.f3328a;
        f1Var2.f22749k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f1Var2.f22743d.x()) {
            l2 o3 = o2Var.o(zzdfVar);
            o2Var.f22930d = o2Var.f22929c;
            o2Var.f22929c = null;
            d1 d1Var = f1Var2.f22746g;
            f1.m(d1Var);
            d1Var.s(new s7.a(o2Var, o3, elapsedRealtime));
        } else {
            o2Var.f22929c = null;
            d1 d1Var2 = f1Var2.f22746g;
            f1.m(d1Var2);
            d1Var2.s(new s7.q(o2Var, elapsedRealtime));
        }
        f3 f3Var = f1Var.f22747h;
        f1.l(f3Var);
        f1 f1Var3 = (f1) f3Var.f3328a;
        f1Var3.f22749k.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        d1 d1Var3 = f1Var3.f22746g;
        f1.m(d1Var3);
        d1Var3.s(new c3(f3Var, elapsedRealtime2, 1));
    }

    public void m(zzdf zzdfVar) {
        f1 f1Var = (f1) ((e2) this.f6159b).f3328a;
        f3 f3Var = f1Var.f22747h;
        f1.l(f3Var);
        f1 f1Var2 = (f1) f3Var.f3328a;
        f1Var2.f22749k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d1 d1Var = f1Var2.f22746g;
        f1.m(d1Var);
        d1Var.s(new c3(f3Var, elapsedRealtime, 0));
        o2 o2Var = f1Var.f22750l;
        f1.l(o2Var);
        Object obj = o2Var.f22937l;
        synchronized (obj) {
            o2Var.f22936k = true;
            if (!Objects.equals(zzdfVar, o2Var.f22933g)) {
                synchronized (obj) {
                    o2Var.f22933g = zzdfVar;
                    o2Var.f22934h = false;
                    f1 f1Var3 = (f1) o2Var.f3328a;
                    if (f1Var3.f22743d.x()) {
                        o2Var.f22935i = null;
                        d1 d1Var2 = f1Var3.f22746g;
                        f1.m(d1Var2);
                        d1Var2.s(new n2(o2Var, 1));
                    }
                }
            }
        }
        f1 f1Var4 = (f1) o2Var.f3328a;
        if (!f1Var4.f22743d.x()) {
            o2Var.f22929c = o2Var.f22935i;
            d1 d1Var3 = f1Var4.f22746g;
            f1.m(d1Var3);
            d1Var3.s(new n2(o2Var, 0));
            return;
        }
        o2Var.s(zzdfVar.f5389b, o2Var.o(zzdfVar), false);
        s7.r rVar = ((f1) o2Var.f3328a).f22752n;
        f1.j(rVar);
        f1 f1Var5 = (f1) rVar.f3328a;
        f1Var5.f22749k.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        d1 d1Var4 = f1Var5.f22746g;
        f1.m(d1Var4);
        d1Var4.s(new s7.q(rVar, elapsedRealtime2));
    }

    public void n(zzdf zzdfVar, Bundle bundle) {
        l2 l2Var;
        o2 o2Var = ((f1) ((e2) this.f6159b).f3328a).f22750l;
        f1.l(o2Var);
        if (!((f1) o2Var.f3328a).f22743d.x() || bundle == null || (l2Var = (l2) o2Var.f22932f.get(Integer.valueOf(zzdfVar.f5388a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", l2Var.f22873c);
        bundle2.putString("name", l2Var.f22871a);
        bundle2.putString("referrer_name", l2Var.f22872b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f6158a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new androidx.appcompat.app.t(3, this, intent));
                        break;
                    }
                }
                break;
            default:
                j(zzdf.c(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f6158a) {
            case 0:
                break;
            default:
                k(zzdf.c(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f6158a) {
            case 0:
                break;
            default:
                l(zzdf.c(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f6158a) {
            case 0:
                break;
            default:
                m(zzdf.c(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f6158a) {
            case 0:
                break;
            default:
                n(zzdf.c(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i5 = this.f6158a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i5 = this.f6158a;
    }

    public m() {
        this.f6158a = 0;
        this.f6159b = new ArrayDeque(10);
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
