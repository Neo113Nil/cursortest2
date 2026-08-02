package jf;

import We.F;
import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p002if.j;

@SuppressLint({"NewApi"})
/* renamed from: jf.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7418c implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f69979a = new a();

    /* renamed from: jf.c$a */
    public static final class a {
    }

    @Override // jf.m
    public final boolean a(@NotNull SSLSocket sslSocket) {
        boolean isSupportedSocket;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // jf.m
    public final boolean b() {
        f69979a.getClass();
        p002if.j.f66400c.getClass();
        return j.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // jf.m
    @SuppressLint({"NewApi"})
    public final String c(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // jf.m
    @SuppressLint({"NewApi"})
    public final void d(@NotNull SSLSocket sslSocket, String str, @NotNull List<? extends F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sslParameters = sslSocket.getSSLParameters();
            Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
            p002if.j.f66400c.getClass();
            Object[] array = j.a.a(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sslParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sslParameters);
        } catch (IllegalArgumentException e11) {
            throw new IOException("Android internal error", e11);
        }
    }
}
