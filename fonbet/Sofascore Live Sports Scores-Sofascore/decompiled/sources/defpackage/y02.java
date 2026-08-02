package defpackage;

import com.sofascore.model.mvvm.model.Bowler;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class y02 implements Serializable, zi5 {

    @NotNull
    public static final x02 Companion = new x02();
    public final boolean a;
    public final boolean b;
    public final Bowler c;
    public boolean d;

    public /* synthetic */ y02(int i, boolean z, boolean z2, Bowler bowler, boolean z3) {
        if (7 != (i & 7)) {
            oea.z(i, 7, w02.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = bowler;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
    }

    @Override // defpackage.zi5
    public final void d() {
        this.d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y02)) {
            return false;
        }
        y02 y02Var = (y02) obj;
        return this.a == y02Var.a && this.b == y02Var.b && Intrinsics.c(this.c, y02Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder k = w1l.k("BowlerRow(currentBowler=", this.a, ", isFirst=", this.b, ", bowler=");
        k.append(this.c);
        k.append(")");
        return k.toString();
    }

    public y02(boolean z, boolean z2, Bowler bowler) {
        bowler.getClass();
        this.a = z;
        this.b = z2;
        this.c = bowler;
    }
}
