package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zzd {
    public final boolean a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public zzd(boolean z, String str, String str2, Integer num, boolean z2, boolean z3) {
        str2.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        zzd zzdVar = (zzd) obj;
        return this.a == zzdVar.a && this.b.equals(zzdVar.b) && Intrinsics.c(this.c, zzdVar.c) && Intrinsics.c(this.d, zzdVar.d) && this.e == zzdVar.e && this.f == zzdVar.f;
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.f) + dmi.e((c + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PESMSubstitutionUiModel(subbedIn=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", minute=");
        me4.o(this.d, this.c, ", playerId=", ", isInjury=", sb);
        return w1l.i(", isClickEnabled=", ")", sb, this.e, this.f);
    }
}
