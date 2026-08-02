package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f15179a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15180b;

    public d(NetworkTask networkTask) {
        this.f15179a = networkTask;
        this.f15180b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f15180b.equals(((d) obj).f15180b);
    }

    public final int hashCode() {
        return this.f15180b.hashCode();
    }
}
