package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j7b implements w8l {
    public final w8l a;
    public final int b;

    public j7b(w8l w8lVar, int i) {
        this.a = w8lVar;
        this.b = i;
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(kx4Var);
        }
        return 0;
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        if (((emaVar == ema.a ? 4 : 1) & this.b) != 0) {
            return this.a.b(kx4Var, emaVar);
        }
        return 0;
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(kx4Var);
        }
        return 0;
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        if (((emaVar == ema.a ? 8 : 2) & this.b) != 0) {
            return this.a.d(kx4Var, emaVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7b)) {
            return false;
        }
        j7b j7bVar = (j7b) obj;
        return Intrinsics.c(this.a, j7bVar.a) && this.b == j7bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = sea.h;
        if ((i & i2) == i2) {
            sea.z("Start", sb3);
        }
        int i3 = sea.j;
        if ((i & i3) == i3) {
            sea.z(PlayerKt.PREFERRED_FOOT_LEFT, sb3);
        }
        if ((i & 16) == 16) {
            sea.z("Top", sb3);
        }
        int i4 = sea.i;
        if ((i & i4) == i4) {
            sea.z("End", sb3);
        }
        int i5 = sea.k;
        if ((i & i5) == i5) {
            sea.z(PlayerKt.PREFERRED_FOOT_RIGHT, sb3);
        }
        if ((i & 32) == 32) {
            sea.z("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
