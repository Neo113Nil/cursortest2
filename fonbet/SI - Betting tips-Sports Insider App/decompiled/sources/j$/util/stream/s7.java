package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class s7 extends v7 implements j$.util.t0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.stream.x7
    public final Spliterator a(Spliterator spliterator, long j, long j6, long j10, long j11) {
        return new s7((j$.util.t0) spliterator, j, j6, j10, j11);
    }

    @Override // j$.util.stream.v7
    public final Object b() {
        return new b2(1);
    }
}
