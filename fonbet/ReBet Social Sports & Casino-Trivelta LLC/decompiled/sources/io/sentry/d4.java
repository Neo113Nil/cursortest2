package io.sentry;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d4 implements G0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d4 f52019b = new d4("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* renamed from: a, reason: collision with root package name */
    public volatile String f52020a;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d4 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            return new d4(interfaceC4809q1.M0());
        }
    }

    public d4(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f52020a = str;
    }

    public final String a() {
        String str;
        String str2 = this.f52020a;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                str = this.f52020a;
                if (str == null) {
                    str = T3.b();
                    this.f52020a = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d4.class != obj.getClass()) {
            return false;
        }
        return a().equals(((d4) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.e(a());
    }

    public String toString() {
        return a();
    }

    public d4() {
    }
}
