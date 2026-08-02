package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pca {
    public String a;
    public List b;
    public String c;
    public String d;
    public String e;
    public List f;
    public String g;
    public uca h;
    public String i;
    public String j;
    public String k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pca)) {
            return false;
        }
        pca pcaVar = (pca) obj;
        return Intrinsics.c(this.a, pcaVar.a) && this.b.equals(pcaVar.b) && Intrinsics.c(this.c, pcaVar.c) && Intrinsics.c(this.d, pcaVar.d) && Intrinsics.c(this.e, pcaVar.e) && this.f.equals(pcaVar.f) && Intrinsics.c(this.g, pcaVar.g) && Intrinsics.c(this.h, pcaVar.h) && Intrinsics.c(this.i, pcaVar.i) && Intrinsics.c(this.j, pcaVar.j) && Intrinsics.c(this.k, pcaVar.k);
    }

    public final int hashCode() {
        String str = this.a;
        int d = dmi.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int d2 = dmi.d((hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
        String str5 = this.g;
        int hashCode3 = (d2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        uca ucaVar = this.h;
        int hashCode4 = (hashCode3 + (ucaVar == null ? 0 : ucaVar.hashCode())) * 31;
        String str6 = this.i;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        return hashCode6 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder(author=");
        sb.append(this.a);
        sb.append(", categories=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", explicit=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", keywords=");
        sb.append(this.f);
        sb.append(", newsFeedUrl=");
        sb.append(this.g);
        sb.append(", owner=");
        sb.append(this.h);
        sb.append(", subtitle=");
        sb.append(this.i);
        sb.append(", summary=");
        sb.append(this.j);
        sb.append(", type=");
        return lnb.q(sb, this.k, ')');
    }
}
