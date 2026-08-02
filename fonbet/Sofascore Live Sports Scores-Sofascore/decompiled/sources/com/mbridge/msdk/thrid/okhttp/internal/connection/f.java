package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import defpackage.vxd;
import defpackage.yhk;
import defpackage.zzl;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    private final com.mbridge.msdk.thrid.okhttp.a a;
    private final d b;
    private final com.mbridge.msdk.thrid.okhttp.d c;
    private final o d;
    private List<Proxy> e;
    private int f;
    private List<InetSocketAddress> g;
    private final List<c0> h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        private final List<c0> a;
        private int b = 0;

        public a(List<c0> list) {
            this.a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public c0 c() {
            if (!b()) {
                yhk.d();
                return null;
            }
            List<c0> list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        List list = Collections.EMPTY_LIST;
        this.e = list;
        this.g = list;
        this.h = new ArrayList();
        this.a = aVar;
        this.b = dVar;
        this.c = dVar2;
        this.d = oVar;
        a(aVar.k(), aVar.f());
    }

    private void a(Proxy proxy) throws IOException {
        String g;
        int j;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            g = this.a.k().g();
            j = this.a.k().j();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                zzl.i(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                return;
            } else {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                g = a(inetSocketAddress);
                j = inetSocketAddress.getPort();
            }
        }
        if (j < 1 || j > 65535) {
            throw new SocketException(vxd.k(j, "No route to ", g, ":", "; port is out of range"));
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(g, j));
            return;
        }
        this.d.dnsStart(this.c, g);
        List<InetAddress> a2 = this.a.c().a(g);
        if (a2.isEmpty()) {
            throw new UnknownHostException(this.a.c() + " returned no addresses for " + g);
        }
        this.d.dnsEnd(this.c, g, a2);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.g.add(new InetSocketAddress(a2.get(i), j));
        }
    }

    private boolean b() {
        return this.f < this.e.size();
    }

    private Proxy d() throws IOException {
        if (b()) {
            List<Proxy> list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.k().g() + "; exhausted proxy configurations: " + this.e);
    }

    public a c() throws IOException {
        if (!a()) {
            yhk.d();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy d = d();
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                c0 c0Var = new c0(this.a, d, this.g.get(i));
                if (this.b.c(c0Var)) {
                    this.h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.h);
            this.h.clear();
        }
        return new a(arrayList);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.a.h() != null) {
            this.a.h().connectFailed(this.a.k().n(), c0Var.b().address(), iOException);
        }
        this.b.b(c0Var);
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> a2;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.a.h().select(sVar.n());
            if (select != null && !select.isEmpty()) {
                a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(select);
            } else {
                a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.e = a2;
        }
        this.f = 0;
    }

    public boolean a() {
        return b() || !this.h.isEmpty();
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
