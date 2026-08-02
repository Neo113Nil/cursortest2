package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uz8 extends g6b {
    public static final uz8 b = new uz8();
    public static final tz8 c = new tz8();

    @Override // defpackage.g6b
    public final void a(t6b t6bVar) {
        if (!(t6bVar instanceof rq4)) {
            is8.b(t6bVar, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
            return;
        }
        rq4 rq4Var = (rq4) t6bVar;
        tz8 tz8Var = c;
        rq4Var.i(tz8Var);
        rq4Var.onStart(tz8Var);
        rq4Var.e(tz8Var);
    }

    @Override // defpackage.g6b
    public final e6b b() {
        return e6b.e;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // defpackage.g6b
    public final void d(t6b t6bVar) {
    }
}
