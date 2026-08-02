package t2;

import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: t2.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6408m0 extends M0 implements C0 {

    /* renamed from: o, reason: collision with root package name */
    public static final ByteBuffer f65421o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.common.a f65422e;

    /* renamed from: f, reason: collision with root package name */
    public final long f65423f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f65424g;

    /* renamed from: h, reason: collision with root package name */
    public final Queue f65425h;

    /* renamed from: i, reason: collision with root package name */
    public final Queue f65426i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f65427j;

    /* renamed from: k, reason: collision with root package name */
    public long f65428k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65429l;

    /* renamed from: m, reason: collision with root package name */
    public long f65430m;

    /* renamed from: n, reason: collision with root package name */
    public k1.f f65431n;

    public C6408m0(androidx.media3.common.a aVar, V0 v02, I0 i02, A0 a02, long j10) {
        super(aVar, i02);
        this.f65422e = aVar;
        this.f65423f = j10;
        this.f65424g = new AtomicLong();
        this.f65425h = new ConcurrentLinkedQueue();
        this.f65426i = new ConcurrentLinkedQueue();
        a02.c(v02);
    }

    @Override // t2.L0
    public boolean a() {
        k1.f fVar = (k1.f) AbstractC4134a.e(this.f65431n);
        this.f65431n = null;
        if (fVar.i()) {
            this.f65427j = true;
        } else {
            fVar.f54110f += this.f65428k + this.f65423f;
            this.f65426i.add(fVar);
        }
        if (!this.f65429l) {
            int size = this.f65425h.size() + this.f65426i.size();
            long capacity = this.f65430m + ((ByteBuffer) AbstractC4134a.e(fVar.f54108d)).capacity();
            this.f65430m = capacity;
            this.f65429l = size >= 10 && (size >= 200 || capacity >= 2097152);
        }
        return true;
    }

    @Override // t2.J0
    public void c(E e10, long j10, androidx.media3.common.a aVar, boolean z10) {
        this.f65428k = this.f65424g.get();
        this.f65424g.addAndGet(j10);
    }

    @Override // t2.L0
    public k1.f f() {
        if (this.f65431n == null) {
            k1.f fVar = (k1.f) this.f65425h.poll();
            this.f65431n = fVar;
            if (!this.f65429l) {
                if (fVar == null) {
                    k1.f fVar2 = new k1.f(2);
                    this.f65431n = fVar2;
                    fVar2.f54108d = f65421o;
                } else {
                    this.f65430m -= ((ByteBuffer) AbstractC4134a.e(fVar.f54108d)).capacity();
                }
            }
        }
        return this.f65431n;
    }

    @Override // t2.M0
    public k1.f l() {
        return (k1.f) this.f65426i.peek();
    }

    @Override // t2.M0
    public androidx.media3.common.a m() {
        return this.f65422e;
    }

    @Override // t2.M0
    public boolean n() {
        return this.f65427j && this.f65426i.isEmpty();
    }

    @Override // t2.M0
    public void r() {
        k1.f fVar = (k1.f) this.f65426i.remove();
        fVar.f();
        fVar.f54110f = 0L;
        this.f65425h.add(fVar);
    }

    @Override // t2.M0
    public void q() {
    }

    @Override // t2.M0
    public C0 k(E e10, androidx.media3.common.a aVar, int i10) {
        return this;
    }
}
