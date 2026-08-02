package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class g0 extends k0 implements k5 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f17906c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f17907d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.k0, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        n(Double.valueOf(d10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f17946a) {
            return new j$.util.a0(((Double) this.f17947b).doubleValue());
        }
        return null;
    }

    static {
        d7 d7Var = d7.DOUBLE_VALUE;
        j$.time.x xVar = new j$.time.x(24);
        k kVar = new k(6);
        j$.util.a0 a0Var = j$.util.a0.f17612c;
        f17906c = new f0(true, d7Var, a0Var, xVar, kVar);
        f17907d = new f0(false, d7Var, a0Var, new j$.time.x(24), new k(6));
    }
}
