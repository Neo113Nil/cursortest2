package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15385a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15386b;

    public C0679n(boolean z5, long j) {
        this.f15385a = z5;
        this.f15386b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0679n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C0679n c0679n = (C0679n) obj;
        return this.f15385a == c0679n.f15385a && this.f15386b == c0679n.f15386b;
    }

    public final int hashCode() {
        int i5 = this.f15385a ? 1231 : 1237;
        long j = this.f15386b;
        return ((int) (j ^ (j >>> 32))) + (i5 * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientSideServiceCaptorConfig(enabled=");
        sb2.append(this.f15385a);
        sb2.append(", delaySeconds=");
        return d9.e.j(sb2, this.f15386b, ')');
    }

    public C0679n(H h10) {
        this(h10.b(), h10.a());
    }
}
