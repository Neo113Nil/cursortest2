package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oxh {
    public final Object a;
    public final String b;
    public final ct8 c;
    public final ct8 d;
    public final pxh e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ oxh(Object obj, String str, ct8 ct8Var, tc3 tc3Var, pxh pxhVar, boolean z, int i) {
        this(obj, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : ct8Var, (i & 8) != 0 ? null : tc3Var, (i & 16) != 0 ? null : pxhVar, (i & 32) == 0, (i & 64) != 0, (i & 128) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [ct8] */
    public static oxh a(oxh oxhVar, String str, ct8 ct8Var, tc3 tc3Var, int i) {
        Object obj = oxhVar.a;
        if ((i & 2) != 0) {
            str = oxhVar.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            ct8Var = oxhVar.c;
        }
        ct8 ct8Var2 = ct8Var;
        tc3 tc3Var2 = tc3Var;
        if ((i & 8) != 0) {
            tc3Var2 = oxhVar.d;
        }
        tc3 tc3Var3 = tc3Var2;
        pxh pxhVar = (i & 16) != 0 ? oxhVar.e : null;
        boolean z = oxhVar.f;
        boolean z2 = oxhVar.g;
        boolean z3 = oxhVar.h;
        oxhVar.getClass();
        return new oxh(obj, str2, ct8Var2, tc3Var3, pxhVar, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxh)) {
            return false;
        }
        oxh oxhVar = (oxh) obj;
        return Intrinsics.c(this.a, oxhVar.a) && Intrinsics.c(this.b, oxhVar.b) && Intrinsics.c(this.c, oxhVar.c) && Intrinsics.c(this.d, oxhVar.d) && Intrinsics.c(this.e, oxhVar.e) && this.f == oxhVar.f && this.g == oxhVar.g && this.h == oxhVar.h;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ct8 ct8Var = this.c;
        int hashCode3 = (hashCode2 + (ct8Var == null ? 0 : ct8Var.hashCode())) * 31;
        ct8 ct8Var2 = this.d;
        int hashCode4 = (hashCode3 + (ct8Var2 == null ? 0 : ct8Var2.hashCode())) * 31;
        pxh pxhVar = this.e;
        return Boolean.hashCode(this.h) + dmi.e(dmi.e((hashCode4 + (pxhVar != null ? pxhVar.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinnerItem(item=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", leadingIconFirst=");
        sb.append(this.c);
        sb.append(", leadingIconSecond=");
        sb.append(this.d);
        sb.append(", endContent=");
        sb.append(this.e);
        sb.append(", isPlaceholder=");
        sb.append(this.f);
        sb.append(", isSelectable=");
        return w1l.i(", hasTopBorder=", ")", sb, this.g, this.h);
    }

    public oxh(Object obj, String str, ct8 ct8Var, ct8 ct8Var2, pxh pxhVar, boolean z, boolean z2, boolean z3) {
        this.a = obj;
        this.b = str;
        this.c = ct8Var;
        this.d = ct8Var2;
        this.e = pxhVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }
}
