package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z3 implements Runnable {
    public final g4 a;
    public final ddb b;

    public z3(g4 g4Var, ddb ddbVar) {
        this.a = g4Var;
        this.b = ddbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (g4.f.x(this.a, this, g4.h(this.b))) {
            g4.e(this.a, false);
        }
    }
}
