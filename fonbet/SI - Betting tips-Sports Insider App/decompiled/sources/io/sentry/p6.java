package io.sentry;

import io.appmetrica.analytics.impl.ap;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p6 implements c2 {

    /* renamed from: b, reason: collision with root package name */
    public static final p6 f16724b = new p6("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.f f16725a;

    public p6(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f16725a = new io.sentry.util.f(new com.google.firebase.messaging.q(str, 6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p6.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f16725a.a()).equals(((p6) obj).f16725a.a());
    }

    public final int hashCode() {
        return ((String) this.f16725a.a()).hashCode();
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        ((l1.a) b3Var).K((String) this.f16725a.a());
    }

    public final String toString() {
        return (String) this.f16725a.a();
    }

    public p6() {
        this.f16725a = new io.sentry.util.f(new ap(14));
    }
}
