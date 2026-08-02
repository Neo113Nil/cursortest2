package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class r4 implements s4, m5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18061a;

    /* renamed from: b, reason: collision with root package name */
    public long f18062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f18063c;

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

    public r4(LongBinaryOperator longBinaryOperator) {
        this.f18063c = longBinaryOperator;
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        r4 r4Var = (r4) s4Var;
        if (r4Var.f18061a) {
            return;
        }
        accept(r4Var.f18062b);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18061a = true;
        this.f18062b = 0L;
    }

    @Override // j$.util.stream.n5
    public final void accept(long j) {
        if (this.f18061a) {
            this.f18061a = false;
            this.f18062b = j;
        } else {
            this.f18062b = this.f18063c.applyAsLong(this.f18062b, j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18061a ? j$.util.c0.f17622c : new j$.util.c0(this.f18062b);
    }
}
