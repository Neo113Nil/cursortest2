package io.sentry;

/* renamed from: io.sentry.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4856v2 implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC4856v2 abstractC4856v2) {
        return Long.compare(f(), abstractC4856v2.f());
    }

    public long b(AbstractC4856v2 abstractC4856v2) {
        return f() - abstractC4856v2.f();
    }

    public final boolean c(AbstractC4856v2 abstractC4856v2) {
        return b(abstractC4856v2) > 0;
    }

    public final boolean d(AbstractC4856v2 abstractC4856v2) {
        return b(abstractC4856v2) < 0;
    }

    public long e(AbstractC4856v2 abstractC4856v2) {
        return (abstractC4856v2 == null || compareTo(abstractC4856v2) >= 0) ? f() : abstractC4856v2.f();
    }

    public abstract long f();
}
