package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Se {
    private final P3 a;
    private final Gd b;
    private final Map<String, C2561n9> c;

    public Se(P3 configurations, Gd providerOrder, Map<String, C2561n9> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.a = configurations;
        this.b = providerOrder;
        this.c = providerSettings;
    }

    public final P3 a() {
        return this.a;
    }

    public final Gd b() {
        return this.b;
    }

    public final Map<String, C2561n9> c() {
        return this.c;
    }

    public final P3 d() {
        return this.a;
    }

    public final Gd e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Se)) {
            return false;
        }
        Se se = (Se) obj;
        return Intrinsics.areEqual(this.a, se.a) && Intrinsics.areEqual(this.b, se.b) && Intrinsics.areEqual(this.c, se.c);
    }

    public final Map<String, C2561n9> f() {
        return this.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ServerResponse2(configurations=" + this.a + ", providerOrder=" + this.b + ", providerSettings=" + this.c + ")";
    }

    public final Se a(P3 configurations, Gd providerOrder, Map<String, C2561n9> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        return new Se(configurations, providerOrder, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Se a(Se se, P3 p3, Gd gd, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            p3 = se.a;
        }
        if ((i & 2) != 0) {
            gd = se.b;
        }
        if ((i & 4) != 0) {
            map = se.c;
        }
        return se.a(p3, gd, map);
    }
}
