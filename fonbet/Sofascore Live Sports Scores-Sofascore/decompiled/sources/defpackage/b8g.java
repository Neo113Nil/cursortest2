package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b8g {
    public final c8g a;
    public final c8g b;
    public final Throwable c;

    public /* synthetic */ b8g(c8g c8gVar, vj3 vj3Var, Throwable th, int i) {
        this(c8gVar, (i & 2) != 0 ? null : vj3Var, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8g)) {
            return false;
        }
        b8g b8gVar = (b8g) obj;
        return Intrinsics.c(this.a, b8gVar.a) && Intrinsics.c(this.b, b8gVar.b) && Intrinsics.c(this.c, b8gVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c8g c8gVar = this.b;
        int hashCode2 = (hashCode + (c8gVar == null ? 0 : c8gVar.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public b8g(c8g c8gVar, c8g c8gVar2, Throwable th) {
        this.a = c8gVar;
        this.b = c8gVar2;
        this.c = th;
    }
}
