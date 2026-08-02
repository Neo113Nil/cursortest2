package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fnf {
    public String a = null;
    public Long b = null;
    public String c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnf)) {
            return false;
        }
        fnf fnfVar = (fnf) obj;
        return Intrinsics.c(this.a, fnfVar.a) && Intrinsics.c(this.b, fnfVar.b) && Intrinsics.c(this.c, fnfVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder(url=");
        sb.append(this.a);
        sb.append(", length=");
        sb.append(this.b);
        sb.append(", type=");
        return lnb.q(sb, this.c, ')');
    }
}
