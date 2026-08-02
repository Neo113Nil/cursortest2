package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n9b {
    public final r9k a;
    public final int b;
    public final int c;
    public final boolean d;
    public final r9k e;

    public n9b(int i, int i2, r9k r9kVar, r9k r9kVar2, boolean z) {
        this.a = r9kVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = r9kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9b)) {
            return false;
        }
        n9b n9bVar = (n9b) obj;
        return this.a.equals(n9bVar.a) && this.b == n9bVar.b && this.c == n9bVar.c && this.d == n9bVar.d && Intrinsics.c(this.e, n9bVar.e);
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        r9k r9kVar = this.e;
        return e + (r9kVar == null ? 0 : r9kVar.hashCode());
    }

    public final String toString() {
        return "LineupsListPlayerInjuryData(reason=" + this.a + ", iconRes=" + this.b + ", colorRes=" + this.c + ", shouldTintIcon=" + this.d + ", description=" + this.e + ")";
    }
}
