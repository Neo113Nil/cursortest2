package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678m {

    /* renamed from: a, reason: collision with root package name */
    public final C0675j f15382a;

    /* renamed from: b, reason: collision with root package name */
    public final C0679n f15383b;

    /* renamed from: c, reason: collision with root package name */
    public final C0676k f15384c;

    public C0678m(C0675j c0675j, C0679n c0679n, C0676k c0676k) {
        this.f15382a = c0675j;
        this.f15383b = c0679n;
        this.f15384c = c0676k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0678m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C0678m c0678m = (C0678m) obj;
        return Intrinsics.areEqual(this.f15382a, c0678m.f15382a) && Intrinsics.areEqual(this.f15383b, c0678m.f15383b) && Intrinsics.areEqual(this.f15384c, c0678m.f15384c);
    }

    public final int hashCode() {
        C0675j c0675j = this.f15382a;
        int hashCode = (c0675j != null ? c0675j.hashCode() : 0) * 31;
        C0679n c0679n = this.f15383b;
        int hashCode2 = (hashCode + (c0679n != null ? c0679n.hashCode() : 0)) * 31;
        C0676k c0676k = this.f15384c;
        return hashCode2 + (c0676k != null ? c0676k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f15382a + ", serviceCaptorConfig=" + this.f15383b + ", contentObserverCaptorConfig=" + this.f15384c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0678m(F f6) {
        this(r2, r3, r5 != null ? new C0676k(r5) : null);
        C0690z a7 = f6.a();
        C0675j c0675j = a7 != null ? new C0675j(a7) : null;
        H c2 = f6.c();
        C0679n c0679n = c2 != null ? new C0679n(c2) : null;
        B b10 = f6.b();
    }
}
