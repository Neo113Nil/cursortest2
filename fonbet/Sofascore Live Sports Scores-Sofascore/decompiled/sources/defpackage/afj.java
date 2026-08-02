package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class afj {
    public final String a;
    public String b;
    public boolean c = false;
    public f8e d = null;

    public afj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afj)) {
            return false;
        }
        afj afjVar = (afj) obj;
        return Intrinsics.c(this.a, afjVar.a) && Intrinsics.c(this.b, afjVar.b) && this.c == afjVar.c && Intrinsics.c(this.d, afjVar.d);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        f8e f8eVar = this.d;
        return e + (f8eVar == null ? 0 : f8eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.d);
        sb.append(", isShowingSubstitution=");
        return lnb.r(sb, this.c, ')');
    }
}
