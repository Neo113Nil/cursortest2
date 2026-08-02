package com.braze.models.response;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f656a;
    public final int b;

    public j(int i, int i2) {
        this.f656a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f656a == jVar.f656a && this.b == jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f656a) * 31);
    }

    public final String toString() {
        return "RateLimitEndpointConfig(capacity=" + this.f656a + ", refillRate=" + this.b + ")";
    }
}
