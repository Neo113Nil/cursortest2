package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public class t6 extends x6 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.x6
    public final void p(Object obj, int i5, int i10, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i5 < i10) {
            intConsumer.accept(iArr[i5]);
            i5++;
        }
    }

    @Override // j$.util.stream.x6
    public final int q(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g((IntConsumer) consumer);
        } else {
            if (k8.f17956a) {
                k8.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.j((s6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.x6
    public final Object[] t() {
        return new int[8][];
    }

    @Override // j$.util.stream.x6
    public final Object newArray(int i5) {
        return new int[i5];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i5) {
        u();
        int[] iArr = (int[]) this.f18150e;
        int i10 = this.f17851b;
        this.f17851b = i10 + 1;
        iArr[i10] = i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.w0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // j$.util.stream.x6, java.lang.Iterable, j$.util.stream.i2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.w0 spliterator() {
        return new s6(this, 0, this.f17852c, 0, this.f17851b);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f17852c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f17852c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
