package of;

import Ve.E;
import We.A;
import We.F;
import We.z;
import bf.e;
import ef.C6356f;
import gf.C6727c;
import gf.EnumC6726b;
import gf.f;
import gf.n;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.G;
import sf.InterfaceC9682h;
import sf.InterfaceC9683i;
import sf.N;

/* renamed from: of.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8724c extends Lf.a implements Closeable {

    /* renamed from: p, reason: collision with root package name */
    private static final Logger f78281p = Logger.getLogger(C8724c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final e.b f78282b;

    /* renamed from: c, reason: collision with root package name */
    private final bf.e f78283c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue<C8730i> f78284d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<Socket> f78285e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<gf.f> f78286f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f78287g;

    /* renamed from: h, reason: collision with root package name */
    private long f78288h;

    /* renamed from: i, reason: collision with root package name */
    private ServerSocketFactory f78289i;

    /* renamed from: j, reason: collision with root package name */
    private ServerSocket f78290j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private C8729h f78291k;

    /* renamed from: l, reason: collision with root package name */
    private int f78292l;

    /* renamed from: m, reason: collision with root package name */
    private InetSocketAddress f78293m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private List<? extends F> f78294n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f78295o;

    /* renamed from: of.c$a */
    public static final class a extends E {
    }

    /* renamed from: of.c$b */
    private final class b extends f.c {

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f78296b;

        /* renamed from: c, reason: collision with root package name */
        private final Socket f78297c;

        /* renamed from: d, reason: collision with root package name */
        private final F f78298d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C8724c f78299e;

        public b(@NotNull C8724c c8724c, @NotNull Socket socket, F protocol) {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f78299e = c8724c;
            this.f78297c = socket;
            this.f78298d = protocol;
            this.f78296b = new AtomicInteger();
        }

        @Override // gf.f.c
        public final void c(@NotNull n stream) throws IOException {
            IOException iOException;
            C8723b c8723b;
            sf.F f7;
            Intrinsics.checkNotNullParameter(stream, "stream");
            C8724c c8724c = this.f78299e;
            C8723b a11 = c8724c.u1().a();
            EnumC8731j i11 = a11.i();
            EnumC8731j enumC8731j = EnumC8731j.RESET_STREAM_AT_START;
            AtomicInteger atomicInteger = this.f78296b;
            Socket socket = this.f78297c;
            if (i11 == enumC8731j) {
                atomicInteger.getAndIncrement();
                c8724c.q1(socket);
                EnumC6726b.a aVar = EnumC6726b.Companion;
                int f11 = a11.f();
                aVar.getClass();
                EnumC6726b a12 = EnumC6726b.a.a(f11);
                Intrinsics.f(a12);
                stream.d(a12, null);
                return;
            }
            z E11 = stream.E();
            z.a aVar2 = new z.a();
            Iterator<Pair<? extends String, ? extends String>> it = E11.iterator();
            String str = "<:method omitted>";
            String str2 = "<:path omitted>";
            boolean z11 = true;
            while (true) {
                boolean hasNext = it.hasNext();
                F f12 = this.f78298d;
                if (!hasNext) {
                    z e11 = aVar2.e();
                    C8723b a13 = c8724c.u1().a();
                    if (!z11 && a13.i() == EnumC8731j.EXPECT_CONTINUE) {
                        C9684j c9684j = C6727c.f64297e;
                        C9684j c9684j2 = C9684j.f98719d;
                        stream.G(C7714v.a0(new C6727c(c9684j, C9684j.a.c("100 Continue"))), false, true);
                        stream.h().flush();
                        z11 = true;
                    }
                    C9681g c9681g = new C9681g();
                    String str3 = str + ' ' + str2 + " HTTP/1.1";
                    if (z11) {
                        try {
                            String c11 = e11.c("content-length");
                            C8724c.l1(this.f78299e, a13, this.f78297c, sf.z.d(stream.q()), c9681g, c11 != null ? Long.parseLong(c11) : Long.MAX_VALUE, true);
                        } catch (IOException e12) {
                            iOException = e12;
                        }
                    }
                    iOException = null;
                    K k11 = K.f71697a;
                    atomicInteger.getAndIncrement();
                    C8730i c8730i = new C8730i(str3, e11, k11, c9681g, this.f78297c, iOException);
                    c8724c.f78287g.incrementAndGet();
                    c8724c.f78284d.add(c8730i);
                    if (c8730i.a() != null) {
                        return;
                    }
                    C8723b b11 = c8724c.u1().b(c8730i);
                    if (b11.i() == EnumC8731j.DISCONNECT_AFTER_REQUEST) {
                        socket.close();
                        return;
                    }
                    stream.h().a1(b11.h());
                    if (b11.i() == EnumC8731j.NO_RESPONSE) {
                        c8723b = b11;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        List l11 = kotlin.text.h.l(b11.j(), new char[]{' '}, 3, 2);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long e13 = b11.e();
                        long c12 = b11.c();
                        if (l11.size() < 2) {
                            throw new AssertionError("Unexpected status: " + b11.j());
                        }
                        arrayList.add(new C6727c(C6727c.f64297e, (String) l11.get(1)));
                        Iterator<Pair<? extends String, ? extends String>> it2 = b11.d().iterator();
                        while (it2.hasNext()) {
                            Pair<? extends String, ? extends String> next = it2.next();
                            arrayList.add(new C6727c(next.a(), next.b()));
                        }
                        z m11 = b11.m();
                        C8724c.k1(c8724c, e13);
                        C9681g b12 = b11.b();
                        boolean z12 = b12 == null && ((ArrayList) b11.g()).isEmpty();
                        boolean z13 = b12 == null || c12 != 0;
                        if (z12 && m11.size() != 0) {
                            throw new IllegalArgumentException(("unsupported: no body and non-empty trailers " + m11).toString());
                        }
                        stream.G(arrayList, z12, z13);
                        if (m11.size() > 0) {
                            stream.g(m11);
                        }
                        Iterator it3 = ((ArrayList) b11.g()).iterator();
                        if (it3.hasNext()) {
                            C8728g c8728g = (C8728g) it3.next();
                            new ArrayList();
                            c8728g.getClass();
                            c8724c.J1(null);
                            throw null;
                        }
                        if (b12 != null) {
                            sf.F c13 = sf.z.c(stream.o());
                            try {
                                C8724c.k1(c8724c, c12);
                                C8724c.l1(this.f78299e, b11, this.f78297c, b12, c13, b12.size(), false);
                                c8723b = b11;
                                f7 = c13;
                                try {
                                    Unit unit = Unit.f71690a;
                                    f7.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        Vd0.b.a(f7, th3);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                f7 = c13;
                            }
                        } else {
                            c8723b = b11;
                            if (!z12) {
                                stream.d(EnumC6726b.NO_ERROR, null);
                            }
                        }
                    }
                    if (C8724c.f78281p.isLoggable(Level.FINE)) {
                        C8724c.f78281p.fine(c8724c + " received request: " + c8730i + " and responded: " + c8723b + " protocol is " + f12);
                    }
                    if (c8723b.i() == EnumC8731j.DISCONNECT_AT_END) {
                        stream.h().c1(EnumC6726b.NO_ERROR);
                        return;
                    }
                    return;
                }
                Pair<? extends String, ? extends String> next2 = it.next();
                String a14 = next2.a();
                String b13 = next2.b();
                if (Intrinsics.d(a14, ":method")) {
                    str = b13;
                } else if (Intrinsics.d(a14, ":path")) {
                    str2 = b13;
                } else {
                    if (f12 != F.HTTP_2 && f12 != F.H2_PRIOR_KNOWLEDGE) {
                        throw new IllegalStateException();
                    }
                    aVar2.a(a14, b13);
                }
                if (Intrinsics.d(a14, "expect") && kotlin.text.h.D(b13, "100-continue", true)) {
                    z11 = false;
                }
            }
        }
    }

    /* renamed from: of.c$c, reason: collision with other inner class name */
    public final class C1326c {

        /* renamed from: a, reason: collision with root package name */
        private int f78300a;

        /* renamed from: b, reason: collision with root package name */
        private final Socket f78301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8724c f78302c;

        public C1326c(@NotNull C8724c c8724c, Socket raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            this.f78302c = c8724c;
            this.f78301b = raw;
        }

        public final void a() throws Exception {
            String obj;
            C8724c c8724c = this.f78302c;
            EnumC8731j i11 = c8724c.u1().a().i();
            F f7 = F.HTTP_1_1;
            List<F> v12 = c8724c.v1();
            F f11 = F.H2_PRIOR_KNOWLEDGE;
            F f12 = v12.contains(f11) ? f11 : f7;
            EnumC8731j enumC8731j = EnumC8731j.STALL_SOCKET_AT_START;
            Socket peerName = this.f78301b;
            if (i11 == enumC8731j) {
                c8724c.q1(peerName);
                return;
            }
            if (f12 == F.HTTP_2 || f12 == f11) {
                b bVar = new b(c8724c, peerName, f12);
                f.b bVar2 = new f.b(false, c8724c.f78283c);
                Intrinsics.checkNotNullParameter(peerName, "$this$peerName");
                SocketAddress remoteSocketAddress = peerName.getRemoteSocketAddress();
                if (remoteSocketAddress instanceof InetSocketAddress) {
                    obj = ((InetSocketAddress) remoteSocketAddress).getHostName();
                    Intrinsics.checkNotNullExpressionValue(obj, "address.hostName");
                } else {
                    obj = remoteSocketAddress.toString();
                }
                bVar2.h(peerName, obj, sf.z.d(sf.z.i(peerName)), sf.z.c(sf.z.f(peerName)));
                bVar2.f(bVar);
                gf.f fVar = new gf.f(bVar2);
                gf.f.d1(fVar, c8724c.f78283c, 1);
                c8724c.f78286f.add(fVar);
                c8724c.f78285e.remove(peerName);
                return;
            }
            if (f12 != f7) {
                throw new AssertionError();
            }
            G d11 = sf.z.d(sf.z.i(peerName));
            sf.F c11 = sf.z.c(sf.z.f(peerName));
            while (true) {
                if (!d11.c()) {
                    C8730i j12 = C8724c.j1(c8724c, peerName, d11, c11);
                    c8724c.f78287g.incrementAndGet();
                    c8724c.f78284d.add(j12);
                    if (j12.a() == null) {
                        C8723b b11 = c8724c.u1().b(j12);
                        if (b11.i() != EnumC8731j.DISCONNECT_AFTER_REQUEST) {
                            if (b11.i() != EnumC8731j.NO_RESPONSE) {
                                if ("Upgrade".equalsIgnoreCase(j12.b("Connection"))) {
                                    "websocket".equalsIgnoreCase(j12.b("Upgrade"));
                                }
                                C8724c.m1(c8724c, peerName, c11, b11);
                                if (C8724c.f78281p.isLoggable(Level.FINE)) {
                                    C8724c.f78281p.fine(c8724c + " received request: " + j12 + " and responded: " + b11);
                                }
                                int i12 = C8725d.f78306a[b11.i().ordinal()];
                                if (i12 == 1) {
                                    peerName.close();
                                    break;
                                }
                                if (i12 == 2) {
                                    peerName.shutdownInput();
                                } else if (i12 == 3) {
                                    peerName.shutdownOutput();
                                } else if (i12 == 4) {
                                    c8724c.y1();
                                }
                                this.f78300a++;
                            } else if (!d11.c()) {
                                throw new ProtocolException("unexpected data");
                            }
                        } else {
                            peerName.close();
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (this.f78300a == 0) {
                C8724c.f78281p.warning(c8724c + " connection from " + peerName.getInetAddress() + " didn't make a request");
            }
            peerName.close();
            c8724c.f78285e.remove(peerName);
        }
    }

    /* renamed from: of.c$d */
    private static final class d implements sf.K {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C9681g f78303a = new C9681g();

        /* renamed from: b, reason: collision with root package name */
        private long f78304b;

        /* renamed from: c, reason: collision with root package name */
        private long f78305c;

        public d(long j11) {
            this.f78305c = j11;
        }

        @NotNull
        public final C9681g c() {
            return this.f78303a;
        }

        @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // sf.K, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // sf.K
        @NotNull
        public final N timeout() {
            return N.f98683d;
        }

        @Override // sf.K
        public final void z0(@NotNull C9681g source, long j11) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            long min = Math.min(this.f78305c, j11);
            if (min > 0) {
                source.read(this.f78303a, min);
            }
            long j12 = j11 - min;
            if (j12 > 0) {
                source.skip(j12);
            }
            this.f78305c -= min;
            this.f78304b += j11;
        }
    }

    public C8724c() {
        super(2);
        e.b bVar = new e.b(Ye.b.y("MockWebServer TaskRunner", false));
        this.f78282b = bVar;
        this.f78283c = new bf.e(bVar);
        this.f78284d = new LinkedBlockingQueue<>();
        this.f78285e = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f78286f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f78287g = new AtomicInteger();
        this.f78288h = Long.MAX_VALUE;
        this.f78291k = new C8729h();
        this.f78292l = -1;
        this.f78294n = Ye.b.n(F.HTTP_2, F.HTTP_1_1);
    }

    public static void B1(C8724c c8724c) throws IOException {
        c8724c.getClass();
        InetAddress inetAddress = InetAddress.getByName("localhost");
        Intrinsics.checkNotNullExpressionValue(inetAddress, "InetAddress.getByName(\"localhost\")");
        Intrinsics.checkNotNullParameter(inetAddress, "inetAddress");
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 0);
        synchronized (c8724c) {
            if (c8724c.f78295o) {
                throw new IllegalArgumentException("start() already called");
            }
            c8724c.f78295o = true;
            c8724c.f78293m = inetSocketAddress;
            if (c8724c.f78289i == null) {
                c8724c.f78289i = ServerSocketFactory.getDefault();
            }
            ServerSocketFactory serverSocketFactory = c8724c.f78289i;
            Intrinsics.f(serverSocketFactory);
            ServerSocket createServerSocket = serverSocketFactory.createServerSocket();
            c8724c.f78290j = createServerSocket;
            Intrinsics.f(createServerSocket);
            createServerSocket.setReuseAddress(inetSocketAddress.getPort() != 0);
            ServerSocket serverSocket = c8724c.f78290j;
            Intrinsics.f(serverSocket);
            serverSocket.bind(inetSocketAddress, 50);
            ServerSocket serverSocket2 = c8724c.f78290j;
            Intrinsics.f(serverSocket2);
            c8724c.f78292l = serverSocket2.getLocalPort();
            c8724c.f78283c.h().j(new C8727f("MockWebServer " + c8724c.f78292l, c8724c), 0L);
        }
    }

    public static final void E0(C8724c c8724c) {
        c8724c.getClass();
        while (true) {
            try {
                ServerSocket serverSocket = c8724c.f78290j;
                Intrinsics.f(serverSocket);
                Socket accept = serverSocket.accept();
                Intrinsics.checkNotNullExpressionValue(accept, "serverSocket!!.accept()");
                if (c8724c.f78291k.a().i() == EnumC8731j.DISCONNECT_AT_START) {
                    c8724c.q1(accept);
                    accept.close();
                } else {
                    c8724c.f78285e.add(accept);
                    c8724c.f78283c.h().j(new C8726e("MockWebServer " + accept.getRemoteSocketAddress(), c8724c, accept), 0L);
                }
            } catch (SocketException e11) {
                f78281p.fine(c8724c + " done accepting connections: " + e11.getMessage());
                return;
            }
        }
    }

    private static void F1(C8723b c8723b, Socket socket, InterfaceC9683i interfaceC9683i, InterfaceC9682h interfaceC9682h, long j11, boolean z11) throws IOException {
        long j12 = 0;
        if (j11 == 0) {
            return;
        }
        C9681g c9681g = new C9681g();
        long k11 = c8723b.k();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l11 = c8723b.l();
        long j13 = j11 / 2;
        boolean z12 = false;
        if (!z11 ? c8723b.i() == EnumC8731j.DISCONNECT_DURING_RESPONSE_BODY : c8723b.i() == EnumC8731j.DISCONNECT_DURING_REQUEST_BODY) {
            z12 = true;
        }
        long j14 = j11;
        while (!socket.isClosed()) {
            long j15 = j12;
            while (j15 < k11) {
                long min = Math.min(j14, k11 - j15);
                long j16 = j12;
                if (z12) {
                    min = Math.min(min, j14 - j13);
                }
                long read = interfaceC9683i.read(c9681g, min);
                if (read == -1) {
                    return;
                }
                interfaceC9682h.z0(c9681g, read);
                interfaceC9682h.flush();
                j15 += read;
                j14 -= read;
                if (z12 && j14 == j13) {
                    socket.close();
                    return;
                } else if (j14 == j16) {
                    return;
                } else {
                    j12 = j16;
                }
            }
            long j17 = j12;
            if (l11 != j17) {
                Thread.sleep(l11);
            }
            j12 = j17;
        }
    }

    private static void L1(sf.F f7, z zVar) throws IOException {
        Iterator<Pair<? extends String, ? extends String>> it = zVar.iterator();
        while (it.hasNext()) {
            Pair<? extends String, ? extends String> next = it.next();
            String a11 = next.a();
            String b11 = next.b();
            f7.h1(a11);
            f7.h1(": ");
            f7.h1(b11);
            f7.h1("\r\n");
        }
        f7.h1("\r\n");
        f7.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0053, code lost:
    
        if (r13 == of.EnumC8731j.CONTINUE_ALWAYS) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C8730i j1(C8724c c8724c, Socket socket, G g10, sf.F f7) {
        String str;
        G g11 = g10;
        c8724c.getClass();
        z.a builder = new z.a();
        d dVar = new d(c8724c.f78288h);
        ArrayList arrayList = new ArrayList();
        long j11 = Long.MAX_VALUE;
        try {
            str = g11.s(Long.MAX_VALUE);
            try {
            } catch (IOException e11) {
                e = e11;
            }
        } catch (IOException e12) {
            e = e12;
            str = "";
        }
        if (str.length() == 0) {
            throw new ProtocolException("no request because the stream is exhausted");
        }
        boolean z11 = false;
        long j12 = -1;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            String line = g11.s(j11);
            boolean z14 = z12;
            boolean z15 = true;
            if (line.length() == 0) {
                C8729h c8729h = c8724c.f78291k;
                EnumC8731j i11 = c8729h.a().i();
                if (z14) {
                    if (i11 != EnumC8731j.EXPECT_CONTINUE) {
                    }
                    f7.h1("HTTP/1.1 100 Continue\r\n");
                    f7.h1("Content-Length: 0\r\n");
                    f7.h1("\r\n");
                    f7.flush();
                    C8723b a11 = c8729h.a();
                    if (j12 != -1) {
                        boolean z16 = j12 > 0;
                        F1(a11, socket, g11, sf.z.c(dVar), j12, true);
                        z11 = z16;
                    } else if (z13) {
                        while (true) {
                            int parseInt = Integer.parseInt(kotlin.text.h.z0(g11.s(j11)).toString(), CharsKt.checkRadix(16));
                            if (parseInt == 0) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(parseInt));
                            F1(a11, socket, g11, sf.z.c(dVar), parseInt, true);
                            x1(g10);
                            g11 = g10;
                            z15 = z15;
                        }
                        x1(g11);
                        z11 = z15;
                    }
                    String l02 = kotlin.text.h.l0(str, ' ');
                    if (z11 && !C6356f.a(l02)) {
                        throw new IllegalArgumentException(("Request must not have a body: " + str).toString());
                    }
                    e = null;
                }
            } else {
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(line, "line");
                builder.b(line);
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                String lowerCase = line.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (j12 == -1 && kotlin.text.h.e0(lowerCase, "content-length:", false)) {
                    String substring = line.substring(15);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                    if (substring == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    j12 = Long.parseLong(kotlin.text.h.z0(substring).toString());
                }
                if (kotlin.text.h.e0(lowerCase, "transfer-encoding:", false)) {
                    String substring2 = lowerCase.substring(18);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                    if (substring2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    if (Intrinsics.d(kotlin.text.h.z0(substring2).toString(), "chunked")) {
                        z13 = true;
                    }
                }
                if (kotlin.text.h.e0(lowerCase, "expect:", false)) {
                    String substring3 = lowerCase.substring(7);
                    Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
                    if (substring3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    if (kotlin.text.h.D(kotlin.text.h.z0(substring3).toString(), "100-continue", true)) {
                        z12 = true;
                        g11 = g10;
                        j11 = Long.MAX_VALUE;
                    }
                }
                z12 = z14;
                g11 = g10;
                j11 = Long.MAX_VALUE;
            }
        }
        return new C8730i(str, builder.e(), arrayList, dVar.c(), socket, e);
    }

    public static final void k1(C8724c c8724c, long j11) {
        c8724c.getClass();
        if (j11 != 0) {
            Thread.sleep(j11);
        }
    }

    public static final /* synthetic */ void l1(C8724c c8724c, C8723b c8723b, Socket socket, InterfaceC9683i interfaceC9683i, InterfaceC9682h interfaceC9682h, long j11, boolean z11) {
        c8724c.getClass();
        F1(c8723b, socket, interfaceC9683i, interfaceC9682h, j11, z11);
    }

    public static final void m1(C8724c c8724c, Socket socket, sf.F f7, C8723b c8723b) {
        c8724c.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long e11 = c8723b.e();
        if (e11 != 0) {
            Thread.sleep(e11);
        }
        f7.h1(c8723b.j());
        f7.h1("\r\n");
        L1(f7, c8723b.d());
        C9681g b11 = c8723b.b();
        if (b11 != null) {
            long c11 = c8723b.c();
            if (c11 != 0) {
                Thread.sleep(c11);
            }
            F1(c8723b, socket, b11, f7, b11.size(), false);
            if ("chunked".equalsIgnoreCase(c8723b.d().c("Transfer-Encoding"))) {
                L1(f7, c8723b.m());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1(Socket socket) throws InterruptedException {
        z.f33821b.getClass();
        C8730i c8730i = new C8730i("", z.b.f(new String[0]), K.f71697a, new C9681g(), socket, null);
        this.f78287g.incrementAndGet();
        this.f78284d.add(c8730i);
        this.f78291k.b(c8730i);
    }

    private static void x1(G g10) throws IOException {
        String s11 = g10.s(Long.MAX_VALUE);
        if (s11.length() != 0) {
            throw new IllegalStateException("Expected empty but was: ".concat(s11).toString());
        }
    }

    @NotNull
    public final void E1() throws InterruptedException {
        Intrinsics.checkNotNullExpressionValue(this.f78284d.take(), "requestQueue.take()");
    }

    @NotNull
    public final A J1(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        A.a aVar = new A.a();
        aVar.s("http");
        n1();
        InetSocketAddress inetSocketAddress = this.f78293m;
        Intrinsics.f(inetSocketAddress);
        InetAddress address = inetSocketAddress.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "inetSocketAddress!!.address");
        String canonicalHostName = address.getCanonicalHostName();
        Intrinsics.checkNotNullExpressionValue(canonicalHostName, "inetSocketAddress!!.address.canonicalHostName");
        aVar.j(canonicalHostName);
        n1();
        aVar.m(this.f78292l);
        A t2 = aVar.e().t(path);
        Intrinsics.f(t2);
        return t2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        y1();
    }

    protected final synchronized void n1() {
        if (this.f78295o) {
            return;
        }
        try {
            B1(this);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void t1(@NotNull C8723b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        C8729h c8729h = this.f78291k;
        if (c8729h == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.mockwebserver.QueueDispatcher");
        }
        c8729h.c(response.clone());
    }

    @Override // Lf.a
    @NotNull
    public final String toString() {
        return Ek.a.d(new StringBuilder("MockWebServer["), this.f78292l, ']');
    }

    @NotNull
    public final C8729h u1() {
        return this.f78291k;
    }

    @NotNull
    public final List<F> v1() {
        return this.f78294n;
    }

    public final synchronized void y1() throws IOException {
        try {
            if (this.f78295o) {
                ServerSocket serverSocket = this.f78290j;
                if (serverSocket == null) {
                    throw new IllegalArgumentException("shutdown() before start()");
                }
                Intrinsics.f(serverSocket);
                serverSocket.close();
                Iterator it = this.f78283c.c().iterator();
                while (it.hasNext()) {
                    if (!((bf.c) it.next()).i().await(5L, TimeUnit.SECONDS)) {
                        throw new IOException("Gave up waiting for queue to shut down");
                    }
                }
                this.f78282b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
