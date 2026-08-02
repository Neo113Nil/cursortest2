package com.ironsource;

import defpackage.dmi;
import defpackage.ljg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ab {

    @NotNull
    private final EnumC4252p9 a;

    @NotNull
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public Ab(@NotNull EnumC4252p9 enumC4252p9, @NotNull String str, long j, boolean z, boolean z2) {
        enumC4252p9.getClass();
        str.getClass();
        this.a = enumC4252p9;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public static /* synthetic */ Ab a(Ab ab, EnumC4252p9 enumC4252p9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4252p9 = ab.a;
        }
        if ((i & 2) != 0) {
            str = ab.b;
        }
        if ((i & 4) != 0) {
            j = ab.c;
        }
        if ((i & 8) != 0) {
            z = ab.d;
        }
        if ((i & 16) != 0) {
            z2 = ab.e;
        }
        long j2 = j;
        return ab.a(enumC4252p9, str, j2, z, z2);
    }

    @NotNull
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

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab = (Ab) obj;
        return this.a == ab.a && Intrinsics.c(this.b, ab.b) && this.c == ab.c && this.d == ab.d && this.e == ab.e;
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    @NotNull
    public final EnumC4252p9 g() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c = ljg.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (c + i) * 31;
        boolean z2 = this.e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    @NotNull
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public /* synthetic */ Ab(EnumC4252p9 enumC4252p9, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4252p9, str, j, z, (i & 16) != 0 ? true : z2);
    }

    @NotNull
    public final Ab a(@NotNull EnumC4252p9 enumC4252p9, @NotNull String str, long j, boolean z, boolean z2) {
        enumC4252p9.getClass();
        str.getClass();
        return new Ab(enumC4252p9, str, j, z, z2);
    }

    @NotNull
    public final EnumC4252p9 a() {
        return this.a;
    }
}
