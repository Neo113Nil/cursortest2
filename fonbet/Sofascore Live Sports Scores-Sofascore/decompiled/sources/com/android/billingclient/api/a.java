package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzes;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzim;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzkk;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzll;
import com.google.android.gms.internal.play_billing.zzln;
import com.inmobi.media.core.config.models.CrashConfig;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.a70;
import defpackage.axn;
import defpackage.bzn;
import defpackage.c0l;
import defpackage.dqn;
import defpackage.e1o;
import defpackage.ern;
import defpackage.krn;
import defpackage.ljg;
import defpackage.lon;
import defpackage.osn;
import defpackage.p62;
import defpackage.pko;
import defpackage.ppn;
import defpackage.u53;
import defpackage.ufa;
import defpackage.wsn;
import defpackage.yfa;
import defpackage.zln;
import defpackage.zx3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class a extends BillingClient {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final PendingPurchasesParams G;
    public final boolean H;
    public final boolean I;
    public zzcf J;
    public volatile BillingClientStateListener K;
    public ExecutorService L;
    public final Long M;
    public final com.google.android.gms.internal.play_billing.zzbq N;
    public final String c;
    public final String d;
    public volatile u53 f;
    public final Context g;
    public final c0l h;
    public volatile com.google.android.gms.internal.play_billing.zzar i;
    public volatile c j;
    public boolean k;
    public boolean l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int m = 0;

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, BillingClient.Builder builder) {
        int i = zzcf.c;
        this.J = com.google.android.gms.internal.play_billing.b.j;
        long nextLong = new Random().nextLong();
        this.M = Long.valueOf(nextLong);
        this.N = com.google.android.gms.internal.play_billing.zzbf.a;
        this.c = p62.a;
        String i2 = i();
        this.d = i2;
        this.g = context.getApplicationContext();
        zzke z = zzkg.z();
        z.l();
        if (i2 != null) {
            z.e();
            zzkg.y((zzkg) z.b, i2);
        }
        z.k(this.g.getPackageName());
        z.e();
        zzkg.D((zzkg) z.b, nextLong);
        boolean z2 = builder.l;
        z.e();
        zzkg.w((zzkg) z.b, z2);
        z.g(Build.VERSION.SDK_INT);
        z.j();
        m(z, context);
        try {
            z.h(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        c0l c0lVar = new c0l(this.g, (zzkg) z.c());
        this.h = c0lVar;
        if (purchasesUpdatedListener == null) {
            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        this.f = new u53(this.g, purchasesUpdatedListener, null, null, c0lVar);
        this.G = pendingPurchasesParams;
        this.g.getPackageName();
        this.H = builder.l;
    }

    public static Future b(Callable callable, long j, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzbb
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    int i = com.google.android.gms.internal.play_billing.zzc.a;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception unused) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            return null;
        }
    }

    public static String i() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void k(a aVar, int i) {
        aVar.m = i;
        aVar.F = i >= 29;
        aVar.E = i >= 28;
        aVar.D = i >= 27;
        aVar.C = i >= 26;
        aVar.B = i >= 24;
        aVar.A = i >= 23;
        aVar.z = i >= 22;
        aVar.y = i >= 21;
        aVar.x = i >= 20;
        aVar.w = i >= 19;
        aVar.v = i >= 18;
        aVar.u = i >= 17;
        aVar.t = i >= 16;
        aVar.s = i >= 15;
        aVar.r = i >= 14;
        aVar.q = i >= 12;
        aVar.p = i >= 9;
        aVar.o = i >= 8;
        aVar.n = i >= 6;
    }

    public static void l(a aVar, int i) {
        if (i != 0) {
            aVar.K(0);
            return;
        }
        synchronized (aVar.a) {
            try {
                if (aVar.b == 3) {
                    return;
                }
                aVar.K(2);
                u53 u53Var = aVar.f != null ? aVar.f : null;
                if (u53Var != null) {
                    boolean z = aVar.y;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    u53Var.a = z;
                    pko pkoVar = (pko) u53Var.h;
                    Context context = (Context) u53Var.b;
                    pkoVar.a(context, intentFilter2);
                    boolean z2 = u53Var.a;
                    pko pkoVar2 = (pko) u53Var.g;
                    if (!z2) {
                        pkoVar2.a(context, intentFilter);
                        return;
                    }
                    synchronized (pkoVar2) {
                        try {
                            if (pkoVar2.b) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(pkoVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != pkoVar2.c ? 4 : 2);
                            } else {
                                context.registerReceiver(pkoVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            pkoVar2.b = true;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static final void m(zzke zzkeVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                zzkeVar.e();
                zzkg.v((zzkg) zzkeVar.b, i);
                String str = Build.BRAND;
                zzkeVar.e();
                zzkg.r((zzkg) zzkeVar.b);
                String str2 = Build.MODEL;
                zzkeVar.e();
                zzkg.u((zzkg) zzkeVar.b);
                String str3 = Build.MANUFACTURER;
                zzkeVar.e();
                zzkg.t((zzkg) zzkeVar.b);
                String str4 = Build.FINGERPRINT;
                zzkeVar.e();
                zzkg.s((zzkg) zzkeVar.b);
            }
        } catch (RuntimeException unused) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void A(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 24, billingResult, zzdc.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    public final void B(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 23, billingResult, zzdc.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final void C(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 25, billingResult, zzdc.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final void D(LaunchExternalLinkResponseListener launchExternalLinkResponseListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 37, billingResult, zzdc.zza(exc));
        launchExternalLinkResponseListener.onLaunchExternalLinkResponse(billingResult);
    }

    public final void E(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 16, billingResult, zzdc.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final void F(BillingProgramInformationDialogListener billingProgramInformationDialogListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 39, billingResult, zzdc.zza(exc));
        billingProgramInformationDialogListener.onBillingProgramInformationDialogResponse(billingResult);
    }

    public final void G(int i, zzjs zzjsVar, Exception exc) {
        zzjl zzjlVar;
        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        String zza = zzdc.zza(exc);
        try {
            zzjq q = zzju.q();
            q.h(i);
            q.g(zzjsVar);
            if (zza != null) {
                q.e();
                zzju.r((zzju) q.b, zza);
            }
            zzjj s = zzjl.s();
            s.g(q);
            s.i(30);
            zzjlVar = (zzjl) s.c();
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
            zzjlVar = null;
        }
        this.h.o(zzjlVar);
    }

    public final void H(zzjl zzjlVar) {
        try {
            this.h.s(zzjlVar, this.m);
        } catch (Throwable unused) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void I(zzjp zzjpVar) {
        try {
            c0l c0lVar = this.h;
            int i = this.m;
            c0lVar.getClass();
            try {
                zzke zzkeVar = (zzke) ((zzkg) c0lVar.b).k();
                zzkeVar.e();
                zzkg.C((zzkg) zzkeVar.b, i);
                zzkg zzkgVar = (zzkg) zzkeVar.c();
                c0lVar.b = zzkgVar;
                try {
                    c0lVar.D(zzjpVar, zzkgVar);
                } catch (Throwable unused) {
                    int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                }
            } catch (Throwable unused2) {
                int i3 = com.google.android.gms.internal.play_billing.zzc.a;
            }
        } catch (Throwable unused3) {
            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void J(int i, BillingResult billingResult, zzjs zzjsVar) {
        try {
            int i2 = zzdc.zza;
            zzjj zzjjVar = (zzjj) zzdc.zzb(zzjsVar, 6, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED).k();
            zzll p = zzln.p();
            p.g(i > 0);
            p.h(i);
            zzjjVar.h(p);
            H((zzjl) zzjjVar.c());
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void K(int i) {
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i2 = this.b;
                com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Setting clientState from " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void L(BillingClientStateListener billingClientStateListener, int i) {
        zzjs zzjsVar;
        BillingResult billingResult;
        BillingResult billingResult2;
        synchronized (this.a) {
            try {
                if (P()) {
                    billingResult = e(i);
                } else {
                    if (this.b == 1) {
                        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                        zzjs zzjsVar2 = zzjs.BILLING_CLIENT_CONNECTING;
                        billingResult2 = m.d;
                        J(i, billingResult2, zzjsVar2);
                    } else if (this.b == 3) {
                        int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                        zzjs zzjsVar3 = zzjs.BILLING_CLIENT_CLOSED;
                        billingResult2 = m.j;
                        J(i, billingResult2, zzjsVar3);
                    } else {
                        K(1);
                        if (i == 0) {
                            this.K = billingClientStateListener;
                            i = 0;
                        }
                        M();
                        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Starting in-app billing setup.");
                        this.j = new c(this, billingClientStateListener, i);
                        c cVar = this.j;
                        synchronized (cVar.e.a) {
                            com.google.android.gms.internal.play_billing.zzbn zzbnVar = cVar.b;
                            zzbnVar.c = 0L;
                            zzbnVar.b = false;
                            zzbnVar.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            zzjsVar = zzjs.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzjsVar = zzjs.INVALID_PHONESKY_PACKAGE;
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                billingResult = e(i);
                                            } else if (this.b != 1) {
                                                zzjs zzjsVar4 = zzjs.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                billingResult2 = m.j;
                                                J(i, billingResult2, zzjsVar4);
                                            } else {
                                                c cVar2 = this.j;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.g.bindService(intent2, cVar2, 1) : this.g.bindService(intent2, 1, a(), cVar2)) {
                                                    com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Service was bonded successfully.");
                                                    billingResult = null;
                                                } else {
                                                    zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                zzjsVar = zzjs.INVALID_PHONESKY_PACKAGE;
                            }
                        }
                        K(0);
                        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Billing service unavailable on device.");
                        BillingResult billingResult3 = m.b;
                        J(i, billingResult3, zzjsVar);
                        billingResult = billingResult3;
                    }
                    billingResult = billingResult2;
                }
            } finally {
            }
        }
        if (billingResult != null) {
            billingClientStateListener.onBillingSetupFinished(billingResult);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    try {
                        this.g.unbindService(this.j);
                    } catch (Throwable unused) {
                        int i = com.google.android.gms.internal.play_billing.zzc.a;
                        this.i = null;
                        this.j = null;
                    }
                } finally {
                    this.i = null;
                    this.j = null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N(long j) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j = 0;
            }
            BillingResult billingResult = (BillingResult) g(1).get(j, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                billingResult.getResponseCode();
                int i = com.google.android.gms.internal.play_billing.zzc.a;
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        return P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(long j) {
        long max;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.google.android.gms.internal.play_billing.zzbn zzbnVar = new com.google.android.gms.internal.play_billing.zzbn(this.N);
        zzbnVar.a();
        int i = yfa.i;
        long j2 = j;
        for (int i2 = 1; i2 <= i; i2++) {
            try {
                max = Math.max(0L, j2);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                int i3 = com.google.android.gms.internal.play_billing.zzc.a;
            }
            if (max <= 0) {
                int i4 = com.google.android.gms.internal.play_billing.zzc.a;
                return P();
            }
            BillingResult billingResult = (BillingResult) g(i2).get(max, timeUnit);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                return P();
            }
            billingResult.getResponseCode();
            int i5 = com.google.android.gms.internal.play_billing.zzc.a;
            boolean z = zzbnVar.b;
            com.google.android.gms.internal.play_billing.zzbq zzbqVar = zzbnVar.a;
            long a = j - ((z ? (zzbqVar.a() - zzbnVar.d) + zzbnVar.c : zzbnVar.c) / 1000000);
            long pow = ((long) Math.pow(2.0d, i2 - 1)) * 1000;
            if (a < pow) {
                return P();
            }
            if (i2 >= i || pow <= 0) {
                j2 = a;
            } else {
                try {
                    Thread.sleep(pow);
                    j2 = j - ((zzbnVar.b ? (zzbqVar.a() - zzbnVar.d) + zzbnVar.c : zzbnVar.c) / 1000000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    int i6 = com.google.android.gms.internal.play_billing.zzc.a;
                }
            }
        }
        int i7 = com.google.android.gms.internal.play_billing.zzc.a;
        return P();
    }

    public final boolean P() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void Q(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                BillingResult billingResult2 = billingResult;
                PurchasesUpdatedListener purchasesUpdatedListener = (PurchasesUpdatedListener) aVar.f.c;
                u53 u53Var = aVar.f;
                if (purchasesUpdatedListener != null) {
                    ((PurchasesUpdatedListener) u53Var.c).onPurchasesUpdated(billingResult2, null);
                } else {
                    int i = com.google.android.gms.internal.play_billing.zzc.a;
                }
            }
        });
    }

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        executorService = this.L;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.a, new zln(this));
            this.L = executorService;
        }
        return executorService;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                AcknowledgePurchaseParams acknowledgePurchaseParams2 = acknowledgePurchaseParams;
                aVar.getClass();
                try {
                    if (!aVar.O(yfa.h)) {
                        zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
                        BillingResult billingResult = m.j;
                        aVar.p(3, billingResult, zzjsVar);
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult);
                        return null;
                    }
                    if (TextUtils.isEmpty(acknowledgePurchaseParams2.getPurchaseToken())) {
                        int i = com.google.android.gms.internal.play_billing.zzc.a;
                        zzjs zzjsVar2 = zzjs.EMPTY_PURCHASE_TOKEN;
                        BillingResult billingResult2 = m.g;
                        aVar.p(3, billingResult2, zzjsVar2);
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult2);
                        return null;
                    }
                    if (!aVar.p) {
                        zzjs zzjsVar3 = zzjs.API_VERSION_NOT_V9;
                        BillingResult billingResult3 = m.a;
                        aVar.p(3, billingResult3, zzjsVar3);
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult3);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        BillingResult billingResult4 = m.j;
                        zzjs zzjsVar4 = zzjs.SERVICE_RESET_TO_NULL;
                        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                        aVar.r(zzjsVar4, 3, billingResult4, zzdc.zza(null));
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult4);
                        return null;
                    }
                    String packageName = aVar.g.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams2.getPurchaseToken();
                    String str = aVar.d;
                    long longValue = aVar.M.longValue();
                    int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.b(bundle, str, longValue);
                    Bundle W = zzarVar.W(packageName, bundle, purchaseToken);
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(m.a(com.google.android.gms.internal.play_billing.zzc.a(W, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.g(W, "BillingClient")));
                    return null;
                } catch (DeadObjectException e) {
                    BillingResult billingResult5 = m.j;
                    zzjs zzjsVar5 = zzjs.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION;
                    int i4 = com.google.android.gms.internal.play_billing.zzc.a;
                    aVar.r(zzjsVar5, 3, billingResult5, zzdc.zza(e));
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult5);
                    return null;
                } catch (Exception e2) {
                    BillingResult billingResult6 = m.h;
                    zzjs zzjsVar6 = zzjs.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION;
                    int i5 = com.google.android.gms.internal.play_billing.zzc.a;
                    aVar.r(zzjsVar6, 3, billingResult6, zzdc.zza(e2));
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult6);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                BillingResult billingResult = m.k;
                aVar.p(3, billingResult, zzjs.EXECUTE_ASYNC_TIMEOUT);
                acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult);
            }
        }, c(), a()) == null) {
            BillingResult f = f();
            p(3, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(f);
        }
    }

    public final Handler c() {
        return Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper());
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzbc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                int zza;
                String str;
                a aVar = a.this;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                if (!aVar.O(yfa.h)) {
                    zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
                    BillingResult billingResult = m.j;
                    aVar.p(4, billingResult, zzjsVar);
                    consumeResponseListener2.onConsumeResponse(billingResult, consumeParams2.getPurchaseToken());
                    return null;
                }
                String purchaseToken = consumeParams2.getPurchaseToken();
                try {
                    com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Consuming purchase with token: " + purchaseToken);
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.x(consumeResponseListener2, purchaseToken, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    boolean z = aVar.p;
                    Context context = aVar.g;
                    if (z) {
                        String packageName = context.getPackageName();
                        boolean z2 = aVar.p;
                        String str2 = aVar.d;
                        long longValue = aVar.M.longValue();
                        Bundle bundle = new Bundle();
                        if (z2) {
                            com.google.android.gms.internal.play_billing.zzc.b(bundle, str2, longValue);
                        }
                        Bundle r0 = zzarVar.r0(packageName, bundle, purchaseToken);
                        zza = r0.getInt("RESPONSE_CODE");
                        str = com.google.android.gms.internal.play_billing.zzc.g(r0, "BillingClient");
                    } else {
                        zza = zzarVar.zza(context.getPackageName(), purchaseToken);
                        str = "";
                    }
                    BillingResult a = m.a(zza, str);
                    if (zza == 0) {
                        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Successfully consumed purchase.");
                        consumeResponseListener2.onConsumeResponse(a, purchaseToken);
                        return null;
                    }
                    zzjs zzjsVar2 = zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    ljg.j(zza, "Error consuming purchase with token. Response code: ");
                    aVar.x(consumeResponseListener2, purchaseToken, a, zzjsVar2, null);
                    return null;
                } catch (DeadObjectException e) {
                    aVar.x(consumeResponseListener2, purchaseToken, m.j, zzjs.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.x(consumeResponseListener2, purchaseToken, m.h, zzjs.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                BillingResult billingResult = m.k;
                aVar.p(4, billingResult, zzjs.EXECUTE_ASYNC_TIMEOUT);
                consumeResponseListener2.onConsumeResponse(billingResult, consumeParams2.getPurchaseToken());
            }
        }, c(), a()) == null) {
            BillingResult f = f();
            p(4, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            consumeResponseListener.onConsumeResponse(f, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzax
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                aVar.getClass();
                try {
                    if (!aVar.O(yfa.h)) {
                        aVar.y(alternativeBillingOnlyReportingDetailsListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.y) {
                        int i = com.google.android.gms.internal.play_billing.zzc.a;
                        aVar.y(alternativeBillingOnlyReportingDetailsListener2, m.D, zzjs.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.y(alternativeBillingOnlyReportingDetailsListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    zzarVar.Y2(aVar.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.e(aVar.M.longValue(), aVar.d), new ern(alternativeBillingOnlyReportingDetailsListener2, aVar.h, aVar.m));
                    return null;
                } catch (DeadObjectException e) {
                    aVar.y(alternativeBillingOnlyReportingDetailsListener2, m.j, zzjs.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.y(alternativeBillingOnlyReportingDetailsListener2, m.h, zzjs.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzay
            @Override // java.lang.Runnable
            public final void run() {
                a.this.y(alternativeBillingOnlyReportingDetailsListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, c(), a()) == null) {
            y(alternativeBillingOnlyReportingDetailsListener, f(), zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createBillingProgramReportingDetailsAsync(final BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, final BillingProgramReportingDetailsListener billingProgramReportingDetailsListener) {
        try {
            j(new Callable() { // from class: com.android.billingclient.api.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.android.gms.internal.play_billing.zzar zzarVar;
                    a aVar = a.this;
                    BillingProgramReportingDetailsListener billingProgramReportingDetailsListener2 = billingProgramReportingDetailsListener;
                    BillingProgramReportingDetailsParams billingProgramReportingDetailsParams2 = billingProgramReportingDetailsParams;
                    aVar.getClass();
                    try {
                        if (!aVar.O(yfa.h)) {
                            aVar.z(billingProgramReportingDetailsListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                            return null;
                        }
                        if (!aVar.D) {
                            int i = com.google.android.gms.internal.play_billing.zzc.a;
                            aVar.z(billingProgramReportingDetailsListener2, m.G, zzjs.BILLING_PROGRAM_NOT_SUPPORTED, null);
                            return null;
                        }
                        synchronized (aVar.a) {
                            zzarVar = aVar.i;
                        }
                        if (zzarVar == null) {
                            aVar.z(billingProgramReportingDetailsListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                            return null;
                        }
                        String str = aVar.c;
                        zzes L = ufa.L(aVar.g, "createIndirectBillingReportingDetails");
                        zzij p = zzim.p();
                        zzjd p2 = zzjf.p();
                        p2.g(str);
                        p.g((zzjf) p2.c(), "PLAY_BILLING_LIBRARY_VERSION");
                        zzjd p3 = zzjf.p();
                        p3.g(aVar.g.getPackageName());
                        p.g((zzjf) p3.c(), "CALLING_PACKAGE");
                        zzjd p4 = zzjf.p();
                        p4.g(String.valueOf(billingProgramReportingDetailsParams2.getBillingProgram()));
                        p.g((zzjf) p4.c(), "BILLING_PROGRAM");
                        zzjd p5 = zzjf.p();
                        p5.g("RESPONSE_FORMAT_PROTO");
                        p.g((zzjf) p5.c(), "RESPONSE_FORMAT");
                        if (billingProgramReportingDetailsParams2.getBillingProgram() == 3) {
                            zzjd p6 = zzjf.p();
                            p6.g(String.valueOf(aVar.g.getPackageManager().getPackageInfo(aVar.g.getPackageName(), 0).firstInstallTime));
                            p.g((zzjf) p6.c(), "APP_INSTALL_TIME_MILLIS");
                        } else if (billingProgramReportingDetailsParams2.getBillingProgram() == 5) {
                            zzjd p7 = zzjf.p();
                            p7.g(String.valueOf(billingProgramReportingDetailsParams2.getDeveloperBillingType()));
                            p.g((zzjf) p7.c(), "DEVELOPER_BILLING_TYPE");
                        }
                        Bundle J = ufa.J(L, (zzim) p.c());
                        int billingProgram = billingProgramReportingDetailsParams2.getBillingProgram();
                        c0l c0lVar = aVar.h;
                        int i2 = aVar.m;
                        aVar.c();
                        zzarVar.L0(J, new zx3(billingProgramReportingDetailsListener2, billingProgram, c0lVar, i2, aVar.a()));
                        return null;
                    } catch (DeadObjectException e) {
                        aVar.z(billingProgramReportingDetailsListener2, m.j, zzjs.SERVICE_CALL_EXCEPTION, e);
                        return null;
                    } catch (RuntimeException e2) {
                        aVar.z(billingProgramReportingDetailsListener2, m.h, zzjs.SERVICE_CALL_EXCEPTION, e2);
                        return null;
                    }
                }
            }, new Runnable() { // from class: com.android.billingclient.api.zzar
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.z(billingProgramReportingDetailsListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, c());
        } catch (Exception e) {
            z(billingProgramReportingDetailsListener, f(), zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, e);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzav
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                aVar.getClass();
                try {
                    if (!aVar.O(yfa.h)) {
                        aVar.A(externalOfferReportingDetailsListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.z) {
                        int i = com.google.android.gms.internal.play_billing.zzc.a;
                        aVar.A(externalOfferReportingDetailsListener2, m.u, zzjs.EXTERNAL_OFFER_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.A(externalOfferReportingDetailsListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = aVar.g.getPackageName();
                    long j = aVar.g.getPackageManager().getPackageInfo(aVar.g.getPackageName(), 0).firstInstallTime;
                    String str = aVar.d;
                    long longValue = aVar.M.longValue();
                    int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.b(bundle, str, longValue);
                    bundle.putLong("appInstallTimeMillis", j);
                    zzarVar.v2(packageName, bundle, new krn(externalOfferReportingDetailsListener2, aVar.h, aVar.m));
                    return null;
                } catch (DeadObjectException e) {
                    aVar.A(externalOfferReportingDetailsListener2, m.j, zzjs.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.A(externalOfferReportingDetailsListener2, m.h, zzjs.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                a.this.A(externalOfferReportingDetailsListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, c(), a()) == null) {
            A(externalOfferReportingDetailsListener, f(), zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    public final axn d(BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        r(zzjsVar, 7, billingResult, zzdc.zza(exc));
        return new axn(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    public final BillingResult e(int i) {
        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzjn q = zzjp.q();
        q.e();
        zzjp.p((zzjp) q.b, 6);
        zzll p = zzln.p();
        p.e();
        zzln.u((zzln) p.b);
        p.g(i > 0);
        p.h(i);
        q.e();
        zzjp.v((zzjp) q.b, (zzln) p.c());
        I((zzjp) q.c());
        return m.i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        try {
            int i = zzdc.zza;
            I(zzdc.zzc(12, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    u53 u53Var = this.f;
                    pko pkoVar = (pko) u53Var.g;
                    Context context = (Context) u53Var.b;
                    pkoVar.c(context);
                    ((pko) u53Var.h).c(context);
                }
            } catch (Throwable unused2) {
                int i3 = com.google.android.gms.internal.play_billing.zzc.a;
            }
            try {
                com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Unbinding from service.");
                M();
            } catch (Throwable unused3) {
                int i4 = com.google.android.gms.internal.play_billing.zzc.a;
            }
            try {
                try {
                    synchronized (this) {
                        ExecutorService executorService = this.L;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.L = null;
                        }
                    }
                } catch (Throwable unused4) {
                    int i5 = com.google.android.gms.internal.play_billing.zzc.a;
                }
            } finally {
                K(3);
                this.K = null;
            }
        }
    }

    public final BillingResult f() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return m.j;
                }
            }
            return m.h;
        }
    }

    public final zzdk g(final int i) {
        if (this.H && !P()) {
            return com.google.android.gms.internal.play_billing.zzu.a(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzab
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    a aVar = a.this;
                    aVar.L(new ppn(aVar, zzpVar), i);
                    return "reconnectIfNeeded";
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Already connected or not opted into auto reconnection.");
        return new bzn(m.i);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void getBillingChoiceInfoAsync(final GetBillingChoiceInfoParams getBillingChoiceInfoParams, final BillingChoiceInfoResponseListener billingChoiceInfoResponseListener) {
        if (billingChoiceInfoResponseListener == null) {
            a70.p("Please provide a valid listener.");
        } else if (getBillingChoiceInfoParams == null) {
            a70.p("Please provide valid GetBillingChoiceInfoParams.");
        } else if (b(new Callable() { // from class: com.android.billingclient.api.zzbj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                BillingChoiceInfoResponseListener billingChoiceInfoResponseListener2 = billingChoiceInfoResponseListener;
                GetBillingChoiceInfoParams getBillingChoiceInfoParams2 = getBillingChoiceInfoParams;
                aVar.getClass();
                try {
                    if (!aVar.O(yfa.h)) {
                        aVar.v(billingChoiceInfoResponseListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (aVar.m < 24) {
                        aVar.v(billingChoiceInfoResponseListener2, m.K, zzjs.FEATURE_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.v(billingChoiceInfoResponseListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String str = aVar.c;
                    zzes L = ufa.L(aVar.g, "getBillingChoiceInfo");
                    zzij p = zzim.p();
                    zzjd p2 = zzjf.p();
                    p2.g(str);
                    p.g((zzjf) p2.c(), "PLAY_BILLING_LIBRARY_VERSION");
                    zzjd p3 = zzjf.p();
                    p3.g(aVar.g.getPackageName());
                    p.g((zzjf) p3.c(), "CALLING_PACKAGE");
                    zzjd p4 = zzjf.p();
                    p4.g(String.valueOf(getBillingChoiceInfoParams2.getBillingProgram()));
                    p.g((zzjf) p4.c(), "BILLING_PROGRAM");
                    if (getBillingChoiceInfoParams2.getUserLocale() != null) {
                        zzjd p5 = zzjf.p();
                        p5.g(getBillingChoiceInfoParams2.getUserLocale().toLanguageTag());
                        p.g((zzjf) p5.c(), "LANGUAGE");
                    }
                    if (getBillingChoiceInfoParams2.getPlayBillingChoiceImageLayout() != null) {
                        zzjd p6 = zzjf.p();
                        p6.g(getBillingChoiceInfoParams2.getPlayBillingChoiceImageLayout());
                        p.g((zzjf) p6.c(), "PLAY_BILLING_CHOICE_IMAGE_LAYOUT");
                    }
                    zzarVar.L0(ufa.J(L, (zzim) p.c()), new e1o(billingChoiceInfoResponseListener2, aVar.h, aVar.m));
                    return null;
                } catch (DeadObjectException e) {
                    aVar.v(billingChoiceInfoResponseListener2, m.j, zzjs.SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.v(billingChoiceInfoResponseListener2, m.h, zzjs.SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                a.this.v(billingChoiceInfoResponseListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, c(), a()) == null) {
            v(billingChoiceInfoResponseListener, f(), zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzas
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                try {
                    if (!aVar.O(yfa.h)) {
                        int i = com.google.android.gms.internal.play_billing.zzc.a;
                        zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
                        BillingResult billingResult = m.j;
                        aVar.p(13, billingResult, zzjsVar);
                        billingConfigResponseListener2.onBillingConfigResponse(billingResult, null);
                        return null;
                    }
                    if (!aVar.v) {
                        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                        zzjs zzjsVar2 = zzjs.GET_BILLING_CONFIG_NOT_SUPPORTED;
                        BillingResult billingResult2 = m.z;
                        aVar.p(13, billingResult2, zzjsVar2);
                        billingConfigResponseListener2.onBillingConfigResponse(billingResult2, null);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        BillingResult billingResult3 = m.j;
                        zzjs zzjsVar3 = zzjs.SERVICE_RESET_TO_NULL;
                        int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                        aVar.r(zzjsVar3, 13, billingResult3, zzdc.zza(null));
                        billingConfigResponseListener2.onBillingConfigResponse(billingResult3, null);
                        return null;
                    }
                    if (!yfa.f || !aVar.B) {
                        String packageName = aVar.g.getPackageName();
                        String str = aVar.d;
                        long longValue = aVar.M.longValue();
                        int i4 = com.google.android.gms.internal.play_billing.zzc.a;
                        Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.zzc.b(bundle, str, longValue);
                        if (!TextUtils.isEmpty(null)) {
                            bundle.putString("accountName", null);
                        }
                        zzarVar.d2(packageName, bundle, new e(billingConfigResponseListener2, aVar.h, aVar.m));
                        return null;
                    }
                    String str2 = aVar.c;
                    zzes L = ufa.L(aVar.g, "getBillingConfig");
                    zzij p = zzim.p();
                    zzjd p2 = zzjf.p();
                    p2.g(str2);
                    p.g((zzjf) p2.c(), "PLAY_BILLING_LIBRARY_VERSION");
                    zzjd p3 = zzjf.p();
                    p3.g(aVar.g.getPackageName());
                    p.g((zzjf) p3.c(), "CALLING_PACKAGE");
                    Bundle J = ufa.J(L, (zzim) p.c());
                    if (!TextUtils.isEmpty(null)) {
                        J.putString("accountName", null);
                    }
                    zzarVar.L0(J, new e1o(billingConfigResponseListener2, aVar.h, aVar.m));
                    return null;
                } catch (DeadObjectException e) {
                    BillingResult billingResult4 = m.j;
                    zzjs zzjsVar4 = zzjs.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION;
                    int i5 = com.google.android.gms.internal.play_billing.zzc.a;
                    aVar.r(zzjsVar4, 13, billingResult4, zzdc.zza(e));
                    billingConfigResponseListener2.onBillingConfigResponse(billingResult4, null);
                    return null;
                } catch (Exception e2) {
                    BillingResult billingResult5 = m.h;
                    zzjs zzjsVar5 = zzjs.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION;
                    int i6 = com.google.android.gms.internal.play_billing.zzc.a;
                    aVar.r(zzjsVar5, 13, billingResult5, zzdc.zza(e2));
                    billingConfigResponseListener2.onBillingConfigResponse(billingResult5, null);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzat
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                BillingResult billingResult = m.k;
                aVar.p(13, billingResult, zzjs.EXECUTE_ASYNC_TIMEOUT);
                billingConfigResponseListener2.onBillingConfigResponse(billingResult, null);
            }
        }, c(), a()) == null) {
            BillingResult f = f();
            p(13, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            billingConfigResponseListener.onBillingConfigResponse(f, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i;
        synchronized (this.a) {
            i = this.b;
        }
        return i;
    }

    public final void h() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                try {
                    if (!aVar.O(yfa.h)) {
                        aVar.u(alternativeBillingOnlyAvailabilityListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.y) {
                        int i = com.google.android.gms.internal.play_billing.zzc.a;
                        aVar.u(alternativeBillingOnlyAvailabilityListener2, m.D, zzjs.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.u(alternativeBillingOnlyAvailabilityListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    zzarVar.h1(aVar.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.e(aVar.M.longValue(), aVar.d), new osn(alternativeBillingOnlyAvailabilityListener2, aVar.h, aVar.m));
                    return null;
                } catch (Exception e) {
                    aVar.u(alternativeBillingOnlyAvailabilityListener2, e instanceof DeadObjectException ? m.j : m.h, zzjs.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                a.this.u(alternativeBillingOnlyAvailabilityListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, c(), a()) == null) {
            u(alternativeBillingOnlyAvailabilityListener, f(), zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isBillingProgramAvailableAsync(final int i, final BillingProgramAvailabilityListener billingProgramAvailabilityListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                BillingProgramAvailabilityListener billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                int i2 = i;
                aVar.getClass();
                try {
                    if (!aVar.O(yfa.h)) {
                        aVar.w(billingProgramAvailabilityListener2, i2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.D) {
                        int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                        aVar.w(billingProgramAvailabilityListener2, i2, m.G, zzjs.BILLING_PROGRAM_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.w(billingProgramAvailabilityListener2, i2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String str = aVar.c;
                    zzes L = ufa.L(aVar.g, "isIndirectBillingProgramAvailable");
                    zzij p = zzim.p();
                    zzjd p2 = zzjf.p();
                    p2.g(str);
                    p.g((zzjf) p2.c(), "PLAY_BILLING_LIBRARY_VERSION");
                    zzjd p3 = zzjf.p();
                    p3.g(aVar.g.getPackageName());
                    p.g((zzjf) p3.c(), "CALLING_PACKAGE");
                    zzjd p4 = zzjf.p();
                    p4.g(String.valueOf(i2));
                    p.g((zzjf) p4.c(), "BILLING_PROGRAM");
                    Bundle J = ufa.J(L, (zzim) p.c());
                    try {
                        c0l c0lVar = aVar.h;
                        int i4 = aVar.m;
                        aVar.c();
                        zzarVar.L0(J, new b(billingProgramAvailabilityListener2, i2, c0lVar, i4, aVar.a()));
                        return null;
                    } catch (DeadObjectException e) {
                        e = e;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener2;
                        i2 = i2;
                        aVar.w(billingProgramAvailabilityListener2, i2, m.j, zzjs.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                        return null;
                    } catch (Exception e2) {
                        e = e2;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener2;
                        i2 = i2;
                        aVar.w(billingProgramAvailabilityListener2, i2, m.h, zzjs.SERVICE_CALL_EXCEPTION, e);
                        return null;
                    }
                } catch (DeadObjectException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzap
            @Override // java.lang.Runnable
            public final void run() {
                a.this.w(billingProgramAvailabilityListener, i, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, c(), a()) == null) {
            w(billingProgramAvailabilityListener, i, f(), zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                aVar.getClass();
                try {
                    if (!aVar.O(yfa.h)) {
                        aVar.B(externalOfferAvailabilityListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    }
                    if (!aVar.B) {
                        int i = com.google.android.gms.internal.play_billing.zzc.a;
                        aVar.B(externalOfferAvailabilityListener2, m.u, zzjs.EXTERNAL_OFFER_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.B(externalOfferAvailabilityListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    zzarVar.K2(aVar.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.e(aVar.M.longValue(), aVar.d), new wsn(externalOfferAvailabilityListener2, aVar.h, aVar.m));
                    return null;
                } catch (DeadObjectException e) {
                    aVar.B(externalOfferAvailabilityListener2, m.j, zzjs.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.B(externalOfferAvailabilityListener2, m.h, zzjs.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                a.this.B(externalOfferAvailabilityListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, c(), a()) == null) {
            B(externalOfferAvailabilityListener, f(), zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        if (!N(yfa.g)) {
            BillingResult billingResult = m.j;
            if (billingResult.getResponseCode() != 0) {
                p(5, billingResult, zzjs.SERVICE_CONNECTION_NOT_READY);
                return billingResult;
            }
            try {
                int i = zzdc.zza;
                I(zzdc.zzc(5, zzjz.BROADCAST_ACTION_UNSPECIFIED));
                return billingResult;
            } catch (Throwable unused) {
                int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                return billingResult;
            }
        }
        BillingResult billingResult2 = m.a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    BillingResult billingResult3 = this.l ? m.i : m.m;
                    o(3, billingResult3, zzjs.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED);
                    return billingResult3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    BillingResult billingResult4 = this.s ? m.i : m.o;
                    o(6, billingResult4, zzjs.CROSS_APP_NOT_SUPPORTED);
                    return billingResult4;
                }
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    BillingResult billingResult5 = this.q ? m.i : m.t;
                    o(5, billingResult5, zzjs.IN_APP_MESSAGE_NOT_SUPPORTED);
                    return billingResult5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    BillingResult billingResult6 = this.t ? m.i : m.p;
                    o(8, billingResult6, zzjs.MULTI_ITEM_NOT_SUPPORTED);
                    return billingResult6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    BillingResult billingResult7 = this.r ? m.i : m.q;
                    o(7, billingResult7, zzjs.OFFER_ID_TOKEN_NOT_SUPPORTED);
                    return billingResult7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    BillingResult billingResult8 = this.t ? m.i : m.p;
                    o(9, billingResult8, zzjs.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED);
                    return billingResult8;
                }
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    BillingResult billingResult9 = this.u ? m.i : m.s;
                    o(10, billingResult9, zzjs.PRODUCT_DETAILS_NOT_SUPPORTED);
                    return billingResult9;
                }
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    BillingResult billingResult10 = this.v ? m.i : m.z;
                    o(11, billingResult10, zzjs.GET_BILLING_CONFIG_NOT_SUPPORTED);
                    return billingResult10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    BillingResult billingResult11 = this.v ? m.i : m.A;
                    o(12, billingResult11, zzjs.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED);
                    return billingResult11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    BillingResult billingResult12 = this.x ? m.i : m.C;
                    o(13, billingResult12, zzjs.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED);
                    return billingResult12;
                }
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    BillingResult billingResult13 = this.y ? m.i : m.D;
                    o(14, billingResult13, zzjs.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED);
                    return billingResult13;
                }
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    BillingResult billingResult14 = this.B ? m.i : m.u;
                    o(18, billingResult14, zzjs.EXTERNAL_OFFER_NOT_SUPPORTED);
                    return billingResult14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    BillingResult billingResult15 = this.A ? m.i : m.v;
                    o(19, billingResult15, zzjs.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED);
                    return billingResult15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    BillingResult billingResult16 = this.B ? m.i : m.w;
                    o(20, billingResult16, zzjs.AUTO_PAY_NOT_SUPPORTED);
                    return billingResult16;
                }
                break;
            case 109230:
                if (str.equals(BillingClient.FeatureType.INCLUDE_SUSPENDED_SUBSCRIPTIONS)) {
                    BillingResult billingResult17 = this.C ? m.i : m.x;
                    o(21, billingResult17, zzjs.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED);
                    return billingResult17;
                }
                break;
            case 110223:
                if (str.equals("ooo")) {
                    BillingResult billingResult18 = this.E ? m.i : m.r;
                    o(22, billingResult18, zzjs.GIFT_CODE_PURCHASE_NOT_SUPPORTED);
                    return billingResult18;
                }
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    BillingResult billingResult19 = this.o ? m.i : m.n;
                    o(4, billingResult19, zzjs.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED);
                    return billingResult19;
                }
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    BillingResult billingResult20 = this.k ? m.i : m.l;
                    o(2, billingResult20, zzjs.SUBSCRIPTIONS_NOT_SUPPORTED);
                    return billingResult20;
                }
                break;
        }
        "Unsupported feature: ".concat(str);
        int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        BillingResult billingResult21 = m.y;
        o(1, billingResult21, zzjs.UNKNOWN_FEATURE);
        return billingResult21;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.H) {
            return true;
        }
        return P();
    }

    public final void j(Callable callable, final Runnable runnable, Handler handler) {
        try {
            final Future submit = a().submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzbm
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    int i = com.google.android.gms.internal.play_billing.zzc.a;
                    runnable2.run();
                }
            }, 28500L);
        } catch (Exception e) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0284, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0802 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        boolean z;
        int i;
        String str;
        Iterator it;
        long j;
        boolean z2;
        String str2;
        BillingFlowParams.ProductDetailsParams productDetailsParams;
        BillingResult billingResult;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        BillingFlowParams.ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams;
        BillingResult billingResult2;
        BillingFlowParams.ProductDetailsParams productDetailsParams2;
        int i2;
        BillingResult billingResult3;
        BillingResult a;
        long j2;
        boolean z3;
        Future b;
        boolean z4;
        long j3;
        boolean z5;
        long j4;
        boolean z6;
        long j5;
        zzjs zzjsVar;
        zzjs zzjsVar2;
        boolean z7;
        long j6;
        String str3;
        String str4;
        boolean z8;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList;
        boolean z9;
        final int i3;
        int i4;
        int i5;
        long nextLong = new Random().nextLong();
        if (this.f == null || ((PurchasesUpdatedListener) this.f.c) == null) {
            zzjs zzjsVar3 = zzjs.MISSING_LISTENER;
            BillingResult billingResult4 = m.E;
            q(zzjsVar3, billingResult4, nextLong);
            return billingResult4;
        }
        if (billingFlowParams.getDeveloperBillingOptionParams() != null && ((DeveloperProvidedBillingListener) this.f.e) == null) {
            zzjs zzjsVar4 = zzjs.MISSING_DEVELOPER_PROVIDED_BILLING_LISTENER;
            BillingResult billingResult5 = m.I;
            q(zzjsVar4, billingResult5, nextLong);
            return billingResult5;
        }
        if (!N(yfa.g)) {
            zzjs zzjsVar5 = zzjs.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult6 = m.j;
            q(zzjsVar5, billingResult6, nextLong);
            Q(billingResult6);
            return billingResult6;
        }
        synchronized (this.a) {
            try {
                z = false;
                if (this.j != null) {
                    z = this.j.d > 0;
                    i = 0;
                } else {
                    i = 0;
                }
            } finally {
            }
        }
        ArrayList zzj = billingFlowParams.zzj();
        List zzk = billingFlowParams.zzk();
        Iterator it2 = zzj.iterator();
        zzeu zzeuVar = (zzeu) (it2.hasNext() ? it2.next() : null);
        Iterator it3 = zzk.iterator();
        BillingFlowParams.ProductDetailsParams productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) (it3.hasNext() ? it3.next() : null);
        if (zzeuVar != null) {
            throw null;
        }
        String productId = productDetailsParams3.zza().getProductId();
        String productType = productDetailsParams3.zza().getProductType();
        if (productType.equals(BillingClient.ProductType.SUBS) && !this.k) {
            int i6 = com.google.android.gms.internal.play_billing.zzc.a;
            zzjs zzjsVar6 = zzjs.SUBSCRIPTIONS_NOT_SUPPORTED;
            BillingResult billingResult7 = m.l;
            s(zzjsVar6, billingResult7, nextLong, z);
            Q(billingResult7);
            return billingResult7;
        }
        if (billingFlowParams.b == null && billingFlowParams.c == null) {
            BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams = billingFlowParams.d;
            if (subscriptionUpdateParams.b == null && subscriptionUpdateParams.c == 0 && !billingFlowParams.a && !billingFlowParams.g) {
                zzca zzcaVar = billingFlowParams.e;
                if (zzcaVar != null) {
                    int size = zzcaVar.size();
                    int i7 = i;
                    str = null;
                    while (i7 < size) {
                        BillingFlowParams.ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams2 = ((BillingFlowParams.ProductDetailsParams) zzcaVar.get(i7)).getSubscriptionProductReplacementParams();
                        i7++;
                        if (subscriptionProductReplacementParams2 != null) {
                            if (!this.n) {
                                int i8 = com.google.android.gms.internal.play_billing.zzc.a;
                                zzjs zzjsVar7 = zzjs.EXTRA_PARAMS_NOT_SUPPORTED;
                                BillingResult billingResult8 = m.f;
                                s(zzjsVar7, billingResult8, nextLong, z);
                                Q(billingResult8);
                                return billingResult8;
                            }
                        }
                    }
                } else {
                    str = null;
                }
                if (zzj.size() <= 1 && !this.t) {
                    int i9 = com.google.android.gms.internal.play_billing.zzc.a;
                    zzjs zzjsVar8 = zzjs.MULTI_ITEM_NOT_SUPPORTED;
                    BillingResult billingResult9 = m.p;
                    s(zzjsVar8, billingResult9, nextLong, z);
                    Q(billingResult9);
                    return billingResult9;
                }
                if (zzk.isEmpty() && !this.u) {
                    int i10 = com.google.android.gms.internal.play_billing.zzc.a;
                    zzjs zzjsVar9 = zzjs.PRODUCT_DETAILS_NOT_SUPPORTED;
                    BillingResult billingResult10 = m.s;
                    s(zzjsVar9, billingResult10, nextLong, z);
                    Q(billingResult10);
                    return billingResult10;
                }
                it = zzk.iterator();
                while (it.hasNext()) {
                    String zzb = ((BillingFlowParams.ProductDetailsParams) it.next()).zzb();
                    if (zzb != null && zzb.contains(":") && !this.E) {
                        int i11 = com.google.android.gms.internal.play_billing.zzc.a;
                        zzjs zzjsVar10 = zzjs.GIFT_CODE_PURCHASE_NOT_SUPPORTED;
                        BillingResult billingResult11 = m.r;
                        s(zzjsVar10, billingResult11, nextLong, z);
                        Q(billingResult11);
                        return billingResult11;
                    }
                }
                if (billingFlowParams.e.isEmpty()) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams4 = (BillingFlowParams.ProductDetailsParams) billingFlowParams.e.get(i);
                    int i12 = 1;
                    while (i12 < billingFlowParams.e.size()) {
                        BillingFlowParams.ProductDetailsParams productDetailsParams5 = (BillingFlowParams.ProductDetailsParams) billingFlowParams.e.get(i12);
                        int i13 = i12;
                        if (productDetailsParams5.zza().getProductType().equals(productDetailsParams4.zza().getProductType()) || productDetailsParams5.zza().getProductType().equals("play_pass_subs")) {
                            i12 = i13 + 1;
                        } else {
                            a = m.a(5, "All products should have same ProductType.");
                        }
                    }
                    String zza = productDetailsParams4.zza().zza();
                    HashMap hashMap = new HashMap();
                    HashSet hashSet = new HashSet();
                    j = nextLong;
                    zzca zzcaVar2 = billingFlowParams.e;
                    int size2 = zzcaVar2.size();
                    z2 = z;
                    int i14 = 0;
                    boolean z10 = false;
                    while (true) {
                        if (i14 < size2) {
                            zzca zzcaVar3 = zzcaVar2;
                            productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) zzcaVar2.get(i14);
                            int i15 = size2;
                            BillingFlowParams.ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams3 = productDetailsParams2.getSubscriptionProductReplacementParams();
                            if (subscriptionProductReplacementParams3 != null) {
                                i2 = i14;
                                str2 = productId;
                                if (productDetailsParams2.zza().getProductType().equals(BillingClient.ProductType.SUBS)) {
                                    productDetailsParams = productDetailsParams3;
                                    if (subscriptionProductReplacementParams3.getReplacementMode() <= 0) {
                                        billingResult3 = m.a(5, "replacementMode is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: " + productDetailsParams2.zza().getProductId());
                                    } else {
                                        String str8 = subscriptionProductReplacementParams3.a;
                                        billingResult3 = (str8 == null || str8.isEmpty()) ? m.a(5, "oldProductId is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: " + productDetailsParams2.zza().getProductId()) : m.i;
                                    }
                                } else {
                                    productDetailsParams = productDetailsParams3;
                                    billingResult3 = m.a(5, "Non-subscription product cannot have SubscriptionProductReplacementParams. Invalid product id: " + productDetailsParams2.zza().getProductId());
                                }
                                if (billingResult3 != m.i) {
                                    break;
                                }
                            } else {
                                i2 = i14;
                                str2 = productId;
                                productDetailsParams = productDetailsParams3;
                            }
                            if (subscriptionProductReplacementParams3 != null && subscriptionProductReplacementParams3.getReplacementMode() == 6) {
                                if (productDetailsParams2.zzb() != null) {
                                    billingResult3 = m.a(5, "When using KEEP_EXISTING mode, offerToken in ProductDetailsParams should not be set. Offer token is set for product id: " + productDetailsParams2.zza().getProductId());
                                } else if (subscriptionProductReplacementParams3.getOldProductId().equals(productDetailsParams2.zza().getProductId())) {
                                    billingResult3 = m.i;
                                } else {
                                    billingResult3 = m.a(5, "When using KEEP_EXISTING mode, oldProductId in SubscriptionProductReplacementParams should be the same as the product id in ProductDetails. Value is invalid for product id: " + productDetailsParams2.zza().getProductId());
                                }
                                if (billingResult3 != m.i) {
                                    break;
                                }
                            }
                            if (productDetailsParams2.zza().getSubscriptionOfferDetails() != null && productDetailsParams2.zzb() == null) {
                                if (subscriptionProductReplacementParams3 == null) {
                                    break;
                                }
                                if (subscriptionProductReplacementParams3.getReplacementMode() != 6) {
                                    break;
                                }
                            }
                            if (hashMap.containsKey(productDetailsParams2.zza().getProductId())) {
                                billingResult = m.a(5, "ProductId can not be duplicated. Invalid product id: " + productDetailsParams2.zza().getProductId() + ".");
                                break;
                            }
                            hashMap.put(productDetailsParams2.zza().getProductId(), productDetailsParams2);
                            if (subscriptionProductReplacementParams3 != null) {
                                if (hashSet.contains(subscriptionProductReplacementParams3.getOldProductId())) {
                                    billingResult = m.a(5, "OldProductId can not be duplicated. Invalid old product id: " + subscriptionProductReplacementParams3.getOldProductId() + ".");
                                    break;
                                }
                                hashSet.add(subscriptionProductReplacementParams3.getOldProductId());
                                z10 = true;
                            }
                            if (!productDetailsParams4.zza().getProductType().equals("play_pass_subs") && !productDetailsParams2.zza().getProductType().equals("play_pass_subs") && !zza.equals(productDetailsParams2.zza().zza())) {
                                billingResult = m.a(5, "All products must have the same package name.");
                                break;
                            }
                            i14 = i2 + 1;
                            size2 = i15;
                            zzcaVar2 = zzcaVar3;
                            productId = str2;
                            productDetailsParams3 = productDetailsParams;
                        } else {
                            str2 = productId;
                            productDetailsParams = productDetailsParams3;
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                String str9 = (String) it4.next();
                                if (hashMap.containsKey(str9) && ((subscriptionProductReplacementParams = ((BillingFlowParams.ProductDetailsParams) hashMap.get(str9)).getSubscriptionProductReplacementParams()) == null || !subscriptionProductReplacementParams.getOldProductId().equals(str9))) {
                                    billingResult = m.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str9 + ".");
                                    break;
                                }
                            }
                            if (!z10 || billingFlowParams.d.c == 0) {
                                List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetailsParams4.zza().getOneTimePurchaseOfferDetailsList();
                                String zzb2 = productDetailsParams4.zzb();
                                if (zzb2 != null && oneTimePurchaseOfferDetailsList != null) {
                                    Iterator<ProductDetails.OneTimePurchaseOfferDetails> it5 = oneTimePurchaseOfferDetailsList.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            oneTimePurchaseOfferDetails = str;
                                            break;
                                        }
                                        oneTimePurchaseOfferDetails = it5.next();
                                        if (zzb2.equals(oneTimePurchaseOfferDetails.getOfferToken())) {
                                            break;
                                        }
                                    }
                                    if (oneTimePurchaseOfferDetails != 0 && oneTimePurchaseOfferDetails.zza() != null) {
                                        billingResult = m.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                    }
                                }
                                billingResult = m.i;
                            } else {
                                billingResult = m.a(5, "SubscriptionUpdateParams.setSubscriptionReplaceMode and  ProductDetailsParams.setSubscriptionProductReplacementParams cannot be called at the same time.");
                            }
                        }
                    }
                    billingResult = m.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + productDetailsParams2.zza().getProductId());
                    billingResult2 = billingResult;
                    if (billingResult2 != m.i) {
                        s(zzjs.INVALID_BILLING_FLOW_PARAMS, billingResult2, j, z2);
                        Q(billingResult2);
                        return billingResult2;
                    }
                    long j7 = j;
                    boolean z11 = z2;
                    if (this.n) {
                        boolean z12 = this.p;
                        boolean z13 = this.w;
                        PendingPurchasesParams pendingPurchasesParams = this.G;
                        pendingPurchasesParams.getClass();
                        boolean z14 = pendingPurchasesParams.a;
                        boolean z15 = this.I;
                        String str10 = this.d;
                        long longValue = this.M.longValue();
                        String packageName = this.g.getPackageName();
                        int i16 = com.google.android.gms.internal.play_billing.zzc.a;
                        z3 = z11;
                        final Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.zzc.b(bundle, str10, longValue);
                        bundle.putLong("billingClientTransactionId", j7);
                        if (billingFlowParams.zzb() != 0) {
                            bundle.putInt("prorationMode", billingFlowParams.zzb());
                        }
                        if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                            bundle.putString("accountId", billingFlowParams.zze());
                        }
                        if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
                            bundle.putString("obfuscatedProfileId", billingFlowParams.zzf());
                        }
                        if (billingFlowParams.zzt()) {
                            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(str)));
                        }
                        if (!TextUtils.isEmpty(billingFlowParams.zzh())) {
                            bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzh());
                        }
                        billingFlowParams.zzg();
                        if (TextUtils.isEmpty(str)) {
                            str4 = str;
                        } else {
                            billingFlowParams.zzg();
                            str4 = str;
                            bundle.putString("oldSkuPurchaseId", str4);
                        }
                        if (!TextUtils.isEmpty(billingFlowParams.zzi())) {
                            bundle.putString("originalExternalTransactionId", billingFlowParams.zzi());
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            bundle.putString("paymentsPurchaseParams", str4);
                        }
                        if (z12) {
                            z8 = true;
                            bundle.putBoolean("enablePendingPurchases", true);
                        } else {
                            z8 = true;
                        }
                        if (z13 && z14) {
                            bundle.putBoolean("enablePendingPurchaseForSubscriptions", z8);
                        }
                        if (z15 || billingFlowParams.getDeveloperBillingOptionParams() != null) {
                            bundle.putBoolean("enableAlternativeBilling", z8);
                        }
                        billingFlowParams.zzc();
                        billingFlowParams.zza();
                        if (billingFlowParams.getDeveloperBillingOptionParams() != null) {
                            if (billingFlowParams.getDeveloperBillingOptionParams().getLinkUri() != null) {
                                bundle.putString("developerBillingLinkUri", billingFlowParams.getDeveloperBillingOptionParams().getLinkUri().toString());
                            }
                            if (billingFlowParams.getDeveloperBillingOptionParams().getLaunchMode() != 0) {
                                bundle.putInt("developerBillingLaunchMode", billingFlowParams.getDeveloperBillingOptionParams().getLaunchMode());
                            }
                            bundle.putInt("developerBillingProgram", billingFlowParams.getDeveloperBillingOptionParams().getBillingProgram());
                            if (billingFlowParams.getDeveloperBillingOptionParams().getExternalTransactionToken() != null) {
                                bundle.putString("externalTransactionToken", billingFlowParams.getDeveloperBillingOptionParams().getExternalTransactionToken());
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (BillingFlowParams.ProductDetailsParams productDetailsParams6 : billingFlowParams.zzk()) {
                            if (productDetailsParams6.getSubscriptionProductReplacementParams() != null) {
                                String productId2 = productDetailsParams6.zza().getProductId();
                                BillingFlowParams.ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams4 = productDetailsParams6.getSubscriptionProductReplacementParams();
                                com.google.android.gms.internal.play_billing.zzek p = com.google.android.gms.internal.play_billing.zzel.p();
                                com.google.android.gms.internal.play_billing.zzeu p2 = com.google.android.gms.internal.play_billing.zzev.p();
                                long j8 = j7;
                                p2.e();
                                com.google.android.gms.internal.play_billing.zzev.q((com.google.android.gms.internal.play_billing.zzev) p2.b, "subs:" + packageName + ":" + productId2);
                                p.e();
                                com.google.android.gms.internal.play_billing.zzel.q((com.google.android.gms.internal.play_billing.zzel) p.b, (com.google.android.gms.internal.play_billing.zzev) p2.c());
                                com.google.android.gms.internal.play_billing.zzeu p3 = com.google.android.gms.internal.play_billing.zzev.p();
                                String str11 = "subs:" + packageName + ":" + subscriptionProductReplacementParams4.getOldProductId();
                                p3.e();
                                com.google.android.gms.internal.play_billing.zzev.q((com.google.android.gms.internal.play_billing.zzev) p3.b, str11);
                                p.e();
                                com.google.android.gms.internal.play_billing.zzel.r((com.google.android.gms.internal.play_billing.zzel) p.b, (com.google.android.gms.internal.play_billing.zzev) p3.c());
                                switch (subscriptionProductReplacementParams4.getReplacementMode()) {
                                    case 1:
                                        i5 = 2;
                                        break;
                                    case 2:
                                        i5 = 3;
                                        break;
                                    case 3:
                                        i5 = 4;
                                        break;
                                    case 4:
                                        i5 = 6;
                                        break;
                                    case 5:
                                        i5 = 7;
                                        break;
                                    case 6:
                                        i5 = 8;
                                        break;
                                    case 7:
                                        i5 = 9;
                                        break;
                                    default:
                                        i5 = 1;
                                        break;
                                }
                                p.e();
                                com.google.android.gms.internal.play_billing.zzel.s((com.google.android.gms.internal.play_billing.zzel) p.b, i5);
                                arrayList2.add((com.google.android.gms.internal.play_billing.zzel) p.c());
                                j7 = j8;
                            }
                        }
                        j2 = j7;
                        if (!arrayList2.isEmpty()) {
                            com.google.android.gms.internal.play_billing.zzem p4 = com.google.android.gms.internal.play_billing.zzen.p();
                            p4.e();
                            com.google.android.gms.internal.play_billing.zzen.q((com.google.android.gms.internal.play_billing.zzen) p4.b, arrayList2);
                            bundle.putByteArray("subscriptionProductReplacementParamsList", ((com.google.android.gms.internal.play_billing.zzen) p4.c()).b());
                        }
                        if (zzj.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zzk.size() - 1);
                            ArrayList arrayList4 = new ArrayList(zzk.size() - 1);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            int i17 = 0;
                            while (i17 < zzk.size()) {
                                BillingFlowParams.ProductDetailsParams productDetailsParams7 = (BillingFlowParams.ProductDetailsParams) zzk.get(i17);
                                ProductDetails zza2 = productDetailsParams7.zza();
                                if (!zza2.h.isEmpty()) {
                                    arrayList5.add(zza2.h);
                                }
                                String zzb3 = productDetailsParams7.zzb();
                                arrayList6.add(zzb3);
                                if (!TextUtils.isEmpty(zzb3) && (arrayList = zza2.k) != null && !arrayList.isEmpty()) {
                                    Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = (ProductDetails.OneTimePurchaseOfferDetails) it6.next();
                                        str6 = productType;
                                        if (TextUtils.isEmpty(oneTimePurchaseOfferDetails2.l) || !Objects.equals(oneTimePurchaseOfferDetails2.getOfferToken(), zzb3)) {
                                            productType = str6;
                                        } else {
                                            str7 = oneTimePurchaseOfferDetails2.l;
                                            if (!TextUtils.isEmpty(str7)) {
                                                arrayList7.add(str7);
                                            }
                                            if (i17 <= 0) {
                                                arrayList3.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i17)).zza().getProductId());
                                                arrayList4.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i17)).zza().getProductType());
                                            }
                                            i17++;
                                            productType = str6;
                                        }
                                    }
                                }
                                str6 = productType;
                                str7 = zza2.i;
                                if (!TextUtils.isEmpty(str7)) {
                                }
                                if (i17 <= 0) {
                                }
                                i17++;
                                productType = str6;
                            }
                            str5 = productType;
                            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList6);
                            if (!arrayList8.isEmpty()) {
                                bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList8);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList5);
                            }
                            if (!arrayList7.isEmpty()) {
                                bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList7);
                            }
                            if (!arrayList3.isEmpty()) {
                                bundle.putStringArrayList("additionalSkus", arrayList3);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList4);
                            }
                        } else {
                            ArrayList arrayList9 = new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            Iterator it7 = zzj.iterator();
                            if (it7.hasNext()) {
                                throw null;
                            }
                            if (!arrayList9.isEmpty()) {
                                bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                            }
                            if (zzj.size() > 1) {
                                ArrayList arrayList10 = new ArrayList(zzj.size() - 1);
                                ArrayList arrayList11 = new ArrayList(zzj.size() - 1);
                                if (zzj.size() > 1) {
                                    throw null;
                                }
                                bundle.putStringArrayList("additionalSkus", arrayList10);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList11);
                            }
                            str5 = productType;
                        }
                        if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.r) {
                            zzjs zzjsVar11 = zzjs.OFFER_ID_TOKEN_NOT_SUPPORTED;
                            BillingResult billingResult12 = m.q;
                            s(zzjsVar11, billingResult12, j2, z3);
                            Q(billingResult12);
                            return billingResult12;
                        }
                        if (TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                            z9 = false;
                        } else {
                            bundle.putString("skuPackageName", productDetailsParams.zza().zza());
                            z9 = true;
                        }
                        if (!TextUtils.isEmpty(null)) {
                            bundle.putString("accountName", null);
                        }
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            int i18 = com.google.android.gms.internal.play_billing.zzc.a;
                        } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                bundle.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString("proxyPackageVersion", "package not found");
                            }
                        }
                        if (this.E) {
                            i4 = 28;
                        } else if (this.u && !zzk.isEmpty()) {
                            i4 = 17;
                        } else if (this.s && z9) {
                            i4 = 15;
                        } else {
                            i3 = this.p ? 9 : 6;
                            final String str12 = str5;
                            final String str13 = str2;
                            b = b(new Callable() { // from class: com.android.billingclient.api.zzaf
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Bundle c;
                                    com.google.android.gms.internal.play_billing.zzar zzarVar;
                                    a aVar = a.this;
                                    int i19 = i3;
                                    String str14 = str13;
                                    String str15 = str12;
                                    Bundle bundle2 = bundle;
                                    aVar.getClass();
                                    try {
                                        synchronized (aVar.a) {
                                            zzarVar = aVar.i;
                                        }
                                        return zzarVar == null ? com.google.android.gms.internal.play_billing.zzc.c(m.j, zzjs.SERVICE_RESET_TO_NULL) : zzarVar.g2(i19, aVar.g.getPackageName(), str14, str15, bundle2);
                                    } catch (DeadObjectException e) {
                                        BillingResult billingResult13 = m.j;
                                        zzjs zzjsVar12 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                                        String zza3 = zzdc.zza(e);
                                        c = com.google.android.gms.internal.play_billing.zzc.c(billingResult13, zzjsVar12);
                                        if (zza3 != null) {
                                            c.putString("ADDITIONAL_LOG_DETAILS", zza3);
                                        }
                                        return c;
                                    } catch (Exception e2) {
                                        BillingResult billingResult14 = m.h;
                                        zzjs zzjsVar13 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                                        String zza4 = zzdc.zza(e2);
                                        c = com.google.android.gms.internal.play_billing.zzc.c(billingResult14, zzjsVar13);
                                        if (zza4 != null) {
                                            c.putString("ADDITIONAL_LOG_DETAILS", zza4);
                                        }
                                        return c;
                                    }
                                }
                            }, 5000L, null, this.e, a());
                            j3 = str12;
                            z4 = bundle;
                        }
                        i3 = i4;
                        final String str122 = str5;
                        final String str132 = str2;
                        b = b(new Callable() { // from class: com.android.billingclient.api.zzaf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Bundle c;
                                com.google.android.gms.internal.play_billing.zzar zzarVar;
                                a aVar = a.this;
                                int i19 = i3;
                                String str14 = str132;
                                String str15 = str122;
                                Bundle bundle2 = bundle;
                                aVar.getClass();
                                try {
                                    synchronized (aVar.a) {
                                        zzarVar = aVar.i;
                                    }
                                    return zzarVar == null ? com.google.android.gms.internal.play_billing.zzc.c(m.j, zzjs.SERVICE_RESET_TO_NULL) : zzarVar.g2(i19, aVar.g.getPackageName(), str14, str15, bundle2);
                                } catch (DeadObjectException e) {
                                    BillingResult billingResult13 = m.j;
                                    zzjs zzjsVar12 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                                    String zza3 = zzdc.zza(e);
                                    c = com.google.android.gms.internal.play_billing.zzc.c(billingResult13, zzjsVar12);
                                    if (zza3 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", zza3);
                                    }
                                    return c;
                                } catch (Exception e2) {
                                    BillingResult billingResult14 = m.h;
                                    zzjs zzjsVar13 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                                    String zza4 = zzdc.zza(e2);
                                    c = com.google.android.gms.internal.play_billing.zzc.c(billingResult14, zzjsVar13);
                                    if (zza4 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", zza4);
                                    }
                                    return c;
                                }
                            }
                        }, 5000L, null, this.e, a());
                        j3 = str122;
                        z4 = bundle;
                    } else {
                        j2 = j7;
                        z3 = z11;
                        final String str14 = productType;
                        final String str15 = str2;
                        b = b(new Callable() { // from class: com.android.billingclient.api.zzag
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Bundle c;
                                com.google.android.gms.internal.play_billing.zzar zzarVar;
                                a aVar = a.this;
                                String str16 = str15;
                                String str17 = str14;
                                aVar.getClass();
                                try {
                                    synchronized (aVar.a) {
                                        zzarVar = aVar.i;
                                    }
                                    return zzarVar == null ? com.google.android.gms.internal.play_billing.zzc.c(m.j, zzjs.SERVICE_RESET_TO_NULL) : zzarVar.j4(aVar.g.getPackageName(), str16, str17);
                                } catch (DeadObjectException e) {
                                    BillingResult billingResult13 = m.j;
                                    zzjs zzjsVar12 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                                    String zza3 = zzdc.zza(e);
                                    c = com.google.android.gms.internal.play_billing.zzc.c(billingResult13, zzjsVar12);
                                    if (zza3 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", zza3);
                                    }
                                    return c;
                                } catch (Exception e2) {
                                    BillingResult billingResult14 = m.h;
                                    zzjs zzjsVar13 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                                    String zza4 = zzdc.zza(e2);
                                    c = com.google.android.gms.internal.play_billing.zzc.c(billingResult14, zzjsVar13);
                                    if (zza4 != null) {
                                        c.putString("ADDITIONAL_LOG_DETAILS", zza4);
                                    }
                                    return c;
                                }
                            }
                        }, 5000L, null, this.e, a());
                        j3 = str14;
                        z4 = z11;
                    }
                    try {
                        if (b == null) {
                            try {
                                zzjs zzjsVar12 = zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                                BillingResult billingResult13 = m.c;
                                s(zzjsVar12, billingResult13, j2, z3);
                                Q(billingResult13);
                                return billingResult13;
                            } catch (CancellationException e) {
                                e = e;
                                j5 = j2;
                                z6 = z3;
                                int i19 = com.google.android.gms.internal.play_billing.zzc.a;
                                zzjs zzjsVar13 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                                BillingResult billingResult14 = m.k;
                                t(zzjsVar13, billingResult14, zzdc.zza(e), j5, z6);
                                Q(billingResult14);
                                return billingResult14;
                            } catch (TimeoutException e2) {
                                e = e2;
                                j5 = j2;
                                z6 = z3;
                                int i192 = com.google.android.gms.internal.play_billing.zzc.a;
                                zzjs zzjsVar132 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                                BillingResult billingResult142 = m.k;
                                t(zzjsVar132, billingResult142, zzdc.zza(e), j5, z6);
                                Q(billingResult142);
                                return billingResult142;
                            } catch (Exception e3) {
                                e = e3;
                                j4 = j2;
                                z5 = z3;
                                int i20 = com.google.android.gms.internal.play_billing.zzc.a;
                                zzjs zzjsVar14 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                                BillingResult billingResult15 = m.j;
                                t(zzjsVar14, billingResult15, zzdc.zza(e), j4, z5);
                                Q(billingResult15);
                                return billingResult15;
                            }
                        }
                        long j9 = j2;
                        boolean z16 = z3;
                        Bundle bundle2 = (Bundle) b.get(5000L, TimeUnit.MILLISECONDS);
                        int a2 = com.google.android.gms.internal.play_billing.zzc.a(bundle2, "BillingClient");
                        String g = com.google.android.gms.internal.play_billing.zzc.g(bundle2, "BillingClient");
                        if (a2 == 0) {
                            Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                            intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                            intent2.putExtra("billingClientTransactionId", j9);
                            intent2.putExtra("wasServiceAutoReconnected", z16);
                            activity.startActivity(intent2);
                            return m.i;
                        }
                        ljg.j(a2, "Unable to buy item, Error response code: ");
                        BillingResult a3 = m.a(a2, g);
                        try {
                            if (bundle2 == null) {
                                zzjsVar = zzjs.REASON_UNSPECIFIED;
                            } else {
                                Object obj = bundle2.get("LOG_REASON");
                                zzjsVar = obj == null ? zzjs.REASON_UNSPECIFIED : obj instanceof Integer ? zzjs.a(((Integer) obj).intValue()) : zzjs.REASON_UNSPECIFIED;
                            }
                        } catch (Throwable th) {
                            "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage()));
                            int i21 = com.google.android.gms.internal.play_billing.zzc.a;
                            zzjsVar = zzjs.REASON_UNSPECIFIED;
                        }
                        if (zzjsVar == zzjs.REASON_UNSPECIFIED) {
                            zzjsVar = zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                        }
                        zzjs zzjsVar15 = zzjsVar;
                        try {
                            if (bundle2 != null) {
                                try {
                                    String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                    zzjsVar2 = zzjsVar15;
                                    z7 = z16;
                                    j6 = j9;
                                    str3 = string;
                                } catch (Throwable th2) {
                                    "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage()));
                                    int i22 = com.google.android.gms.internal.play_billing.zzc.a;
                                }
                                t(zzjsVar2, a3, str3, j6, z7);
                                Q(a3);
                                return a3;
                            }
                            t(zzjsVar2, a3, str3, j6, z7);
                            Q(a3);
                            return a3;
                        } catch (CancellationException e4) {
                            e = e4;
                            j5 = j6;
                            z6 = z7;
                            int i1922 = com.google.android.gms.internal.play_billing.zzc.a;
                            zzjs zzjsVar1322 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                            BillingResult billingResult1422 = m.k;
                            t(zzjsVar1322, billingResult1422, zzdc.zza(e), j5, z6);
                            Q(billingResult1422);
                            return billingResult1422;
                        } catch (TimeoutException e5) {
                            e = e5;
                            j5 = j6;
                            z6 = z7;
                            int i19222 = com.google.android.gms.internal.play_billing.zzc.a;
                            zzjs zzjsVar13222 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                            BillingResult billingResult14222 = m.k;
                            t(zzjsVar13222, billingResult14222, zzdc.zza(e), j5, z6);
                            Q(billingResult14222);
                            return billingResult14222;
                        } catch (Exception e6) {
                            e = e6;
                            j4 = j6;
                            z5 = z7;
                            int i202 = com.google.android.gms.internal.play_billing.zzc.a;
                            zzjs zzjsVar142 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                            BillingResult billingResult152 = m.j;
                            t(zzjsVar142, billingResult152, zzdc.zza(e), j4, z5);
                            Q(billingResult152);
                            return billingResult152;
                        }
                        zzjsVar2 = zzjsVar15;
                        z7 = z16;
                        j6 = j9;
                        str3 = null;
                    } catch (CancellationException e7) {
                        e = e7;
                    } catch (TimeoutException e8) {
                        e = e8;
                        j5 = j3;
                        z6 = z4;
                    } catch (Exception e9) {
                        e = e9;
                    }
                } else {
                    a = m.i;
                }
                j = nextLong;
                z2 = z;
                str2 = productId;
                productDetailsParams = productDetailsParams3;
                billingResult2 = a;
                if (billingResult2 != m.i) {
                }
            }
        }
        str = null;
        if (!this.n) {
        }
        if (zzj.size() <= 1) {
        }
        if (zzk.isEmpty()) {
        }
        it = zzk.iterator();
        while (it.hasNext()) {
        }
        if (billingFlowParams.e.isEmpty()) {
        }
        j = nextLong;
        z2 = z;
        str2 = productId;
        productDetailsParams = productDetailsParams3;
        billingResult2 = a;
        if (billingResult2 != m.i) {
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void launchExternalLink(final Activity activity, final LaunchExternalLinkParams launchExternalLinkParams, final LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        if (activity == null) {
            a70.p("Please provide a valid activity.");
            return;
        }
        try {
            j(new Callable() { // from class: com.android.billingclient.api.zzau
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.android.gms.internal.play_billing.zzar zzarVar;
                    a aVar = a.this;
                    LaunchExternalLinkResponseListener launchExternalLinkResponseListener2 = launchExternalLinkResponseListener;
                    LaunchExternalLinkParams launchExternalLinkParams2 = launchExternalLinkParams;
                    Activity activity2 = activity;
                    try {
                        if (!aVar.O(yfa.h)) {
                            aVar.D(launchExternalLinkResponseListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                            return null;
                        }
                        if (!aVar.D) {
                            int i = com.google.android.gms.internal.play_billing.zzc.a;
                            aVar.D(launchExternalLinkResponseListener2, m.H, zzjs.LAUNCH_EXTERNAL_LINK_NOT_SUPPORTED, null);
                            return null;
                        }
                        synchronized (aVar.a) {
                            zzarVar = aVar.i;
                        }
                        if (zzarVar == null) {
                            aVar.D(launchExternalLinkResponseListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                            return null;
                        }
                        String packageName = aVar.g.getPackageName();
                        String str = aVar.d;
                        long longValue = aVar.M.longValue();
                        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                        Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.zzc.b(bundle, str, longValue);
                        zzij p = zzim.p();
                        zzjd p2 = zzjf.p();
                        p2.g(launchExternalLinkParams2.getLinkUri().toString());
                        p.g((zzjf) p2.c(), "externalOfferUri");
                        zzjd p3 = zzjf.p();
                        p3.g(String.valueOf(launchExternalLinkParams2.getLaunchMode()));
                        p.g((zzjf) p3.c(), "externalOfferLaunchMode");
                        zzjd p4 = zzjf.p();
                        p4.g(String.valueOf(launchExternalLinkParams2.getLinkType()));
                        p.g((zzjf) p4.c(), "externalOfferLinkType");
                        zzjd p5 = zzjf.p();
                        p5.g(String.valueOf(launchExternalLinkParams2.getBillingProgram()));
                        p.g((zzjf) p5.c(), "externalOfferBillingProgram");
                        if (!TextUtils.isEmpty(launchExternalLinkParams2.getExternalTransactionToken())) {
                            zzjd p6 = zzjf.p();
                            p6.g(launchExternalLinkParams2.getExternalTransactionToken());
                            p.g((zzjf) p6.c(), "externalTransactionToken");
                        }
                        bundle.putByteArray("REQUEST_PARAMS", ((zzim) p.c()).b());
                        zzarVar.V(27, packageName, bundle, new g(aVar, new WeakReference(activity2), launchExternalLinkResponseListener2));
                        return null;
                    } catch (RuntimeException e) {
                        aVar.D(launchExternalLinkResponseListener2, m.h, zzjs.SERVICE_CALL_EXCEPTION, e);
                        return null;
                    }
                }
            }, new Runnable() { // from class: com.android.billingclient.api.zzaw
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.D(launchExternalLinkResponseListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, c());
        } catch (Exception e) {
            D(launchExternalLinkResponseListener, f(), zzjs.SERVICE_CALL_EXCEPTION, e);
        }
    }

    public final zzek n(BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 9, billingResult, zzdc.zza(exc));
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        return new zzek(billingResult, null);
    }

    public final void o(int i, BillingResult billingResult, zzjs zzjsVar) {
        zzjp zzjpVar = null;
        zzjl zzjlVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i2 = zzdc.zza;
            try {
                zzjn q = zzjp.q();
                q.e();
                zzjp.p((zzjp) q.b, 5);
                zzkk p = zzkn.p();
                p.e();
                zzkn.q((zzkn) p.b, i);
                zzkn zzknVar = (zzkn) p.c();
                q.e();
                zzjp.t((zzjp) q.b, zzknVar);
                zzjpVar = (zzjp) q.c();
            } catch (Exception unused) {
                int i3 = com.google.android.gms.internal.play_billing.zzc.a;
            }
            I(zzjpVar);
            return;
        }
        int i4 = zzdc.zza;
        try {
            zzjj s = zzjl.s();
            zzjq q2 = zzju.q();
            q2.h(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            q2.e();
            zzju.s((zzju) q2.b, debugMessage);
            q2.g(zzjsVar);
            s.g(q2);
            s.i(5);
            zzkk p2 = zzkn.p();
            p2.e();
            zzkn.q((zzkn) p2.b, i);
            zzkn zzknVar2 = (zzkn) p2.c();
            s.e();
            zzjl.x((zzjl) s.b, zzknVar2);
            zzjlVar = (zzjl) s.c();
        } catch (Exception unused2) {
            int i5 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        H(zzjlVar);
    }

    public final void p(int i, BillingResult billingResult, zzjs zzjsVar) {
        try {
            int i2 = zzdc.zza;
            H(zzdc.zzb(zzjsVar, i, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void q(zzjs zzjsVar, BillingResult billingResult, long j) {
        try {
            int i = zzdc.zza;
            try {
                this.h.t(zzdc.zzb(zzjsVar, 2, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED), this.m, j);
            } catch (Throwable unused) {
                int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            }
        } catch (Throwable unused2) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (b(new Callable() { // from class: com.android.billingclient.api.zzbh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                axn axnVar;
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                QueryProductDetailsParams queryProductDetailsParams2 = queryProductDetailsParams;
                Exception exc = null;
                if (!aVar.O(yfa.h)) {
                    zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
                    BillingResult billingResult = m.j;
                    aVar.p(7, billingResult, zzjsVar);
                    dqn dqnVar = zzca.b;
                    com.google.android.gms.internal.play_billing.a aVar2 = com.google.android.gms.internal.play_billing.a.e;
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(aVar2, aVar2));
                    return null;
                }
                if (!aVar.u) {
                    int i = com.google.android.gms.internal.play_billing.zzc.a;
                    zzjs zzjsVar2 = zzjs.PRODUCT_DETAILS_NOT_SUPPORTED;
                    BillingResult billingResult2 = m.s;
                    aVar.p(7, billingResult2, zzjsVar2);
                    dqn dqnVar2 = zzca.b;
                    com.google.android.gms.internal.play_billing.a aVar3 = com.google.android.gms.internal.play_billing.a.e;
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(aVar3, aVar3));
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String zzb = queryProductDetailsParams2.zzb();
                zzca zza = queryProductDetailsParams2.zza();
                int size = zza.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        axnVar = new axn(0, "", arrayList, arrayList2);
                        break;
                    }
                    int i3 = i2 + 20;
                    ArrayList arrayList3 = new ArrayList(zza.subList(i2, i3 > size ? size : i3));
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i4)).zza());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                    bundle.putString("playBillingLibraryVersion", aVar.c);
                    try {
                        synchronized (aVar.a) {
                            zzarVar = aVar.i;
                        }
                        if (zzarVar == null) {
                            axnVar = aVar.d(m.j, zzjs.SERVICE_RESET_TO_NULL, exc);
                            break;
                        }
                        boolean z = aVar.w && aVar.G.a;
                        aVar.h();
                        aVar.h();
                        aVar.h();
                        aVar.h();
                        Bundle k4 = zzarVar.k4(true != aVar.x ? 17 : 20, aVar.g.getPackageName(), zzb, bundle, com.google.android.gms.internal.play_billing.zzc.d(aVar.d, arrayList3, new com.google.android.gms.internal.play_billing.zza(z), aVar.M.longValue()));
                        if (k4 == null) {
                            axnVar = aVar.d(m.B, zzjs.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, null);
                            break;
                        }
                        if (k4.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = k4.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                axnVar = aVar.d(m.B, zzjs.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, null);
                                break;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            int size3 = stringArrayList.size();
                            int i5 = 0;
                            while (i5 < size3) {
                                try {
                                    ProductDetails productDetails = new ProductDetails(stringArrayList.get(i5));
                                    com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                    arrayList5.add(productDetails);
                                    i5++;
                                    zza = zza;
                                } catch (JSONException e) {
                                    axnVar = aVar.d(m.a(6, "Error trying to decode SkuDetails."), zzjs.ERROR_DECODING_SKU_DETAILS, e);
                                }
                            }
                            zzca zzcaVar = zza;
                            ArrayList<String> stringArrayList2 = k4.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                            new ArrayList();
                            try {
                                ArrayList arrayList6 = new ArrayList();
                                if (stringArrayList2 == null) {
                                    Iterator it = arrayList3.iterator();
                                    while (it.hasNext()) {
                                        QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) it.next();
                                        Iterator it2 = arrayList5.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                arrayList6.add(new UnfetchedProduct(new JSONObject().put(InAppPurchaseMetaData.KEY_PRODUCT_ID, product.zza()).put("type", product.zzb()).put("statusCode", 0).toString()));
                                                break;
                                            }
                                            ProductDetails productDetails2 = (ProductDetails) it2.next();
                                            if (!product.zza().equals(productDetails2.getProductId()) || !product.zzb().equals(productDetails2.getProductType())) {
                                            }
                                        }
                                    }
                                } else {
                                    Iterator<String> it3 = stringArrayList2.iterator();
                                    while (it3.hasNext()) {
                                        UnfetchedProduct unfetchedProduct = new UnfetchedProduct(it3.next());
                                        com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                                        arrayList6.add(unfetchedProduct);
                                    }
                                }
                                arrayList.addAll(arrayList5);
                                arrayList2.addAll(arrayList6);
                                i2 = i3;
                                zza = zzcaVar;
                                exc = null;
                            } catch (JSONException e2) {
                                axnVar = aVar.d(m.a(6, "Error trying to decode SkuDetails."), zzjs.ERROR_DECODING_SKU_DETAILS, e2);
                            }
                        } else {
                            int a = com.google.android.gms.internal.play_billing.zzc.a(k4, "BillingClient");
                            String g = com.google.android.gms.internal.play_billing.zzc.g(k4, "BillingClient");
                            if (a != 0) {
                                BillingResult a2 = m.a(a, g);
                                zzjs zzjsVar3 = zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                                ljg.j(a, "getSkuDetails() failed for queryProductDetailsAsync. Response code: ");
                                axnVar = aVar.d(a2, zzjsVar3, null);
                            } else {
                                axnVar = aVar.d(m.a(6, g), zzjs.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, null);
                            }
                        }
                    } catch (DeadObjectException e3) {
                        axnVar = aVar.d(m.j, zzjs.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, e3);
                    } catch (Exception e4) {
                        axnVar = aVar.d(m.h, zzjs.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, e4);
                    }
                }
                productDetailsResponseListener2.onProductDetailsResponse(m.a(axnVar.a, (String) axnVar.d), new QueryProductDetailsResult((ArrayList) axnVar.b, (ArrayList) axnVar.c));
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzbi
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                BillingResult billingResult = m.k;
                aVar.p(7, billingResult, zzjs.EXECUTE_ASYNC_TIMEOUT);
                dqn dqnVar = zzca.b;
                com.google.android.gms.internal.play_billing.a aVar2 = com.google.android.gms.internal.play_billing.a.e;
                productDetailsResponseListener2.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(aVar2, aVar2));
            }
        }, c(), a()) == null) {
            BillingResult f = f();
            p(7, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            dqn dqnVar = zzca.b;
            com.google.android.gms.internal.play_billing.a aVar = com.google.android.gms.internal.play_billing.a.e;
            productDetailsResponseListener.onProductDetailsResponse(f, new QueryProductDetailsResult(aVar, aVar));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, final PurchasesResponseListener purchasesResponseListener) {
        if (b(new lon(this, purchasesResponseListener, queryPurchasesParams.zza(), queryPurchasesParams.getIncludeSuspendedSubscriptions()), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzac
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                PurchasesResponseListener purchasesResponseListener2 = purchasesResponseListener;
                BillingResult billingResult = m.k;
                aVar.p(9, billingResult, zzjs.EXECUTE_ASYNC_TIMEOUT);
                dqn dqnVar = zzca.b;
                purchasesResponseListener2.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.a.e);
            }
        }, c(), a()) == null) {
            BillingResult f = f();
            p(9, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            dqn dqnVar = zzca.b;
            purchasesResponseListener.onQueryPurchasesResponse(f, com.google.android.gms.internal.play_billing.a.e);
        }
    }

    public final void r(zzjs zzjsVar, int i, BillingResult billingResult, String str) {
        try {
            int i2 = zzdc.zza;
            H(zzdc.zzb(zzjsVar, i, billingResult, str, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void s(zzjs zzjsVar, BillingResult billingResult, long j, boolean z) {
        try {
            int i = zzdc.zza;
            try {
                this.h.x(zzdc.zzb(zzjsVar, 2, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED), this.m, j, z);
            } catch (Throwable unused) {
                int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            }
        } catch (Throwable unused2) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            a70.p("Please provide a valid activity.");
            return null;
        }
        if (!N(yfa.g)) {
            BillingResult billingResult = m.j;
            p(16, billingResult, zzjs.SERVICE_CONNECTION_NOT_READY);
            return billingResult;
        }
        if (!this.y) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            BillingResult billingResult2 = m.D;
            p(16, billingResult2, zzjs.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED);
            return billingResult2;
        }
        Handler handler = this.e;
        final zzbr zzbrVar = new zzbr(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (b(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = zzbrVar;
                aVar.getClass();
                try {
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.E(alternativeBillingOnlyInformationDialogListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    zzarVar.p1(21, aVar.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.e(aVar.M.longValue(), aVar.d), new d(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e) {
                    aVar.E(alternativeBillingOnlyInformationDialogListener2, m.j, zzjs.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.E(alternativeBillingOnlyInformationDialogListener2, m.h, zzjs.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                a.this.E(alternativeBillingOnlyInformationDialogListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, a()) != null) {
            return m.i;
        }
        BillingResult f = f();
        p(16, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
        return f;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void showBillingProgramInformationDialog(final Activity activity, final BillingProgramInformationDialogParams billingProgramInformationDialogParams, final BillingProgramInformationDialogListener billingProgramInformationDialogListener) {
        if (activity == null) {
            a70.p("Please provide a valid activity.");
            return;
        }
        try {
            j(new Callable() { // from class: com.android.billingclient.api.zzam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.android.gms.internal.play_billing.zzar zzarVar;
                    a aVar = a.this;
                    BillingProgramInformationDialogListener billingProgramInformationDialogListener2 = billingProgramInformationDialogListener;
                    BillingProgramInformationDialogParams billingProgramInformationDialogParams2 = billingProgramInformationDialogParams;
                    Activity activity2 = activity;
                    aVar.getClass();
                    try {
                        if (!aVar.O(yfa.h)) {
                            aVar.F(billingProgramInformationDialogListener2, m.j, zzjs.SERVICE_CONNECTION_NOT_READY, null);
                            return null;
                        }
                        if (!aVar.F) {
                            int i = com.google.android.gms.internal.play_billing.zzc.a;
                            aVar.F(billingProgramInformationDialogListener2, m.J, zzjs.FEATURE_NOT_SUPPORTED, null);
                            return null;
                        }
                        synchronized (aVar.a) {
                            zzarVar = aVar.i;
                        }
                        if (zzarVar == null) {
                            aVar.F(billingProgramInformationDialogListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                            return null;
                        }
                        String packageName = aVar.g.getPackageName();
                        String str = aVar.d;
                        long longValue = aVar.M.longValue();
                        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                        Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.zzc.b(bundle, str, longValue);
                        zzij p = zzim.p();
                        zzjd p2 = zzjf.p();
                        p2.g(String.valueOf(billingProgramInformationDialogParams2.getBillingProgram()));
                        p.g((zzjf) p2.c(), "developerBillingProgram");
                        if (billingProgramInformationDialogParams2.getExternalTransactionToken() != null) {
                            zzjd p3 = zzjf.p();
                            p3.g(billingProgramInformationDialogParams2.getExternalTransactionToken());
                            p.g((zzjf) p3.c(), "externalTransactionToken");
                        }
                        bundle.putByteArray("REQUEST_PARAMS", ((zzim) p.c()).b());
                        zzarVar.p1(28, packageName, bundle, new j(new WeakReference(activity2), new zzbn(aVar, aVar.e, billingProgramInformationDialogListener2)));
                        return null;
                    } catch (DeadObjectException e) {
                        aVar.F(billingProgramInformationDialogListener2, m.j, zzjs.SERVICE_CALL_EXCEPTION, e);
                        return null;
                    } catch (RuntimeException e2) {
                        aVar.F(billingProgramInformationDialogListener2, m.h, zzjs.SERVICE_CALL_EXCEPTION, e2);
                        return null;
                    }
                }
            }, new Runnable() { // from class: com.android.billingclient.api.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.F(billingProgramInformationDialogListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, c());
        } catch (Exception e) {
            F(billingProgramInformationDialogListener, f(), zzjs.SERVICE_CALL_EXCEPTION, e);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            a70.p("Please provide a valid activity.");
            return null;
        }
        if (!N(yfa.g)) {
            BillingResult billingResult = m.j;
            p(25, billingResult, zzjs.SERVICE_CONNECTION_NOT_READY);
            return billingResult;
        }
        if (!this.z) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            BillingResult billingResult2 = m.u;
            p(25, billingResult2, zzjs.EXTERNAL_OFFER_NOT_SUPPORTED);
            return billingResult2;
        }
        Handler handler = this.e;
        final zzbs zzbsVar = new zzbs(this, handler, externalOfferInformationDialogListener);
        if (b(new Callable() { // from class: com.android.billingclient.api.zzbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = zzbsVar;
                aVar.getClass();
                try {
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.C(externalOfferInformationDialogListener2, m.j, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    zzarVar.V(22, aVar.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.e(aVar.M.longValue(), aVar.d), new f(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e) {
                    aVar.C(externalOfferInformationDialogListener2, m.j, zzjs.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.C(externalOfferInformationDialogListener2, m.h, zzjs.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                a.this.C(externalOfferInformationDialogListener, m.k, zzjs.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, a()) != null) {
            return m.i;
        }
        BillingResult f = f();
        p(25, f, zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC);
        return f;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!N(yfa.g)) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            return m.j;
        }
        if (!this.q) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            return m.t;
        }
        View findViewById = activity.findViewById(R.id.content);
        IBinder windowToken = findViewById.getWindowToken();
        if (windowToken == null) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.c);
        String str = this.d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.a);
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        Handler handler = this.e;
        final zzbq zzbqVar = new zzbq(this, handler, inAppMessageResponseListener);
        b(new Callable() { // from class: com.android.billingclient.api.zzbl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzar zzarVar;
                a aVar = a.this;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = zzbqVar;
                aVar.getClass();
                try {
                    synchronized (aVar.a) {
                        zzarVar = aVar.i;
                    }
                    if (zzarVar == null) {
                        aVar.G(-1, zzjs.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    zzarVar.b2(aVar.g.getPackageName(), bundle2, new i(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e) {
                    aVar.G(-1, zzjs.SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    aVar.G(6, zzjs.SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, 5000L, null, handler, a());
        return m.i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        L(billingClientStateListener, 0);
    }

    public final void t(zzjs zzjsVar, BillingResult billingResult, String str, long j, boolean z) {
        try {
            int i = zzdc.zza;
            try {
                this.h.x(zzdc.zzb(zzjsVar, 2, billingResult, str, zzjz.BROADCAST_ACTION_UNSPECIFIED), this.m, j, z);
            } catch (Throwable unused) {
                int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            }
        } catch (Throwable unused2) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void u(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 14, billingResult, zzdc.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final void v(BillingChoiceInfoResponseListener billingChoiceInfoResponseListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        r(zzjsVar, 40, billingResult, zzdc.zza(exc));
        billingChoiceInfoResponseListener.onBillingChoiceInfoResponse(billingResult, null);
    }

    public final void w(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 33, billingResult, zzdc.zza(exc));
        billingProgramAvailabilityListener.onBillingProgramAvailabilityResponse(billingResult, new BillingProgramAvailabilityDetails(i));
    }

    public final void x(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        r(zzjsVar, 4, billingResult, zzdc.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    public final void y(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 15, billingResult, zzdc.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final void z(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingResult billingResult, zzjs zzjsVar, Exception exc) {
        r(zzjsVar, 35, billingResult, zzdc.zza(exc));
        billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(billingResult, null);
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, BillingClient.Builder builder) {
        int i = zzcf.c;
        this.J = com.google.android.gms.internal.play_billing.b.j;
        long nextLong = new Random().nextLong();
        this.M = Long.valueOf(nextLong);
        this.N = com.google.android.gms.internal.play_billing.zzbf.a;
        this.c = p62.a;
        String i2 = i();
        this.d = i2;
        this.g = context.getApplicationContext();
        zzke z = zzkg.z();
        z.l();
        if (i2 != null) {
            z.e();
            zzkg.y((zzkg) z.b, i2);
        }
        z.k(this.g.getPackageName());
        z.e();
        zzkg.D((zzkg) z.b, nextLong);
        boolean z2 = builder.l;
        z.e();
        zzkg.w((zzkg) z.b, z2);
        z.g(Build.VERSION.SDK_INT);
        z.j();
        m(z, context);
        try {
            z.h(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        c0l c0lVar = new c0l(this.g, (zzkg) z.c());
        this.h = c0lVar;
        int i4 = com.google.android.gms.internal.play_billing.zzc.a;
        this.f = new u53(this.g, null, null, null, c0lVar);
        this.G = pendingPurchasesParams;
        this.g.getPackageName();
        this.H = builder.l;
    }

    public a(Context context, BillingClient.Builder builder) {
        int i = zzcf.c;
        this.J = com.google.android.gms.internal.play_billing.b.j;
        long nextLong = new Random().nextLong();
        this.M = Long.valueOf(nextLong);
        this.N = com.google.android.gms.internal.play_billing.zzbf.a;
        this.c = p62.a;
        String i2 = i();
        this.d = i2;
        this.g = context.getApplicationContext();
        zzke z = zzkg.z();
        z.l();
        if (i2 != null) {
            z.e();
            zzkg.y((zzkg) z.b, i2);
        }
        z.k(this.g.getPackageName());
        z.e();
        zzkg.D((zzkg) z.b, nextLong);
        boolean z2 = builder.l;
        z.e();
        zzkg.w((zzkg) z.b, z2);
        z.g(Build.VERSION.SDK_INT);
        z.j();
        m(z, context);
        try {
            z.h(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        this.h = new c0l(this.g, (zzkg) z.c());
        this.g.getPackageName();
        this.H = builder.l;
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, BillingClient.Builder builder) {
        int i = zzcf.c;
        this.J = com.google.android.gms.internal.play_billing.b.j;
        long nextLong = new Random().nextLong();
        this.M = Long.valueOf(nextLong);
        this.N = com.google.android.gms.internal.play_billing.zzbf.a;
        this.c = p62.a;
        String i2 = i();
        this.d = i2;
        this.g = context.getApplicationContext();
        zzke z = zzkg.z();
        z.l();
        if (i2 != null) {
            z.e();
            zzkg.y((zzkg) z.b, i2);
        }
        z.k(this.g.getPackageName());
        z.e();
        zzkg.D((zzkg) z.b, nextLong);
        boolean z2 = builder.l;
        z.e();
        zzkg.w((zzkg) z.b, z2);
        z.g(Build.VERSION.SDK_INT);
        z.j();
        m(z, context);
        try {
            z.h(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        c0l c0lVar = new c0l(this.g, (zzkg) z.c());
        this.h = c0lVar;
        if (purchasesUpdatedListener == null) {
            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        this.f = new u53(this.g, purchasesUpdatedListener, userChoiceBillingListener, developerProvidedBillingListener, c0lVar);
        this.G = pendingPurchasesParams;
        this.I = userChoiceBillingListener != null;
        this.H = builder.l;
    }
}
