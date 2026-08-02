package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g3l extends h3l {
    public final q5l a;
    public final s2l b;

    public g3l(q5l q5lVar, s2l s2lVar) {
        this.a = q5lVar;
        this.b = s2lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3l)) {
            return false;
        }
        g3l g3lVar = (g3l) obj;
        return Intrinsics.c(this.a, g3lVar.a) && Intrinsics.c(this.b, g3lVar.b);
    }

    public final int hashCode() {
        q5l q5lVar = this.a;
        int hashCode = (q5lVar == null ? 0 : q5lVar.hashCode()) * 31;
        s2l s2lVar = this.b;
        return hashCode + (s2lVar != null ? s2lVar.hashCode() : 0);
    }

    public final String toString() {
        return "Success(weeklyStreakUiModel=" + this.a + ", personalBestUiModel=" + this.b + ")";
    }
}
