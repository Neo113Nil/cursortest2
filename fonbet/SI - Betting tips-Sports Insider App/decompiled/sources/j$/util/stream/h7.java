package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class h7 extends i7 implements LongConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final long[] f17922c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    public h7(int i5) {
        this.f17922c = new long[i5];
    }

    @Override // j$.util.stream.i7
    public final void a(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i5 = 0; i5 < j; i5++) {
            longConsumer.accept(this.f17922c[i5]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i5 = this.f17933b;
        this.f17933b = i5 + 1;
        this.f17922c[i5] = j;
    }
}
