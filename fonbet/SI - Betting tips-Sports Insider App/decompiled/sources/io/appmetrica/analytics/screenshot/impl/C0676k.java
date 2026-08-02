package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15372a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15373b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15374c;

    public C0676k(boolean z5, List list, long j) {
        this.f15372a = z5;
        this.f15373b = list;
        this.f15374c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0676k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C0676k c0676k = (C0676k) obj;
        return this.f15372a == c0676k.f15372a && Intrinsics.areEqual(this.f15373b, c0676k.f15373b) && this.f15374c == c0676k.f15374c;
    }

    public final int hashCode() {
        int hashCode = (this.f15373b.hashCode() + ((this.f15372a ? 1231 : 1237) * 31)) * 31;
        long j = this.f15374c;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        sb2.append(this.f15372a);
        sb2.append(", mediaStoreColumnNames=");
        sb2.append(this.f15373b);
        sb2.append(", detectWindowSeconds=");
        return d9.e.j(sb2, this.f15374c, ')');
    }

    public C0676k(B b10) {
        this(b10.b(), b10.c(), b10.a());
    }
}
