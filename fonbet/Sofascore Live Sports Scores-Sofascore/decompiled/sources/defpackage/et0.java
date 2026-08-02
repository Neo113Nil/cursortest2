package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class et0 {
    public long a;
    public String b;
    public hx3 c;
    public ix3 d;
    public jx3 e;
    public mx3 f;
    public byte g;

    public final ft0 a() {
        String str;
        hx3 hx3Var;
        ix3 ix3Var;
        if (this.g == 1 && (str = this.b) != null && (hx3Var = this.c) != null && (ix3Var = this.d) != null) {
            return new ft0(this.a, str, hx3Var, ix3Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
