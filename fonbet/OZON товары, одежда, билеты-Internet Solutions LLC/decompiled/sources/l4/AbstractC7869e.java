package l4;

import java.util.ArrayDeque;
import k4.i;
import k4.j;
import k4.k;
import k4.m;
import k4.n;
import m3.N;

/* renamed from: l4.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC7869e implements j {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f72755a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<n> f72756b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f72757c;

    /* renamed from: d, reason: collision with root package name */
    private a f72758d;

    /* renamed from: e, reason: collision with root package name */
    private long f72759e;

    /* renamed from: f, reason: collision with root package name */
    private long f72760f;

    /* renamed from: g, reason: collision with root package name */
    private long f72761g;

    /* renamed from: l4.e$a */
    private static final class a extends m implements Comparable<a> {

        /* renamed from: j, reason: collision with root package name */
        private long f72762j;

        private a() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (i() != aVar2.i()) {
                return i() ? 1 : -1;
            }
            long j11 = this.f98186f - aVar2.f98186f;
            if (j11 == 0) {
                j11 = this.f72762j - aVar2.f72762j;
                if (j11 == 0) {
                    return 0;
                }
            }
            return j11 > 0 ? 1 : -1;
        }

        /* synthetic */ a(int i11) {
            this();
        }
    }

    /* renamed from: l4.e$b */
    private static final class b extends n {

        /* renamed from: f, reason: collision with root package name */
        private C7868d f72763f;

        public b(C7868d c7868d) {
            this.f72763f = c7868d;
        }

        @Override // s3.g
        public final void n() {
            this.f72763f.f72754a.m(this);
        }
    }

    public AbstractC7869e() {
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            this.f72755a.add(new a(i11));
        }
        this.f72756b = new ArrayDeque<>();
        while (i11 < 2) {
            this.f72756b.add(new b(new C7868d(this)));
            i11++;
        }
        this.f72757c = new ArrayDeque<>();
        this.f72761g = -9223372036854775807L;
    }

    @Override // s3.d
    public final void a(long j11) {
        this.f72761g = j11;
    }

    @Override // s3.d
    public final m b() throws s3.e {
        G10.a.h(this.f72758d == null);
        ArrayDeque<a> arrayDeque = this.f72755a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a pollFirst = arrayDeque.pollFirst();
        this.f72758d = pollFirst;
        return pollFirst;
    }

    @Override // k4.j
    public void d(long j11) {
        this.f72759e = j11;
    }

    @Override // s3.d
    public final void f(m mVar) throws s3.e {
        G10.a.c(mVar == this.f72758d);
        a aVar = (a) mVar;
        if (!aVar.i()) {
            long j11 = aVar.f98186f;
            if (j11 != Long.MIN_VALUE) {
                long j12 = this.f72761g;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    aVar.f();
                    this.f72755a.add(aVar);
                    this.f72758d = null;
                }
            }
        }
        long j13 = this.f72760f;
        this.f72760f = 1 + j13;
        aVar.f72762j = j13;
        this.f72757c.add(aVar);
        this.f72758d = null;
    }

    @Override // s3.d
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f72760f = 0L;
        this.f72759e = 0L;
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.f72757c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f72755a;
            if (isEmpty) {
                break;
            }
            a poll = arrayDeque2.poll();
            int i11 = N.f74289a;
            poll.f();
            arrayDeque.add(poll);
        }
        a aVar = this.f72758d;
        if (aVar != null) {
            aVar.f();
            arrayDeque.add(aVar);
            this.f72758d = null;
        }
    }

    protected abstract i g();

    protected abstract void h(m mVar);

    @Override // s3.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public n e() throws k {
        ArrayDeque<n> arrayDeque = this.f72756b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.f72757c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            a peek = arrayDeque2.peek();
            int i11 = N.f74289a;
            if (peek.f98186f > this.f72759e) {
                return null;
            }
            a poll = arrayDeque2.poll();
            boolean i12 = poll.i();
            ArrayDeque<a> arrayDeque3 = this.f72755a;
            if (i12) {
                n pollFirst = arrayDeque.pollFirst();
                pollFirst.e(4);
                poll.f();
                arrayDeque3.add(poll);
                return pollFirst;
            }
            h(poll);
            if (l()) {
                i g10 = g();
                n pollFirst2 = arrayDeque.pollFirst();
                pollFirst2.o(poll.f98186f, g10, Long.MAX_VALUE);
                poll.f();
                arrayDeque3.add(poll);
                return pollFirst2;
            }
            poll.f();
            arrayDeque3.add(poll);
        }
    }

    protected final n j() {
        return this.f72756b.pollFirst();
    }

    protected final long k() {
        return this.f72759e;
    }

    protected abstract boolean l();

    protected final void m(n nVar) {
        nVar.f();
        this.f72756b.add(nVar);
    }
}
