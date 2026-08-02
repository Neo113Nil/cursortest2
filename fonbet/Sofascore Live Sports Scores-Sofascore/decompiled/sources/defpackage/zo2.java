package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zo2 extends ip2 {
    public final ip2 a;
    public final ip2 b;

    public zo2(ip2 ip2Var, ip2 ip2Var2) {
        this.a = ip2Var;
        ip2Var2.getClass();
        this.b = ip2Var2;
    }

    @Override // defpackage.m3f
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    @Override // defpackage.ip2
    public final boolean b(char c) {
        return this.a.b(c) && this.b.b(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
