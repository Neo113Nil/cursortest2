package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j24 implements ywj {
    public final lxj a;
    public final xt9 b;
    public final int c;

    public j24(lxj lxjVar, xt9 xt9Var, int i) {
        this.a = lxjVar;
        this.b = xt9Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        a70.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.ywj
    public final void a() {
        lxj lxjVar = this.a;
        Drawable n = lxjVar.n();
        xt9 xt9Var = this.b;
        boolean z = xt9Var instanceof fmi;
        b24 b24Var = new b24(n, xt9Var.a(), xt9Var.b().C, this.c, (z && ((fmi) xt9Var).g) ? false : true);
        if (z) {
            lxjVar.c(b24Var);
        } else if (xt9Var instanceof gq5) {
            lxjVar.I(b24Var);
        }
    }
}
