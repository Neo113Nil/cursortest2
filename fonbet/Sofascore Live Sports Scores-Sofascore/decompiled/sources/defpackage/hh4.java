package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hh4 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;
    public final List e;

    public hh4(boolean z, boolean z2, String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = list;
        this.e = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    public static hh4 a(hh4 hh4Var, ArrayList arrayList, List list, int i) {
        boolean z = hh4Var.a;
        boolean z2 = hh4Var.b;
        String str = hh4Var.c;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = hh4Var.d;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 16) != 0) {
            list = hh4Var.e;
        }
        List list2 = list;
        hh4Var.getClass();
        arrayList3.getClass();
        list2.getClass();
        return new hh4(z, z2, str, arrayList3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh4)) {
            return false;
        }
        hh4 hh4Var = (hh4) obj;
        return this.a == hh4Var.a && this.b == hh4Var.b && Intrinsics.c(this.c, hh4Var.c) && Intrinsics.c(this.d, hh4Var.d) && Intrinsics.c(this.e, hh4Var.e);
    }

    public final int hashCode() {
        int e = dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + dmi.d((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder k = w1l.k("DateMatchesState(firstInitDone=", this.a, ", isFilterActive=", this.b, ", nextEventfulDay=");
        k.append(this.c);
        k.append(", categories=");
        k.append(this.d);
        k.append(", pinnedItems=");
        return mz1.p(k, this.e, ")");
    }
}
