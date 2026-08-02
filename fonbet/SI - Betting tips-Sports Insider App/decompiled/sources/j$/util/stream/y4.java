package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class y4 extends t4 implements s4 {

    /* renamed from: b, reason: collision with root package name */
    public long f18164b;

    public /* synthetic */ void accept(double d10) {
        x3.C();
        throw null;
    }

    public /* synthetic */ void accept(int i5) {
        x3.J();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
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

    @Override // j$.util.stream.n5
    public final void c(long j) {
        this.f18164b = 0L;
    }
}
