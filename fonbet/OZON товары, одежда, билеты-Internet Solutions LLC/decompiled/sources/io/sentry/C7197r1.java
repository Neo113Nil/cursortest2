package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7197r1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final URL f68406a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap f68407b;

    public C7197r1(@NotNull String str, @NotNull HashMap hashMap) {
        io.sentry.util.p.b(str, "url is required");
        try {
            this.f68406a = URI.create(str).toURL();
            this.f68407b = hashMap;
        } catch (MalformedURLException e11) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e11);
        }
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f68407b;
    }

    @NotNull
    public final URL b() {
        return this.f68406a;
    }
}
