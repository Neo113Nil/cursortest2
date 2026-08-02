package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class twd {
    public vwd a;
    public Long d;
    public int e;
    public volatile k1d b = new k1d(9);
    public k1d c = new k1d(9);
    public final HashSet f = new HashSet();

    public twd(vwd vwdVar) {
        this.a = vwdVar;
    }

    public final void a(zwd zwdVar) {
        if (d() && !zwdVar.i) {
            zwdVar.T();
        } else if (!d() && zwdVar.i) {
            zwdVar.i = false;
            sk3 sk3Var = zwdVar.j;
            if (sk3Var != null) {
                zwdVar.k.a(sk3Var);
                zwdVar.l.E("Subchannel unejected: {0}", 2, zwdVar);
            }
        }
        zwdVar.h = this;
        this.f.add(zwdVar);
    }

    public final void b(long j) {
        this.d = Long.valueOf(j);
        this.e++;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((zwd) it.next()).T();
        }
    }

    public final long c() {
        return ((AtomicLong) this.c.c).get() + ((AtomicLong) this.c.b).get();
    }

    public final boolean d() {
        return this.d != null;
    }

    public final void e() {
        z1a.D("not currently ejected", this.d != null);
        this.d = null;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            zwd zwdVar = (zwd) it.next();
            zwdVar.i = false;
            sk3 sk3Var = zwdVar.j;
            if (sk3Var != null) {
                zwdVar.k.a(sk3Var);
                zwdVar.l.E("Subchannel unejected: {0}", 2, zwdVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f + '}';
    }
}
