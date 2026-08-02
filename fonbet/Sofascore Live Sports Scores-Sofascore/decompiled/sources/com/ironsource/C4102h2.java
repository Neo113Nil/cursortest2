package com.ironsource;

import defpackage.lm5;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4102h2 {

    @NotNull
    private final String a;
    private final boolean b;
    private boolean c;

    @NotNull
    private String d;

    @NotNull
    private Map<String, ? extends Object> e;

    @Nullable
    private Z1 f;

    @NotNull
    private Map<String, Object> g;

    public C4102h2(@NotNull String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.d = "";
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.e = lm5Var;
        this.g = new HashMap();
    }

    public static /* synthetic */ C4102h2 a(C4102h2 c4102h2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4102h2.a;
        }
        if ((i & 2) != 0) {
            z = c4102h2.b;
        }
        return c4102h2.a(str, z);
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.e = map;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.g;
    }

    @Nullable
    public final Z1 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4102h2)) {
            return false;
        }
        C4102h2 c4102h2 = (C4102h2) obj;
        return Intrinsics.c(this.a, c4102h2.a) && this.b == c4102h2.b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.e;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @NotNull
    public final String h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean i() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.a + ", bidder=" + this.b + ")";
    }

    public final boolean b() {
        return this.b;
    }

    @NotNull
    public final C4102h2 a(@NotNull String str, boolean z) {
        str.getClass();
        return new C4102h2(str, z);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.d = str;
    }

    public final void a(@Nullable Z1 z1) {
        this.f = z1;
    }

    public final void a(@NotNull Map<String, Object> map) {
        map.getClass();
        this.g = map;
    }
}
