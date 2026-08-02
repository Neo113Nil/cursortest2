package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class r8 extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18066b;

    public r8(g6 g6Var, n5 n5Var) {
        super(n5Var);
        this.f18066b = true;
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        this.f17912a.c(-1L);
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        if (this.f18066b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d10);
            throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final boolean e() {
        return !this.f18066b || this.f17912a.e();
    }
}
