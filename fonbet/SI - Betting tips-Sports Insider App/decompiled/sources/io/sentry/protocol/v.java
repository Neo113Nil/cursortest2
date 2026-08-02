package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements c2 {

    /* renamed from: b, reason: collision with root package name */
    public static final v f16922b = new v("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.f f16923a;

    public v() {
        this.f16923a = new io.sentry.util.f(new io.sentry.clientreport.a(3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f16923a.a()).equals(((v) obj).f16923a.a());
    }

    public final int hashCode() {
        return ((String) this.f16923a.a()).hashCode();
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        ((l1.a) b3Var).K(toString());
    }

    public final String toString() {
        return (String) this.f16923a.a();
    }

    public v(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        }
        if (str2.length() == 36) {
            this.f16923a = new io.sentry.util.f(new com.google.firebase.messaging.q(this, str2));
        } else {
            this.f16923a = new io.sentry.util.f(new com.google.firebase.messaging.q(str2, 6));
        }
    }
}
