package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class c3 extends l2 implements a2 {
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

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        x3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.a2
    public final i2 build() {
        int i5 = this.f17965b;
        Object[] objArr = this.f17964a;
        if (i5 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f17965b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        Object[] objArr = this.f17964a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.f17965b = 0;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        int i5 = this.f17965b;
        Object[] objArr = this.f17964a;
        if (i5 < objArr.length) {
            this.f17965b = i5 + 1;
            objArr[i5] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.n5
    public final void end() {
        int i5 = this.f17965b;
        Object[] objArr = this.f17964a;
        if (i5 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f17965b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.l2
    public final String toString() {
        Object[] objArr = this.f17964a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f17965b), Arrays.toString(objArr));
    }
}
