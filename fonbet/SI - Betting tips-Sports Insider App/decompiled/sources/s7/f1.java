package s7;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.u5;
import com.google.android.gms.internal.measurement.zzdd;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f1 implements m1 {
    public static volatile f1 E;
    public int A;
    public int B;
    public final long D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22740a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22741b;

    /* renamed from: c, reason: collision with root package name */
    public final md.o f22742c;

    /* renamed from: d, reason: collision with root package name */
    public final e f22743d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f22744e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f22745f;

    /* renamed from: g, reason: collision with root package name */
    public final d1 f22746g;

    /* renamed from: h, reason: collision with root package name */
    public final f3 f22747h;

    /* renamed from: i, reason: collision with root package name */
    public final v3 f22748i;
    public final i0 j;

    /* renamed from: k, reason: collision with root package name */
    public final q6.a f22749k;

    /* renamed from: l, reason: collision with root package name */
    public final o2 f22750l;

    /* renamed from: m, reason: collision with root package name */
    public final e2 f22751m;

    /* renamed from: n, reason: collision with root package name */
    public final r f22752n;

    /* renamed from: o, reason: collision with root package name */
    public final h2 f22753o;

    /* renamed from: p, reason: collision with root package name */
    public final String f22754p;
    public h0 q;

    /* renamed from: r, reason: collision with root package name */
    public y2 f22755r;

    /* renamed from: s, reason: collision with root package name */
    public m f22756s;

    /* renamed from: t, reason: collision with root package name */
    public f0 f22757t;

    /* renamed from: u, reason: collision with root package name */
    public i2 f22758u;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f22760w;

    /* renamed from: x, reason: collision with root package name */
    public long f22761x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Boolean f22762y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f22763z;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22759v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f1(s1 s1Var) {
        e8.d dVar;
        Context context = s1Var.f23050a;
        md.o oVar = new md.o(5);
        this.f22742c = oVar;
        r1.f22984k = oVar;
        this.f22740a = context;
        this.f22741b = s1Var.f23054e;
        this.f22762y = s1Var.f23051b;
        this.f22754p = s1Var.f23056g;
        this.f22763z = true;
        if (l4.f5118h == null && context != null) {
            Object obj = l4.f5117g;
            synchronized (obj) {
                try {
                    if (l4.f5118h == null) {
                        synchronized (obj) {
                            b4 b4Var = l4.f5118h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context;
                            }
                            if (b4Var != null) {
                                if (b4Var.f4930a != applicationContext) {
                                }
                            }
                            if (b4Var != null) {
                                d4.c();
                                n4.a();
                                g4.g();
                            }
                            u5 u5Var = new u5(applicationContext);
                            if (u5Var instanceof Serializable) {
                                dVar = new e8.e(u5Var);
                            } else {
                                e8.f fVar = new e8.f();
                                fVar.f8777a = u5Var;
                                dVar = fVar;
                            }
                            l4.f5118h = new b4(applicationContext, dVar);
                            l4.f5119i.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
        this.f22749k = q6.a.f22039a;
        Long l6 = s1Var.f23055f;
        this.D = l6 != null ? l6.longValue() : System.currentTimeMillis();
        e eVar = new e(this);
        eVar.f22691d = m7.b.f20429d;
        this.f22743d = eVar;
        v0 v0Var = new v0(this);
        v0Var.m();
        this.f22744e = v0Var;
        n0 n0Var = new n0(this);
        n0Var.m();
        this.f22745f = n0Var;
        v3 v3Var = new v3(this);
        v3Var.m();
        this.f22748i = v3Var;
        this.j = new i0(new x0(s1Var, this));
        this.f22752n = new r(this);
        o2 o2Var = new o2(this);
        o2Var.l();
        this.f22750l = o2Var;
        e2 e2Var = new e2(this);
        e2Var.l();
        this.f22751m = e2Var;
        f3 f3Var = new f3(this);
        f3Var.l();
        this.f22747h = f3Var;
        h2 h2Var = new h2(this);
        h2Var.m();
        this.f22753o = h2Var;
        d1 d1Var = new d1(this);
        d1Var.m();
        this.f22746g = d1Var;
        zzdd zzddVar = s1Var.f23053d;
        boolean z5 = zzddVar == null || zzddVar.f5384b == 0;
        if (context.getApplicationContext() instanceof Application) {
            l(e2Var);
            if (((f1) e2Var.f3328a).f22740a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((f1) e2Var.f3328a).f22740a.getApplicationContext();
                if (e2Var.f22696c == null) {
                    e2Var.f22696c = new com.google.firebase.messaging.m(e2Var);
                }
                if (z5) {
                    application.unregisterActivityLifecycleCallbacks(e2Var.f22696c);
                    application.registerActivityLifecycleCallbacks(e2Var.f22696c);
                    n0 n0Var2 = ((f1) e2Var.f3328a).f22745f;
                    m(n0Var2);
                    n0Var2.f22910n.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(n0Var);
            n0Var.f22906i.a("Application context is not an Application");
        }
        d1Var.s(new w0(1, this, s1Var));
    }

    public static final void j(v vVar) {
        if (vVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(c0.x xVar) {
        if (xVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void l(z zVar) {
        if (zVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zVar.f23263b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zVar.getClass())));
        }
    }

    public static final void m(l1 l1Var) {
        if (l1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!l1Var.f22870b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(l1Var.getClass())));
        }
    }

    public static f1 s(Context context, zzdd zzddVar, Long l6) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.f5386d;
            zzddVar = new zzdd(zzddVar.f5383a, zzddVar.f5384b, zzddVar.f5385c, bundle2, null);
        }
        g6.v.h(context);
        g6.v.h(context.getApplicationContext());
        if (E == null) {
            synchronized (f1.class) {
                try {
                    if (E == null) {
                        E = new f1(new s1(context, zzddVar, l6));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.f5386d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            g6.v.h(E);
            E.f22762y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        g6.v.h(E);
        return E;
    }

    @Override // s7.m1
    public final n0 a() {
        n0 n0Var = this.f22745f;
        m(n0Var);
        return n0Var;
    }

    @Override // s7.m1
    public final d1 b() {
        d1 d1Var = this.f22746g;
        m(d1Var);
        return d1Var;
    }

    @Override // s7.m1
    public final md.o c() {
        return this.f22742c;
    }

    public final boolean d() {
        return g() == 0;
    }

    @Override // s7.m1
    public final Context e() {
        return this.f22740a;
    }

    @Override // s7.m1
    public final q6.a f() {
        return this.f22749k;
    }

    public final int g() {
        d1 d1Var = this.f22746g;
        m(d1Var);
        d1Var.j();
        e eVar = this.f22743d;
        if (eVar.w()) {
            return 1;
        }
        m(d1Var);
        d1Var.j();
        if (!this.f22763z) {
            return 8;
        }
        v0 v0Var = this.f22744e;
        k(v0Var);
        v0Var.j();
        Boolean valueOf = v0Var.n().contains("measurement_enabled") ? Boolean.valueOf(v0Var.n().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        md.o oVar = ((f1) eVar.f3328a).f22742c;
        Boolean v5 = eVar.v("firebase_analytics_collection_enabled");
        return v5 != null ? v5.booleanValue() ? 0 : 4 : (this.f22762y == null || this.f22762y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f22761x) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        if (!this.f22759v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        d1 d1Var = this.f22746g;
        m(d1Var);
        d1Var.j();
        Boolean bool = this.f22760w;
        q6.a aVar = this.f22749k;
        if (bool != null && this.f22761x != 0) {
            if (!bool.booleanValue()) {
                aVar.getClass();
            }
            return this.f22760w.booleanValue();
        }
        aVar.getClass();
        this.f22761x = SystemClock.elapsedRealtime();
        v3 v3Var = this.f22748i;
        k(v3Var);
        boolean z5 = false;
        if (v3Var.I("android.permission.INTERNET") && v3Var.I("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.f22740a;
            if (s6.c.a(context).c() || this.f22743d.m() || (v3.b0(context) && v3.C(context))) {
                z5 = true;
            }
        }
        this.f22760w = Boolean.valueOf(z5);
        if (z5) {
            this.f22760w = Boolean.valueOf(v3Var.n(r().q()));
        }
        return this.f22760w.booleanValue();
    }

    public final void i(int i5, Throwable th2, byte[] bArr) {
        n0 n0Var;
        n0 n0Var2;
        int i10 = i5;
        n0 n0Var3 = this.f22745f;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            m(n0Var3);
            n0Var3.f22906i.c(Integer.valueOf(i10), th2, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (th2 == null) {
            v0 v0Var = this.f22744e;
            k(v0Var);
            v0Var.f23139t.b(true);
            if (bArr == null || bArr.length == 0) {
                m(n0Var3);
                n0Var3.f22909m.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    m(n0Var3);
                    n0Var3.f22909m.a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                v3 v3Var = this.f22748i;
                k(v3Var);
                f1 f1Var = (f1) v3Var.f3328a;
                if (TextUtils.isEmpty(optString)) {
                    n0Var2 = n0Var3;
                } else {
                    Context context = f1Var.f22740a;
                    n0Var2 = n0Var3;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle.putString("gad_source", optString4);
                            }
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            this.f22751m.q("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = f1Var.f22740a;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e7) {
                                n0 n0Var4 = ((f1) v3Var.f3328a).f22745f;
                                m(n0Var4);
                                n0Var4.f22903f.b(e7, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e9) {
                        e = e9;
                        n0Var = n0Var2;
                        m(n0Var);
                        n0Var.f22903f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                m(n0Var2);
                n0Var = n0Var2;
                try {
                    n0Var.f22906i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e10) {
                    e = e10;
                    m(n0Var);
                    n0Var.f22903f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e11) {
                e = e11;
                n0Var = n0Var3;
            }
        }
        m(n0Var3);
        n0Var3.f22906i.c(Integer.valueOf(i10), th2, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final i0 n() {
        return this.j;
    }

    public final h0 o() {
        l(this.q);
        return this.q;
    }

    public final y2 p() {
        l(this.f22755r);
        return this.f22755r;
    }

    public final m q() {
        m(this.f22756s);
        return this.f22756s;
    }

    public final f0 r() {
        l(this.f22757t);
        return this.f22757t;
    }
}
