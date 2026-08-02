package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class l4 extends t4 implements s4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f17971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f17972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f17973d;

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
        this.f17973d.accept(this.f18091a, ((l4) s4Var).f18091a);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18091a = this.f17971b.get();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f17972c.accept(this.f18091a, obj);
    }

    public l4(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f17971b = supplier;
        this.f17972c = biConsumer;
        this.f17973d = biConsumer2;
    }
}
