package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class p6 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public int f18035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18036b;

    /* renamed from: c, reason: collision with root package name */
    public int f18037c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18038d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f18039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y6 f18040f;

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

    public p6(y6 y6Var, int i5, int i10, int i11, int i12) {
        this.f18040f = y6Var;
        this.f18035a = i5;
        this.f18036b = i10;
        this.f18037c = i11;
        this.f18038d = i12;
        Object[][] objArr = y6Var.f18171f;
        this.f18039e = objArr == null ? y6Var.f18170e : objArr[i5];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i5 = this.f18035a;
        int i10 = this.f18038d;
        int i11 = this.f18036b;
        if (i5 == i11) {
            return i10 - this.f18037c;
        }
        long[] jArr = this.f18040f.f17853d;
        return ((jArr[i11] + i10) - jArr[i5]) - this.f18037c;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i5 = this.f18035a;
        int i10 = this.f18036b;
        if (i5 >= i10 && (i5 != i10 || this.f18037c >= this.f18038d)) {
            return false;
        }
        Object[] objArr = this.f18039e;
        int i11 = this.f18037c;
        this.f18037c = i11 + 1;
        consumer.accept(objArr[i11]);
        if (this.f18037c == this.f18039e.length) {
            this.f18037c = 0;
            int i12 = this.f18035a + 1;
            this.f18035a = i12;
            Object[][] objArr2 = this.f18040f.f18171f;
            if (objArr2 != null && i12 <= i10) {
                this.f18039e = objArr2[i12];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        y6 y6Var;
        Objects.requireNonNull(consumer);
        int i5 = this.f18035a;
        int i10 = this.f18038d;
        int i11 = this.f18036b;
        if (i5 < i11 || (i5 == i11 && this.f18037c < i10)) {
            int i12 = this.f18037c;
            while (true) {
                y6Var = this.f18040f;
                if (i5 >= i11) {
                    break;
                }
                Object[] objArr = y6Var.f18171f[i5];
                while (i12 < objArr.length) {
                    consumer.accept(objArr[i12]);
                    i12++;
                }
                i5++;
                i12 = 0;
            }
            Object[] objArr2 = this.f18035a == i11 ? this.f18039e : y6Var.f18171f[i11];
            while (i12 < i10) {
                consumer.accept(objArr2[i12]);
                i12++;
            }
            this.f18035a = i11;
            this.f18037c = i10;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i5 = this.f18035a;
        int i10 = this.f18036b;
        if (i5 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f18037c;
            y6 y6Var = this.f18040f;
            p6 p6Var = new p6(y6Var, i5, i11, i12, y6Var.f18171f[i11].length);
            this.f18035a = i10;
            this.f18037c = 0;
            this.f18039e = y6Var.f18171f[i10];
            return p6Var;
        }
        if (i5 != i10) {
            return null;
        }
        int i13 = this.f18037c;
        int i14 = (this.f18038d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        Object[] objArr = this.f18039e;
        int i15 = i13 + i14;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i13, i15);
        j$.util.i1 i1Var = new j$.util.i1(objArr, i13, i15, 1040);
        this.f18037c += i14;
        return i1Var;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
