package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class q6 extends w6 implements j$.util.t0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r6 f18054g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.stream.w6
    public final void a(int i5, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i5]);
    }

    @Override // j$.util.stream.w6
    public final j$.util.c1 b(Object obj, int i5, int i10) {
        double[] dArr = (double[]) obj;
        int i11 = i10 + i5;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i5, i11);
        return new j$.util.j1(dArr, i5, i11, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(r6 r6Var, int i5, int i10, int i11, int i12) {
        super(r6Var, i5, i10, i11, i12);
        this.f18054g = r6Var;
    }

    @Override // j$.util.stream.w6
    public final j$.util.c1 c(int i5, int i10, int i11, int i12) {
        return new q6(this.f18054g, i5, i10, i11, i12);
    }
}
