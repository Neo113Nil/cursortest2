package io.appmetrica.analytics.idsync.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f11835a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11837c;

    public E(String str, long j, int i5) {
        this.f11835a = str;
        this.f11836b = j;
        this.f11837c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return Intrinsics.areEqual(this.f11835a, e7.f11835a) && this.f11836b == e7.f11836b && this.f11837c == e7.f11837c;
    }

    public final int hashCode() {
        int hashCode = this.f11835a.hashCode() * 31;
        long j = this.f11836b;
        return A.a(this.f11837c) + ((((int) (j ^ (j >>> 32))) + hashCode) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f11835a + ", lastAttempt=" + this.f11836b + ", lastAttemptResult=" + z.b(this.f11837c) + ')';
    }
}
