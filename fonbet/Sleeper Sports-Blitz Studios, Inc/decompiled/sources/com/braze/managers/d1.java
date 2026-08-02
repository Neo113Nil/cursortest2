package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f580a;
    public Long b;
    public String c;
    public long d;
    public long e;
    public long f;

    public /* synthetic */ d1() {
        this(false, null, null, 0L, 0L, 0L);
    }

    public final String a() {
        return this.c;
    }

    public final Long b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f580a == d1Var.f580a && Intrinsics.areEqual(this.b, d1Var.b) && Intrinsics.areEqual(this.c, d1Var.c) && this.d == d1Var.d && this.e == d1Var.e && this.f == d1Var.f;
    }

    public final boolean f() {
        return this.f580a;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f580a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return Long.hashCode(this.f) + ((Long.hashCode(this.e) + ((Long.hashCode(this.d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.f580a + ", sdkDebuggerExpirationTime=" + this.b + ", sdkDebuggerAuthCode=" + this.c + ", sdkDebuggerFlushIntervalBytes=" + this.d + ", sdkDebuggerFlushIntervalSeconds=" + this.e + ", sdkDebuggerMaxPayloadBytes=" + this.f + ")";
    }

    public d1(boolean z, Long l, String str, long j, long j2, long j3) {
        this.f580a = z;
        this.b = l;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }
}
