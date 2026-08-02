package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2837q {
    public static final int e = 8;
    public final Integer a;
    public final C2832l b;
    public final C2830j c;
    public final C2836p d;

    public C2837q(Integer num, C2832l c2832l, C2830j c2830j, C2836p c2836p) {
        this.a = num;
        this.b = c2832l;
        this.c = c2830j;
        this.d = c2836p;
    }

    public final Integer a() {
        return this.a;
    }

    public final C2832l b() {
        return this.b;
    }

    public final C2830j c() {
        return this.c;
    }

    public final C2836p d() {
        return this.d;
    }

    public final Integer e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2837q)) {
            return false;
        }
        C2837q c2837q = (C2837q) obj;
        return Intrinsics.areEqual(this.a, c2837q.a) && Intrinsics.areEqual(this.b, c2837q.b) && Intrinsics.areEqual(this.c, c2837q.c) && Intrinsics.areEqual(this.d, c2837q.d);
    }

    public final C2830j f() {
        return this.c;
    }

    public final C2832l g() {
        return this.b;
    }

    public final C2836p h() {
        return this.d;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        C2832l c2832l = this.b;
        int hashCode2 = (hashCode + (c2832l == null ? 0 : c2832l.hashCode())) * 31;
        C2830j c2830j = this.c;
        int hashCode3 = (hashCode2 + (c2830j == null ? 0 : c2830j.hashCode())) * 31;
        C2836p c2836p = this.d;
        return hashCode3 + (c2836p != null ? c2836p.hashCode() : 0);
    }

    public String toString() {
        return "DECRenderingData(appNameFontSize=" + this.a + ", decCTA=" + this.b + ", decAppIcon=" + this.c + ", decRating=" + this.d + ')';
    }

    public final C2837q a(Integer num, C2832l c2832l, C2830j c2830j, C2836p c2836p) {
        return new C2837q(num, c2832l, c2830j, c2836p);
    }

    public static /* synthetic */ C2837q a(C2837q c2837q, Integer num, C2832l c2832l, C2830j c2830j, C2836p c2836p, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c2837q.a;
        }
        if ((i & 2) != 0) {
            c2832l = c2837q.b;
        }
        if ((i & 4) != 0) {
            c2830j = c2837q.c;
        }
        if ((i & 8) != 0) {
            c2836p = c2837q.d;
        }
        return c2837q.a(num, c2832l, c2830j, c2836p);
    }
}
