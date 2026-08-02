package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzkw;
import com.google.android.gms.internal.play_billing.zzle;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzll;
import com.google.android.gms.internal.play_billing.zzln;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.bf3;
import defpackage.c0l;
import defpackage.c6o;
import defpackage.fjg;
import defpackage.ljg;
import defpackage.y5o;
import defpackage.yfa;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c implements ServiceConnection {
    public final BillingClientStateListener a;
    public final com.google.android.gms.internal.play_billing.zzbn b;
    public final com.google.android.gms.internal.play_billing.zzbn c;
    public final int d;
    public final /* synthetic */ a e;

    public c(a aVar, BillingClientStateListener billingClientStateListener, int i) {
        this.e = aVar;
        com.google.android.gms.internal.play_billing.zzbq zzbqVar = aVar.N;
        this.b = new com.google.android.gms.internal.play_billing.zzbn(zzbqVar);
        this.c = new com.google.android.gms.internal.play_billing.zzbn(zzbqVar);
        this.a = billingClientStateListener;
        this.d = i;
    }

    public final Long a(boolean z) {
        Object obj = this.e.a;
        try {
            if (z) {
                synchronized (obj) {
                    try {
                        com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.b;
                        if (!zzbnVar.b) {
                            return null;
                        }
                        long a = zzbnVar.a.a();
                        if (!zzbnVar.b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        zzbnVar.b = false;
                        long j = (a - zzbnVar.d) + zzbnVar.c;
                        zzbnVar.c = j;
                        return Long.valueOf(j / 1000000);
                    } finally {
                    }
                }
            }
            synchronized (obj) {
                try {
                    com.google.android.gms.internal.play_billing.zzbn zzbnVar2 = this.c;
                    if (!zzbnVar2.b) {
                        return null;
                    }
                    long a2 = zzbnVar2.a.a();
                    if (!zzbnVar2.b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    zzbnVar2.b = false;
                    long j2 = (a2 - zzbnVar2.d) + zzbnVar2.c;
                    zzbnVar2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                } finally {
                }
            }
        } catch (Throwable unused) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            return null;
        }
        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        return null;
    }

    public final void d(BillingResult billingResult, zzjs zzjsVar, String str, boolean z, int i) {
        try {
            zzjq q = zzju.q();
            q.h(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            q.e();
            zzju.s((zzju) q.b, debugMessage);
            q.g(zzjsVar);
            q.e();
            zzju.t((zzju) q.b, i);
            if (str != null) {
                q.e();
                zzju.r((zzju) q.b, str);
            }
            Long a = a(z);
            a aVar = this.e;
            if (!z) {
                zzle p = zzlg.p();
                p.e();
                zzlg.q((zzlg) p.b, (zzju) q.c());
                if (a != null) {
                    long longValue = a.longValue();
                    p.e();
                    zzlg.r((zzlg) p.b, longValue);
                }
                aVar.h.B((zzlg) p.c());
                return;
            }
            zzll p2 = zzln.p();
            int i2 = this.d;
            p2.g(i2 > 0);
            p2.h(i2);
            p2.e();
            zzln.t((zzln) p2.b, i);
            if (a != null) {
                long longValue2 = a.longValue();
                p2.e();
                zzln.s((zzln) p2.b, longValue2);
            }
            zzjj s = zzjl.s();
            s.g(q);
            s.i(6);
            s.h(p2);
            aVar.H((zzjl) s.c());
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void f(int i, boolean z) {
        try {
            Long a = a(z);
            a aVar = this.e;
            if (!z) {
                zzle p = zzlg.p();
                zzjq q = zzju.q();
                q.h(0);
                q.e();
                zzju.t((zzju) q.b, i);
                p.e();
                zzlg.q((zzlg) p.b, (zzju) q.c());
                if (a != null) {
                    long longValue = a.longValue();
                    p.e();
                    zzlg.r((zzlg) p.b, longValue);
                }
                aVar.h.B((zzlg) p.c());
                return;
            }
            zzjn q2 = zzjp.q();
            q2.e();
            zzjp.p((zzjp) q2.b, 6);
            zzll p2 = zzln.p();
            int i2 = this.d;
            p2.g(i2 > 0);
            p2.h(i2);
            p2.e();
            zzln.t((zzln) p2.b, i);
            if (a != null) {
                long longValue2 = a.longValue();
                p2.e();
                zzln.s((zzln) p2.b, longValue2);
            }
            q2.e();
            zzjp.v((zzjp) q2.b, (zzln) p2.c());
            aVar.I((zzjp) q2.c());
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void g(BillingResult billingResult) {
        a aVar = this.e;
        synchronized (aVar.a) {
            try {
                if (aVar.b == 3) {
                    return;
                }
                try {
                    this.a.onBillingSetupFinished(billingResult);
                } catch (Throwable unused) {
                    int i = com.google.android.gms.internal.play_billing.zzc.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Exception exc, boolean z, int i) {
        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        boolean z2 = exc instanceof DeadObjectException;
        zzjs zzjsVar = z2 ? zzjs.INITIALIZE_DEAD_OBJECT_EXCEPTION : exc instanceof RemoteException ? zzjs.INITIALIZE_REMOTE_EXCEPTION : exc instanceof SecurityException ? zzjs.INITIALIZE_SECURITY_EXCEPTION : zzjs.INITIALIZE_SERVICE_CALL_EXCEPTION;
        String zza = zzdc.zza(exc);
        this.e.K(0);
        d(z2 ? m.j : m.h, zzjsVar, zza, z, i);
        g(z2 ? m.j : m.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z, Exception exc) {
        zzjs zzjsVar;
        zzjs zzjsVar2;
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        boolean z2 = exc instanceof DeadObjectException;
        zzjs zzjsVar3 = zzjs.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
        if (z2) {
            zzjsVar2 = zzjs.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            zzjsVar2 = zzjs.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
        } else {
            if (!(exc instanceof SecurityException)) {
                zzjsVar = zzjsVar3;
                String zza = !zzjsVar.equals(zzjsVar3) ? zzdc.zza(exc) : null;
                this.e.K(0);
                d(!z2 ? m.j : m.h, zzjsVar, zza, z, 0);
                g(!z2 ? m.j : m.h);
            }
            zzjsVar2 = zzjs.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION;
        }
        zzjsVar = zzjsVar2;
        String zza2 = !zzjsVar.equals(zzjsVar3) ? zzdc.zza(exc) : null;
        this.e.K(0);
        d(!z2 ? m.j : m.h, zzjsVar, zza2, z, 0);
        g(!z2 ? m.j : m.h);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        boolean z2;
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        try {
            a aVar = this.e;
            synchronized (aVar.a) {
                z = true;
                z2 = aVar.b == 1;
            }
            c0l c0lVar = aVar.h;
            if (z2) {
                zzjj s = zzjl.s();
                s.i(6);
                zzjq q = zzju.q();
                q.g(zzjs.BINDING_DIED);
                s.g(q);
                zzll p = zzln.p();
                int i2 = this.d;
                if (i2 <= 0) {
                    z = false;
                }
                p.g(z);
                p.h(i2);
                s.h(p);
                c0lVar.o((zzjl) s.c());
            } else {
                zzjx p2 = zzjx.p();
                c0lVar.getClass();
                try {
                    zzku r = zzkw.r();
                    r.g((zzkg) c0lVar.b);
                    r.e();
                    zzkw.u((zzkw) r.b, p2);
                    ((fjg) c0lVar.c).v((zzkw) r.c());
                } catch (Throwable unused) {
                    int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                }
            }
        } catch (Throwable unused2) {
            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        a aVar2 = this.e;
        synchronized (aVar2.a) {
            if (aVar2.b != 3 && aVar2.b != 0) {
                aVar2.K(0);
                aVar2.M();
                try {
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable unused3) {
                    int i5 = com.google.android.gms.internal.play_billing.zzc.a;
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzar zzapVar;
        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Billing service connected.");
        a aVar = this.e;
        synchronized (aVar.a) {
            try {
                if (aVar.b == 3) {
                    return;
                }
                int i = com.google.android.gms.internal.play_billing.zzaq.a;
                if (iBinder == null) {
                    zzapVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    zzapVar = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.zzar ? (com.google.android.gms.internal.play_billing.zzar) queryLocalInterface : new com.google.android.gms.internal.play_billing.zzap(iBinder, "com.android.vending.billing.IInAppBillingService");
                }
                aVar.i = zzapVar;
                if (a.b(new Callable() { // from class: com.android.billingclient.api.zzbx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        com.google.android.gms.internal.play_billing.zzar zzarVar;
                        String j;
                        String j2;
                        String j3;
                        long longValue;
                        long longValue2;
                        double doubleValue;
                        long longValue3;
                        c cVar = c.this;
                        a aVar2 = cVar.e;
                        synchronized (aVar2.a) {
                            try {
                                if (aVar2.b == 3) {
                                    return null;
                                }
                                int i2 = 0;
                                boolean z = aVar2.b == 1;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = bf3.f("accountName", null);
                                    com.google.android.gms.internal.play_billing.zzc.b(bundle, aVar2.d, aVar2.M.longValue());
                                }
                                zzjs zzjsVar = zzjs.REASON_UNSPECIFIED;
                                synchronized (aVar2.a) {
                                    zzarVar = aVar2.i;
                                }
                                a aVar3 = cVar.e;
                                if (zzarVar == null) {
                                    aVar3.K(0);
                                    int i3 = cVar.d;
                                    zzjs zzjsVar2 = zzjs.SERVICE_RESET_TO_NULL;
                                    BillingResult billingResult = m.j;
                                    aVar3.J(i3, billingResult, zzjsVar2);
                                    cVar.g(billingResult);
                                    return null;
                                }
                                String packageName = aVar3.g.getPackageName();
                                try {
                                    if (zzarVar.R0(25, packageName, BillingClient.ProductType.INAPP) == 0) {
                                        a aVar4 = cVar.e;
                                        final Context context = aVar4.g;
                                        synchronized (c6o.class) {
                                            longValue = ((Long) c6o.g0(new y5o(context) { // from class: com.android.billingclient.api.zzeq
                                                @Override // defpackage.y5o
                                                public final Object zza() {
                                                    return 3L;
                                                }
                                            }, 3L)).longValue();
                                        }
                                        final Context context2 = aVar4.g;
                                        synchronized (c6o.class) {
                                            longValue2 = ((Long) c6o.g0(new y5o(context2) { // from class: com.android.billingclient.api.zzeo
                                                @Override // defpackage.y5o
                                                public final Object zza() {
                                                    return 100L;
                                                }
                                            }, 100L)).longValue();
                                        }
                                        final Context context3 = aVar4.g;
                                        synchronized (c6o.class) {
                                            doubleValue = ((Double) c6o.g0(new y5o(context3) { // from class: com.android.billingclient.api.zzer
                                                @Override // defpackage.y5o
                                                public final Object zza() {
                                                    return Double.valueOf(2.0d);
                                                }
                                            }, Double.valueOf(2.0d))).doubleValue();
                                        }
                                        final Context context4 = aVar4.g;
                                        synchronized (c6o.class) {
                                            longValue3 = ((Long) c6o.g0(new y5o(context4) { // from class: com.android.billingclient.api.zzep
                                                @Override // defpackage.y5o
                                                public final Object zza() {
                                                    return Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                                                }
                                            }, Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS))).longValue();
                                        }
                                        Exception e = null;
                                        while (true) {
                                            long j4 = i2;
                                            if (j4 > longValue) {
                                                break;
                                            }
                                            try {
                                                try {
                                                    Boolean valueOf = Boolean.valueOf(z);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("callingPackage", aVar4.g.getPackageName());
                                                    com.google.android.gms.internal.play_billing.zzc.b(bundle2, aVar4.d, aVar4.M.longValue());
                                                    if (aVar4.G != null) {
                                                        bundle2.putBoolean("enablePendingPurchases", true);
                                                    }
                                                    PendingPurchasesParams pendingPurchasesParams = aVar4.G;
                                                    if (pendingPurchasesParams != null && pendingPurchasesParams.a) {
                                                        try {
                                                            bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            if (j4 == longValue) {
                                                                cVar.h(e, z, i2);
                                                                return null;
                                                            }
                                                            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
                                                            try {
                                                                Thread.sleep(longValue2);
                                                                i2++;
                                                                longValue2 = (long) Math.min(longValue2 * doubleValue, longValue3);
                                                            } catch (InterruptedException e3) {
                                                                Thread.currentThread().interrupt();
                                                                cVar.h(e3, z, i2);
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                    zzarVar.J3(aVar4.g.getPackageName(), bundle2, new h(aVar4, cVar, valueOf, i2));
                                                    return null;
                                                } catch (SecurityException e4) {
                                                    cVar.h(e4, z, i2);
                                                    return null;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                            }
                                            i2++;
                                            longValue2 = (long) Math.min(longValue2 * doubleValue, longValue3);
                                        }
                                        cVar.h(e, z, i2);
                                        return null;
                                    }
                                    int i5 = 29;
                                    int i6 = 3;
                                    int i7 = 29;
                                    while (true) {
                                        if (i7 < 3) {
                                            i7 = 0;
                                            break;
                                        }
                                        try {
                                            j2 = ljg.j(i7, "trying subs apiVersion: ");
                                            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", j2);
                                            i6 = bundle == null ? zzarVar.R0(i7, packageName, BillingClient.ProductType.SUBS) : zzarVar.t0(i7, bundle, packageName, BillingClient.ProductType.SUBS);
                                            if (i6 == 0) {
                                                j3 = ljg.j(i7, "highestLevelSupportedForSubs: ");
                                                com.google.android.gms.internal.play_billing.zzc.h("BillingClient", j3);
                                                break;
                                            }
                                            i7--;
                                        } catch (Exception e6) {
                                            cVar.i(z, e6);
                                            return null;
                                        }
                                    }
                                    a aVar5 = cVar.e;
                                    aVar5.l = i7 >= 5;
                                    aVar5.k = i7 >= 3;
                                    if (i7 < 3) {
                                        zzjsVar = zzjs.SUBSCRIPTIONS_NOT_SUPPORTED;
                                        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "In-app billing API does not support subscription on this device.");
                                    }
                                    while (true) {
                                        if (i5 < 3) {
                                            break;
                                        }
                                        j = ljg.j(i5, "trying inapp apiVersion: ");
                                        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", j);
                                        i6 = bundle == null ? zzarVar.R0(i5, packageName, BillingClient.ProductType.INAPP) : zzarVar.t0(i5, bundle, packageName, BillingClient.ProductType.INAPP);
                                        if (i6 == 0) {
                                            aVar5.m = i5;
                                            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "mHighestLevelSupportedForInApp: " + i5);
                                            break;
                                        }
                                        i5--;
                                    }
                                    a.k(aVar5, aVar5.m);
                                    if (aVar5.m < 3) {
                                        zzjsVar = zzjs.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                        int i8 = com.google.android.gms.internal.play_billing.zzc.a;
                                    }
                                    a.l(aVar5, i6);
                                    if (i6 == 0) {
                                        cVar.f(0, z);
                                        cVar.g(m.i);
                                        return null;
                                    }
                                    BillingResult billingResult2 = m.b;
                                    cVar.d(billingResult2, zzjsVar, null, z, 0);
                                    cVar.g(billingResult2);
                                    return null;
                                } catch (Exception e7) {
                                    cVar.i(z, e7);
                                    return null;
                                }
                            } finally {
                            }
                        }
                    }
                }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzby
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        a aVar2 = cVar.e;
                        aVar2.K(0);
                        BillingResult billingResult = m.k;
                        aVar2.J(cVar.d, billingResult, zzjs.EXECUTE_ASYNC_TIMEOUT);
                        cVar.g(billingResult);
                    }
                }, aVar.c(), aVar.a()) == null) {
                    int i2 = this.d;
                    BillingResult f = aVar.f();
                    aVar.J(i2, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    g(f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        boolean z2;
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        try {
            a aVar = this.e;
            synchronized (aVar.a) {
                z = true;
                z2 = aVar.b == 1;
            }
            c0l c0lVar = aVar.h;
            if (z2) {
                zzjj s = zzjl.s();
                s.i(6);
                zzjq q = zzju.q();
                q.g(zzjs.SERVICE_DISCONNECTED);
                s.g(q);
                zzll p = zzln.p();
                int i2 = this.d;
                if (i2 <= 0) {
                    z = false;
                }
                p.g(z);
                p.h(i2);
                s.h(p);
                c0lVar.o((zzjl) s.c());
            } else {
                zzlk p2 = zzlk.p();
                c0lVar.getClass();
                if (p2 != null) {
                    try {
                        zzku r = zzkw.r();
                        r.g((zzkg) c0lVar.b);
                        r.e();
                        zzkw.q((zzkw) r.b, p2);
                        ((fjg) c0lVar.c).v((zzkw) r.c());
                    } catch (Throwable unused) {
                        int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                    }
                }
            }
        } catch (Throwable unused2) {
            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        a aVar2 = this.e;
        synchronized (aVar2.a) {
            try {
                if (yfa.j) {
                    if (aVar2.b != 3 && aVar2.b != 0) {
                        com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.c;
                        zzbnVar.c = 0L;
                        zzbnVar.b = false;
                        zzbnVar.a();
                    }
                    return;
                }
                com.google.android.gms.internal.play_billing.zzbn zzbnVar2 = this.c;
                zzbnVar2.c = 0L;
                zzbnVar2.b = false;
                zzbnVar2.a();
                if (aVar2.b == 3) {
                    return;
                }
                aVar2.K(0);
                try {
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable unused3) {
                    int i5 = com.google.android.gms.internal.play_billing.zzc.a;
                }
            } finally {
            }
        }
    }
}
