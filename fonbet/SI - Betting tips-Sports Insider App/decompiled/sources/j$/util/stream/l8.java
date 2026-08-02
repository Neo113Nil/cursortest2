package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class l8 extends d5 implements t8 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17980s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Predicate f17981t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(f5 f5Var, int i5, Predicate predicate, int i10) {
        super(f5Var, i5);
        this.f17980s = i10;
        this.f17981t = predicate;
    }

    @Override // j$.util.stream.b
    public final Spliterator M0(b bVar, Spliterator spliterator) {
        switch (this.f17980s) {
            case 0:
                return c7.ORDERED.n(bVar.f17804m) ? L0(bVar, spliterator, new u0(20)).spliterator() : new a9(bVar.F0(spliterator), this.f17981t, 1);
            default:
                return c7.ORDERED.n(bVar.f17804m) ? L0(bVar, spliterator, new u0(20)).spliterator() : new a9(bVar.F0(spliterator), this.f17981t, 0);
        }
    }

    @Override // j$.util.stream.b
    public final i2 L0(x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f17980s) {
            case 0:
                return (i2) new w8(this, x3Var, spliterator, intFunction).invoke();
            default:
                return (i2) new v8(this, x3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f17980s) {
            case 0:
                return new n(this, n5Var);
            default:
                return new m8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.t8
    public u8 h(a2 a2Var, boolean z5) {
        return new m8(this, a2Var, z5);
    }
}
