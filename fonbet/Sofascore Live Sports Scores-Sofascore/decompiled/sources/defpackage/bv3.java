package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bv3 {
    public final String a;
    public final String b;

    public bv3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv3)) {
            return false;
        }
        bv3 bv3Var = (bv3) obj;
        return Intrinsics.c(this.a, bv3Var.a) && Intrinsics.c(this.b, bv3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + dmi.c(Boolean.hashCode(true) * 31, 31, this.a);
    }

    public final String toString() {
        return bf3.k("CountryChangedWrapper(showSnackbar=true, selectedCountryName=", this.a, ", selectedCountryAlpha2=", this.b, ")");
    }
}
