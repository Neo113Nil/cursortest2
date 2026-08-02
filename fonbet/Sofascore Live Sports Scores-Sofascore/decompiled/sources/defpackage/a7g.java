package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a7g implements b7g {
    public final String a;
    public final int b;
    public final boolean c;

    public a7g(String str, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7g)) {
            return false;
        }
        a7g a7gVar = (a7g) obj;
        return Intrinsics.c(this.a, a7gVar.a) && this.b == a7gVar.b && this.c == a7gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return wt3.p(mz1.q(this.b, "Numbered(prefix=", this.a, ", number=", ", prefixFirst="), this.c, ")");
    }
}
