package io.sentry;

/* renamed from: io.sentry.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4867x3 extends AbstractC4856v2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f52884a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52885b;

    public C4867x3() {
        this(System.currentTimeMillis(), System.nanoTime());
    }

    @Override // io.sentry.AbstractC4856v2, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC4856v2 abstractC4856v2) {
        if (!(abstractC4856v2 instanceof C4867x3)) {
            return super.compareTo(abstractC4856v2);
        }
        C4867x3 c4867x3 = (C4867x3) abstractC4856v2;
        long j10 = this.f52884a;
        long j11 = c4867x3.f52884a;
        return j10 == j11 ? Long.compare(this.f52885b, c4867x3.f52885b) : Long.compare(j10, j11);
    }

    @Override // io.sentry.AbstractC4856v2
    public long b(AbstractC4856v2 abstractC4856v2) {
        return abstractC4856v2 instanceof C4867x3 ? this.f52885b - ((C4867x3) abstractC4856v2).f52885b : super.b(abstractC4856v2);
    }

    @Override // io.sentry.AbstractC4856v2
    public long e(AbstractC4856v2 abstractC4856v2) {
        if (!(abstractC4856v2 instanceof C4867x3)) {
            return super.e(abstractC4856v2);
        }
        C4867x3 c4867x3 = (C4867x3) abstractC4856v2;
        return compareTo(abstractC4856v2) < 0 ? g(this, c4867x3) : g(c4867x3, this);
    }

    @Override // io.sentry.AbstractC4856v2
    public long f() {
        return AbstractC4779m.i(this.f52884a);
    }

    public final long g(C4867x3 c4867x3, C4867x3 c4867x32) {
        return c4867x3.f() + (c4867x32.f52885b - c4867x3.f52885b);
    }

    public C4867x3(long j10, long j11) {
        this.f52884a = j10;
        this.f52885b = j11;
    }
}
