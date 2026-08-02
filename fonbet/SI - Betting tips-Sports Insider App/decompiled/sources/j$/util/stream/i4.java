package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class i4 implements s4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17928a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f17930c;

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

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
    }

    public i4(BinaryOperator binaryOperator) {
        this.f17930c = binaryOperator;
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        i4 i4Var = (i4) s4Var;
        if (i4Var.f17928a) {
            return;
        }
        n(i4Var.f17929b);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f17928a = true;
        this.f17929b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        if (this.f17928a) {
            this.f17928a = false;
            this.f17929b = obj;
        } else {
            this.f17929b = this.f17930c.apply(this.f17929b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f17928a ? Optional.f17602b : new Optional(this.f17929b);
    }
}
