package com.ironsource;

import defpackage.dmi;
import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4313t {

    @NotNull
    private final String a;

    @NotNull
    private final EnumC4252p9 b;
    private final boolean c;

    @NotNull
    private final String d;
    private final long e;

    public C4313t(@NotNull String str, @NotNull EnumC4252p9 enumC4252p9, boolean z, @NotNull String str2, long j) {
        str.getClass();
        enumC4252p9.getClass();
        str2.getClass();
        this.a = str;
        this.b = enumC4252p9;
        this.c = z;
        this.d = str2;
        this.e = j;
    }

    public static /* synthetic */ C4313t a(C4313t c4313t, String str, EnumC4252p9 enumC4252p9, boolean z, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4313t.a;
        }
        if ((i & 2) != 0) {
            enumC4252p9 = c4313t.b;
        }
        if ((i & 4) != 0) {
            z = c4313t.c;
        }
        if ((i & 8) != 0) {
            str2 = c4313t.d;
        }
        if ((i & 16) != 0) {
            j = c4313t.e;
        }
        long j2 = j;
        return c4313t.a(str, enumC4252p9, z, str2, j2);
    }

    @NotNull
    public final EnumC4252p9 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4313t)) {
            return false;
        }
        C4313t c4313t = (C4313t) obj;
        return Intrinsics.c(this.a, c4313t.a) && this.b == c4313t.b && this.c == c4313t.c && Intrinsics.c(this.d, c4313t.d) && this.e == c4313t.e;
    }

    @NotNull
    public final String f() {
        return this.a;
    }

    @NotNull
    public final EnumC4252p9 g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Long.hashCode(this.e) + dmi.c((hashCode + i) * 31, 31, this.d);
    }

    @NotNull
    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    @NotNull
    public String toString() {
        String str = this.a;
        EnumC4252p9 enumC4252p9 = this.b;
        boolean z = this.c;
        String str2 = this.d;
        long j = this.e;
        StringBuilder sb = new StringBuilder("AdFormatConfig(adSourceNameForEvents=");
        sb.append(str);
        sb.append(", instanceType=");
        sb.append(enumC4252p9);
        sb.append(", isOneFlow=");
        sb.append(z);
        sb.append(", providerName=");
        sb.append(str2);
        sb.append(", loadTimeoutInMillis=");
        return lnb.l(j, ")", sb);
    }

    @NotNull
    public final C4313t a(@NotNull String str, @NotNull EnumC4252p9 enumC4252p9, boolean z, @NotNull String str2, long j) {
        str.getClass();
        enumC4252p9.getClass();
        str2.getClass();
        return new C4313t(str, enumC4252p9, z, str2, j);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
