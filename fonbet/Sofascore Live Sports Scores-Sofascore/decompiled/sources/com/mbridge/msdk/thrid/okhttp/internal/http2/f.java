package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {
    private static final List<String> f = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> g = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final t.a a;
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g b;
    private final g c;
    private i d;
    private final w e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends com.mbridge.msdk.thrid.okio.h {
        boolean b;
        long c;

        public a(s sVar) {
            super(sVar);
            this.b = false;
            this.c = 0L;
        }

        private void a(IOException iOException) {
            if (this.b) {
                return;
            }
            this.b = true;
            f fVar = f.this;
            fVar.b.a(false, fVar, this.c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            try {
                long b = d().b(cVar, j);
                if (b <= 0) {
                    return b;
                }
                this.c += b;
                return b;
            } catch (IOException e) {
                a(e);
                throw e;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(null);
        }
    }

    public f(v vVar, t.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.a = aVar;
        this.b = gVar;
        this.c = gVar2;
        List<w> u = vVar.u();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.e = u.contains(wVar) ? wVar : w.HTTP_2;
    }

    public static a0.a a(r rVar, w wVar) throws IOException {
        r.a aVar = new r.a();
        int b = rVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVar = null;
        for (int i = 0; i < b; i++) {
            String a2 = rVar.a(i);
            String b2 = rVar.b(i);
            if (a2.equals(":status")) {
                kVar = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + b2);
            } else if (!g.contains(a2)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.a.a(aVar, a2, b2);
            }
        }
        if (kVar != null) {
            return new a0.a().a(wVar).a(kVar.b).a(kVar.c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<c> b(y yVar) {
        r c = yVar.c();
        ArrayList arrayList = new ArrayList(c.b() + 4);
        arrayList.add(new c(c.f, yVar.e()));
        arrayList.add(new c(c.g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar.g())));
        String a2 = yVar.a("Host");
        if (a2 != null) {
            arrayList.add(new c(c.i, a2));
        }
        arrayList.add(new c(c.h, yVar.g().m()));
        int b = c.b();
        for (int i = 0; i < b; i++) {
            com.mbridge.msdk.thrid.okio.f c2 = com.mbridge.msdk.thrid.okio.f.c(c.a(i).toLowerCase(Locale.US));
            if (!f.contains(c2.m())) {
                arrayList.add(new c(c2, c.b(i)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        if (this.d != null) {
            return;
        }
        i a2 = this.c.a(b(yVar), yVar.a() != null);
        this.d = a2;
        com.mbridge.msdk.thrid.okio.t h = a2.h();
        long b = this.a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h.a(b, timeUnit);
        this.d.l().a(this.a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z) throws IOException {
        a0.a a2 = a(this.d.j(), this.e);
        if (z && com.mbridge.msdk.thrid.okhttp.internal.a.a.a(a2) == 100) {
            return null;
        }
        return a2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public com.mbridge.msdk.thrid.okio.r a(y yVar, long j) {
        return this.d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.b;
        gVar.f.responseBodyStart(gVar.e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(a0Var.b("Content-Type"), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var), com.mbridge.msdk.thrid.okio.l.a(new a(this.d.e())));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.c.flush();
    }
}
