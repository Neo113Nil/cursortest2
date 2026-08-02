package io.sentry.transport;

import java.net.Authenticator;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f52739a = new l();

    public static l a() {
        return f52739a;
    }

    public void b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
