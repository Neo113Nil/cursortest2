package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qvb extends bml {
    public final boolean l;
    public final jij m;
    public final hij n;
    public mvb o;
    public kvb p;
    public boolean q;
    public boolean r;
    public boolean s;

    public qvb(a51 a51Var, boolean z) {
        super(a51Var);
        this.l = z && a51Var.h();
        this.m = new jij();
        this.n = new hij();
        lij f = a51Var.f();
        if (f == null) {
            this.o = new mvb(new ovb(a51Var.g()), jij.p, mvb.e);
        } else {
            this.o = new mvb(f, null, null);
            this.s = true;
        }
    }

    public final void A(long j) {
        kvb kvbVar = this.p;
        int b = this.o.b(kvbVar.a.a);
        if (b == -1) {
            return;
        }
        mvb mvbVar = this.o;
        hij hijVar = this.n;
        mvbVar.f(b, hijVar, false);
        long j2 = hijVar.d;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        kvbVar.g = j;
    }

    @Override // defpackage.a51
    public final void m(v6c v6cVar) {
        kvb kvbVar = (kvb) v6cVar;
        if (kvbVar.e != null) {
            a51 a51Var = kvbVar.d;
            a51Var.getClass();
            a51Var.m(kvbVar.e);
        }
        if (v6cVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.eg3, defpackage.a51
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // defpackage.bml
    public final rcc w(rcc rccVar) {
        Object obj = rccVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = mvb.e;
        }
        return rccVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c4  */
    @Override // defpackage.bml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(lij lijVar) {
        long j;
        mvb mvbVar;
        kvb kvbVar;
        rcc b;
        mvb mvbVar2;
        if (this.r) {
            mvb mvbVar3 = this.o;
            this.o = new mvb(lijVar, mvbVar3.c, mvbVar3.d);
            kvb kvbVar2 = this.p;
            if (kvbVar2 != null) {
                A(kvbVar2.g);
            }
        } else {
            boolean p = lijVar.p();
            Object obj = mvb.e;
            if (p) {
                if (this.s) {
                    mvb mvbVar4 = this.o;
                    mvbVar2 = new mvb(lijVar, mvbVar4.c, mvbVar4.d);
                } else {
                    mvbVar2 = new mvb(lijVar, jij.p, obj);
                }
                this.o = mvbVar2;
            } else {
                jij jijVar = this.m;
                lijVar.n(0, jijVar);
                long j2 = jijVar.k;
                Object obj2 = jijVar.a;
                kvb kvbVar3 = this.p;
                hij hijVar = this.n;
                if (kvbVar3 != null) {
                    long j3 = kvbVar3.b;
                    this.o.g(kvbVar3.a.a, hijVar);
                    long j4 = hijVar.e + j3;
                    this.o.m(0, jijVar, 0L);
                    if (j4 != jijVar.k) {
                        j = j4;
                        Pair i = lijVar.i(jijVar, hijVar, 0, j);
                        Object obj3 = i.first;
                        long longValue = ((Long) i.second).longValue();
                        if (this.s) {
                            mvbVar = new mvb(lijVar, obj2, obj3);
                        } else {
                            mvb mvbVar5 = this.o;
                            mvbVar = new mvb(lijVar, mvbVar5.c, mvbVar5.d);
                        }
                        this.o = mvbVar;
                        kvbVar = this.p;
                        if (kvbVar != null) {
                            A(longValue);
                            rcc rccVar = kvbVar.a;
                            Object obj4 = rccVar.a;
                            if (this.o.d != null && obj4.equals(obj)) {
                                obj4 = this.o.d;
                            }
                            b = rccVar.b(obj4);
                            this.s = true;
                            this.r = true;
                            l(this.o);
                            if (b == null) {
                                kvb kvbVar4 = this.p;
                                kvbVar4.getClass();
                                kvbVar4.f(b);
                                return;
                            }
                            return;
                        }
                    }
                }
                j = j2;
                Pair i2 = lijVar.i(jijVar, hijVar, 0, j);
                Object obj32 = i2.first;
                long longValue2 = ((Long) i2.second).longValue();
                if (this.s) {
                }
                this.o = mvbVar;
                kvbVar = this.p;
                if (kvbVar != null) {
                }
            }
        }
        b = null;
        this.s = true;
        this.r = true;
        l(this.o);
        if (b == null) {
        }
    }

    @Override // defpackage.bml
    public final void y() {
        if (this.l) {
            return;
        }
        this.q = true;
        v(null, this.k);
    }

    @Override // defpackage.a51
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final kvb a(rcc rccVar, zz0 zz0Var, long j) {
        kvb kvbVar = new kvb(rccVar, zz0Var, j);
        qx9.t(kvbVar.d == null);
        a51 a51Var = this.k;
        kvbVar.d = a51Var;
        if (!this.r) {
            this.p = kvbVar;
            if (!this.q) {
                this.q = true;
                v(null, a51Var);
            }
            return kvbVar;
        }
        Object obj = rccVar.a;
        if (this.o.d != null && obj.equals(mvb.e)) {
            obj = this.o.d;
        }
        kvbVar.f(rccVar.b(obj));
        return kvbVar;
    }

    @Override // defpackage.eg3, defpackage.a51
    public final void i() {
    }
}
