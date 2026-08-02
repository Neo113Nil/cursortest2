package io.sentry.cache;

import io.sentry.O;
import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.r;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h implements O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67790a;

    public h(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f67790a = sentryAndroidOptions;
    }

    private void h(@NotNull String str) {
        d.a(this.f67790a, ".options-cache", str);
    }

    public static <T> T i(@NotNull W2 w22, @NotNull String str, @NotNull Class<T> cls) {
        return (T) d.c(w22, ".options-cache", str, cls);
    }

    private <T> void j(@NotNull T t2, @NotNull String str) {
        d.d(this.f67790a, t2, ".options-cache", str);
    }

    @Override // io.sentry.O
    public final void a(@NotNull Map<String, String> map) {
        j(map, "tags.json");
    }

    @Override // io.sentry.O
    public final void b(String str) {
        if (str == null) {
            h("dist.json");
        } else {
            j(str, "dist.json");
        }
    }

    @Override // io.sentry.O
    public final void c(String str) {
        if (str == null) {
            h("environment.json");
        } else {
            j(str, "environment.json");
        }
    }

    @Override // io.sentry.O
    public final void d(String str) {
        if (str == null) {
            h("proguard-uuid.json");
        } else {
            j(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.O
    public final void e(r rVar) {
        if (rVar == null) {
            h("sdk-version.json");
        } else {
            j(rVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.O
    public final void f(Double d11) {
        if (d11 == null) {
            h("replay-error-sample-rate.json");
        } else {
            j(d11.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.O
    public final void g(String str) {
        if (str == null) {
            h("release.json");
        } else {
            j(str, "release.json");
        }
    }
}
