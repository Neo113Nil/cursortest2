package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qca {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final uca h;
    public final String i;
    public final String j;
    public final String k;

    public qca(String str, List list, String str2, String str3, String str4, List list2, String str5, uca ucaVar, String str6, String str7, String str8) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list2;
        this.g = str5;
        this.h = ucaVar;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qca)) {
            return false;
        }
        qca qcaVar = (qca) obj;
        return Intrinsics.c(this.a, qcaVar.a) && this.b.equals(qcaVar.b) && Intrinsics.c(this.c, qcaVar.c) && Intrinsics.c(this.d, qcaVar.d) && Intrinsics.c(this.e, qcaVar.e) && this.f.equals(qcaVar.f) && Intrinsics.c(this.g, qcaVar.g) && Intrinsics.c(this.h, qcaVar.h) && Intrinsics.c(this.i, qcaVar.i) && Intrinsics.c(this.j, qcaVar.j) && Intrinsics.c(this.k, qcaVar.k);
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
        StringBuilder sb = new StringBuilder("ItunesChannelData(author=");
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
