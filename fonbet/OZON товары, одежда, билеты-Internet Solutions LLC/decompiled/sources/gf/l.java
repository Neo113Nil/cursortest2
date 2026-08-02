package gf;

import We.A;
import We.E;
import We.F;
import We.G;
import We.L;
import We.z;
import ef.C6355e;
import ef.C6357g;
import ef.C6360j;
import ef.InterfaceC6354d;
import gf.n;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;
import sf.K;
import sf.M;

/* loaded from: classes6.dex */
public final class l implements InterfaceC6354d {

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f64401g = Ye.b.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f64402h = Ye.b.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private volatile n f64403a;

    /* renamed from: b, reason: collision with root package name */
    private final F f64404b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f64405c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final cf.j f64406d;

    /* renamed from: e, reason: collision with root package name */
    private final C6357g f64407e;

    /* renamed from: f, reason: collision with root package name */
    private final f f64408f;

    public l(@NotNull E client, @NotNull cf.j connection, @NotNull C6357g chain, @NotNull f http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f64406d = connection;
        this.f64407e = chain;
        this.f64408f = http2Connection;
        List<F> z11 = client.z();
        F f7 = F.H2_PRIOR_KNOWLEDGE;
        this.f64404b = z11.contains(f7) ? f7 : F.HTTP_2;
    }

    @Override // ef.InterfaceC6354d
    @NotNull
    public final cf.j a() {
        return this.f64406d;
    }

    @Override // ef.InterfaceC6354d
    @NotNull
    public final K b(@NotNull G request, long j11) {
        Intrinsics.checkNotNullParameter(request, "request");
        n nVar = this.f64403a;
        Intrinsics.f(nVar);
        return nVar.o();
    }

    @Override // ef.InterfaceC6354d
    @NotNull
    public final M c(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        n nVar = this.f64403a;
        Intrinsics.f(nVar);
        return nVar.r();
    }

    @Override // ef.InterfaceC6354d
    public final void cancel() {
        this.f64405c = true;
        n nVar = this.f64403a;
        if (nVar != null) {
            nVar.f(EnumC6726b.CANCEL);
        }
    }

    @Override // ef.InterfaceC6354d
    public final void d() {
        this.f64408f.flush();
    }

    @Override // ef.InterfaceC6354d
    public final void e() {
        n nVar = this.f64403a;
        Intrinsics.f(nVar);
        nVar.o().close();
    }

    @Override // ef.InterfaceC6354d
    public final void f(@NotNull G request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f64403a != null) {
            return;
        }
        boolean z11 = request.a() != null;
        Intrinsics.checkNotNullParameter(request, "request");
        z e11 = request.e();
        ArrayList arrayList = new ArrayList(e11.size() + 4);
        arrayList.add(new C6727c(C6727c.f64298f, request.h()));
        C9684j c9684j = C6727c.f64299g;
        A url = request.j();
        Intrinsics.checkNotNullParameter(url, "url");
        String c11 = url.c();
        String e12 = url.e();
        if (e12 != null) {
            c11 = c11 + '?' + e12;
        }
        arrayList.add(new C6727c(c9684j, c11));
        String d11 = request.d("Host");
        if (d11 != null) {
            arrayList.add(new C6727c(C6727c.f64301i, d11));
        }
        arrayList.add(new C6727c(C6727c.f64300h, request.j().u()));
        int size = e11.size();
        for (int i11 = 0; i11 < size; i11++) {
            String e13 = e11.e(i11);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (e13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = e13.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!f64401g.contains(lowerCase) || (Intrinsics.d(lowerCase, "te") && Intrinsics.d(e11.k(i11), "trailers"))) {
                arrayList.add(new C6727c(lowerCase, e11.k(i11)));
            }
        }
        this.f64403a = this.f64408f.D0(arrayList, z11);
        if (this.f64405c) {
            n nVar = this.f64403a;
            Intrinsics.f(nVar);
            nVar.f(EnumC6726b.CANCEL);
            throw new IOException("Canceled");
        }
        n nVar2 = this.f64403a;
        Intrinsics.f(nVar2);
        n.c x11 = nVar2.x();
        long e14 = this.f64407e.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x11.g(e14, timeUnit);
        n nVar3 = this.f64403a;
        Intrinsics.f(nVar3);
        nVar3.H().g(this.f64407e.g(), timeUnit);
    }

    @Override // ef.InterfaceC6354d
    public final long g(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (C6355e.b(response)) {
            return Ye.b.m(response);
        }
        return 0L;
    }

    @Override // ef.InterfaceC6354d
    public final L.a h(boolean z11) {
        n nVar = this.f64403a;
        Intrinsics.f(nVar);
        z headerBlock = nVar.E();
        F protocol = this.f64404b;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        z.a aVar = new z.a();
        int size = headerBlock.size();
        C6360j c6360j = null;
        for (int i11 = 0; i11 < size; i11++) {
            String e11 = headerBlock.e(i11);
            String k11 = headerBlock.k(i11);
            if (Intrinsics.d(e11, ":status")) {
                c6360j = C6360j.a.a("HTTP/1.1 " + k11);
            } else if (!f64402h.contains(e11)) {
                aVar.c(e11, k11);
            }
        }
        if (c6360j == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        L.a aVar2 = new L.a();
        aVar2.o(protocol);
        aVar2.f(c6360j.f62237b);
        aVar2.l(c6360j.f62238c);
        aVar2.j(aVar.e());
        if (z11 && aVar2.g() == 100) {
            return null;
        }
        return aVar2;
    }
}
