package com.ironsource;

import defpackage.dmi;
import defpackage.me4;
import defpackage.mz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4335u3 {

    @NotNull
    private String a;

    @NotNull
    private String b;

    @NotNull
    private String c;

    public C4335u3(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static /* synthetic */ C4335u3 a(C4335u3 c4335u3, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4335u3.a;
        }
        if ((i & 2) != 0) {
            str2 = c4335u3.b;
        }
        if ((i & 4) != 0) {
            str3 = c4335u3.c;
        }
        return c4335u3.a(str, str2, str3);
    }

    public final void b(@NotNull String str) {
        str.getClass();
        this.c = str;
    }

    public final void c(@NotNull String str) {
        str.getClass();
        this.b = str;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final String e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4335u3)) {
            return false;
        }
        C4335u3 c4335u3 = (C4335u3) obj;
        return Intrinsics.c(this.a, c4335u3.a) && Intrinsics.c(this.b, c4335u3.b) && Intrinsics.c(this.c, c4335u3.c);
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return mz1.o(mz1.s("CachedResponse(cachedAppKey=", str, ", cachedUserId=", str2, ", cachedSettings="), this.c, ")");
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @NotNull
    public final C4335u3 a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new C4335u3(str, str2, str3);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.a = str;
    }
}
