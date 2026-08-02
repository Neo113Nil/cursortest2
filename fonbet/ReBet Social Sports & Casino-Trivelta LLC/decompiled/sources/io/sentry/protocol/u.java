package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.T3;
import io.sentry.util.J;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class u implements G0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f52477c = new u("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* renamed from: a, reason: collision with root package name */
    public volatile String f52478a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f52479b;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            return new u(interfaceC4809q1.M0());
        }
    }

    public u() {
        this((UUID) null);
    }

    private String a() {
        String str;
        String str2 = this.f52478a;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                str = this.f52478a;
                if (str == null) {
                    UUID uuid = this.f52479b;
                    str = uuid != null ? b(J.c(uuid)) : T3.a();
                    this.f52478a = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final String b(String str) {
        return io.sentry.util.D.h(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return a().equals(((u) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.e(toString());
    }

    public String toString() {
        return a();
    }

    public u(UUID uuid) {
        this.f52479b = uuid;
    }

    public u(String str) {
        String h10 = io.sentry.util.D.h(str);
        if (h10.length() != 32 && h10.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        this.f52479b = null;
        this.f52478a = h10.length() == 36 ? h10.replace("-", "") : h10;
    }
}
