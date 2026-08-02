package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class w4 extends y4 implements m5 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l6) {
        x3.H(this, l6);
    }

    @Override // j$.util.stream.t4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18164b);
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        this.f18164b += ((y4) s4Var).f18164b;
    }

    @Override // j$.util.stream.y4, j$.util.stream.n5
    public final void accept(long j) {
        this.f18164b++;
    }
}
