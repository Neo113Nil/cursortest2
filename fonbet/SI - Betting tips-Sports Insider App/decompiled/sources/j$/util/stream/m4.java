package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class m4 implements s4, l5 {

    /* renamed from: a, reason: collision with root package name */
    public int f17988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f17990c;

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

    public m4(int i5, IntBinaryOperator intBinaryOperator) {
        this.f17989b = i5;
        this.f17990c = intBinaryOperator;
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        accept(((m4) s4Var).f17988a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f17988a = this.f17989b;
    }

    @Override // j$.util.stream.n5
    public final void accept(int i5) {
        this.f17988a = this.f17990c.applyAsInt(this.f17988a, i5);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f17988a);
    }
}
