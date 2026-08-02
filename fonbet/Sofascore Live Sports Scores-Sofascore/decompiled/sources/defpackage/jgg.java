package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jgg {
    public final String a;
    public final String b;
    public final bdg c;
    public final ddg d;
    public final List e;
    public final String f;

    public jgg(String str, String str2, bdg bdgVar, ddg ddgVar, List list, String str3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = bdgVar;
        this.d = ddgVar;
        this.e = list;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgg)) {
            return false;
        }
        jgg jggVar = (jgg) obj;
        return Intrinsics.c(this.a, jggVar.a) && Intrinsics.c(this.b, jggVar.b) && this.c == jggVar.c && this.d == jggVar.d && Intrinsics.c(this.e, jggVar.e) && Intrinsics.c(this.f, jggVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dmi.d((this.d.hashCode() + ((this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder s = mz1.s("SASReceivedDigitalServiceActConfig(behalf=", this.a, ", paid=", this.b, ", adRender=");
        s.append(this.c);
        s.append(", pubRender=");
        s.append(this.d);
        s.append(", transparency=");
        s.append(this.e);
        s.append(", rawConfig=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
