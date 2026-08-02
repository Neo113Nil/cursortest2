package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class x7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f18152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18153b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f18154c;

    /* renamed from: d, reason: collision with root package name */
    public long f18155d;

    /* renamed from: e, reason: collision with root package name */
    public long f18156e;

    public abstract Spliterator a(Spliterator spliterator, long j, long j6, long j10, long j11);

    public x7(Spliterator spliterator, long j, long j6, long j10, long j11) {
        this.f18154c = spliterator;
        this.f18152a = j;
        this.f18153b = j6;
        this.f18155d = j10;
        this.f18156e = j11;
    }

    public final Spliterator trySplit() {
        long j = this.f18156e;
        if (this.f18152a >= j || this.f18155d >= j) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f18154c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f18155d;
            long min = Math.min(estimateSize, this.f18153b);
            long j6 = this.f18152a;
            if (j6 >= min) {
                this.f18155d = min;
            } else {
                long j10 = this.f18153b;
                if (min >= j10) {
                    this.f18154c = trySplit;
                    this.f18156e = min;
                } else {
                    long j11 = this.f18155d;
                    if (j11 >= j6 && estimateSize <= j10) {
                        this.f18155d = min;
                        return trySplit;
                    }
                    this.f18155d = min;
                    return a(trySplit, j6, j10, j11, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.f18156e;
        long j6 = this.f18152a;
        if (j6 < j) {
            return j - Math.max(j6, this.f18155d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f18154c.characteristics();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c1 m116trySplit() {
        return (j$.util.c1) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.w0 m118trySplit() {
        return (j$.util.w0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z0 m119trySplit() {
        return (j$.util.z0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.t0 m117trySplit() {
        return (j$.util.t0) trySplit();
    }
}
