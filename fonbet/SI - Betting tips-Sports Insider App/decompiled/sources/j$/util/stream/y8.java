package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class y8 extends b9 implements IntConsumer, j$.util.w0 {

    /* renamed from: e, reason: collision with root package name */
    public int f18173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(Spliterator spliterator, int i5) {
        super(spliterator);
        this.f18174f = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(Spliterator spliterator, b9 b9Var, int i5) {
        super(spliterator, b9Var);
        this.f18174f = i5;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        this.f17818d = (this.f17818d + 1) & 63;
        this.f18173e = i5;
    }

    @Override // j$.util.stream.b9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18174f) {
            case 0:
                return new y8((j$.util.w0) spliterator, this, 0);
            default:
                return new y8((j$.util.w0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18174f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        switch (this.f18174f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.w0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f18174f) {
            case 0:
                boolean z5 = this.f17817c;
                Spliterator spliterator = this.f17815a;
                if (z5) {
                    this.f17817c = false;
                    boolean tryAdvance = ((j$.util.w0) spliterator).tryAdvance((IntConsumer) this);
                    if (tryAdvance && a()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.f18173e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    intConsumer.accept(this.f18173e);
                    return tryAdvance;
                }
                return ((j$.util.w0) spliterator).tryAdvance(intConsumer);
            default:
                if (this.f17817c && a() && ((j$.util.w0) this.f17815a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.f18173e);
                    throw null;
                }
                this.f17817c = false;
                return false;
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public j$.util.w0 trySplit() {
        switch (this.f18174f) {
            case 1:
                if (this.f17816b.get()) {
                    return null;
                }
                return (j$.util.w0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18174f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
