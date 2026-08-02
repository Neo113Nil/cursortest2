package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxi;
import com.google.android.gms.internal.ads.zzhaa;
import com.google.android.gms.internal.ads.zzhdz;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class klo extends nlo {
    public static final nsa o = new nsa(4, klo.class);
    public zzgxi l;
    public final boolean m;
    public final boolean n;

    public klo(zzgxi zzgxiVar, boolean z, boolean z2) {
        int size = zzgxiVar.size();
        this.h = null;
        this.i = size;
        this.l = zzgxiVar;
        this.m = z;
        this.n = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void f() {
        zzgxi zzgxiVar = this.l;
        r(1);
        if ((zzgxiVar != null) && isCancelled()) {
            boolean l = l();
            zzhaa it = zzgxiVar.iterator();
            while (it.hasNext()) {
                ((ddb) it.next()).cancel(l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String g() {
        zzgxi zzgxiVar = this.l;
        return zzgxiVar != null ? "futures=".concat(zzgxiVar.toString()) : super.g();
    }

    public abstract void r(int i);

    public final void s(int i, ddb ddbVar) {
        try {
            if (ddbVar.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                try {
                    w(i, zzhdz.a(ddbVar));
                } catch (ExecutionException e) {
                    t(e.getCause());
                } catch (Throwable th) {
                    t(th);
                }
            }
        } finally {
            u(null);
        }
    }

    public final void t(Throwable th) {
        th.getClass();
        if (this.m && !e(th)) {
            Set set = this.h;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!isCancelled()) {
                    Throwable b = b();
                    Objects.requireNonNull(b);
                    while (b != null && newSetFromMap.add(b)) {
                        b = b.getCause();
                    }
                }
                nlo.j.V(this, newSetFromMap);
                Set set2 = this.h;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            o.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        if (th instanceof Error) {
            o.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", "Input Future failed with Error", th);
        }
    }

    public final void u(zzgxi zzgxiVar) {
        int W = nlo.j.W(this);
        int i = 0;
        zzguk.g("Less than 0 remaining futures", W >= 0);
        if (W == 0) {
            if (zzgxiVar != null) {
                zzhaa it = zzgxiVar.iterator();
                while (it.hasNext()) {
                    ddb ddbVar = (ddb) it.next();
                    if (!ddbVar.isCancelled()) {
                        try {
                            w(i, zzhdz.a(ddbVar));
                        } catch (ExecutionException e) {
                            t(e.getCause());
                        } catch (Throwable th) {
                            t(th);
                        }
                    }
                    i++;
                }
            }
            this.h = null;
            x();
            r(2);
        }
    }

    public final void v() {
        klo kloVar;
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            x();
            return;
        }
        zzgxi zzgxiVar = this.l;
        slo sloVar = slo.a;
        if (!this.m) {
            zzgxi zzgxiVar2 = true != this.n ? null : zzgxiVar;
            bnn bnnVar = new bnn(23, this, zzgxiVar2);
            zzhaa it = zzgxiVar.iterator();
            while (it.hasNext()) {
                ddb ddbVar = (ddb) it.next();
                if (ddbVar.isDone()) {
                    u(zzgxiVar2);
                } else {
                    ddbVar.addListener(bnnVar, sloVar);
                }
            }
            return;
        }
        zzhaa it2 = zzgxiVar.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return;
            }
            ddb ddbVar2 = (ddb) it2.next();
            i = i2 + 1;
            if (ddbVar2.isDone()) {
                this.s(i2, ddbVar2);
                kloVar = this;
            } else {
                kloVar = this;
                ddbVar2.addListener(new tc0((Object) kloVar, i2, (Object) ddbVar2, 9, false), sloVar);
            }
            this = kloVar;
        }
    }

    public abstract void w(int i, Object obj);

    public abstract void x();
}
