package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class old {
    public final yld a;
    public final String b;
    public final boolean c;
    public final Double d;
    public final Boolean e;
    public final String f;
    public final String g;

    public old(yld yldVar, String str, boolean z, Double d, Boolean bool, String str2, String str3) {
        this.a = yldVar;
        this.b = str;
        this.c = z;
        this.d = d;
        this.e = bool;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof old)) {
            return false;
        }
        old oldVar = (old) obj;
        return Intrinsics.c(this.a, oldVar.a) && Intrinsics.c(this.b, oldVar.b) && this.c == oldVar.c && Intrinsics.c(this.d, oldVar.d) && Intrinsics.c(this.e, oldVar.e) && Intrinsics.c(this.f, oldVar.f) && Intrinsics.c(this.g, oldVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = dmi.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Double d = this.d;
        int hashCode2 = (e + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OddsCountryProviderUIModel(provider=");
        sb.append(this.a);
        sb.append(", defaultBetSlipLink=");
        sb.append(this.b);
        sb.append(", branded=");
        sb.append(this.c);
        sb.append(", oddsOffset=");
        sb.append(this.d);
        sb.append(", oddsMayDiffer=");
        sb.append(this.e);
        sb.append(", countryProviderType=");
        sb.append(this.f);
        sb.append(", signupLink=");
        return mz1.o(sb, this.g, ")");
    }
}
