package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class h6 extends a1 implements t8 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17921s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(b bVar, int i5, int i10) {
        super(bVar, i5);
        this.f17921s = i10;
    }

    @Override // j$.util.stream.b
    public Spliterator M0(b bVar, Spliterator spliterator) {
        switch (this.f17921s) {
            case 1:
                return c7.ORDERED.n(bVar.f17804m) ? L0(bVar, spliterator, new s5(4)).spliterator() : new y8((j$.util.w0) bVar.F0(spliterator), 1);
            case 2:
                return c7.ORDERED.n(bVar.f17804m) ? L0(bVar, spliterator, new s5(5)).spliterator() : new y8((j$.util.w0) bVar.F0(spliterator), 0);
            default:
                return super.M0(bVar, spliterator);
        }
    }

    @Override // j$.util.stream.b
    public final i2 L0(x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f17921s) {
            case 0:
                if (c7.SORTED.n(((b) x3Var).f17804m)) {
                    return x3Var.j0(spliterator, false, intFunction);
                }
                int[] iArr = (int[]) ((e2) x3Var.j0(spliterator, true, intFunction)).b();
                Arrays.sort(iArr);
                return new d3(iArr);
            case 1:
                return (i2) new w8(this, x3Var, spliterator, intFunction).invoke();
            default:
                return (i2) new v8(this, x3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f17921s) {
            case 0:
                Objects.requireNonNull(n5Var);
                if (c7.SORTED.n(i5)) {
                    return n5Var;
                }
                return c7.SIZED.n(i5) ? new m6(n5Var) : new e6(n5Var);
            case 1:
                return new n8(this, n5Var);
            default:
                return new o8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.t8
    public u8 h(a2 a2Var, boolean z5) {
        return new o8(this, a2Var, z5);
    }
}
