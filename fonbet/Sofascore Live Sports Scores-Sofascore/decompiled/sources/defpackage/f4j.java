package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f4j {
    public final int a;
    public final String b;
    public final boolean c;

    public f4j(int i, String str, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4j)) {
            return false;
        }
        f4j f4jVar = (f4j) obj;
        return this.a == f4jVar.a && Intrinsics.c(this.b, f4jVar.b) && this.c == f4jVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return wt3.p(dmi.t(this.a, "TeamUiModel(id=", ", name=", this.b, ", isNational="), this.c, ")");
    }
}
