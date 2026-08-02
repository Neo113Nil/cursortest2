package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class o4 implements s4, l5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18016a;

    /* renamed from: b, reason: collision with root package name */
    public int f18017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f18018c;

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

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
    }

    public o4(IntBinaryOperator intBinaryOperator) {
        this.f18018c = intBinaryOperator;
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        o4 o4Var = (o4) s4Var;
        if (o4Var.f18016a) {
            return;
        }
        accept(o4Var.f18017b);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18016a = true;
        this.f18017b = 0;
    }

    @Override // j$.util.stream.n5
    public final void accept(int i5) {
        if (this.f18016a) {
            this.f18016a = false;
            this.f18017b = i5;
        } else {
            this.f18017b = this.f18018c.applyAsInt(this.f18017b, i5);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18016a ? j$.util.b0.f17616c : new j$.util.b0(this.f18017b);
    }
}
