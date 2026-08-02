package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class f0 implements i8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17890a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17891b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f17892c;

    /* renamed from: d, reason: collision with root package name */
    public final Supplier f17893d;

    public f0(boolean z5, d7 d7Var, Object obj, Predicate predicate, Supplier supplier) {
        this.f17890a = (z5 ? 0 : c7.f17837r) | c7.f17840u;
        this.f17891b = obj;
        this.f17892c = predicate;
        this.f17893d = supplier;
    }

    @Override // j$.util.stream.i8
    public final int v() {
        return this.f17890a;
    }

    @Override // j$.util.stream.i8
    public final Object f(b bVar, Spliterator spliterator) {
        j8 j8Var = (j8) this.f17893d.get();
        bVar.D0(spliterator, j8Var);
        Object obj = j8Var.get();
        return obj != null ? obj : this.f17891b;
    }

    @Override // j$.util.stream.i8
    public final Object i(x3 x3Var, Spliterator spliterator) {
        b bVar = (b) x3Var;
        return new l0(this, c7.ORDERED.n(bVar.f17804m), bVar, spliterator).invoke();
    }
}
