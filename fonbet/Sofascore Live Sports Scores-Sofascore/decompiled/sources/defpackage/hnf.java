package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hnf {
    public String a = null;
    public String b = null;
    public String c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnf)) {
            return false;
        }
        hnf hnfVar = (hnf) obj;
        return Intrinsics.c(this.a, hnfVar.a) && Intrinsics.c(this.b, hnfVar.b) && Intrinsics.c(this.c, hnfVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder(url=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", medium=");
        return lnb.q(sb, this.c, ')');
    }
}
