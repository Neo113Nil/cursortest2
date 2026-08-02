package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class c8 extends e8 implements Spliterator, Consumer {

    /* renamed from: f, reason: collision with root package name */
    public Object f17847f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f17847f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (f() != d8.NO_MORE && this.f17884a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.n(this.f17847f);
                this.f17847f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        j7 j7Var = null;
        while (true) {
            d8 f6 = f();
            if (f6 == d8.NO_MORE) {
                return;
            }
            d8 d8Var = d8.MAYBE_MORE;
            Spliterator spliterator = this.f17884a;
            if (f6 == d8Var) {
                int i5 = this.f17886c;
                if (j7Var == null) {
                    j7Var = new j7(i5);
                } else {
                    j7Var.f17955a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(j7Var)) {
                    j++;
                    if (j >= i5) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long a7 = a(j);
                for (int i10 = 0; i10 < a7; i10++) {
                    consumer.n(j7Var.f17944b[i10]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.e8
    public final Spliterator b(Spliterator spliterator) {
        return new c8(spliterator, this);
    }
}
