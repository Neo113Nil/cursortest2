package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class k extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f68533a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f68534b;

    k(@NotNull String str, @NotNull String str2) {
        this.f68533a = str;
        this.f68534b = str2;
    }

    @Override // java.net.Authenticator
    protected final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f68533a, this.f68534b.toCharArray());
    }
}
