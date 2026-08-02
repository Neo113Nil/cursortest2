package c1;

import c1.p;
import e1.AbstractC4134a;
import e1.Z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class v implements p {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26817b;

    /* renamed from: c, reason: collision with root package name */
    public int f26818c;

    /* renamed from: d, reason: collision with root package name */
    public float f26819d;

    /* renamed from: e, reason: collision with root package name */
    public float f26820e;

    /* renamed from: f, reason: collision with root package name */
    public p.a f26821f;

    /* renamed from: g, reason: collision with root package name */
    public p.a f26822g;

    /* renamed from: h, reason: collision with root package name */
    public p.a f26823h;

    /* renamed from: i, reason: collision with root package name */
    public p.a f26824i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26825j;

    /* renamed from: k, reason: collision with root package name */
    public u f26826k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f26827l;

    /* renamed from: m, reason: collision with root package name */
    public ShortBuffer f26828m;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f26829n;

    /* renamed from: o, reason: collision with root package name */
    public long f26830o;

    /* renamed from: p, reason: collision with root package name */
    public long f26831p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26832q;

    public v() {
        this(false);
    }

    @Override // c1.p
    public ByteBuffer a() {
        int m10;
        u uVar = this.f26826k;
        if (uVar != null && (m10 = uVar.m()) > 0) {
            if (this.f26827l.capacity() < m10) {
                ByteBuffer order = ByteBuffer.allocateDirect(m10).order(ByteOrder.nativeOrder());
                this.f26827l = order;
                this.f26828m = order.asShortBuffer();
            } else {
                this.f26827l.clear();
                this.f26828m.clear();
            }
            uVar.l(this.f26828m);
            this.f26831p += m10;
            this.f26827l.limit(m10);
            this.f26829n = this.f26827l;
        }
        ByteBuffer byteBuffer = this.f26829n;
        this.f26829n = p.f26778a;
        return byteBuffer;
    }

    @Override // c1.p
    public boolean b() {
        if (!this.f26832q) {
            return false;
        }
        u uVar = this.f26826k;
        return uVar == null || uVar.m() == 0;
    }

    @Override // c1.p
    public p.a c(p.a aVar) {
        if (aVar.f26782c != 2) {
            throw new p.b(aVar);
        }
        int i10 = this.f26818c;
        if (i10 == -1) {
            i10 = aVar.f26780a;
        }
        this.f26821f = aVar;
        p.a aVar2 = new p.a(i10, aVar.f26781b, 2);
        this.f26822g = aVar2;
        this.f26825j = true;
        return aVar2;
    }

    @Override // c1.p
    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            u uVar = (u) AbstractC4134a.e(this.f26826k);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f26830o += remaining;
            uVar.v(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // c1.p
    public void e() {
        u uVar = this.f26826k;
        if (uVar != null) {
            uVar.u();
        }
        this.f26832q = true;
    }

    @Override // c1.p
    public long f(long j10) {
        return i(j10);
    }

    @Override // c1.p
    public void flush() {
        if (isActive()) {
            p.a aVar = this.f26821f;
            this.f26823h = aVar;
            p.a aVar2 = this.f26822g;
            this.f26824i = aVar2;
            if (this.f26825j) {
                this.f26826k = new u(aVar.f26780a, aVar.f26781b, this.f26819d, this.f26820e, aVar2.f26780a);
            } else {
                u uVar = this.f26826k;
                if (uVar != null) {
                    uVar.j();
                }
            }
        }
        this.f26829n = p.f26778a;
        this.f26830o = 0L;
        this.f26831p = 0L;
        this.f26832q = false;
    }

    public final boolean g() {
        return Math.abs(this.f26819d - 1.0f) < 1.0E-4f && Math.abs(this.f26820e - 1.0f) < 1.0E-4f && this.f26822g.f26780a == this.f26821f.f26780a;
    }

    public long h(long j10) {
        if (this.f26831p < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.f26819d * j10);
        }
        long n10 = this.f26830o - ((u) AbstractC4134a.e(this.f26826k)).n();
        int i10 = this.f26824i.f26780a;
        int i11 = this.f26823h.f26780a;
        return i10 == i11 ? Z.p1(j10, n10, this.f26831p) : Z.p1(j10, n10 * i10, this.f26831p * i11);
    }

    public long i(long j10) {
        if (this.f26831p < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j10 / this.f26819d);
        }
        long n10 = this.f26830o - ((u) AbstractC4134a.e(this.f26826k)).n();
        int i10 = this.f26824i.f26780a;
        int i11 = this.f26823h.f26780a;
        return i10 == i11 ? Z.p1(j10, this.f26831p, n10) : Z.p1(j10, this.f26831p * i11, n10 * i10);
    }

    @Override // c1.p
    public boolean isActive() {
        if (this.f26822g.f26780a != -1) {
            return this.f26817b || !g();
        }
        return false;
    }

    public void j(int i10) {
        AbstractC4134a.a(i10 == -1 || i10 > 0);
        this.f26818c = i10;
    }

    public void k(float f10) {
        AbstractC4134a.a(f10 > 0.0f);
        if (this.f26820e != f10) {
            this.f26820e = f10;
            this.f26825j = true;
        }
    }

    public void l(float f10) {
        AbstractC4134a.a(f10 > 0.0f);
        if (this.f26819d != f10) {
            this.f26819d = f10;
            this.f26825j = true;
        }
    }

    @Override // c1.p
    public void reset() {
        this.f26819d = 1.0f;
        this.f26820e = 1.0f;
        p.a aVar = p.a.f26779e;
        this.f26821f = aVar;
        this.f26822g = aVar;
        this.f26823h = aVar;
        this.f26824i = aVar;
        ByteBuffer byteBuffer = p.f26778a;
        this.f26827l = byteBuffer;
        this.f26828m = byteBuffer.asShortBuffer();
        this.f26829n = byteBuffer;
        this.f26818c = -1;
        this.f26825j = false;
        this.f26826k = null;
        this.f26830o = 0L;
        this.f26831p = 0L;
        this.f26832q = false;
    }

    public v(boolean z10) {
        this.f26819d = 1.0f;
        this.f26820e = 1.0f;
        p.a aVar = p.a.f26779e;
        this.f26821f = aVar;
        this.f26822g = aVar;
        this.f26823h = aVar;
        this.f26824i = aVar;
        ByteBuffer byteBuffer = p.f26778a;
        this.f26827l = byteBuffer;
        this.f26828m = byteBuffer.asShortBuffer();
        this.f26829n = byteBuffer;
        this.f26818c = -1;
        this.f26817b = z10;
    }
}
