package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class g7 extends i7 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f17914c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    public g7(int i5) {
        this.f17914c = new int[i5];
    }

    @Override // j$.util.stream.i7
    public final void a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i5 = 0; i5 < j; i5++) {
            intConsumer.accept(this.f17914c[i5]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        int i10 = this.f17933b;
        this.f17933b = i10 + 1;
        this.f17914c[i10] = i5;
    }
}
