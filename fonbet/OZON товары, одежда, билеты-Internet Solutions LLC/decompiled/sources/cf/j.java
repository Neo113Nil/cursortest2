package cf;

import B0.A0;
import We.A;
import We.C4859a;
import We.C4867i;
import We.C4872n;
import We.E;
import We.F;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4870l;
import We.L;
import We.O;
import We.v;
import We.y;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import ef.C6357g;
import ef.InterfaceC6354d;
import ff.C6553b;
import gf.C6725a;
import gf.EnumC6726b;
import gf.f;
import gf.s;
import gf.t;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import lf.C7948d;
import org.jetbrains.annotations.NotNull;
import sf.G;
import sf.N;
import sf.z;

/* loaded from: classes6.dex */
public final class j extends f.c implements InterfaceC4870l {

    /* renamed from: b, reason: collision with root package name */
    private Socket f57127b;

    /* renamed from: c, reason: collision with root package name */
    private Socket f57128c;

    /* renamed from: d, reason: collision with root package name */
    private y f57129d;

    /* renamed from: e, reason: collision with root package name */
    private F f57130e;

    /* renamed from: f, reason: collision with root package name */
    private gf.f f57131f;

    /* renamed from: g, reason: collision with root package name */
    private G f57132g;

    /* renamed from: h, reason: collision with root package name */
    private sf.F f57133h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f57134i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57135j;

    /* renamed from: k, reason: collision with root package name */
    private int f57136k;

    /* renamed from: l, reason: collision with root package name */
    private int f57137l;

    /* renamed from: m, reason: collision with root package name */
    private int f57138m;

    /* renamed from: n, reason: collision with root package name */
    private int f57139n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final ArrayList f57140o;

    /* renamed from: p, reason: collision with root package name */
    private long f57141p;

    /* renamed from: q, reason: collision with root package name */
    private final O f57142q;

    public j(@NotNull l connectionPool, @NotNull O route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f57142q = route;
        this.f57139n = 1;
        this.f57140o = new ArrayList();
        this.f57141p = Long.MAX_VALUE;
    }

    private final void B(int i11) throws IOException {
        s sVar;
        Socket socket = this.f57128c;
        Intrinsics.f(socket);
        G g10 = this.f57132g;
        Intrinsics.f(g10);
        sf.F f7 = this.f57133h;
        Intrinsics.f(f7);
        socket.setSoTimeout(0);
        f.b bVar = new f.b(true, bf.e.f55976h);
        bVar.h(socket, this.f57142q.a().l().h(), g10, f7);
        bVar.f(this);
        bVar.g(i11);
        gf.f fVar = new gf.f(bVar);
        this.f57131f = fVar;
        sVar = gf.f.f64328C;
        this.f57139n = sVar.d();
        gf.f.d1(fVar, null, 3);
    }

