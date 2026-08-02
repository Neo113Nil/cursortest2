package io.sentry.okhttp;

import gh.h0;
import gh.i0;
import gh.k;
import gh.o0;
import gh.r;
import gh.u;
import gh.y;
import io.sentry.i1;
import io.sentry.y3;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kh.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f16705d = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f16706b;

    /* renamed from: c, reason: collision with root package name */
    public r f16707c;

    public e(androidx.fragment.app.r rVar) {
        y3 scopes = y3.f17255a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f16706b = rVar;
    }

    @Override // gh.r
    public final void A(gh.e call, u uVar) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.A(call, uVar);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.b("http.connect.secure_connect_ms", null);
        }
    }

    @Override // gh.r
    public final void B(gh.e call) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.B(call);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.connect.secure_connect_ms");
        }
    }

    public final boolean C() {
        r rVar = this.f16707c;
        if (rVar instanceof e) {
            return false;
        }
        return !Intrinsics.areEqual("io.sentry.android.okhttp.SentryOkHttpEventListener", rVar != null ? rVar.getClass().getName() : null);
    }

    @Override // gh.r
    public final void a(gh.e call, o0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.a(call, cachedResponse);
        }
    }

    @Override // gh.r
    public final void b(gh.e call, o0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.b(call, response);
        }
    }

    @Override // gh.r
    public final void c(p call) {
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.c(call);
        }
        a aVar = (a) f16705d.remove(call);
        if (aVar == null) {
            return;
        }
        aVar.a(null);
    }

    @Override // gh.r
    public final void d(p call, IOException ioe) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.d(call, ioe);
        }
        if (C() && (aVar = (a) f16705d.remove(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.a(new b(ioe, 0));
        }
    }

    @Override // gh.r
    public final void e(p call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Function1 function1 = this.f16706b;
        r rVar = function1 != null ? (r) function1.invoke(call) : null;
        this.f16707c = rVar;
        if (rVar != null) {
            rVar.e(call);
        }
        if (C()) {
            f16705d.put(call, new a(call.f19139b));
        }
    }

    @Override // gh.r
    public final void f(p call) {
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.f(call);
        }
    }

    @Override // gh.r
    public final void g(gh.e call, InetSocketAddress inetSocketAddress, Proxy proxy, h0 h0Var) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.g(call, inetSocketAddress, proxy, h0Var);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            String name = h0Var != null ? h0Var.name() : null;
            if (name != null) {
                aVar.f16691c.c(name, "protocol");
                i1 i1Var = aVar.f16692d;
                if (i1Var != null) {
                    i1Var.m(name, "protocol");
                }
            }
            aVar.b("http.connect_ms", null);
        }
    }

    @Override // gh.r
    public final void h(gh.e call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException ioe) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.h(call, inetSocketAddress, proxy, ioe);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.b("http.connect_ms", new b(ioe, 1));
        }
    }

    @Override // gh.r
    public final void i(gh.e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.i(call, inetSocketAddress, proxy);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.connect_ms");
        }
    }

    @Override // gh.r
    public final void j(gh.e call, k connection) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.j(call, connection);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.connection_ms");
        }
    }

    @Override // gh.r
    public final void k(gh.e call, k connection) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.k(call, connection);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.b("http.connection_ms", null);
        }
    }

    @Override // gh.r
    public final void l(p call, String domainName, List inetAddressList) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.l(call, domainName, inetAddressList);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.b("http.client.resolve_dns_ms", new f2.a(5, domainName, inetAddressList));
        }
    }

    @Override // gh.r
    public final void m(p call, String domainName) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.m(call, domainName);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.client.resolve_dns_ms");
        }
    }

    @Override // gh.r
    public final void n(p call, y url, List proxies) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.n(call, url, proxies);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.b("http.client.proxy_select_ms", new androidx.fragment.app.r(5, proxies));
        }
    }

    @Override // gh.r
    public final void o(p call, y url) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.o(call, url);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.client.proxy_select_ms");
        }
    }

    @Override // gh.r
    public final void p(gh.e call, long j) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.p(call, j);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.b("http.connection.request_body_ms", new d(j, 0));
            if (j > -1) {
                aVar.f16691c.c(Long.valueOf(j), "request_content_length");
                i1 i1Var = aVar.f16692d;
                if (i1Var != null) {
                    i1Var.m(Long.valueOf(j), "http.request_content_length");
                }
            }
        }
    }

    @Override // gh.r
    public final void q(gh.e call) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.q(call);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.connection.request_body_ms");
        }
    }

    @Override // gh.r
    public final void r(gh.e call, IOException ioe) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.r(call, ioe);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.b("http.connection.request_headers_ms", new b(ioe, 2));
            aVar.b("http.connection.request_body_ms", new b(ioe, 3));
        }
    }

    @Override // gh.r
    public final void s(gh.e call, i0 request) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.s(call, request);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.b("http.connection.request_headers_ms", null);
        }
    }

    @Override // gh.r
    public final void t(gh.e call) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.t(call);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.connection.request_headers_ms");
        }
    }

    @Override // gh.r
    public final void u(gh.e call, long j) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.u(call, j);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            if (j > -1) {
                aVar.f16691c.c(Long.valueOf(j), "response_content_length");
                i1 i1Var = aVar.f16692d;
                if (i1Var != null) {
                    i1Var.m(Long.valueOf(j), "http.response_content_length");
                }
            }
            aVar.b("http.connection.response_body_ms", new d(j, 1));
        }
    }

    @Override // gh.r
    public final void v(gh.e call) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.v(call);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.connection.response_body_ms");
        }
    }

    @Override // gh.r
    public final void w(gh.e call, IOException ioe) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.w(call, ioe);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.d(ioe.getMessage());
            aVar.b("http.connection.response_headers_ms", new b(ioe, 4));
            aVar.b("http.connection.response_body_ms", new b(ioe, 5));
        }
    }

    @Override // gh.r
    public final void x(gh.e call, o0 response) {
        a aVar;
        h0 h0Var = response.f10274b;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.x(call, response);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            Intrinsics.checkNotNullParameter(response, "response");
            aVar.f16693e = response;
            io.sentry.e eVar = aVar.f16691c;
            eVar.c(h0Var.name(), "protocol");
            int i5 = response.f10276d;
            eVar.c(Integer.valueOf(i5), "status_code");
            i1 i1Var = aVar.f16692d;
            if (i1Var != null) {
                i1Var.m(h0Var.name(), "protocol");
            }
            if (i1Var != null) {
                i1Var.m(Integer.valueOf(i5), "http.response.status_code");
            }
            aVar.b("http.connection.response_headers_ms", new androidx.fragment.app.r(6, response));
        }
    }

    @Override // gh.r
    public final void y(gh.e call) {
        a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.y(call);
        }
        if (C() && (aVar = (a) f16705d.get(call)) != null) {
            aVar.c("http.connection.response_headers_ms");
        }
    }

    @Override // gh.r
    public final void z(gh.e call, o0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        r rVar = this.f16707c;
        if (rVar != null) {
            rVar.z(call, response);
        }
    }
}
