package lh;

import gh.b0;
import gh.g0;
import gh.i0;
import gh.m0;
import gh.n0;
import gh.o;
import gh.o0;
import gh.r0;
import gh.s0;
import gh.v;
import gh.x;
import gh.y;
import gh.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kh.l;
import kh.p;
import kh.q;
import kh.r;
import kh.s;
import kh.w;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Headers;
import okio.GzipSource;
import okio.Okio;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20083a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20084b;

    public a(o cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f20084b = cookieJar;
    }

    public static int d(o0 o0Var, int i5) {
        String c2 = o0.c(o0Var, "Retry-After");
        if (c2 == null) {
            return i5;
        }
        if (!new Regex("\\d+").d(c2)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(c2);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d5, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        r4.g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
    
        return r0;
     */
    @Override // gh.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 a(h chain) {
        boolean z5;
        r0 r0Var;
        p call;
        List suppressed;
        boolean z7;
        o0 networkResponse;
        boolean z10;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        gh.h hVar;
        switch (this.f20083a) {
            case 0:
                o oVar = (o) this.f20084b;
                Intrinsics.checkNotNullParameter(chain, "chain");
                i0 i0Var = chain.f20093e;
                c4.d b10 = i0Var.b();
                y url = i0Var.f10206a;
                m0 m0Var = i0Var.f10209d;
                if (m0Var != null) {
                    b0 b11 = m0Var.b();
                    if (b11 != null) {
                        b10.i("Content-Type", b11.f10119a);
                    }
                    long a7 = m0Var.a();
                    if (a7 != -1) {
                        b10.i("Content-Length", String.valueOf(a7));
                        b10.n("Transfer-Encoding");
                    } else {
                        b10.i("Transfer-Encoding", "chunked");
                        b10.n("Content-Length");
                    }
                }
                if (i0Var.a("Host") == null) {
                    b10.i("Host", hh.g.i(url, false));
                }
                if (i0Var.a("Connection") == null) {
                    b10.i("Connection", "Keep-Alive");
                }
                if (i0Var.a("Accept-Encoding") == null && i0Var.a("Range") == null) {
                    b10.i("Accept-Encoding", "gzip");
                    z5 = true;
                } else {
                    z5 = false;
                }
                oVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                e0.f19204a.getClass();
                if (i0Var.a("User-Agent") == null) {
                    b10.i("User-Agent", "okhttp/5.3.2");
                }
                i0 request = new i0(b10);
                o0 b12 = chain.b(request);
                Headers headers = b12.f10278f;
                g.b(oVar, request.f10206a, headers);
                n0 k6 = b12.k();
                Intrinsics.checkNotNullParameter(request, "request");
                k6.f10257a = request;
                if (z5 && "gzip".equalsIgnoreCase(o0.c(b12, "Content-Encoding")) && g.a(b12) && (r0Var = b12.f10279g) != null) {
                    GzipSource gzipSource = new GzipSource(r0Var.m0());
                    v newBuilder = headers.newBuilder();
                    newBuilder.e("Content-Encoding");
                    newBuilder.e("Content-Length");
                    Headers headers2 = newBuilder.d();
                    Intrinsics.checkNotNullParameter(headers2, "headers");
                    k6.f10262f = headers2.newBuilder();
                    i body = new i(o0.c(b12, "Content-Type"), -1L, Okio.buffer(gzipSource));
                    Intrinsics.checkNotNullParameter(body, "body");
                    k6.f10263g = body;
                }
                return k6.a();
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                i0 i0Var2 = chain.f20093e;
                p pVar = chain.f20089a;
                List list = e0.f19204a;
                o0 o0Var = null;
                int i5 = 0;
                i0 request2 = i0Var2;
                boolean z11 = true;
                while (true) {
                    Intrinsics.checkNotNullParameter(request2, "request");
                    Intrinsics.checkNotNullParameter(chain, "chain");
                    if (pVar.f19147k != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    synchronized (pVar) {
                        try {
                            try {
                                if (pVar.f19149m) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (!pVar.f19148l && !pVar.f19151o && !pVar.f19150n) {
                                    Unit unit = Unit.f19194a;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            call = pVar;
                        }
                    }
                    if (z11) {
                        g0 g0Var = pVar.f19138a;
                        jh.e eVar = g0Var.f10193z;
                        List list2 = list;
                        r rVar = pVar.f19140c;
                        int i10 = g0Var.f10190w;
                        int i11 = g0Var.f10191x;
                        int i12 = chain.f20094f;
                        int i13 = chain.f20095g;
                        boolean z12 = g0Var.f10174e;
                        boolean z13 = g0Var.f10175f;
                        y url2 = request2.f10206a;
                        Intrinsics.checkNotNullParameter(url2, "url");
                        if (Intrinsics.areEqual(url2.f10329a, "https")) {
                            SSLSocketFactory sSLSocketFactory2 = g0Var.f10183o;
                            if (sSLSocketFactory2 == null) {
                                throw new IllegalStateException("CLEARTEXT-only client");
                            }
                            HostnameVerifier hostnameVerifier2 = g0Var.f10186s;
                            hVar = g0Var.f10187t;
                            hostnameVerifier = hostnameVerifier2;
                            sSLSocketFactory = sSLSocketFactory2;
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            hVar = null;
                        }
                        suppressed = list2;
                        p pVar2 = pVar;
                        i0 i0Var3 = request2;
                        s sVar = new s(eVar, rVar, i10, i11, i12, i13, z12, z13, new gh.a(url2.f10332d, url2.f10333e, g0Var.f10179k, g0Var.f10182n, sSLSocketFactory, hostnameVerifier, hVar, g0Var.f10181m, g0Var.f10185r, g0Var.q, g0Var.f10180l), pVar.f19138a.f10192y, pVar2, i0Var3);
                        call = pVar2;
                        request2 = i0Var3;
                        g0 g0Var2 = call.f19138a;
                        call.f19145h = g0Var2.f10175f ? new l(sVar, g0Var2.f10193z) : new i2.d(sVar);
                    } else {
                        call = pVar;
                        suppressed = list;
                    }
                    try {
                        if (!call.q) {
                            try {
                                n0 k9 = chain.b(request2).k();
                                Intrinsics.checkNotNullParameter(request2, "request");
                                k9.f10257a = request2;
                                k9.f10266k = o0Var != null ? u6.h.w(o0Var) : null;
                                networkResponse = k9.a();
                                request2 = b(networkResponse, call.f19147k);
                                try {
                                } catch (Throwable th4) {
                                    th = th4;
                                    z7 = false;
                                }
                            } catch (IOException exception) {
                                boolean c2 = c(exception, call, request2);
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (!c2) {
                                    byte[] bArr = hh.e.f10821a;
                                    Intrinsics.checkNotNullParameter(exception, "<this>");
                                    Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                                    Iterator it = suppressed.iterator();
                                    while (it.hasNext()) {
                                        gf.d.a(exception, (Exception) it.next());
                                    }
                                    throw exception;
                                }
                                list = CollectionsKt.O(suppressed, exception);
                                call.g(true);
                                pVar = call;
                                z11 = false;
                            }
                            if (request2 != null) {
                                m0 m0Var2 = request2.f10209d;
                                if (m0Var2 != null && m0Var2.c()) {
                                    Intrinsics.checkNotNullParameter(call, "call");
                                    Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                                    z10 = false;
                                    break;
                                } else {
                                    hh.e.b(networkResponse.f10279g);
                                    int i14 = i5 + 1;
                                    if (i14 > 20) {
                                        Intrinsics.checkNotNullParameter(call, "call");
                                        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                                        throw new ProtocolException("Too many follow-up requests: " + i14);
                                    }
                                    Intrinsics.checkNotNullParameter(call, "call");
                                    Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                                    call.g(true);
                                    o0Var = networkResponse;
                                    list = suppressed;
                                    i5 = i14;
                                    z11 = true;
                                    pVar = call;
                                }
                            } else {
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                                z10 = false;
                                break;
                            }
                        } else {
                            z7 = true;
                            try {
                                throw new IOException("Canceled");
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z7 = true;
                    }
                    call.g(z7);
                    throw th;
                }
        }
    }

    public i0 b(o0 response, kh.h hVar) {
        m0 m0Var;
        o0 o0Var;
        s0 s0Var = hVar != null ? hVar.b().f19156c : null;
        int i5 = response.f10276d;
        i0 i0Var = response.f10273a;
        String method = i0Var.f10207b;
        if (i5 != 307 && i5 != 308) {
            if (i5 == 401) {
                ((g0) this.f20084b).f10176g.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i5 == 421) {
                m0 m0Var2 = i0Var.f10209d;
                if ((m0Var2 == null || !m0Var2.c()) && hVar != null && !Intrinsics.areEqual(((s) ((kh.i) hVar.f19121d).c()).f19181i.f10114h.f10332d, ((f) hVar.f19122e).g().h().f10302a.f10114h.f10332d)) {
                    q b10 = hVar.b();
                    synchronized (b10) {
                        b10.f19163k = true;
                        Unit unit = Unit.f19194a;
                    }
                    return response.f10273a;
                }
            } else if (i5 == 503) {
                o0 o0Var2 = response.f10282k;
                if ((o0Var2 == null || o0Var2.f10276d != 503) && d(response, Integer.MAX_VALUE) == 0) {
                    return response.f10273a;
                }
            } else {
                if (i5 == 407) {
                    Intrinsics.checkNotNull(s0Var);
                    if (s0Var.f10303b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((g0) this.f20084b).f10181m.getClass();
                    Intrinsics.checkNotNullParameter(response, "response");
                    return null;
                }
                if (i5 != 408) {
                    switch (i5) {
                    }
                } else if (((g0) this.f20084b).f10174e && (((m0Var = i0Var.f10209d) == null || !m0Var.c()) && (((o0Var = response.f10282k) == null || o0Var.f10276d != 408) && d(response, 0) <= 0))) {
                    return response.f10273a;
                }
            }
            return null;
        }
        g0 g0Var = (g0) this.f20084b;
        if (g0Var.f10177h) {
            String link = o0.c(response, "Location");
            i0 i0Var2 = response.f10273a;
            if (link != null) {
                y yVar = i0Var2.f10206a;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                x f6 = yVar.f(link);
                y url = f6 != null ? f6.a() : null;
                if (url != null && (Intrinsics.areEqual(url.f10329a, i0Var2.f10206a.f10329a) || g0Var.f10178i)) {
                    c4.d b11 = i0Var2.b();
                    if (com.google.android.play.core.appupdate.b.D(method)) {
                        int i10 = response.f10276d;
                        Intrinsics.checkNotNullParameter(method, "method");
                        boolean z5 = Intrinsics.areEqual(method, "PROPFIND") || i10 == 308 || i10 == 307;
                        Intrinsics.checkNotNullParameter(method, "method");
                        if (Intrinsics.areEqual(method, "PROPFIND") || i10 == 308 || i10 == 307) {
                            b11.j(method, z5 ? i0Var2.f10209d : null);
                        } else {
                            b11.j("GET", null);
                        }
                        if (!z5) {
                            b11.n("Transfer-Encoding");
                            b11.n("Content-Length");
                            b11.n("Content-Type");
                        }
                    }
                    if (!hh.g.a(i0Var2.f10206a, url)) {
                        b11.n("Authorization");
                    }
                    Intrinsics.checkNotNullParameter(url, "url");
                    b11.f3577b = url;
                    return new i0(b11);
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, p pVar, i0 i0Var) {
        m0 m0Var;
        boolean z5 = iOException instanceof nh.a;
        if (!((g0) this.f20084b).f10174e) {
            return false;
        }
        if ((!z5 && (((m0Var = i0Var.f10209d) != null && m0Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z5) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        kh.h hVar = pVar.f19153r;
        if (hVar == null || !hVar.f19118a) {
            return false;
        }
        kh.i iVar = pVar.f19145h;
        Intrinsics.checkNotNull(iVar);
        w c2 = iVar.c();
        kh.h hVar2 = pVar.f19153r;
        return ((s) c2).a(hVar2 != null ? hVar2.b() : null);
    }

    public a(g0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f20084b = client;
    }
}
