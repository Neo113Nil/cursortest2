package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h9b implements j9b {
    public final Integer a;
    public final String b;
    public final fk2 c;
    public final boolean d;
    public final r9k e;
    public final boolean f;

    public h9b(Integer num, String str, fk2 fk2Var, q9k q9kVar, boolean z, int i) {
        fk2Var = (i & 4) != 0 ? null : fk2Var;
        boolean z2 = (i & 8) == 0;
        q9kVar = (i & 16) != 0 ? null : q9kVar;
        z = (i & 32) != 0 ? false : z;
        this.a = num;
        this.b = str;
        this.c = fk2Var;
        this.d = z2;
        this.e = q9kVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9b)) {
            return false;
        }
        h9b h9bVar = (h9b) obj;
        return Intrinsics.c(this.a, h9bVar.a) && Intrinsics.c(this.b, h9bVar.b) && Intrinsics.c(this.c, h9bVar.c) && this.d == h9bVar.d && Intrinsics.c(this.e, h9bVar.e) && this.f == h9bVar.f;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fk2 fk2Var = this.c;
        int e = dmi.e((hashCode2 + (fk2Var == null ? 0 : fk2Var.hashCode())) * 31, 31, this.d);
        r9k r9kVar = this.e;
        return Boolean.hashCode(this.f) + ((e + (r9kVar != null ? r9kVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = wv8.m("LineupsListManagerUiModel(id=", this.a, ", name=", this.b, ", cardData=");
        m.append(this.c);
        m.append(", hasRole=");
        m.append(this.d);
        m.append(", role=");
        m.append(this.e);
        m.append(", showBottomDivider=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
