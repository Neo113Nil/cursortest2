package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class w0 extends b1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18120s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18121t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(b bVar, int i5, Object obj, int i10) {
        super(bVar, i5);
        this.f18120s = i10;
        this.f18121t = obj;
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f18120s) {
            case 0:
                return new v0(this, n5Var, 1);
            case 1:
                return new y0(this, n5Var);
            case 2:
                return new o(this, n5Var, 4);
            default:
                return new a5(this, n5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c1 c1Var, IntConsumer intConsumer) {
        super(c1Var, 0);
        this.f18120s = 0;
        this.f18121t = intConsumer;
    }
}
