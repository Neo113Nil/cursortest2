package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class q0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f18044b;

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

    public q0(Consumer consumer, boolean z5) {
        super(z5);
        this.f18044b = consumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f18044b.n(obj);
    }
}
