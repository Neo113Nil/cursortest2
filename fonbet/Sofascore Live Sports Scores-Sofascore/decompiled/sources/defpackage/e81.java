package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e81 implements nk2 {
    public final vj1 a;
    public final int b;
    public final joa c = ypa.a(ysa.c, new z0(this, 27));

    public e81(vj1 vj1Var) {
        this.a = vj1Var;
        this.b = vj1Var.b;
    }

    @Override // defpackage.nk2
    public final int d() {
        return this.b;
    }

    @Override // defpackage.nk2
    public final List g() {
        return (List) this.c.getValue();
    }
}
