package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bzc extends t6 {
    public final t6 e;
    public final de0 f;

    public bzc(t6 t6Var, de0 de0Var) {
        t6Var.getClass();
        this.e = t6Var;
        this.f = de0Var;
    }

    @Override // defpackage.t6
    public final void g() {
        this.e.g();
    }

    @Override // defpackage.t6
    public final Map i() {
        return new qub(this.e.d(), new kr9(this, 15));
    }

    @Override // defpackage.t6
    public final Collection j() {
        return new s6(this, 0);
    }

    @Override // defpackage.t6
    public final Set k() {
        return this.e.o();
    }

    @Override // defpackage.t6
    public final Iterator m() {
        return new lca(this.e.l().iterator(), new nub(this.f, 0));
    }

    @Override // defpackage.t6
    public final Collection n(Object obj) {
        return w3a.S((List) this.e.n(obj), new lub(this.f, obj));
    }

    @Override // defpackage.t6
    public final boolean p(Object obj, Object obj2) {
        return n(obj).remove(obj2);
    }

    @Override // defpackage.t6
    public final int q() {
        return this.e.q();
    }
}
