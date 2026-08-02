package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class z8 extends b9 implements LongConsumer, j$.util.z0 {

    /* renamed from: e, reason: collision with root package name */
    public long f18182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(Spliterator spliterator, int i5) {
        super(spliterator);
        this.f18183f = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(Spliterator spliterator, b9 b9Var, int i5) {
        super(spliterator, b9Var);
        this.f18183f = i5;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f17818d = (this.f17818d + 1) & 63;
        this.f18182e = j;
    }

    @Override // j$.util.stream.b9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18183f) {
            case 0:
                return new z8((j$.util.z0) spliterator, this, 0);
            default:
                return new z8((j$.util.z0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18183f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        switch (this.f18183f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.z0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f18183f) {
            case 0:
                boolean z5 = this.f17817c;
                Spliterator spliterator = this.f17815a;
                if (z5) {
                    this.f17817c = false;
                    boolean tryAdvance = ((j$.util.z0) spliterator).tryAdvance((LongConsumer) this);
                    if (tryAdvance && a()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f18182e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    longConsumer.accept(this.f18182e);
                    return tryAdvance;
                }
                return ((j$.util.z0) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f17817c && a() && ((j$.util.z0) this.f17815a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f18182e);
                    throw null;
                }
                this.f17817c = false;
                return false;
        }
    }

    @Override // j$.util.stream.b9, j$.util.Spliterator
    public j$.util.z0 trySplit() {
        switch (this.f18183f) {
            case 1:
                if (this.f17816b.get()) {
                    return null;
                }
                return (j$.util.z0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18183f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
