package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* loaded from: classes2.dex */
public abstract class e extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f17866g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    public final x3 f17867a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f17868b;

    /* renamed from: c, reason: collision with root package name */
    public long f17869c;

    /* renamed from: d, reason: collision with root package name */
    public e f17870d;

    /* renamed from: e, reason: collision with root package name */
    public e f17871e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17872f;

    public abstract Object a();

    public abstract e c(Spliterator spliterator);

    public e(x3 x3Var, Spliterator spliterator) {
        super(null);
        this.f17867a = x3Var;
        this.f17868b = spliterator;
        this.f17869c = 0L;
    }

    public e(e eVar, Spliterator spliterator) {
        super(eVar);
        this.f17868b = spliterator;
        this.f17867a = eVar.f17867a;
        this.f17869c = eVar.f17869c;
    }

    public static long e(long j) {
        long j6 = j / f17866g;
        if (j6 > 0) {
            return j6;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f17872f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f17872f = obj;
    }

    public final boolean b() {
        return ((e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f17868b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f17869c;
        if (j == 0) {
            j = e(estimateSize);
            this.f17869c = j;
        }
        boolean z5 = false;
        e eVar = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            e c2 = eVar.c(trySplit);
            eVar.f17870d = c2;
            e c8 = eVar.c(spliterator);
            eVar.f17871e = c8;
            eVar.setPendingCount(1);
            if (z5) {
                spliterator = trySplit;
                eVar = c2;
                c2 = c8;
            } else {
                eVar = c8;
            }
            z5 = !z5;
            c2.fork();
            estimateSize = spliterator.estimateSize();
        }
        eVar.d(eVar.a());
        eVar.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f17868b = null;
        this.f17871e = null;
        this.f17870d = null;
    }
}
