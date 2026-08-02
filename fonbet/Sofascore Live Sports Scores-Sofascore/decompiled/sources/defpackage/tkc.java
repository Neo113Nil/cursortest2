package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tkc {
    public final skc a;
    public final skc b;

    public tkc(skc skcVar, skc skcVar2) {
        this.a = skcVar;
        this.b = skcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkc)) {
            return false;
        }
        tkc tkcVar = (tkc) obj;
        return Intrinsics.c(this.a, tkcVar.a) && Intrinsics.c(this.b, tkcVar.b);
    }

    public final int hashCode() {
        skc skcVar = this.a;
        int hashCode = (skcVar == null ? 0 : skcVar.hashCode()) * 31;
        skc skcVar2 = this.b;
        return hashCode + (skcVar2 != null ? skcVar2.hashCode() : 0);
    }

    public final String toString() {
        return "MissingPlayerUiPair(first=" + this.a + ", second=" + this.b + ")";
    }
}
