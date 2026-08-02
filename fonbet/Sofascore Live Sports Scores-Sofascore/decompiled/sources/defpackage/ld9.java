package defpackage;

import androidx.media3.common.b;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ld9 implements jpg {
    public final int a;
    public final pd9 b;
    public int c = -1;

    public ld9(pd9 pd9Var, int i) {
        this.b = pd9Var;
        this.a = i;
    }

    public final void a() {
        z1a.s(this.c == -1);
        pd9 pd9Var = this.b;
        pd9Var.h();
        pd9Var.K.getClass();
        int[] iArr = pd9Var.K;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (pd9Var.J.contains(pd9Var.I.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = pd9Var.N;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        b bVar;
        if (this.c == -3) {
            im4Var.b(4);
            return -4;
        }
        if (b()) {
            int i2 = this.c;
            pd9 pd9Var = this.b;
            ArrayList arrayList = pd9Var.n;
            if (!pd9Var.s()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((pc9) arrayList.get(i4)).k;
                        int length = pd9Var.v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (pd9Var.N[i6] && pd9Var.v[i6].D() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    nik.Y(arrayList, 0, i4);
                    pc9 pc9Var = (pc9) arrayList.get(0);
                    b bVar2 = pc9Var.d;
                    if (!bVar2.equals(pd9Var.G)) {
                        pd9Var.k.i(pd9Var.b, bVar2, pc9Var.e, pc9Var.f, pc9Var.g);
                    }
                    pd9Var.G = bVar2;
                }
                if (arrayList.isEmpty() || ((pc9) arrayList.get(0)).f()) {
                    int E = pd9Var.v[i2].E(fp4Var, im4Var, i, pd9Var.T);
                    if (E == -5) {
                        b bVar3 = (b) fp4Var.c;
                        bVar3.getClass();
                        if (i2 == pd9Var.B) {
                            int s = jaa.s(pd9Var.v[i2].D());
                            while (i3 < arrayList.size() && ((pc9) arrayList.get(i3)).k != s) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                bVar = ((pc9) arrayList.get(i3)).d;
                            } else {
                                bVar = pd9Var.F;
                                bVar.getClass();
                            }
                            bVar3 = bVar3.d(bVar);
                        }
                        fp4Var.c = bVar3;
                    }
                    return E;
                }
            }
        }
        return -3;
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        if (this.c == -3) {
            return true;
        }
        if (!b()) {
            return false;
        }
        int i = this.c;
        pd9 pd9Var = this.b;
        return !pd9Var.s() && pd9Var.v[i].z(pd9Var.T);
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
        int i = this.c;
        pd9 pd9Var = this.b;
        if (i == -2) {
            pd9Var.h();
            throw new jz2(lnb.o("Unable to bind a sample queue to TrackGroup with MIME type ", pd9Var.I.a(this.a).d[0].o, "."));
        }
        if (i == -1) {
            pd9Var.u();
        } else if (i != -3) {
            pd9Var.u();
            pd9Var.v[i].B();
        }
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        Object next;
        Object obj;
        if (!b()) {
            return 0;
        }
        int i = this.c;
        pd9 pd9Var = this.b;
        if (pd9Var.s()) {
            return 0;
        }
        od9 od9Var = pd9Var.v[i];
        int w = od9Var.w(j, pd9Var.T);
        ArrayList arrayList = pd9Var.n;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = mz1.h(arrayList, 1);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        pc9 pc9Var = (pc9) obj;
        if (pc9Var != null && !pc9Var.f()) {
            w = Math.min(w, pc9Var.e(i) - od9Var.u());
        }
        od9Var.J(w);
        return w;
    }
}
