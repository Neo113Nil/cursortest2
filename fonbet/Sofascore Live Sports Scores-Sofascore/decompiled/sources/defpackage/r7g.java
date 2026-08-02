package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r7g implements k41, fo3 {
    public final gmb a;
    public final o41 b;
    public abh c;

    public r7g(gmb gmbVar, p41 p41Var, q7g q7gVar) {
        this.a = gmbVar;
        o41 g = q7gVar.a.g();
        this.b = g;
        p41Var.f(g);
        g.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.k41
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
    }
}
