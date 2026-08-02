package t2;

import b1.AbstractC2335D;
import c1.p;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6389d implements C0 {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f65281a;

    /* renamed from: b, reason: collision with root package name */
    public final Queue f65282b;

    /* renamed from: c, reason: collision with root package name */
    public final Queue f65283c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f65284d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f65285e;

    /* renamed from: f, reason: collision with root package name */
    public U0 f65286f;

    /* renamed from: g, reason: collision with root package name */
    public k1.f f65287g;

    /* renamed from: h, reason: collision with root package name */
    public c1.o f65288h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65289i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65290j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f65291k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65292l;

    /* renamed from: m, reason: collision with root package name */
    public long f65293m;

    /* renamed from: n, reason: collision with root package name */
    public long f65294n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f65295o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65296p;

    /* renamed from: t2.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final E f65297a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65298b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f65299c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f65300d;

        public a(E e10, long j10, androidx.media3.common.a aVar, boolean z10) {
            this.f65297a = e10;
            this.f65298b = j10;
            this.f65299c = aVar;
            this.f65300d = z10;
        }
    }

    public C6389d(p.a aVar, E e10, androidx.media3.common.a aVar2) {
        p.a aVar3 = new p.a(aVar2);
        AbstractC4134a.b(C6387c.h(aVar3), aVar3);
        this.f65282b = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i10 = 0; i10 < 10; i10++) {
            k1.f fVar = new k1.f(2);
            fVar.f54108d = order;
            this.f65282b.add(fVar);
        }
        this.f65283c = new ConcurrentLinkedQueue();
        this.f65284d = new ConcurrentLinkedQueue();
        this.f65286f = new U0(aVar3);
        c1.o l10 = l(e10, aVar2, aVar3, aVar);
        this.f65288h = l10;
        l10.b();
        p.a e11 = this.f65288h.e();
        this.f65281a = e11;
        AbstractC4134a.b(e11.f26782c == 2, e11);
        this.f65285e = new AtomicLong(-9223372036854775807L);
        this.f65293m = -9223372036854775807L;
    }

    public static c1.o l(E e10, androidx.media3.common.a aVar, p.a aVar2, p.a aVar3) {
        int i10;
        int i11;
        AbstractC3445z.a aVar4 = new AbstractC3445z.a();
        if (e10.f65016d && aVar != null && aVar.f20540l != null) {
            aVar4.a(new c1.w(new O0(aVar.f20540l)));
        }
        aVar4.k(e10.f65019g.f65396a);
        if (aVar3.f26780a != -1) {
            c1.v vVar = new c1.v();
            vVar.j(aVar3.f26780a);
            aVar4.a(vVar);
        }
        int i12 = aVar3.f26781b;
        if (i12 == 1 || i12 == 2) {
            c1.s sVar = new c1.s();
            sVar.m(c1.t.d(1, aVar3.f26781b));
            sVar.m(c1.t.d(2, aVar3.f26781b));
            aVar4.a(sVar);
        }
        c1.o oVar = new c1.o(aVar4.m());
        p.a a10 = oVar.a(aVar2);
        int i13 = aVar3.f26780a;
        if ((i13 == -1 || i13 == a10.f26780a) && (((i10 = aVar3.f26781b) == -1 || i10 == a10.f26781b) && ((i11 = aVar3.f26782c) == -1 || i11 == a10.f26782c))) {
            return oVar;
        }
        throw new p.b("Audio can not be modified to match downstream format", aVar2);
    }

    @Override // t2.L0
    public boolean a() {
        if (this.f65292l) {
            return false;
        }
        AbstractC4134a.g(this.f65284d.isEmpty());
        k1.f fVar = (k1.f) this.f65282b.remove();
        this.f65283c.add(fVar);
        this.f65285e.compareAndSet(-9223372036854775807L, fVar.f54110f);
        return true;
    }

    @Override // t2.J0
    public void c(E e10, long j10, androidx.media3.common.a aVar, boolean z10) {
        if (aVar == null) {
            AbstractC4134a.h(j10 != -9223372036854775807L, "Could not generate silent audio because duration is unknown.");
        } else {
            AbstractC4134a.g(AbstractC2335D.o(aVar.f20543o));
            p.a aVar2 = new p.a(aVar);
            AbstractC4134a.h(C6387c.h(aVar2), aVar2);
        }
        this.f65284d.add(new a(e10, j10, aVar, z10));
    }

    @Override // t2.L0
    public k1.f f() {
        if (this.f65292l || !this.f65284d.isEmpty()) {
            return null;
        }
        return (k1.f) this.f65282b.peek();
    }

    public final void i() {
        this.f65286f.a(this.f65293m - m());
        this.f65295o = true;
        if (this.f65296p) {
            this.f65291k = true;
        }
    }

    public final void j(k1.f fVar) {
        fVar.f();
        fVar.f54110f = 0L;
        this.f65282b.add(fVar);
    }

    public final void k() {
        p.a aVar;
        a aVar2 = (a) AbstractC4134a.i((a) this.f65284d.poll());
        this.f65294n = 0L;
        this.f65296p = aVar2.f65300d;
        this.f65295o = false;
        if (aVar2.f65299c != null) {
            this.f65293m = aVar2.f65298b;
            aVar = new p.a(aVar2.f65299c);
            this.f65286f = new U0(aVar);
        } else {
            if (aVar2.f65297a.f65019g.f65396a.isEmpty()) {
                this.f65293m = aVar2.f65297a.b(aVar2.f65298b);
            } else {
                this.f65293m = aVar2.f65298b;
            }
            p.a aVar3 = this.f65286f.f65175a;
            this.f65285e.compareAndSet(-9223372036854775807L, 0L);
            i();
            aVar = aVar3;
        }
        if (this.f65289i) {
            this.f65288h = l(aVar2.f65297a, aVar2.f65299c, aVar, this.f65281a);
        }
        this.f65288h.b();
        this.f65290j = false;
        this.f65289i = true;
    }

    public final long m() {
        return e1.Z.o1(this.f65294n / r2.f26783d, this.f65286f.f65175a.f26780a);
    }

    public final ByteBuffer n() {
        if (this.f65286f.c()) {
            return this.f65286f.b();
        }
        k1.f fVar = this.f65287g;
        if (fVar != null) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.i(fVar.f54108d);
            if (byteBuffer.hasRemaining()) {
                return byteBuffer;
            }
            j((k1.f) AbstractC4134a.i(this.f65287g));
            this.f65287g = null;
        }
        k1.f fVar2 = (k1.f) this.f65283c.poll();
        if (fVar2 == null) {
            if (!this.f65284d.isEmpty() && w()) {
                i();
            }
            return c1.p.f26778a;
        }
        ByteBuffer byteBuffer2 = fVar2.f54108d;
        this.f65290j = fVar2.i();
        if (byteBuffer2 != null && byteBuffer2.hasRemaining() && !this.f65290j) {
            this.f65287g = fVar2;
            this.f65294n += byteBuffer2.remaining();
            return byteBuffer2;
        }
        j(fVar2);
        if (this.f65290j && w()) {
            i();
        }
        return c1.p.f26778a;
    }

    public final boolean o() {
        if (this.f65286f.c()) {
            ByteBuffer b10 = this.f65286f.b();
            this.f65288h.j(b10);
            if (b10.hasRemaining()) {
                return false;
            }
            if (this.f65286f.c()) {
                return true;
            }
            this.f65288h.i();
            return false;
        }
        k1.f fVar = (k1.f) this.f65283c.peek();
        if (fVar == null) {
            if (!this.f65284d.isEmpty()) {
                if (w()) {
                    i();
                    return true;
                }
                this.f65288h.i();
            }
            return false;
        }
        if (fVar.i()) {
            if (w()) {
                i();
                j((k1.f) this.f65283c.remove());
                return true;
            }
            this.f65288h.i();
            this.f65290j = true;
            j((k1.f) this.f65283c.remove());
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(fVar.f54108d);
        long remaining = byteBuffer.remaining();
        this.f65288h.j(byteBuffer);
        this.f65294n += remaining - byteBuffer.remaining();
        if (byteBuffer.hasRemaining()) {
            return false;
        }
        j((k1.f) this.f65283c.remove());
        return true;
    }

    public ByteBuffer p() {
        ByteBuffer r10 = r();
        if (r10.hasRemaining()) {
            return r10;
        }
        if (!t() && !this.f65284d.isEmpty()) {
            k();
        }
        return c1.p.f26778a;
    }

    public p.a q() {
        return this.f65281a;
    }

    public final ByteBuffer r() {
        if (!this.f65289i) {
            return c1.p.f26778a;
        }
        if (!this.f65288h.g()) {
            return n();
        }
        while (o()) {
        }
        return this.f65288h.d();
    }

    public long s() {
        return this.f65285e.get();
    }

    public final boolean t() {
        ByteBuffer byteBuffer;
        if (!this.f65289i) {
            return false;
        }
        k1.f fVar = this.f65287g;
        if ((fVar == null || (byteBuffer = fVar.f54108d) == null || !byteBuffer.hasRemaining()) && !this.f65286f.c() && this.f65283c.isEmpty()) {
            return this.f65288h.g() && !this.f65288h.f();
        }
        return true;
    }

    public boolean u() {
        if (!t() && this.f65284d.isEmpty()) {
            return this.f65293m != -9223372036854775807L ? this.f65296p && (this.f65290j || this.f65291k) : this.f65290j || this.f65291k;
        }
        return false;
    }

    public void v() {
        this.f65288h.k();
    }

    public final boolean w() {
        if (this.f65295o) {
            return false;
        }
        long j10 = this.f65293m;
        return j10 != -9223372036854775807L && j10 - m() > 2000;
    }
}
