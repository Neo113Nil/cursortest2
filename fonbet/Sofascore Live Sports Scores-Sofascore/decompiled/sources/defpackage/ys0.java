package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ys0 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public yw3 g;
    public px3 h;
    public ox3 i;
    public zw3 j;
    public List k;
    public int l;
    public byte m;

    public final zs0 a() {
        String str;
        String str2;
        yw3 yw3Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (yw3Var = this.g) != null) {
            return new zs0(str, str2, this.c, this.d, this.e, this.f, yw3Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
