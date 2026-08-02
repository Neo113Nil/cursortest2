package io.sentry.android.core;

import io.sentry.J;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7123y implements io.sentry.transport.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67397a;

    /* renamed from: io.sentry.android.core.y$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67398a;

        static {
            int[] iArr = new int[J.a.values().length];
            f67398a = iArr;
            try {
                iArr[J.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67398a[J.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67398a[J.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C7123y(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f67397a = sentryAndroidOptions;
    }

    @Override // io.sentry.transport.g
    public final boolean isConnected() {
        int i11 = a.f67398a[this.f67397a.getConnectionStatusProvider().l().ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }
}
