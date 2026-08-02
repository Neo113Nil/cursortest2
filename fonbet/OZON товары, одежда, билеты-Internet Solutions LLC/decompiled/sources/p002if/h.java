package p002if;

import We.F;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p002if.j;

/* loaded from: classes10.dex */
public final class h extends j {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f66393d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f66394e = new a();

    public static final class a {
        public static h a() {
            if (h.f66393d) {
                return new h();
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        boolean z11 = false;
        String property = System.getProperty("java.specification.version");
        Integer w02 = property != null ? kotlin.text.h.w0(property) : null;
        if (w02 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }
        z11 = true;
        f66393d = z11;
    }

    @Override // p002if.j
    public final void e(@NotNull SSLSocket sslSocket, String str, @NotNull List<F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sslParameters = sslSocket.getSSLParameters();
        j.f66400c.getClass();
        ArrayList a11 = j.a.a(protocols);
        Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
        Object[] array = a11.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sslParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sslParameters);
    }

    @Override // p002if.j
    public final String g(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
