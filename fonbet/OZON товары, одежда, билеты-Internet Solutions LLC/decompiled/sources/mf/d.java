package mf;

import I0.C3173b;
import We.E;
import We.F;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import We.Q;
import We.S;
import We.v;
import We.z;
import bf.AbstractC5657a;
import cf.C5822c;
import cf.C5824e;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;
import sf.InterfaceC9682h;
import sf.InterfaceC9683i;

/* loaded from: classes10.dex */
public final class d implements Q {

    /* renamed from: x, reason: collision with root package name */
    private static final List<F> f74760x = C7714v.a0(F.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name */
    private final String f74761a;

    /* renamed from: b, reason: collision with root package name */
    private C5824e f74762b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5657a f74763c;

    /* renamed from: d, reason: collision with root package name */
    private h f74764d;

    /* renamed from: e, reason: collision with root package name */
    private i f74765e;

    /* renamed from: f, reason: collision with root package name */
    private bf.c f74766f;

    /* renamed from: g, reason: collision with root package name */
    private String f74767g;

    /* renamed from: h, reason: collision with root package name */
    private cf.i f74768h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayDeque<C9684j> f74769i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<Object> f74770j;

    /* renamed from: k, reason: collision with root package name */
    private long f74771k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f74772l;

    /* renamed from: m, reason: collision with root package name */
    private int f74773m;

    /* renamed from: n, reason: collision with root package name */
    private String f74774n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f74775o;

    /* renamed from: p, reason: collision with root package name */
    private int f74776p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f74777q;

    /* renamed from: r, reason: collision with root package name */
    private final G f74778r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final S f74779s;

    /* renamed from: t, reason: collision with root package name */
    private final Random f74780t;

    /* renamed from: u, reason: collision with root package name */
    private final long f74781u;

    /* renamed from: v, reason: collision with root package name */
    private mf.f f74782v;

    /* renamed from: w, reason: collision with root package name */
    private long f74783w;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f74784a;

        /* renamed from: b, reason: collision with root package name */
        private final C9684j f74785b;

        public a(int i11, C9684j c9684j) {
            this.f74784a = i11;
            this.f74785b = c9684j;
        }

        public final int a() {
            return this.f74784a;
        }

        public final C9684j b() {
            return this.f74785b;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f74786a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C9684j f74787b;

        public b(int i11, @NotNull C9684j data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f74786a = i11;
            this.f74787b = data;
        }

        @NotNull
        public final C9684j a() {
            return this.f74787b;
        }

        public final int b() {
            return this.f74786a;
        }
    }

    public static abstract class c implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f74788a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final sf.G f74789b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final sf.F f74790c;

        public c(boolean z11, @NotNull sf.G source, @NotNull sf.F sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f74788a = z11;
            this.f74789b = source;
            this.f74790c = sink;
        }

        public final boolean c() {
            return this.f74788a;
        }

        @NotNull
        public final InterfaceC9682h d() {
            return this.f74790c;
        }

        @NotNull
        public final InterfaceC9683i j() {
            return this.f74789b;
        }
    }

    /* renamed from: mf.d$d, reason: collision with other inner class name */
    private final class C1272d extends AbstractC5657a {
        public C1272d() {
            super(d.this.f74767g + " writer", true);
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            d dVar = d.this;
            try {
                return dVar.t() ? 0L : -1L;
            } catch (IOException e11) {
                dVar.i(e11, null);
                return -1L;
            }
        }
    }

    public static final class e implements InterfaceC4866h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f74793b;

        e(G g10) {
            this.f74793b = g10;
        }

