package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class f1 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f17894b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.l0 f17895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f17896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, n5 n5Var) {
        super(n5Var);
        this.f17896d = g1Var;
        n5 n5Var2 = this.f17931a;
        Objects.requireNonNull(n5Var2);
        this.f17895c = new j$.util.l0(n5Var2, 1);
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        this.f17931a.c(-1L);
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        n1 n1Var = (n1) ((j$.util.p) this.f17896d.f17909t).apply(j);
        if (n1Var != null) {
            try {
                boolean z5 = this.f17894b;
                j$.util.l0 l0Var = this.f17895c;
                if (!z5) {
                    n1Var.sequential().forEach(l0Var);
                } else {
                    j$.util.z0 spliterator = n1Var.sequential().spliterator();
                    while (!this.f17931a.e() && spliterator.tryAdvance((LongConsumer) l0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    n1Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (n1Var != null) {
            n1Var.close();
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean e() {
        this.f17894b = true;
        return this.f17931a.e();
    }
}
