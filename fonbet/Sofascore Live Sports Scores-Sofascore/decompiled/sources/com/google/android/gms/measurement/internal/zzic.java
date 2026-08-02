package com.google.android.gms.measurement.internal;

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
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzjx;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzld;
import com.google.android.gms.internal.measurement.zzlw;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzma;
import defpackage.a70;
import defpackage.b0a;
import defpackage.b1l;
import defpackage.ewo;
import defpackage.f0o;
import defpackage.fso;
import defpackage.gt7;
import defpackage.iso;
import defpackage.lmo;
import defpackage.mvo;
import defpackage.n2f;
import defpackage.nkn;
import defpackage.t01;
import defpackage.vha;
import defpackage.y6o;
import defpackage.yao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzic implements iso {
    public static volatile zzic F;
    public int A;
    public int B;
    public final long D;
    public final long E;
    public final Context a;
    public final boolean b;
    public final zzae c;
    public final zzal d;
    public final lmo e;
    public final zzgu f;
    public final zzhz g;
    public final zzoc h;
    public final zzpp i;
    public final zzgn j;
    public final DefaultClock k;
    public final zzmb l;
    public final zzlj m;
    public final zzd n;
    public final zzlo o;
    public final String p;
    public zzgl q;
    public zznl r;
    public zzbb s;
    public zzgi t;
    public zzlq u;
    public Boolean w;
    public long x;
    public volatile Boolean y;
    public volatile boolean z;
    public boolean v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public zzic(zzjs zzjsVar) {
        Context context;
        long currentTimeMillis;
        long elapsedRealtime;
        Context context2 = zzjsVar.a;
        zzae zzaeVar = new zzae();
        this.c = zzaeVar;
        vha.d = zzaeVar;
        this.a = context2;
        this.b = zzjsVar.e;
        this.y = zzjsVar.b;
        this.p = zzjsVar.h;
        this.z = true;
        if (zzlw.b == null) {
            Object obj = zzlw.a;
            synchronized (obj) {
                try {
                    if (zzlw.b == null) {
                        synchronized (obj) {
                            mvo mvoVar = zzlw.b;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (mvoVar != null) {
                                if (mvoVar.a != applicationContext) {
                                }
                            }
                            if (mvoVar != null) {
                                Iterator it = zzld.a.values().iterator();
                                if (it.hasNext()) {
                                    throw null;
                                }
                                zzma.a();
                            }
                            zzlw.b = new mvo(applicationContext, b0a.M(new ewo(applicationContext, 2)));
                            zzlw.c.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.k = DefaultClock.a;
        Api api = zzjx.a;
        zzkk zzkkVar = new zzkk(context2, zzjx.a, Api.ApiOptions.E7, GoogleApi.Settings.c);
        String concat = "com.google.android.gms.measurement#".concat(String.valueOf(context2.getPackageName()));
        TaskApiCall.Builder a = TaskApiCall.a();
        int i = 29;
        a.a = new f0o(i, concat, new String[0]);
        zzkkVar.h(0, a.a());
        AtomicReference atomicReference = com.google.android.gms.internal.measurement.zzlk.k;
        if (atomicReference.get() == null) {
            try {
                context = context2.getApplicationContext();
            } catch (NullPointerException unused) {
                com.google.android.gms.internal.measurement.zzlk.b();
                zzlz.a(Level.WARNING, (Executor) com.google.android.gms.internal.measurement.zzlk.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                context = null;
            }
            if (context != null) {
                while (!atomicReference.compareAndSet(null, context) && atomicReference.get() == null) {
                }
            }
        }
        Long l = zzjsVar.f;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            this.k.getClass();
            currentTimeMillis = System.currentTimeMillis();
        }
        this.D = currentTimeMillis;
        Long l2 = zzjsVar.g;
        if (l2 != null) {
            elapsedRealtime = l2.longValue();
        } else {
            this.k.getClass();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.E = elapsedRealtime;
        zzal zzalVar = new zzal(this);
        zzalVar.e = n2f.b;
        this.d = zzalVar;
        lmo lmoVar = new lmo(this);
        lmoVar.T();
        this.e = lmoVar;
        zzgu zzguVar = new zzgu(this);
        zzguVar.T();
        this.f = zzguVar;
        zzpp zzppVar = new zzpp(this);
        zzppVar.T();
        this.i = zzppVar;
        this.j = new zzgn(new b1l(i, zzjsVar, this));
        this.n = new zzd(this);
        zzmb zzmbVar = new zzmb(this);
        zzmbVar.S();
        this.l = zzmbVar;
        zzlj zzljVar = new zzlj(this);
        zzljVar.S();
        this.m = zzljVar;
        zzoc zzocVar = new zzoc(this);
        zzocVar.S();
        this.h = zzocVar;
        zzlo zzloVar = new zzlo(this);
        ((zzic) zzloVar.b).A++;
        zzloVar.T();
        this.o = zzloVar;
        zzhz zzhzVar = new zzhz(this);
        zzhzVar.T();
        this.g = zzhzVar;
        zzdb zzdbVar = zzjsVar.d;
        boolean z = zzdbVar == null || zzdbVar.b == 0;
        if (this.a.getApplicationContext() instanceof Application) {
            l(zzljVar);
            if (((zzic) zzljVar.b).a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((zzic) zzljVar.b).a.getApplicationContext();
                gt7 gt7Var = zzljVar.d;
                if (gt7Var == null) {
                    gt7Var = new gt7(zzljVar, 3);
                    zzljVar.d = gt7Var;
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(gt7Var);
                    application.registerActivityLifecycleCallbacks(zzljVar.d);
                    zzgu zzguVar2 = ((zzic) zzljVar.b).f;
                    m(zzguVar2);
                    zzguVar2.o.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(zzguVar);
            zzguVar.j.a("Application context is not an Application");
        }
        zzhzVar.Z(new nkn(28, this, zzjsVar));
    }

    public static final void j(y6o y6oVar) {
        if (y6oVar != null) {
            return;
        }
        a70.r("Component not created");
    }

    public static final void k(t01 t01Var) {
        if (t01Var != null) {
            return;
        }
        a70.r("Component not created");
    }

    public static final void l(yao yaoVar) {
        if (yaoVar == null) {
            a70.r("Component not created");
        } else {
            if (yaoVar.c) {
                return;
            }
            a70.r("Component not initialized: ".concat(String.valueOf(yaoVar.getClass())));
        }
    }

    public static final void m(fso fsoVar) {
        if (fsoVar == null) {
            a70.r("Component not created");
        } else {
            if (fsoVar.c) {
                return;
            }
            a70.r("Component not initialized: ".concat(String.valueOf(fsoVar.getClass())));
        }
    }

    public static zzic r(Context context, zzdb zzdbVar, Long l, Long l2) {
        Bundle bundle;
        if (zzdbVar != null) {
            Bundle bundle2 = zzdbVar.d;
            zzdbVar = new zzdb(zzdbVar.a, zzdbVar.b, zzdbVar.c, bundle2, null);
        }
        Preconditions.i(context);
        Preconditions.i(context.getApplicationContext());
        if (F == null) {
            synchronized (zzic.class) {
                try {
                    if (F == null) {
                        F = new zzic(new zzjs(context, zzdbVar, l, l2));
                    }
                } finally {
                }
            }
        } else if (zzdbVar != null && (bundle = zzdbVar.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.i(F);
            F.y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.i(F);
        return F;
    }

    @Override // defpackage.iso
    public final zzae a() {
        return this.c;
    }

    @Override // defpackage.iso
    public final zzgu b() {
        zzgu zzguVar = this.f;
        m(zzguVar);
        return zzguVar;
    }

    public final boolean c() {
        return g() == 0;
    }

    @Override // defpackage.iso
    public final zzhz d() {
        zzhz zzhzVar = this.g;
        m(zzhzVar);
        return zzhzVar;
    }

    @Override // defpackage.iso
    public final Context e() {
        return this.a;
    }

    @Override // defpackage.iso
    public final Clock f() {
        return this.k;
    }

    public final int g() {
        zzhz zzhzVar = this.g;
        m(zzhzVar);
        zzhzVar.Q();
        zzal zzalVar = this.d;
        if (zzalVar.e0()) {
            return 1;
        }
        m(zzhzVar);
        zzhzVar.Q();
        if (!this.z) {
            return 8;
        }
        lmo lmoVar = this.e;
        k(lmoVar);
        lmoVar.Q();
        Boolean valueOf = lmoVar.U().contains("measurement_enabled") ? Boolean.valueOf(lmoVar.U().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        zzae zzaeVar = ((zzic) zzalVar.b).c;
        Boolean d0 = zzalVar.d0("firebase_analytics_collection_enabled");
        return d0 != null ? d0.booleanValue() ? 0 : 4 : (this.y == null || this.y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.x) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        boolean z = false;
        if (!this.v) {
            a70.r("AppMeasurement is not initialized");
            return false;
        }
        zzhz zzhzVar = this.g;
        m(zzhzVar);
        zzhzVar.Q();
        Boolean bool = this.w;
        DefaultClock defaultClock = this.k;
        if (bool != null && this.x != 0) {
            if (!bool.booleanValue()) {
                defaultClock.getClass();
            }
            return this.w.booleanValue();
        }
        defaultClock.getClass();
        this.x = SystemClock.elapsedRealtime();
        zzpp zzppVar = this.i;
        k(zzppVar);
        if (zzppVar.t0("android.permission.INTERNET") && zzppVar.t0("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.a;
            if (Wrappers.a(context).c() || this.d.T() || (zzpp.L0(context) && zzpp.l0(context))) {
                z = true;
            }
        }
        this.w = Boolean.valueOf(z);
        if (z) {
            this.w = Boolean.valueOf(zzppVar.W(q().X()));
        }
        return this.w.booleanValue();
    }

    public final void i(int i, Throwable th, byte[] bArr) {
        zzgu zzguVar;
        zzgu zzguVar2;
        int i2 = i;
        zzgu zzguVar3 = this.f;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            m(zzguVar3);
            zzguVar3.j.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (th == null) {
            lmo lmoVar = this.e;
            k(lmoVar);
            lmoVar.u.b(true);
            if (bArr == null || bArr.length == 0) {
                m(zzguVar3);
                zzguVar3.n.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    m(zzguVar3);
                    zzguVar3.n.a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                zzpp zzppVar = this.i;
                k(zzppVar);
                zzic zzicVar = (zzic) zzppVar.b;
                if (TextUtils.isEmpty(optString)) {
                    zzguVar2 = zzguVar3;
                } else {
                    Context context = zzicVar.a;
                    zzguVar2 = zzguVar3;
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
                            this.m.X("auto", bundle, "_cmp");
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = zzicVar.a;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e) {
                                zzgu zzguVar4 = ((zzic) zzppVar.b).f;
                                m(zzguVar4);
                                zzguVar4.g.b(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        zzguVar = zzguVar2;
                        m(zzguVar);
                        zzguVar.g.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                m(zzguVar2);
                zzguVar = zzguVar2;
                try {
                    zzguVar.j.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    m(zzguVar);
                    zzguVar.g.b(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                zzguVar = zzguVar3;
            }
        }
        m(zzguVar3);
        zzguVar3.j.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final zzgl n() {
        l(this.q);
        return this.q;
    }

    public final zznl o() {
        l(this.r);
        return this.r;
    }

    public final zzbb p() {
        m(this.s);
        return this.s;
    }

    public final zzgi q() {
        l(this.t);
        return this.t;
    }
}
