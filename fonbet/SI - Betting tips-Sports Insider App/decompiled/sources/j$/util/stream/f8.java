package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class f8 implements n5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f17904b;

    public /* synthetic */ f8(Consumer consumer, int i5) {
        this.f17903a = i5;
        this.f17904b = consumer;
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
        switch (this.f17903a) {
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
        switch (this.f17903a) {
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
        switch (this.f17903a) {
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
    public final void n(Object obj) {
        switch (this.f17903a) {
            case 0:
                ((y6) this.f17904b).n(obj);
                break;
            default:
                this.f17904b.n(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f17903a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void c(long j) {
        int i5 = this.f17903a;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        switch (this.f17903a) {
        }
        return false;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void end() {
        int i5 = this.f17903a;
    }
}
