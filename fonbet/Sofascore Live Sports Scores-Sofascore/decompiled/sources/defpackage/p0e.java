package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p0e implements q0e {
    public final d1e a;

    public p0e(d1e d1eVar) {
        this.a = d1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0e) && Intrinsics.c(this.a, ((p0e) obj).a);
    }

    public final int hashCode() {
        d1e d1eVar = this.a;
        if (d1eVar == null) {
            return 0;
        }
        return d1eVar.hashCode();
    }

    public final String toString() {
        return "SelectTeam(team=" + this.a + ")";
    }
}
