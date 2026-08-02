package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f0a implements g0a {
    public final gv9 a;

    public f0a(gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
    }

    @Override // defpackage.g0a
    public final gv9 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0a) && Intrinsics.c(this.a, ((f0a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Voted(submittedIncidents=" + this.a + ")";
    }
}
