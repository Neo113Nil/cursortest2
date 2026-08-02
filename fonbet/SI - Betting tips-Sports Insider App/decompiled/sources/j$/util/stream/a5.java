package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class a5 extends j5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17791b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17792c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f17794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(w0 w0Var, n5 n5Var) {
        super(n5Var);
        this.f17794e = w0Var;
        n5 n5Var2 = this.f17941a;
        Objects.requireNonNull(n5Var2);
        this.f17793d = new j$.util.h0(n5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(x xVar, n5 n5Var) {
        super(n5Var);
        this.f17794e = xVar;
        n5 n5Var2 = this.f17941a;
        Objects.requireNonNull(n5Var2);
        this.f17793d = new j$.util.d0(n5Var2, 1);
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        switch (this.f17791b) {
            case 0:
                this.f17941a.c(-1L);
                break;
            case 1:
                this.f17941a.c(-1L);
                break;
            default:
                this.f17941a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        switch (this.f17791b) {
            case 0:
                j$.util.l0 l0Var = (j$.util.l0) this.f17793d;
                n1 n1Var = (n1) ((j$.util.p) ((g1) this.f17794e).f17909t).apply((j$.util.p) obj);
                if (n1Var != null) {
                    try {
                        if (!this.f17792c) {
                            n1Var.sequential().forEach(l0Var);
                        } else {
                            j$.util.z0 spliterator = n1Var.sequential().spliterator();
                            while (!this.f17941a.e() && spliterator.tryAdvance((LongConsumer) l0Var)) {
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
                    return;
                }
                return;
            case 1:
                j$.util.h0 h0Var = (j$.util.h0) this.f17793d;
                IntStream intStream = (IntStream) ((j$.util.p) ((w0) this.f17794e).f18121t).apply((j$.util.p) obj);
                if (intStream != null) {
                    try {
                        if (!this.f17792c) {
                            intStream.sequential().forEach(h0Var);
                        } else {
                            j$.util.w0 spliterator2 = intStream.sequential().spliterator();
                            while (!this.f17941a.e() && spliterator2.tryAdvance((IntConsumer) h0Var)) {
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            intStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.d0 d0Var = (j$.util.d0) this.f17793d;
                e0 e0Var = (e0) ((j$.util.p) ((x) this.f17794e).f18140t).apply((j$.util.p) obj);
                if (e0Var != null) {
                    try {
                        if (!this.f17792c) {
                            e0Var.sequential().forEach(d0Var);
                        } else {
                            j$.util.t0 spliterator3 = e0Var.sequential().spliterator();
                            while (!this.f17941a.e() && spliterator3.tryAdvance((DoubleConsumer) d0Var)) {
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            e0Var.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                if (e0Var != null) {
                    e0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean e() {
        switch (this.f17791b) {
            case 0:
                this.f17792c = true;
                break;
            case 1:
                this.f17792c = true;
                break;
            default:
                this.f17792c = true;
                break;
        }
        return this.f17941a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(g1 g1Var, n5 n5Var) {
        super(n5Var);
        this.f17794e = g1Var;
        n5 n5Var2 = this.f17941a;
        Objects.requireNonNull(n5Var2);
        this.f17793d = new j$.util.l0(n5Var2, 1);
    }
}
