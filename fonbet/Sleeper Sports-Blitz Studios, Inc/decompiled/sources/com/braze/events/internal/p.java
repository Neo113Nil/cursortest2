package com.braze.events.internal;

/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f532a;

    public p(long j) {
        this.f532a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f532a == ((p) obj).f532a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f532a);
    }

    public final String toString() {
        return "PushMaxRequestSuccessEvent(lastUpdateTime=" + this.f532a + ")";
    }
}
