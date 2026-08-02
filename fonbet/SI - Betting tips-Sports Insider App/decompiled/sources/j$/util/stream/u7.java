package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class u7 extends v7 implements j$.util.z0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.x7
    public final Spliterator a(Spliterator spliterator, long j, long j6, long j10, long j11) {
        return new u7((j$.util.z0) spliterator, j, j6, j10, j11);
    }

    @Override // j$.util.stream.v7
    public final Object b() {
        return new f2(1);
    }
}
