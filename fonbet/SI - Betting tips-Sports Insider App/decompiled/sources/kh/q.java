package kh;

import androidx.appcompat.app.v0;
import f3.z;
import gh.g0;
import gh.h0;
import gh.s0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import nh.c0;
import nh.d0;
import nh.y;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q extends nh.n implements gh.k, lh.e {

    /* renamed from: b, reason: collision with root package name */
    public final jh.e f19155b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f19156c;

    /* renamed from: d, reason: collision with root package name */
    public final Socket f19157d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f19158e;

    /* renamed from: f, reason: collision with root package name */
    public final gh.u f19159f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f19160g;

    /* renamed from: h, reason: collision with root package name */
    public final v0 f19161h;

    /* renamed from: i, reason: collision with root package name */
    public nh.q f19162i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19163k;

    /* renamed from: l, reason: collision with root package name */
    public int f19164l;

    /* renamed from: m, reason: collision with root package name */
    public int f19165m;

    /* renamed from: n, reason: collision with root package name */
    public int f19166n;

    /* renamed from: o, reason: collision with root package name */
    public int f19167o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f19168p;
    public long q;

    public q(jh.e taskRunner, r connectionPool, s0 route, Socket rawSocket, Socket javaNetSocket, gh.u uVar, h0 protocol, v0 socket) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(rawSocket, "rawSocket");
        Intrinsics.checkNotNullParameter(javaNetSocket, "javaNetSocket");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(socket, "socket");
        d connectionListener = d.f19098a;
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f19155b = taskRunner;
        this.f19156c = route;
        this.f19157d = rawSocket;
        this.f19158e = javaNetSocket;
        this.f19159f = uVar;
        this.f19160g = protocol;
        this.f19161h = socket;
        this.f19167o = 1;
        this.f19168p = new ArrayList();
        this.q = LongCompanionObject.MAX_VALUE;
    }

    public static void c(g0 client, s0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f10303b.type() != Proxy.Type.DIRECT) {
            gh.a aVar = failedRoute.f10302a;
            aVar.f10113g.connectFailed(aVar.f10114h.h(), failedRoute.f10303b.address(), failure);
        }
        i2.d dVar = client.f10192y;
        synchronized (dVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) dVar.f10882b).add(failedRoute);
        }
    }

    @Override // nh.n
    public final void a(nh.q connection, c0 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            this.f19167o = (settings.f20926a & 8) != 0 ? settings.f20927b[3] : Integer.MAX_VALUE;
            Unit unit = Unit.f19194a;
        }
    }

    @Override // nh.n
    public final void b(y stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(nh.b.f20920g, null);
    }

    @Override // lh.e
    public final void cancel() {
        hh.g.c(this.f19157d);
    }

    public final void d() {
        synchronized (this) {
            this.f19165m++;
        }
    }

    @Override // lh.e
    public final void e() {
        synchronized (this) {
            this.j = true;
            Unit unit = Unit.f19194a;
        }
        Intrinsics.checkNotNullParameter(this, "connection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (uh.c.b(r5, (java.security.cert.X509Certificate) r11) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(gh.a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        TimeZone timeZone = hh.g.f10825a;
        if (this.f19168p.size() < this.f19167o && !this.j) {
            s0 s0Var = this.f19156c;
            gh.a aVar = s0Var.f10302a;
            gh.a aVar2 = s0Var.f10302a;
            boolean a7 = aVar.a(address);
            gh.y yVar = address.f10114h;
            if (a7) {
                String str = yVar.f10332d;
                String hostname = yVar.f10332d;
                int i5 = 1;
                if (Intrinsics.areEqual(str, aVar2.f10114h.f10332d)) {
                    return true;
                }
                if (this.f19162i != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        s0 s0Var2 = (s0) it.next();
                        Proxy.Type type = s0Var2.f10303b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && s0Var.f10303b.type() == type2 && Intrinsics.areEqual(s0Var.f10304c, s0Var2.f10304c)) {
                            if (address.f10110d == uh.c.f24333a) {
                                TimeZone timeZone2 = hh.g.f10825a;
                                gh.y yVar2 = aVar2.f10114h;
                                if (yVar.f10333e == yVar2.f10333e) {
                                    boolean areEqual = Intrinsics.areEqual(hostname, yVar2.f10332d);
                                    gh.u uVar = this.f19159f;
                                    if (!areEqual) {
                                        if (!this.f19163k && uVar != null) {
                                            List a10 = uVar.a();
                                            if (!a10.isEmpty()) {
                                                Object obj = a10.get(0);
                                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        gh.h hVar = address.f10111e;
                                        Intrinsics.checkNotNull(hVar);
                                        Intrinsics.checkNotNull(uVar);
                                        List peerCertificates = uVar.a();
                                        hVar.getClass();
                                        Intrinsics.checkNotNullParameter(hostname, "hostname");
                                        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                                        hVar.a(hostname, new z((Object) hVar, (Object) peerCertificates, hostname, i5));
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
        return false;
    }

    @Override // lh.e
    public final void g(p call, IOException iOException) {
        boolean z5;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                z5 = false;
                if (!(iOException instanceof d0)) {
                    if (!(this.f19162i != null) || (iOException instanceof nh.a)) {
                        z5 = !this.j;
                        this.j = true;
                        if (this.f19165m == 0) {
                            if (iOException != null) {
                                c(call.f19138a, this.f19156c, iOException);
                            }
                            this.f19164l++;
                        }
                    }
                } else if (((d0) iOException).f20937a == nh.b.f20920g) {
                    int i5 = this.f19166n + 1;
                    this.f19166n = i5;
                    if (i5 > 1) {
                        z5 = !this.j;
                        this.j = true;
                        this.f19164l++;
                    }
                } else if (((d0) iOException).f20937a != nh.b.f20921h || !call.q) {
                    z5 = !this.j;
                    this.j = true;
                    this.f19164l++;
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            Intrinsics.checkNotNullParameter(this, "connection");
        }
    }

    @Override // lh.e
    public final s0 h() {
        return this.f19156c;
    }

    public final boolean i(boolean z5) {
        long j;
        TimeZone timeZone = hh.g.f10825a;
        long nanoTime = System.nanoTime();
        if (this.f19157d.isClosed() || this.f19158e.isClosed() || this.f19158e.isInputShutdown() || this.f19158e.isOutputShutdown()) {
            return false;
        }
        nh.q qVar = this.f19162i;
        if (qVar != null) {
            return qVar.n(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z5) {
            return true;
        }
        Socket socket = this.f19158e;
        BufferedSource source = (BufferedSource) this.f19161h.f365c;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void j() {
        this.q = System.nanoTime();
        h0 h0Var = this.f19160g;
        if (h0Var == h0.f10201f || h0Var == h0.f10202g) {
            this.f19158e.setSoTimeout(0);
            nh.c flowControlListener = nh.c.f20925a;
            c4.d dVar = new c4.d(this.f19155b);
            v0 socket = this.f19161h;
            String peerName = this.f19156c.f10302a.f10114h.f10332d;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            dVar.f3578c = socket;
            String str = hh.g.f10826b + ' ' + peerName;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            dVar.f3579d = str;
            Intrinsics.checkNotNullParameter(this, "listener");
            dVar.f3580e = this;
            Intrinsics.checkNotNullParameter(flowControlListener, "flowControlListener");
            dVar.f3581f = flowControlListener;
            nh.q qVar = new nh.q(dVar);
            this.f19162i = qVar;
            c0 c0Var = nh.q.f20980z;
            this.f19167o = (c0Var.f20926a & 8) != 0 ? c0Var.f20927b[3] : Integer.MAX_VALUE;
            nh.z zVar = qVar.f21001w;
            synchronized (zVar) {
                try {
                    if (zVar.f21049d) {
                        throw new IOException("closed");
                    }
                    Logger logger = nh.z.f21045f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(hh.g.d(">> CONNECTION " + nh.h.f20955a.hex(), new Object[0]));
                    }
                    zVar.f21046a.write(nh.h.f20955a);
                    zVar.f21046a.flush();
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.f21001w.z(qVar.q);
            if (qVar.q.a() != 65535) {
                qVar.f21001w.C(0, r2 - 65535);
            }
            jh.c.c(qVar.f20987g.d(), qVar.f20983c, qVar.f21002x);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        s0 s0Var = this.f19156c;
        sb2.append(s0Var.f10302a.f10114h.f10332d);
        sb2.append(':');
        sb2.append(s0Var.f10302a.f10114h.f10333e);
        sb2.append(", proxy=");
        sb2.append(s0Var.f10303b);
        sb2.append(" hostAddress=");
        sb2.append(s0Var.f10304c);
        sb2.append(" cipherSuite=");
        gh.u uVar = this.f19159f;
        if (uVar == null || (obj = uVar.f10316b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f19160g);
        sb2.append('}');
        return sb2.toString();
    }
}
