package io.sentry;

import java.io.IOException;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l3 implements InterfaceC7220x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l3 f68063b = new l3("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<String> f68064a;

    public static final class a implements InterfaceC7174n0<l3> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final l3 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return new l3(interfaceC7131c1.nextString());
        }
    }

    public l3(@NotNull String str) {
        Objects.requireNonNull(str, "value is required");
        this.f68064a = new io.sentry.util.l<>(new com.google.gson.internal.f(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l3.class != obj.getClass()) {
            return false;
        }
        return this.f68064a.a().equals(((l3) obj).f68064a.a());
    }

    public final int hashCode() {
        return this.f68064a.a().hashCode();
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        ((C7212v0) interfaceC7135d1).p(this.f68064a.a());
    }

    public final String toString() {
        return this.f68064a.a();
    }

    public l3() {
        this.f68064a = new io.sentry.util.l<>(new Pk0.a(4));
    }
}
