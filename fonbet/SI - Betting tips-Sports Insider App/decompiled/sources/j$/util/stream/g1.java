package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class g1 extends j1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17908s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f17909t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(b bVar, int i5, Object obj, int i10) {
        super(bVar, i5);
        this.f17908s = i10;
        this.f17909t = obj;
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f17908s) {
            case 0:
                return new f1(this, n5Var);
            case 1:
                return new d1(this, n5Var, 5);
            case 2:
                return new a5(this, n5Var);
            default:
                return new o(this, n5Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k1 k1Var, LongConsumer longConsumer) {
        super(k1Var, 0);
        this.f17908s = 1;
        this.f17909t = longConsumer;
    }
}
