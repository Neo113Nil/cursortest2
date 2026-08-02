package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15389a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15390b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15391c;

    public C0681p(boolean z5, List list, long j) {
        this.f15389a = z5;
        this.f15390b = list;
        this.f15391c = j;
    }

    public final long a() {
        return this.f15391c;
    }

    public final boolean b() {
        return this.f15389a;
    }

    public final List c() {
        return this.f15390b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentObserverCaptorConfig(enabled=");
        sb2.append(this.f15389a);
        sb2.append(", mediaStoreColumnNames='");
        sb2.append(this.f15390b);
        sb2.append("', detectWindowSeconds=");
        return d9.e.j(sb2, this.f15391c, ')');
    }

    public C0681p() {
        this(new O().f15319a, kotlin.collections.p.z(new O().f15321c), new O().f15320b);
    }
}
