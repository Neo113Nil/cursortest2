package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class j5 implements n5 {

    /* renamed from: a, reason: collision with root package name */
    public final n5 f17941a;

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

    public j5(n5 n5Var) {
        this.f17941a = (n5) Objects.requireNonNull(n5Var);
    }

    @Override // j$.util.stream.n5
    public void c(long j) {
        this.f17941a.c(j);
    }

    @Override // j$.util.stream.n5
    public void end() {
        this.f17941a.end();
    }

    @Override // j$.util.stream.n5
    public boolean e() {
        return this.f17941a.e();
    }
}
