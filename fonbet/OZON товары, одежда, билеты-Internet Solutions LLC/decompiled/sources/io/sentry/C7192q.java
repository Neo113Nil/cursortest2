package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7192q implements InterfaceC7154i0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f68385a;

    public C7192q(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f68385a = sentryAndroidOptions;
    }

    @Override // io.sentry.InterfaceC7154i0
    public final boolean a() {
        return G2.d().c(this.f68385a.getFatalLogger());
    }
}
