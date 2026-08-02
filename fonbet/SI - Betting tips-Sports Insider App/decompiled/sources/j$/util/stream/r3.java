package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class r3 extends t3 implements m5 {

    /* renamed from: h, reason: collision with root package name */
    public final long[] f18060h;

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

    public r3(Spliterator spliterator, x3 x3Var, long[] jArr) {
        super(spliterator, x3Var, jArr.length);
        this.f18060h = jArr;
    }

    public r3(r3 r3Var, Spliterator spliterator, long j, long j6) {
        super(r3Var, spliterator, j, j6, r3Var.f18060h.length);
        this.f18060h = r3Var.f18060h;
    }

    @Override // j$.util.stream.t3
    public final t3 a(Spliterator spliterator, long j, long j6) {
        return new r3(this, spliterator, j, j6);
    }

    @Override // j$.util.stream.t3, j$.util.stream.n5
    public final void accept(long j) {
        int i5 = this.f18089f;
        if (i5 >= this.f18090g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18089f));
        }
        long[] jArr = this.f18060h;
        this.f18089f = i5 + 1;
        jArr[i5] = j;
    }
}
