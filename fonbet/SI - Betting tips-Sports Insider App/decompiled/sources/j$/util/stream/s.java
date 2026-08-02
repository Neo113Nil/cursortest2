package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class s extends e5 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18067s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18068t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(b bVar, int i5, Object obj, int i10) {
        super(bVar, i5);
        this.f18067s = i10;
        this.f18068t = obj;
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f18067s) {
            case 0:
                return new r(this, n5Var, 0);
            case 1:
                return new v0(this, n5Var, 0);
            case 2:
                return new d1(this, n5Var, 0);
            case 3:
                return new o(this, n5Var, 1);
            case 4:
                return new o(this, n5Var, 2);
            case 5:
                return new o(this, n5Var, 3);
            default:
                return new n(this, n5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f5 f5Var, Consumer consumer) {
        super(f5Var, 0);
        this.f18067s = 3;
        this.f18068t = consumer;
    }
}
