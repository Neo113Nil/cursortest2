package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.a5;
import com.google.android.gms.internal.play_billing.c2;
import com.google.android.gms.internal.play_billing.c5;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.e5;
import com.google.android.gms.internal.play_billing.f2;
import com.google.android.gms.internal.play_billing.n5;
import com.google.android.gms.internal.play_billing.o2;
import com.google.android.gms.internal.play_billing.o5;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.z4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d extends c {
    public boolean A;
    public final m3.f B;
    public final boolean C;
    public ExecutorService D;
    public volatile a2 E;
    public final Long F;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3981a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f3982b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3983c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3984d;

    /* renamed from: e, reason: collision with root package name */
    public volatile x0 f3985e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f3986f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.a f3987g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.d f3988h;

    /* renamed from: i, reason: collision with root package name */
    public volatile g0 f3989i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3990k;

    /* renamed from: l, reason: collision with root package name */
    public int f3991l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3992m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3993n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3994o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3995p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3996r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3997s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3998t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3999u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4000v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4001w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4002x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4003y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4004z;

    public d(m3.f fVar, Context context) {
        this.f3981a = new Object();
        this.f3982b = 0;
        this.f3984d = new Handler(Looper.getMainLooper());
        this.f3991l = 0;
        long nextLong = new Random().nextLong();
        this.F = Long.valueOf(nextLong);
        this.f3983c = n();
        this.f3986f = context.getApplicationContext();
        z4 r5 = a5.r();
        String n9 = n();
        r5.e();
        a5.q((a5) r5.f5450b, n9);
        String packageName = this.f3986f.getPackageName();
        r5.e();
        a5.p((a5) r5.f5450b, packageName);
        r5.e();
        a5.o((a5) r5.f5450b, nextLong);
        this.f3987g = new l1.a(this.f3986f, (a5) r5.b());
        p1.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3985e = new x0(this.f3986f, (x) null, this.f3987g);
        this.B = fVar;
        this.f3986f.getPackageName();
    }

    public static /* bridge */ /* synthetic */ boolean D(d dVar) {
        boolean z5;
        synchronized (dVar.f3981a) {
            z5 = true;
            if (dVar.f3982b != 1) {
                z5 = false;
            }
        }
        return z5;
    }

    public static Future k(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new g8.a(8, submit, runnable), (long) (j * 0.95d));
            return submit;
        } catch (Exception e7) {
            p1.h("BillingClient", "Async task throws exception!", e7);
            return null;
        }
    }

    public static String n() {
        try {
            return (String) y4.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final void A(int i5, int i10, k kVar) {
        s4 s4Var = null;
        q4 q4Var = null;
        if (kVar.f4037a == 0) {
            int i11 = r0.f4077a;
            try {
                r4 q = s4.q();
                q.e();
                s4.p((s4) q.f5450b, 5);
                c5 o3 = e5.o();
                o3.e();
                e5.n((e5) o3.f5450b, i10);
                e5 e5Var = (e5) o3.b();
                q.e();
                s4.n((s4) q.f5450b, e5Var);
                s4Var = (s4) q.b();
            } catch (Exception e7) {
                p1.h("BillingLogger", "Unable to create logging payload", e7);
            }
            q(s4Var);
            return;
        }
        int i12 = r0.f4077a;
        try {
            p4 r5 = q4.r();
            t4 r6 = u4.r();
            r6.f(kVar.f4037a);
            String str = kVar.f4038b;
            r6.e();
            u4.o((u4) r6.f5450b, str);
            r6.g(i5);
            r5.f(r6);
            r5.g(5);
            c5 o4 = e5.o();
            o4.e();
            e5.n((e5) o4.f5450b, i10);
            e5 e5Var2 = (e5) o4.b();
            r5.e();
            q4.p((q4) r5.f5450b, e5Var2);
            q4Var = (q4) r5.b();
        } catch (Exception e9) {
            p1.h("BillingLogger", "Unable to create logging payload", e9);
        }
        p(q4Var);
    }

    public final void B(e eVar, k kVar, int i5, Exception exc) {
        p1.h("BillingClient", "Error in acknowledge purchase!", exc);
        J(i5, 3, kVar, r0.a(exc));
        eVar.a(kVar);
    }

    public final void C(e eVar, String str, k kVar, int i5, String str2, Exception exc) {
        p1.h("BillingClient", str2, exc);
        J(i5, 4, kVar, r0.a(exc));
        eVar.c(kVar, str);
    }

    public final Handler E() {
        return Looper.myLooper() == null ? this.f3984d : new Handler(Looper.myLooper());
    }

    public final k F() {
        p1.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        r4 q = s4.q();
        q.e();
        s4.p((s4) q.f5450b, 6);
        n5 o3 = o5.o();
        o3.e();
        o5.n((o5) o3.f5450b);
        q.e();
        s4.o((s4) q.f5450b, (o5) o3.b());
        q((s4) q.b());
        return t0.f4089k;
    }

    public final void G(cc.b bVar, k kVar, int i5, Exception exc) {
        p1.h("BillingClient", "getBillingConfig got an exception.", exc);
        J(i5, 13, kVar, r0.a(exc));
        bVar.a(kVar);
    }

    public final void H(int i5, int i10, Exception exc) {
        q4 q4Var;
        p1.h("BillingClient", "showInAppMessages error.", exc);
        String a7 = r0.a(exc);
        try {
            t4 r5 = u4.r();
            r5.f(i5);
            r5.g(i10);
            if (a7 != null) {
                r5.e();
                u4.n((u4) r5.f5450b, a7);
            }
            p4 r6 = q4.r();
            r6.f(r5);
            r6.g(30);
            q4Var = (q4) r6.b();
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to create logging payload", th2);
            q4Var = null;
        }
        this.f3987g.O(q4Var);
    }

    public final void I(int i5, int i10, k kVar) {
        try {
            p(r0.b(i5, i10, kVar));
        } catch (Throwable th2) {
            p1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void J(int i5, int i10, k kVar, String str) {
        try {
            p(r0.c(i5, i10, kVar, str));
        } catch (Throwable th2) {
            p1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void K(int i5) {
        try {
            q(r0.d(i5));
        } catch (Throwable th2) {
            p1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void L(k kVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f3984d.post(new g8.a(11, this, kVar));
    }

    public final synchronized a2 M() {
        a2 f2Var;
        try {
            if (this.E == null) {
                ExecutorService o3 = o();
                if (o3 instanceof a2) {
                    f2Var = (a2) o3;
                } else {
                    f2Var = o3 instanceof ScheduledExecutorService ? new f2((ScheduledExecutorService) o3) : new c2(o3);
                }
                this.E = f2Var;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.E;
    }

    @Override // com.android.billingclient.api.c
    public void a() {
        K(12);
        synchronized (this.f3981a) {
            try {
                if (this.f3985e != null) {
                    x0 x0Var = this.f3985e;
                    w0 w0Var = (w0) x0Var.f4119e;
                    Context context = (Context) x0Var.f4116b;
                    w0Var.c(context);
                    ((w0) x0Var.f4120f).c(context);
                }
            } finally {
                p1.f("BillingClient", "Unbinding from service.");
                v();
                u();
            }
            try {
                p1.f("BillingClient", "Unbinding from service.");
                v();
            } catch (Throwable th2) {
                p1.h("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
            }
            try {
                u();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.android.billingclient.api.c
    public final boolean b() {
        boolean z5;
        synchronized (this.f3981a) {
            try {
                z5 = false;
                if (this.f3982b == 2 && this.f3988h != null && this.f3989i != null) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // com.android.billingclient.api.c
    public void c(y yVar, r rVar) {
        if (!b()) {
            k kVar = t0.f4090l;
            I(2, 7, kVar);
            rVar.onProductDetailsResponse(kVar, new ArrayList());
        } else {
            if (!this.f3999u) {
                p1.g("BillingClient", "Querying product details is not supported.");
                k kVar2 = t0.f4098u;
                I(20, 7, kVar2);
                rVar.onProductDetailsResponse(kVar2, new ArrayList());
                return;
            }
            if (k(new b0(this, yVar, rVar, 1), 30000L, new g8.a(10, this, rVar), E(), o()) == null) {
                k l6 = l();
                I(25, 7, l6);
                rVar.onProductDetailsResponse(l6, new ArrayList());
            }
        }
    }

    public void d(a aVar, e eVar) {
        if (!b()) {
            k kVar = t0.f4090l;
            I(2, 3, kVar);
            eVar.a(kVar);
            return;
        }
        if (TextUtils.isEmpty(aVar.f3966b)) {
            p1.g("BillingClient", "Please provide a valid purchase token.");
            k kVar2 = t0.f4088i;
            I(26, 3, kVar2);
            eVar.a(kVar2);
            return;
        }
        if (!this.f3994o) {
            k kVar3 = t0.f4081b;
            I(27, 3, kVar3);
            eVar.a(kVar3);
        } else if (k(new b0(this, eVar, aVar, 5), 30000L, new g8.a(12, this, eVar), E(), o()) == null) {
            k l6 = l();
            I(25, 3, l6);
            eVar.a(l6);
        }
    }

    public void e(a aVar, e eVar) {
        if (!b()) {
            k kVar = t0.f4090l;
            I(2, 4, kVar);
            eVar.c(kVar, aVar.f3966b);
        } else if (k(new b0(this, aVar, eVar, 0), 30000L, new b6.i(this, eVar, aVar, 1), E(), o()) == null) {
            k l6 = l();
            I(25, 4, l6);
            eVar.c(l6, aVar.f3966b);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final k f(String str) {
        if (!b()) {
            k kVar = t0.f4090l;
            if (kVar.f4037a != 0) {
                I(2, 5, kVar);
                return kVar;
            }
            K(5);
            return kVar;
        }
        k kVar2 = t0.f4080a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    k kVar3 = this.f3990k ? t0.f4089k : t0.f4093o;
                    A(10, 3, kVar3);
                    return kVar3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    k kVar4 = this.f3997s ? t0.f4089k : t0.f4095r;
                    A(31, 6, kVar4);
                    return kVar4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    k kVar5 = this.q ? t0.f4089k : t0.f4099v;
                    A(30, 5, kVar5);
                    return kVar5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    k kVar6 = this.f3998t ? t0.f4089k : t0.f4096s;
                    A(19, 8, kVar6);
                    return kVar6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    k kVar7 = this.f3996r ? t0.f4089k : t0.f4097t;
                    A(21, 7, kVar7);
                    return kVar7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    k kVar8 = this.f3998t ? t0.f4089k : t0.f4096s;
                    A(61, 9, kVar8);
                    return kVar8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    k kVar9 = this.f3999u ? t0.f4089k : t0.f4098u;
                    A(20, 10, kVar9);
                    return kVar9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    k kVar10 = this.f4000v ? t0.f4089k : t0.f4103z;
                    A(32, 11, kVar10);
                    return kVar10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    k kVar11 = this.f4000v ? t0.f4089k : t0.A;
                    A(33, 12, kVar11);
                    return kVar11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    k kVar12 = this.f4002x ? t0.f4089k : t0.C;
                    A(60, 13, kVar12);
                    return kVar12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    k kVar13 = this.f4003y ? t0.f4089k : t0.D;
                    A(66, 14, kVar13);
                    return kVar13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    k kVar14 = this.f4004z ? t0.f4089k : t0.f4100w;
                    A(103, 18, kVar14);
                    return kVar14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    k kVar15 = this.A ? t0.f4089k : t0.f4101x;
                    A(io.appmetrica.analytics.BuildConfig.API_LEVEL, 19, kVar15);
                    return kVar15;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    k kVar16 = this.f3993n ? t0.f4089k : t0.q;
                    A(35, 4, kVar16);
                    return kVar16;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    k kVar17 = this.j ? t0.f4089k : t0.f4092n;
                    A(9, 2, kVar17);
                    return kVar17;
                }
                break;
        }
        p1.g("BillingClient", "Unsupported feature: ".concat(str));
        k kVar18 = t0.f4102y;
        A(34, 1, kVar18);
        return kVar18;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x070d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0629 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k g(Activity activity, final i iVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        k a7;
        String str9;
        String str10;
        Future k6;
        Object obj;
        int n9;
        int i5;
        String string;
        String str11;
        boolean z5;
        SkuDetails skuDetails;
        h hVar;
        com.google.android.gms.internal.play_billing.d0 d0Var;
        String str12;
        boolean z7;
        Intent intent;
        String str13;
        int i10;
        final int i11;
        final d dVar = this;
        if (dVar.f3985e == null || ((x) dVar.f3985e.f4117c) == null) {
            k kVar = t0.E;
            dVar.I(12, 2, kVar);
            return kVar;
        }
        if (!dVar.b()) {
            k kVar2 = t0.f4090l;
            dVar.I(2, 2, kVar2);
            dVar.L(kVar2);
            return kVar2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) iVar.f4030d);
        com.google.android.gms.internal.play_billing.d0 d0Var2 = (com.google.android.gms.internal.play_billing.d0) iVar.f4029c;
        Iterator it = arrayList.iterator();
        SkuDetails skuDetails2 = (SkuDetails) (it.hasNext() ? it.next() : null);
        com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) d0Var2.iterator();
        h hVar2 = (h) (a0Var.hasNext() ? a0Var.next() : null);
        if (skuDetails2 != null) {
            str2 = skuDetails2.f();
            str = skuDetails2.g();
        } else {
            q qVar = hVar2.f4022a;
            String str14 = qVar.f4069c;
            str = qVar.f4070d;
            str2 = str14;
        }
        String str15 = "BillingClient";
        if (str.equals("subs") && !dVar.j) {
            p1.g("BillingClient", "Current client doesn't support subscriptions.");
            k kVar3 = t0.f4092n;
            dVar.I(9, 2, kVar3);
            dVar.L(kVar3);
            return kVar3;
        }
        ((y8.d) iVar.f4028b).getClass();
        if ((Collection.EL.stream((com.google.android.gms.internal.play_billing.d0) iVar.f4029c).anyMatch(new p0()) || iVar.f4027a) && !dVar.f3992m) {
            p1.g("BillingClient", "Current client doesn't support extra params for buy intent.");
            k kVar4 = t0.f4087h;
            dVar.I(18, 2, kVar4);
            dVar.L(kVar4);
            return kVar4;
        }
        if (arrayList.size() > 1 && !dVar.f3998t) {
            p1.g("BillingClient", "Current client doesn't support multi-item purchases.");
            k kVar5 = t0.f4096s;
            dVar.I(19, 2, kVar5);
            dVar.L(kVar5);
            return kVar5;
        }
        if (!d0Var2.isEmpty() && !dVar.f3999u) {
            p1.g("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            k kVar6 = t0.f4098u;
            dVar.I(20, 2, kVar6);
            dVar.L(kVar6);
            return kVar6;
        }
        if (((com.google.android.gms.internal.play_billing.d0) iVar.f4029c).isEmpty()) {
            a7 = t0.f4089k;
            str7 = "proxyPackageVersion";
            str6 = "BUY_INTENT";
            str4 = str2;
            str5 = str;
            str8 = "BillingClient";
            str3 = null;
        } else {
            h hVar3 = (h) ((com.google.android.gms.internal.play_billing.d0) iVar.f4029c).get(0);
            int i12 = 1;
            str3 = null;
            while (true) {
                str4 = str2;
                if (i12 < ((com.google.android.gms.internal.play_billing.d0) iVar.f4029c).size()) {
                    h hVar4 = (h) ((com.google.android.gms.internal.play_billing.d0) iVar.f4029c).get(i12);
                    str5 = str;
                    if (!hVar4.f4022a.f4070d.equals(hVar3.f4022a.f4070d) && !hVar4.f4022a.f4070d.equals("play_pass_subs")) {
                        a7 = t0.a(5, "All products should have same ProductType.");
                        str7 = "proxyPackageVersion";
                        str6 = "BUY_INTENT";
                        str8 = "BillingClient";
                        break;
                    }
                    i12++;
                    str2 = str4;
                    str = str5;
                } else {
                    str5 = str;
                    q qVar2 = hVar3.f4022a;
                    String optString = qVar2.f4068b.optString("packageName");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    com.google.android.gms.internal.play_billing.d0 d0Var3 = (com.google.android.gms.internal.play_billing.d0) iVar.f4029c;
                    str6 = "BUY_INTENT";
                    int size = d0Var3.size();
                    str7 = "proxyPackageVersion";
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            int i14 = i13;
                            q qVar3 = ((h) d0Var3.get(i13)).f4022a;
                            int i15 = size;
                            String str16 = qVar3.f4069c;
                            com.google.android.gms.internal.play_billing.d0 d0Var4 = d0Var3;
                            str8 = str15;
                            qVar3.f4070d.equals("subs");
                            if (hashSet.contains(str16)) {
                                a7 = t0.a(5, "ProductId can not be duplicated. Invalid product id: " + str16 + ".");
                                break;
                            }
                            hashSet.add(str16);
                            if (!qVar2.f4070d.equals("play_pass_subs") && !qVar3.f4070d.equals("play_pass_subs") && !optString.equals(qVar3.f4068b.optString("packageName"))) {
                                a7 = t0.a(5, "All products must have the same package name.");
                                break;
                            }
                            i13 = i14 + 1;
                            size = i15;
                            d0Var3 = d0Var4;
                            str15 = str8;
                        } else {
                            str8 = str15;
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str17 = (String) it2.next();
                                    if (hashSet.contains(str17)) {
                                        a7 = t0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str17 + ".");
                                        break;
                                    }
                                } else {
                                    n a10 = qVar2.a();
                                    a7 = (a10 == null || a10.f4053f == null) ? t0.f4089k : t0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (a7 != t0.f4089k) {
            dVar.I(120, 2, a7);
            dVar.L(a7);
            return a7;
        }
        if (dVar.f3992m) {
            boolean z10 = dVar.f3994o;
            dVar.B.getClass();
            dVar.B.getClass();
            boolean z11 = dVar.C;
            String str18 = dVar.f3983c;
            long longValue = dVar.F.longValue();
            final String packageName = dVar.f3986f.getPackageName();
            final Bundle bundle = new Bundle();
            p1.b(bundle, str18, longValue);
            ((y8.d) iVar.f4028b).getClass();
            if (TextUtils.isEmpty(str3)) {
                str11 = str3;
            } else {
                str11 = str3;
                bundle.putString("accountId", str11);
            }
            if (!TextUtils.isEmpty(str11)) {
                bundle.putString("obfuscatedProfileId", str11);
            }
            if (!TextUtils.isEmpty(str11)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str11)));
            }
            ((y8.d) iVar.f4028b).getClass();
            if (!TextUtils.isEmpty(str11)) {
                ((y8.d) iVar.f4028b).getClass();
                bundle.putString("oldSkuPurchaseToken", str11);
            }
            if (!TextUtils.isEmpty(str11)) {
                bundle.putString("oldSkuPurchaseId", str11);
            }
            ((y8.d) iVar.f4028b).getClass();
            if (!TextUtils.isEmpty(str11)) {
                ((y8.d) iVar.f4028b).getClass();
                bundle.putString("originalExternalTransactionId", str11);
            }
            if (!TextUtils.isEmpty(str11)) {
                bundle.putString("paymentsPurchaseParams", str11);
            }
            if (z10) {
                z5 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z5 = true;
            }
            if (z11) {
                bundle.putBoolean("enableAlternativeBilling", z5);
            }
            final int i16 = 0;
            if (Collection.EL.stream((com.google.android.gms.internal.play_billing.d0) iVar.f4029c).anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                public /* synthetic */ Predicate and(Predicate predicate) {
                    int i17 = i16;
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    switch (i16) {
                    }
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    int i17 = i16;
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    switch (i16) {
                        case 0:
                            int i17 = p1.f5547a;
                            break;
                        default:
                            int i18 = p1.f5547a;
                            break;
                    }
                    return false;
                }
            })) {
                o2 n10 = p2.n();
                final int i17 = 1;
                Iterable iterable = (Iterable) Collection.EL.stream((com.google.android.gms.internal.play_billing.d0) iVar.f4029c).filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        int i172 = i17;
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        switch (i17) {
                        }
                        return Predicate$CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        int i172 = i17;
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        switch (i17) {
                            case 0:
                                int i172 = p1.f5547a;
                                break;
                            default:
                                int i18 = p1.f5547a;
                                break;
                        }
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.t
                    public /* synthetic */ Function andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i18 = p1.f5547a;
                        String str19 = ((com.android.billingclient.api.h) obj2).f4022a.f4069c;
                        m2 n11 = n2.n();
                        q2 n12 = r2.n();
                        String str20 = "subs:" + packageName + StringUtils.PROCESS_POSTFIX_DELIMITER + str19;
                        n12.e();
                        r2.o((r2) n12.f5450b, str20);
                        n11.e();
                        n2.o((n2) n11.f5450b, (r2) n12.b());
                        r2.n();
                        throw null;
                    }

                    public /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(com.google.android.gms.internal.play_billing.q.f5549a);
                n10.e();
                p2.o((p2) n10.f5450b, iterable);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((p2) n10.b()).b());
            }
            String str19 = "additionalSkuTypes";
            if (arrayList.isEmpty()) {
                com.google.android.gms.internal.play_billing.d0 d0Var5 = d0Var2;
                skuDetails = skuDetails2;
                hVar = hVar2;
                String str20 = "additionalSkuTypes";
                ArrayList<String> arrayList2 = new ArrayList<>(d0Var5.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(d0Var5.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                int i18 = 0;
                while (i18 < d0Var5.size()) {
                    com.google.android.gms.internal.play_billing.d0 d0Var6 = d0Var5;
                    h hVar5 = (h) d0Var6.get(i18);
                    q qVar4 = hVar5.f4022a;
                    String str21 = str20;
                    if (!qVar4.f4074h.isEmpty()) {
                        arrayList4.add(qVar4.f4074h);
                    }
                    arrayList5.add(hVar5.f4023b);
                    String str22 = qVar4.f4075i;
                    ArrayList arrayList8 = qVar4.f4076k;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        Iterator it3 = qVar4.f4076k.iterator();
                        while (it3.hasNext()) {
                            n nVar = (n) it3.next();
                            String str23 = str22;
                            if (!TextUtils.isEmpty(nVar.f4052e)) {
                                str12 = nVar.f4052e;
                                break;
                            }
                            str22 = str23;
                        }
                    }
                    str12 = str22;
                    if (!TextUtils.isEmpty(str12)) {
                        arrayList6.add(str12);
                    }
                    if (i18 > 0) {
                        arrayList2.add(((h) d0Var6.get(i18)).f4022a.f4069c);
                        arrayList3.add(((h) d0Var6.get(i18)).f4022a.f4070d);
                    }
                    i18++;
                    d0Var5 = d0Var6;
                    str20 = str21;
                }
                String str24 = str20;
                d0Var = d0Var5;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList7);
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList(str24, arrayList3);
                }
            } else {
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<String> arrayList10 = new ArrayList<>();
                ArrayList<String> arrayList11 = new ArrayList<>();
                ArrayList<Integer> arrayList12 = new ArrayList<>();
                ArrayList<String> arrayList13 = new ArrayList<>();
                Iterator it4 = arrayList.iterator();
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (it4.hasNext()) {
                    h hVar6 = hVar2;
                    SkuDetails skuDetails3 = (SkuDetails) it4.next();
                    SkuDetails skuDetails4 = skuDetails2;
                    if (!skuDetails3.f3964b.optString("skuDetailsToken").isEmpty()) {
                        arrayList9.add(skuDetails3.f3964b.optString("skuDetailsToken"));
                    }
                    JSONObject jSONObject = skuDetails3.f3964b;
                    String optString2 = jSONObject.optString("offerIdToken");
                    if (optString2.isEmpty()) {
                        optString2 = jSONObject.optString("offer_id_token");
                    }
                    com.google.android.gms.internal.play_billing.d0 d0Var7 = d0Var2;
                    String optString3 = skuDetails3.f3964b.optString("offer_id");
                    String str25 = str19;
                    int optInt = skuDetails3.f3964b.optInt("offer_type");
                    String optString4 = skuDetails3.f3964b.optString("serializedDocid");
                    arrayList10.add(optString2);
                    z12 |= !TextUtils.isEmpty(optString2);
                    arrayList11.add(optString3);
                    z13 |= !TextUtils.isEmpty(optString3);
                    arrayList12.add(Integer.valueOf(optInt));
                    z14 |= optInt != 0;
                    z15 |= !TextUtils.isEmpty(optString4);
                    arrayList13.add(optString4);
                    skuDetails2 = skuDetails4;
                    hVar2 = hVar6;
                    d0Var2 = d0Var7;
                    str19 = str25;
                }
                com.google.android.gms.internal.play_billing.d0 d0Var8 = d0Var2;
                skuDetails = skuDetails2;
                hVar = hVar2;
                String str26 = str19;
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (z12) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList10);
                }
                if (z13) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList11);
                }
                if (z14) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList12);
                }
                if (z15) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList13);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList14 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList15 = new ArrayList<>(arrayList.size() - 1);
                    for (int i19 = 1; i19 < arrayList.size(); i19++) {
                        arrayList14.add(((SkuDetails) arrayList.get(i19)).f());
                        arrayList15.add(((SkuDetails) arrayList.get(i19)).g());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList14);
                    bundle.putStringArrayList(str26, arrayList15);
                }
                d0Var = d0Var8;
            }
            dVar = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !dVar.f3996r) {
                k kVar7 = t0.f4097t;
                dVar.I(21, 2, kVar7);
                dVar.L(kVar7);
                return kVar7;
            }
            if (skuDetails != null) {
                SkuDetails skuDetails5 = skuDetails;
                if (!TextUtils.isEmpty(skuDetails5.f3964b.optString("packageName"))) {
                    bundle.putString("skuPackageName", skuDetails5.f3964b.optString("packageName"));
                    z7 = true;
                    str9 = null;
                    if (!TextUtils.isEmpty(null)) {
                        bundle.putString("accountName", null);
                    }
                    intent = activity.getIntent();
                    if (intent == null) {
                        str10 = str8;
                        p1.g(str10, "Activity's intent is null.");
                    } else {
                        str10 = str8;
                        if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                str13 = str7;
                                try {
                                    bundle.putString(str13, dVar.f3986f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                } catch (PackageManager.NameNotFoundException unused) {
                                    bundle.putString(str13, "package not found");
                                    if (!dVar.f3999u) {
                                    }
                                    if (!dVar.f3997s) {
                                    }
                                    if (dVar.f3994o) {
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
                                str13 = str7;
                            }
                        }
                    }
                    if (!dVar.f3999u && !d0Var.isEmpty()) {
                        i10 = 17;
                    } else if (!dVar.f3997s && z7) {
                        i10 = 15;
                    } else if (dVar.f3994o) {
                        i10 = 6;
                    } else {
                        i11 = 9;
                        final String str27 = str4;
                        final String str28 = str5;
                        k6 = k(new Callable(i11, str27, str28, iVar, bundle) { // from class: com.android.billingclient.api.d0

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ int f4006b;

                            /* renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ String f4007c;

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ String f4008d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ Bundle f4009e;

                            {
                                this.f4009e = bundle;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Bundle i20;
                                com.google.android.gms.internal.play_billing.d dVar2;
                                d dVar3 = d.this;
                                int i21 = this.f4006b;
                                String str29 = this.f4007c;
                                String str30 = this.f4008d;
                                Bundle bundle2 = this.f4009e;
                                try {
                                    synchronized (dVar3.f3981a) {
                                        dVar2 = dVar3.f3988h;
                                    }
                                    if (dVar2 == null) {
                                        return p1.i(t0.f4090l, 119);
                                    }
                                    return ((com.google.android.gms.internal.play_billing.b) dVar2).Y(i21, dVar3.f3986f.getPackageName(), str29, str30, bundle2);
                                } catch (DeadObjectException e7) {
                                    k kVar8 = t0.f4090l;
                                    String a11 = r0.a(e7);
                                    i20 = p1.i(kVar8, 5);
                                    if (a11 != null) {
                                        i20.putString("ADDITIONAL_LOG_DETAILS", a11);
                                    }
                                    return i20;
                                } catch (Exception e9) {
                                    k kVar9 = t0.j;
                                    String a12 = r0.a(e9);
                                    i20 = p1.i(kVar9, 5);
                                    if (a12 != null) {
                                        i20.putString("ADDITIONAL_LOG_DETAILS", a12);
                                    }
                                    return i20;
                                }
                            }
                        }, 5000L, null, dVar.f3984d, dVar.o());
                    }
                    i11 = i10;
                    final String str272 = str4;
                    final String str282 = str5;
                    k6 = k(new Callable(i11, str272, str282, iVar, bundle) { // from class: com.android.billingclient.api.d0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f4006b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ String f4007c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f4008d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ Bundle f4009e;

                        {
                            this.f4009e = bundle;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Bundle i20;
                            com.google.android.gms.internal.play_billing.d dVar2;
                            d dVar3 = d.this;
                            int i21 = this.f4006b;
                            String str29 = this.f4007c;
                            String str30 = this.f4008d;
                            Bundle bundle2 = this.f4009e;
                            try {
                                synchronized (dVar3.f3981a) {
                                    dVar2 = dVar3.f3988h;
                                }
                                if (dVar2 == null) {
                                    return p1.i(t0.f4090l, 119);
                                }
                                return ((com.google.android.gms.internal.play_billing.b) dVar2).Y(i21, dVar3.f3986f.getPackageName(), str29, str30, bundle2);
                            } catch (DeadObjectException e7) {
                                k kVar8 = t0.f4090l;
                                String a11 = r0.a(e7);
                                i20 = p1.i(kVar8, 5);
                                if (a11 != null) {
                                    i20.putString("ADDITIONAL_LOG_DETAILS", a11);
                                }
                                return i20;
                            } catch (Exception e9) {
                                k kVar9 = t0.j;
                                String a12 = r0.a(e9);
                                i20 = p1.i(kVar9, 5);
                                if (a12 != null) {
                                    i20.putString("ADDITIONAL_LOG_DETAILS", a12);
                                }
                                return i20;
                            }
                        }
                    }, 5000L, null, dVar.f3984d, dVar.o());
                }
            }
            if (hVar != null) {
                h hVar7 = hVar;
                if (!TextUtils.isEmpty(hVar7.f4022a.f4068b.optString("packageName"))) {
                    bundle.putString("skuPackageName", hVar7.f4022a.f4068b.optString("packageName"));
                    z7 = true;
                    str9 = null;
                    if (!TextUtils.isEmpty(null)) {
                    }
                    intent = activity.getIntent();
                    if (intent == null) {
                    }
                    if (!dVar.f3999u) {
                    }
                    if (!dVar.f3997s) {
                    }
                    if (dVar.f3994o) {
                    }
                }
            }
            z7 = false;
            str9 = null;
            if (!TextUtils.isEmpty(null)) {
            }
            intent = activity.getIntent();
            if (intent == null) {
            }
            if (!dVar.f3999u) {
            }
            if (!dVar.f3997s) {
            }
            if (dVar.f3994o) {
            }
        } else {
            str9 = str3;
            str10 = str8;
            k6 = k(new b0(dVar, str4, str5, 4), 5000L, null, dVar.f3984d, dVar.o());
        }
        try {
            if (k6 == null) {
                k kVar8 = t0.f4083d;
                dVar.I(25, 2, kVar8);
                dVar.L(kVar8);
                return kVar8;
            }
            Bundle bundle2 = (Bundle) k6.get(5000L, TimeUnit.MILLISECONDS);
            int a11 = p1.a(bundle2, str10);
            String e7 = p1.e(bundle2, str10);
            if (a11 == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str29 = str6;
                intent2.putExtra(str29, (PendingIntent) bundle2.getParcelable(str29));
                activity.startActivity(intent2);
                return t0.f4089k;
            }
            p1.g(str10, "Unable to buy item, Error response code: " + a11);
            k a12 = t0.a(a11, e7);
            if (bundle2 != null) {
                try {
                    obj = bundle2.get("LOG_REASON");
                } catch (Throwable th2) {
                    p1.g(str10, "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
                if (obj != null) {
                    if (obj instanceof Integer) {
                        n9 = d3.n(((Integer) obj).intValue());
                        i5 = 1;
                        if (n9 == i5) {
                            n9 = 23;
                        }
                        if (bundle2 != null) {
                            try {
                                string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th3) {
                                p1.g(str10, "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                            }
                            dVar.J(n9, 2, a12, string);
                            dVar.L(a12);
                            return a12;
                        }
                        string = str9;
                        dVar.J(n9, 2, a12, string);
                        dVar.L(a12);
                        return a12;
                    }
                    p1.g(str10, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
            }
            i5 = 1;
            n9 = 1;
            if (n9 == i5) {
            }
            if (bundle2 != null) {
            }
            string = str9;
            dVar.J(n9, 2, a12, string);
            dVar.L(a12);
            return a12;
        } catch (CancellationException e9) {
            e = e9;
            p1.h(str10, "Time out while launching billing flow. Try to reconnect", e);
            k kVar9 = t0.f4091m;
            dVar.J(4, 2, kVar9, r0.a(e));
            dVar.L(kVar9);
            return kVar9;
        } catch (TimeoutException e10) {
            e = e10;
            p1.h(str10, "Time out while launching billing flow. Try to reconnect", e);
            k kVar92 = t0.f4091m;
            dVar.J(4, 2, kVar92, r0.a(e));
            dVar.L(kVar92);
            return kVar92;
        } catch (Exception e11) {
            p1.h(str10, "Exception while launching billing flow. Try to reconnect", e11);
            k kVar10 = t0.f4090l;
            dVar.J(5, 2, kVar10, r0.a(e11));
            dVar.L(kVar10);
            return kVar10;
        }
    }

    public void h(l1.a aVar, e eVar) {
        if (!b()) {
            k kVar = t0.f4090l;
            I(2, 8, kVar);
            eVar.e(kVar, null);
            return;
        }
        String str = (String) aVar.f19314b;
        ArrayList arrayList = (ArrayList) aVar.f19315c;
        if (TextUtils.isEmpty(str)) {
            p1.g("BillingClient", "Please fix the input params. SKU type can't be empty.");
            k kVar2 = t0.f4085f;
            I(49, 8, kVar2);
            eVar.e(kVar2, null);
            return;
        }
        if (k(new c0(this, str, arrayList, eVar, 1), 30000L, new g8.a(6, this, eVar), E(), o()) == null) {
            k l6 = l();
            I(25, 8, l6);
            eVar.e(l6, null);
        }
    }

    public final k i(Activity activity, m mVar, io.sentry.android.core.internal.gestures.c cVar) {
        if (!b()) {
            p1.g("BillingClient", "Service disconnected.");
            return t0.f4090l;
        }
        if (!this.q) {
            p1.g("BillingClient", "Current client doesn't support showing in-app messages.");
            return t0.f4099v;
        }
        View findViewById = activity.findViewById(R.id.content);
        IBinder windowToken = findViewById.getWindowToken();
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f3983c);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", mVar.f4046a);
        Handler handler = this.f3984d;
        k(new c0(this, bundle, activity, new zzav(handler, cVar), 0), 5000L, null, handler, o());
        return t0.f4089k;
    }

    public void j(f fVar) {
        k kVar;
        synchronized (this.f3981a) {
            try {
                if (b()) {
                    kVar = F();
                } else if (this.f3982b == 1) {
                    p1.g("BillingClient", "Client is already in the process of connecting to billing service.");
                    kVar = t0.f4084e;
                    I(37, 6, kVar);
                } else if (this.f3982b == 3) {
                    p1.g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    kVar = t0.f4090l;
                    I(38, 6, kVar);
                } else {
                    t(1);
                    v();
                    p1.f("BillingClient", "Starting in-app billing setup.");
                    this.f3989i = new g0(this, fVar);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f3986f.getPackageManager().queryIntentServices(intent, 0);
                    int i5 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i5 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                p1.g("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f3983c);
                                synchronized (this.f3981a) {
                                    try {
                                        if (this.f3982b == 2) {
                                            kVar = F();
                                        } else if (this.f3982b != 1) {
                                            p1.g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            kVar = t0.f4090l;
                                            I(117, 6, kVar);
                                        } else {
                                            g0 g0Var = this.f3989i;
                                            if (this.f3986f.bindService(intent2, g0Var, 1)) {
                                                p1.f("BillingClient", "Service was bonded successfully.");
                                                kVar = null;
                                            } else {
                                                p1.g("BillingClient", "Connection to Billing service is blocked.");
                                                i5 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            p1.g("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    t(0);
                    p1.f("BillingClient", "Billing service unavailable on device.");
                    kVar = t0.f4082c;
                    I(i5, 6, kVar);
                }
            } finally {
            }
        }
        if (kVar != null) {
            fVar.onBillingSetupFinished(kVar);
        }
    }

    public final k l() {
        int[] iArr = {0, 3};
        synchronized (this.f3981a) {
            for (int i5 = 0; i5 < 2; i5++) {
                if (this.f3982b == iArr[i5]) {
                    return t0.f4090l;
                }
            }
            return t0.j;
        }
    }

    public final void m() {
        if (TextUtils.isEmpty(null)) {
            this.f3986f.getPackageName();
        }
    }

    public final synchronized ExecutorService o() {
        try {
            if (this.D == null) {
                this.D = Executors.newFixedThreadPool(p1.f5547a, new e0());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.D;
    }

    public final void p(q4 q4Var) {
        try {
            this.f3987g.P(q4Var, this.f3991l);
        } catch (Throwable th2) {
            p1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void q(s4 s4Var) {
        try {
            l1.a aVar = this.f3987g;
            int i5 = this.f3991l;
            aVar.getClass();
            try {
                z4 z4Var = (z4) ((a5) aVar.f19314b).g();
                z4Var.e();
                a5.n((a5) z4Var.f5450b, i5);
                aVar.f19314b = (a5) z4Var.b();
                aVar.Q(s4Var);
            } catch (Throwable th2) {
                p1.h("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            p1.h("BillingClient", "Unable to log.", th3);
        }
    }

    public final void r(String str, t tVar) {
        if (!b()) {
            k kVar = t0.f4090l;
            I(2, 11, kVar);
            tVar.onPurchaseHistoryResponse(kVar, null);
        } else if (k(new b0(this, str, tVar, 3), 30000L, new g8.a(9, this, tVar), E(), o()) == null) {
            k l6 = l();
            I(25, 11, l6);
            tVar.onPurchaseHistoryResponse(l6, null);
        }
    }

    public final void s(String str, v vVar) {
        int i5 = 2;
        if (!b()) {
            k kVar = t0.f4090l;
            I(2, 9, kVar);
            com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.d0.f5420b;
            vVar.onQueryPurchasesResponse(kVar, com.google.android.gms.internal.play_billing.s0.f5567e);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            p1.g("BillingClient", "Please provide a valid product type.");
            k kVar2 = t0.f4086g;
            I(50, 9, kVar2);
            com.google.android.gms.internal.play_billing.a0 a0Var2 = com.google.android.gms.internal.play_billing.d0.f5420b;
            vVar.onQueryPurchasesResponse(kVar2, com.google.android.gms.internal.play_billing.s0.f5567e);
            return;
        }
        if (k(new b0(this, str, vVar, i5), 30000L, new g8.a(7, this, vVar), E(), o()) == null) {
            k l6 = l();
            I(25, 9, l6);
            com.google.android.gms.internal.play_billing.a0 a0Var3 = com.google.android.gms.internal.play_billing.d0.f5420b;
            vVar.onQueryPurchasesResponse(l6, com.google.android.gms.internal.play_billing.s0.f5567e);
        }
    }

    public final void t(int i5) {
        synchronized (this.f3981a) {
            try {
                if (this.f3982b == 3) {
                    return;
                }
                int i10 = this.f3982b;
                p1.f("BillingClient", "Setting clientState from " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i5 != 0 ? i5 != 1 ? i5 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f3982b = i5;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void u() {
        ExecutorService executorService = this.D;
        if (executorService != null) {
            executorService.shutdownNow();
            this.D = null;
            this.E = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        synchronized (this.f3981a) {
            if (this.f3989i != null) {
                try {
                    this.f3986f.unbindService(this.f3989i);
                } catch (Throwable th2) {
                    try {
                        p1.h("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f3988h = null;
                        this.f3989i = null;
                    } finally {
                        this.f3988h = null;
                        this.f3989i = null;
                    }
                }
            }
        }
    }

    public final androidx.transition.n0 w(k kVar, int i5, String str, Exception exc) {
        p1.h("BillingClient", str, exc);
        J(i5, 7, kVar, r0.a(exc));
        return new androidx.transition.n0(kVar.f4037a, 1, kVar.f4038b, new ArrayList());
    }

    public final x5.h x(k kVar, int i5, String str, Exception exc) {
        p1.h("BillingClient", str, exc);
        J(i5, 11, kVar, r0.a(exc));
        return new x5.h(kVar, (Object) null);
    }

    public final d7.e y(k kVar, int i5, String str, Exception exc) {
        J(i5, 9, kVar, r0.a(exc));
        p1.h("BillingClient", str, exc);
        return new d7.e(kVar, (ArrayList) null);
    }

    public final androidx.transition.n0 z(k kVar, int i5, String str, Exception exc) {
        p1.h("BillingClient", str, exc);
        J(i5, 8, kVar, r0.a(exc));
        return new androidx.transition.n0(kVar.f4037a, 2, kVar.f4038b, null);
    }

    public d(m3.f fVar, Context context, x xVar) {
        String n9 = n();
        this.f3981a = new Object();
        this.f3982b = 0;
        this.f3984d = new Handler(Looper.getMainLooper());
        this.f3991l = 0;
        long nextLong = new Random().nextLong();
        this.F = Long.valueOf(nextLong);
        this.f3983c = n9;
        this.f3986f = context.getApplicationContext();
        z4 r5 = a5.r();
        r5.e();
        a5.q((a5) r5.f5450b, n9);
        String packageName = this.f3986f.getPackageName();
        r5.e();
        a5.p((a5) r5.f5450b, packageName);
        r5.e();
        a5.o((a5) r5.f5450b, nextLong);
        this.f3987g = new l1.a(this.f3986f, (a5) r5.b());
        if (xVar == null) {
            p1.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3985e = new x0(this.f3986f, xVar, this.f3987g);
        this.B = fVar;
        this.C = false;
        this.f3986f.getPackageName();
    }
}
