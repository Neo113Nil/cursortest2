package com.ironsource;

import java.util.Map;
import xsna.epx;
import xsna.zr;

/* renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4521r2 {
    private final String a;
    private final com.ironsource.mediationsdk.d b = com.ironsource.mediationsdk.d.b();

    public C4521r2(String str) {
        this.a = str;
    }

    private final String c() {
        return this.a;
    }

    public final C4521r2 a(String str) {
        return new C4521r2(str);
    }

    public final Map<String, String> b() {
        return this.b.b(this.a);
    }

    public final String d() {
        return this.b.c(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4521r2) && epx.f(this.a, ((C4521r2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return zr.a("AuctionServerData(serverData=", this.a, ")");
    }

    public static /* synthetic */ C4521r2 a(C4521r2 c4521r2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4521r2.a;
        }
        return c4521r2.a(str);
    }

    public final String a() {
        return this.b.a(this.a);
    }
}
