package nh;

import gh.g0;
import gh.h0;
import gh.i0;
import gh.n0;
import gh.o0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.ByteString;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r implements lh.f {

    /* renamed from: g, reason: collision with root package name */
    public static final List f21004g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f21005h;

    /* renamed from: a, reason: collision with root package name */
    public final kh.q f21006a;

    /* renamed from: b, reason: collision with root package name */
    public final lh.h f21007b;

    /* renamed from: c, reason: collision with root package name */
    public final q f21008c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f21009d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f21010e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f21011f;

    static {
        String[] elements = {"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"};
        TimeZone timeZone = hh.g.f10825a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        f21004g = hh.g.k(elements);
        String[] elements2 = {"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f21005h = hh.g.k(elements2);
    }

    public r(g0 client, kh.q carrier, lh.h chain, q http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f21006a = carrier;
        this.f21007b = chain;
        this.f21008c = http2Connection;
        List list = client.f10185r;
        h0 h0Var = h0.f10202g;
        this.f21010e = list.contains(h0Var) ? h0Var : h0.f10201f;
    }

    @Override // lh.f
    public final void a() {
        y yVar = this.f21009d;
        Intrinsics.checkNotNull(yVar);
        yVar.f21041i.close();
    }

    @Override // lh.f
    public final boolean b() {
        boolean z5;
        y yVar = this.f21009d;
        if (yVar == null) {
            return false;
        }
        synchronized (yVar) {
            w wVar = yVar.f21040h;
            if (wVar.f21027b) {
                if (wVar.f21029d.exhausted()) {
                    z5 = true;
                }
            }
            z5 = false;
        }
        return z5;
    }

    @Override // lh.f
    public final Sink c(i0 request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        y yVar = this.f21009d;
        Intrinsics.checkNotNull(yVar);
        return yVar.f21041i;
    }

    @Override // lh.f
    public final void cancel() {
        this.f21011f = true;
        y yVar = this.f21009d;
        if (yVar != null) {
            yVar.e(b.f20921h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // lh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n0 d(boolean z5) {
        int i5;
        Headers headerBlock;
        boolean z7;
        y yVar = this.f21009d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            while (true) {
                i5 = 0;
                if (!yVar.f21038f.isEmpty() || yVar.f() != null) {
                    break;
                }
                if (!z5) {
                    yVar.f21034b.getClass();
                    v vVar = yVar.f21041i;
                    if (!vVar.f21024c && !vVar.f21022a) {
                        z7 = false;
                    }
                    z7 = true;
                }
                i5 = 1;
                if (i5 != 0) {
                    yVar.j.enter();
                }
                try {
                    yVar.k();
                    if (i5 != 0) {
                        yVar.j.a();
                    }
                } catch (Throwable th2) {
                    if (i5 != 0) {
                        yVar.j.a();
                    }
                    throw th2;
                }
            }
            if (yVar.f21038f.isEmpty()) {
                IOException iOException = yVar.f21044m;
                if (iOException != null) {
                    throw iOException;
                }
                b f6 = yVar.f();
                Intrinsics.checkNotNull(f6);
                throw new d0(f6);
            }
            Object removeFirst = yVar.f21038f.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "removeFirst(...)");
            headerBlock = (Headers) removeFirst;
        }
        h0 protocol = this.f21010e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        gh.v vVar2 = new gh.v();
        int size = headerBlock.size();
        androidx.transition.n0 n0Var = null;
        while (i5 < size) {
            String name = headerBlock.name(i5);
            String value = headerBlock.value(i5);
            if (Intrinsics.areEqual(name, ":status")) {
                n0Var = f3.x.m0("HTTP/1.1 " + value);
            } else if (!f21005h.contains(name)) {
                vVar2.b(name, value);
            }
            i5++;
        }
        if (n0Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        n0 n0Var2 = new n0();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        n0Var2.f10258b = protocol;
        n0Var2.f10259c = n0Var.f2733b;
        String message = (String) n0Var.f2735d;
        Intrinsics.checkNotNullParameter(message, "message");
        n0Var2.f10260d = message;
        Headers headers = vVar2.d();
        Intrinsics.checkNotNullParameter(headers, "headers");
        n0Var2.f10262f = headers.newBuilder();
        if (z5 && n0Var2.f10259c == 100) {
            return null;
        }
        return n0Var2;
    }

    @Override // lh.f
    public final void e() {
        this.f21008c.f21001w.flush();
    }

    @Override // lh.f
    public final Socket f() {
        y yVar = this.f21009d;
        Intrinsics.checkNotNull(yVar);
        return yVar;
    }

    @Override // lh.f
    public final lh.e g() {
        return this.f21006a;
    }

    @Override // lh.f
    public final Source h(o0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        y yVar = this.f21009d;
        Intrinsics.checkNotNull(yVar);
        return yVar.f21040h;
    }

    @Override // lh.f
    public final long i(o0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (lh.g.a(response)) {
            return hh.g.e(response);
        }
        return 0L;
    }

    @Override // lh.f
    public final void j(i0 request) {
        int i5;
        y yVar;
        boolean z5;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f21009d != null) {
            return;
        }
        boolean z7 = request.f10209d != null;
        Intrinsics.checkNotNullParameter(request, "request");
        Headers headers = request.f10208c;
        ArrayList requestHeaders = new ArrayList(headers.size() + 4);
        requestHeaders.add(new d(request.f10207b, d.f20930f));
        ByteString byteString = d.f20931g;
        gh.y url = request.f10206a;
        Intrinsics.checkNotNullParameter(url, "url");
        String b10 = url.b();
        String d10 = url.d();
        if (d10 != null) {
            b10 = b10 + '?' + d10;
        }
        requestHeaders.add(new d(b10, byteString));
        String a7 = request.a("Host");
        if (a7 != null) {
            requestHeaders.add(new d(a7, d.f20933i));
        }
        requestHeaders.add(new d(url.f10329a, d.f20932h));
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String name = headers.name(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = name.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!f21004g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(headers.value(i10), "trailers"))) {
                requestHeaders.add(new d(lowerCase, headers.value(i10)));
            }
        }
        q qVar = this.f21008c;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z10 = !z7;
        synchronized (qVar.f21001w) {
            synchronized (qVar) {
                try {
                    if (qVar.f20985e > 1073741823) {
                        qVar.t(b.f20920g);
                    }
                    if (qVar.f20986f) {
                        throw new a();
                    }
                    i5 = qVar.f20985e;
                    qVar.f20985e = i5 + 2;
                    yVar = new y(i5, qVar, z10, false, null);
                    z5 = !z7 || qVar.f20998t >= qVar.f20999u || yVar.f21036d >= yVar.f21037e;
                    if (yVar.h()) {
                        qVar.f20982b.put(Integer.valueOf(i5), yVar);
                    }
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.f21001w.t(i5, requestHeaders, z10);
        }
        if (z5) {
            qVar.f21001w.flush();
        }
        this.f21009d = yVar;
        if (this.f21011f) {
            y yVar2 = this.f21009d;
            Intrinsics.checkNotNull(yVar2);
            yVar2.e(b.f20921h);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f21009d;
        Intrinsics.checkNotNull(yVar3);
        x xVar = yVar3.j;
        long j = this.f21007b.f20095g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.timeout(j, timeUnit);
        y yVar4 = this.f21009d;
        Intrinsics.checkNotNull(yVar4);
        yVar4.f21042k.timeout(this.f21007b.f20096h, timeUnit);
    }
}
