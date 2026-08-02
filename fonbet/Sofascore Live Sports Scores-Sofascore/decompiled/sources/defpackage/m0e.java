package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m0e implements q0e {
    public final c1e a;

    public m0e(c1e c1eVar) {
        this.a = c1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0e) && Intrinsics.c(this.a, ((m0e) obj).a);
    }

    public final int hashCode() {
        c1e c1eVar = this.a;
        if (c1eVar == null) {
            return 0;
        }
        return c1eVar.hashCode();
    }

    public final String toString() {
        return "SelectCountry(country=" + this.a + ")";
    }
}
