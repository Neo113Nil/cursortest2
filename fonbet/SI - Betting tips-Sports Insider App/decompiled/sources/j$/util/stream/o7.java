package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class o7 implements l5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f18025b;

    public /* synthetic */ o7(IntConsumer intConsumer, int i5) {
        this.f18024a = i5;
        this.f18025b = intConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        switch (this.f18024a) {
            case 0:
                x3.C();
                throw null;
            default:
                x3.C();
                throw null;
        }
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i5) {
        switch (this.f18024a) {
            case 0:
                this.f18025b.accept(i5);
                break;
            default:
                ((t6) this.f18025b).accept(i5);
                break;
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        switch (this.f18024a) {
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
        switch (this.f18024a) {
            case 0:
                d((Integer) obj);
                break;
            default:
                d((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18024a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f18024a) {
        }
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
        int i5 = this.f18024a;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        switch (this.f18024a) {
            case 0:
                x3.F(this, num);
                break;
            default:
                x3.F(this, num);
                break;
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        switch (this.f18024a) {
        }
        return false;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
        int i5 = this.f18024a;
    }
}
