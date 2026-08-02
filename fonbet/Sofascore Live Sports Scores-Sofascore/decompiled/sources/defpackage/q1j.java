package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q1j implements z1j {
    public final tee a;
    public final bfe b;

    public q1j(tee teeVar, bfe bfeVar) {
        teeVar.getClass();
        this.a = teeVar;
        this.b = bfeVar;
    }

    @Override // defpackage.z1j
    public final wv9 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1j)) {
            return false;
        }
        q1j q1jVar = (q1j) obj;
        return Intrinsics.c(this.a, q1jVar.a) && this.b.equals(q1jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BasketballDepthChart(data=" + this.a + ", visibleForChips=" + this.b + ")";
    }
}
