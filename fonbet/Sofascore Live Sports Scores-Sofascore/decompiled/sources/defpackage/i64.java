package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i64 implements k64 {
    public final fci a;
    public final h38 b;
    public final gv9 c;
    public final boolean d;

    public i64(fci fciVar, h38 h38Var, gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = fciVar;
        this.b = h38Var;
        this.c = gv9Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i64)) {
            return false;
        }
        i64 i64Var = (i64) obj;
        return Intrinsics.c(this.a, i64Var.a) && Intrinsics.c(this.b, i64Var.b) && Intrinsics.c(this.c, i64Var.c) && this.d == i64Var.d;
    }

    public final int hashCode() {
        fci fciVar = this.a;
        int hashCode = (fciVar == null ? 0 : fciVar.hashCode()) * 31;
        h38 h38Var = this.b;
        return Boolean.hashCode(this.d) + ljg.d((hashCode + (h38Var != null ? h38Var.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Results(startTimeSuggest=" + this.a + ", finalScoreData=" + this.b + ", incidentSuggests=" + this.c + ", areContributionsValidated=" + this.d + ")";
    }
}
