package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public final String f17136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17137b;

    public l(String str, String str2) {
        y4.a.C(str, "user is required");
        this.f17136a = str;
        y4.a.C(str2, "password is required");
        this.f17137b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f17136a, this.f17137b.toCharArray());
    }
}
