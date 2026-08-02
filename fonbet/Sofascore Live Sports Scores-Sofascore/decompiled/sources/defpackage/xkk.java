package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xkk {
    public final String a;
    public final mlk b;
    public final String c;
    public final ArrayList d;
    public final klk e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public xkk(String str, mlk mlkVar, String str2, ArrayList arrayList, klk klkVar, String str3, String str4, int i, int i2) {
        this.a = str;
        this.b = mlkVar;
        this.c = str2;
        this.d = arrayList;
        this.e = klkVar;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkk)) {
            return false;
        }
        xkk xkkVar = (xkk) obj;
        return Intrinsics.c(this.a, xkkVar.a) && this.b.equals(xkkVar.b) && Intrinsics.c(this.c, xkkVar.c) && this.d.equals(xkkVar.d) && Intrinsics.c(this.e, xkkVar.e) && Intrinsics.c(this.f, xkkVar.f) && Intrinsics.c(this.g, xkkVar.g) && this.h == xkkVar.h && this.i == xkkVar.i;
    }

    public final int hashCode() {
        String str = this.a;
        int d = dmi.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a);
        String str2 = this.c;
        int d2 = vxd.d(this.d, (d + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        klk klkVar = this.e;
        int hashCode = (d2 + (klkVar == null ? 0 : klkVar.hashCode())) * 31;
        String str3 = this.f;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return Integer.hashCode(this.i) + wv8.a(this.h, (hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompanionAd(id=");
        sb.append(this.a);
        sb.append(", trackingEvents=");
        sb.append(this.b);
        sb.append(", clickThrough=");
        sb.append(this.c);
        sb.append(", clickTracking=");
        sb.append(this.d);
        sb.append(", staticResource=");
        sb.append(this.e);
        sb.append(", iframeResource=");
        sb.append(this.f);
        sb.append(", htmlResource=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        return wv8.j(sb, this.i, ')');
    }
}
