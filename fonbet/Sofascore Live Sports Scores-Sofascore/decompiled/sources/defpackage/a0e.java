package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a0e {
    public final zzd a;
    public final zzd b;

    public a0e(zzd zzdVar, zzd zzdVar2) {
        this.a = zzdVar;
        this.b = zzdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0e)) {
            return false;
        }
        a0e a0eVar = (a0e) obj;
        return Intrinsics.c(this.a, a0eVar.a) && Intrinsics.c(this.b, a0eVar.b);
    }

    public final int hashCode() {
        zzd zzdVar = this.a;
        int hashCode = (zzdVar == null ? 0 : zzdVar.hashCode()) * 31;
        zzd zzdVar2 = this.b;
        return hashCode + (zzdVar2 != null ? zzdVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PESMSubstitutionsUiModel(firstRow=" + this.a + ", secondRow=" + this.b + ")";
    }
}
