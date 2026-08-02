package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gn8 extends d7e {
    public final d7e f;
    public final long g;
    public final Function2 h;
    public an8 i;

    public gn8(d7e d7eVar, ay1 ay1Var, long j, Function2 function2) {
        d7eVar.getClass();
        this.f = d7eVar;
        this.g = j;
        this.h = function2;
        this.i = new an8(d7eVar, ay1Var);
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        if (ay1Var != null) {
            return true;
        }
        this.i = new an8(this.f, ay1Var);
        return true;
    }

    @Override // defpackage.d7e
    public final long i() {
        return this.g;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        ha5Var.getClass();
        this.h.invoke(ha5Var, this.i);
    }
}
