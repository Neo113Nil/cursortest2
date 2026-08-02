package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dt3 extends wtc implements p3h {
    public boolean o;
    public final boolean p;
    public Function1 q;

    public dt3(Function1 function1, boolean z, boolean z2) {
        this.o = z;
        this.p = z2;
        this.q = function1;
    }

    @Override // defpackage.p3h
    public final boolean M() {
        return this.p;
    }

    @Override // defpackage.p3h
    public final boolean U0() {
        return this.o;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        this.q.invoke(b4hVar);
    }
}
