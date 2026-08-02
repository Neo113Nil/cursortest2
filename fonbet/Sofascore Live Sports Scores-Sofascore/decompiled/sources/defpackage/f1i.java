package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f1i {
    public final List a;
    public final boolean b;
    public final boolean c;

    public f1i(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1i)) {
            return false;
        }
        f1i f1iVar = (f1i) obj;
        return Intrinsics.c(this.a, f1iVar.a) && this.b == f1iVar.b && this.c == f1iVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageCategorySeasonsWrapper(seasons=");
        sb.append(this.a);
        sb.append(", hasRankings=");
        sb.append(this.b);
        sb.append(", hasOdds=");
        return wt3.p(sb, this.c, ")");
    }
}
