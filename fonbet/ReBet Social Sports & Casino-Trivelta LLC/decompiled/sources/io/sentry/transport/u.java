package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes3.dex */
public final class u extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public final String f52749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52750b;

    public u(String str, String str2) {
        this.f52749a = (String) io.sentry.util.w.c(str, "user is required");
        this.f52750b = (String) io.sentry.util.w.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f52749a, this.f52750b.toCharArray());
        }
        return null;
    }
}
