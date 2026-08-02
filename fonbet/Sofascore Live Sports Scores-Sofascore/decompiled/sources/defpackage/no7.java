package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class no7 extends ro7 implements qo7 {
    public final do7 a;

    public no7(do7 do7Var) {
        do7Var.getClass();
        this.a = do7Var;
    }

    @Override // defpackage.qo7
    public final do7 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof no7) && Intrinsics.c(this.a, ((no7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EmptyState(userCompetition=" + this.a + ")";
    }
}
