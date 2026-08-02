package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class l81 {

    @NotNull
    public static final k81 Companion = new k81();
    public static final joa[] d = {null, ypa.a(ysa.b, new tv0(13)), null};
    public final pl0 a;
    public final gv9 b;
    public final boolean c;

    public /* synthetic */ l81(int i, pl0 pl0Var, gv9 gv9Var, boolean z) {
        if (7 != (i & 7)) {
            oea.z(i, 7, j81.a.getDescriptor());
            throw null;
        }
        this.a = pl0Var;
        this.b = gv9Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l81)) {
            return false;
        }
        l81 l81Var = (l81) obj;
        return Intrinsics.c(this.a, l81Var.a) && Intrinsics.c(this.b, l81Var.b) && this.c == l81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ljg.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseballCommentaryModalData(atBatInfo=");
        sb.append(this.a);
        sb.append(", pitches=");
        sb.append(this.b);
        sb.append(", showWinProbability=");
        return wt3.p(sb, this.c, ")");
    }

    public l81(pl0 pl0Var, gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = pl0Var;
        this.b = gv9Var;
        this.c = z;
    }
}
