package com.ironsource;

import defpackage.bf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y8 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private X c;
    private boolean d;

    @Nullable
    private String e;

    @Nullable
    private String f;

    public Y8(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ Y8 a(Y8 y8, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = y8.a;
        }
        if ((i & 2) != 0) {
            str2 = y8.b;
        }
        return y8.a(str, str2);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @Nullable
    public final X e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y8 = (Y8) obj;
        return Intrinsics.c(this.a, y8.a) && Intrinsics.c(this.b, y8.b);
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    @Nullable
    public final String g() {
        return this.e;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return bf3.k("InitConfig(appKey=", this.a, ", userId=", this.b, ")");
    }

    public final void b(@Nullable String str) {
        this.e = str;
    }

    @NotNull
    public final Y8 a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return new Y8(str, str2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void a(@Nullable X x) {
        this.c = x;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(@Nullable String str) {
        this.f = str;
    }

    public final <T> T a(@NotNull Hb<Y8, T> hb) {
        hb.getClass();
        return hb.a(this);
    }
}
