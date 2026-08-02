package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class e3 extends d3 implements y1 {
    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        x3.C();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        x3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        x3.F(this, num);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.a2
    public final /* bridge */ /* synthetic */ i2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.y1, j$.util.stream.a2
    public final e2 build() {
        int i5 = this.f17859b;
        int[] iArr = this.f17858a;
        if (i5 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f17859b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        int[] iArr = this.f17858a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.f17859b = 0;
    }

    @Override // j$.util.stream.n5
    public final void accept(int i5) {
        int i10 = this.f17859b;
        int[] iArr = this.f17858a;
        if (i10 < iArr.length) {
            this.f17859b = i10 + 1;
            iArr[i10] = i5;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void end() {
        int i5 = this.f17859b;
        int[] iArr = this.f17858a;
        if (i5 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f17859b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.d3
    public final String toString() {
        int[] iArr = this.f17858a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f17859b), Arrays.toString(iArr));
    }
}
