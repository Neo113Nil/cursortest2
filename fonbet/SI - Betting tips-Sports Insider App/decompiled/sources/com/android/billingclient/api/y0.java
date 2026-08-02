package com.android.billingclient.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzr;
import j$.util.Objects;
import java.util.concurrent.Callable;
import s7.k1;
import s7.q1;
import s7.r3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4124c;

    public /* synthetic */ y0(d dVar, cc.b bVar) {
        this.f4122a = 0;
        this.f4123b = dVar;
        this.f4124c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.google.android.gms.internal.play_billing.d dVar;
        switch (this.f4122a) {
            case 0:
                d dVar2 = (d) this.f4123b;
                cc.b bVar = (cc.b) this.f4124c;
                try {
                    synchronized (dVar2.f3981a) {
                        dVar = dVar2.f3988h;
                    }
                    if (dVar == null) {
                        dVar2.G(bVar, t0.f4090l, 119, null);
                    } else {
                        String packageName = dVar2.f3986f.getPackageName();
                        String str = dVar2.f3983c;
                        long longValue = dVar2.F.longValue();
                        Bundle bundle = new Bundle();
                        p1.b(bundle, str, longValue);
                        ((com.google.android.gms.internal.play_billing.b) dVar).e0(packageName, bundle, new h0(bVar, dVar2.f3987g, dVar2.f3991l));
                    }
                } catch (DeadObjectException e7) {
                    dVar2.G(bVar, t0.f4090l, 62, e7);
                } catch (Exception e9) {
                    dVar2.G(bVar, t0.j, 62, e9);
                }
                return null;
            case 1:
                k1 k1Var = (k1) this.f4124c;
                k1Var.f22848a.B();
                s7.j jVar = k1Var.f22848a.f22989c;
                r3.U(jVar);
                return jVar.e0((String) this.f4123b);
            case 2:
                k1 k1Var2 = (k1) this.f4124c;
                k1Var2.f22848a.B();
                return new zzao(k1Var2.f22848a.p0(((zzr) this.f4123b).f5820a));
            default:
                zzr zzrVar = (zzr) this.f4123b;
                String str2 = zzrVar.f5820a;
                g6.v.h(str2);
                r3 r3Var = (r3) this.f4124c;
                q1 d10 = r3Var.d(str2);
                s7.p1 p1Var = s7.p1.ANALYTICS_STORAGE;
                if (d10.i(p1Var) && q1.c(100, zzrVar.f5836s).i(p1Var)) {
                    return r3Var.c0(zzrVar).E();
                }
                r3Var.a().f22910n.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ y0(k1 k1Var, Object obj, int i5) {
        this.f4122a = i5;
        this.f4123b = obj;
        this.f4124c = k1Var;
    }

    public y0(r3 r3Var, zzr zzrVar) {
        this.f4122a = 3;
        this.f4123b = zzrVar;
        Objects.requireNonNull(r3Var);
        this.f4124c = r3Var;
    }
}
