package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class x extends a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18139s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18140t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(b bVar, int i5, Object obj, int i10) {
        super(bVar, i5);
        this.f18139s = i10;
        this.f18140t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, DoubleConsumer doubleConsumer) {
        super(b0Var, 0);
        this.f18139s = 1;
        this.f18140t = doubleConsumer;
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f18139s) {
            case 0:
                return new w(this, n5Var);
            case 1:
                return new r(this, n5Var, 5);
            case 2:
                return new o(this, n5Var, 6);
            default:
                return new a5(this, n5Var);
        }
    }
}
