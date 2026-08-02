package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class o0 extends r0 implements l5 {

    /* renamed from: b, reason: collision with root package name */
    public final IntConsumer f18011b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        x3.F(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public o0(IntConsumer intConsumer, boolean z5) {
        super(z5);
        this.f18011b = intConsumer;
    }

    @Override // j$.util.stream.r0, j$.util.stream.n5
    public final void accept(int i5) {
        this.f18011b.accept(i5);
    }
}
