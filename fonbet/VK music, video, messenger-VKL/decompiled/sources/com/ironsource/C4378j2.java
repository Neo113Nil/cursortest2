package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import xsna.epx;
import xsna.jgp;

/* renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4378j2 {
    private final String a;
    private final boolean b;
    private boolean c;
    private C4235b2 f;
    private String d = "";
    private Map<String, ? extends Object> e = jgp.b;
    private Map<String, Object> g = new HashMap();

    public C4378j2(String str, boolean z) {
        this.a = str;
        this.b = z;
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

    public final C4235b2 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4378j2)) {
            return false;
        }
        C4378j2 c4378j2 = (C4378j2) obj;
        return epx.f(this.a, c4378j2.a) && this.b == c4378j2.b;
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

    public final C4378j2 a(String str, boolean z) {
        return new C4378j2(str, z);
    }

    public final void b(Map<String, ? extends Object> map) {
        this.e = map;
    }

    public static /* synthetic */ C4378j2 a(C4378j2 c4378j2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4378j2.a;
        }
        if ((i & 2) != 0) {
            z = c4378j2.b;
        }
        return c4378j2.a(str, z);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(C4235b2 c4235b2) {
        this.f = c4235b2;
    }

    public final void a(Map<String, Object> map) {
        this.g = map;
    }
}
