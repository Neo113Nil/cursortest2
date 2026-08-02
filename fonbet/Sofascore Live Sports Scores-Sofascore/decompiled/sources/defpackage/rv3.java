package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rv3 {
    public final String a;
    public final String b;

    public rv3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv3)) {
            return false;
        }
        rv3 rv3Var = (rv3) obj;
        return this.a.equals(rv3Var.a) && Intrinsics.c(this.b, rv3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return bf3.k("LocalisedCategoryName(name=", this.a, ", description=", this.b, ")");
    }
}
