package j$.util.stream;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class o1 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f18013b;

    public /* synthetic */ o1(v1 v1Var, int i5) {
        this.f18012a = i5;
        this.f18013b = v1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f18012a) {
            case 0:
                return new s1(this.f18013b);
            case 1:
                return new r1(this.f18013b);
            default:
                return new t1(this.f18013b);
        }
    }
}
