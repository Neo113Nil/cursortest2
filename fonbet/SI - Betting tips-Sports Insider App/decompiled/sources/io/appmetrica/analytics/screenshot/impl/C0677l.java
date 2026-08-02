package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15378a;

    /* renamed from: b, reason: collision with root package name */
    public final C0678m f15379b;

    public C0677l(boolean z5, C0678m c0678m) {
        this.f15378a = z5;
        this.f15379b = c0678m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0677l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C0677l c0677l = (C0677l) obj;
        return this.f15378a == c0677l.f15378a && Intrinsics.areEqual(this.f15379b, c0677l.f15379b);
    }

    public final int hashCode() {
        int i5 = (this.f15378a ? 1231 : 1237) * 31;
        C0678m c0678m = this.f15379b;
        return i5 + (c0678m != null ? c0678m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f15378a + ", config=" + this.f15379b + ')';
    }
}
