package c1;

import c1.p;
import e1.AbstractC4134a;
import e1.C4158z;
import e1.M;
import e1.Z;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class w implements p {

    /* renamed from: b, reason: collision with root package name */
    public final Object f26833b;

    /* renamed from: c, reason: collision with root package name */
    public final x f26834c;

    /* renamed from: d, reason: collision with root package name */
    public final y f26835d;

    /* renamed from: e, reason: collision with root package name */
    public final C4158z f26836e;

    /* renamed from: f, reason: collision with root package name */
    public final Queue f26837f;

    /* renamed from: g, reason: collision with root package name */
    public float f26838g;

    /* renamed from: h, reason: collision with root package name */
    public long f26839h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26840i;

    /* renamed from: j, reason: collision with root package name */
    public p.a f26841j;

    /* renamed from: k, reason: collision with root package name */
    public p.a f26842k;

    /* renamed from: l, reason: collision with root package name */
    public p.a f26843l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26844m;

    public w(x xVar) {
        p.a aVar = p.a.f26779e;
        this.f26842k = aVar;
        this.f26843l = aVar;
        this.f26841j = aVar;
        this.f26834c = xVar;
        Object obj = new Object();
        this.f26833b = obj;
        this.f26835d = new y(obj, true);
        this.f26836e = new C4158z();
        this.f26837f = new ArrayDeque();
        j(true);
    }

    public static long g(x xVar, int i10, long j10) {
        return Z.o1(h(xVar, i10, Z.s1(j10, i10, 1000000L, RoundingMode.HALF_EVEN)), i10);
    }

    public static long h(x xVar, int i10, long j10) {
        AbstractC4134a.a(xVar != null);
        AbstractC4134a.a(i10 > 0);
        long j11 = 0;
        AbstractC4134a.a(j10 >= 0);
        long j12 = 0;
        while (j11 < j10) {
            long b10 = M.b(xVar, j11, i10);
            if (b10 == -1 || b10 > j10) {
                b10 = j10;
            }
            float c10 = M.c(xVar, j11, i10);
            j12 += u.k(i10, i10, c10, c10, b10 - j11);
            j11 = b10;
        }
        return j12;
    }

    @Override // c1.p
    public ByteBuffer a() {
        return this.f26835d.a();
    }

    @Override // c1.p
    public boolean b() {
        return this.f26844m && this.f26835d.b();
    }

    @Override // c1.p
    public p.a c(p.a aVar) {
        this.f26842k = aVar;
        p.a c10 = this.f26835d.c(aVar);
        this.f26843l = c10;
        return c10;
    }

    @Override // c1.p
    public void d(ByteBuffer byteBuffer) {
        p.a aVar;
        int i10;
        synchronized (this.f26833b) {
            aVar = this.f26841j;
        }
        float c10 = M.c(this.f26834c, this.f26839h, aVar.f26780a);
        long b10 = M.b(this.f26834c, this.f26839h, aVar.f26780a);
        k(c10);
        int limit = byteBuffer.limit();
        if (b10 != -1) {
            i10 = (int) ((b10 - this.f26839h) * aVar.f26783d);
            byteBuffer.limit(Math.min(limit, byteBuffer.position() + i10));
        } else {
            i10 = -1;
        }
        long position = byteBuffer.position();
        this.f26835d.d(byteBuffer);
        if (i10 != -1 && byteBuffer.position() - position == i10) {
            this.f26835d.e();
            this.f26840i = true;
        }
        long position2 = byteBuffer.position() - position;
        AbstractC4134a.h(position2 % ((long) aVar.f26783d) == 0, "A frame was not queued completely.");
        this.f26839h += position2 / aVar.f26783d;
        byteBuffer.limit(limit);
    }

    @Override // c1.p
    public void e() {
        this.f26844m = true;
        if (this.f26840i) {
            return;
        }
        this.f26835d.e();
        this.f26840i = true;
    }

    @Override // c1.p
    public long f(long j10) {
        return M.a(this.f26834c, j10);
    }

    @Override // c1.p
    public void flush() {
        this.f26844m = false;
        j(false);
        synchronized (this.f26833b) {
            this.f26841j = this.f26842k;
            this.f26835d.flush();
            i();
        }
    }

    public final void i() {
        synchronized (this.f26833b) {
            try {
                if (this.f26841j.f26780a == -1) {
                    return;
                }
                if (this.f26837f.isEmpty()) {
                    return;
                }
                long f10 = this.f26836e.f();
                android.support.v4.media.session.b.a(this.f26837f.remove());
                g(this.f26834c, this.f26841j.f26780a, f10);
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c1.p
    public boolean isActive() {
        return !this.f26843l.equals(p.a.f26779e);
    }

    public final void j(boolean z10) {
        if (z10) {
            this.f26838g = 1.0f;
        }
        this.f26839h = 0L;
        this.f26840i = false;
    }

    public final void k(float f10) {
        if (f10 != this.f26838g) {
            this.f26838g = f10;
            this.f26835d.i(f10);
            this.f26835d.h(f10);
            this.f26835d.flush();
            this.f26840i = false;
        }
    }

    @Override // c1.p
    public void reset() {
        flush();
        p.a aVar = p.a.f26779e;
        this.f26842k = aVar;
        this.f26843l = aVar;
        synchronized (this.f26833b) {
            this.f26841j = aVar;
            this.f26836e.b();
            this.f26837f.clear();
        }
        j(true);
        this.f26835d.reset();
    }
}
