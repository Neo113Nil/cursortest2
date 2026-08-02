package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uv3 {
    public final String a;
    public final String b;
    public final boolean c;

    public uv3(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv3)) {
            return false;
        }
        uv3 uv3Var = (uv3) obj;
        return Intrinsics.c(this.a, uv3Var.a) && Intrinsics.c(this.b, uv3Var.b) && this.c == uv3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return wt3.p(mz1.s("CountryUiModel(name=", this.a, ", iso2Alpha=", this.b, ", isFavorite="), this.c, ")");
    }
}
