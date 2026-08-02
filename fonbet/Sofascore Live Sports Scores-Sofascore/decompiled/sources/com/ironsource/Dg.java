package com.ironsource;

import defpackage.w1l;
import defpackage.wt3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Dg {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public Dg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static /* synthetic */ Dg a(Dg dg, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dg.a;
        }
        if ((i & 2) != 0) {
            z2 = dg.b;
        }
        if ((i & 4) != 0) {
            z3 = dg.c;
        }
        return dg.a(z, z2, z3);
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

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dg)) {
            return false;
        }
        Dg dg = (Dg) obj;
        return this.a == dg.a && this.b == dg.b && this.c == dg.c;
    }

    public final boolean f() {
        return this.b;
    }

    @NotNull
    public final JSONObject g() {
        JSONObject put = new JSONObject().put(C4018c8.k, this.a).put(C4018c8.l, this.b).put(C4018c8.m, this.c);
        put.getClass();
        return put;
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

    @NotNull
    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        return wt3.p(w1l.k("ViewVisibilityParams(isVisible=", z, ", isWindowVisible=", z2, ", isShown="), this.c, ")");
    }

    @NotNull
    public final Dg a(boolean z, boolean z2, boolean z3) {
        return new Dg(z, z2, z3);
    }

    public final boolean a() {
        return this.a;
    }
}
