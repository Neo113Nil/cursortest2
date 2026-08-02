package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15369a;

    public C0675j(boolean z5) {
        this.f15369a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0675j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f15369a == ((C0675j) obj).f15369a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return this.f15369a ? 1231 : 1237;
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f15369a + ')';
    }

    public C0675j(C0690z c0690z) {
        this(c0690z.a());
    }
}
