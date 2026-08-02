package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final class d1 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f17856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(b bVar, n5 n5Var, int i5) {
        super(n5Var);
        this.f17855b = i5;
        this.f17856c = bVar;
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public void c(long j) {
        switch (this.f17855b) {
            case 4:
                this.f17931a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        switch (this.f17855b) {
            case 0:
                this.f17931a.accept((n5) ((LongFunction) ((s) this.f17856c).f18068t).apply(j));
                return;
            case 1:
                ((v) this.f17856c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((u) this.f17856c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((t) this.f17856c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((v) this.f17856c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((g1) this.f17856c).f17909t).accept(j);
                this.f17931a.accept(j);
                return;
        }
    }
}
