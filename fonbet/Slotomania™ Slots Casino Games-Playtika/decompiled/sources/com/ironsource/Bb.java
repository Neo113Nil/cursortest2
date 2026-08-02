package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Bb {
    private final EnumC2579o9 a;
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public Bb(EnumC2579o9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.a = instanceType;
        this.b = adSourceNameForEvents;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final EnumC2579o9 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bb)) {
            return false;
        }
        Bb bb = (Bb) obj;
        return this.a == bb.a && Intrinsics.areEqual(this.b, bb.b) && this.c == bb.c && this.d == bb.d && this.e == bb.e;
    }

    public final String f() {
        return this.b;
    }

    public final EnumC2579o9 g() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public final Bb a(EnumC2579o9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new Bb(instanceType, adSourceNameForEvents, j, z, z2);
    }

    public static /* synthetic */ Bb a(Bb bb, EnumC2579o9 enumC2579o9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC2579o9 = bb.a;
        }
        if ((i & 2) != 0) {
            str = bb.b;
        }
        if ((i & 4) != 0) {
            j = bb.c;
        }
        if ((i & 8) != 0) {
            z = bb.d;
        }
        if ((i & 16) != 0) {
            z2 = bb.e;
        }
        long j2 = j;
        return bb.a(enumC2579o9, str, j2, z, z2);
    }

    public /* synthetic */ Bb(EnumC2579o9 enumC2579o9, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC2579o9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
