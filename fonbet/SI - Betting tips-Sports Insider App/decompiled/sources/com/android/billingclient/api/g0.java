package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.m5;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.w4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final f f4020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4021b;

    public /* synthetic */ g0(d dVar, f fVar) {
        this.f4021b = dVar;
        this.f4020a = fVar;
    }

    public final void a(k kVar) {
        synchronized (this.f4021b.f3981a) {
            try {
                if (this.f4021b.f3982b == 3) {
                    return;
                }
                this.f4020a.onBillingSetupFinished(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        p1.g("BillingClient", "Billing service died.");
        try {
            if (d.D(this.f4021b)) {
                l1.a aVar = this.f4021b.f3987g;
                p4 r5 = q4.r();
                r5.g(6);
                t4 r6 = u4.r();
                r6.g(122);
                r5.f(r6);
                aVar.O((q4) r5.b());
            } else {
                this.f4021b.f3987g.R(w4.n());
            }
        } catch (Throwable th2) {
            p1.h("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f4021b.f3981a) {
            if (this.f4021b.f3982b != 3 && this.f4021b.f3982b != 0) {
                this.f4021b.t(0);
                this.f4021b.v();
                this.f4020a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.d bVar;
        p1.f("BillingClient", "Billing service connected.");
        synchronized (this.f4021b.f3981a) {
            try {
                if (this.f4021b.f3982b == 3) {
                    return;
                }
                d dVar = this.f4021b;
                int i5 = com.google.android.gms.internal.play_billing.c.f5406f;
                if (iBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    bVar = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.d ? (com.google.android.gms.internal.play_billing.d) queryLocalInterface : new com.google.android.gms.internal.play_billing.b(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                }
                dVar.f3988h = bVar;
                d dVar2 = this.f4021b;
                if (d.k(new f0(0, this), 30000L, new androidx.core.widget.b(4, this), dVar2.E(), dVar2.o()) == null) {
                    d dVar3 = this.f4021b;
                    k l6 = dVar3.l();
                    dVar3.I(25, 6, l6);
                    a(l6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        p1.g("BillingClient", "Billing service disconnected.");
        try {
            if (d.D(this.f4021b)) {
                l1.a aVar = this.f4021b.f3987g;
                p4 r5 = q4.r();
                r5.g(6);
                t4 r6 = u4.r();
                r6.g(121);
                r5.f(r6);
                aVar.O((q4) r5.b());
            } else {
                this.f4021b.f3987g.T(m5.n());
            }
        } catch (Throwable th2) {
            p1.h("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f4021b.f3981a) {
            try {
                if (this.f4021b.f3982b == 3) {
                    return;
                }
                this.f4021b.t(0);
                this.f4020a.onBillingServiceDisconnected();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
