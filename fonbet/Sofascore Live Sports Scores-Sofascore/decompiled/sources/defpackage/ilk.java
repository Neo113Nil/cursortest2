package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ilk {
    public final String a;
    public final Integer b;
    public final int c;
    public final int d;
    public final String e;
    public final Boolean f;
    public final Boolean g;
    public final String h;

    public ilk(String str, Integer num, int i, int i2, String str2, Boolean bool, Boolean bool2, String str3) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = num;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = bool;
        this.g = bool2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilk)) {
            return false;
        }
        ilk ilkVar = (ilk) obj;
        return Intrinsics.c(this.a, ilkVar.a) && Intrinsics.c(this.b, ilkVar.b) && this.c == ilkVar.c && this.d == ilkVar.d && Intrinsics.c(this.e, ilkVar.e) && Intrinsics.c(this.f, ilkVar.f) && Intrinsics.c(this.g, ilkVar.g) && Intrinsics.c(this.h, ilkVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int c = dmi.c(wv8.a(this.d, wv8.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.e);
        Boolean bool = this.f;
        int hashCode2 = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        return this.h.hashCode() + ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaFile(value=");
        sb.append(this.a);
        sb.append(", bitrate=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", delivery=");
        sb.append(this.e);
        sb.append(", maintainAspectRatio=");
        sb.append(this.f);
        sb.append(", scalable=");
        sb.append(this.g);
        sb.append(", type=");
        return lnb.q(sb, this.h, ')');
    }
}
