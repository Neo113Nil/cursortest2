package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h24 implements rwj {
    public final int b;

    public h24(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        a70.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.rwj
    public final ywj a(lxj lxjVar, xt9 xt9Var) {
        return !(xt9Var instanceof fmi) ? new led(lxjVar, xt9Var) : ((fmi) xt9Var).c == 1 ? new led(lxjVar, xt9Var) : new j24(lxjVar, xt9Var, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h24) {
            return this.b == ((h24) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b * 31);
    }
}
