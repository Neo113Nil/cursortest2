package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class and {
    public final old a;
    public final fgf b;

    public and(old oldVar, fgf fgfVar) {
        oldVar.getClass();
        fgfVar.getClass();
        this.a = oldVar;
        this.b = fgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof and)) {
            return false;
        }
        and andVar = (and) obj;
        return Intrinsics.c(this.a, andVar.a) && Intrinsics.c(this.b, andVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OddsWithProviderUIModel(countryProvider=" + this.a + ", odds=" + this.b + ")";
    }
}
