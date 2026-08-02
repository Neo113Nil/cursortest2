package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class v4 extends y4 implements l5 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        x3.F(this, num);
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
    public final void accept(int i5) {
        this.f18164b++;
    }
}
