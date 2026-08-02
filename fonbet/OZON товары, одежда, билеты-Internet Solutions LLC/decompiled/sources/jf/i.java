package jf;

import We.F;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jf.l;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import p002if.C7069c;
import p002if.j;

/* loaded from: classes6.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f69993a = new a();

    public static final class a implements l.a {
        @Override // jf.l.a
        public final boolean a(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            C7069c.f66379f.getClass();
            C7069c.a.b();
            return false;
        }

        @Override // jf.l.a
        @NotNull
        public final m b(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new i();
        }
    }

    @Override // jf.m
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // jf.m
    public final boolean b() {
        C7069c.f66379f.getClass();
        return C7069c.a.b();
    }

    @Override // jf.m
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // jf.m
    public final void d(@NotNull SSLSocket sslSocket, String str, @NotNull List<? extends F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters sslParameters = bCSSLSocket.getParameters();
            Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
            p002if.j.f66400c.getClass();
            Object[] array = j.a.a(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sslParameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(sslParameters);
        }
    }
}
