package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m7 implements k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f17994b;

    public /* synthetic */ m7(DoubleConsumer doubleConsumer, int i5) {
        this.f17993a = i5;
        this.f17994b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f17993a) {
            case 0:
                this.f17994b.accept(d10);
                break;
            default:
                ((r6) this.f17994b).accept(d10);
                break;
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i5) {
        switch (this.f17993a) {
            case 0:
                x3.J();
                throw null;
            default:
                x3.J();
                throw null;
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        switch (this.f17993a) {
            case 0:
                x3.K();
                throw null;
            default:
                x3.K();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.f17993a) {
            case 0:
                n((Double) obj);
                break;
            default:
                n((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f17993a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f17993a) {
        }
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
        int i5 = this.f17993a;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        switch (this.f17993a) {
        }
        return false;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
        int i5 = this.f17993a;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void n(Double d10) {
        switch (this.f17993a) {
            case 0:
                x3.D(this, d10);
                break;
            default:
                x3.D(this, d10);
                break;
        }
    }
}
