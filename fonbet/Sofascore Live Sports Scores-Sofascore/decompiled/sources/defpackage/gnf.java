package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gnf {
    public final String a;
    public final Long b;
    public final String c;

    public gnf(String str, String str2, Long l) {
        this.a = str;
        this.b = l;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnf)) {
            return false;
        }
        gnf gnfVar = (gnf) obj;
        return Intrinsics.c(this.a, gnfVar.a) && Intrinsics.c(this.b, gnfVar.b) && Intrinsics.c(this.c, gnfVar.c);
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
        StringBuilder sb = new StringBuilder("RawEnclosure(url=");
        sb.append(this.a);
        sb.append(", length=");
        sb.append(this.b);
        sb.append(", type=");
        return lnb.q(sb, this.c, ')');
    }
}
