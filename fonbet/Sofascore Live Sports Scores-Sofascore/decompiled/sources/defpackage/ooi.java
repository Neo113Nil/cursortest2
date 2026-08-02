package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ooi extends wtc implements qze, kx4, pze {
    public Object o;
    public Object p;
    public PointerInputEventHandler q;
    public g9i r;
    public fze s = koi.a;
    public final i1d t;
    public final i1d u;
    public final i1d v;
    public fze w;
    public long x;

    public ooi(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.o = obj;
        this.p = obj2;
        this.q = pointerInputEventHandler;
        i1d i1dVar = new i1d(new noi[16], 0);
        this.t = i1dVar;
        this.u = i1dVar;
        this.v = new i1d(new noi[16], 0);
        this.x = 0L;
    }

    @Override // defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        this.x = j;
        if (gzeVar == gze.a) {
            this.s = fzeVar;
        }
        rq3 rq3Var = null;
        if (this.r == null) {
            this.r = xw3.L(Y0(), null, nu3.d, new w9g(this, rq3Var, 21), 1);
        }
        l1(fzeVar, gzeVar);
        List list = fzeVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fzeVar = null;
                break;
            } else if (!qea.n((mze) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.w = fzeVar;
    }

    @Override // defpackage.pze
    public final void S0() {
        m1();
    }

    @Override // defpackage.wtc
    public final void d1() {
        m1();
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return c6o.c0(this).y.getFontScale();
    }

    @Override // defpackage.kx4
    public final float j() {
        return c6o.c0(this).y.j();
    }

    public final Object k1(Function2 function2, rq3 rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        noi noiVar = new noi(this, lj2Var);
        synchronized (this.u) {
            this.t.b(noiVar);
            oog oogVar = new oog(z9a.b(z9a.a(noiVar, noiVar, function2)), lu3.a);
            p2g p2gVar = w2g.b;
            oogVar.resumeWith(Unit.a);
        }
        lj2Var.v(new xjd(noiVar, 9));
        return lj2Var.q();
    }

    @Override // defpackage.xv4, defpackage.pze
    public final void l() {
        m1();
    }

    public final void l1(fze fzeVar, gze gzeVar) {
        lj2 lj2Var;
        lj2 lj2Var2;
        synchronized (this.u) {
            i1d i1dVar = this.v;
            i1dVar.c(i1dVar.c, this.t);
        }
        try {
            int ordinal = gzeVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i1d i1dVar2 = this.v;
                    int i = i1dVar2.c - 1;
                    Object[] objArr = i1dVar2.a;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            noi noiVar = (noi) objArr[i];
                            if (gzeVar == noiVar.d && (lj2Var2 = noiVar.c) != null) {
                                noiVar.c = null;
                                p2g p2gVar = w2g.b;
                                lj2Var2.resumeWith(fzeVar);
                            }
                            i--;
                        }
                    }
                    this.v.n();
                }
                if (ordinal != 2) {
                    throw new ndd();
                }
            }
            i1d i1dVar3 = this.v;
            Object[] objArr2 = i1dVar3.a;
            int i2 = i1dVar3.c;
            for (int i3 = 0; i3 < i2; i3++) {
                noi noiVar2 = (noi) objArr2[i3];
                if (gzeVar == noiVar2.d && (lj2Var = noiVar2.c) != null) {
                    noiVar2.c = null;
                    p2g p2gVar2 = w2g.b;
                    lj2Var.resumeWith(fzeVar);
                }
            }
            this.v.n();
        } catch (Throwable th) {
            this.v.n();
            throw th;
        }
    }

    public final void m1() {
        g9i g9iVar = this.r;
        if (g9iVar != null) {
            g9iVar.y(new auc("Pointer input was reset", 2));
            this.r = null;
        }
    }

    @Override // defpackage.pze
    public final void y0() {
        fze fzeVar = this.w;
        if (fzeVar == null) {
            return;
        }
        List list = fzeVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((mze) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    mze mzeVar = (mze) list.get(i2);
                    long j = mzeVar.a;
                    long j2 = mzeVar.c;
                    long j3 = mzeVar.b;
                    float f = mzeVar.e;
                    boolean z = mzeVar.d;
                    arrayList.add(new mze(j, j3, j2, false, f, j3, j2, z, z, mzeVar.i, 0L, 1.0f, 0L));
                }
                fze fzeVar2 = new fze(arrayList, null);
                this.s = fzeVar2;
                l1(fzeVar2, gze.a);
                l1(fzeVar2, gze.b);
                l1(fzeVar2, gze.c);
                this.w = null;
                return;
            }
        }
    }
}
