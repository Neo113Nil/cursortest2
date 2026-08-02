package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class w7 extends x7 implements Spliterator {
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

    public w7(Spliterator spliterator, long j, long j6) {
        super(spliterator, j, j6, 0L, Math.min(spliterator.estimateSize(), j6));
    }

    @Override // j$.util.stream.x7
    public final Spliterator a(Spliterator spliterator, long j, long j6, long j10, long j11) {
        return new w7(spliterator, j, j6, j10, j11);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j;
        Objects.requireNonNull(consumer);
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
            this.f18154c.tryAdvance(new s5(2));
            this.f18155d++;
        }
        if (j >= this.f18156e) {
            return false;
        }
        this.f18155d = j + 1;
        return this.f18154c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.f18156e;
        long j6 = this.f18152a;
        if (j6 >= j) {
            return;
        }
        long j10 = this.f18155d;
        if (j10 >= j) {
            return;
        }
        if (j10 >= j6 && this.f18154c.estimateSize() + j10 <= this.f18153b) {
            this.f18154c.forEachRemaining(consumer);
            this.f18155d = this.f18156e;
            return;
        }
        while (j6 > this.f18155d) {
            this.f18154c.tryAdvance(new s5(3));
            this.f18155d++;
        }
        while (this.f18155d < this.f18156e) {
            this.f18154c.tryAdvance(consumer);
            this.f18155d++;
        }
    }
}
