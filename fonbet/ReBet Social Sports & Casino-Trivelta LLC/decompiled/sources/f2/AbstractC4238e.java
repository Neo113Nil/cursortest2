package f2;

import e1.AbstractC4134a;
import e1.Z;
import e2.InterfaceC4169k;
import e2.l;
import e2.p;
import e2.q;
import f2.AbstractC4238e;
import java.util.ArrayDeque;
import k1.g;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: f2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4238e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f46364a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f46365b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f46366c;

    /* renamed from: d, reason: collision with root package name */
    public b f46367d;

    /* renamed from: e, reason: collision with root package name */
    public long f46368e;

    /* renamed from: f, reason: collision with root package name */
    public long f46369f;

    /* renamed from: g, reason: collision with root package name */
    public long f46370g;

    /* renamed from: f2.e$b */
    public static final class b extends p implements Comparable {

        /* renamed from: k, reason: collision with root package name */
        public long f46371k;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (i() != bVar.i()) {
                return i() ? 1 : -1;
            }
            long j10 = this.f54110f - bVar.f54110f;
            if (j10 == 0) {
                j10 = this.f46371k - bVar.f46371k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* renamed from: f2.e$c */
    public static final class c extends q {

        /* renamed from: g, reason: collision with root package name */
        public g.a f46372g;

        public c(g.a aVar) {
            this.f46372g = aVar;
        }

        @Override // k1.g
        public final void o() {
            this.f46372g.a(this);
        }
    }

    public AbstractC4238e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f46364a.add(new b());
        }
        this.f46365b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f46365b.add(new c(new g.a() { // from class: f2.d
                @Override // k1.g.a
                public final void a(g gVar) {
                    AbstractC4238e.this.p((AbstractC4238e.c) gVar);
                }
            }));
        }
        this.f46366c = new ArrayDeque();
        this.f46370g = -9223372036854775807L;
    }

    @Override // e2.l
    public void b(long j10) {
        this.f46368e = j10;
    }

    @Override // k1.d
    public final void e(long j10) {
        this.f46370g = j10;
    }

    @Override // k1.d
    public void flush() {
        this.f46369f = 0L;
        this.f46368e = 0L;
        while (!this.f46366c.isEmpty()) {
            o((b) Z.i((b) this.f46366c.poll()));
        }
        b bVar = this.f46367d;
        if (bVar != null) {
            o(bVar);
            this.f46367d = null;
        }
    }

    public abstract InterfaceC4169k g();

    public abstract void h(p pVar);

    @Override // k1.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p f() {
        AbstractC4134a.g(this.f46367d == null);
        if (this.f46364a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f46364a.pollFirst();
        this.f46367d = bVar;
        return bVar;
    }

    @Override // k1.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public q a() {
        if (this.f46365b.isEmpty()) {
            return null;
        }
        while (!this.f46366c.isEmpty() && ((b) Z.i((b) this.f46366c.peek())).f54110f <= this.f46368e) {
            b bVar = (b) Z.i((b) this.f46366c.poll());
            if (bVar.i()) {
                q qVar = (q) Z.i((q) this.f46365b.pollFirst());
                qVar.e(4);
                o(bVar);
                return qVar;
            }
            h(bVar);
            if (m()) {
                InterfaceC4169k g10 = g();
                q qVar2 = (q) Z.i((q) this.f46365b.pollFirst());
                qVar2.p(bVar.f54110f, g10, LongCompanionObject.MAX_VALUE);
                o(bVar);
                return qVar2;
            }
            o(bVar);
        }
        return null;
    }

    public final q k() {
        return (q) this.f46365b.pollFirst();
    }

    public final long l() {
        return this.f46368e;
    }

    public abstract boolean m();

    @Override // k1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void d(p pVar) {
        AbstractC4134a.a(pVar == this.f46367d);
        b bVar = (b) pVar;
        if (!bVar.i()) {
            long j10 = bVar.f54110f;
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.f46370g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    o(bVar);
                    this.f46367d = null;
                }
            }
        }
        long j12 = this.f46369f;
        this.f46369f = 1 + j12;
        bVar.f46371k = j12;
        this.f46366c.add(bVar);
        this.f46367d = null;
    }

    public final void o(b bVar) {
        bVar.f();
        this.f46364a.add(bVar);
    }

    public void p(q qVar) {
        qVar.f();
        this.f46365b.add(qVar);
    }

    @Override // k1.d
    public void release() {
    }
}
