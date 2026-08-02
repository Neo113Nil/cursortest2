package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class a8 extends b8 implements j$.util.z0, LongConsumer {

    /* renamed from: f, reason: collision with root package name */
    public long f17796f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.e8
    public final Spliterator b(Spliterator spliterator) {
        return new a8((j$.util.z0) spliterator, this);
    }

    @Override // j$.util.stream.b8
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f17796f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f17796f = j;
    }

    @Override // j$.util.stream.b8
    public final i7 i(int i5) {
        return new h7(i5);
    }
}
