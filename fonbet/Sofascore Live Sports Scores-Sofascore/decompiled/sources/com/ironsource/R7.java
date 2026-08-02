package com.ironsource;

import defpackage.lnb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class R7 {
    private final int a;
    private final int b;

    public R7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static /* synthetic */ R7 a(R7 r7, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = r7.a;
        }
        if ((i3 & 2) != 0) {
            i2 = r7.b;
        }
        return r7.a(i, i2);
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

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R7)) {
            return false;
        }
        R7 r7 = (R7) obj;
        return this.a == r7.a && this.b == r7.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public String toString() {
        return lnb.j(this.a, this.b, "ISContainerParams(width=", ", height=", ")");
    }

    @NotNull
    public final R7 a(int i, int i2) {
        return new R7(i, i2);
    }

    public final int a() {
        return this.a;
    }
}
