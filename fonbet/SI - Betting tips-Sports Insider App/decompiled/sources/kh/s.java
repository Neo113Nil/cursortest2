package kh;

import androidx.appcompat.widget.c1;
import com.android.billingclient.api.l0;
import com.sports.insider.data.repository.room.live.LiveTable;
import gh.h0;
import gh.i0;
import gh.o0;
import gh.q0;
import gh.r0;
import gh.s0;
import gh.u0;
import gh.y;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import kotlin.collections.e0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final jh.e f19173a;

    /* renamed from: b, reason: collision with root package name */
    public final r f19174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19176d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19177e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19178f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19179g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19180h;

    /* renamed from: i, reason: collision with root package name */
    public final gh.a f19181i;
    public final i2.d j;

    /* renamed from: k, reason: collision with root package name */
    public final p f19182k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19183l;

    /* renamed from: m, reason: collision with root package name */
    public l0 f19184m;

    /* renamed from: n, reason: collision with root package name */
    public ic.d f19185n;

    /* renamed from: o, reason: collision with root package name */
    public s0 f19186o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlin.collections.l f19187p;

    public s(jh.e taskRunner, r connectionPool, int i5, int i10, int i11, int i12, boolean z5, boolean z7, gh.a address, i2.d routeDatabase, p call, i0 request) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f19173a = taskRunner;
        this.f19174b = connectionPool;
        this.f19175c = i5;
        this.f19176d = i10;
        this.f19177e = i11;
        this.f19178f = i12;
        this.f19179g = z5;
        this.f19180h = z7;
        this.f19181i = address;
        this.j = routeDatabase;
        this.f19182k = call;
        this.f19183l = !Intrinsics.areEqual(request.f10207b, "GET");
        this.f19187p = new kotlin.collections.l();
    }

    public final boolean a(q qVar) {
        ic.d dVar;
        s0 s0Var;
        if (this.f19187p.isEmpty() && this.f19186o == null) {
            if (qVar != null) {
                synchronized (qVar) {
                    s0Var = null;
                    if (qVar.f19164l == 0 && qVar.j && hh.g.a(qVar.f19156c.f10302a.f10114h, this.f19181i.f10114h)) {
                        s0Var = qVar.f19156c;
                    }
                }
                if (s0Var != null) {
                    this.f19186o = s0Var;
                    return true;
                }
            }
            l0 l0Var = this.f19184m;
            if ((l0Var == null || l0Var.f4044b >= ((ArrayList) l0Var.f4045c).size()) && (dVar = this.f19185n) != null) {
                return dVar.a();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v b() {
        Socket k6;
        boolean z5;
        t tVar;
        q connection = this.f19182k.f19146i;
        if (connection != null) {
            boolean i5 = connection.i(this.f19183l);
            synchronized (connection) {
                try {
                    if (i5) {
                        if (!connection.j && f(connection.f19156c.f10302a.f10114h)) {
                            z5 = false;
                            k6 = null;
                        }
                        k6 = this.f19182k.k();
                        z5 = false;
                    } else {
                        z5 = !connection.j;
                        connection.j = true;
                        k6 = this.f19182k.k();
                    }
                } finally {
                }
            }
            if (this.f19182k.f19146i != null) {
                if (k6 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                tVar = new t(connection);
                if (tVar == null) {
                    return tVar;
                }
                t e7 = e(null, null);
                if (e7 != null) {
                    return e7;
                }
                if (!this.f19187p.isEmpty()) {
                    return (v) this.f19187p.removeFirst();
                }
                c c2 = c();
                t e9 = e(c2, c2.f19088k);
                return e9 != null ? e9 : c2;
            }
            if (k6 != null) {
                hh.g.c(k6);
            }
            p pVar = this.f19182k;
            pVar.f19141d.k(pVar, connection);
            p call = this.f19182k;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(call, "call");
            if (k6 != null) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else if (z5) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }
        }
        tVar = null;
        if (tVar == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.List] */
    public final c c() {
        String hostname;
        int i5;
        List addresses;
        boolean contains;
        List k6;
        s0 s0Var = this.f19186o;
        if (s0Var != null) {
            this.f19186o = null;
            return d(s0Var, null);
        }
        l0 l0Var = this.f19184m;
        if (l0Var != null && l0Var.f4044b < ((ArrayList) l0Var.f4045c).size()) {
            int i10 = l0Var.f4044b;
            ArrayList arrayList = (ArrayList) l0Var.f4045c;
            if (i10 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i11 = l0Var.f4044b;
            l0Var.f4044b = i11 + 1;
            return d((s0) arrayList.get(i11), null);
        }
        ic.d dVar = this.f19185n;
        if (dVar == null) {
            gh.a address = this.f19181i;
            i2.d routeDatabase = this.j;
            p call = this.f19182k;
            boolean z5 = this.f19180h;
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
            Intrinsics.checkNotNullParameter(call, "call");
            dVar = new ic.d();
            dVar.f11091c = address;
            dVar.f11092d = routeDatabase;
            dVar.f11093e = call;
            dVar.f11089a = z5;
            e0 e0Var = e0.f19204a;
            dVar.f11094f = e0Var;
            dVar.f11095g = e0Var;
            dVar.f11096h = new ArrayList();
            y yVar = address.f10114h;
            gh.r rVar = call.f19141d;
            rVar.o(call, yVar);
            URI h10 = yVar.h();
            if (h10.getHost() == null) {
                Proxy[] elements = {Proxy.NO_PROXY};
                TimeZone timeZone = hh.g.f10825a;
                Intrinsics.checkNotNullParameter(elements, "elements");
                k6 = hh.g.k(elements);
            } else {
                List<Proxy> select = address.f10113g.select(h10);
                if (select == null || select.isEmpty()) {
                    Proxy[] elements2 = {Proxy.NO_PROXY};
                    TimeZone timeZone2 = hh.g.f10825a;
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    k6 = hh.g.k(elements2);
                } else {
                    k6 = hh.g.j(select);
                }
            }
            dVar.f11094f = k6;
            dVar.f11090b = 0;
            rVar.n(call, yVar, k6);
            this.f19185n = dVar;
        }
        if (!dVar.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!dVar.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (dVar.f11090b < ((List) dVar.f11094f).size()) {
            gh.a aVar = (gh.a) dVar.f11091c;
            if (dVar.f11090b >= ((List) dVar.f11094f).size()) {
                throw new SocketException("No route to " + aVar.f10114h.f10332d + "; exhausted proxy configurations: " + ((List) dVar.f11094f));
            }
            List list = (List) dVar.f11094f;
            int i12 = dVar.f11090b;
            dVar.f11090b = i12 + 1;
            Proxy proxy = (Proxy) list.get(i12);
            p pVar = (p) dVar.f11093e;
            ArrayList arrayList3 = new ArrayList();
            dVar.f11095g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                y yVar2 = aVar.f10114h;
                hostname = yVar2.f10332d;
                i5 = yVar2.f10333e;
            } else {
                SocketAddress address2 = proxy.address();
                if (!(address2 instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address2.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                InetAddress address3 = inetSocketAddress.getAddress();
                if (address3 == null) {
                    hostname = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(hostname, "getHostName(...)");
                } else {
                    hostname = address3.getHostAddress();
                    Intrinsics.checkNotNullExpressionValue(hostname, "getHostAddress(...)");
                }
                i5 = inetSocketAddress.getPort();
            }
            if (1 > i5 || i5 >= 65536) {
                throw new SocketException("No route to " + hostname + ':' + i5 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostname, i5));
            } else {
                Regex regex = hh.d.f10820a;
                Intrinsics.checkNotNullParameter(hostname, "<this>");
                if (hh.d.f10820a.d(hostname)) {
                    addresses = kotlin.collections.t.c(InetAddress.getByName(hostname));
                } else {
                    pVar.f19141d.m(pVar, hostname);
                    aVar.f10107a.getClass();
                    Intrinsics.checkNotNullParameter(hostname, "hostname");
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostname);
                        Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(...)");
                        List z7 = kotlin.collections.p.z(allByName);
                        if (z7.isEmpty()) {
                            throw new UnknownHostException(aVar.f10107a + " returned no addresses for " + hostname);
                        }
                        pVar.f19141d.l(pVar, hostname, z7);
                        addresses = z7;
                    } catch (NullPointerException e7) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                        unknownHostException.initCause(e7);
                        throw unknownHostException;
                    }
                }
                if (dVar.f11089a) {
                    Intrinsics.checkNotNullParameter(addresses, "addresses");
                    if (addresses.size() >= 2) {
                        ArrayList a7 = new ArrayList();
                        ArrayList b10 = new ArrayList();
                        for (Object obj : addresses) {
                            if (((InetAddress) obj) instanceof Inet6Address) {
                                a7.add(obj);
                            } else {
                                b10.add(obj);
                            }
                        }
                        if (!a7.isEmpty() && !b10.isEmpty()) {
                            byte[] bArr = hh.e.f10821a;
                            Intrinsics.checkNotNullParameter(a7, "a");
                            Intrinsics.checkNotNullParameter(b10, "b");
                            Iterator it = a7.iterator();
                            Iterator it2 = b10.iterator();
                            hf.e b11 = kotlin.collections.t.b();
                            while (true) {
                                if (!it.hasNext() && !it2.hasNext()) {
                                    break;
                                }
                                if (it.hasNext()) {
                                    b11.add(it.next());
                                }
                                if (it2.hasNext()) {
                                    b11.add(it2.next());
                                }
                            }
                            addresses = kotlin.collections.t.a(b11);
                        }
                    }
                }
                Iterator it3 = addresses.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i5));
                }
            }
            Iterator it4 = dVar.f11095g.iterator();
            while (it4.hasNext()) {
                s0 route = new s0((gh.a) dVar.f11091c, proxy, (InetSocketAddress) it4.next());
                i2.d dVar2 = (i2.d) dVar.f11092d;
                synchronized (dVar2) {
                    Intrinsics.checkNotNullParameter(route, "route");
                    contains = ((LinkedHashSet) dVar2.f10882b).contains(route);
                }
                if (contains) {
                    ((ArrayList) dVar.f11096h).add(route);
                } else {
                    arrayList2.add(route);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            z.n((ArrayList) dVar.f11096h, arrayList2);
            ((ArrayList) dVar.f11096h).clear();
        }
        l0 l0Var2 = new l0(arrayList2);
        this.f19184m = l0Var2;
        if (this.f19182k.q) {
            throw new IOException("Canceled");
        }
        if (l0Var2.f4044b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i13 = l0Var2.f4044b;
        l0Var2.f4044b = i13 + 1;
        return d((s0) arrayList2.get(i13), arrayList2);
    }

    public final c d(s0 route, ArrayList arrayList) {
        i0 request;
        Intrinsics.checkNotNullParameter(route, "route");
        gh.a aVar = route.f10302a;
        if (aVar.f10109c == null) {
            if (!aVar.j.contains(gh.l.f10235f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f10302a.f10114h.f10332d;
            qh.e eVar = qh.e.f22190a;
            if (!qh.e.f22190a.i(str)) {
                throw new UnknownServiceException(c1.n("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (aVar.f10115i.contains(h0.f10202g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (route.f10303b.type() == Proxy.Type.HTTP) {
            gh.a aVar2 = route.f10302a;
            if (aVar2.f10109c != null || aVar2.f10115i.contains(h0.f10202g)) {
                c4.d dVar = new c4.d(5);
                y url = route.f10302a.f10114h;
                Intrinsics.checkNotNullParameter(url, "url");
                dVar.f3577b = url;
                dVar.j("CONNECT", null);
                gh.a aVar3 = route.f10302a;
                dVar.i("Host", hh.g.i(aVar3.f10114h, true));
                dVar.i("Proxy-Connection", "Keep-Alive");
                dVar.i("User-Agent", "okhttp/5.3.2");
                request = new i0(dVar);
                q0 q0Var = r0.f10297b;
                gh.o oVar = u0.f10319b;
                gh.v vVar = new gh.v();
                Intrinsics.checkNotNullParameter(request, "request");
                h0 protocol = h0.f10199d;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter("Preemptive Authenticate", LiveTable.messageColumn);
                Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
                Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
                vVar.f("Proxy-Authenticate", "OkHttp-Preemptive");
                o0 response = new o0(request, protocol, "Preemptive Authenticate", 407, null, vVar.d(), q0Var, null, null, null, null, -1L, -1L, null, oVar);
                ((gh.o) aVar3.f10112f).getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return new c(this.f19173a, this.f19174b, this.f19175c, this.f19176d, this.f19177e, this.f19178f, this.f19179g, this.f19182k, this, route, arrayList, request, -1, false);
            }
        }
        request = null;
        return new c(this.f19173a, this.f19174b, this.f19175c, this.f19176d, this.f19177e, this.f19178f, this.f19179g, this.f19182k, this, route, arrayList, request, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0047, code lost:
    
        if ((r7.f19162i != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t e(c cVar, List list) {
        q connection;
        boolean z5;
        boolean z7;
        Socket k6;
        r rVar = this.f19174b;
        boolean z10 = this.f19183l;
        gh.a address = this.f19181i;
        p call = this.f19182k;
        boolean z11 = cVar != null && cVar.c();
        rVar.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = rVar.f19172d.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                connection = null;
                break;
            }
            connection = (q) it.next();
            Intrinsics.checkNotNull(connection);
            synchronized (connection) {
                if (z11) {
                    try {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (connection.f(address, list)) {
                    call.b(connection);
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                if (connection.i(z10)) {
                    break;
                }
                synchronized (connection) {
                    z7 = connection.j;
                    connection.j = true;
                    k6 = call.k();
                }
                if (k6 != null) {
                    hh.g.c(k6);
                    Intrinsics.checkNotNullParameter(connection, "connection");
                } else if (!z7) {
                    Intrinsics.checkNotNullParameter(connection, "connection");
                }
            }
        }
        if (connection == null) {
            return null;
        }
        if (cVar != null) {
            this.f19186o = cVar.j;
            Socket socket = cVar.q;
            if (socket != null) {
                hh.g.c(socket);
            }
        }
        p pVar = this.f19182k;
        pVar.f19141d.j(pVar, connection);
        p call2 = this.f19182k;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call2, "call");
        return new t(connection);
    }

    public final boolean f(y url) {
        Intrinsics.checkNotNullParameter(url, "url");
        y yVar = this.f19181i.f10114h;
        return url.f10333e == yVar.f10333e && Intrinsics.areEqual(url.f10332d, yVar.f10332d);
    }
}
