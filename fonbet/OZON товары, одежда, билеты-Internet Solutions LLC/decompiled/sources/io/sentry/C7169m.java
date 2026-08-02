package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7169m implements InterfaceC7227z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Long> f68074a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f68075b;

    public C7169m(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f68075b = sentryAndroidOptions;
    }

    @Override // io.sentry.InterfaceC7227z
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull E e11) {
        io.sentry.protocol.s v02;
        String k11;
        Long j11;
        if (!UncaughtExceptionHandlerIntegration.a.class.isInstance(e11.d("sentry:typeCheckHint")) || (v02 = c7230z2.v0()) == null || (k11 = v02.k()) == null || (j11 = v02.j()) == null) {
            return c7230z2;
        }
        Map<String, Long> map = this.f68074a;
        Long l11 = map.get(k11);
        if (l11 == null || l11.equals(j11)) {
            map.put(k11, j11);
            return c7230z2;
        }
        this.f68075b.getLogger().c(I2.INFO, "Event %s has been dropped due to multi-threaded deduplication", c7230z2.G());
        e11.k(io.sentry.hints.h.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
        return null;
    }
}
