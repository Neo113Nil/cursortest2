package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class f4 extends t4 implements s4, k5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f17898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f17899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f17900d;

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

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        this.f18091a = this.f17900d.apply(this.f18091a, ((f4) s4Var).f18091a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18091a = this.f17898b.get();
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f17899c.accept(this.f18091a, d10);
    }

    public f4(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, q qVar) {
        this.f17898b = supplier;
        this.f17899c = objDoubleConsumer;
        this.f17900d = qVar;
    }
}
