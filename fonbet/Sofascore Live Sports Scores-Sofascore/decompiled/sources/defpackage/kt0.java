package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kt0 extends bx3 {
    public final String a;
    public final String b;
    public final List c;
    public final bx3 d;
    public final int e;

    public kt0(String str, String str2, List list, bx3 bx3Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = bx3Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bx3) {
            kt0 kt0Var = (kt0) ((bx3) obj);
            if (this.a.equals(kt0Var.a)) {
                String str = kt0Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(kt0Var.c)) {
                        bx3 bx3Var = kt0Var.d;
                        bx3 bx3Var2 = this.d;
                        if (bx3Var2 != null ? bx3Var2.equals(bx3Var) : bx3Var == null) {
                            if (this.e == kt0Var.e) {
                                return true;
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
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        bx3 bx3Var = this.d;
        return this.e ^ ((hashCode2 ^ (bx3Var != null ? bx3Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return fc6.h(this.e, "}", sb);
    }
}
