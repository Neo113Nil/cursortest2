package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ep2 extends cp2 {
    public final char a;
    public final char b;

    public ep2(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.ip2
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + ip2.d(this.a) + ip2.d(this.b) + "\")";
    }
}
