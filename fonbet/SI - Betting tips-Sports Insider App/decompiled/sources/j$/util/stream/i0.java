package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class i0 extends k0 implements m5 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f17926c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f17927d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.k0, j$.util.stream.n5
    public final void accept(long j) {
        n(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f17946a) {
            return new j$.util.c0(((Long) this.f17947b).longValue());
        }
        return null;
    }

    static {
        d7 d7Var = d7.LONG_VALUE;
        j$.time.x xVar = new j$.time.x(26);
        k kVar = new k(8);
        j$.util.c0 c0Var = j$.util.c0.f17622c;
        f17926c = new f0(true, d7Var, c0Var, xVar, kVar);
        f17927d = new f0(false, d7Var, c0Var, new j$.time.x(26), new k(8));
    }
}
