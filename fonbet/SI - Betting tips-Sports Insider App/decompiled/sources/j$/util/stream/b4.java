package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class b4 implements s4, k5 {

    /* renamed from: a, reason: collision with root package name */
    public double f17810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f17811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f17812c;

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

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void n(Double d10) {
        x3.D(this, d10);
    }

    public b4(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        this.f17811b = d10;
        this.f17812c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        accept(((b4) s4Var).f17810a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f17810a = this.f17811b;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f17810a = this.f17812c.applyAsDouble(this.f17810a, d10);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f17810a);
    }
}
