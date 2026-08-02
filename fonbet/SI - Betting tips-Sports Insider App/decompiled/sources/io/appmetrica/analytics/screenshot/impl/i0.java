package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15366a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15367b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15368c;

    public i0(boolean z5, List list, long j) {
        this.f15366a = z5;
        this.f15367b = list;
        this.f15368c = j;
    }

    public final long a() {
        return this.f15368c;
    }

    public final boolean b() {
        return this.f15366a;
    }

    public final List c() {
        return this.f15367b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        sb2.append(this.f15366a);
        sb2.append(", mediaStoreColumnNames=");
        sb2.append(this.f15367b);
        sb2.append(", detectWindowSeconds=");
        return d9.e.j(sb2, this.f15368c, ')');
    }

    public i0(C0681p c0681p) {
        this(c0681p.b(), c0681p.c(), c0681p.a());
    }
}
