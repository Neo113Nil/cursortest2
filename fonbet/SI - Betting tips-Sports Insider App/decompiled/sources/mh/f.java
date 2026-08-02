package mh;

import androidx.appcompat.app.v0;
import androidx.appcompat.widget.c1;
import androidx.recyclerview.widget.j;
import f3.x;
import gh.g0;
import gh.h0;
import gh.i0;
import gh.m0;
import gh.n0;
import gh.o0;
import gh.w;
import gh.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import lh.g;
import okhttp3.Headers;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f implements lh.f {

    /* renamed from: f, reason: collision with root package name */
    public static final Headers f20753f;

    /* renamed from: a, reason: collision with root package name */
    public final g0 f20754a;

    /* renamed from: b, reason: collision with root package name */
    public final lh.e f20755b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f20756c;

    /* renamed from: d, reason: collision with root package name */
    public int f20757d;

    /* renamed from: e, reason: collision with root package name */
    public final j f20758e;

    static {
        Headers.Companion.getClass();
        f20753f = w.a("OkHttp-Response-Body", "Truncated");
    }

    public f(g0 g0Var, lh.e carrier, v0 socket) {
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f20754a = g0Var;
        this.f20755b = carrier;
        this.f20756c = socket;
        this.f20758e = new j((BufferedSource) socket.f365c);
    }

    public static final void k(f fVar, ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    @Override // lh.f
    public final void a() {
        ((BufferedSink) this.f20756c.f366d).flush();
    }

    @Override // lh.f
    public final boolean b() {
        return this.f20757d == 6;
    }

    @Override // lh.f
    public final Sink c(i0 request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        m0 m0Var = request.f10209d;
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            if (this.f20757d == 1) {
                this.f20757d = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f20757d).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f20757d == 1) {
            this.f20757d = 2;
            return new e4.f(this);
        }
        throw new IllegalStateException(("state: " + this.f20757d).toString());
    }

    @Override // lh.f
    public final void cancel() {
        this.f20755b.cancel();
    }

    @Override // lh.f
    public final n0 d(boolean z5) {
        j jVar = this.f20758e;
        int i5 = this.f20757d;
        if (i5 != 0 && i5 != 1 && i5 != 2 && i5 != 3) {
            throw new IllegalStateException(("state: " + this.f20757d).toString());
        }
        try {
            String readUtf8LineStrict = ((BufferedSource) jVar.f2439c).readUtf8LineStrict(jVar.f2438b);
            jVar.f2438b -= readUtf8LineStrict.length();
            androidx.transition.n0 m02 = x.m0(readUtf8LineStrict);
            int i10 = m02.f2733b;
            n0 n0Var = new n0();
            h0 protocol = (h0) m02.f2734c;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            n0Var.f10258b = protocol;
            n0Var.f10259c = i10;
            String message = (String) m02.f2735d;
            Intrinsics.checkNotNullParameter(message, "message");
            n0Var.f10260d = message;
            Headers headers = jVar.g();
            Intrinsics.checkNotNullParameter(headers, "headers");
            n0Var.f10262f = headers.newBuilder();
            if (z5 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f20757d = 3;
                return n0Var;
            }
            if (102 > i10 || i10 >= 200) {
                this.f20757d = 4;
                return n0Var;
            }
            this.f20757d = 3;
            return n0Var;
        } catch (EOFException e7) {
            throw new IOException(c1.m("unexpected end of stream on ", this.f20755b.h().f10302a.f10114h.g()), e7);
        }
    }

    @Override // lh.f
    public final void e() {
        ((BufferedSink) this.f20756c.f366d).flush();
    }

    @Override // lh.f
    public final Socket f() {
        return this.f20756c;
    }

    @Override // lh.f
    public final lh.e g() {
        return this.f20755b;
    }

    @Override // lh.f
    public final Source h(o0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        boolean a7 = g.a(response);
        i0 i0Var = response.f10273a;
        if (!a7) {
            return l(i0Var.f10206a, 0L);
        }
        if ("chunked".equalsIgnoreCase(o0.c(response, "Transfer-Encoding"))) {
            y yVar = i0Var.f10206a;
            if (this.f20757d == 4) {
                this.f20757d = 5;
                return new c(this, yVar);
            }
            throw new IllegalStateException(("state: " + this.f20757d).toString());
        }
        long e7 = hh.g.e(response);
        if (e7 != -1) {
            return l(i0Var.f10206a, e7);
        }
        y url = i0Var.f10206a;
        if (this.f20757d != 4) {
            throw new IllegalStateException(("state: " + this.f20757d).toString());
        }
        this.f20757d = 5;
        this.f20755b.e();
        Intrinsics.checkNotNullParameter(url, "url");
        return new e(this, url);
    }

    @Override // lh.f
    public final long i(o0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!g.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(o0.c(response, "Transfer-Encoding"))) {
            return -1L;
        }
        return hh.g.e(response);
    }

    @Override // lh.f
    public final void j(i0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f20755b.h().f10303b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "type(...)");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f10207b);
        sb2.append(' ');
        y url = request.f10206a;
        if (Intrinsics.areEqual(url.f10329a, "https") || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String b10 = url.b();
            String d10 = url.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb2.append(b10);
        } else {
            sb2.append(url);
        }
        sb2.append(" HTTP/1.1");
        m(request.f10208c, sb2.toString());
    }

    public final d l(y yVar, long j) {
        if (this.f20757d == 4) {
            this.f20757d = 5;
            return new d(this, yVar, j);
        }
        throw new IllegalStateException(("state: " + this.f20757d).toString());
    }

    public final void m(Headers headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f20757d != 0) {
            throw new IllegalStateException(("state: " + this.f20757d).toString());
        }
        v0 v0Var = this.f20756c;
        BufferedSink bufferedSink = (BufferedSink) v0Var.f366d;
        BufferedSink bufferedSink2 = (BufferedSink) v0Var.f366d;
        bufferedSink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            bufferedSink2.writeUtf8(headers.name(i5)).writeUtf8(": ").writeUtf8(headers.value(i5)).writeUtf8("\r\n");
        }
        bufferedSink2.writeUtf8("\r\n");
        this.f20757d = 1;
    }
}
