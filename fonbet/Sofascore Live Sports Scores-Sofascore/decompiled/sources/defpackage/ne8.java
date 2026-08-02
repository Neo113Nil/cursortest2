package defpackage;

import android.os.Trace;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ne8 extends wtc implements ug3, ula, tkd, ztc, xv4 {
    public final boolean o;
    public final Function2 p;
    public boolean q;
    public boolean r;
    public final int s;

    public ne8(int i, int i2, Function2 function2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.o = z;
        this.p = function2;
        this.s = i;
    }

    public static boolean s1(ne8 ne8Var) {
        return ne8Var.r1(7);
    }

    @Override // defpackage.tkd
    public final void Z() {
        q1();
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void d1() {
        int ordinal = p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                wd8 focusOwner = ((xy) c6o.d0(this)).getFocusOwner();
                ne8 R = l98.R(this);
                if (R == null || !R.o) {
                    return;
                }
                yd8 yd8Var = (yd8) focusOwner;
                yd8Var.a.J();
                yd8Var.d.a();
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                zzl.b();
                return;
            }
        }
        yd8 yd8Var2 = (yd8) ((xy) c6o.d0(this)).getFocusOwner();
        yd8Var2.c(8, true, false);
        if (this.o) {
            yd8Var2.a.J();
        }
        yd8Var2.d.a();
    }

    @Override // defpackage.wtc
    public final void e1() {
        if (p1().g()) {
            ((yd8) ((xy) c6o.d0(this)).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean k1(int i) {
        int ordinal = ml4.n0(this, i).ordinal();
        if (ordinal == 0) {
            return ml4.o0(this);
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        zzl.b();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [wtc] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [wtc] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [i1d] */
    public final void l1(ie8 ie8Var, ie8 ie8Var2) {
        c40 c40Var;
        Function2 function2;
        yd8 yd8Var = (yd8) ((xy) c6o.d0(this)).getFocusOwner();
        ne8 g = yd8Var.g();
        if (!ie8Var.equals(ie8Var2) && (function2 = this.p) != null) {
            function2.invoke(ie8Var, ie8Var2);
        }
        wtc wtcVar = this.a;
        if (!wtcVar.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar2 = this.a;
        wma c0 = c6o.c0(this);
        while (c0 != null) {
            if ((((wtc) c0.F.g).d & 5120) != 0) {
                while (wtcVar2 != null) {
                    int i = wtcVar2.c;
                    if ((i & 5120) != 0) {
                        if (wtcVar2 != wtcVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            bw4 bw4Var = wtcVar2;
                            ?? r5 = 0;
                            while (bw4Var != 0) {
                                if (bw4Var instanceof nd8) {
                                    nd8 nd8Var = (nd8) bw4Var;
                                    if (g == yd8Var.g()) {
                                        nd8Var.J(ie8Var2);
                                    }
                                } else if ((bw4Var.c & 4096) != 0 && (bw4Var instanceof bw4)) {
                                    wtc wtcVar3 = bw4Var.p;
                                    int i2 = 0;
                                    bw4Var = bw4Var;
                                    r5 = r5;
                                    while (wtcVar3 != null) {
                                        if ((wtcVar3.c & 4096) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                bw4Var = wtcVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new i1d(new wtc[16], 0);
                                                }
                                                if (bw4Var != 0) {
                                                    r5.b(bw4Var);
                                                    bw4Var = 0;
                                                }
                                                r5.b(wtcVar3);
                                            }
                                        }
                                        wtcVar3 = wtcVar3.f;
                                        bw4Var = bw4Var;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                bw4Var = c6o.X(r5);
                            }
                        }
                    }
                    wtcVar2 = wtcVar2.e;
                }
            }
            c0 = c0.v();
            wtcVar2 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [wtc] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [wtc] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i1d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [i1d] */
    public final ae8 m1() {
        boolean z;
        c40 c40Var;
        ae8 ae8Var = new ae8();
        ae8Var.a = true;
        ce8 ce8Var = ce8.b;
        ae8Var.b = ce8Var;
        ae8Var.c = ce8Var;
        ae8Var.d = ce8Var;
        ae8Var.e = ce8Var;
        ae8Var.f = ce8Var;
        ae8Var.g = ce8Var;
        ae8Var.h = ce8Var;
        ae8Var.i = ce8Var;
        ae8Var.j = s84.t;
        ae8Var.k = s84.u;
        ae8Var.l = wib.d;
        int i = this.s;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((h4a) ((eoh) ((j4a) ((i4a) tgj.x(this, dh3.m))).a).getValue()).a == 1);
        } else {
            if (i != 2) {
                a70.r("Unknown Focusability");
                return null;
            }
            z = false;
        }
        ae8Var.a = z;
        wtc wtcVar = this.a;
        if (!wtcVar.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar2 = this.a;
        wma c0 = c6o.c0(this);
        loop0: while (c0 != null) {
            if ((((wtc) c0.F.g).d & 3072) != 0) {
                while (wtcVar2 != null) {
                    int i2 = wtcVar2.c;
                    if ((i2 & 3072) != 0) {
                        if (wtcVar2 != wtcVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & a.o) != 0) {
                            ?? r7 = 0;
                            bw4 bw4Var = wtcVar2;
                            while (bw4Var != 0) {
                                if (bw4Var instanceof be8) {
                                    ((be8) bw4Var).I(ae8Var);
                                } else if ((bw4Var.c & a.o) != 0 && (bw4Var instanceof bw4)) {
                                    wtc wtcVar3 = bw4Var.p;
                                    int i3 = 0;
                                    bw4Var = bw4Var;
                                    r7 = r7;
                                    while (wtcVar3 != null) {
                                        if ((wtcVar3.c & a.o) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                bw4Var = wtcVar3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new i1d(new wtc[16], 0);
                                                }
                                                if (bw4Var != 0) {
                                                    r7.b(bw4Var);
                                                    bw4Var = 0;
                                                }
                                                r7.b(wtcVar3);
                                            }
                                        }
                                        wtcVar3 = wtcVar3.f;
                                        bw4Var = bw4Var;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                bw4Var = c6o.X(r7);
                            }
                        }
                    }
                    wtcVar2 = wtcVar2.e;
                }
            }
            c0 = c0.v();
            wtcVar2 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
        return ae8Var;
    }

    public final oqf n1(dma dmaVar) {
        oqf oqfVar = m1().l;
        return oqfVar != wib.d ? dmaVar == null ? oqfVar : oqfVar.k(dmaVar.o(c6o.b0(this), 0L)) : dmaVar != null ? dmaVar.p(c6o.b0(this), false) : jca.r(0L, d7a.I(c6o.b0(this).c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gqa o1() {
        c40 c40Var;
        Object obj;
        if (!this.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar = this.a.e;
        wma c0 = c6o.c0(this);
        while (true) {
            if (c0 == null) {
                break;
            }
            if ((((wtc) c0.F.g).d & 8388640) != 0) {
                while (wtcVar != null) {
                    int i = wtcVar.c;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(wtcVar instanceof gqa)) {
                                if (wtcVar instanceof bw4) {
                                    wtcVar = null;
                                    for (wtc wtcVar2 = ((bw4) wtcVar).p; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
                                        if (wtcVar2 instanceof gqa) {
                                            wtcVar = wtcVar2;
                                        }
                                    }
                                } else {
                                    wtcVar = null;
                                }
                            }
                            gqa gqaVar = (gqa) wtcVar;
                            if (gqaVar != null) {
                                return gqaVar;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (wtcVar instanceof ztc) {
                                obj = wtcVar;
                            } else if (wtcVar instanceof bw4) {
                                obj = null;
                                for (wtc wtcVar3 = ((bw4) wtcVar).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                    if (wtcVar3 instanceof ztc) {
                                        obj = wtcVar3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            ztc ztcVar = (ztc) obj;
                            if (ztcVar != null) {
                                dti V = ztcVar.V();
                                int i2 = hv1.a;
                                if (V.i()) {
                                    ztcVar.V().p();
                                    throw null;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    wtcVar = wtcVar.e;
                }
            }
            c0 = c0.v();
            wtcVar = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
    }

    public final ie8 p1() {
        c40 c40Var;
        if (!this.n) {
            return ie8.d;
        }
        ne8 g = ((yd8) ((xy) c6o.d0(this)).getFocusOwner()).g();
        if (g == null) {
            return ie8.d;
        }
        if (this == g) {
            return ie8.a;
        }
        if (g.n) {
            if (!g.a.n) {
                r3a.b("visitAncestors called on an unattached node");
            }
            wtc wtcVar = g.a.e;
            wma c0 = c6o.c0(g);
            while (c0 != null) {
                if ((((wtc) c0.F.g).d & 1024) != 0) {
                    while (wtcVar != null) {
                        if ((wtcVar.c & 1024) != 0) {
                            wtc wtcVar2 = wtcVar;
                            i1d i1dVar = null;
                            while (wtcVar2 != null) {
                                if (wtcVar2 instanceof ne8) {
                                    if (this == ((ne8) wtcVar2)) {
                                        return ie8.b;
                                    }
                                } else if ((wtcVar2.c & 1024) != 0 && (wtcVar2 instanceof bw4)) {
                                    int i = 0;
                                    for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                        if ((wtcVar3.c & 1024) != 0) {
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
        }
        return ie8.d;
    }

    public final void q1() {
        int ordinal = p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                zzl.b();
                return;
            }
        }
        fsf fsfVar = new fsf();
        z1a.R(this, new z07(20, fsfVar, this));
        Object obj = fsfVar.a;
        if (obj == null) {
            Intrinsics.i("focusProperties");
            throw null;
        }
        if (((zd8) obj).e()) {
            return;
        }
        ((yd8) ((xy) c6o.d0(this)).getFocusOwner()).c(8, true, true);
    }

    public final boolean r1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m1().a ? k1(i) : w3a.t(this, i, new uy(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ula
    public final void q0(dma dmaVar) {
    }
}
