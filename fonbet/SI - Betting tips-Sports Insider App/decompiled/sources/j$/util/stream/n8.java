package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class n8 extends h5 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18008b;

    public n8(h6 h6Var, n5 n5Var) {
        super(n5Var);
        this.f18008b = true;
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        this.f17920a.c(-1L);
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i5) {
        if (this.f18008b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i5);
            throw null;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean e() {
        return !this.f18008b || this.f17920a.e();
    }
}
