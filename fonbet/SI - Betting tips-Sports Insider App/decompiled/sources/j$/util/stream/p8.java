package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class p8 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18041b;

    public p8(i6 i6Var, n5 n5Var) {
        super(n5Var);
        this.f18041b = true;
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        this.f17931a.c(-1L);
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        if (this.f18041b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean e() {
        return !this.f18041b || this.f17931a.e();
    }
}
