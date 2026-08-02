package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzqp;
import com.twilio.voice.EventKeys;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC5338c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3298l3 implements Q3 {

    /* renamed from: E, reason: collision with root package name */
    public static volatile C3298l3 f34119E;

    /* renamed from: A, reason: collision with root package name */
    public int f34120A;

    /* renamed from: B, reason: collision with root package name */
    public int f34121B;

    /* renamed from: D, reason: collision with root package name */
    public final long f34123D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f34124a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34125b;

    /* renamed from: c, reason: collision with root package name */
    public final C3246f f34126c;

    /* renamed from: d, reason: collision with root package name */
    public final C3286k f34127d;

    /* renamed from: e, reason: collision with root package name */
    public final L2 f34128e;

    /* renamed from: f, reason: collision with root package name */
    public final C3392x2 f34129f;

    /* renamed from: g, reason: collision with root package name */
    public final C3234d3 f34130g;

    /* renamed from: h, reason: collision with root package name */
    public final C3348r6 f34131h;

    /* renamed from: i, reason: collision with root package name */
    public final b7 f34132i;

    /* renamed from: j, reason: collision with root package name */
    public final C3337q2 f34133j;

    /* renamed from: k, reason: collision with root package name */
    public final K9.e f34134k;

    /* renamed from: l, reason: collision with root package name */
    public final C3332p5 f34135l;

    /* renamed from: m, reason: collision with root package name */
    public final W4 f34136m;

    /* renamed from: n, reason: collision with root package name */
    public final C3406z0 f34137n;

    /* renamed from: o, reason: collision with root package name */
    public final C3220b5 f34138o;

    /* renamed from: p, reason: collision with root package name */
    public final String f34139p;

    /* renamed from: q, reason: collision with root package name */
    public C3321o2 f34140q;

    /* renamed from: r, reason: collision with root package name */
    public Z5 f34141r;

    /* renamed from: s, reason: collision with root package name */
    public C3405z f34142s;

    /* renamed from: t, reason: collision with root package name */
    public C3297l2 f34143t;

    /* renamed from: u, reason: collision with root package name */
    public C3236d5 f34144u;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f34146w;

    /* renamed from: x, reason: collision with root package name */
    public long f34147x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Boolean f34148y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f34149z;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34145v = false;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f34122C = new AtomicInteger(0);

    public C3298l3(C3227c4 c3227c4) {
        AbstractC3191o.m(c3227c4);
        Context context = c3227c4.f33962a;
        C3246f c3246f = new C3246f(context);
        this.f34126c = c3246f;
        T1.f33663a = c3246f;
        this.f34124a = context;
        this.f34125b = c3227c4.f33966e;
        this.f34148y = c3227c4.f33963b;
        this.f34139p = c3227c4.f33968g;
        this.f34149z = true;
        zzkm.zzb(context);
        K9.e c10 = K9.h.c();
        this.f34134k = c10;
        Long l10 = c3227c4.f33967f;
        this.f34123D = l10 != null ? l10.longValue() : c10.a();
        this.f34127d = new C3286k(this);
        L2 l22 = new L2(this);
        l22.m();
        this.f34128e = l22;
        C3392x2 c3392x2 = new C3392x2(this);
        c3392x2.m();
        this.f34129f = c3392x2;
        b7 b7Var = new b7(this);
        b7Var.m();
        this.f34132i = b7Var;
        this.f34133j = new C3337q2(new C3219b4(c3227c4, this));
        this.f34137n = new C3406z0(this);
        C3332p5 c3332p5 = new C3332p5(this);
        c3332p5.k();
        this.f34135l = c3332p5;
        W4 w42 = new W4(this);
        w42.k();
        this.f34136m = w42;
        C3348r6 c3348r6 = new C3348r6(this);
        c3348r6.k();
        this.f34131h = c3348r6;
        C3220b5 c3220b5 = new C3220b5(this);
        c3220b5.m();
        this.f34138o = c3220b5;
        C3234d3 c3234d3 = new C3234d3(this);
        c3234d3.m();
        this.f34130g = c3234d3;
        zzdd zzddVar = c3227c4.f33965d;
        boolean z10 = zzddVar == null || zzddVar.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(w42);
            if (w42.f33578a.f34124a.getApplicationContext() instanceof Application) {
                Application application = (Application) w42.f33578a.f34124a.getApplicationContext();
                if (w42.f33720c == null) {
                    w42.f33720c = new I4(w42);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(w42.f33720c);
                    application.registerActivityLifecycleCallbacks(w42.f33720c);
                    C3392x2 c3392x22 = w42.f33578a.f34129f;
                    u(c3392x22);
                    c3392x22.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(c3392x2);
            c3392x2.r().a("Application context is not an Application");
        }
        c3234d3.t(new RunnableC3250f3(this, c3227c4));
    }

    public static C3298l3 O(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.zzd;
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
        }
        AbstractC3191o.m(context);
        AbstractC3191o.m(context.getApplicationContext());
        if (f34119E == null) {
            synchronized (C3298l3.class) {
                try {
                    if (f34119E == null) {
                        f34119E = new C3298l3(new C3227c4(context, zzddVar, l10));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC3191o.m(f34119E);
            f34119E.f34148y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC3191o.m(f34119E);
        return f34119E;
    }

    public static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void r(B1 b12) {
        if (b12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void s(O3 o32) {
        if (o32 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void t(AbstractC3225c2 abstractC3225c2) {
        if (abstractC3225c2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC3225c2.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC3225c2.getClass())));
        }
    }

    public static final void u(P3 p32) {
        if (p32 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!p32.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(p32.getClass())));
        }
    }

    public final C3234d3 A() {
        return this.f34130g;
    }

    public final W4 B() {
        W4 w42 = this.f34136m;
        t(w42);
        return w42;
    }

    public final b7 C() {
        b7 b7Var = this.f34132i;
        s(b7Var);
        return b7Var;
    }

    public final C3337q2 D() {
        return this.f34133j;
    }

    public final C3321o2 E() {
        t(this.f34140q);
        return this.f34140q;
    }

    public final C3220b5 F() {
        C3220b5 c3220b5 = this.f34138o;
        u(c3220b5);
        return c3220b5;
    }

    public final boolean G() {
        return this.f34125b;
    }

    public final String H() {
        return this.f34139p;
    }

    public final C3332p5 I() {
        C3332p5 c3332p5 = this.f34135l;
        t(c3332p5);
        return c3332p5;
    }

    public final Z5 J() {
        t(this.f34141r);
        return this.f34141r;
    }

    public final C3405z K() {
        u(this.f34142s);
        return this.f34142s;
    }

    public final C3297l2 L() {
        t(this.f34143t);
        return this.f34143t;
    }

    public final C3406z0 M() {
        C3406z0 c3406z0 = this.f34137n;
        r(c3406z0);
        return c3406z0;
    }

    public final C3236d5 N() {
        r(this.f34144u);
        return this.f34144u;
    }

    public final void P(boolean z10) {
        this.f34148y = Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final C3392x2 a() {
        C3392x2 c3392x2 = this.f34129f;
        u(c3392x2);
        return c3392x2;
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final C3234d3 b() {
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        return c3234d3;
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final C3246f c() {
        return this.f34126c;
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final Context d() {
        return this.f34124a;
    }

    @Override // com.google.android.gms.measurement.internal.Q3
    public final K9.e e() {
        return this.f34134k;
    }

    public final boolean f() {
        return this.f34148y != null && this.f34148y.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        c3234d3.h();
        C3286k c3286k = this.f34127d;
        if (c3286k.L()) {
            return 1;
        }
        u(c3234d3);
        c3234d3.h();
        if (!this.f34149z) {
            return 8;
        }
        L2 l22 = this.f34128e;
        s(l22);
        Boolean t10 = l22.t();
        if (t10 != null) {
            return t10.booleanValue() ? 0 : 3;
        }
        C3246f c3246f = c3286k.f33578a.f34126c;
        Boolean J10 = c3286k.J("firebase_analytics_collection_enabled");
        return J10 != null ? J10.booleanValue() ? 0 : 4 : (this.f34148y == null || this.f34148y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z10) {
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        c3234d3.h();
        this.f34149z = z10;
    }

    public final boolean j() {
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        c3234d3.h();
        return this.f34149z;
    }

    public final void k() {
        this.f34120A++;
    }

    public final void l() {
        this.f34122C.incrementAndGet();
    }

    public final boolean m() {
        if (!this.f34145v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        c3234d3.h();
        Boolean bool = this.f34146w;
        if (bool == null || this.f34147x == 0 || (!bool.booleanValue() && Math.abs(this.f34134k.b() - this.f34147x) > 1000)) {
            this.f34147x = this.f34134k.b();
            b7 b7Var = this.f34132i;
            s(b7Var);
            boolean z10 = false;
            if (b7Var.M("android.permission.INTERNET")) {
                s(b7Var);
                if (b7Var.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f34124a;
                    if (M9.e.a(context).f() || this.f34127d.m() || (b7.j0(context) && b7.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z10);
            this.f34146w = valueOf;
            if (valueOf.booleanValue()) {
                s(b7Var);
                this.f34146w = Boolean.valueOf(b7Var.o(L().r()));
            }
        }
        return this.f34146w.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r3.W() >= 234200) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        NetworkInfo activeNetworkInfo;
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        c3234d3.h();
        C3220b5 c3220b5 = this.f34138o;
        u(c3220b5);
        u(c3220b5);
        String q10 = L().q();
        if (!this.f34127d.M()) {
            C3392x2 c3392x2 = this.f34129f;
            u(c3392x2);
            c3392x2.w().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        L2 l22 = this.f34128e;
        s(l22);
        Pair o10 = l22.o(q10);
        if (((Boolean) o10.second).booleanValue() || TextUtils.isEmpty((CharSequence) o10.first)) {
            C3392x2 c3392x22 = this.f34129f;
            u(c3392x22);
            c3392x22.w().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        u(c3220b5);
        c3220b5.l();
        ConnectivityManager connectivityManager = (ConnectivityManager) c3220b5.f33578a.f34124a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
            if (activeNetworkInfo != null || !activeNetworkInfo.isConnected()) {
                C3392x2 c3392x23 = this.f34129f;
                u(c3392x23);
                c3392x23.r().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            Z5 J10 = J();
            J10.h();
            J10.j();
            if (J10.y()) {
                b7 b7Var = J10.f33578a.f34132i;
                s(b7Var);
            }
            W4 w42 = this.f34136m;
            t(w42);
            C3298l3 c3298l3 = w42.f33578a;
            w42.h();
            zzao l02 = c3298l3.J().l0();
            Bundle bundle = l02 != null ? l02.f34433a : null;
            if (bundle == null) {
                int i10 = this.f34121B;
                this.f34121B = i10 + 1;
                boolean z10 = i10 < 10;
                C3392x2 c3392x24 = this.f34129f;
                u(c3392x24);
                String str = i10 < 10 ? "Retrying." : "Skipping.";
                C3376v2 v10 = c3392x24.v();
                StringBuilder sb3 = new StringBuilder(str.length() + 60);
                sb3.append("Failed to retrieve DMA consent from the service, ");
                sb3.append(str);
                sb3.append(" retryCount");
                v10.b(sb3.toString(), Integer.valueOf(this.f34121B));
                return z10;
            }
            V3 e10 = V3.e(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(e10.k());
            C3389x h10 = C3389x.h(bundle, 100);
            sb2.append("&dma=");
            sb2.append(!Objects.equals(h10.j(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(h10.k())) {
                sb2.append("&dma_cps=");
                sb2.append(h10.k());
            }
            int i11 = !Objects.equals(C3389x.i(bundle), Boolean.TRUE) ? 1 : 0;
            sb2.append("&npa=");
            sb2.append(i11);
            C3392x2 c3392x25 = this.f34129f;
            u(c3392x25);
            c3392x25.w().b("Consent query parameters to Bow", sb2);
            b7 b7Var2 = this.f34132i;
            s(b7Var2);
            L().f33578a.f34127d.A();
            String str2 = (String) o10.first;
            s(this.f34128e);
            URL i02 = b7Var2.i0(133005L, q10, str2, r1.f33532v.a() - 1, sb2.toString());
            if (i02 != null) {
                C3220b5 c3220b52 = this.f34138o;
                u(c3220b52);
                Y4 y42 = new Y4() { // from class: com.google.android.gms.measurement.internal.g3
                    @Override // com.google.android.gms.measurement.internal.Y4
                    public final /* synthetic */ void a(String str3, int i12, Throwable th2, byte[] bArr, Map map) {
                        C3298l3.this.o(str3, i12, th2, bArr, map);
                    }
                };
                c3220b52.l();
                AbstractC3191o.m(i02);
                AbstractC3191o.m(y42);
                C3234d3 c3234d32 = c3220b52.f33578a.f34130g;
                u(c3234d32);
                c3234d32.w(new RunnableC3212a5(c3220b52, q10, i02, null, null, y42));
            }
            return false;
        }
        activeNetworkInfo = null;
        if (activeNetworkInfo != null) {
        }
        C3392x2 c3392x232 = this.f34129f;
        u(c3392x232);
        c3392x232.r().a("Network is not available for Deferred Deep Link request. Skipping");
        return false;
    }

    public final /* synthetic */ void o(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (i10 == 200 || i10 == 204) {
            i11 = i10;
        } else {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
                C3392x2 c3392x2 = this.f34129f;
                u(c3392x2);
                c3392x2.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
            }
        }
        if (th2 == null) {
            L2 l22 = this.f34128e;
            s(l22);
            l22.f33531u.b(true);
            if (bArr == null || bArr.length == 0) {
                C3392x2 c3392x22 = this.f34129f;
                u(c3392x22);
                c3392x22.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    C3392x2 c3392x23 = this.f34129f;
                    u(c3392x23);
                    c3392x23.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble(EventKeys.TIMESTAMP, 0.0d);
                Bundle bundle2 = new Bundle();
                b7 b7Var = this.f34132i;
                s(b7Var);
                C3298l3 c3298l3 = b7Var.f33578a;
                if (!TextUtils.isEmpty(optString)) {
                    Context context = c3298l3.f34124a;
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle2.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle2.putString("gad_source", optString4);
                        }
                        bundle2.putString("gclid", optString2);
                        bundle2.putString("_cis", "ddp");
                        this.f34136m.t("auto", "_cmp", bundle2);
                        s(b7Var);
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong(EventKeys.TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = b7Var.f33578a.f34124a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                }
                                makeBasic = BroadcastOptions.makeBasic();
                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                bundle = shareIdentityEnabled.toBundle();
                                context2.sendBroadcast(intent, null, bundle);
                                return;
                            }
                            return;
                        } catch (RuntimeException e10) {
                            C3392x2 c3392x24 = b7Var.f33578a.f34129f;
                            u(c3392x24);
                            c3392x24.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                C3392x2 c3392x25 = this.f34129f;
                u(c3392x25);
                c3392x25.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (JSONException e11) {
                C3392x2 c3392x26 = this.f34129f;
                u(c3392x26);
                c3392x26.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        C3392x2 c3392x27 = this.f34129f;
        u(c3392x27);
        c3392x27.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public final /* synthetic */ void p(C3227c4 c3227c4) {
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        c3234d3.h();
        C3286k c3286k = this.f34127d;
        c3286k.u();
        C3405z c3405z = new C3405z(this);
        c3405z.m();
        this.f34142s = c3405z;
        zzdd zzddVar = c3227c4.f33965d;
        C3297l2 c3297l2 = new C3297l2(this, c3227c4.f33964c, zzddVar == null ? 0L : zzddVar.zza);
        c3297l2.k();
        this.f34143t = c3297l2;
        C3321o2 c3321o2 = new C3321o2(this);
        c3321o2.k();
        this.f34140q = c3321o2;
        Z5 z52 = new Z5(this);
        z52.k();
        this.f34141r = z52;
        b7 b7Var = this.f34132i;
        b7Var.n();
        this.f34128e.n();
        this.f34143t.l();
        C3236d5 c3236d5 = new C3236d5(this);
        c3236d5.k();
        this.f34144u = c3236d5;
        c3236d5.l();
        C3392x2 c3392x2 = this.f34129f;
        u(c3392x2);
        C3376v2 u10 = c3392x2.u();
        c3286k.A();
        u10.b("App measurement initialized, version", 133005L);
        u(c3392x2);
        c3392x2.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q10 = c3297l2.q();
        s(b7Var);
        if (b7Var.P(q10, c3286k.R())) {
            u(c3392x2);
            c3392x2.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(c3392x2);
            c3392x2.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(q10)));
        }
        u(c3392x2);
        c3392x2.v().a("Debug-level message logging enabled");
        int i10 = this.f34120A;
        AtomicInteger atomicInteger = this.f34122C;
        if (i10 != atomicInteger.get()) {
            u(c3392x2);
            c3392x2.o().c("Not all components initialized", Integer.valueOf(this.f34120A), Integer.valueOf(atomicInteger.get()));
        }
        this.f34145v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r1.G() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(zzdd zzddVar) {
        V3 a10;
        W4 w42;
        S3 O10;
        S3 O11;
        Bundle bundle;
        C3389x h10;
        Boolean J10;
        I2 i22;
        C3234d3 c3234d3 = this.f34130g;
        u(c3234d3);
        c3234d3.h();
        zzin q10 = N().q();
        zzin zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
        zzqp.zza();
        Z1 z12 = AbstractC3209a2.f33835R0;
        C3286k c3286k = this.f34127d;
        boolean H10 = c3286k.H(null, z12);
        boolean z10 = q10 == zzinVar;
        if (H10) {
            b7 b7Var = this.f34132i;
            s(b7Var);
        }
        if (z10) {
            z10 = true;
            b7 b7Var2 = this.f34132i;
            s(b7Var2);
            b7Var2.h();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            h7 h7Var = new h7(b7Var2.f33578a);
            C3298l3 c3298l3 = b7Var2.f33578a;
            AbstractC5338c.registerReceiver(c3298l3.f34124a, h7Var, intentFilter, 2);
            C3392x2 c3392x2 = c3298l3.f34129f;
            u(c3392x2);
            c3392x2.v().a("Registered app receiver");
            if (z10) {
                N().o(((Long) AbstractC3209a2.f33804C.b(null)).longValue());
            }
        }
        L2 l22 = this.f34128e;
        s(l22);
        V3 w10 = l22.w();
        int b10 = w10.b();
        S3 O12 = c3286k.O("google_analytics_default_allow_ad_storage", false);
        S3 O13 = c3286k.O("google_analytics_default_allow_analytics_storage", false);
        S3 s32 = S3.UNINITIALIZED;
        if (O12 != s32 || O13 != s32) {
            s(l22);
            if (l22.v(-10)) {
                a10 = V3.a(O12, O13, -10);
                if (a10 != null) {
                    W4 w43 = this.f34136m;
                    t(w43);
                    w43.q0(a10, true);
                    w10 = a10;
                }
                w42 = this.f34136m;
                t(w42);
                w42.o(w10);
                s(l22);
                int b11 = l22.u().b();
                O10 = c3286k.O("google_analytics_default_allow_ad_personalization_signals", true);
                if (O10 != s32) {
                    C3392x2 c3392x22 = this.f34129f;
                    u(c3392x22);
                    c3392x22.w().b("Default ad personalization consent from Manifest", O10);
                }
                O11 = c3286k.O("google_analytics_default_allow_ad_user_data", true);
                if (O11 == s32 && V3.u(-10, b11)) {
                    t(w42);
                    w42.p0(C3389x.a(O11, -10), true);
                } else if (TextUtils.isEmpty(L().r()) && (b11 == 0 || b11 == 30)) {
                    t(w42);
                    w42.p0(new C3389x((Boolean) null, -10, (Boolean) null, (String) null), true);
                } else if (TextUtils.isEmpty(L().r()) && zzddVar != null && (bundle = zzddVar.zzd) != null && V3.u(30, b11)) {
                    h10 = C3389x.h(bundle, 30);
                    if (h10.d()) {
                        t(w42);
                        w42.p0(h10, true);
                    }
                }
                J10 = c3286k.J("google_analytics_tcf_data_enabled");
                if (J10 != null || J10.booleanValue()) {
                    C3392x2 c3392x23 = this.f34129f;
                    u(c3392x23);
                    c3392x23.v().a("TCF client enabled.");
                    t(w42);
                    w42.s();
                    t(w42);
                    w42.r();
                }
                s(l22);
                i22 = l22.f33516f;
                if (i22.a() == 0) {
                    C3392x2 c3392x24 = this.f34129f;
                    u(c3392x24);
                    long j10 = this.f34123D;
                    c3392x24.w().b("Persisting first open", Long.valueOf(j10));
                    s(l22);
                    i22.b(j10);
                }
                t(w42);
                w42.f33735r.c();
                if (!m()) {
                    if (!TextUtils.isEmpty(L().r())) {
                        b7 b7Var3 = this.f34132i;
                        s(b7Var3);
                        String r10 = L().r();
                        s(l22);
                        l22.h();
                        if (b7Var3.p(r10, l22.p().getString("gmp_app_id", null))) {
                            C3392x2 c3392x25 = this.f34129f;
                            u(c3392x25);
                            c3392x25.u().a("Rechecking which service to use due to a GMP App Id change");
                            s(l22);
                            l22.h();
                            Boolean t10 = l22.t();
                            SharedPreferences.Editor edit = l22.p().edit();
                            edit.clear();
                            edit.apply();
                            if (t10 != null) {
                                l22.s(t10);
                            }
                            E().o();
                            this.f34141r.A();
                            this.f34141r.w();
                            s(l22);
                            i22.b(this.f34123D);
                            s(l22);
                            l22.f33518h.b(null);
                        }
                        s(l22);
                        String r11 = L().r();
                        l22.h();
                        SharedPreferences.Editor edit2 = l22.p().edit();
                        edit2.putString("gmp_app_id", r11);
                        edit2.apply();
                    }
                    s(l22);
                    if (!l22.w().o(U3.ANALYTICS_STORAGE)) {
                        s(l22);
                        l22.f33518h.b(null);
                    }
                    t(w42);
                    s(l22);
                    w42.E(l22.f33518h.a());
                    b7 b7Var4 = this.f34132i;
                    s(b7Var4);
                    try {
                        b7Var4.f33578a.f34124a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    } catch (ClassNotFoundException unused) {
                        L2 l23 = this.f34128e;
                        s(l23);
                        K2 k22 = l23.f33533w;
                        if (!TextUtils.isEmpty(k22.a())) {
                            C3392x2 c3392x26 = this.f34129f;
                            u(c3392x26);
                            c3392x26.r().a("Remote config removed with active feature rollouts");
                            s(l23);
                            k22.b(null);
                        }
                    }
                    if (!TextUtils.isEmpty(L().r())) {
                        boolean g10 = g();
                        L2 l24 = this.f34128e;
                        s(l24);
                        if (!l24.z() && !this.f34127d.L()) {
                            s(l24);
                            l24.y(!g10);
                        }
                        if (g10) {
                            W4 w44 = this.f34136m;
                            t(w44);
                            w44.H();
                        }
                        C3348r6 c3348r6 = this.f34131h;
                        t(c3348r6);
                        c3348r6.f34269e.a();
                        J().q(new AtomicReference());
                        Z5 J11 = J();
                        s(l24);
                        J11.v(l24.f33536z.a());
                    }
                } else if (g()) {
                    b7 b7Var5 = this.f34132i;
                    s(b7Var5);
                    if (!b7Var5.M("android.permission.INTERNET")) {
                        C3392x2 c3392x27 = this.f34129f;
                        u(c3392x27);
                        c3392x27.o().a("App is missing INTERNET permission");
                    }
                    s(b7Var5);
                    if (!b7Var5.M("android.permission.ACCESS_NETWORK_STATE")) {
                        C3392x2 c3392x28 = this.f34129f;
                        u(c3392x28);
                        c3392x28.o().a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    Context context = this.f34124a;
                    if (!M9.e.a(context).f() && !this.f34127d.m()) {
                        if (!b7.j0(context)) {
                            C3392x2 c3392x29 = this.f34129f;
                            u(c3392x29);
                            c3392x29.o().a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!b7.E(context, false)) {
                            C3392x2 c3392x210 = this.f34129f;
                            u(c3392x210);
                            c3392x210.o().a("AppMeasurementService not registered/enabled");
                        }
                    }
                    C3392x2 c3392x211 = this.f34129f;
                    u(c3392x211);
                    c3392x211.o().a("Uploading is not possible. App measurement disabled");
                }
                zzqp.zza();
                if (this.f34127d.H(null, AbstractC3209a2.f33835R0)) {
                    b7 b7Var6 = this.f34132i;
                    s(b7Var6);
                    if (b7Var6.G()) {
                        long max = Math.max(500L, ((((Integer) AbstractC3209a2.f33913y0.b(null)).intValue() * 1000) + new Random().nextInt(5000)) - this.f34134k.b());
                        if (max > 500) {
                            C3392x2 c3392x212 = this.f34129f;
                            u(c3392x212);
                            c3392x212.w().b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(max));
                        }
                        W4 w45 = this.f34136m;
                        t(w45);
                        w45.s0(max);
                    }
                }
                L2 l25 = this.f34128e;
                s(l25);
                l25.f33526p.b(true);
            }
        }
        if (!TextUtils.isEmpty(L().r()) && (b10 == 0 || b10 == 30 || b10 == 10 || b10 == 40)) {
            W4 w46 = this.f34136m;
            t(w46);
            w46.q0(new V3(null, null, -10), false);
        }
        a10 = null;
        if (a10 != null) {
        }
        w42 = this.f34136m;
        t(w42);
        w42.o(w10);
        s(l22);
        int b112 = l22.u().b();
        O10 = c3286k.O("google_analytics_default_allow_ad_personalization_signals", true);
        if (O10 != s32) {
        }
        O11 = c3286k.O("google_analytics_default_allow_ad_user_data", true);
        if (O11 == s32) {
        }
        if (TextUtils.isEmpty(L().r())) {
        }
        if (TextUtils.isEmpty(L().r())) {
            h10 = C3389x.h(bundle, 30);
            if (h10.d()) {
            }
        }
        J10 = c3286k.J("google_analytics_tcf_data_enabled");
        if (J10 != null) {
        }
        C3392x2 c3392x232 = this.f34129f;
        u(c3392x232);
        c3392x232.v().a("TCF client enabled.");
        t(w42);
        w42.s();
        t(w42);
        w42.r();
        s(l22);
        i22 = l22.f33516f;
        if (i22.a() == 0) {
        }
        t(w42);
        w42.f33735r.c();
        if (!m()) {
        }
        zzqp.zza();
        if (this.f34127d.H(null, AbstractC3209a2.f33835R0)) {
        }
        L2 l252 = this.f34128e;
        s(l252);
        l252.f33526p.b(true);
    }

    public final C3286k w() {
        return this.f34127d;
    }

    public final L2 x() {
        L2 l22 = this.f34128e;
        s(l22);
        return l22;
    }

    public final C3392x2 y() {
        C3392x2 c3392x2 = this.f34129f;
        if (c3392x2 == null || !c3392x2.k()) {
            return null;
        }
        return c3392x2;
    }

    public final C3348r6 z() {
        C3348r6 c3348r6 = this.f34131h;
        t(c3348r6);
        return c3348r6;
    }
}
