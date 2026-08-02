package com.mbridge.msdk.thrid.okhttp.internal.http1;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.t;
import defpackage.a70;
import defpackage.vxd;
import defpackage.x5n;
import defpackage.zzl;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {
    final v a;
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g b;
    final com.mbridge.msdk.thrid.okio.e c;
    final com.mbridge.msdk.thrid.okio.d d;
    int e = 0;
    private long f = 262144;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class c implements r {
        private final i a;
        private boolean b;

        public c() {
            this.a = new i(a.this.d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (this.b) {
                a70.r("closed");
            } else {
                if (j == 0) {
                    return;
                }
                a.this.d.a(j);
                a.this.d.a("\r\n");
                a.this.d.a(cVar, j);
                a.this.d.a("\r\n");
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            a.this.d.a("0\r\n\r\n");
            a.this.a(this.a);
            a.this.e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.b) {
                return;
            }
            a.this.d.flush();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d extends b {
        private final s e;
        private long f;
        private boolean g;

        public d(s sVar) {
            super();
            this.f = -1L;
            this.g = true;
            this.e = sVar;
        }

        private void d() throws IOException {
            if (this.f != -1) {
                a.this.c.c();
            }
            try {
                this.f = a.this.c.i();
                String trim = a.this.c.c().trim();
                if (this.f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + trim + "\"");
                }
                if (this.f == 0) {
                    this.g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.a.i(), this.e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (j < 0) {
                a70.p(vxd.l(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.b) {
                a70.r("closed");
                return 0L;
            }
            if (!this.g) {
                return -1L;
            }
            long j2 = this.f;
            if (j2 == 0 || j2 == -1) {
                d();
                if (!this.g) {
                    return -1L;
                }
            }
            long b = super.b(cVar, Math.min(j, this.f));
            if (b != -1) {
                this.f -= b;
                return b;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.b = true;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class e implements r {
        private final i a;
        private boolean b;
        private long c;

        public e(long j) {
            this.a = new i(a.this.d.b());
            this.c = j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (this.b) {
                a70.r("closed");
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j);
            if (j <= this.c) {
                a.this.d.a(cVar, j);
                this.c -= j;
            } else {
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.c);
                throw new ProtocolException(x5n.m(j, " bytes but received ", sb));
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.a);
            a.this.e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.b) {
                return;
            }
            a.this.d.flush();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f extends b {
        private long e;

        public f(long j) throws IOException {
            super();
            this.e = j;
            if (j == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (j < 0) {
                a70.p(vxd.l(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.b) {
                a70.r("closed");
                return 0L;
            }
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long b = super.b(cVar, Math.min(j2, j));
            if (b == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j3 = this.e - b;
            this.e = j3;
            if (j3 == 0) {
                a(true, null);
            }
            return b;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.b = true;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g extends b {
        private boolean e;

        public g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (j < 0) {
                a70.p(vxd.l(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.b) {
                a70.r("closed");
                return 0L;
            }
            if (this.e) {
                return -1L;
            }
            long b = super.b(cVar, j);
            if (b != -1) {
                return b;
            }
            this.e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (!this.e) {
                a(false, null);
            }
            this.b = true;
        }
    }

    public a(v vVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.a = vVar;
        this.b = gVar;
        this.c = eVar;
        this.d = dVar;
    }

    private String e() throws IOException {
        String d2 = this.c.d(this.f);
        this.f -= d2.length();
        return d2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.b;
        gVar.f.responseBodyStart(gVar.e);
        String b2 = a0Var.b("Content-Type");
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(a0Var)) {
            return new h(b2, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) {
            return new h(b2, -1L, l.a(a(a0Var.s().g())));
        }
        long a = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var);
        return a != -1 ? new h(b2, a, l.a(b(a))) : new h(b2, -1L, l.a(d()));
    }

    public com.mbridge.msdk.thrid.okio.s b(long j) throws IOException {
        if (this.e == 4) {
            this.e = 5;
            return new f(j);
        }
        zzl.q(this.e, "state: ");
        return null;
    }

    public r c() {
        if (this.e == 1) {
            this.e = 2;
            return new c();
        }
        zzl.q(this.e, "state: ");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c c2 = this.b.c();
        if (c2 != null) {
            c2.d();
        }
    }

    public com.mbridge.msdk.thrid.okio.s d() throws IOException {
        if (this.e != 4) {
            zzl.q(this.e, "state: ");
            return null;
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.b;
        if (gVar == null) {
            a70.r("streamAllocation == null");
            return null;
        }
        this.e = 5;
        gVar.e();
        return new g();
    }

    public com.mbridge.msdk.thrid.okhttp.r f() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String e2 = e();
            if (e2.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.a.a(aVar, e2);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.d.flush();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public abstract class b implements com.mbridge.msdk.thrid.okio.s {
        protected final i a;
        protected boolean b;
        protected long c;

        private b() {
            this.a = new i(a.this.c.b());
            this.c = 0L;
        }

        public final void a(boolean z, IOException iOException) throws IOException {
            a aVar = a.this;
            int i = aVar.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                zzl.q(a.this.e, "state: ");
                return;
            }
            aVar.a(this.a);
            a aVar2 = a.this;
            aVar2.e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.b;
            if (gVar != null) {
                gVar.a(!z, aVar2, this.c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            try {
                long b = a.this.c.b(cVar, j);
                if (b <= 0) {
                    return b;
                }
                this.c += b;
                return b;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.a;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        a(yVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar, this.b.c().c().b().type()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public com.mbridge.msdk.thrid.okio.r a(y yVar, long j) {
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j != -1) {
            return a(j);
        }
        a70.r("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.d.flush();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.r rVar, String str) throws IOException {
        if (this.e == 0) {
            this.d.a(str).a("\r\n");
            int b2 = rVar.b();
            int i = 0;
            while (true) {
                com.mbridge.msdk.thrid.okio.d dVar = this.d;
                if (i < b2) {
                    dVar.a(rVar.a(i)).a(": ").a(rVar.b(i)).a("\r\n");
                    i++;
                } else {
                    dVar.a("\r\n");
                    this.e = 1;
                    return;
                }
            }
        } else {
            zzl.q(this.e, "state: ");
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z) throws IOException {
        int i = this.e;
        if (i != 1 && i != 3) {
            zzl.q(this.e, "state: ");
            return null;
        }
        try {
            k a = k.a(e());
            a0.a a2 = new a0.a().a(a.a).a(a.b).a(a.c).a(f());
            if (z && a.b == 100) {
                return null;
            }
            if (a.b == 100) {
                this.e = 3;
                return a2;
            }
            this.e = 4;
            return a2;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public com.mbridge.msdk.thrid.okio.r a(long j) {
        if (this.e == 1) {
            this.e = 2;
            return new e(j);
        }
        zzl.q(this.e, "state: ");
        return null;
    }

    public com.mbridge.msdk.thrid.okio.s a(s sVar) throws IOException {
        if (this.e == 4) {
            this.e = 5;
            return new d(sVar);
        }
        zzl.q(this.e, "state: ");
        return null;
    }

    public void a(i iVar) {
        t g2 = iVar.g();
        iVar.a(t.d);
        g2.a();
        g2.b();
    }
}
