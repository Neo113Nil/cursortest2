package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class x8 extends b9 implements DoubleConsumer, j$.util.t0 {

    /* renamed from: e, reason: collision with root package name */
    public double f18157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(Spliterator spliterator, int i5) {
        super(spliterator);
        this.f18158f = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(Spliterator spliterator, b9 b9Var, int i5) {
        super(spliterator, b9Var);
        this.f18158f = i5;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f17818d = (this.f17818d + 1) & 63;
        this.f18157e = d10;
    }

    @Override // j$.util.stream.b9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18158f) {
            case 0:
                return new x8((j$.util.t0) spliterator, this, 0);
            default:
                return new x8((j$.util.t0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18158f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        switch (this.f18158f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.t0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f18158f) {
            case 0:
                boolean z5 = this.f17817c;
                Spliterator spliterator = this.f17815a;
                if (z5) {
                    this.f17817c = false;
                    boolean tryAdvance = ((j$.util.t0) spliterator).tryAdvance((DoubleConsumer) this);
                    if (tryAdvance && a()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f18157e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    doubleConsumer.accept(this.f18157e);
                    return tryAdvance;
                }
                return ((j$.util.t0) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f17817c && a() && ((j$.util.t0) this.f17815a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f18157e);
                    throw null;
                }
                this.f17817c = false;
                return false;
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public j$.util.t0 trySplit() {
        switch (this.f18158f) {
            case 1:
                if (this.f17816b.get()) {
                    return null;
                }
                return (j$.util.t0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18158f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
