package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class w6 implements j$.util.c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f18128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18129b;

    /* renamed from: c, reason: collision with root package name */
    public int f18130c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18131d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x6 f18133f;

    public abstract void a(int i5, Object obj, Object obj2);

    public abstract j$.util.c1 b(Object obj, int i5, int i10);

    public abstract j$.util.c1 c(int i5, int i10, int i11, int i12);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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

    public w6(x6 x6Var, int i5, int i10, int i11, int i12) {
        this.f18133f = x6Var;
        this.f18128a = i5;
        this.f18129b = i10;
        this.f18130c = i11;
        this.f18131d = i12;
        Object[] objArr = x6Var.f18151f;
        this.f18132e = objArr == null ? x6Var.f18150e : objArr[i5];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i5 = this.f18128a;
        int i10 = this.f18131d;
        int i11 = this.f18129b;
        if (i5 == i11) {
            return i10 - this.f18130c;
        }
        long[] jArr = this.f18133f.f17853d;
        return ((jArr[i11] + i10) - jArr[i5]) - this.f18130c;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i5 = this.f18128a;
        int i10 = this.f18129b;
        if (i5 >= i10 && (i5 != i10 || this.f18130c >= this.f18131d)) {
            return false;
        }
        Object obj2 = this.f18132e;
        int i11 = this.f18130c;
        this.f18130c = i11 + 1;
        a(i11, obj2, obj);
        int i12 = this.f18130c;
        Object obj3 = this.f18132e;
        x6 x6Var = this.f18133f;
        if (i12 == x6Var.q(obj3)) {
            this.f18130c = 0;
            int i13 = this.f18128a + 1;
            this.f18128a = i13;
            Object[] objArr = x6Var.f18151f;
            if (objArr != null && i13 <= i10) {
                this.f18132e = objArr[i13];
            }
        }
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        x6 x6Var;
        Objects.requireNonNull(obj);
        int i5 = this.f18128a;
        int i10 = this.f18131d;
        int i11 = this.f18129b;
        if (i5 < i11 || (i5 == i11 && this.f18130c < i10)) {
            int i12 = this.f18130c;
            while (true) {
                x6Var = this.f18133f;
                if (i5 >= i11) {
                    break;
                }
                Object obj2 = x6Var.f18151f[i5];
                x6Var.p(obj2, i12, x6Var.q(obj2), obj);
                i5++;
                i12 = 0;
            }
            x6Var.p(this.f18128a == i11 ? this.f18132e : x6Var.f18151f[i11], i12, i10, obj);
            this.f18128a = i11;
            this.f18130c = i10;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        int i5 = this.f18128a;
        int i10 = this.f18129b;
        if (i5 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f18130c;
            x6 x6Var = this.f18133f;
            j$.util.c1 c2 = c(i5, i11, i12, x6Var.q(x6Var.f18151f[i11]));
            this.f18128a = i10;
            this.f18130c = 0;
            this.f18132e = x6Var.f18151f[i10];
            return c2;
        }
        if (i5 != i10) {
            return null;
        }
        int i13 = this.f18130c;
        int i14 = (this.f18131d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        j$.util.c1 b10 = b(this.f18132e, i13, i14);
        this.f18130c += i14;
        return b10;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.t0 trySplit() {
        return (j$.util.t0) trySplit();
    }
}
