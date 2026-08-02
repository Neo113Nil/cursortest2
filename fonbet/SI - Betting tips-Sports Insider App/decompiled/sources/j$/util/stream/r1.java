package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class r1 extends u1 implements l5 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        x3.F(this, num);
    }

    @Override // j$.util.stream.u1, j$.util.stream.n5
    public final void accept(int i5) {
        if (this.f18097a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i5);
        throw null;
    }
}
