package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zs0 extends qx3 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final yw3 g;
    public final px3 h;
    public final ox3 i;
    public final zw3 j;
    public final List k;
    public final int l;

    public zs0(String str, String str2, String str3, long j, Long l, boolean z, yw3 yw3Var, px3 px3Var, ox3 ox3Var, zw3 zw3Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = yw3Var;
        this.h = px3Var;
        this.i = ox3Var;
        this.j = zw3Var;
        this.k = list;
        this.l = i;
    }

    @Override // defpackage.qx3
    public final ys0 a() {
        ys0 ys0Var = new ys0();
        ys0Var.a = this.a;
        ys0Var.b = this.b;
        ys0Var.c = this.c;
        ys0Var.d = this.d;
        ys0Var.e = this.e;
        ys0Var.f = this.f;
        ys0Var.g = this.g;
        ys0Var.h = this.h;
        ys0Var.i = this.i;
        ys0Var.j = this.j;
        ys0Var.k = this.k;
        ys0Var.l = this.l;
        ys0Var.m = (byte) 7;
        return ys0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qx3) {
            zs0 zs0Var = (zs0) ((qx3) obj);
            if (this.a.equals(zs0Var.a) && this.b.equals(zs0Var.b)) {
                String str = zs0Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == zs0Var.d) {
                        Long l = zs0Var.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == zs0Var.f && this.g.equals(zs0Var.g)) {
                                px3 px3Var = zs0Var.h;
                                px3 px3Var2 = this.h;
                                if (px3Var2 != null ? px3Var2.equals(px3Var) : px3Var == null) {
                                    ox3 ox3Var = zs0Var.i;
                                    ox3 ox3Var2 = this.i;
                                    if (ox3Var2 != null ? ox3Var2.equals(ox3Var) : ox3Var == null) {
                                        zw3 zw3Var = zs0Var.j;
                                        zw3 zw3Var2 = this.j;
                                        if (zw3Var2 != null ? zw3Var2.equals(zw3Var) : zw3Var == null) {
                                            List list = zs0Var.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == zs0Var.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        px3 px3Var = this.h;
        int hashCode4 = (hashCode3 ^ (px3Var == null ? 0 : px3Var.hashCode())) * 1000003;
        ox3 ox3Var = this.i;
        int hashCode5 = (hashCode4 ^ (ox3Var == null ? 0 : ox3Var.hashCode())) * 1000003;
        zw3 zw3Var = this.j;
        int hashCode6 = (hashCode5 ^ (zw3Var == null ? 0 : zw3Var.hashCode())) * 1000003;
        List list = this.k;
        return this.l ^ ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return fc6.h(this.l, "}", sb);
    }
}
