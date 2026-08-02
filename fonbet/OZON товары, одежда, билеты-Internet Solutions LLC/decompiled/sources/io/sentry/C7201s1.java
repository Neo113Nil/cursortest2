package io.sentry;

import java.net.URI;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7201s1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7211v f68478a;

    /* renamed from: b, reason: collision with root package name */
    private final String f68479b;

    public C7201s1(@NotNull W2 w22) {
        this.f68478a = w22.retrieveParsedDsn();
        this.f68479b = w22.getSentryClientName();
    }

    @NotNull
    public final C7197r1 a() {
        C7211v c7211v = this.f68478a;
        URI c11 = c7211v.c();
        String uri = c11.resolve(c11.getPath() + "/envelope/").toString();
        String a11 = c7211v.a();
        String b11 = c7211v.b();
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        String str = this.f68479b;
        sb2.append(str);
        sb2.append(",sentry_key=");
        sb2.append(a11);
        sb2.append((b11 == null || b11.length() <= 0) ? "" : ",sentry_secret=".concat(b11));
        String sb3 = sb2.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", str);
        hashMap.put("X-Sentry-Auth", sb3);
        return new C7197r1(uri, hashMap);
    }
}
