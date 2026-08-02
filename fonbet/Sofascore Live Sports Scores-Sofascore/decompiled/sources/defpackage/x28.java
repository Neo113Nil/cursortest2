package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x28 implements z28 {
    public final byb a;

    public x28(byb bybVar) {
        bybVar.getClass();
        this.a = bybVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x28) && Intrinsics.c(this.a, ((x28) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ApplyFilter(filter=" + this.a + ")";
    }
}
