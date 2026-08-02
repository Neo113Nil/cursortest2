package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class f2h {
    public final Object a;
    public final ct8 b;
    public final ct8 c;
    public final Object d;
    public final hoi e;
    public final ct8 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ h2h i;

    public f2h(h2h h2hVar, Object obj, ct8 ct8Var, ct8 ct8Var2, Object obj2, hoi hoiVar, ct8 ct8Var3) {
        this.i = h2hVar;
        this.a = obj;
        this.b = ct8Var;
        this.c = ct8Var2;
        this.d = obj2;
        this.e = hoiVar;
        this.f = ct8Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof z0h) {
            ((z0h) obj).h(this.h, this.i.a);
            return;
        }
        q55 q55Var = obj instanceof q55 ? (q55) obj : null;
        if (q55Var != null) {
            q55Var.d();
        }
    }
}
