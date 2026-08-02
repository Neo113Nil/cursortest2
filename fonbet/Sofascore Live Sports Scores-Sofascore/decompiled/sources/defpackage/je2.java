package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class je2 {
    public static final je2 n = new je2(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final je2 o;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    static {
        wd5 wd5Var = xd5.b;
        be5 be5Var = be5.SECONDS;
        long k = xd5.k(wkn.R(Integer.MAX_VALUE, be5Var), be5Var);
        if (k >= 0) {
            o = new je2(false, false, -1, -1, false, false, false, k <= 2147483647L ? (int) k : Integer.MAX_VALUE, -1, true, false, false, null);
        } else {
            ogj.h(vxd.l(k, "maxStale < 0: "));
        }
    }

    public je2(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            wt3.u(i, "max-age=", ", ", sb);
        }
        int i2 = this.d;
        if (i2 != -1) {
            wt3.u(i2, "s-maxage=", ", ", sb);
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            wt3.u(i3, "max-stale=", ", ", sb);
        }
        int i4 = this.i;
        if (i4 != -1) {
            wt3.u(i4, "min-fresh=", ", ", sb);
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String sb2 = sb.toString();
        this.m = sb2;
        return sb2;
    }
}
