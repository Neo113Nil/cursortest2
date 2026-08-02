package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gol {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;

    public gol(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gol)) {
            return false;
        }
        gol golVar = (gol) obj;
        return Intrinsics.c(this.a, golVar.a) && Intrinsics.c(this.b, golVar.b) && Intrinsics.c(this.c, golVar.c) && Intrinsics.c(this.d, golVar.d) && Intrinsics.c(this.e, golVar.e) && Intrinsics.c(this.f, golVar.f) && Intrinsics.c(this.g, golVar.g);
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
        StringBuilder sb = new StringBuilder("YoutubeItemData(videoId=");
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
