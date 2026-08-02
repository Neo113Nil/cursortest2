package ef;

import We.A;
import We.B;
import We.E;
import We.G;
import We.K;
import We.L;
import We.M;
import We.O;
import cf.C5822c;
import cf.C5824e;
import cf.n;
import gf.C6725a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* renamed from: ef.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6359i implements B {

    /* renamed from: a, reason: collision with root package name */
    private final E f62235a;

    public C6359i(@NotNull E client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f62235a = client;
    }

    private final G a(L l11, C5822c c5822c) throws IOException {
        String q11;
        A t2;
        K a11;
        L z11;
        cf.j h11;
        O x11 = (c5822c == null || (h11 = c5822c.h()) == null) ? null : h11.x();
        int m11 = l11.m();
        String method = l11.L().h();
        E e11 = this.f62235a;
        if (m11 != 307 && m11 != 308) {
            if (m11 == 401) {
                return e11.e().a(x11, l11);
            }
            if (m11 == 421) {
                K a12 = l11.L().a();
                if ((a12 == null || !a12.isOneShot()) && c5822c != null && c5822c.k()) {
                    c5822c.h().v();
                    return l11.L();
                }
            } else if (m11 == 503) {
                L z12 = l11.z();
                if ((z12 == null || z12.m() != 503) && c(l11, Integer.MAX_VALUE) == 0) {
                    return l11.L();
                }
            } else {
                if (m11 == 407) {
                    Intrinsics.f(x11);
                    if (x11.b().type() == Proxy.Type.HTTP) {
                        return e11.B().a(x11, l11);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (m11 != 408) {
                    switch (m11) {
                    }
                } else if (e11.E() && (((a11 = l11.L().a()) == null || !a11.isOneShot()) && (((z11 = l11.z()) == null || z11.m() != 408) && c(l11, 0) <= 0))) {
                    return l11.L();
                }
            }
            return null;
        }
        if (e11.q() && (q11 = L.q(l11, "Location")) != null && (t2 = l11.L().j().t(q11)) != null && (Intrinsics.d(t2.u(), l11.L().j().u()) || e11.r())) {
            G L11 = l11.L();
            L11.getClass();
            G.a aVar = new G.a(L11);
            if (C6356f.a(method)) {
                int m12 = l11.m();
                Intrinsics.checkNotNullParameter(method, "method");
                boolean z13 = method.equals("PROPFIND") || m12 == 308 || m12 == 307;
                Intrinsics.checkNotNullParameter(method, "method");
                if (method.equals("PROPFIND") || m12 == 308 || m12 == 307) {
                    aVar.f(z13 ? l11.L().a() : null, method);
                } else {
                    aVar.f(null, "GET");
                }
                if (!z13) {
                    aVar.h("Transfer-Encoding");
                    aVar.h("Content-Length");
                    aVar.h("Content-Type");
                }
            }
            if (!Ye.b.c(l11.L().j(), t2)) {
                aVar.h("Authorization");
            }
            aVar.j(t2);
            return aVar.b();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r6 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean b(IOException iOException, C5824e c5824e, G g10, boolean z11) {
        K a11;
        if (!this.f62235a.E() || ((z11 && (((a11 = g10.a()) != null && a11.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return c5824e.s();
    }

    private static int c(L l11, int i11) {
        String q11 = L.q(l11, "Retry-After");
        if (q11 == null) {
            return i11;
        }
        if (!new Regex("\\d+").f(q11)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(q11);
        Intrinsics.checkNotNullExpressionValue(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) throws IOException {
        C5822c k11;
        G a11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6357g c6357g = (C6357g) chain;
        G f7 = c6357g.f();
        C5824e b11 = c6357g.b();
        List list = kotlin.collections.K.f71697a;
        boolean z11 = true;
        int i11 = 0;
        L l11 = null;
        while (true) {
            b11.e(f7, z11);
            try {
                if (b11.isCanceled()) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        L proceed = c6357g.proceed(f7);
                        if (l11 != null) {
                            L.a aVar = new L.a(proceed);
                            L.a aVar2 = new L.a(l11);
                            aVar2.b(null);
                            aVar.n(aVar2.c());
                            proceed = aVar.c();
                        }
                        l11 = proceed;
                        k11 = b11.k();
                        a11 = a(l11, k11);
                    } catch (n e11) {
                        if (!b(e11.d(), b11, f7, false)) {
                            IOException b12 = e11.b();
                            Ye.b.E(b12, list);
                            throw b12;
                        }
                        list = C7714v.q0(e11.b(), list);
                        b11.f(true);
                        z11 = false;
                    }
                } catch (IOException e12) {
                    if (!b(e12, b11, f7, !(e12 instanceof C6725a))) {
                        Ye.b.E(e12, list);
                        throw e12;
                    }
                    list = C7714v.q0(e12, list);
                    b11.f(true);
                    z11 = false;
                }
                if (a11 == null) {
                    if (k11 != null && k11.l()) {
                        b11.u();
                    }
                    b11.f(false);
                    return l11;
                }
                K a12 = a11.a();
                if (a12 != null && a12.isOneShot()) {
                    b11.f(false);
                    return l11;
                }
                M c11 = l11.c();
                if (c11 != null) {
                    Ye.b.e(c11);
                }
                i11++;
                if (i11 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i11);
                }
                b11.f(true);
                f7 = a11;
                z11 = true;
            } catch (Throwable th2) {
                b11.f(true);
                throw th2;
            }
        }
    }
}
