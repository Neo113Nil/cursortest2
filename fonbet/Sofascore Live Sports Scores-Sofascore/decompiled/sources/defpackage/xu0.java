package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xu0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;

    public final yu0 a() {
        if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
            return new yu0(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        if (this.c == null) {
            sb.append(" parameterKey");
        }
        if (this.d == null) {
            sb.append(" parameterValue");
        }
        if ((this.f & 1) == 0) {
            sb.append(" templateVersion");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
