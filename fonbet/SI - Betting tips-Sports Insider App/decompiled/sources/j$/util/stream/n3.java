package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class n3 extends m3 implements z1 {
    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        x3.C();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i5) {
        x3.J();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l6) {
        x3.H(this, l6);
    }

    @Override // j$.util.stream.a2
    public final /* bridge */ /* synthetic */ i2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.z1, j$.util.stream.a2
    public final g2 build() {
        int i5 = this.f17987b;
        long[] jArr = this.f17986a;
        if (i5 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f17987b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        long[] jArr = this.f17986a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.f17987b = 0;
    }

    @Override // j$.util.stream.n5
    public final void accept(long j) {
        int i5 = this.f17987b;
        long[] jArr = this.f17986a;
        if (i5 < jArr.length) {
            this.f17987b = i5 + 1;
            jArr[i5] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void end() {
        int i5 = this.f17987b;
        long[] jArr = this.f17986a;
        if (i5 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f17987b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.m3
    public final String toString() {
        long[] jArr = this.f17986a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f17987b), Arrays.toString(jArr));
    }
}
