package com.ironsource;

import org.json.JSONObject;
import xsna.gp;
import xsna.n23;

/* loaded from: classes13.dex */
public final class Gg {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public Gg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gg)) {
            return false;
        }
        Gg gg = (Gg) obj;
        return this.a == gg.a && this.b == gg.b && this.c == gg.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final JSONObject g() {
        return new JSONObject().put(C4313f8.k, this.a).put(C4313f8.l, this.b).put(C4313f8.m, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.c;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        return n23.b(gp.c("ViewVisibilityParams(isVisible=", ", isWindowVisible=", ", isShown=", z, z2), this.c, ")");
    }

    public final Gg a(boolean z, boolean z2, boolean z3) {
        return new Gg(z, z2, z3);
    }

    public static /* synthetic */ Gg a(Gg gg, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gg.a;
        }
        if ((i & 2) != 0) {
            z2 = gg.b;
        }
        if ((i & 4) != 0) {
            z3 = gg.c;
        }
        return gg.a(z, z2, z3);
    }
}
