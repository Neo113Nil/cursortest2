package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f18117b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.d0 f18118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f18119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, n5 n5Var) {
        super(n5Var);
        this.f18119d = xVar;
        n5 n5Var2 = this.f17912a;
        Objects.requireNonNull(n5Var2);
        this.f18118c = new j$.util.d0(n5Var2, 1);
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        this.f17912a.c(-1L);
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        e0 e0Var = (e0) ((j$.util.p) this.f18119d.f18140t).apply(d10);
        if (e0Var != null) {
            try {
                boolean z5 = this.f18117b;
                j$.util.d0 d0Var = this.f18118c;
                if (!z5) {
                    e0Var.sequential().forEach(d0Var);
                } else {
                    j$.util.t0 spliterator = e0Var.sequential().spliterator();
                    while (!this.f17912a.e() && spliterator.tryAdvance((DoubleConsumer) d0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    e0Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (e0Var != null) {
            e0Var.close();
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final boolean e() {
        this.f18117b = true;
        return this.f17912a.e();
    }
}
