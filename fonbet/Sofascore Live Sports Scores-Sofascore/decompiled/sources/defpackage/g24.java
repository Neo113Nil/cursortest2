package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g24 implements qwj {
    public final int b;

    public g24(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        a70.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.qwj
    public final zwj a(kxj kxjVar, wt9 wt9Var) {
        return !(wt9Var instanceof emi) ? new ked(kxjVar, wt9Var) : ((emi) wt9Var).c == pe4.a ? new ked(kxjVar, wt9Var) : new i24(kxjVar, wt9Var, this.b);
    }
}
