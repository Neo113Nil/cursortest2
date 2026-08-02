package io.sentry.protocol;

import hC.C6884b;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t implements InterfaceC7220x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f68325b = new t("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<String> f68326a;

    /* loaded from: classes10.dex */
    public static final class a implements InterfaceC7174n0<t> {
        @NotNull
        public static t b(@NotNull InterfaceC7131c1 interfaceC7131c1) throws Exception {
            return new t(interfaceC7131c1.nextString());
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ t a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1);
        }
    }

    public t() {
        this.f68326a = new io.sentry.util.l<>(new Ej.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return this.f68326a.a().equals(((t) obj).f68326a.a());
    }

    public final int hashCode() {
        return this.f68326a.a().hashCode();
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        ((C7212v0) interfaceC7135d1).p(toString());
    }

    public final String toString() {
        return this.f68326a.a();
    }

    public t(@NotNull String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        }
        if (str2.length() == 36) {
            this.f68326a = new io.sentry.util.l<>(new C6884b(this, str2));
        } else {
            this.f68326a = new io.sentry.util.l<>(new com.google.gson.internal.f(str2));
        }
    }
}
