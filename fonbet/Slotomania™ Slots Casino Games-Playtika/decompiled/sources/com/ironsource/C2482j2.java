package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2482j2 {
    private final String a;
    private final boolean b;
    private boolean c;
    private String d;
    private Map<String, ? extends Object> e;
    private C2339b2 f;
    private Map<String, Object> g;

    public C2482j2(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = z;
        this.d = "";
        this.e = MapsKt.emptyMap();
        this.g = new HashMap();
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return this.g;
    }

    public final C2339b2 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2482j2)) {
            return false;
        }
        C2482j2 c2482j2 = (C2482j2) obj;
        return Intrinsics.areEqual(this.a, c2482j2.a) && this.b == c2482j2.b;
    }

    public final Map<String, Object> f() {
        return this.e;
    }

    public final String g() {
        return this.a;
    }

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

    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.a + ", bidder=" + this.b + ")";
    }

    public final C2482j2 a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C2482j2(name, z);
    }

    public final void b(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    public static /* synthetic */ C2482j2 a(C2482j2 c2482j2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2482j2.a;
        }
        if ((i & 2) != 0) {
            z = c2482j2.b;
        }
        return c2482j2.a(str, z);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void a(C2339b2 c2339b2) {
        this.f = c2339b2;
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.g = map;
    }
}
