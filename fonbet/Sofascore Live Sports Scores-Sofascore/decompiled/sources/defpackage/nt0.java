package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nt0 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final ot0 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new ot0(this.a, str, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
