package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class v6 extends x6 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.x6
    public final void p(Object obj, int i5, int i10, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i5 < i10) {
            longConsumer.accept(jArr[i5]);
            i5++;
        }
    }

    @Override // j$.util.stream.x6
    public final int q(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else {
            if (k8.f17956a) {
                k8.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.k((u6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.x6
    public final Object[] t() {
        return new long[8][];
    }

    @Override // j$.util.stream.x6
    public final Object newArray(int i5) {
        return new long[i5];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        u();
        long[] jArr = (long[]) this.f18150e;
        int i5 = this.f17851b;
        this.f17851b = i5 + 1;
        jArr[i5] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.z0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.x6, java.lang.Iterable, j$.util.stream.i2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.z0 spliterator() {
        return new u6(this, 0, this.f17852c, 0, this.f17851b);
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f17852c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f17852c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
