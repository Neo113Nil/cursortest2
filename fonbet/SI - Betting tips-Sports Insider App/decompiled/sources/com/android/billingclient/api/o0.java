package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.b2;
import com.google.android.gms.internal.play_billing.c2;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.f2;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.r5;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.s5;
import com.google.android.gms.internal.play_billing.t5;
import com.google.android.gms.internal.play_billing.u1;
import com.google.android.gms.internal.play_billing.u5;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.v5;
import com.google.android.gms.internal.play_billing.z1;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 extends d {
    public final Context G;
    public volatile int H;
    public volatile com.google.android.gms.internal.play_billing.i I;
    public volatile n0 J;
    public volatile b2 K;

    public o0(m3.f fVar, Context context) {
        super(fVar, context);
        this.H = 0;
        this.G = context;
    }

    public final /* synthetic */ void N(a aVar, e eVar) {
        super.d(aVar, eVar);
    }

    public final /* synthetic */ void O(a aVar, e eVar) {
        super.e(aVar, eVar);
    }

    public final /* synthetic */ void P(y yVar, r rVar) {
        super.c(yVar, rVar);
    }

    public final /* synthetic */ void Q(l1.a aVar, e eVar) {
        super.h(aVar, eVar);
    }

    public final synchronized boolean R() {
        if (this.H == 2 && this.I != null) {
            if (this.J != null) {
                return true;
            }
        }
        return false;
    }

    public final z1 S(int i5) {
        if (!R()) {
            p1.g("BillingClientTesting", "Billing Override Service is not ready.");
            T(106, 28, t0.a(-1, "Billing Override Service connection is disconnected."));
            return new v1();
        }
        l0 l0Var = new l0(i5, 0, this);
        s5 s5Var = new s5();
        s5Var.f5585c = new v5();
        u5 u5Var = new u5(s5Var);
        s5Var.f5584b = u5Var;
        s5Var.f5583a = l0.class;
        try {
            l0Var.o(s5Var);
            s5Var.f5583a = "billingOverrideService.getBillingOverride";
            return u5Var;
        } catch (Exception e7) {
            p3 p3Var = new p3(e7);
            d3 d3Var = r5.f5561f;
            t5 t5Var = u5Var.f5601b;
            if (d3Var.w(t5Var, null, p3Var)) {
                r5.d(t5Var);
            }
            return u5Var;
        }
    }

    public final void T(int i5, int i10, k kVar) {
        q4 b10 = r0.b(i5, i10, kVar);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.f3987g.O(b10);
    }

    public final void U(int i5, Consumer consumer, Runnable runnable) {
        b2 b2Var;
        z1 S = S(i5);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.K == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.K = newSingleThreadScheduledExecutor instanceof b2 ? (b2) newSingleThreadScheduledExecutor : new f2(newSingleThreadScheduledExecutor);
                }
                b2Var = this.K;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!S.isDone()) {
            i2 i2Var = new i2();
            i2Var.f5482h = S;
            g2 g2Var = new g2();
            g2Var.f5460a = i2Var;
            i2Var.f5483i = ((f2) b2Var).schedule(g2Var, 28500L, timeUnit);
            S.b(g2Var, s1.f5570a);
            S = i2Var;
        }
        b6.p pVar = new b6.p();
        pVar.f3078a = i5;
        pVar.f3079b = consumer;
        pVar.f3080c = runnable;
        pVar.f3081d = this;
        S.b(new u1(S, pVar), M());
    }

    @Override // com.android.billingclient.api.d, com.android.billingclient.api.c
    public final void a() {
        synchronized (this) {
            s4 d10 = r0.d(27);
            Objects.requireNonNull(d10, "ApiSuccess should not be null");
            this.f3987g.Q(d10);
            try {
                try {
                    if (this.J != null && this.I != null) {
                        p1.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.G.unbindService(this.J);
                        this.J = new n0(0, this);
                    }
                    this.I = null;
                    if (this.K != null) {
                        ((c2) this.K).shutdownNow();
                        this.K = null;
                    }
                } catch (RuntimeException e7) {
                    p1.h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e7);
                }
                this.H = 3;
            } catch (Throwable th2) {
                this.H = 3;
                throw th2;
            }
        }
        super.a();
    }

    @Override // com.android.billingclient.api.d, com.android.billingclient.api.c
    public final void c(y yVar, r rVar) {
        U(7, new j0(0, rVar), new b6.i(this, yVar, rVar, 2));
    }

    @Override // com.android.billingclient.api.d
    public final void d(a aVar, e eVar) {
        U(3, new j0(2, eVar), new b6.i(this, aVar, eVar, 5));
    }

    @Override // com.android.billingclient.api.d
    public final void e(final a aVar, final e eVar) {
        U(4, new Consumer() { // from class: com.android.billingclient.api.k0
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                String str = aVar.f3966b;
                eVar.c((k) obj, str);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new b6.i(this, aVar, eVar, 3));
    }

    @Override // com.android.billingclient.api.d
    public final k g(Activity activity, i iVar) {
        int i5 = 0;
        try {
            i5 = ((Integer) S(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e7) {
            T(114, 28, t0.F);
            p1.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e7);
        } catch (Exception e9) {
            if (e9 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            T(107, 28, t0.F);
            p1.h("BillingClientTesting", "An error occurred while retrieving billing override.", e9);
        }
        if (i5 > 0) {
            k a7 = t0.a(i5, "Billing override value was set by a license tester.");
            T(105, 2, a7);
            L(a7);
            return a7;
        }
        try {
            return super.g(activity, iVar);
        } catch (Exception e10) {
            k kVar = t0.j;
            T(115, 2, kVar);
            p1.h("BillingClientTesting", "An internal error occurred.", e10);
            return kVar;
        }
    }

    @Override // com.android.billingclient.api.d
    public final void h(l1.a aVar, e eVar) {
        U(8, new j0(1, eVar), new b6.i(this, aVar, eVar, 4));
    }

    @Override // com.android.billingclient.api.d
    public final void j(f fVar) {
        synchronized (this) {
            if (R()) {
                p1.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                s4 d10 = r0.d(26);
                Objects.requireNonNull(d10, "ApiSuccess should not be null");
                this.f3987g.Q(d10);
            } else {
                int i5 = 1;
                if (this.H == 1) {
                    p1.g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.H == 3) {
                    p1.g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    T(38, 26, t0.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.H = 1;
                    p1.f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.J = new n0(0, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.G.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i5 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                p1.g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.G.bindService(intent2, this.J, 1)) {
                                    p1.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    p1.g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i5 = 39;
                        }
                    }
                    this.H = 0;
                    p1.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    T(i5, 26, t0.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.j(fVar);
    }

    public o0(m3.f fVar, Context context, x xVar) {
        super(fVar, context, xVar);
        this.H = 0;
        this.G = context;
    }
}
