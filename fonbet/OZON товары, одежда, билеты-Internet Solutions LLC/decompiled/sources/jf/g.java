package jf;

import javax.net.ssl.SSLSocket;
import jf.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class g implements l.a {
    @Override // jf.l.a
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return kotlin.text.h.e0(name, "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // jf.l.a
    @NotNull
    public final m b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i11 = h.f69987g;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(U7.m.a(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new h(cls2);
    }
}
