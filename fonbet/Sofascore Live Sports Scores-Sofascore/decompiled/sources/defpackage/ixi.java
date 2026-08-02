package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ixi {
    public final String a;
    public final String b;

    public ixi(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixi)) {
            return false;
        }
        ixi ixiVar = (ixi) obj;
        return Intrinsics.c(this.a, ixiVar.a) && Intrinsics.c(this.b, ixiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return bf3.k("CountryUiModel(name=", this.a, ", alpha2=", this.b, ")");
    }
}
