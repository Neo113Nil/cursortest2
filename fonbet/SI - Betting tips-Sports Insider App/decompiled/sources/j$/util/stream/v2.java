package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class v2 extends u2 implements x1 {
    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i5) {
        x3.J();
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
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void n(Double d10) {
        x3.D(this, d10);
    }

    @Override // j$.util.stream.a2
    public final /* bridge */ /* synthetic */ i2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.x1, j$.util.stream.a2
    public final c2 build() {
        int i5 = this.f18100b;
        double[] dArr = this.f18099a;
        if (i5 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18100b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        double[] dArr = this.f18099a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.f18100b = 0;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i5 = this.f18100b;
        double[] dArr = this.f18099a;
        if (i5 < dArr.length) {
            this.f18100b = i5 + 1;
            dArr[i5] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void end() {
        int i5 = this.f18100b;
        double[] dArr = this.f18099a;
        if (i5 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18100b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.u2
    public final String toString() {
        double[] dArr = this.f18099a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f18100b), Arrays.toString(dArr));
    }
}
