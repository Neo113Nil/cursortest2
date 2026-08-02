package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* loaded from: classes3.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    public final URL f50386a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f50387b;

    public I1(String str, Map map) {
        io.sentry.util.w.c(str, "url is required");
        io.sentry.util.w.c(map, "headers is required");
        try {
            this.f50386a = URI.create(str).toURL();
            this.f50387b = map;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public Map a() {
        return this.f50387b;
    }

    public URL b() {
        return this.f50386a;
    }
}
