package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class y6 extends d implements Consumer, Iterable, j$.lang.a {

    /* renamed from: e, reason: collision with root package name */
    public Object[] f18170e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    public Object[][] f18171f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final void p(long j) {
        long length;
        int i5 = this.f17852c;
        if (i5 == 0) {
            length = this.f18170e.length;
        } else {
            length = this.f17853d[i5] + this.f18171f[i5].length;
        }
        if (j > length) {
            if (this.f18171f == null) {
                Object[][] objArr = new Object[8][];
                this.f18171f = objArr;
                this.f17853d = new long[8];
                objArr[0] = this.f18170e;
            }
            int i10 = i5 + 1;
            while (j > length) {
                Object[][] objArr2 = this.f18171f;
                if (i10 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f18171f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f17853d = Arrays.copyOf(this.f17853d, length2);
                }
                int i11 = this.f17850a;
                if (i10 != 0 && i10 != 1) {
                    i11 = Math.min((i11 + i10) - 1, 30);
                }
                int i12 = 1 << i11;
                this.f18171f[i10] = new Object[i12];
                long[] jArr = this.f17853d;
                jArr[i10] = jArr[i10 - 1] + r5[r7].length;
                length += i12;
                i10++;
            }
        }
    }

    @Override // j$.util.stream.d
    public final void clear() {
        Object[][] objArr = this.f18171f;
        if (objArr != null) {
            this.f18170e = objArr[0];
            int i5 = 0;
            while (true) {
                Object[] objArr2 = this.f18170e;
                if (i5 >= objArr2.length) {
                    break;
                }
                objArr2[i5] = null;
                i5++;
            }
            this.f18171f = null;
            this.f17853d = null;
        } else {
            for (int i10 = 0; i10 < this.f17851b; i10++) {
                this.f18170e[i10] = null;
            }
        }
        this.f17851b = 0;
        this.f17852c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.e1(spliterator);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public void forEach(Consumer consumer) {
        for (int i5 = 0; i5 < this.f17852c; i5++) {
            for (Object obj : this.f18171f[i5]) {
                consumer.accept(obj);
            }
        }
        for (int i10 = 0; i10 < this.f17851b; i10++) {
            consumer.accept(this.f18170e[i10]);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i5 = this.f17851b;
        Object[] objArr = this.f18170e;
        if (i5 == objArr.length) {
            if (this.f18171f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f18171f = objArr2;
                this.f17853d = new long[8];
                objArr2[0] = objArr;
            }
            int i10 = this.f17852c;
            int i11 = i10 + 1;
            Object[][] objArr3 = this.f18171f;
            if (i11 >= objArr3.length || objArr3[i11] == null) {
                if (i10 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i10].length + this.f17853d[i10];
                }
                p(length + 1);
            }
            this.f17851b = 0;
            int i12 = this.f17852c + 1;
            this.f17852c = i12;
            this.f18170e = this.f18171f[i12];
        }
        Object[] objArr4 = this.f18170e;
        int i13 = this.f17851b;
        this.f17851b = i13 + 1;
        objArr4[i13] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new j$.util.p(6, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new p6(this, 0, this.f17852c, 0, this.f17851b);
    }
}
