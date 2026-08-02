package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class v7 extends x7 implements j$.util.c1 {
    public abstract Object b();

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public v7(j$.util.c1 c1Var, long j, long j6) {
        super(c1Var, j, j6, 0L, Math.min(c1Var.estimateSize(), j6));
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        long j;
        Objects.requireNonNull(obj);
        long j6 = this.f18156e;
        long j10 = this.f18152a;
        if (j10 >= j6) {
            return false;
        }
        while (true) {
            j = this.f18155d;
            if (j10 <= j) {
                break;
            }
            ((j$.util.c1) this.f18154c).tryAdvance(b());
            this.f18155d++;
        }
        if (j >= this.f18156e) {
            return false;
        }
        this.f18155d = j + 1;
        return ((j$.util.c1) this.f18154c).tryAdvance(obj);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.f18156e;
        long j6 = this.f18152a;
        if (j6 >= j) {
            return;
        }
        long j10 = this.f18155d;
        if (j10 >= j) {
            return;
        }
        if (j10 >= j6 && ((j$.util.c1) this.f18154c).estimateSize() + j10 <= this.f18153b) {
            ((j$.util.c1) this.f18154c).forEachRemaining(obj);
            this.f18155d = this.f18156e;
            return;
        }
        while (j6 > this.f18155d) {
            ((j$.util.c1) this.f18154c).tryAdvance(b());
            this.f18155d++;
        }
        while (this.f18155d < this.f18156e) {
            ((j$.util.c1) this.f18154c).tryAdvance(obj);
            this.f18155d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
