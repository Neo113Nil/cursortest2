package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r54 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public r54(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r54)) {
            return false;
        }
        r54 r54Var = (r54) obj;
        return Intrinsics.c(this.a, r54Var.a) && this.b == r54Var.b && this.c == r54Var.c && this.d == r54Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrowdsourcingIncidentStaticFormData(title=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isSaveEnabled=");
        return w1l.i(", canDelete=", ")", sb, this.c, this.d);
    }
}
