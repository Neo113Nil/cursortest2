package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2658t {
    private final String a;
    private final EnumC2579o9 b;
    private final boolean c;
    private final String d;
    private final long e;

    public C2658t(String adSourceNameForEvents, EnumC2579o9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.a = adSourceNameForEvents;
        this.b = instanceType;
        this.c = z;
        this.d = providerName;
        this.e = j;
    }

    public final String a() {
        return this.a;
    }

    public final EnumC2579o9 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2658t)) {
            return false;
        }
        C2658t c2658t = (C2658t) obj;
        return Intrinsics.areEqual(this.a, c2658t.a) && this.b == c2658t.b && this.c == c2658t.c && Intrinsics.areEqual(this.d, c2658t.d) && this.e == c2658t.e;
    }

    public final String f() {
        return this.a;
    }

    public final EnumC2579o9 g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e);
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    public String toString() {
        return "AdFormatConfig(adSourceNameForEvents=" + this.a + ", instanceType=" + this.b + ", isOneFlow=" + this.c + ", providerName=" + this.d + ", loadTimeoutInMillis=" + this.e + ")";
    }

    public final C2658t a(String adSourceNameForEvents, EnumC2579o9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return new C2658t(adSourceNameForEvents, instanceType, z, providerName, j);
    }

    public static /* synthetic */ C2658t a(C2658t c2658t, String str, EnumC2579o9 enumC2579o9, boolean z, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2658t.a;
        }
        if ((i & 2) != 0) {
            enumC2579o9 = c2658t.b;
        }
        if ((i & 4) != 0) {
            z = c2658t.c;
        }
        if ((i & 8) != 0) {
            str2 = c2658t.d;
        }
        if ((i & 16) != 0) {
            j = c2658t.e;
        }
        long j2 = j;
        return c2658t.a(str, enumC2579o9, z, str2, j2);
    }
}
