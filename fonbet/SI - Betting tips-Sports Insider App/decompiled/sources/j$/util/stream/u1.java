package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class u1 implements n5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18097a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18098b;

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d10) {
        x3.C();
        throw null;
    }

    @Override // j$.util.stream.n5
    public /* synthetic */ void accept(int i5) {
        x3.J();
        throw null;
    }

    @Override // j$.util.stream.n5
    public /* synthetic */ void accept(long j) {
        x3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
    }

    public u1(v1 v1Var) {
        this.f18098b = !v1Var.f18109b;
    }

    @Override // j$.util.stream.n5
    public final boolean e() {
        return this.f18097a;
    }
}
