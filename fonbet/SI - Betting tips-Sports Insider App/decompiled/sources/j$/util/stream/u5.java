package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class u5 extends i1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18101s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18102t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(k1 k1Var, int i5, long j, long j6) {
        super(k1Var, i5);
        this.f18101s = j;
        this.f18102t = j6;
    }

    @Override // j$.util.stream.b
    public final Spliterator M0(b bVar, Spliterator spliterator) {
        long k0 = bVar.k0(spliterator);
        if (k0 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.z0 z0Var = (j$.util.z0) bVar.F0(spliterator);
            long j = this.f18101s;
            return new u7(z0Var, j, x3.Z(j, this.f18102t));
        }
        if (c7.ORDERED.n(bVar.f17804m)) {
            return ((i2) new y5(this, bVar, spliterator, new s5(0), this.f18101s, this.f18102t).invoke()).spliterator();
        }
        j$.util.z0 z0Var2 = (j$.util.z0) bVar.F0(spliterator);
        long j6 = this.f18101s;
        long j10 = this.f18102t;
        if (j6 <= k0) {
            long j11 = k0 - j6;
            if (j10 >= 0) {
                j11 = Math.min(j10, j11);
            }
            j10 = j11;
            j6 = 0;
        }
        return new a8(z0Var2, j6, j10);
    }

    @Override // j$.util.stream.b
    public final i2 L0(x3 x3Var, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j6;
        long k0 = x3Var.k0(spliterator);
        if (k0 > 0 && spliterator.hasCharacteristics(16384)) {
            b bVar = (b) x3Var;
            while (bVar.f17803l > 0) {
                bVar = bVar.f17801i;
            }
            return x3.d0(x3Var, x3.X(bVar.K0(), spliterator, this.f18101s, this.f18102t), true);
        }
        if (!c7.ORDERED.n(((b) x3Var).f17804m)) {
            j$.util.z0 z0Var = (j$.util.z0) x3Var.F0(spliterator);
            long j10 = this.f18101s;
            long j11 = this.f18102t;
            if (j10 <= k0) {
                long j12 = k0 - j10;
                j = j11 >= 0 ? Math.min(j11, j12) : j12;
                j6 = 0;
            } else {
                j = j11;
                j6 = j10;
            }
            return x3.d0(this, new a8(z0Var, j6, j), true);
        }
        return (i2) new y5(this, x3Var, spliterator, intFunction, this.f18101s, this.f18102t).invoke();
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        return new t5(this, n5Var);
    }
}
