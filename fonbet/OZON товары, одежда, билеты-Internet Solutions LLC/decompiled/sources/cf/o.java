package cf;

import We.A;
import We.C4859a;
import We.InterfaceC4865g;
import We.O;
import We.v;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private List<? extends Proxy> f57152a;

    /* renamed from: b, reason: collision with root package name */
    private int f57153b;

    /* renamed from: c, reason: collision with root package name */
    private Object f57154c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f57155d;

    /* renamed from: e, reason: collision with root package name */
    private final C4859a f57156e;

    /* renamed from: f, reason: collision with root package name */
    private final m f57157f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4865g f57158g;

    /* renamed from: h, reason: collision with root package name */
    private final v f57159h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f57160a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f57161b;

        public a(@NotNull ArrayList routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f57161b = routes;
        }

        @NotNull
        public final List<O> a() {
            return this.f57161b;
        }

        public final boolean b() {
            return this.f57160a < this.f57161b.size();
        }

        @NotNull
        public final O c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f57160a;
            this.f57160a = i11 + 1;
            return (O) this.f57161b.get(i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull C4859a address, @NotNull m routeDatabase, @NotNull InterfaceC4865g call, @NotNull v eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f57156e = address;
        this.f57157f = routeDatabase;
        this.f57158g = call;
        this.f57159h = eventListener;
        K k11 = K.f71697a;
        this.f57152a = k11;
        this.f57154c = k11;
        this.f57155d = new ArrayList();
        A l11 = address.l();
        p pVar = new p(this, address.g(), l11);
        eventListener.proxySelectStart(call, l11);
        List<? extends Proxy> invoke = pVar.invoke();
        this.f57152a = invoke;
        this.f57153b = 0;
        eventListener.proxySelectEnd(call, l11, invoke);
    }

    public final boolean b() {
        return this.f57153b < this.f57152a.size() || !this.f57155d.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    @NotNull
    public final a c() throws IOException {
        ArrayList arrayList;
        String hostName;
        int n11;
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            boolean z11 = this.f57153b < this.f57152a.size();
            arrayList = this.f57155d;
            if (!z11) {
                break;
            }
            boolean z12 = this.f57153b < this.f57152a.size();
            C4859a c4859a = this.f57156e;
            if (!z12) {
                throw new SocketException("No route to " + c4859a.l().h() + "; exhausted proxy configurations: " + this.f57152a);
            }
            List<? extends Proxy> list = this.f57152a;
            int i11 = this.f57153b;
            this.f57153b = i11 + 1;
            Proxy proxy = list.get(i11);
            ArrayList arrayList3 = new ArrayList();
            this.f57154c = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                hostName = c4859a.l().h();
                n11 = c4859a.l().n();
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                InetSocketAddress socketHost = (InetSocketAddress) address;
                Intrinsics.checkNotNullParameter(socketHost, "$this$socketHost");
                InetAddress address2 = socketHost.getAddress();
                if (address2 != null) {
                    hostName = address2.getHostAddress();
                    Intrinsics.checkNotNullExpressionValue(hostName, "address.hostAddress");
                } else {
                    hostName = socketHost.getHostName();
                    Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                }
                n11 = socketHost.getPort();
            }
            if (1 > n11 || 65535 < n11) {
                throw new SocketException("No route to " + hostName + ':' + n11 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostName, n11));
            } else {
                v vVar = this.f57159h;
                InterfaceC4865g interfaceC4865g = this.f57158g;
                vVar.dnsStart(interfaceC4865g, hostName);
                List<InetAddress> a11 = c4859a.c().a(hostName);
                if (a11.isEmpty()) {
                    throw new UnknownHostException(c4859a.c() + " returned no addresses for " + hostName);
                }
                vVar.dnsEnd(interfaceC4865g, hostName, a11);
                Iterator<InetAddress> it = a11.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new InetSocketAddress(it.next(), n11));
                }
            }
            Iterator it2 = this.f57154c.iterator();
            while (it2.hasNext()) {
                O o11 = new O(c4859a, proxy, (InetSocketAddress) it2.next());
                if (this.f57157f.c(o11)) {
                    arrayList.add(o11);
                } else {
                    arrayList2.add(o11);
                }
            }
        } while (arrayList2.isEmpty());
        if (arrayList2.isEmpty()) {
            C7714v.p(arrayList, arrayList2);
            arrayList.clear();
        }
        return new a(arrayList2);
    }
}
