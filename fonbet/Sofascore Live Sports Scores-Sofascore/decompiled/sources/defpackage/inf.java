package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class inf {
    public final String a;
    public final String b;
    public final String c;

    public inf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inf)) {
            return false;
        }
        inf infVar = (inf) obj;
        return Intrinsics.c(this.a, infVar.a) && Intrinsics.c(this.b, infVar.b) && Intrinsics.c(this.c, infVar.c);
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
        StringBuilder sb = new StringBuilder("RawMediaContent(url=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", medium=");
        return lnb.q(sb, this.c, ')');
    }
}
