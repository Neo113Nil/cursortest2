package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m9d extends wtc implements jyj, e9d {
    public e9d o;
    public h9d p;
    public m9d q;
    public final String r;

    public m9d(e9d e9dVar, h9d h9dVar) {
        this.o = e9dVar;
        this.p = h9dVar == null ? new h9d() : h9dVar;
        this.r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        m9d l1 = this.n ? l1() : null;
        long P = l1 != null ? l1.P(i, j) : 0L;
        return dnd.i(P, this.o.P(i, dnd.h(j, P)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.e9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T0(long j, long j2, rq3 rq3Var) {
        k9d k9dVar;
        int i;
        long j3;
        long j4;
        boolean z;
        e9d e9dVar;
        long j5;
        long j6;
        if (rq3Var instanceof k9d) {
            k9dVar = (k9d) rq3Var;
            int i2 = k9dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k9dVar.v = i2 - Integer.MIN_VALUE;
                k9d k9dVar2 = k9dVar;
                Object obj = k9dVar2.t;
                lu3 lu3Var = lu3.a;
                i = k9dVar2.v;
                m9d m9dVar = null;
                if (i != 0) {
                    y6a.M(obj);
                    e9d e9dVar2 = this.o;
                    k9dVar2.r = j;
                    k9dVar2.s = j2;
                    k9dVar2.v = 1;
                    obj = e9dVar2.T0(j, j2, k9dVar2);
                    if (obj != lu3Var) {
                        j3 = j2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6 = k9dVar2.r;
                    y6a.M(obj);
                    j5 = ((vmk) obj).a;
                    j4 = j6;
                    return new vmk(vmk.e(j4, j5));
                }
                long j7 = k9dVar2.s;
                long j8 = k9dVar2.r;
                y6a.M(obj);
                j3 = j7;
                j = j8;
                j4 = ((vmk) obj).a;
                z = this.n;
                if (z) {
                    m9dVar = this.q;
                } else if (z) {
                    m9dVar = l1();
                }
                e9dVar = m9dVar;
                if (e9dVar != null) {
                    j5 = 0;
                    return new vmk(vmk.e(j4, j5));
                }
                long e = vmk.e(j, j4);
                long d = vmk.d(j3, j4);
                k9dVar2.r = j4;
                k9dVar2.v = 2;
                obj = e9dVar.T0(e, d, k9dVar2);
                if (obj != lu3Var) {
                    j6 = j4;
                    j5 = ((vmk) obj).a;
                    j4 = j6;
                    return new vmk(vmk.e(j4, j5));
                }
                return lu3Var;
            }
        }
        k9dVar = new k9d(this, (sq3) rq3Var);
        k9d k9dVar22 = k9dVar;
        Object obj2 = k9dVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = k9dVar22.v;
        m9d m9dVar2 = null;
        if (i != 0) {
        }
        j4 = ((vmk) obj2).a;
        z = this.n;
        if (z) {
        }
        e9dVar = m9dVar2;
        if (e9dVar != null) {
        }
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        long b0 = this.o.b0(i, j, j2);
        m9d l1 = this.n ? l1() : null;
        return dnd.i(b0, l1 != null ? l1.b0(i, dnd.i(j, b0), dnd.h(j2, b0)) : 0L);
    }

    @Override // defpackage.wtc
    public final void c1() {
        h9d h9dVar = this.p;
        h9dVar.a = this;
        h9dVar.b = null;
        this.q = null;
        h9dVar.c = new jmc(this, 15);
        h9dVar.d = Y0();
    }

    @Override // defpackage.wtc
    public final void d1() {
        fsf fsfVar = new fsf();
        jca.Y(this, new qy(fsfVar, 2));
        m9d m9dVar = (m9d) ((jyj) fsfVar.a);
        this.q = m9dVar;
        h9d h9dVar = this.p;
        h9dVar.b = m9dVar;
        if (h9dVar.a == this) {
            h9dVar.a = null;
        }
    }

    public final ku3 k1() {
        m9d l1 = l1();
        ku3 k1 = l1 != null ? l1.k1() : null;
        if (k1 != null && s9a.w(k1)) {
            return k1;
        }
        ku3 ku3Var = this.p.d;
        if (ku3Var != null) {
            return ku3Var;
        }
        a70.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final m9d l1() {
        c40 c40Var;
        jyj jyjVar = null;
        if (!this.n) {
            return null;
        }
        if (!this.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar = this.a.e;
        wma c0 = c6o.c0(this);
        loop0: while (true) {
            if (c0 == null) {
                break;
            }
            if ((((wtc) c0.F.g).d & 262144) != 0) {
                while (wtcVar != null) {
                    if ((wtcVar.c & 262144) != 0) {
                        wtc wtcVar2 = wtcVar;
                        i1d i1dVar = null;
                        while (wtcVar2 != null) {
                            if (wtcVar2 instanceof jyj) {
                                jyj jyjVar2 = (jyj) wtcVar2;
                                if (Intrinsics.c(this.r, jyjVar2.s()) && m9d.class == jyjVar2.getClass()) {
                                    jyjVar = jyjVar2;
                                    break loop0;
                                }
                            }
                            if ((wtcVar2.c & 262144) != 0 && (wtcVar2 instanceof bw4)) {
                                int i = 0;
                                for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                    if ((wtcVar3.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            wtcVar2 = wtcVar3;
                                        } else {
                                            if (i1dVar == null) {
                                                i1dVar = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar2 != null) {
                                                i1dVar.b(wtcVar2);
                                                wtcVar2 = null;
                                            }
                                            i1dVar.b(wtcVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            wtcVar2 = c6o.X(i1dVar);
                        }
                    }
                    wtcVar = wtcVar.e;
                }
            }
            c0 = c0.v();
            wtcVar = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
        return (m9d) jyjVar;
    }

    @Override // defpackage.jyj
    public final Object s() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.e9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x0(long j, rq3 rq3Var) {
        l9d l9dVar;
        Object obj;
        lu3 lu3Var;
        int i;
        long j2;
        long j3;
        if (rq3Var instanceof l9d) {
            l9dVar = (l9d) rq3Var;
            int i2 = l9dVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l9dVar.u = i2 - Integer.MIN_VALUE;
                obj = l9dVar.s;
                lu3Var = lu3.a;
                i = l9dVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    m9d l1 = this.n ? l1() : null;
                    if (l1 == null) {
                        j2 = 0;
                        e9d e9dVar = this.o;
                        long d = vmk.d(j, j2);
                        l9dVar.r = j2;
                        l9dVar.u = 2;
                        obj = e9dVar.x0(d, l9dVar);
                        if (obj != lu3Var) {
                            j3 = j2;
                            return new vmk(vmk.e(j3, ((vmk) obj).a));
                        }
                        return lu3Var;
                    }
                    l9dVar.r = j;
                    l9dVar.u = 1;
                    obj = l1.x0(j, l9dVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = l9dVar.r;
                        y6a.M(obj);
                        return new vmk(vmk.e(j3, ((vmk) obj).a));
                    }
                    j = l9dVar.r;
                    y6a.M(obj);
                }
                j2 = ((vmk) obj).a;
                e9d e9dVar2 = this.o;
                long d2 = vmk.d(j, j2);
                l9dVar.r = j2;
                l9dVar.u = 2;
                obj = e9dVar2.x0(d2, l9dVar);
                if (obj != lu3Var) {
                }
                return lu3Var;
            }
        }
        l9dVar = new l9d(this, (sq3) rq3Var);
        obj = l9dVar.s;
        lu3Var = lu3.a;
        i = l9dVar.u;
        if (i != 0) {
        }
        j2 = ((vmk) obj).a;
        e9d e9dVar22 = this.o;
        long d22 = vmk.d(j, j2);
        l9dVar.r = j2;
        l9dVar.u = 2;
        obj = e9dVar22.x0(d22, l9dVar);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
