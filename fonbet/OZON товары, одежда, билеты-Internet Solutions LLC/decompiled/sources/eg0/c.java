package eg0;

import Bl0.k0;
import We.F;
import We.G;
import We.InterfaceC4865g;
import We.L;
import We.v;
import We.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;

/* loaded from: classes7.dex */
public final class c extends v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9067a f62323a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f62324b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f62325c;

    public c(@NotNull C9067a networkInfoProvider) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.f62323a = networkInfoProvider;
    }

    @Override // We.v
    public final void cacheHit(@NotNull InterfaceC4865g call, @NotNull L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.K(999);
            a11.B(0L);
            a11.A(0L);
            a11.M(0L);
            a11.L(0L);
            a11.O(0L);
            a11.N(0L);
            a11.J(0L);
            a11.I(0L);
            a11.H(0L);
            a11.G(0L);
            a11.R(0L);
            a11.Q(0L);
            a11.T(0L);
            a11.S(0L);
            a11.E(0L);
        }
    }

    @Override // We.v
    public final void callStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.F(System.nanoTime());
            a11.T(System.nanoTime());
            a11.R(System.nanoTime());
            a11.D(this.f62323a.j().getValue());
        }
    }

    @Override // We.v
    public final void connectEnd(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, F f7) {
        C6364b a11;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        if (this.f62324b || (a11 = k0.a(call)) == null) {
            return;
        }
        a11.L(System.nanoTime());
    }

    @Override // We.v
    public final void connectStart(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.f62324b = false;
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.M(System.nanoTime());
        }
    }

    @Override // We.v
    public final void dnsEnd(@NotNull InterfaceC4865g call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.A(System.nanoTime());
        }
    }

    @Override // We.v
    public final void dnsStart(@NotNull InterfaceC4865g call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.B(System.nanoTime());
        }
    }

    @Override // We.v
    public final void requestBodyEnd(@NotNull InterfaceC4865g call, long j11) {
        Intrinsics.checkNotNullParameter(call, "call");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.J(System.nanoTime());
        }
    }

    @Override // We.v
    public final void requestHeadersEnd(@NotNull InterfaceC4865g call, @NotNull G request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.J(System.nanoTime());
        }
    }

    @Override // We.v
    public final void responseBodyEnd(@NotNull InterfaceC4865g call, long j11) {
        Intrinsics.checkNotNullParameter(call, "call");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.G(System.nanoTime());
            a11.S(System.nanoTime());
            if (j11 > 0) {
                a11.C(j11);
                a11.P(j11 + this.f62325c);
            }
        }
    }

    @Override // We.v
    public final void responseHeadersEnd(@NotNull InterfaceC4865g call, @NotNull L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.K(response.m());
        }
        this.f62325c = response.r().b();
    }

    @Override // We.v
    public final void responseHeadersStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.Q(System.nanoTime());
            a11.I(System.nanoTime());
            a11.H(System.nanoTime());
        }
    }

    @Override // We.v
    public final void secureConnectEnd(@NotNull InterfaceC4865g call, y yVar) {
        Intrinsics.checkNotNullParameter(call, "call");
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.N(System.nanoTime());
        }
    }

    @Override // We.v
    public final void secureConnectStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f62324b = true;
        C6364b a11 = k0.a(call);
        if (a11 != null) {
            a11.L(System.nanoTime());
            a11.O(System.nanoTime());
        }
    }
}
