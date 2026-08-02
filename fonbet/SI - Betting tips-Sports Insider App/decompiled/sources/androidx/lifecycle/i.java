package androidx.lifecycle;

import eg.t1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends p0 {

    /* renamed from: l, reason: collision with root package name */
    public p.f f2186l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.a0 f2187m;

    @Override // androidx.lifecycle.n0
    public final void f() {
        p.b bVar = (p.b) this.f2186l.iterator();
        if (bVar.hasNext()) {
            ((Map.Entry) bVar.next()).getValue().getClass();
            throw new ClassCastException();
        }
        androidx.appcompat.widget.a0 a0Var = this.f2187m;
        if (a0Var != null) {
            t1 t1Var = (t1) a0Var.f685g;
            Continuation continuation = null;
            if (t1Var != null) {
                t1Var.k(null);
            }
            a0Var.f685g = null;
            if (((t1) a0Var.f684f) != null) {
                return;
            }
            a0Var.f684f = eg.c0.t((jg.d) a0Var.f682d, null, null, new c(a0Var, continuation, 0), 3);
        }
    }

    @Override // androidx.lifecycle.n0
    public final void g() {
        p.b bVar = (p.b) this.f2186l.iterator();
        if (bVar.hasNext()) {
            ((Map.Entry) bVar.next()).getValue().getClass();
            throw new ClassCastException();
        }
        androidx.appcompat.widget.a0 a0Var = this.f2187m;
        if (a0Var != null) {
            if (((t1) a0Var.f685g) != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            jg.d dVar = (jg.d) a0Var.f682d;
            lg.e eVar = eg.m0.f9201a;
            a0Var.f685g = eg.c0.t(dVar, jg.q.f18523a.f9624e, null, new b(a0Var, (Continuation) null, 0), 2);
        }
    }

    public final Unit k(mf.c cVar) {
        h hVar;
        int i5;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f2182c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f2182c = i10 - Integer.MIN_VALUE;
                Object obj = hVar.f2180a;
                lf.a aVar = lf.a.f20034a;
                i5 = hVar.f2182c;
                if (i5 == 0 && i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return Unit.f19194a;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f2180a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = hVar.f2182c;
        if (i5 == 0) {
        }
        h8.b.B(obj2);
        return Unit.f19194a;
    }
}
