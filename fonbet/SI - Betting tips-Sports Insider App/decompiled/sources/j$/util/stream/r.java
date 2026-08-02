package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final class r extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(b bVar, n5 n5Var, int i5) {
        super(n5Var);
        this.f18057b = i5;
        this.f18058c = bVar;
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public void c(long j) {
        switch (this.f18057b) {
            case 4:
                this.f17912a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f18057b) {
            case 0:
                this.f17912a.accept((n5) ((DoubleFunction) ((s) this.f18058c).f18068t).apply(d10));
                return;
            case 1:
                ((t) this.f18058c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d10);
                throw null;
            case 2:
                ((u) this.f18058c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d10);
                throw null;
            case 3:
                ((v) this.f18058c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d10);
                throw null;
            case 4:
                ((t) this.f18058c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d10);
                throw null;
            default:
                ((DoubleConsumer) ((x) this.f18058c).f18140t).accept(d10);
                this.f17912a.accept(d10);
                return;
        }
    }
}
