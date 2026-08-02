package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class h4 extends t4 implements s4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiFunction f17918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f17919d;

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

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        this.f18091a = this.f17919d.apply(this.f18091a, ((h4) s4Var).f18091a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18091a = this.f17917b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f18091a = this.f17918c.apply(this.f18091a, obj);
    }

    public h4(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f17917b = obj;
        this.f17918c = biFunction;
        this.f17919d = binaryOperator;
    }
}
