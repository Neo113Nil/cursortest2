package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class X8 {
    private final String a;
    private final String b;
    private X c;
    private boolean d;
    private String e;
    private String f;

    public X8(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.a = appKey;
        this.b = userId;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final X e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X8)) {
            return false;
        }
        X8 x8 = (X8) obj;
        return Intrinsics.areEqual(this.a, x8.a) && Intrinsics.areEqual(this.b, x8.b);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "InitConfig(appKey=" + this.a + ", userId=" + this.b + ")";
    }

    public final X8 a(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new X8(appKey, userId);
    }

    public final void b(String str) {
        this.e = str;
    }

    public static /* synthetic */ X8 a(X8 x8, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = x8.a;
        }
        if ((i & 2) != 0) {
            str2 = x8.b;
        }
        return x8.a(str, str2);
    }

    public final void a(X x) {
        this.c = x;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final <T> T a(Ib<X8, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
