package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dp2 extends cp2 {
    public final /* synthetic */ int a;
    public final char b;

    public /* synthetic */ dp2(char c, int i) {
        this.a = i;
        this.b = c;
    }

    @Override // defpackage.ip2
    public final boolean b(char c) {
        switch (this.a) {
            case 0:
                if (c == this.b) {
                }
                break;
            default:
                if (c != this.b) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.cp2, defpackage.ip2
    public final ip2 c() {
        switch (this.a) {
            case 0:
                return new dp2(this.b, 1);
            default:
                return new dp2(this.b, 0);
        }
    }

    public final String toString() {
        int i = this.a;
        char c = this.b;
        switch (i) {
            case 0:
                return "CharMatcher.is('" + ip2.d(c) + "')";
            default:
                return "CharMatcher.isNot('" + ip2.d(c) + "')";
        }
    }
}
