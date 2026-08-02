package k3;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import k3.e;
import m3.N;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    private int f70418b;

    /* renamed from: c, reason: collision with root package name */
    private float f70419c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f70420d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private e.a f70421e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f70422f;

    /* renamed from: g, reason: collision with root package name */
    private e.a f70423g;

    /* renamed from: h, reason: collision with root package name */
    private e.a f70424h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f70425i;

    /* renamed from: j, reason: collision with root package name */
    private h f70426j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f70427k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f70428l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f70429m;

    /* renamed from: n, reason: collision with root package name */
    private long f70430n;

    /* renamed from: o, reason: collision with root package name */
    private long f70431o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f70432p;

    public i() {
        e.a aVar = e.a.f70383e;
        this.f70421e = aVar;
        this.f70422f = aVar;
        this.f70423g = aVar;
        this.f70424h = aVar;
        ByteBuffer byteBuffer = e.f70382a;
        this.f70427k = byteBuffer;
        this.f70428l = byteBuffer.asShortBuffer();
        this.f70429m = byteBuffer;
        this.f70418b = -1;
    }

    @Override // k3.e
    public final boolean a() {
        if (!this.f70432p) {
            return false;
        }
        h hVar = this.f70426j;
        return hVar == null || hVar.g() == 0;
    }

    @Override // k3.e
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            h hVar = this.f70426j;
            hVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f70430n += remaining;
            hVar.l(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // k3.e
    public final void c() {
        h hVar = this.f70426j;
        if (hVar != null) {
            hVar.k();
        }
        this.f70432p = true;
    }

    @Override // k3.e
    public final ByteBuffer d() {
        int g10;
        h hVar = this.f70426j;
        if (hVar != null && (g10 = hVar.g()) > 0) {
            if (this.f70427k.capacity() < g10) {
                ByteBuffer order = ByteBuffer.allocateDirect(g10).order(ByteOrder.nativeOrder());
                this.f70427k = order;
                this.f70428l = order.asShortBuffer();
            } else {
                this.f70427k.clear();
                this.f70428l.clear();
            }
            hVar.f(this.f70428l);
            this.f70431o += g10;
            this.f70427k.limit(g10);
            this.f70429m = this.f70427k;
        }
        ByteBuffer byteBuffer = this.f70429m;
        this.f70429m = e.f70382a;
        return byteBuffer;
    }

    @Override // k3.e
    public final e.a e(e.a aVar) throws e.b {
        if (aVar.f70386c != 2) {
            throw new e.b(aVar);
        }
        int i11 = this.f70418b;
        if (i11 == -1) {
            i11 = aVar.f70384a;
        }
        this.f70421e = aVar;
        e.a aVar2 = new e.a(i11, aVar.f70385b, 2);
        this.f70422f = aVar2;
        this.f70425i = true;
        return aVar2;
    }

    public final long f(long j11) {
        if (this.f70431o < 1024) {
            return (long) (this.f70419c * j11);
        }
        long j12 = this.f70430n;
        this.f70426j.getClass();
        long h11 = j12 - r2.h();
        int i11 = this.f70424h.f70384a;
        int i12 = this.f70423g.f70384a;
        return i11 == i12 ? N.Z(j11, h11, this.f70431o, RoundingMode.DOWN) : N.Z(j11, h11 * i11, this.f70431o * i12, RoundingMode.DOWN);
    }

    @Override // k3.e
    public final void flush() {
        if (isActive()) {
            e.a aVar = this.f70421e;
            this.f70423g = aVar;
            e.a aVar2 = this.f70422f;
            this.f70424h = aVar2;
            if (this.f70425i) {
                this.f70426j = new h(aVar.f70384a, aVar.f70385b, this.f70419c, this.f70420d, aVar2.f70384a);
            } else {
                h hVar = this.f70426j;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
        this.f70429m = e.f70382a;
        this.f70430n = 0L;
        this.f70431o = 0L;
        this.f70432p = false;
    }

    public final void g(float f7) {
        G10.a.c(f7 > 0.0f);
        if (this.f70420d != f7) {
            this.f70420d = f7;
            this.f70425i = true;
        }
    }

    public final void h(float f7) {
        G10.a.c(f7 > 0.0f);
        if (this.f70419c != f7) {
            this.f70419c = f7;
            this.f70425i = true;
        }
    }

    @Override // k3.e
    public final boolean isActive() {
        if (this.f70422f.f70384a != -1) {
            return Math.abs(this.f70419c - 1.0f) >= 1.0E-4f || Math.abs(this.f70420d - 1.0f) >= 1.0E-4f || this.f70422f.f70384a != this.f70421e.f70384a;
        }
        return false;
    }

    @Override // k3.e
    public final void reset() {
        this.f70419c = 1.0f;
        this.f70420d = 1.0f;
        e.a aVar = e.a.f70383e;
        this.f70421e = aVar;
        this.f70422f = aVar;
        this.f70423g = aVar;
        this.f70424h = aVar;
        ByteBuffer byteBuffer = e.f70382a;
        this.f70427k = byteBuffer;
        this.f70428l = byteBuffer.asShortBuffer();
        this.f70429m = byteBuffer;
        this.f70418b = -1;
        this.f70425i = false;
        this.f70426j = null;
        this.f70430n = 0L;
        this.f70431o = 0L;
        this.f70432p = false;
    }
}
