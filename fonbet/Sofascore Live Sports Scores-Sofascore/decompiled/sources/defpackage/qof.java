package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qof extends xg9 implements he6 {
    public final cui b;
    public final v7g c;
    public final Socket d;
    public final Socket e;
    public final w69 f;
    public final qff g;
    public final sx2 h;
    public final int i;
    public zg9 j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final ArrayList q;
    public long r;

    public qof(cui cuiVar, wi5 wi5Var, v7g v7gVar, Socket socket, Socket socket2, w69 w69Var, qff qffVar, sx2 sx2Var, int i) {
        cuiVar.getClass();
        v7gVar.getClass();
        socket.getClass();
        socket2.getClass();
        qffVar.getClass();
        sx2Var.getClass();
        this.b = cuiVar;
        this.c = v7gVar;
        this.d = socket;
        this.e = socket2;
        this.f = w69Var;
        this.g = qffVar;
        this.h = sx2Var;
        this.i = i;
        this.p = 1;
        this.q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    public static void e(jod jodVar, v7g v7gVar, IOException iOException) {
        jodVar.getClass();
        v7gVar.getClass();
        iOException.getClass();
        if (v7gVar.b.type() != Proxy.Type.DIRECT) {
            lk lkVar = v7gVar.a;
            lkVar.g.connectFailed(lkVar.h.i(), v7gVar.b.address(), iOException);
        }
        cqa cqaVar = jodVar.D;
        synchronized (cqaVar) {
            ((LinkedHashSet) cqaVar.a).add(v7gVar);
        }
    }

    @Override // defpackage.he6
    public final void a() {
        synchronized (this) {
            this.k = true;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.he6
    public final void b(pof pofVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof sgi)) {
                    if (!(this.j != null) || (iOException instanceof ek3)) {
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                e(pofVar.a, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((sgi) iOException).a == tp5.REFUSED_STREAM) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        this.k = true;
                        this.m++;
                    }
                } else if (((sgi) iOException).a != tp5.CANCEL || !pofVar.q) {
                    this.k = true;
                    this.m++;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xg9
    public final void c(zg9 zg9Var, aah aahVar) {
        aahVar.getClass();
        synchronized (this) {
            this.p = (aahVar.a & 8) != 0 ? aahVar.b[3] : Integer.MAX_VALUE;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.he6
    public final void cancel() {
        yol.c(this.d);
    }

    @Override // defpackage.xg9
    public final void d(ih9 ih9Var) {
        ih9Var.c(tp5.REFUSED_STREAM, null);
    }

    @Override // defpackage.he6
    public final v7g f() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (defpackage.znd.b(r5, (java.security.cert.X509Certificate) r9) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(lk lkVar, List list) {
        TimeZone timeZone = yol.a;
        if (this.q.size() < this.p && !this.k) {
            v7g v7gVar = this.c;
            lk lkVar2 = v7gVar.a;
            lk lkVar3 = v7gVar.a;
            boolean a = lkVar2.a(lkVar);
            jl9 jl9Var = lkVar.h;
            String str = jl9Var.d;
            if (a) {
                if (Intrinsics.c(str, lkVar3.h.d)) {
                    return true;
                }
                if (this.j != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        v7g v7gVar2 = (v7g) it.next();
                        Proxy.Type type = v7gVar2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && v7gVar.b.type() == type2 && Intrinsics.c(v7gVar.c, v7gVar2.c)) {
                            if (lkVar.d == znd.a) {
                                TimeZone timeZone2 = yol.a;
                                jl9 jl9Var2 = lkVar3.h;
                                if (jl9Var.e == jl9Var2.e) {
                                    boolean c = Intrinsics.c(str, jl9Var2.d);
                                    w69 w69Var = this.f;
                                    if (!c) {
                                        if (!this.l && w69Var != null) {
                                            List a2 = w69Var.a();
                                            if (!a2.isEmpty()) {
                                                Object obj = a2.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        xm2 xm2Var = lkVar.e;
                                        xm2Var.getClass();
                                        w69Var.getClass();
                                        List a3 = w69Var.a();
                                        str.getClass();
                                        a3.getClass();
                                        Set set = xm2Var.a;
                                        km5 km5Var = km5.a;
                                        Iterator it2 = set.iterator();
                                        if (it2.hasNext()) {
                                            wt3.z(it2.next());
                                            throw null;
                                        }
                                        km5Var.getClass();
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

    public final boolean h(boolean z) {
        long j;
        TimeZone timeZone = yol.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        zg9 zg9Var = this.j;
        if (zg9Var != null) {
            synchronized (zg9Var) {
                if (zg9Var.f) {
                    return false;
                }
                if (zg9Var.o < zg9Var.n) {
                    if (nanoTime >= zg9Var.p) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        lof lofVar = (lof) this.h.b;
        socket.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !lofVar.w();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void i() {
        this.r = System.nanoTime();
        qff qffVar = this.g;
        if (qffVar == qff.HTTP_2 || qffVar == qff.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            zic zicVar = zic.c;
            e98 e98Var = e98.a;
            cui cuiVar = this.b;
            cuiVar.getClass();
            jy0 jy0Var = new jy0();
            jy0Var.b = cuiVar;
            jy0Var.e = xg9.a;
            jy0Var.f = e98.a;
            sx2 sx2Var = this.h;
            String str = this.c.a.h.d;
            sx2Var.getClass();
            str.getClass();
            jy0Var.c = sx2Var;
            jy0Var.d = yol.b + ' ' + str;
            jy0Var.e = this;
            jy0Var.a = this.i;
            jy0Var.f = e98Var;
            zg9 zg9Var = new zg9(jy0Var);
            this.j = zg9Var;
            aah aahVar = zg9.A;
            this.p = (aahVar.a & 8) != 0 ? aahVar.b[3] : Integer.MAX_VALUE;
            jh9 jh9Var = zg9Var.x;
            synchronized (jh9Var) {
                try {
                    if (jh9Var.d) {
                        throw new IOException("closed");
                    }
                    Logger logger = jh9.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(yol.d(">> CONNECTION " + rg9.a.i(), new Object[0]));
                    }
                    jh9Var.a.i0(rg9.a);
                    jh9Var.a.flush();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jh9 jh9Var2 = zg9Var.x;
            aah aahVar2 = zg9Var.r;
            jh9Var2.getClass();
            aahVar2.getClass();
            synchronized (jh9Var2) {
                try {
                    if (jh9Var2.d) {
                        throw new IOException("closed");
                    }
                    jh9Var2.g(0, Integer.bitCount(aahVar2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & aahVar2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            jh9Var2.a.p(i);
                            jh9Var2.a.n(aahVar2.b[i]);
                        }
                    }
                    jh9Var2.a.flush();
                    Unit unit2 = Unit.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zg9Var.r.a() != 65535) {
                zg9Var.x.m(0, r7 - 65535);
            }
            bui.c(zg9Var.g.d(), zg9Var.c, zg9Var.y);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        v7g v7gVar = this.c;
        sb.append(v7gVar.a.h.d);
        sb.append(':');
        sb.append(v7gVar.a.h.e);
        sb.append(", proxy=");
        sb.append(v7gVar.b);
        sb.append(" hostAddress=");
        sb.append(v7gVar.c);
        sb.append(" cipherSuite=");
        w69 w69Var = this.f;
        sb.append(w69Var != null ? w69Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
