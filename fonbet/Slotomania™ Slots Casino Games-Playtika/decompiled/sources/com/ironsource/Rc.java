package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Rc {
    private final boolean a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public Rc() {
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
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc = (Rc) obj;
        return this.a == rc.a && this.b == rc.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.a + ", flags=" + this.b + ")";
    }

    public Rc(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final Rc a(boolean z, int i) {
        return new Rc(z, i);
    }

    public static /* synthetic */ Rc a(Rc rc, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = rc.a;
        }
        if ((i2 & 2) != 0) {
            i = rc.b;
        }
        return rc.a(z, i);
    }

    public /* synthetic */ Rc(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? com.google.android.exoplayer2.C.ENCODING_PCM_32BIT : i);
    }
}
