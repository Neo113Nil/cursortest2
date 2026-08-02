package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class r0 implements i8, j8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18059a;

    public /* synthetic */ void accept(double d10) {
        x3.C();
        throw null;
    }

    public /* synthetic */ void accept(int i5) {
        x3.J();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        x3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
    }

    public r0(boolean z5) {
        this.f18059a = z5;
    }

    @Override // j$.util.stream.i8
    public final int v() {
        if (this.f18059a) {
            return 0;
        }
        return c7.f17837r;
    }

    public final void a(x3 x3Var, Spliterator spliterator) {
        if (this.f18059a) {
            new s0(x3Var, spliterator, this).invoke();
        } else {
            new t0(x3Var, spliterator, x3Var.E0(this)).invoke();
        }
    }
}
