package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class e8 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f17884a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17885b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17886c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17887d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f17888e;

    public abstract Spliterator b(Spliterator spliterator);

    public e8(Spliterator spliterator, long j, long j6) {
        this.f17884a = spliterator;
        this.f17885b = j6 < 0;
        this.f17887d = j6 >= 0 ? j6 : 0L;
        this.f17886c = 128;
        this.f17888e = new AtomicLong(j6 >= 0 ? j + j6 : j);
    }

    public e8(Spliterator spliterator, e8 e8Var) {
        this.f17884a = spliterator;
        this.f17885b = e8Var.f17885b;
        this.f17888e = e8Var.f17888e;
        this.f17887d = e8Var.f17887d;
        this.f17886c = e8Var.f17886c;
    }

    public final long a(long j) {
        long j6;
        boolean z5;
        long min;
        do {
            j6 = this.f17888e.get();
            z5 = this.f17885b;
            if (j6 != 0) {
                min = Math.min(j6, j);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z5) {
                    return j;
                }
                return 0L;
            }
        } while (!this.f17888e.compareAndSet(j6, j6 - min));
        if (z5) {
            return Math.max(j - min, 0L);
        }
        long j10 = this.f17887d;
        return j6 > j10 ? Math.max(min - (j6 - j10), 0L) : min;
    }

    public final d8 f() {
        if (this.f17888e.get() > 0) {
            return d8.MAYBE_MORE;
        }
        return this.f17885b ? d8.UNLIMITED : d8.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f17888e.get() == 0 || (trySplit = this.f17884a.trySplit()) == null) {
            return null;
        }
        return b(trySplit);
    }

    public final long estimateSize() {
        return this.f17884a.estimateSize();
    }

    public final int characteristics() {
        return this.f17884a.characteristics() & (-16465);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c1 m112trySplit() {
        return (j$.util.c1) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.w0 m114trySplit() {
        return (j$.util.w0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z0 m115trySplit() {
        return (j$.util.z0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.t0 m113trySplit() {
        return (j$.util.t0) trySplit();
    }
}
