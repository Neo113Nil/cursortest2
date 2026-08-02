package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class t3 extends CountedCompleter implements n5 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f18084a;

    /* renamed from: b, reason: collision with root package name */
    public final x3 f18085b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18086c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18087d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18088e;

    /* renamed from: f, reason: collision with root package name */
    public int f18089f;

    /* renamed from: g, reason: collision with root package name */
    public int f18090g;

    public abstract t3 a(Spliterator spliterator, long j, long j6);

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

    public t3(Spliterator spliterator, x3 x3Var, int i5) {
        this.f18084a = spliterator;
        this.f18085b = x3Var;
        this.f18086c = e.e(spliterator.estimateSize());
        this.f18087d = 0L;
        this.f18088e = i5;
    }

    public t3(t3 t3Var, Spliterator spliterator, long j, long j6, int i5) {
        super(t3Var);
        this.f18084a = spliterator;
        this.f18085b = t3Var.f18085b;
        this.f18086c = t3Var.f18086c;
        this.f18087d = j;
        this.f18088e = j6;
        if (j < 0 || j6 < 0 || (j + j6) - 1 >= i5) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j6), Integer.valueOf(i5)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18084a;
        t3 t3Var = this;
        while (spliterator.estimateSize() > t3Var.f18086c && (trySplit = spliterator.trySplit()) != null) {
            t3Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            t3 t3Var2 = t3Var;
            t3Var2.a(trySplit, t3Var.f18087d, estimateSize).fork();
            t3Var = t3Var2.a(spliterator, t3Var2.f18087d + estimateSize, t3Var2.f18088e - estimateSize);
        }
        t3 t3Var3 = t3Var;
        t3Var3.f18085b.D0(spliterator, t3Var3);
        t3Var3.propagateCompletion();
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        long j6 = this.f18088e;
        if (j > j6) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i5 = (int) this.f18087d;
        this.f18089f = i5;
        this.f18090g = i5 + ((int) j6);
    }
}
