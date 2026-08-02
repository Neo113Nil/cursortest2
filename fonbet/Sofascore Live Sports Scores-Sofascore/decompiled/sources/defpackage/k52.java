package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k52 extends pw0 {
    public lj2 a;
    public Function1 b;

    @Override // defpackage.pw0
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.pw0
    public final void b(Throwable th) {
        lj2 lj2Var = this.a;
        if (lj2Var != null) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(y6a.x(th));
        }
    }
}
