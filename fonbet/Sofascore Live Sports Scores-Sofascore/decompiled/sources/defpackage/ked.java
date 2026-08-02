package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ked implements zwj {
    public final kxj a;
    public final wt9 b;

    public ked(kxj kxjVar, wt9 wt9Var) {
        this.a = kxjVar;
        this.b = wt9Var;
    }

    @Override // defpackage.zwj
    public final void a() {
        wt9 wt9Var = this.b;
        boolean z = wt9Var instanceof emi;
        kxj kxjVar = this.a;
        if (z) {
            kxjVar.A(((emi) wt9Var).a);
        } else if (wt9Var instanceof fq5) {
            kxjVar.D(((fq5) wt9Var).a);
        } else {
            zzl.b();
        }
    }
}
