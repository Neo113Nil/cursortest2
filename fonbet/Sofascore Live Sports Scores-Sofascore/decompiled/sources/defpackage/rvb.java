package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rvb extends cml {
    public final boolean l;
    public final kij m;
    public final iij n;
    public nvb o;
    public lvb p;
    public boolean q;
    public boolean r;
    public boolean s;

    public rvb(vcc vccVar, boolean z) {
        super(vccVar);
        this.l = z && vccVar.d();
        this.m = new kij();
        this.n = new iij();
        mij e = vccVar.e();
        if (e == null) {
            this.o = new nvb(new pvb(vccVar.a()), kij.p, nvb.e);
        } else {
            this.o = new nvb(e, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.cml
    public final void A() {
        if (this.l) {
            return;
        }
        this.q = true;
        z();
    }

    @Override // defpackage.vcc
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final lvb c(scc sccVar, l2a l2aVar, long j) {
        lvb lvbVar = new lvb(sccVar, l2aVar, j);
        lvbVar.i(this.k);
        if (!this.r) {
            this.p = lvbVar;
            if (!this.q) {
                this.q = true;
                z();
            }
            return lvbVar;
        }
        Object obj = sccVar.a;
        if (this.o.d != null && obj.equals(nvb.e)) {
            obj = this.o.d;
        }
        lvbVar.e(sccVar.a(obj));
        return lvbVar;
    }

    public final boolean C(long j) {
        lvb lvbVar = this.p;
        int b = this.o.b(lvbVar.a.a);
        if (b == -1) {
            return false;
        }
        nvb nvbVar = this.o;
        iij iijVar = this.n;
        nvbVar.f(b, iijVar, false);
        long j2 = iijVar.d;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        lvbVar.i = j;
        return true;
    }

    @Override // defpackage.cml, defpackage.vcc
    public final void b(h6c h6cVar) {
        if (this.s) {
            nvb nvbVar = this.o;
            mij mijVar = nvbVar.b;
            this.o = new nvb(mijVar instanceof nij ? new nij(((nij) mijVar).b, h6cVar) : new nij(mijVar, h6cVar), nvbVar.c, nvbVar.d);
        } else {
            this.o = new nvb(new pvb(h6cVar), kij.p, nvb.e);
        }
        this.k.b(h6cVar);
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
        ((lvb) w6cVar).h();
        if (w6cVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.fg3, defpackage.b51
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // defpackage.cml
    public final scc x(scc sccVar) {
        Object obj = sccVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = nvb.e;
        }
        return sccVar.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // defpackage.cml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(mij mijVar) {
        long j;
        nvb nvbVar;
        lvb lvbVar;
        Object obj;
        scc a;
        nvb nvbVar2;
        if (this.r) {
            nvb nvbVar3 = this.o;
            this.o = new nvb(mijVar, nvbVar3.c, nvbVar3.d);
            lvb lvbVar2 = this.p;
            if (lvbVar2 != null) {
                C(lvbVar2.i);
            }
        } else if (mijVar.p()) {
            if (this.s) {
                nvb nvbVar4 = this.o;
                nvbVar2 = new nvb(mijVar, nvbVar4.c, nvbVar4.d);
            } else {
                nvbVar2 = new nvb(mijVar, kij.p, nvb.e);
            }
            this.o = nvbVar2;
        } else {
            kij kijVar = this.m;
            mijVar.n(0, kijVar);
            long j2 = kijVar.k;
            Object obj2 = kijVar.a;
            lvb lvbVar3 = this.p;
            iij iijVar = this.n;
            if (lvbVar3 != null) {
                long j3 = lvbVar3.b;
                this.o.g(lvbVar3.a.a, iijVar);
                long j4 = iijVar.e + j3;
                this.o.m(0, kijVar, 0L);
                if (j4 != kijVar.k) {
                    j = j4;
                    Pair i = mijVar.i(kijVar, iijVar, 0, j);
                    Object obj3 = i.first;
                    long longValue = ((Long) i.second).longValue();
                    if (this.s) {
                        nvbVar = new nvb(mijVar, obj2, obj3);
                    } else {
                        nvb nvbVar5 = this.o;
                        nvbVar = new nvb(mijVar, nvbVar5.c, nvbVar5.d);
                    }
                    this.o = nvbVar;
                    lvbVar = this.p;
                    if (lvbVar != null && C(longValue)) {
                        scc sccVar = lvbVar.a;
                        obj = sccVar.a;
                        if (this.o.d != null && obj.equals(nvb.e)) {
                            obj = this.o.d;
                        }
                        a = sccVar.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a != null) {
                            lvb lvbVar4 = this.p;
                            lvbVar4.getClass();
                            lvbVar4.e(a);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair i2 = mijVar.i(kijVar, iijVar, 0, j);
            Object obj32 = i2.first;
            long longValue2 = ((Long) i2.second).longValue();
            if (this.s) {
            }
            this.o = nvbVar;
            lvbVar = this.p;
            if (lvbVar != null) {
                scc sccVar2 = lvbVar.a;
                obj = sccVar2.a;
                if (this.o.d != null) {
                    obj = this.o.d;
                }
                a = sccVar2.a(obj);
                this.s = true;
                this.r = true;
                n(this.o);
                if (a != null) {
                }
            }
        }
        a = null;
        this.s = true;
        this.r = true;
        n(this.o);
        if (a != null) {
        }
    }
}
