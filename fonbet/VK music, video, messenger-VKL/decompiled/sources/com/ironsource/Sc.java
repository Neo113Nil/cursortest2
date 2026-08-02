package com.ironsource;

import xsna.zcl;

/* loaded from: classes13.dex */
public final class Sc {
    private final boolean a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public Sc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sc)) {
            return false;
        }
        Sc sc = (Sc) obj;
        return this.a == sc.a && this.b == sc.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Integer.hashCode(this.b) + (r0 * 31);
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.a + ", flags=" + this.b + ")";
    }

    public Sc(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final Sc a(boolean z, int i) {
        return new Sc(z, i);
    }

    public static /* synthetic */ Sc a(Sc sc, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = sc.a;
        }
        if ((i2 & 2) != 0) {
            i = sc.b;
        }
        return sc.a(z, i);
    }

    public /* synthetic */ Sc(boolean z, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }
}
