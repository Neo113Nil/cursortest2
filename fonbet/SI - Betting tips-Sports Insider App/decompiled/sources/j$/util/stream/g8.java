package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class g8 extends e7 {
    @Override // j$.util.stream.e7
    public final e7 e(Spliterator spliterator) {
        return new g8(this.f17876b, spliterator, this.f17875a);
    }

    @Override // j$.util.stream.e7
    public final void d() {
        y6 y6Var = new y6();
        this.f17882h = y6Var;
        Objects.requireNonNull(y6Var);
        this.f17879e = this.f17876b.E0(new f8(y6Var, 0));
        this.f17880f = new j$.util.p(11, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a7 = a();
        if (!a7) {
            return a7;
        }
        y6 y6Var = (y6) this.f17882h;
        long j = this.f17881g;
        if (y6Var.f17852c != 0) {
            if (j >= y6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i5 = 0; i5 <= y6Var.f17852c; i5++) {
                long j6 = y6Var.f17853d[i5];
                Object[] objArr = y6Var.f18171f[i5];
                if (j < objArr.length + j6) {
                    obj = objArr[(int) (j - j6)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < y6Var.f17851b) {
            obj = y6Var.f18170e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.n(obj);
        return a7;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f17882h == null && !this.f17883i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            f8 f8Var = new f8(consumer, 1);
            this.f17876b.D0(this.f17878d, f8Var);
            this.f17883i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
