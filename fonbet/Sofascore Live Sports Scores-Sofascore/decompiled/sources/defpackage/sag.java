package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sag {
    public final String a;
    public final String b;
    public final bdg c;
    public final ddg d;
    public final List e;

    public sag(String str, String str2, bdg bdgVar, ddg ddgVar, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = bdgVar;
        this.d = ddgVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sag)) {
            return false;
        }
        sag sagVar = (sag) obj;
        return Intrinsics.c(this.a, sagVar.a) && Intrinsics.c(this.b, sagVar.b) && this.c == sagVar.c && this.d == sagVar.d && Intrinsics.c(this.e, sagVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = mz1.s("DigitalServiceAct(behalf=", this.a, ", paid=", this.b, ", adRender=");
        s.append(this.c);
        s.append(", pubRender=");
        s.append(this.d);
        s.append(", transparency=");
        return mz1.p(s, this.e, ")");
    }
}
