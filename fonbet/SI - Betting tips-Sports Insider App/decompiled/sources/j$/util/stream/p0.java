package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class p0 extends r0 implements m5 {

    /* renamed from: b, reason: collision with root package name */
    public final LongConsumer f18026b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l6) {
        x3.H(this, l6);
    }

    @Override // j$.util.stream.i8
    public final Object f(b bVar, Spliterator spliterator) {
        bVar.D0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.i8
    public final /* bridge */ /* synthetic */ Object i(x3 x3Var, Spliterator spliterator) {
        a(x3Var, spliterator);
        return null;
    }

    public p0(LongConsumer longConsumer, boolean z5) {
        super(z5);
        this.f18026b = longConsumer;
    }

    @Override // j$.util.stream.r0, j$.util.stream.n5
    public final void accept(long j) {
        this.f18026b.accept(j);
    }
}
