package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ap2 extends fp2 {
    public static final ap2 c = new ap2("CharMatcher.any()", 0);
    public static final ap2 d = new ap2("CharMatcher.ascii()", 1);
    public static final ap2 e = new ap2("CharMatcher.javaIsoControl()", 2);
    public static final ap2 f = new ap2("CharMatcher.none()", 3);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap2(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.ip2
    public final boolean b(char c2) {
        switch (this.b) {
            case 0:
                return true;
            case 1:
                return c2 <= 127;
            case 2:
                return c2 <= 31 || (c2 >= 127 && c2 <= 159);
            default:
                return false;
        }
    }

    @Override // defpackage.cp2, defpackage.ip2
    public ip2 c() {
        switch (this.b) {
            case 0:
                return f;
            case 3:
                return c;
            default:
                return super.c();
        }
    }
}
