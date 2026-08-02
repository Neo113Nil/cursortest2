package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jlh implements og3, Iterable, eia {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public HashMap j;
    public uzc k;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList i = new ArrayList();

    public static final void e(mlh mlhVar, int i) {
        while (mlhVar.v >= 0 && mlhVar.u <= i) {
            mlhVar.N();
            mlhVar.i();
        }
    }

    public final int a(vu8 vu8Var) {
        if (this.g) {
            sf3.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!vu8Var.a()) {
            h3f.a("Anchor refers to a group that was removed");
        }
        return vu8Var.a;
    }

    public final void c() {
        this.j = new HashMap();
    }

    public final x0d d(qf0 qf0Var, l0d l0dVar) {
        int i;
        Object[] objArr = l0dVar.a;
        int i2 = l0dVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (o(o02.J(((twc) objArr[i4]).e))) {
                i4++;
            } else {
                l0d l0dVar2 = new l0d();
                Object[] objArr2 = l0dVar.a;
                int i5 = l0dVar.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = objArr2[i6];
                    if (o(o02.J(((twc) obj).e))) {
                        l0dVar2.a(obj);
                    }
                }
                l0dVar = l0dVar2;
            }
        }
        qfg qfgVar = new qfg(this, 18);
        if (l0dVar.b > 1) {
            Comparable comparable = (Comparable) qfgVar.invoke(l0dVar.f(0));
            int i7 = l0dVar.b;
            int i8 = 1;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                Comparable comparable2 = (Comparable) qfgVar.invoke(l0dVar.f(i8));
                if (comparable.compareTo(comparable2) > 0) {
                    l0d l0dVar3 = new l0d(l0dVar.b);
                    Object[] objArr3 = l0dVar.a;
                    int i9 = l0dVar.b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        l0dVar3.a(objArr3[i10]);
                    }
                    j0d j0dVar = l0dVar3.c;
                    if (j0dVar == null) {
                        j0dVar = new j0d(l0dVar3, i3);
                        l0dVar3.c = j0dVar;
                    }
                    if (((l0d) j0dVar.b).b > 1) {
                        n13.u(new cp(qfgVar, 12), j0dVar);
                    }
                    l0dVar = l0dVar3;
                } else {
                    i8++;
                    comparable = comparable2;
                }
            }
        }
        if (l0dVar.h()) {
            x0d x0dVar = qrg.b;
            x0dVar.getClass();
            return x0dVar;
        }
        long[] jArr = qrg.a;
        x0d x0dVar2 = new x0d();
        mlh n = n();
        try {
            Object[] objArr4 = l0dVar.a;
            int i11 = l0dVar.b;
            for (int i12 = 0; i12 < i11; i12++) {
                twc twcVar = (twc) objArr4[i12];
                int c = n.c(o02.J(twcVar.e));
                int F = n.F(c, n.b);
                e(n, F);
                e(n, F);
                while (true) {
                    i = n.t;
                    if (i == F || i == n.u) {
                        break;
                    }
                    if (F < n.t(i) + i) {
                        n.Q();
                    } else {
                        n.M();
                    }
                }
                if (i != F) {
                    sf3.a("Unexpected slot table structure");
                }
                n.Q();
                n.a(c - n.t);
                x0dVar2.m(twcVar, sf3.c(twcVar.c, twcVar, n, qf0Var));
            }
            e(n, Integer.MAX_VALUE);
            Unit unit = Unit.a;
            n.e(true);
            return x0dVar2;
        } catch (Throwable th) {
            n.e(false);
            throw th;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y39(this, 0, this.b);
    }

    public final ilh m() {
        if (this.g) {
            a70.r("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new ilh(this);
    }

    public final mlh n() {
        if (this.g) {
            sf3.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            sf3.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new mlh(this);
    }

    public final boolean o(vu8 vu8Var) {
        int c;
        return vu8Var.a() && (c = llh.c(this.i, vu8Var.a, this.b)) >= 0 && Intrinsics.c(this.i.get(c), vu8Var);
    }

    public final cv8 p(int i) {
        int i2;
        ArrayList arrayList;
        int c;
        HashMap hashMap = this.j;
        if (hashMap != null) {
            if (this.g) {
                sf3.a("use active SlotWriter to crate an anchor for location instead");
            }
            vu8 vu8Var = (i < 0 || i >= (i2 = this.b) || (c = llh.c((arrayList = this.i), i, i2)) < 0) ? null : (vu8) arrayList.get(c);
            if (vu8Var != null) {
                return (cv8) hashMap.get(vu8Var);
            }
        }
        return null;
    }
}
