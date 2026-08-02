package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z8g {
    public String a;
    public String b;
    public String c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8g)) {
            return false;
        }
        z8g z8gVar = (z8g) obj;
        return Intrinsics.c(this.a, z8gVar.a) && Intrinsics.c(this.b, z8gVar.b) && Intrinsics.c(this.c, z8gVar.c) && Intrinsics.c(this.d, z8gVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder(title=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", link=");
        sb.append(this.c);
        sb.append(", description=");
        return lnb.q(sb, this.d, ')');
    }
}
