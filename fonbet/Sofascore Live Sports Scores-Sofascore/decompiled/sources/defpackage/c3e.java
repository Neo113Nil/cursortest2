package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c3e {
    public final gv9 a;
    public final boolean b;

    public c3e(gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3e)) {
            return false;
        }
        c3e c3eVar = (c3e) obj;
        return Intrinsics.c(this.a, c3eVar.a) && this.b == c3eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "POTSTopLeaguesState(items=" + this.a + ", isPullToRefreshing=" + this.b + ")";
    }
}
