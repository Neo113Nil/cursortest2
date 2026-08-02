package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nrb extends mn2 {
    public final String b;
    public final /* synthetic */ qrb d;
    public final AtomicReference a = new AtomicReference(qrb.h0);
    public final lrb c = new lrb(this);

    public nrb(qrb qrbVar, String str) {
        this.d = qrbVar;
        z1a.y(str, "authority");
        this.b = str;
    }

    @Override // defpackage.mn2
    public final String e() {
        return this.b;
    }

    @Override // defpackage.mn2
    public final wkn f(ujg ujgVar, jh2 jh2Var) {
        qrb qrbVar = this.d;
        xx3 xx3Var = qrbVar.m;
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        erb erbVar = qrb.h0;
        if (obj != erbVar) {
            return g(ujgVar, jh2Var);
        }
        xx3Var.execute(new b8(this, 27));
        if (atomicReference.get() != erbVar) {
            return g(ujgVar, jh2Var);
        }
        if (qrbVar.G.get()) {
            return new nv4(2);
        }
        mrb mrbVar = new mrb(this, bq3.b(), ujgVar, jh2Var);
        xx3Var.execute(new a8p(this, mrbVar, false, 16));
        return mrbVar;
    }

    public final wkn g(ujg ujgVar, jh2 jh2Var) {
        c8a c8aVar = (c8a) this.a.get();
        lrb lrbVar = this.c;
        if (c8aVar == null) {
            return lrbVar.f(ujgVar, jh2Var);
        }
        if (!(c8aVar instanceof xrb)) {
            return new hrb(c8aVar, lrbVar, this.d.h, ujgVar, jh2Var);
        }
        yrb yrbVar = ((xrb) c8aVar).b;
        wrb wrbVar = (wrb) yrbVar.b.get((String) ujgVar.b);
        if (wrbVar == null) {
            wrbVar = (wrb) yrbVar.c.get((String) ujgVar.c);
        }
        if (wrbVar == null) {
            wrbVar = yrbVar.a;
        }
        if (wrbVar != null) {
            jh2Var = jh2Var.c(wrb.g, wrbVar);
        }
        return lrbVar.f(ujgVar, jh2Var);
    }

    public final void h(c8a c8aVar) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.a;
        c8a c8aVar2 = (c8a) atomicReference.get();
        atomicReference.set(c8aVar);
        if (c8aVar2 != qrb.h0 || (linkedHashSet = this.d.B) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((mrb) it.next()).X();
        }
    }
}
