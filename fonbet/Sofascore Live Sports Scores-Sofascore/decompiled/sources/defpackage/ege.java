package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ege {
    public final o6a a;
    public final bge c;
    public boolean d = false;
    public rk3 b = rk3.d;

    public ege(o6a o6aVar, bge bgeVar) {
        this.a = o6aVar;
        this.c = bgeVar;
    }

    public final void a(rk3 rk3Var) {
        this.b = rk3Var;
        if (rk3Var == rk3.b || rk3Var == rk3.c) {
            this.d = true;
        } else if (rk3Var == rk3.d) {
            this.d = false;
        }
    }
}
