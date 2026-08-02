package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tyc extends t01 {
    public final x0d c;
    public final ArrayList d;
    public final y0d e;
    public final x0d f;
    public final imf g;

    public tyc() {
        super(7);
        this.c = t6a.t();
        this.d = new ArrayList();
        y0d y0dVar = rrg.a;
        this.e = new y0d();
        this.f = new x0d();
        faa faaVar = new faa(this, 29);
        snh.b(snh.a);
        synchronized (snh.c) {
            snh.h = CollectionsKt.x0(snh.h, faaVar);
            Unit unit = Unit.a;
        }
        this.g = new imf(faaVar, 11);
    }

    @Override // defpackage.t01
    public final Function1 G(l4h l4hVar) {
        x0d x0dVar = this.f;
        Function1 function1 = (Function1) x0dVar.g(l4hVar);
        if (function1 == null) {
            function1 = new lsb(11, this, l4hVar);
            int f = x0dVar.f(l4hVar);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = x0dVar.c;
            Object obj = objArr[f];
            x0dVar.b[f] = l4hVar;
            objArr[f] = function1;
        }
        return function1;
    }

    @Override // defpackage.t01
    public final void H(ln2 ln2Var) {
        this.f.k(ln2Var);
        n(ln2Var);
        o();
    }

    @Override // defpackage.t01
    public final void n(l4h l4hVar) {
        this.d.add(new ryc(l4hVar));
    }

    @Override // defpackage.t01
    public final void o() {
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    syc sycVar = (syc) arrayList.get(i);
                    if (sycVar instanceof qyc) {
                        t6a.l(this.c, ((qyc) sycVar).a, ((qyc) sycVar).b);
                    } else {
                        if (!(sycVar instanceof ryc)) {
                            throw new ndd();
                        }
                        t6a.I(this.c, ((ryc) sycVar).a);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.clear();
    }

    @Override // defpackage.t01
    public final void q() {
        this.g.f();
        this.d.clear();
        this.f.a();
        synchronized (this.b) {
            this.c.a();
            Unit unit = Unit.a;
        }
    }
}
