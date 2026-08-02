package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2330ab {
    private final C2433g6 a;
    private final C2433g6 b;
    private final A2 c;
    private final Map<String, Bd> d;

    public C2330ab(C2433g6 c2433g6, C2433g6 c2433g62, A2 a2, Map<String, Bd> providerConfig) {
        Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        this.a = c2433g6;
        this.b = c2433g62;
        this.c = a2;
        this.d = providerConfig;
    }

    public final C2433g6 a() {
        return this.a;
    }

    public final C2433g6 b() {
        return this.b;
    }

    public final A2 c() {
        return this.c;
    }

    public final Map<String, Bd> d() {
        return this.d;
    }

    public final A2 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2330ab)) {
            return false;
        }
        C2330ab c2330ab = (C2330ab) obj;
        return Intrinsics.areEqual(this.a, c2330ab.a) && Intrinsics.areEqual(this.b, c2330ab.b) && Intrinsics.areEqual(this.c, c2330ab.c) && Intrinsics.areEqual(this.d, c2330ab.d);
    }

    public final C2433g6 f() {
        return this.b;
    }

    public final Map<String, Bd> g() {
        return this.d;
    }

    public final C2433g6 h() {
        return this.a;
    }

    public int hashCode() {
        C2433g6 c2433g6 = this.a;
        int hashCode = (c2433g6 == null ? 0 : c2433g6.hashCode()) * 31;
        C2433g6 c2433g62 = this.b;
        int hashCode2 = (hashCode + (c2433g62 == null ? 0 : c2433g62.hashCode())) * 31;
        A2 a2 = this.c;
        return ((hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", providerConfig=" + this.d + ")";
    }

    public final C2330ab a(C2433g6 c2433g6, C2433g6 c2433g62, A2 a2, Map<String, Bd> providerConfig) {
        Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        return new C2330ab(c2433g6, c2433g62, a2, providerConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2330ab a(C2330ab c2330ab, C2433g6 c2433g6, C2433g6 c2433g62, A2 a2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            c2433g6 = c2330ab.a;
        }
        if ((i & 2) != 0) {
            c2433g62 = c2330ab.b;
        }
        if ((i & 4) != 0) {
            a2 = c2330ab.c;
        }
        if ((i & 8) != 0) {
            map = c2330ab.d;
        }
        return c2330ab.a(c2433g6, c2433g62, a2, map);
    }
}
