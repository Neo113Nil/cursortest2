package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class na4 {
    public String a;
    public int b;
    public int c;
    public float d;

    public final String toString() {
        String q = lnb.q(new StringBuilder(), this.a, ':');
        switch (this.b) {
            case 900:
                return q + this.c;
            case 901:
                return q + this.d;
            case 902:
                return q.concat("#".concat(bf3.i(this.c, new StringBuilder("00000000")).substring(r3.length() - 8)));
            case 903:
                return q.concat("null");
            default:
                return q.concat("????");
        }
    }
}
