package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class y0 extends h5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f18159b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.h0 f18160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f18161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(w0 w0Var, n5 n5Var) {
        super(n5Var);
        this.f18161d = w0Var;
        n5 n5Var2 = this.f17920a;
        Objects.requireNonNull(n5Var2);
        this.f18160c = new j$.util.h0(n5Var2, 1);
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        this.f17920a.c(-1L);
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i5) {
        IntStream intStream = (IntStream) ((m0) this.f18161d.f18121t).apply(i5);
        if (intStream != null) {
            try {
                boolean z5 = this.f18159b;
                j$.util.h0 h0Var = this.f18160c;
                if (!z5) {
                    intStream.sequential().forEach(h0Var);
                } else {
                    j$.util.w0 spliterator = intStream.sequential().spliterator();
                    while (!this.f17920a.e() && spliterator.tryAdvance((IntConsumer) h0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean e() {
        this.f18159b = true;
        return this.f17920a.e();
    }
}
