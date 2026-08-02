package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class q7 implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f18056b;

    public /* synthetic */ q7(LongConsumer longConsumer, int i5) {
        this.f18055a = i5;
        this.f18056b = longConsumer;
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
        switch (this.f18055a) {
            case 0:
                x3.C();
                throw null;
            default:
                x3.C();
                throw null;
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i5) {
        switch (this.f18055a) {
            case 0:
                x3.J();
                throw null;
            default:
                x3.J();
                throw null;
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        switch (this.f18055a) {
            case 0:
                this.f18056b.accept(j);
                break;
            default:
                ((v6) this.f18056b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.f18055a) {
            case 0:
                l((Long) obj);
                break;
            default:
                l((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18055a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f18055a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
        int i5 = this.f18055a;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        switch (this.f18055a) {
        }
        return false;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
        int i5 = this.f18055a;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l6) {
        switch (this.f18055a) {
            case 0:
                x3.H(this, l6);
                break;
            default:
                x3.H(this, l6);
                break;
        }
    }
}
