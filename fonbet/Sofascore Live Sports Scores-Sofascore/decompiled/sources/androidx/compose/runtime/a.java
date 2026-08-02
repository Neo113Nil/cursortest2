package androidx.compose.runtime;

import defpackage.aee;
import defpackage.av8;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.hpo;
import defpackage.hv7;
import defpackage.lg3;
import defpackage.mg3;
import defpackage.p4h;
import defpackage.qf0;
import defpackage.qj2;
import defpackage.rrg;
import defpackage.sg3;
import defpackage.swc;
import defpackage.twc;
import defpackage.vfh;
import defpackage.y0d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a extends mg3 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final y0d e;
    public final e1d f;
    public final /* synthetic */ av8 g;

    public a(av8 av8Var, long j, boolean z, boolean z2, hpo hpoVar) {
        this.g = av8Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        y0d y0dVar = rrg.a;
        this.e = new y0d();
        this.f = new ParcelableSnapshotMutableState(aee.g, p4h.g);
    }

    @Override // defpackage.mg3
    public final void a(sg3 sg3Var, Function2 function2) {
        this.g.b.a(sg3Var, function2);
    }

    @Override // defpackage.mg3
    public final y0d b(sg3 sg3Var, vfh vfhVar, Function2 function2) {
        return this.g.b.b(sg3Var, vfhVar, function2);
    }

    @Override // defpackage.mg3
    public final void c(twc twcVar) {
        this.g.b.c(twcVar);
    }

    @Override // defpackage.mg3
    public final void d() {
        av8 av8Var = this.g;
        av8Var.A--;
    }

    @Override // defpackage.mg3
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // defpackage.mg3
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.mg3
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.mg3
    public final long h() {
        return this.a;
    }

    @Override // defpackage.mg3
    public final lg3 i() {
        return this.g.h;
    }

    @Override // defpackage.mg3
    public final aee j() {
        return (aee) ((eoh) this.f).getValue();
    }

    @Override // defpackage.mg3
    public final CoroutineContext k() {
        return this.g.b.k();
    }

    @Override // defpackage.mg3
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // defpackage.mg3
    public final void m(twc twcVar) {
        this.g.b.m(twcVar);
    }

    @Override // defpackage.mg3
    public final void n(sg3 sg3Var) {
        av8 av8Var = this.g;
        mg3 mg3Var = av8Var.b;
        mg3Var.n(av8Var.h);
        mg3Var.n(sg3Var);
    }

    @Override // defpackage.mg3
    public final void o(twc twcVar, swc swcVar, qf0 qf0Var) {
        this.g.b.o(twcVar, swcVar, qf0Var);
    }

    @Override // defpackage.mg3
    public final swc p(twc twcVar) {
        return this.g.b.p(twcVar);
    }

    @Override // defpackage.mg3
    public final y0d q(sg3 sg3Var, vfh vfhVar, y0d y0dVar) {
        return this.g.b.q(sg3Var, vfhVar, y0dVar);
    }

    @Override // defpackage.mg3
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.mg3
    public final void s(av8 av8Var) {
        this.e.a(av8Var);
    }

    @Override // defpackage.mg3
    public final void t(eqf eqfVar) {
        this.g.b.t(eqfVar);
    }

    @Override // defpackage.mg3
    public final void u(sg3 sg3Var) {
        this.g.b.u(sg3Var);
    }

    @Override // defpackage.mg3
    public final qj2 v(hv7 hv7Var) {
        return this.g.b.v(hv7Var);
    }

    @Override // defpackage.mg3
    public final void w() {
        this.g.A++;
    }

    @Override // defpackage.mg3
    public final void x(av8 av8Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                av8Var.getClass();
                set.remove(av8Var.z());
            }
        }
        if (av8Var != null) {
            this.e.l(av8Var);
        }
    }

    @Override // defpackage.mg3
    public final void y(sg3 sg3Var) {
        this.g.b.y(sg3Var);
    }

    public final void z() {
        y0d y0dVar = this.e;
        if (y0dVar.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = y0dVar.b;
                long[] jArr = y0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    av8 av8Var = (av8) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(av8Var.z());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            y0dVar.b();
        }
    }
}
