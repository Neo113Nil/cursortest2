package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ut0 {
    public wt0 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final vt0 a() {
        wt0 wt0Var;
        String str;
        String str2;
        if (this.e == 1 && (wt0Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new vt0(wt0Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
