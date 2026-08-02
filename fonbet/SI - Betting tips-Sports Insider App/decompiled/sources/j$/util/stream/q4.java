package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class q4 implements s4, m5 {

    /* renamed from: a, reason: collision with root package name */
    public long f18048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f18050c;

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

    public q4(long j, LongBinaryOperator longBinaryOperator) {
        this.f18049b = j;
        this.f18050c = longBinaryOperator;
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        accept(((q4) s4Var).f18048a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18048a = this.f18049b;
    }

    @Override // j$.util.stream.n5
    public final void accept(long j) {
        this.f18048a = this.f18050c.applyAsLong(this.f18048a, j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18048a);
    }
}
