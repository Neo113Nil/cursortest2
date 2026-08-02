package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class h0 extends k0 implements l5 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f17915c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f17916d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.k0, j$.util.stream.n5
    public final void accept(int i5) {
        n(Integer.valueOf(i5));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f17946a) {
            return new j$.util.b0(((Integer) this.f17947b).intValue());
        }
        return null;
    }

    static {
        d7 d7Var = d7.INT_VALUE;
        j$.time.x xVar = new j$.time.x(25);
        k kVar = new k(7);
        j$.util.b0 b0Var = j$.util.b0.f17616c;
        f17915c = new f0(true, d7Var, b0Var, xVar, kVar);
        f17916d = new f0(false, d7Var, b0Var, new j$.time.x(25), new k(7));
    }
}
