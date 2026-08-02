package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Ag {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public Ag(boolean z, boolean z2, boolean z3) {
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
        if (!(obj instanceof Ag)) {
            return false;
        }
        Ag ag = (Ag) obj;
        return this.a == ag.a && this.b == ag.b && this.c == ag.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final JSONObject g() {
        JSONObject put = IronSourceNetworkBridge.jsonObjectInit().put(C2399e8.k, this.a).put(C2399e8.l, this.b).put(C2399e8.m, this.c);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
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

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.a + ", isWindowVisible=" + this.b + ", isShown=" + this.c + ")";
    }

    public final Ag a(boolean z, boolean z2, boolean z3) {
        return new Ag(z, z2, z3);
    }

    public static /* synthetic */ Ag a(Ag ag, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ag.a;
        }
        if ((i & 2) != 0) {
            z2 = ag.b;
        }
        if ((i & 4) != 0) {
            z3 = ag.c;
        }
        return ag.a(z, z2, z3);
    }
}
