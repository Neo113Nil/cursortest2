package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2830j {
    public static final int d = 8;
    public final Integer a;
    public final String b;
    public final C2831k c;

    public C2830j(Integer num, String str, C2831k c2831k) {
        this.a = num;
        this.b = str;
        this.c = c2831k;
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final C2831k c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final C2831k e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2830j)) {
            return false;
        }
        C2830j c2830j = (C2830j) obj;
        return Intrinsics.areEqual(this.a, c2830j.a) && Intrinsics.areEqual(this.b, c2830j.b) && Intrinsics.areEqual(this.c, c2830j.c);
    }

    public final Integer f() {
        return this.a;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C2831k c2831k = this.c;
        return hashCode2 + (c2831k != null ? c2831k.hashCode() : 0);
    }

    public String toString() {
        return "DECAppIcon(size=" + this.a + ", appIconUri=" + this.b + ", border=" + this.c + ')';
    }

    public final C2830j a(Integer num, String str, C2831k c2831k) {
        return new C2830j(num, str, c2831k);
    }

    public static /* synthetic */ C2830j a(C2830j c2830j, Integer num, String str, C2831k c2831k, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c2830j.a;
        }
        if ((i & 2) != 0) {
            str = c2830j.b;
        }
        if ((i & 4) != 0) {
            c2831k = c2830j.c;
        }
        return c2830j.a(num, str, c2831k);
    }
}
