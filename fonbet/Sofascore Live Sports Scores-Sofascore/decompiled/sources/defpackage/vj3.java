package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.StatusKt;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vj3 implements c8g, he6 {
    public final cui a;
    public final wi5 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final pof i;
    public final ipf j;
    public final v7g k;
    public final List l;
    public final int m;
    public final qzf n;
    public final int o;
    public final boolean p;
    public volatile boolean q;
    public Socket r;
    public Socket s;
    public w69 t;
    public qff u;
    public sx2 v;
    public qof w;

    public vj3(cui cuiVar, wi5 wi5Var, int i, int i2, int i3, int i4, int i5, boolean z, pof pofVar, ipf ipfVar, v7g v7gVar, List list, int i6, qzf qzfVar, int i7, boolean z2) {
        cuiVar.getClass();
        v7gVar.getClass();
        this.a = cuiVar;
        this.b = wi5Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = pofVar;
        this.j = ipfVar;
        this.k = v7gVar;
        this.l = list;
        this.m = i6;
        this.n = qzfVar;
        this.o = i7;
        this.p = z2;
    }

    public static vj3 k(vj3 vj3Var, int i, qzf qzfVar, int i2, boolean z, int i3) {
        return new vj3(vj3Var.a, vj3Var.b, vj3Var.c, vj3Var.d, vj3Var.e, vj3Var.f, vj3Var.g, vj3Var.h, vj3Var.i, vj3Var.j, vj3Var.k, vj3Var.l, (i3 & 1) != 0 ? vj3Var.m : i, (i3 & 2) != 0 ? vj3Var.n : qzfVar, (i3 & 4) != 0 ? vj3Var.o : i2, (i3 & 8) != 0 ? vj3Var.p : z);
    }

    @Override // defpackage.c8g
    public final c8g c() {
        return new vj3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // defpackage.c8g
    public final void cancel() {
        this.q = true;
        Socket socket = this.r;
        if (socket != null) {
            yol.c(socket);
        }
    }

    @Override // defpackage.c8g
    public final qof d() {
        cqa cqaVar = this.i.a.D;
        v7g v7gVar = this.k;
        synchronized (cqaVar) {
            v7gVar.getClass();
            ((LinkedHashSet) cqaVar.a).remove(v7gVar);
        }
        qof qofVar = this.w;
        qofVar.getClass();
        this.k.getClass();
        g4g d = this.j.d(this, this.l);
        if (d != null) {
            return d.a;
        }
        synchronized (qofVar) {
            wi5 wi5Var = this.b;
            TimeZone timeZone = yol.a;
            ((ConcurrentLinkedQueue) wi5Var.d).add(qofVar);
            ((bui) wi5Var.b).d((f45) wi5Var.c, 0L);
            this.i.a(qofVar);
            Unit unit = Unit.a;
        }
        this.i.d.getClass();
        return qofVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    @Override // defpackage.c8g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b8g e() {
        vj3 vj3Var;
        vj3 vj3Var2;
        Socket socket = this.r;
        vj3 vj3Var3 = null;
        if (socket == null) {
            a70.p("TCP not connected");
            return null;
        }
        if (isReady()) {
            a70.r("already connected");
            return null;
        }
        List list = this.k.a.j;
        this.i.s.add(this);
        boolean z = false;
        try {
            try {
                if (this.n != null) {
                    b8g j = j();
                    if (j.b != null || j.c != null) {
                        this.i.s.remove(this);
                        Socket socket2 = this.s;
                        if (socket2 != null) {
                            yol.c(socket2);
                        }
                        yol.c(socket);
                        return j;
                    }
                }
                lk lkVar = this.k.a;
                if (lkVar.c != null) {
                    sx2 sx2Var = this.v;
                    if (sx2Var == null) {
                        Intrinsics.i("socket");
                        throw null;
                    }
                    if (((lof) sx2Var.b).b.w()) {
                        sx2 sx2Var2 = this.v;
                        if (sx2Var2 == null) {
                            Intrinsics.i("socket");
                            throw null;
                        }
                        if (((kof) sx2Var2.c).b.w()) {
                            this.i.d.getClass();
                            lk lkVar2 = this.k.a;
                            SSLSocketFactory sSLSocketFactory = lkVar2.c;
                            jl9 jl9Var = lkVar2.h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, jl9Var.d, jl9Var.e, true);
                            createSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            vj3 m = m(list, sSLSocket);
                            gk3 gk3Var = (gk3) list.get(m.o);
                            vj3Var = m.l(list, sSLSocket);
                            try {
                                gk3Var.a(sSLSocket, m.p);
                                i(sSLSocket, gk3Var);
                                this.i.d.getClass();
                                vj3Var2 = vj3Var;
                            } catch (IOException e) {
                                e = e;
                                f26 f26Var = this.i.d;
                                InetSocketAddress inetSocketAddress = this.k.c;
                                f26Var.getClass();
                                inetSocketAddress.getClass();
                                this.k.getClass();
                                if (this.h && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    vj3Var3 = vj3Var;
                                }
                                b8g b8gVar = new b8g(this, vj3Var3, e);
                                this.i.s.remove(this);
                                if (!z) {
                                    Socket socket3 = this.s;
                                    if (socket3 != null) {
                                        yol.c(socket3);
                                    }
                                    yol.c(socket);
                                }
                                return b8gVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.s = socket;
                List list2 = lkVar.i;
                qff qffVar = qff.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(qffVar)) {
                    qffVar = qff.HTTP_1_1;
                }
                this.u = qffVar;
                vj3Var2 = null;
                try {
                    cui cuiVar = this.a;
                    wi5 wi5Var = this.b;
                    v7g v7gVar = this.k;
                    Socket socket4 = this.s;
                    socket4.getClass();
                    w69 w69Var = this.t;
                    qff qffVar2 = this.u;
                    qffVar2.getClass();
                    sx2 sx2Var3 = this.v;
                    if (sx2Var3 == null) {
                        Intrinsics.i("socket");
                        throw null;
                    }
                    qof qofVar = new qof(cuiVar, wi5Var, v7gVar, socket, socket4, w69Var, qffVar2, sx2Var3, this.g);
                    this.w = qofVar;
                    qofVar.i();
                    f26 f26Var2 = this.i.d;
                    InetSocketAddress inetSocketAddress2 = this.k.c;
                    f26Var2.getClass();
                    inetSocketAddress2.getClass();
                    try {
                        b8g b8gVar2 = new b8g(this, null, null, 6);
                        this.i.s.remove(this);
                        return b8gVar2;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        vj3Var = vj3Var2;
                        f26 f26Var3 = this.i.d;
                        InetSocketAddress inetSocketAddress3 = this.k.c;
                        f26Var3.getClass();
                        inetSocketAddress3.getClass();
                        this.k.getClass();
                        if (this.h) {
                            vj3Var3 = vj3Var;
                        }
                        b8g b8gVar3 = new b8g(this, vj3Var3, e);
                        this.i.s.remove(this);
                        if (!z) {
                        }
                        return b8gVar3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.i.s.remove(this);
                        if (!z) {
                            Socket socket5 = this.s;
                            if (socket5 != null) {
                                yol.c(socket5);
                            }
                            yol.c(socket);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            vj3Var = null;
        }
    }

    @Override // defpackage.he6
    public final v7g f() {
        return this.k;
    }

    @Override // defpackage.c8g
    public final b8g g() {
        Socket socket;
        Socket socket2;
        if (this.r != null) {
            a70.r("TCP already connected");
            return null;
        }
        this.i.s.add(this);
        boolean z = false;
        try {
            try {
                f26 f26Var = this.i.d;
                InetSocketAddress inetSocketAddress = this.k.c;
                f26Var.getClass();
                inetSocketAddress.getClass();
                this.k.getClass();
                h();
                z = true;
                b8g b8gVar = new b8g(this, null, null, 6);
                this.i.s.remove(this);
                return b8gVar;
            } catch (IOException e) {
                v7g v7gVar = this.k;
                lk lkVar = v7gVar.a;
                if (v7gVar.b.type() != Proxy.Type.DIRECT) {
                    lk lkVar2 = this.k.a;
                    lkVar2.g.connectFailed(lkVar2.h.i(), this.k.b.address(), e);
                }
                f26 f26Var2 = this.i.d;
                InetSocketAddress inetSocketAddress2 = this.k.c;
                f26Var2.getClass();
                inetSocketAddress2.getClass();
                this.k.getClass();
                b8g b8gVar2 = new b8g(this, null, e, 2);
                this.i.s.remove(this);
                if (!z && (socket = this.r) != null) {
                    yol.c(socket);
                }
                return b8gVar2;
            }
        } catch (Throwable th) {
            this.i.s.remove(this);
            if (!z && (socket2 = this.r) != null) {
                yol.c(socket2);
            }
            throw th;
        }
    }

    public final void h() {
        Socket createSocket;
        Proxy.Type type = this.k.b.type();
        int i = type == null ? -1 : uj3.a[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.k.a.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(this.k.b);
        }
        this.r = createSocket;
        if (this.q) {
            is8.e(StatusKt.STATUS_CANCELED);
            return;
        }
        createSocket.setSoTimeout(this.f);
        try {
            gie gieVar = gie.a;
            gie.a.e(createSocket, this.k.c, this.e);
            try {
                this.v = new sx2(new g7h(createSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.k.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void i(SSLSocket sSLSocket, gk3 gk3Var) {
        qff qffVar;
        lk lkVar = this.k.a;
        try {
            if (gk3Var.b) {
                gie gieVar = gie.a;
                gie.a.d(sSLSocket, lkVar.h.d, lkVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            w69 v = fqj.v(session);
            HostnameVerifier hostnameVerifier = lkVar.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(lkVar.h.d, session)) {
                xm2 xm2Var = lkVar.e;
                xm2Var.getClass();
                this.t = new w69(v.a, v.b, v.c, new mi(14, xm2Var, v, lkVar));
                lkVar.h.d.getClass();
                Set set = xm2Var.a;
                km5 km5Var = km5.a;
                Iterator it = set.iterator();
                String str = null;
                if (it.hasNext()) {
                    wt3.z(it.next());
                    throw null;
                }
                km5Var.getClass();
                if (gk3Var.b) {
                    gie gieVar2 = gie.a;
                    str = gie.a.f(sSLSocket);
                }
                this.s = sSLSocket;
                this.v = new sx2(new g7h(sSLSocket));
                if (str != null) {
                    qff.b.getClass();
                    qffVar = pff.c(str);
                } else {
                    qffVar = qff.HTTP_1_1;
                }
                this.u = qffVar;
                gie gieVar3 = gie.a;
                gie.a.getClass();
                return;
            }
            List a = v.a();
            if (a.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + lkVar.h.d + " not verified (no certificates)");
            }
            Object obj = a.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(lkVar.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            xm2 xm2Var2 = xm2.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            gc2 gc2Var = gc2.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(q1f.s(encoded).g("SHA-256").d());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(CollectionsKt.w0(znd.a(x509Certificate, 2), znd.a(x509Certificate, 7)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(dii.d(sb.toString()));
        } catch (Throwable th) {
            gie gieVar4 = gie.a;
            gie.a.getClass();
            yol.c(sSLSocket);
            throw th;
        }
    }

    @Override // defpackage.c8g
    public final boolean isReady() {
        return this.u != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
    
        return new defpackage.b8g(r12, null, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        r0 = r12.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        defpackage.yol.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        r1 = r12.m + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r1 >= 21) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        r0 = r12.i.d;
        r3 = r12.k.c;
        r0.getClass();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        return new defpackage.b8g(r12, k(r12, r1, r2, 0, false, 12), null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        r12 = new java.net.ProtocolException("Too many tunnel connections attempted: 21");
        r1 = r12.i.d;
        r2 = r12.k.c;
        r1.getClass();
        r2.getClass();
        r12.k.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        return new defpackage.b8g(r12, null, r12, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b8g j() {
        qzf qzfVar;
        qzf qzfVar2 = this.n;
        qzfVar2.getClass();
        v7g v7gVar = this.k;
        String str = "CONNECT " + yol.i(v7gVar.a.h, true) + " HTTP/1.1";
        while (true) {
            sx2 sx2Var = this.v;
            if (sx2Var == null) {
                Intrinsics.i("socket");
                throw null;
            }
            mg9 mg9Var = new mg9(null, this, sx2Var);
            sx2 sx2Var2 = this.v;
            if (sx2Var2 == null) {
                Intrinsics.i("socket");
                throw null;
            }
            ((lof) sx2Var2.b).a.timeout().g(this.c);
            sx2 sx2Var3 = this.v;
            if (sx2Var3 == null) {
                Intrinsics.i("socket");
                throw null;
            }
            ((kof) sx2Var3.c).a.timeout().g(this.d);
            mg9Var.l(qzfVar2.c, str);
            mg9Var.a();
            b2g g = mg9Var.g(false);
            g.getClass();
            g.a = qzfVar2;
            d2g a = g.a();
            int i = a.d;
            long e = yol.e(a);
            if (e != -1) {
                kg9 k = mg9Var.k(a.a.a, e);
                yol.g(k, Integer.MAX_VALUE);
                k.close();
            }
            if (i == 200) {
                qzfVar = null;
                break;
            }
            if (i != 407) {
                is8.e(ljg.j(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            qzf m = v7gVar.a.f.m(v7gVar, a);
            if (m == null) {
                is8.e("Failed to authenticate with proxy");
                return null;
            }
            String a2 = a.f.a("Connection");
            if (a2 == null) {
                a2 = null;
            }
            if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(a2)) {
                qzfVar = m;
                break;
            }
            qzfVar2 = m;
        }
    }

    public final vj3 l(List list, SSLSocket sSLSocket) {
        list.getClass();
        int i = this.o;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            gk3 gk3Var = (gk3) list.get(i2);
            gk3Var.getClass();
            if (gk3Var.a) {
                String[] strArr = gk3Var.d;
                if (strArr != null) {
                    String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                    w5d w5dVar = w5d.a;
                    w5dVar.getClass();
                    if (!wol.g(w5dVar, strArr, enabledProtocols)) {
                        continue;
                    }
                }
                String[] strArr2 = gk3Var.c;
                if (strArr2 != null) {
                    if (!wol.g(tu2.c, strArr2, sSLSocket.getEnabledCipherSuites())) {
                    }
                }
                return k(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final vj3 m(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.o != -1) {
            return this;
        }
        vj3 l = l(list, sSLSocket);
        if (l != null) {
            return l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.p);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.he6
    public final void a() {
    }

    @Override // defpackage.he6
    public final void b(pof pofVar, IOException iOException) {
    }
}
