package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2836p {
    public static final int f = 0;
    public final Float a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public C2836p(Float f2, String foregroundColor, String backgroundColor, int i, int i2) {
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.a = f2;
        this.b = foregroundColor;
        this.c = backgroundColor;
        this.d = i;
        this.e = i2;
    }

    public final Float a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2836p)) {
            return false;
        }
        C2836p c2836p = (C2836p) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) c2836p.a) && Intrinsics.areEqual(this.b, c2836p.b) && Intrinsics.areEqual(this.c, c2836p.c) && this.d == c2836p.d && this.e == c2836p.e;
    }

    public final String f() {
        return this.c;
    }

    public final int g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        Float f2 = this.a;
        return ((((((((f2 == null ? 0 : f2.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e);
    }

    public final int i() {
        return this.d;
    }

    public final Float j() {
        return this.a;
    }

    public String toString() {
        return "DECRating(value=" + this.a + ", foregroundColor=" + this.b + ", backgroundColor=" + this.c + ", size=" + this.d + ", fontSize=" + this.e + ')';
    }

    public final C2836p a(Float f2, String foregroundColor, String backgroundColor, int i, int i2) {
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new C2836p(f2, foregroundColor, backgroundColor, i, i2);
    }

    public static /* synthetic */ C2836p a(C2836p c2836p, Float f2, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = c2836p.a;
        }
        if ((i3 & 2) != 0) {
            str = c2836p.b;
        }
        if ((i3 & 4) != 0) {
            str2 = c2836p.c;
        }
        if ((i3 & 8) != 0) {
            i = c2836p.d;
        }
        if ((i3 & 16) != 0) {
            i2 = c2836p.e;
        }
        int i4 = i2;
        String str3 = str2;
        return c2836p.a(f2, str, str3, i, i4);
    }
}
