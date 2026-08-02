package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i24 implements zwj {
    public final kxj a;
    public final wt9 b;
    public final int c;

    public i24(kxj kxjVar, wt9 wt9Var, int i) {
        this.a = kxjVar;
        this.b = wt9Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        a70.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.zwj
    public final void a() {
        kxj kxjVar = this.a;
        Drawable n = kxjVar.n();
        wt9 wt9Var = this.b;
        nr9 b = wt9Var.b();
        boolean z = wt9Var instanceof emi;
        a24 a24Var = new a24(n, b != null ? rfo.t(b, kxjVar.getView().getResources()) : null, wt9Var.a().t, this.c, (z && ((emi) wt9Var).g) ? false : true);
        if (z) {
            kxjVar.A(rfo.u(a24Var));
        } else if (wt9Var instanceof fq5) {
            kxjVar.D(rfo.u(a24Var));
        } else {
            zzl.b();
        }
    }
}
