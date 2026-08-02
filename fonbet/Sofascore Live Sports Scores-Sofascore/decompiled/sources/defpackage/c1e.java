package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c1e {
    public final String a;
    public final String b;

    public c1e(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1e)) {
            return false;
        }
        c1e c1eVar = (c1e) obj;
        return Intrinsics.c(this.a, c1eVar.a) && Intrinsics.c(this.b, c1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("POTSCountryFilter(name=", this.a, ", alpha2=", this.b, ")");
    }
}
