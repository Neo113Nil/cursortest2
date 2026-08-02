package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class q3 extends t3 implements l5 {

    /* renamed from: h, reason: collision with root package name */
    public final int[] f18047h;

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

    public q3(Spliterator spliterator, x3 x3Var, int[] iArr) {
        super(spliterator, x3Var, iArr.length);
        this.f18047h = iArr;
    }

    public q3(q3 q3Var, Spliterator spliterator, long j, long j6) {
        super(q3Var, spliterator, j, j6, q3Var.f18047h.length);
        this.f18047h = q3Var.f18047h;
    }

    @Override // j$.util.stream.t3
    public final t3 a(Spliterator spliterator, long j, long j6) {
        return new q3(this, spliterator, j, j6);
    }

    @Override // j$.util.stream.t3, j$.util.stream.n5
    public final void accept(int i5) {
        int i10 = this.f18089f;
        if (i10 >= this.f18090g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18089f));
        }
        int[] iArr = this.f18047h;
        this.f18089f = i10 + 1;
        iArr[i10] = i5;
    }
}
