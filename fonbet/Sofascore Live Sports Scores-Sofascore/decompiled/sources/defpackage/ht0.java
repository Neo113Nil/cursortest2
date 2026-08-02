package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ht0 extends hx3 {
    public final fx3 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final gx3 e;
    public final List f;
    public final int g;

    public ht0(fx3 fx3Var, List list, List list2, Boolean bool, gx3 gx3Var, List list3, int i) {
        this.a = fx3Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = gx3Var;
        this.f = list3;
        this.g = i;
    }

    @Override // defpackage.hx3
    public final gt0 a() {
        gt0 gt0Var = new gt0();
        gt0Var.a = this.a;
        gt0Var.b = this.b;
        gt0Var.c = this.c;
        gt0Var.d = this.d;
        gt0Var.e = this.e;
        gt0Var.f = this.f;
        gt0Var.g = this.g;
        gt0Var.h = (byte) 1;
        return gt0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hx3) {
            ht0 ht0Var = (ht0) ((hx3) obj);
            if (this.a.equals(ht0Var.a)) {
                List list = ht0Var.b;
                List list2 = this.b;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = ht0Var.c;
                    List list4 = this.c;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        Boolean bool = ht0Var.d;
                        Boolean bool2 = this.d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            gx3 gx3Var = ht0Var.e;
                            gx3 gx3Var2 = this.e;
                            if (gx3Var2 != null ? gx3Var2.equals(gx3Var) : gx3Var == null) {
                                List list5 = ht0Var.f;
                                List list6 = this.f;
                                if (list6 != null ? list6.equals(list5) : list5 == null) {
                                    if (this.g == ht0Var.g) {
                                        return true;
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
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        gx3 gx3Var = this.e;
        int hashCode5 = (hashCode4 ^ (gx3Var == null ? 0 : gx3Var.hashCode())) * 1000003;
        List list3 = this.f;
        return this.g ^ ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return fc6.h(this.g, "}", sb);
    }
}
