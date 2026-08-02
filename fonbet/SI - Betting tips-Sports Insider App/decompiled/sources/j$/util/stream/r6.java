package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public class r6 extends x6 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.x6
    public final void p(Object obj, int i5, int i10, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i5 < i10) {
            doubleConsumer.accept(dArr[i5]);
            i5++;
        }
    }

    @Override // j$.util.stream.x6
    public final int q(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else {
            if (k8.f17956a) {
                k8.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.i((q6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.x6
    public final Object[] t() {
        return new double[8][];
    }

    @Override // j$.util.stream.x6
    public final Object newArray(int i5) {
        return new double[i5];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d10) {
        u();
        double[] dArr = (double[]) this.f18150e;
        int i5 = this.f17851b;
        this.f17851b = i5 + 1;
        dArr[i5] = d10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.t0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h1(spliterator);
    }

    @Override // j$.util.stream.x6, java.lang.Iterable, j$.util.stream.i2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.t0 spliterator() {
        return new q6(this, 0, this.f17852c, 0, this.f17851b);
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f17852c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f17852c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
