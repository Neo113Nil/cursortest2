package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class j6 extends d5 {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17942s;

    /* renamed from: t, reason: collision with root package name */
    public final Comparator f17943t;

    public j6(f5 f5Var) {
        super(f5Var, c7.q | c7.f17835o);
        this.f17942s = true;
        this.f17943t = j$.util.e.INSTANCE;
    }

    public j6(f5 f5Var, Comparator comparator) {
        super(f5Var, c7.q | c7.f17836p);
        this.f17942s = false;
        this.f17943t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (c7.SORTED.n(i5) && this.f17942s) {
            return n5Var;
        }
        if (c7.SIZED.n(i5)) {
            return new o6(n5Var, this.f17943t);
        }
        return new k6(n5Var, this.f17943t);
    }

    @Override // j$.util.stream.b
    public final i2 L0(x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        if (c7.SORTED.n(((b) x3Var).f17804m) && this.f17942s) {
            return x3Var.j0(spliterator, false, intFunction);
        }
        Object[] m6 = x3Var.j0(spliterator, true, intFunction).m(intFunction);
        Arrays.sort(m6, this.f17943t);
        return new l2(m6);
    }
}
