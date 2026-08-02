package com.ironsource;

/* loaded from: classes4.dex */
public final class Ca {
    private final long a;
    private final long b;
    private final boolean c;

    public Ca(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ca)) {
            return false;
        }
        Ca ca = (Ca) obj;
        return this.a == ca.a && this.b == ca.b && this.c == ca.c;
    }

    public final boolean f() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.a + ", visibilityCheckerInterval=" + this.b + ", isAutoRefreshEnabled=" + this.c + ")";
    }

    public final Ca a(long j, long j2, boolean z) {
        return new Ca(j, j2, z);
    }

    public static /* synthetic */ Ca a(Ca ca, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ca.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = ca.b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = ca.c;
        }
        return ca.a(j3, j4, z);
    }
}
