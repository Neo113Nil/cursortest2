package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class z7 extends b8 implements j$.util.w0, IntConsumer {

    /* renamed from: f, reason: collision with root package name */
    public int f18181f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.e8
    public final Spliterator b(Spliterator spliterator) {
        return new z7((j$.util.w0) spliterator, this);
    }

    @Override // j$.util.stream.b8
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f18181f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        this.f18181f = i5;
    }

    @Override // j$.util.stream.b8
    public final i7 i(int i5) {
        return new g7(i5);
    }
}
