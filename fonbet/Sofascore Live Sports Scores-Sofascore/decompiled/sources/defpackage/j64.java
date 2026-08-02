package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j64 implements k64 {
    public final fci a;
    public final h38 b;
    public final svb c;
    public final g0a d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public j64(fci fciVar, h38 h38Var, svb svbVar, g0a g0aVar, boolean z, boolean z2, int i) {
        this.a = fciVar;
        this.b = h38Var;
        this.c = svbVar;
        this.d = g0aVar;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j64)) {
            return false;
        }
        j64 j64Var = (j64) obj;
        return Intrinsics.c(this.a, j64Var.a) && Intrinsics.c(this.b, j64Var.b) && Intrinsics.c(this.c, j64Var.c) && Intrinsics.c(this.d, j64Var.d) && this.e == j64Var.e && this.f == j64Var.f && this.g == j64Var.g;
    }

    public final int hashCode() {
        fci fciVar = this.a;
        int hashCode = (fciVar == null ? 0 : fciVar.hashCode()) * 31;
        h38 h38Var = this.b;
        int hashCode2 = (hashCode + (h38Var == null ? 0 : h38Var.hashCode())) * 31;
        svb svbVar = this.c;
        int hashCode3 = (hashCode2 + (svbVar == null ? 0 : svbVar.hashCode())) * 31;
        g0a g0aVar = this.d;
        return Integer.hashCode(this.g) + dmi.e(dmi.e((hashCode3 + (g0aVar != null ? g0aVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suggesting(timeSuggestData=");
        sb.append(this.a);
        sb.append(", finalScoreData=");
        sb.append(this.b);
        sb.append(", matchEndedData=");
        sb.append(this.c);
        sb.append(", incidentTimeline=");
        sb.append(this.d);
        sb.append(", showNote=");
        vxd.t(", showLoginBanner=", ", eventId=", sb, this.e, this.f);
        return fc6.h(this.g, ")", sb);
    }
}
