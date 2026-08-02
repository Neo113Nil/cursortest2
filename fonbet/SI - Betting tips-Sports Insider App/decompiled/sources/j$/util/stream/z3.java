package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class z3 extends t4 implements s4, m5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f18175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f18176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f18177d;

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

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l6) {
        x3.H(this, l6);
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        this.f18091a = this.f18177d.apply(this.f18091a, ((z3) s4Var).f18091a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18091a = this.f18175b.get();
    }

    @Override // j$.util.stream.n5
    public final void accept(long j) {
        this.f18176c.accept(this.f18091a, j);
    }

    public z3(Supplier supplier, ObjLongConsumer objLongConsumer, q qVar) {
        this.f18175b = supplier;
        this.f18176c = objLongConsumer;
        this.f18177d = qVar;
    }
}
