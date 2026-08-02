package kh;

import androidx.appcompat.app.v0;
import androidx.appcompat.widget.c1;
import f3.z;
import gh.h0;
import gh.i0;
import gh.n0;
import gh.o0;
import gh.s0;
import gh.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements v, lh.e {

    /* renamed from: a, reason: collision with root package name */
    public final jh.e f19079a;

    /* renamed from: b, reason: collision with root package name */
    public final r f19080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19081c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19082d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19083e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19084f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19085g;

    /* renamed from: h, reason: collision with root package name */
    public final p f19086h;

    /* renamed from: i, reason: collision with root package name */
    public final s f19087i;
    public final s0 j;

    /* renamed from: k, reason: collision with root package name */
    public final List f19088k;

    /* renamed from: l, reason: collision with root package name */
    public final i0 f19089l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19090m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f19091n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f19092o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f19093p;
    public Socket q;

    /* renamed from: r, reason: collision with root package name */
    public gh.u f19094r;

    /* renamed from: s, reason: collision with root package name */
    public h0 f19095s;

    /* renamed from: t, reason: collision with root package name */
    public v0 f19096t;

    /* renamed from: u, reason: collision with root package name */
    public q f19097u;

    public c(jh.e taskRunner, r connectionPool, int i5, int i10, int i11, int i12, boolean z5, p call, s routePlanner, s0 route, List list, i0 i0Var, int i13, boolean z7) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f19079a = taskRunner;
        this.f19080b = connectionPool;
        this.f19081c = i5;
        this.f19082d = i10;
        this.f19083e = i11;
        this.f19084f = i12;
        this.f19085g = z5;
        this.f19086h = call;
        this.f19087i = routePlanner;
        this.j = route;
        this.f19088k = list;
        this.f19089l = i0Var;
        this.f19090m = i13;
        this.f19091n = z7;
    }

    @Override // kh.v
    public final v a() {
        return new c(this.f19079a, this.f19080b, this.f19081c, this.f19082d, this.f19083e, this.f19084f, this.f19085g, this.f19086h, this.f19087i, this.j, this.f19088k, this.f19089l, this.f19090m, this.f19091n);
    }

    @Override // kh.v
    public final q b() {
        this.f19086h.f19138a.f10192y.w(this.j);
        q connection = this.f19097u;
        Intrinsics.checkNotNull(connection);
        connection.getClass();
        s0 route = this.j;
        p call = this.f19086h;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        t e7 = this.f19087i.e(this, this.f19088k);
        if (e7 != null) {
            return e7.f19188a;
        }
        synchronized (connection) {
            r rVar = this.f19080b;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            TimeZone timeZone = hh.g.f10825a;
            rVar.f19172d.add(connection);
            rVar.f19170b.d(rVar.f19171c, 0L);
            this.f19086h.b(connection);
            Unit unit = Unit.f19194a;
        }
        p pVar = this.f19086h;
        pVar.f19141d.j(pVar, connection);
        p call2 = this.f19086h;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call2, "call");
        return connection;
    }

    @Override // kh.v
    public final boolean c() {
        return this.f19095s != null;
    }

    @Override // kh.v, lh.e
    public final void cancel() {
        this.f19092o = true;
        Socket socket = this.f19093p;
        if (socket != null) {
            hh.g.c(socket);
        }
    }

    @Override // kh.v
    public final u d() {
        Socket socket;
        Socket socket2;
        r rVar = this.f19080b;
        p call = this.f19086h;
        CopyOnWriteArrayList copyOnWriteArrayList = call.f19154s;
        s0 route = this.j;
        if (this.f19093p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z5 = false;
        try {
            try {
                call.f19141d.i(call, route.f10304c, route.f10303b);
                rVar.getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(call, "call");
                i();
                z5 = true;
                u uVar = new u(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return uVar;
            } catch (IOException failure) {
                gh.a aVar = route.f10302a;
                if (route.f10303b.type() != Proxy.Type.DIRECT) {
                    gh.a aVar2 = route.f10302a;
                    aVar2.f10113g.connectFailed(aVar2.f10114h.h(), route.f10303b.address(), failure);
                }
                call.f19141d.h(call, route.f10304c, route.f10303b, failure);
                rVar.getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(failure, "failure");
                u uVar2 = new u(this, failure, 2);
                copyOnWriteArrayList.remove(this);
                if (!z5 && (socket2 = this.f19093p) != null) {
                    hh.g.c(socket2);
                }
                return uVar2;
            }
        } catch (Throwable th2) {
            copyOnWriteArrayList.remove(this);
            if (!z5 && (socket = this.f19093p) != null) {
                hh.g.c(socket);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0174 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:7:0x0026, B:9:0x002a, B:17:0x004a, B:20:0x0051, B:22:0x0055, B:23:0x0059, B:25:0x0067, B:27:0x006b, B:28:0x006f, B:30:0x007d, B:32:0x00a3, B:35:0x00d6, B:38:0x00d9, B:41:0x00dc, B:44:0x00df, B:47:0x00e3, B:49:0x00f3, B:111:0x00f7, B:51:0x0106, B:54:0x010d, B:65:0x0159, B:67:0x0174, B:70:0x017e, B:73:0x0183, B:75:0x0187, B:78:0x0190, B:81:0x0195, B:84:0x019b, B:138:0x00bb, B:139:0x00c2, B:140:0x00c3, B:143:0x00d2, B:145:0x00d0), top: B:6:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a5  */
    @Override // kh.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u f() {
        r rVar;
        InetSocketAddress inetSocketAddress;
        c cVar;
        c cVar2;
        jh.e eVar;
        r rVar2;
        v0 v0Var;
        r rVar3 = this.f19080b;
        p call = this.f19086h;
        gh.r rVar4 = call.f19141d;
        CopyOnWriteArrayList copyOnWriteArrayList = call.f19154s;
        Socket socket = this.f19093p;
        if (socket == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (c()) {
            throw new IllegalStateException("already connected");
        }
        s0 route = this.j;
        gh.a aVar = route.f10302a;
        Proxy proxy = route.f10303b;
        InetSocketAddress inetSocketAddress2 = route.f10304c;
        gh.a aVar2 = route.f10302a;
        List list = aVar.j;
        copyOnWriteArrayList.add(this);
        boolean z5 = false;
        c cVar3 = null;
        try {
            try {
                if (this.f19089l != null) {
                    u k6 = k();
                    if (k6.f19191c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket2 = this.q;
                        if (socket2 != null) {
                            hh.g.c(socket2);
                        }
                        hh.g.c(socket);
                        return k6;
                    }
                }
                if (aVar2.f10109c != null) {
                    v0 v0Var2 = this.f19096t;
                    if (v0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("socket");
                        v0Var2 = null;
                    }
                    if (((BufferedSource) v0Var2.f365c).getBuffer().exhausted()) {
                        v0 v0Var3 = this.f19096t;
                        if (v0Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("socket");
                            v0Var3 = null;
                        }
                        if (((BufferedSink) v0Var3.f366d).getBuffer().exhausted()) {
                            rVar4.B(call);
                            SSLSocketFactory sSLSocketFactory = aVar2.f10109c;
                            y yVar = aVar2.f10114h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, yVar.f10332d, yVar.f10333e, true);
                            Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            c m6 = m(list, sSLSocket);
                            gh.l lVar = (gh.l) list.get(m6.f19090m);
                            c l6 = m6.l(list, sSLSocket);
                            try {
                                lVar.a(sSLSocket, m6.f19091n);
                                j(sSLSocket, lVar);
                                rVar4.A(call, this.f19094r);
                                cVar2 = l6;
                            } catch (IOException e7) {
                                e = e7;
                                rVar = rVar3;
                                inetSocketAddress = inetSocketAddress2;
                                cVar = null;
                                cVar3 = l6;
                                call.f19141d.h(call, inetSocketAddress, proxy, e);
                                rVar.getClass();
                                Intrinsics.checkNotNullParameter(route, "route");
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(e, "failure");
                                if (this.f19085g) {
                                }
                                cVar3 = cVar;
                                u uVar = new u(this, cVar3, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z5) {
                                }
                                return uVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.q = socket;
                List list2 = aVar2.f10115i;
                h0 h0Var = h0.f10202g;
                if (!list2.contains(h0Var)) {
                    h0Var = h0.f10199d;
                }
                this.f19095s = h0Var;
                cVar2 = null;
                try {
                } catch (IOException e9) {
                    e = e9;
                    rVar = rVar3;
                    inetSocketAddress = inetSocketAddress2;
                }
                try {
                    eVar = this.f19079a;
                    try {
                        rVar2 = this.f19080b;
                        cVar = null;
                    } catch (IOException e10) {
                        e = e10;
                        rVar = rVar3;
                        cVar = null;
                    }
                } catch (IOException e11) {
                    e = e11;
                    rVar = rVar3;
                    inetSocketAddress = inetSocketAddress2;
                    cVar = null;
                    cVar3 = cVar2;
                    call.f19141d.h(call, inetSocketAddress, proxy, e);
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(route, "route");
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "failure");
                    if (this.f19085g) {
                    }
                    cVar3 = cVar;
                    u uVar2 = new u(this, cVar3, e);
                    copyOnWriteArrayList.remove(this);
                    if (!z5) {
                    }
                    return uVar2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e = e12;
            rVar = rVar3;
            inetSocketAddress = inetSocketAddress2;
            cVar = null;
        }
        try {
            s0 s0Var = this.j;
            try {
                Socket socket3 = this.q;
                Intrinsics.checkNotNull(socket3);
                gh.u uVar3 = this.f19094r;
                h0 h0Var2 = this.f19095s;
                Intrinsics.checkNotNull(h0Var2);
                try {
                    v0Var = this.f19096t;
                    if (v0Var == null) {
                        try {
                            Intrinsics.throwUninitializedPropertyAccessException("socket");
                            v0Var = null;
                        } catch (IOException e13) {
                            e = e13;
                            rVar = rVar3;
                            cVar3 = cVar2;
                            inetSocketAddress = inetSocketAddress2;
                            cVar = null;
                            call.f19141d.h(call, inetSocketAddress, proxy, e);
                            rVar.getClass();
                            Intrinsics.checkNotNullParameter(route, "route");
                            Intrinsics.checkNotNullParameter(call, "call");
                            Intrinsics.checkNotNullParameter(e, "failure");
                            if (this.f19085g) {
                            }
                            cVar3 = cVar;
                            u uVar22 = new u(this, cVar3, e);
                            copyOnWriteArrayList.remove(this);
                            if (!z5) {
                            }
                            return uVar22;
                        }
                    }
                    rVar3.getClass();
                    rVar = rVar3;
                    inetSocketAddress = inetSocketAddress2;
                } catch (IOException e14) {
                    e = e14;
                    rVar = rVar3;
                    inetSocketAddress = inetSocketAddress2;
                }
                try {
                    q qVar = new q(eVar, rVar2, s0Var, socket, socket3, uVar3, h0Var2, v0Var);
                    this.f19097u = qVar;
                    qVar.j();
                    rVar4.g(call, inetSocketAddress, proxy, this.f19095s);
                    try {
                        try {
                            cVar = null;
                        } catch (Throwable th3) {
                            th = th3;
                            z5 = true;
                            copyOnWriteArrayList.remove(this);
                            if (!z5) {
                                Socket socket4 = this.q;
                                if (socket4 != null) {
                                    hh.g.c(socket4);
                                }
                                hh.g.c(socket);
                            }
                            throw th;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        cVar = null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    cVar = null;
                    cVar3 = cVar2;
                    call.f19141d.h(call, inetSocketAddress, proxy, e);
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(route, "route");
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "failure");
                    if (this.f19085g) {
                        Intrinsics.checkNotNullParameter(e, "e");
                        if (!(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                            u uVar222 = new u(this, cVar3, e);
                            copyOnWriteArrayList.remove(this);
                            if (!z5) {
                                Socket socket5 = this.q;
                                if (socket5 != null) {
                                    hh.g.c(socket5);
                                }
                                hh.g.c(socket);
                            }
                            return uVar222;
                        }
                    }
                    cVar3 = cVar;
                    u uVar2222 = new u(this, cVar3, e);
                    copyOnWriteArrayList.remove(this);
                    if (!z5) {
                    }
                    return uVar2222;
                }
                try {
                    u uVar4 = new u(this, (Throwable) null, 6);
                    copyOnWriteArrayList.remove(this);
                    return uVar4;
                } catch (IOException e17) {
                    e = e17;
                    cVar3 = cVar2;
                    z5 = true;
                    call.f19141d.h(call, inetSocketAddress, proxy, e);
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(route, "route");
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "failure");
                    if (this.f19085g) {
                    }
                    cVar3 = cVar;
                    u uVar22222 = new u(this, cVar3, e);
                    copyOnWriteArrayList.remove(this);
                    if (!z5) {
                    }
                    return uVar22222;
                }
            } catch (IOException e18) {
                e = e18;
                rVar = rVar3;
                inetSocketAddress = inetSocketAddress2;
            }
        } catch (IOException e19) {
            e = e19;
            rVar = rVar3;
            inetSocketAddress = inetSocketAddress2;
            cVar3 = cVar2;
            call.f19141d.h(call, inetSocketAddress, proxy, e);
            rVar.getClass();
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e, "failure");
            if (this.f19085g) {
            }
            cVar3 = cVar;
            u uVar222222 = new u(this, cVar3, e);
            copyOnWriteArrayList.remove(this);
            if (!z5) {
            }
            return uVar222222;
        }
    }

    @Override // lh.e
    public final void g(p call, IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    @Override // lh.e
    public final s0 h() {
        return this.j;
    }

    public final void i() {
        Socket createSocket;
        Proxy.Type type = this.j.f10303b.type();
        int i5 = type == null ? -1 : b.$EnumSwitchMapping$0[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            createSocket = this.j.f10302a.f10108b.createSocket();
            Intrinsics.checkNotNull(createSocket);
        } else {
            createSocket = new Socket(this.j.f10303b);
        }
        this.f19093p = createSocket;
        if (this.f19092o) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f19084f);
        try {
            qh.e eVar = qh.e.f22190a;
            qh.e.f22190a.f(createSocket, this.j.f10304c, this.f19083e);
            try {
                Intrinsics.checkNotNullParameter(createSocket, "<this>");
                okio.Socket socket = Okio.socket(createSocket);
                Intrinsics.checkNotNullParameter(socket, "<this>");
                this.f19096t = new v0(socket);
            } catch (NullPointerException e7) {
                if (Intrinsics.areEqual(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.f10304c);
            connectException.initCause(e9);
            throw connectException;
        }
    }

    public final void j(SSLSocket sslSocket, gh.l lVar) {
        String str;
        h0 h0Var;
        gh.a aVar = this.j.f10302a;
        try {
            if (lVar.f10237b) {
                qh.e eVar = qh.e.f22190a;
                qh.e.f22190a.e(sslSocket, aVar.f10114h.f10332d, aVar.f10115i);
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            Intrinsics.checkNotNull(session);
            gh.u n9 = rh.g.n(session);
            HostnameVerifier hostnameVerifier = aVar.f10110d;
            Intrinsics.checkNotNull(hostnameVerifier);
            if (!hostnameVerifier.verify(aVar.f10114h.f10332d, session)) {
                List a7 = n9.a();
                if (a7.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.f10114h.f10332d + " not verified (no certificates)");
                }
                Object obj = a7.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n            |Hostname ");
                sb2.append(aVar.f10114h.f10332d);
                sb2.append(" not verified:\n            |    certificate: ");
                gh.h hVar = gh.h.f10194c;
                sb2.append(gh.g.a(certificate));
                sb2.append("\n            |    DN: ");
                sb2.append(certificate.getSubjectDN().getName());
                sb2.append("\n            |    subjectAltNames: ");
                Intrinsics.checkNotNullParameter(certificate, "certificate");
                sb2.append(CollectionsKt.N(uh.c.a(certificate, 7), uh.c.a(certificate, 2)));
                sb2.append("\n            ");
                throw new SSLPeerUnverifiedException(kotlin.text.t.d(sb2.toString()));
            }
            gh.h hVar2 = aVar.f10111e;
            Intrinsics.checkNotNull(hVar2);
            gh.u uVar = new gh.u(n9.f10315a, n9.f10316b, n9.f10317c, new z(hVar2, n9, aVar, 4));
            this.f19094r = uVar;
            hVar2.a(aVar.f10114h.f10332d, new a2.q(23, uVar));
            if (lVar.f10237b) {
                qh.e eVar2 = qh.e.f22190a;
                str = qh.e.f22190a.g(sslSocket);
            } else {
                str = null;
            }
            this.q = sslSocket;
            Intrinsics.checkNotNullParameter(sslSocket, "<this>");
            okio.Socket socket = Okio.socket(sslSocket);
            Intrinsics.checkNotNullParameter(socket, "<this>");
            this.f19096t = new v0(socket);
            if (str != null) {
                h0.f10197b.getClass();
                h0Var = gh.o.f(str);
            } else {
                h0Var = h0.f10199d;
            }
            this.f19095s = h0Var;
            qh.e eVar3 = qh.e.f22190a;
            qh.e.f22190a.getClass();
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        } catch (Throwable th2) {
            qh.e eVar4 = qh.e.f22190a;
            qh.e.f22190a.getClass();
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            hh.g.c(sslSocket);
            throw th2;
        }
    }

    public final u k() {
        i0 request = this.f19089l;
        Intrinsics.checkNotNull(request);
        s0 s0Var = this.j;
        String str = "CONNECT " + hh.g.i(s0Var.f10302a.f10114h, true) + " HTTP/1.1";
        v0 v0Var = this.f19096t;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            v0Var = null;
        }
        mh.f fVar = new mh.f(null, this, v0Var);
        v0 v0Var2 = this.f19096t;
        if (v0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            v0Var2 = null;
        }
        Timeout timeout = ((BufferedSource) v0Var2.f365c).getTimeout();
        long j = this.f19081c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(j, timeUnit);
        v0 v0Var3 = this.f19096t;
        if (v0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            v0Var3 = null;
        }
        ((BufferedSink) v0Var3.f366d).getTimeout().timeout(this.f19082d, timeUnit);
        fVar.m(request.f10208c, str);
        fVar.a();
        n0 d10 = fVar.d(false);
        Intrinsics.checkNotNull(d10);
        d10.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        d10.f10257a = request;
        o0 response = d10.a();
        int i5 = response.f10276d;
        Intrinsics.checkNotNullParameter(response, "response");
        long e7 = hh.g.e(response);
        if (e7 != -1) {
            mh.d l6 = fVar.l(response.f10273a.f10206a, e7);
            hh.g.g(l6, Integer.MAX_VALUE);
            l6.close();
        }
        if (i5 == 200) {
            return new u(this, (Throwable) null, 6);
        }
        if (i5 != 407) {
            throw new IOException(c1.i(i5, "Unexpected response code for CONNECT: "));
        }
        ((gh.o) s0Var.f10302a.f10112f).getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        throw new IOException("Failed to authenticate with proxy");
    }

    public final c l(List connectionSpecs, SSLSocket socket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(socket, "sslSocket");
        int i5 = this.f19090m;
        int size = connectionSpecs.size();
        for (int i10 = i5 + 1; i10 < size; i10++) {
            gh.l lVar = (gh.l) connectionSpecs.get(i10);
            lVar.getClass();
            Intrinsics.checkNotNullParameter(socket, "socket");
            if (lVar.f10236a) {
                String[] strArr = lVar.f10239d;
                if (strArr != null) {
                    String[] enabledProtocols = socket.getEnabledProtocols();
                    jf.b bVar = jf.b.f18481a;
                    Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
                    if (!hh.e.e(strArr, enabledProtocols, bVar)) {
                        continue;
                    }
                }
                String[] strArr2 = lVar.f10238c;
                if (strArr2 == null || hh.e.e(strArr2, socket.getEnabledCipherSuites(), gh.j.f10213c)) {
                    return new c(this.f19079a, this.f19080b, this.f19081c, this.f19082d, this.f19083e, this.f19084f, this.f19085g, this.f19086h, this.f19087i, this.j, this.f19088k, this.f19089l, i10, i5 != -1);
                }
            }
        }
        return null;
    }

    public final c m(List connectionSpecs, SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f19090m != -1) {
            return this;
        }
        c l6 = l(connectionSpecs, sslSocket);
        if (l6 != null) {
            return l6;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f19091n);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // lh.e
    public final void e() {
    }
}
