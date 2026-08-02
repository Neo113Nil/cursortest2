package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final class v0 extends h5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(b bVar, n5 n5Var, int i5) {
        super(n5Var);
        this.f18105b = i5;
        this.f18106c = bVar;
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public void c(long j) {
        switch (this.f18105b) {
            case 5:
                this.f17920a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i5) {
        switch (this.f18105b) {
            case 0:
                this.f17920a.accept((n5) ((IntFunction) ((s) this.f18106c).f18068t).apply(i5));
                return;
            case 1:
                ((IntConsumer) ((w0) this.f18106c).f18121t).accept(i5);
                this.f17920a.accept(i5);
                return;
            case 2:
                ((u) this.f18106c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i5);
                throw null;
            case 3:
                ((v) this.f18106c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i5);
                throw null;
            case 4:
                ((t) this.f18106c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i5);
                throw null;
            default:
                ((u) this.f18106c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i5);
                throw null;
        }
    }
}
