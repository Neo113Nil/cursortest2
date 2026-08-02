package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class w1 extends c {
    public final j$.util.concurrent.r j;

    public w1(j$.util.concurrent.r rVar, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.j = rVar;
    }

    public w1(w1 w1Var, Spliterator spliterator) {
        super(w1Var, spliterator);
        this.j = w1Var.j;
    }

    @Override // j$.util.stream.e
    public final e c(Spliterator spliterator) {
        return new w1(this, spliterator);
    }

    @Override // j$.util.stream.e
    public final Object a() {
        x3 x3Var = this.f17867a;
        u1 u1Var = (u1) ((Supplier) this.j.f17684c).get();
        x3Var.D0(this.f17868b, u1Var);
        boolean z5 = u1Var.f18098b;
        if (z5 == ((v1) this.j.f17683b).f18109b) {
            Boolean valueOf = Boolean.valueOf(z5);
            AtomicReference atomicReference = this.f17819h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.c
    public final Object h() {
        return Boolean.valueOf(!((v1) this.j.f17683b).f18109b);
    }
}