    public static void g(@NotNull E client, @NotNull O failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            C4859a a11 = failedRoute.a();
            a11.i().connectFailed(a11.l().w(), failedRoute.b().address(), failure);
        }
        client.s().b(failedRoute);
    }

    private final void h(int i11, int i12, InterfaceC4865g interfaceC4865g, v vVar) throws IOException {
        Socket socket;
        p002if.j jVar;
        int i13;
        O o11 = this.f57142q;
        Proxy b11 = o11.b();
        C4859a a11 = o11.a();
        Proxy.Type type = b11.type();
        if (type != null && ((i13 = C5825f.f57121a[type.ordinal()]) == 1 || i13 == 2)) {
            socket = a11.j().createSocket();
            Intrinsics.f(socket);
        } else {
            socket = new Socket(b11);
        }
        this.f57127b = socket;
        vVar.connectStart(interfaceC4865g, o11.d(), b11);
        socket.setSoTimeout(i12);
        try {
            p002if.j.f66400c.getClass();
            jVar = p002if.j.f66398a;
            jVar.f(socket, o11.d(), i11);
            try {
                this.f57132g = z.d(z.i(socket));
                this.f57133h = z.c(z.f(socket));
            } catch (NullPointerException e11) {
                if (Intrinsics.d(e11.getMessage(), "throw with null exception")) {
                    throw new IOException(e11);
                }
            }
        } catch (ConnectException e12) {
            ConnectException connectException = new ConnectException("Failed to connect to " + o11.d());
            connectException.initCause(e12);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0152, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0154, code lost:
    
        r7 = r17.f57127b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0156, code lost:
    
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0158, code lost:
    
        Ye.b.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015b, code lost:
    
        r7 = null;
        r17.f57127b = null;
        r17.f57133h = null;
        r17.f57132g = null;
        r22.connectEnd(r21, r5.d(), r5.b(), null);
        r11 = r16 + 1;
        r1 = r19;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i(int i11, int i12, int i13, InterfaceC4865g interfaceC4865g, v vVar) throws IOException {
        char c11;
        int i14 = i12;
        G.a aVar = new G.a();
        O o11 = this.f57142q;
        aVar.j(o11.a().l());
        E e11 = null;
        aVar.f(null, "CONNECT");
        boolean z11 = true;
        aVar.d("Host", Ye.b.A(o11.a().l(), true));
        aVar.d("Proxy-Connection", "Keep-Alive");
        aVar.d("User-Agent", "okhttp/4.9.3");
        We.G b11 = aVar.b();
        L.a aVar2 = new L.a();
        aVar2.r(b11);
        aVar2.o(F.HTTP_1_1);
        aVar2.f(407);
        aVar2.l("Preemptive Authenticate");
        aVar2.b(Ye.b.f34902c);
        aVar2.s(-1L);
        aVar2.p(-1L);
        aVar2.i("Proxy-Authenticate", "OkHttp-Preemptive");
        We.G a11 = o11.a().h().a(o11, aVar2.c());
        if (a11 != null) {
            b11 = a11;
        }
        A j11 = b11.j();
        int i15 = 0;
        while (i15 < 21) {
            h(i11, i14, interfaceC4865g, vVar);
            String str = "CONNECT " + Ye.b.A(j11, z11) + " HTTP/1.1";
            while (true) {
                sf.G g10 = this.f57132g;
                Intrinsics.f(g10);
                sf.F f7 = this.f57133h;
                Intrinsics.f(f7);
                C6553b c6553b = new C6553b(e11, this, g10, f7);
                N timeout = g10.f98666a.timeout();
                long j12 = i14;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeout.g(j12, timeUnit);
                int i16 = i15;
                f7.f98662a.timeout().g(i13, timeUnit);
                c6553b.t(b11.e(), str);
                c6553b.e();
                L.a h11 = c6553b.h(false);
                Intrinsics.f(h11);
                h11.r(b11);
                L c12 = h11.c();
                c6553b.s(c12);
                int m11 = c12.m();
                if (m11 != 200) {
                    c11 = 407;
                    if (m11 != 407) {
                        throw new IOException("Unexpected response code for CONNECT: " + c12.m());
                    }
                    We.G a12 = o11.a().h().a(o11, c12);
                    if (a12 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(L.q(c12, "Connection"))) {
                        b11 = a12;
                        break;
                    }
                    i14 = i12;
                    b11 = a12;
                    i15 = i16;
                    e11 = null;
                } else {
                    c11 = 407;
                    if (!g10.f98667b.m() || !f7.f98663b.m()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    b11 = null;
                }
            }
        }
    }

    private final void j(C5821b c5821b, int i11, InterfaceC4865g interfaceC4865g, v vVar) throws IOException {
        p002if.j jVar;
        F f7;
        p002if.j jVar2;
        p002if.j jVar3;
        p002if.j jVar4;
        O o11 = this.f57142q;
        if (o11.a().k() == null) {
            List<F> f11 = o11.a().f();
            F f12 = F.H2_PRIOR_KNOWLEDGE;
            if (!f11.contains(f12)) {
                this.f57128c = this.f57127b;
                this.f57130e = F.HTTP_1_1;
                return;
            } else {
                this.f57128c = this.f57127b;
                this.f57130e = f12;
                B(i11);
                return;
            }
        }
        vVar.secureConnectStart(interfaceC4865g);
        C4859a a11 = o11.a();
        SSLSocketFactory k11 = a11.k();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.f(k11);
            Socket createSocket = k11.createSocket(this.f57127b, a11.l().h(), a11.l().n(), true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C4872n a12 = c5821b.a(sSLSocket2);
                if (a12.g()) {
                    p002if.j.f66400c.getClass();
                    jVar4 = p002if.j.f66398a;
                    jVar4.e(sSLSocket2, a11.l().h(), a11.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                y.a aVar = y.f33814e;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                aVar.getClass();
                y a13 = y.a.a(sslSocketSession);
                HostnameVerifier e11 = a11.e();
                Intrinsics.f(e11);
                if (!e11.verify(a11.l().h(), sslSocketSession)) {
                    List<Certificate> c11 = a13.c();
                    if (c11.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + a11.l().h() + " not verified (no certificates)");
                    }
                    Certificate certificate = c11.get(0);
                    if (certificate == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                    sb2.append(a11.l().h());
                    sb2.append(" not verified:\n              |    certificate: ");
                    C4867i.f33739d.getClass();
                    sb2.append(C4867i.b.a(x509Certificate));
                    sb2.append("\n              |    DN: ");
                    Principal subjectDN = x509Certificate.getSubjectDN();
                    Intrinsics.checkNotNullExpressionValue(subjectDN, "cert.subjectDN");
                    sb2.append(subjectDN.getName());
                    sb2.append("\n              |    subjectAltNames: ");
                    sb2.append(C7948d.a(x509Certificate));
                    sb2.append("\n              ");
                    throw new SSLPeerUnverifiedException(kotlin.text.h.F0(sb2.toString()));
                }
                C4867i a14 = a11.a();
                Intrinsics.f(a14);
                this.f57129d = new y(a13.d(), a13.a(), a13.b(), new g(a14, a13, a11));
                a14.b(a11.l().h(), new h(this));
                if (a12.g()) {
                    p002if.j.f66400c.getClass();
                    jVar3 = p002if.j.f66398a;
                    str = jVar3.g(sSLSocket2);
                }
                this.f57128c = sSLSocket2;
                this.f57132g = z.d(z.i(sSLSocket2));
                this.f57133h = z.c(z.f(sSLSocket2));
                if (str != null) {
                    F.Companion.getClass();
                    f7 = F.a.a(str);
                } else {
                    f7 = F.HTTP_1_1;
                }
                this.f57130e = f7;
                p002if.j.f66400c.getClass();
                jVar2 = p002if.j.f66398a;
                jVar2.b(sSLSocket2);
                vVar.secureConnectEnd(interfaceC4865g, this.f57129d);
                if (this.f57130e == F.HTTP_2) {
                    B(i11);
                }
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    p002if.j.f66400c.getClass();
                    jVar = p002if.j.f66398a;
                    jVar.b(sSLSocket);
                }
                if (sSLSocket != null) {
                    Ye.b.f(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @NotNull
    public final Socket A() {
        Socket socket = this.f57128c;
        Intrinsics.f(socket);
        return socket;
    }

    public final synchronized void C(@NotNull C5824e call, IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof t) {
                if (((t) iOException).f64462a == EnumC6726b.REFUSED_STREAM) {
                    int i11 = this.f57138m + 1;
                    this.f57138m = i11;
                    if (i11 > 1) {
                        this.f57134i = true;
                        this.f57136k++;
                    }
                } else if (((t) iOException).f64462a != EnumC6726b.CANCEL || !call.isCanceled()) {
                    this.f57134i = true;
                    this.f57136k++;
                }
            } else if (!s() || (iOException instanceof C6725a)) {
                this.f57134i = true;
                if (this.f57137l == 0) {
                    if (iOException != null) {
                        g(call.g(), this.f57142q, iOException);
                    }
                    this.f57136k++;
                }
            }
        } finally {
        }
    }

    @Override // We.InterfaceC4870l
    @NotNull
    public final F a() {
        F f7 = this.f57130e;
        Intrinsics.f(f7);
        return f7;
    }

    @Override // gf.f.c
    public final synchronized void b(@NotNull gf.f connection, @NotNull s settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f57139n = settings.d();
    }

    @Override // gf.f.c
    public final void c(@NotNull gf.n stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.d(EnumC6726b.REFUSED_STREAM, null);
    }

    public final void e() {
        Socket socket = this.f57127b;
        if (socket != null) {
            Ye.b.f(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i11, int i12, int i13, int i14, boolean z11, @NotNull InterfaceC4865g interfaceC4865g, @NotNull v vVar) {
        Socket socket;
        Socket socket2;
        p002if.j jVar;
        InterfaceC4865g call = interfaceC4865g;
        v eventListener = vVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f57130e != null) {
            throw new IllegalStateException("already connected");
        }
        O o11 = this.f57142q;
        List<C4872n> b11 = o11.a().b();
        C5821b c5821b = new C5821b(b11);
        if (o11.a().k() == null) {
            if (!b11.contains(C4872n.f33773f)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String h11 = o11.a().l().h();
            p002if.j.f66400c.getClass();
            jVar = p002if.j.f66398a;
            if (!jVar.i(h11)) {
                throw new n(new UnknownServiceException(A0.b("CLEARTEXT communication to ", h11, " not permitted by network security policy")));
            }
        } else if (o11.a().f().contains(F.H2_PRIOR_KNOWLEDGE)) {
            throw new n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        n nVar = null;
        while (true) {
            try {
                if (o11.c()) {
                    v vVar2 = eventListener;
                    InterfaceC4865g interfaceC4865g2 = call;
                    try {
                        i(i11, i12, i13, interfaceC4865g2, vVar2);
                        call = interfaceC4865g2;
                        eventListener = vVar2;
                    } catch (IOException e11) {
                        e = e11;
                        call = interfaceC4865g2;
                        eventListener = vVar2;
                    }
                    try {
                        if (this.f57127b == null) {
                            break;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        IOException iOException = e;
                        socket = this.f57128c;
                        if (socket != null) {
                        }
                        socket2 = this.f57127b;
                        if (socket2 != null) {
                        }
                        this.f57128c = null;
                        this.f57127b = null;
                        this.f57132g = null;
                        this.f57133h = null;
                        this.f57129d = null;
                        this.f57130e = null;
                        this.f57131f = null;
                        this.f57139n = 1;
                        eventListener.connectFailed(call, o11.d(), o11.b(), null, iOException);
                        if (nVar == null) {
                        }
                        if (!z11) {
                        }
                    }
                } else {
                    try {
                        h(i11, i12, call, eventListener);
                    } catch (IOException e13) {
                        e = e13;
                        IOException iOException2 = e;
                        socket = this.f57128c;
                        if (socket != null) {
                            Ye.b.f(socket);
                        }
                        socket2 = this.f57127b;
                        if (socket2 != null) {
                            Ye.b.f(socket2);
                        }
                        this.f57128c = null;
                        this.f57127b = null;
                        this.f57132g = null;
                        this.f57133h = null;
                        this.f57129d = null;
                        this.f57130e = null;
                        this.f57131f = null;
                        this.f57139n = 1;
                        eventListener.connectFailed(call, o11.d(), o11.b(), null, iOException2);
                        if (nVar == null) {
                            nVar = new n(iOException2);
                        } else {
                            nVar.a(iOException2);
                        }
                        if (!z11) {
                            throw nVar;
                        }
                        if (!c5821b.b(iOException2)) {
                            throw nVar;
                        }
                        call = interfaceC4865g;
                        eventListener = vVar;
                    }
                }
            } catch (IOException e14) {
                e = e14;
            }
            try {
                j(c5821b, i14, call, eventListener);
                eventListener.connectEnd(call, o11.d(), o11.b(), this.f57130e);
                break;
            } catch (IOException e15) {
                e = e15;
                IOException iOException22 = e;
                socket = this.f57128c;
                if (socket != null) {
                }
                socket2 = this.f57127b;
                if (socket2 != null) {
                }
                this.f57128c = null;
                this.f57127b = null;
                this.f57132g = null;
                this.f57133h = null;
                this.f57129d = null;
                this.f57130e = null;
                this.f57131f = null;
                this.f57139n = 1;
                eventListener.connectFailed(call, o11.d(), o11.b(), null, iOException22);
                if (nVar == null) {
                }
                if (!z11) {
                }
            }
            call = interfaceC4865g;
            eventListener = vVar;
        }
        if (o11.c() && this.f57127b == null) {
            throw new n(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f57141p = System.nanoTime();
    }

    @NotNull
    public final ArrayList k() {
        return this.f57140o;
    }

    public final long l() {
        return this.f57141p;
    }

    public final boolean m() {
        return this.f57134i;
    }

    public final int n() {
        return this.f57136k;
    }

    public final y o() {
        return this.f57129d;
    }

    public final synchronized void p() {
        this.f57137l++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (lf.C7948d.d(r8, (java.security.cert.X509Certificate) r0) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(@NotNull C4859a address, List<O> list) {
        y yVar;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = Ye.b.f34900a;
        if (this.f57140o.size() < this.f57139n && !this.f57134i) {
            O o11 = this.f57142q;
            if (o11.a().d(address)) {
                if (Intrinsics.d(address.l().h(), o11.a().l().h())) {
                    return true;
                }
                if (this.f57131f != null && list != null) {
                    List<O> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            O o12 = (O) it.next();
                            Proxy.Type type = o12.b().type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && o11.b().type() == type2 && Intrinsics.d(o11.d(), o12.d())) {
                                if (address.e() == C7948d.f73278a) {
                                    A l11 = address.l();
                                    byte[] bArr2 = Ye.b.f34900a;
                                    A l12 = o11.a().l();
                                    if (l11.n() == l12.n()) {
                                        if (!Intrinsics.d(l11.h(), l12.h())) {
                                            if (!this.f57135j && (yVar = this.f57129d) != null) {
                                                List<Certificate> c11 = yVar.c();
                                                if (!c11.isEmpty()) {
                                                    String h11 = l11.h();
                                                    Certificate certificate = c11.get(0);
                                                    if (certificate == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            C4867i a11 = address.a();
                                            Intrinsics.f(a11);
                                            String h12 = address.l().h();
                                            y yVar2 = this.f57129d;
                                            Intrinsics.f(yVar2);
                                            a11.a(h12, yVar2.c());
                                            return true;
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean r(boolean z11) {
        long j11;
        byte[] bArr = Ye.b.f34900a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f57127b;
        Intrinsics.f(socket);
        Socket isHealthy = this.f57128c;
        Intrinsics.f(isHealthy);
        sf.G source = this.f57132g;
        Intrinsics.f(source);
        if (socket.isClosed() || isHealthy.isClosed() || isHealthy.isInputShutdown() || isHealthy.isOutputShutdown()) {
            return false;
        }
        gf.f fVar = this.f57131f;
        if (fVar != null) {
            return fVar.u0(nanoTime);
        }
        synchronized (this) {
            j11 = nanoTime - this.f57141p;
        }
        if (j11 < 10000000000L || !z11) {
            return true;
        }
        Intrinsics.checkNotNullParameter(isHealthy, "$this$isHealthy");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                return !source.c();
            } finally {
                isHealthy.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final boolean s() {
        return this.f57131f != null;
    }

    @NotNull
    public final InterfaceC6354d t(@NotNull E client, @NotNull C6357g chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f57128c;
        Intrinsics.f(socket);
        sf.G g10 = this.f57132g;
        Intrinsics.f(g10);
        sf.F f7 = this.f57133h;
        Intrinsics.f(f7);
        gf.f fVar = this.f57131f;
        if (fVar != null) {
            return new gf.l(client, this, chain, fVar);
        }
        socket.setSoTimeout(chain.readTimeoutMillis());
        N timeout = g10.f98666a.timeout();
        long e11 = chain.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(e11, timeUnit);
        f7.f98662a.timeout().g(chain.g(), timeUnit);
        return new C6553b(client, this, g10, f7);
    }

    @NotNull
    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        O o11 = this.f57142q;
        sb2.append(o11.a().l().h());
        sb2.append(':');
        sb2.append(o11.a().l().n());
        sb2.append(", proxy=");
        sb2.append(o11.b());
        sb2.append(" hostAddress=");
        sb2.append(o11.d());
        sb2.append(" cipherSuite=");
        y yVar = this.f57129d;
        if (yVar == null || (obj = yVar.a()) == null) {
            obj = DevicePublicKeyStringDef.NONE;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f57130e);
        sb2.append('}');
        return sb2.toString();
    }

    @NotNull
    public final i u(@NotNull C5822c exchange) throws SocketException {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Socket socket = this.f57128c;
        Intrinsics.f(socket);
        sf.G g10 = this.f57132g;
        Intrinsics.f(g10);
        sf.F f7 = this.f57133h;
        Intrinsics.f(f7);
        socket.setSoTimeout(0);
        w();
        return new i(exchange, g10, f7, g10, f7);
    }

    public final synchronized void v() {
        this.f57135j = true;
    }

    public final synchronized void w() {
        this.f57134i = true;
    }

    @NotNull
    public final O x() {
        return this.f57142q;
    }

    public final void y(long j11) {
        this.f57141p = j11;
    }

    public final void z() {
        this.f57134i = true;
    }
}
