package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dld {
    public final boolean a;
    public final r9k b;
    public final int c;
    public final String d;
    public final String e;
    public final zmd f;

    public dld(boolean z, r9k r9kVar, int i, String str, String str2, zmd zmdVar) {
        this.a = z;
        this.b = r9kVar;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = zmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dld)) {
            return false;
        }
        dld dldVar = (dld) obj;
        return this.a == dldVar.a && Intrinsics.c(this.b, dldVar.b) && this.c == dldVar.c && Intrinsics.c(this.d, dldVar.d) && Intrinsics.c(this.e, dldVar.e) && Intrinsics.c(this.f, dldVar.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        r9k r9kVar = this.b;
        int a = wv8.a(this.c, (hashCode + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31);
        String str = this.d;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        zmd zmdVar = this.f;
        return hashCode3 + (zmdVar != null ? zmdVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OddsChoiceUIModel(winning=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", change=");
        vxd.p(this.c, ", fractionalValue=", this.d, ", betSlipLink=", sb);
        sb.append(this.e);
        sb.append(", team=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dld(m9k m9kVar, int i, String str) {
        this(false, m9kVar, i, str, null, null);
    }
}
