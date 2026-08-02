package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class p4 extends t4 implements s4, l5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f18030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjIntConsumer f18031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f18032d;

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

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        this.f18091a = this.f18032d.apply(this.f18091a, ((p4) s4Var).f18091a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18091a = this.f18030b.get();
    }

    @Override // j$.util.stream.n5
    public final void accept(int i5) {
        this.f18031c.accept(this.f18091a, i5);
    }

    public p4(Supplier supplier, ObjIntConsumer objIntConsumer, q qVar) {
        this.f18030b = supplier;
        this.f18031c = objIntConsumer;
        this.f18032d = qVar;
    }
}
