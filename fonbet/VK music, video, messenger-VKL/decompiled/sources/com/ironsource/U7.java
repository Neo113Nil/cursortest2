package com.ironsource;

import xsna.sl9;

/* loaded from: classes13.dex */
public final class U7 {
    private final int a;
    private final int b;

    public U7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U7)) {
            return false;
        }
        U7 u7 = (U7) obj;
        return this.a == u7.a && this.b == u7.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        return sl9.c(this.a, this.b, "ISContainerParams(width=", ", height=", ")");
    }

    public final U7 a(int i, int i2) {
        return new U7(i, i2);
    }

    public static /* synthetic */ U7 a(U7 u7, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = u7.a;
        }
        if ((i3 & 2) != 0) {
            i2 = u7.b;
        }
        return u7.a(i, i2);
    }
}
