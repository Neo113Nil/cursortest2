package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fol {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public Integer f = null;
    public Integer g = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fol)) {
            return false;
        }
        fol folVar = (fol) obj;
        return Intrinsics.c(this.a, folVar.a) && Intrinsics.c(this.b, folVar.b) && Intrinsics.c(this.c, folVar.c) && Intrinsics.c(this.d, folVar.d) && Intrinsics.c(this.e, folVar.e) && Intrinsics.c(this.f, folVar.f) && Intrinsics.c(this.g, folVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder(videoId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", videoUrl=");
        sb.append(this.c);
        sb.append(", thumbnailUrl=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", viewsCount=");
        sb.append(this.f);
        sb.append(", likesCount=");
        return bf3.n(sb, this.g, ')');
    }
}
