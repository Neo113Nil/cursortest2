package com.moloco.sdk.internal.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class e {
    public static final a c = new a(null);
    public static final int d = 0;
    public static final int e = 100;
    public final long a;
    public final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final Integer e() {
        long j = this.b;
        if (j > 0) {
            return Integer.valueOf((int) (((j - this.a) * 100) / j));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "StorageInfo(availableBytes=" + this.a + ", totalBytes=" + this.b + ')';
    }

    public final e a(long j, long j2) {
        return new e(j, j2);
    }

    public static /* synthetic */ e a(e eVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eVar.a;
        }
        if ((i & 2) != 0) {
            j2 = eVar.b;
        }
        return eVar.a(j, j2);
    }
}
