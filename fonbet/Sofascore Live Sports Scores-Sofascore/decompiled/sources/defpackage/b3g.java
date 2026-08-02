package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b3g extends cea {
    public final lj2 e;

    public b3g(lj2 lj2Var) {
        this.e = lj2Var;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return false;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        p2g p2gVar = w2g.b;
        this.e.resumeWith(Unit.a);
    }
}
