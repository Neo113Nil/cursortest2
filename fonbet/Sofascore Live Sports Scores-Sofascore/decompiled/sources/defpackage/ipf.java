package defpackage;

import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ipf {
    public final cui a;
    public final wi5 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final lk j;
    public final cqa k;
    public final pof l;
    public final boolean m;
    public l89 n;
    public d8g o;
    public v7g p;
    public final vg0 q;

    public ipf(cui cuiVar, wi5 wi5Var, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, lk lkVar, cqa cqaVar, pof pofVar, qzf qzfVar) {
        cuiVar.getClass();
        cqaVar.getClass();
        this.a = cuiVar;
        this.b = wi5Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.j = lkVar;
        this.k = cqaVar;
        this.l = pofVar;
        this.m = !Intrinsics.c(qzfVar.b, C4094gc.a);
        this.q = new vg0();
    }

    public final boolean a(qof qofVar) {
        d8g d8gVar;
        v7g v7gVar;
        if (this.q.isEmpty() && this.p == null) {
            if (qofVar != null) {
                synchronized (qofVar) {
                    v7gVar = null;
                    if (qofVar.m == 0 && qofVar.k && yol.a(qofVar.c.a.h, this.j.h)) {
                        v7gVar = qofVar.c;
                    }
                }
                if (v7gVar != null) {
                    this.p = v7gVar;
                    return true;
                }
            }
            l89 l89Var = this.n;
            if ((l89Var == null || l89Var.b >= l89Var.a.size()) && (d8gVar = this.o) != null) {
                return d8gVar.a();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c8g b() {
        Socket j;
        g4g g4gVar;
        vj3 c;
        String str;
        int i;
        List X;
        boolean contains;
        qof qofVar = this.l.i;
        if (qofVar != null) {
            boolean h = qofVar.h(this.m);
            synchronized (qofVar) {
                boolean z = qofVar.k;
                try {
                    if (h) {
                        if (!z) {
                            jl9 jl9Var = qofVar.c.a.h;
                            jl9 jl9Var2 = this.j.h;
                            if (jl9Var.e == jl9Var2.e && Intrinsics.c(jl9Var.d, jl9Var2.d)) {
                                j = null;
                            }
                        }
                        j = this.l.j();
                    } else {
                        qofVar.k = true;
                        j = this.l.j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l.i != null) {
                if (j != null) {
                    a70.r("Check failed.");
                    return null;
                }
                g4gVar = new g4g(qofVar);
                if (g4gVar == null) {
                    return g4gVar;
                }
                g4g d = d(null, null);
                if (d != null) {
                    return d;
                }
                if (!this.q.isEmpty()) {
                    return (c8g) this.q.removeFirst();
                }
                v7g v7gVar = this.p;
                if (v7gVar != null) {
                    this.p = null;
                    c = c(v7gVar, null);
                } else {
                    l89 l89Var = this.n;
                    if (l89Var == null || l89Var.b >= l89Var.a.size()) {
                        d8g d8gVar = this.o;
                        if (d8gVar == null) {
                            d8gVar = new d8g(this.j, this.k, this.l, this.i);
                            this.o = d8gVar;
                        }
                        if (!d8gVar.a()) {
                            is8.e("exhausted all routes");
                            return null;
                        }
                        if (!d8gVar.a()) {
                            yhk.d();
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        while (d8gVar.f < d8gVar.e.size()) {
                            if (d8gVar.f >= d8gVar.e.size()) {
                                throw new SocketException("No route to " + d8gVar.a.h.d + "; exhausted proxy configurations: " + d8gVar.e);
                            }
                            List list = d8gVar.e;
                            int i2 = d8gVar.f;
                            d8gVar.f = i2 + 1;
                            Proxy proxy = (Proxy) list.get(i2);
                            ArrayList arrayList2 = new ArrayList();
                            d8gVar.g = arrayList2;
                            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                jl9 jl9Var3 = d8gVar.a.h;
                                str = jl9Var3.d;
                                i = jl9Var3.e;
                            } else {
                                SocketAddress address = proxy.address();
                                if (!(address instanceof InetSocketAddress)) {
                                    hg6.e(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                    return null;
                                }
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                    str.getClass();
                                } else {
                                    str = address2.getHostAddress();
                                    str.getClass();
                                }
                                i = inetSocketAddress.getPort();
                            }
                            if (1 > i || i >= 65536) {
                                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                            } else {
                                Regex regex = uol.a;
                                str.getClass();
                                if (uol.a.f(str)) {
                                    X = a.c(InetAddress.getByName(str));
                                } else {
                                    d8gVar.c.d.getClass();
                                    d8gVar.a.a.getClass();
                                    try {
                                        InetAddress[] allByName = InetAddress.getAllByName(str);
                                        allByName.getClass();
                                        X = ph0.X(allByName);
                                        if (X.isEmpty()) {
                                            throw new UnknownHostException(d8gVar.a.a + " returned no addresses for " + str);
                                        }
                                        d8gVar.c.d.getClass();
                                    } catch (NullPointerException e) {
                                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                        unknownHostException.initCause(e);
                                        throw unknownHostException;
                                    }
                                }
                                if (d8gVar.d) {
                                    X.getClass();
                                    if (X.size() >= 2) {
                                        ArrayList arrayList3 = new ArrayList();
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj : X) {
                                            if (((InetAddress) obj) instanceof Inet6Address) {
                                                arrayList3.add(obj);
                                            } else {
                                                arrayList4.add(obj);
                                            }
                                        }
                                        if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                            byte[] bArr = wol.a;
                                            Iterator it = arrayList3.iterator();
                                            Iterator it2 = arrayList4.iterator();
                                            xbb b = a.b();
                                            while (true) {
                                                if (!it.hasNext() && !it2.hasNext()) {
                                                    break;
                                                }
                                                if (it.hasNext()) {
                                                    b.add(it.next());
                                                }
                                                if (it2.hasNext()) {
                                                    b.add(it2.next());
                                                }
                                            }
                                            X = a.a(b);
                                        }
                                    }
                                }
                                Iterator it3 = X.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), i));
                                }
                            }
                            Iterator it4 = d8gVar.g.iterator();
                            while (it4.hasNext()) {
                                v7g v7gVar2 = new v7g(d8gVar.a, proxy, (InetSocketAddress) it4.next());
                                cqa cqaVar = d8gVar.b;
                                synchronized (cqaVar) {
                                    contains = ((LinkedHashSet) cqaVar.a).contains(v7gVar2);
                                }
                                if (contains) {
                                    d8gVar.h.add(v7gVar2);
                                } else {
                                    arrayList.add(v7gVar2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            o13.v(d8gVar.h, arrayList);
                            d8gVar.h.clear();
                        }
                        l89 l89Var2 = new l89();
                        l89Var2.a = arrayList;
                        this.n = l89Var2;
                        if (this.l.q) {
                            is8.e("Canceled");
                            return null;
                        }
                        if (l89Var2.b >= arrayList.size()) {
                            yhk.d();
                            return null;
                        }
                        int i3 = l89Var2.b;
                        l89Var2.b = i3 + 1;
                        c = c((v7g) arrayList.get(i3), arrayList);
                    } else {
                        int i4 = l89Var.b;
                        ArrayList arrayList5 = l89Var.a;
                        if (i4 >= arrayList5.size()) {
                            yhk.d();
                            return null;
                        }
                        int i5 = l89Var.b;
                        l89Var.b = i5 + 1;
                        c = c((v7g) arrayList5.get(i5), null);
                    }
                }
                g4g d2 = d(c, c.l);
                return d2 != null ? d2 : c;
            }
            if (j != null) {
                yol.c(j);
            }
            this.l.d.getClass();
        }
        g4gVar = null;
        if (g4gVar == null) {
        }
    }

    public final vj3 c(v7g v7gVar, ArrayList arrayList) {
        v7gVar.getClass();
        lk lkVar = v7gVar.a;
        if (lkVar.c == null) {
            if (!lkVar.j.contains(gk3.h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = v7gVar.a.h.d;
            gie gieVar = gie.a;
            if (!gie.a.h(str)) {
                throw new UnknownServiceException(lnb.o("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (lkVar.i.contains(qff.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        qzf qzfVar = null;
        if (v7gVar.b.type() == Proxy.Type.HTTP) {
            lk lkVar2 = v7gVar.a;
            if (lkVar2.c != null || lkVar2.i.contains(qff.H2_PRIOR_KNOWLEDGE)) {
                pzf pzfVar = new pzf();
                pzfVar.a = v7gVar.a.h;
                pzfVar.e("CONNECT", null);
                lk lkVar3 = v7gVar.a;
                pzfVar.c("Host", yol.i(lkVar3.h, true));
                pzfVar.c("Proxy-Connection", "Keep-Alive");
                pzfVar.c(Command.HTTP_HEADER_USER_AGENT, "okhttp/5.4.0");
                qzf qzfVar2 = new qzf(pzfVar);
                i2g i2gVar = i2g.EMPTY;
                igf igfVar = vuj.C7;
                ef0 ef0Var = new ef0(1);
                qff qffVar = qff.HTTP_1_1;
                vha.x("Proxy-Authenticate");
                vha.y("OkHttp-Preemptive", "Proxy-Authenticate");
                ef0Var.m("Proxy-Authenticate");
                vha.h(ef0Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                qzf m = lkVar3.f.m(v7gVar, new d2g(qzfVar2, qffVar, "Preemptive Authenticate", 407, null, vha.i(ef0Var), i2gVar, null, null, null, null, -1L, -1L, null, igfVar));
                qzfVar = m == null ? qzfVar2 : m;
            }
        }
        return new vj3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, v7gVar, arrayList, 0, qzfVar, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if ((r7.j != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g4g d(vj3 vj3Var, List list) {
        qof qofVar;
        boolean z;
        Socket j;
        wi5 wi5Var = this.b;
        boolean z2 = this.m;
        lk lkVar = this.j;
        pof pofVar = this.l;
        boolean z3 = vj3Var != null && vj3Var.isReady();
        Iterator it = ((ConcurrentLinkedQueue) wi5Var.d).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                qofVar = null;
                break;
            }
            qofVar = (qof) it.next();
            qofVar.getClass();
            synchronized (qofVar) {
                if (z3) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (qofVar.g(lkVar, list)) {
                    pofVar.a(qofVar);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                if (qofVar.h(z2)) {
                    break;
                }
                synchronized (qofVar) {
                    qofVar.k = true;
                    j = pofVar.j();
                }
                if (j != null) {
                    yol.c(j);
                }
            }
        }
        if (qofVar == null) {
            return null;
        }
        if (vj3Var != null) {
            this.p = vj3Var.k;
            Socket socket = vj3Var.s;
            if (socket != null) {
                yol.c(socket);
            }
        }
        this.l.d.getClass();
        return new g4g(qofVar);
    }
}
