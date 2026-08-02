package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class led implements ywj {
    public final lxj a;
    public final xt9 b;

    public led(lxj lxjVar, xt9 xt9Var) {
        this.a = lxjVar;
        this.b = xt9Var;
    }

    @Override // defpackage.ywj
    public final void a() {
        xt9 xt9Var = this.b;
        boolean z = xt9Var instanceof fmi;
        lxj lxjVar = this.a;
        if (z) {
            lxjVar.c(((fmi) xt9Var).a);
        } else if (xt9Var instanceof gq5) {
            lxjVar.I(((gq5) xt9Var).a);
        }
    }
}