        @Override // We.InterfaceC4866h
        public final void onFailure(@NotNull InterfaceC4865g call, @NotNull IOException e11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e11, "e");
            d.this.i(e11, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
        
            if (r5 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
        
            r4 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
        
            if (r5 == null) goto L31;
         */
        @Override // We.InterfaceC4866h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResponse(@NotNull InterfaceC4865g call, @NotNull L response) {
            int intValue;
            boolean z11;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            C5822c o11 = response.o();
            try {
                d.this.g(response, o11);
                cf.i m11 = o11.m();
                z responseHeaders = response.r();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                int size = responseHeaders.size();
                int i11 = 0;
                int i12 = 0;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                Integer num = null;
                Integer num2 = null;
                while (i12 < size) {
                    if (kotlin.text.h.D(responseHeaders.e(i12), "Sec-WebSocket-Extensions", true)) {
                        String k11 = responseHeaders.k(i12);
                        boolean z16 = true;
                        int i13 = i11;
                        while (i13 < k11.length()) {
                            z zVar = responseHeaders;
                            int i14 = Ye.b.i(k11, ',', i13, i11, 4);
                            int h11 = Ye.b.h(k11, ';', i13, i14);
                            String D11 = Ye.b.D(i13, h11, k11);
                            int i15 = h11 + 1;
                            int i16 = size;
                            if (kotlin.text.h.D(D11, "permessage-deflate", z16)) {
                                if (z12) {
                                    z15 = true;
                                }
                                boolean z17 = z15;
                                while (i15 < i14) {
                                    int h12 = Ye.b.h(k11, ';', i15, i14);
                                    int h13 = Ye.b.h(k11, '=', i15, h12);
                                    String D12 = Ye.b.D(i15, h13, k11);
                                    String V11 = h13 < h12 ? kotlin.text.h.V(Ye.b.D(h13 + 1, h12, k11)) : null;
                                    int i17 = h12 + 1;
                                    if (kotlin.text.h.D(D12, "client_max_window_bits", true)) {
                                        if (num != null) {
                                            z17 = true;
                                        }
                                        Integer w02 = V11 != null ? kotlin.text.h.w0(V11) : null;
                                        num = w02;
                                    } else if (kotlin.text.h.D(D12, "client_no_context_takeover", true)) {
                                        boolean z18 = z13 ? true : z17;
                                        if (V11 != null) {
                                            z18 = true;
                                        }
                                        z13 = true;
                                        z17 = z18;
                                    } else if (kotlin.text.h.D(D12, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z17 = true;
                                        }
                                        Integer w03 = V11 != null ? kotlin.text.h.w0(V11) : null;
                                        num2 = w03;
                                    } else if (kotlin.text.h.D(D12, "server_no_context_takeover", true)) {
                                        if (z14) {
                                            z17 = true;
                                        }
                                        if (V11 != null) {
                                            z17 = true;
                                        }
                                        z14 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    i15 = i17;
                                }
                                z11 = true;
                                z15 = z17;
                                z12 = true;
                            } else {
                                z11 = true;
                                z15 = true;
                            }
                            z16 = z11;
                            responseHeaders = zVar;
                            size = i16;
                            i13 = i15;
                            i11 = 0;
                        }
                    }
                    i12++;
                    responseHeaders = responseHeaders;
                    size = size;
                    i11 = 0;
                }
                d.this.f74782v = new mf.f(z12, num, z13, num2, z14, z15);
                d.this.getClass();
                if (z15 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || 15 < intValue))) {
                    synchronized (d.this) {
                        d.this.f74770j.clear();
                        d.this.a(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    d.this.k(Ye.b.f34906g + " WebSocket " + this.f74793b.j().s(), m11);
                    d.this.j().onOpen(d.this, response);
                    d.this.l();
                } catch (Exception e11) {
                    d.this.i(e11, null);
                }
            } catch (IOException e12) {
                if (o11 != null) {
                    o11.a(-1L, true, true, null);
                }
                d.this.i(e12, response);
                Ye.b.e(response);
            }
        }
    }

    public static final class f extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f74794e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, d dVar) {
            super(str, true);
            this.f74794e = dVar;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            this.f74794e.cancel();
            return -1L;
        }
    }

    public d(@NotNull bf.e taskRunner, @NotNull G originalRequest, @NotNull S listener, @NotNull Random random, long j11, mf.f fVar, long j12) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f74778r = originalRequest;
        this.f74779s = listener;
        this.f74780t = random;
        this.f74781u = j11;
        this.f74782v = fVar;
        this.f74783w = j12;
        this.f74766f = taskRunner.h();
        this.f74769i = new ArrayDeque<>();
        this.f74770j = new ArrayDeque<>();
        this.f74773m = -1;
        if (!"GET".equals(originalRequest.h())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.h()).toString());
        }
        C9684j c9684j = C9684j.f98719d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f71690a;
        this.f74761a = C9684j.a.d(bArr).a();
    }

    private final void r() {
        byte[] bArr = Ye.b.f34900a;
        AbstractC5657a abstractC5657a = this.f74763c;
        if (abstractC5657a != null) {
            this.f74766f.j(abstractC5657a, 0L);
        }
    }

    private final synchronized boolean s(int i11, C9684j c9684j) {
        if (!this.f74775o && !this.f74772l) {
            if (this.f74771k + c9684j.g() > 16777216) {
                a(1001, null);
                return false;
            }
            this.f74771k += c9684j.g();
            this.f74770j.add(new b(i11, c9684j));
            r();
            return true;
        }
        return false;
    }

    @Override // We.Q
    public final boolean a(int i11, String str) {
        String str2;
        synchronized (this) {
            C9684j c9684j = null;
            try {
                if (i11 < 1000 || i11 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i11;
                } else if ((1004 > i11 || 1006 < i11) && (1015 > i11 || 2999 < i11)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i11 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    C9684j c9684j2 = C9684j.f98719d;
                    c9684j = C9684j.a.c(str);
                    if (c9684j.g() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f74775o && !this.f74772l) {
                    this.f74772l = true;
                    this.f74770j.add(new a(i11, c9684j));
                    r();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // We.Q
    public final boolean b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        C9684j c9684j = C9684j.f98719d;
        return s(1, C9684j.a.c(text));
    }

    @Override // We.Q
    public final boolean c(@NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return s(2, bytes);
    }

    @Override // We.Q
    public final void cancel() {
        C5824e c5824e = this.f74762b;
        Intrinsics.f(c5824e);
        c5824e.cancel();
    }

    public final void g(@NotNull L response, C5822c c5822c) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.m() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.m() + ' ' + response.w() + '\'');
        }
        String q11 = L.q(response, "Connection");
        if (!"Upgrade".equalsIgnoreCase(q11)) {
            throw new ProtocolException(C3173b.a('\'', "Expected 'Connection' header value 'Upgrade' but was '", q11));
        }
        String q12 = L.q(response, "Upgrade");
        if (!"websocket".equalsIgnoreCase(q12)) {
            throw new ProtocolException(C3173b.a('\'', "Expected 'Upgrade' header value 'websocket' but was '", q12));
        }
        String q13 = L.q(response, "Sec-WebSocket-Accept");
        C9684j c9684j = C9684j.f98719d;
        String a11 = C9684j.a.c(this.f74761a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d("SHA-1").a();
        if (Intrinsics.d(a11, q13)) {
            if (c5822c == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a11 + "' but was '" + q13 + '\'');
    }

    public final void h(@NotNull E client) {
        Intrinsics.checkNotNullParameter(client, "client");
        G g10 = this.f74778r;
        if (g10.d("Sec-WebSocket-Extensions") != null) {
            i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        client.getClass();
        E.a aVar = new E.a(client);
        aVar.j(v.NONE);
        aVar.V(f74760x);
        E e11 = new E(aVar);
        G.a aVar2 = new G.a(g10);
        aVar2.d("Upgrade", "websocket");
        aVar2.d("Connection", "Upgrade");
        aVar2.d("Sec-WebSocket-Key", this.f74761a);
        aVar2.d("Sec-WebSocket-Version", "13");
        aVar2.d("Sec-WebSocket-Extensions", "permessage-deflate");
        G b11 = aVar2.b();
        C5824e c5824e = new C5824e(e11, b11, true);
        this.f74762b = c5824e;
        c5824e.E0(new e(b11));
    }

    public final void i(@NotNull Exception e11, L l11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        synchronized (this) {
            if (this.f74775o) {
                return;
            }
            this.f74775o = true;
            cf.i iVar = this.f74768h;
            this.f74768h = null;
            h hVar = this.f74764d;
            this.f74764d = null;
            i iVar2 = this.f74765e;
            this.f74765e = null;
            this.f74766f.o();
            Unit unit = Unit.f71690a;
            try {
                this.f74779s.onFailure(this, e11, l11);
            } finally {
                if (iVar != null) {
                    Ye.b.e(iVar);
                }
                if (hVar != null) {
                    Ye.b.e(hVar);
                }
                if (iVar2 != null) {
                    Ye.b.e(iVar2);
                }
            }
        }
    }

    @NotNull
    public final S j() {
        return this.f74779s;
    }

    public final void k(@NotNull String name, @NotNull cf.i streams) throws IOException {
        Throwable th2;
        boolean z11;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        mf.f fVar = this.f74782v;
        Intrinsics.f(fVar);
        synchronized (this) {
            try {
                this.f74767g = name;
                this.f74768h = streams;
                boolean c11 = streams.c();
                InterfaceC9682h d11 = streams.d();
                Random random = this.f74780t;
                boolean z12 = fVar.f74797a;
                if (streams.c()) {
                    try {
                        z11 = fVar.f74799c;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    z11 = fVar.f74801e;
                }
                this.f74765e = new i(c11, d11, random, z12, z11, this.f74783w);
                this.f74763c = new C1272d();
                long j11 = this.f74781u;
                if (j11 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j11);
                    this.f74766f.j(new mf.e(name + " ping", nanos, this), nanos);
                }
                if (!this.f74770j.isEmpty()) {
                    r();
                }
                Unit unit = Unit.f71690a;
                this.f74764d = new h(streams.c(), streams.j(), this, fVar.f74797a, !streams.c() ? fVar.f74799c : fVar.f74801e);
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    public final void l() throws IOException {
        while (this.f74773m == -1) {
            h hVar = this.f74764d;
            Intrinsics.f(hVar);
            hVar.c();
        }
    }

    public final void m(int i11, @NotNull String reason) {
        cf.i iVar;
        h hVar;
        i iVar2;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (i11 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.f74773m != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f74773m = i11;
                this.f74774n = reason;
                iVar = null;
                if (this.f74772l && this.f74770j.isEmpty()) {
                    cf.i iVar3 = this.f74768h;
                    this.f74768h = null;
                    hVar = this.f74764d;
                    this.f74764d = null;
                    iVar2 = this.f74765e;
                    this.f74765e = null;
                    this.f74766f.o();
                    iVar = iVar3;
                } else {
                    hVar = null;
                    iVar2 = null;
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.f74779s.onClosing(this, i11, reason);
            if (iVar != null) {
                this.f74779s.onClosed(this, i11, reason);
            }
        } finally {
            if (iVar != null) {
                Ye.b.e(iVar);
            }
            if (hVar != null) {
                Ye.b.e(hVar);
            }
            if (iVar2 != null) {
                Ye.b.e(iVar2);
            }
        }
    }

    public final void n(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f74779s.onMessage(this, text);
    }

    public final void o(@NotNull C9684j bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f74779s.onMessage(this, bytes);
    }

    public final synchronized void p(@NotNull C9684j payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f74775o && (!this.f74772l || !this.f74770j.isEmpty())) {
                this.f74769i.add(payload);
                r();
            }
        } finally {
        }
    }

    public final synchronized void q(@NotNull C9684j payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f74777q = false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, cf.i] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, mf.h] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, mf.i] */
    public final boolean t() throws IOException {
        M m11 = new M();
        m11.f71787a = null;
        K k11 = new K();
        k11.f71785a = -1;
        M m12 = new M();
        m12.f71787a = null;
        M m13 = new M();
        m13.f71787a = null;
        M m14 = new M();
        m14.f71787a = null;
        M m15 = new M();
        m15.f71787a = null;
        synchronized (this) {
            try {
                if (this.f74775o) {
                    return false;
                }
                i iVar = this.f74765e;
                C9684j poll = this.f74769i.poll();
                if (poll == null) {
                    ?? poll2 = this.f74770j.poll();
                    m11.f71787a = poll2;
                    if (poll2 instanceof a) {
                        int i11 = this.f74773m;
                        k11.f71785a = i11;
                        m12.f71787a = this.f74774n;
                        if (i11 != -1) {
                            m13.f71787a = this.f74768h;
                            this.f74768h = null;
                            m14.f71787a = this.f74764d;
                            this.f74764d = null;
                            m15.f71787a = this.f74765e;
                            this.f74765e = null;
                            this.f74766f.o();
                        } else {
                            T t2 = m11.f71787a;
                            if (t2 == 0) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                            }
                            this.f74766f.j(new f(this.f74767g + " cancel", this), TimeUnit.MILLISECONDS.toNanos(60000L));
                        }
                    } else if (poll2 == 0) {
                        return false;
                    }
                }
                Unit unit = Unit.f71690a;
                try {
                    if (poll != null) {
                        Intrinsics.f(iVar);
                        iVar.m(poll);
                    } else {
                        T t11 = m11.f71787a;
                        if (t11 instanceof b) {
                            if (t11 == 0) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                            }
                            b bVar = (b) t11;
                            Intrinsics.f(iVar);
                            iVar.j(bVar.b(), bVar.a());
                            synchronized (this) {
                                this.f74771k -= bVar.a().g();
                            }
                        } else {
                            if (!(t11 instanceof a)) {
                                throw new AssertionError();
                            }
                            if (t11 == 0) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                            }
                            a aVar = (a) t11;
                            Intrinsics.f(iVar);
                            iVar.c(aVar.a(), aVar.b());
                            if (((c) m13.f71787a) != null) {
                                S s11 = this.f74779s;
                                int i12 = k11.f71785a;
                                String str = (String) m12.f71787a;
                                Intrinsics.f(str);
                                s11.onClosed(this, i12, str);
                            }
                        }
                    }
                    c cVar = (c) m13.f71787a;
                    if (cVar != null) {
                        Ye.b.e(cVar);
                    }
                    h hVar = (h) m14.f71787a;
                    if (hVar != null) {
                        Ye.b.e(hVar);
                    }
                    i iVar2 = (i) m15.f71787a;
                    if (iVar2 != null) {
                        Ye.b.e(iVar2);
                    }
                    return true;
                } catch (Throwable th2) {
                    c cVar2 = (c) m13.f71787a;
                    if (cVar2 != null) {
                        Ye.b.e(cVar2);
                    }
                    h hVar2 = (h) m14.f71787a;
                    if (hVar2 != null) {
                        Ye.b.e(hVar2);
                    }
                    i iVar3 = (i) m15.f71787a;
                    if (iVar3 != null) {
                        Ye.b.e(iVar3);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void u() {
        synchronized (this) {
            try {
                if (this.f74775o) {
                    return;
                }
                i iVar = this.f74765e;
                if (iVar != null) {
                    int i11 = this.f74777q ? this.f74776p : -1;
                    this.f74776p++;
                    this.f74777q = true;
                    Unit unit = Unit.f71690a;
                    if (i11 != -1) {
                        StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                        sb2.append(this.f74781u);
                        sb2.append("ms (after ");
                        i(new SocketTimeoutException(K00.b.e(i11 - 1, " successful ping/pongs)", sb2)), null);
                        return;
                    }
                    try {
                        iVar.k(C9684j.f98719d);
                    } catch (IOException e11) {
                        i(e11, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
