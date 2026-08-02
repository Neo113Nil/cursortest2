package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* loaded from: classes2.dex */
public abstract class l3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public i2 f17966a;

    /* renamed from: b, reason: collision with root package name */
    public int f17967b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f17968c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f17969d;

    /* renamed from: e, reason: collision with root package name */
    public Deque f17970e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public l3(i2 i2Var) {
        this.f17966a = i2Var;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int o3 = this.f17966a.o();
        while (true) {
            o3--;
            if (o3 < this.f17967b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f17966a.a(o3));
        }
    }

    public static i2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            i2 i2Var = (i2) arrayDeque.pollFirst();
            if (i2Var == null) {
                return null;
            }
            if (i2Var.o() != 0) {
                for (int o3 = i2Var.o() - 1; o3 >= 0; o3--) {
                    arrayDeque.addFirst(i2Var.a(o3));
                }
            } else if (i2Var.count() > 0) {
                return i2Var;
            }
        }
    }

    public final boolean c() {
        if (this.f17966a == null) {
            return false;
        }
        if (this.f17969d != null) {
            return true;
        }
        Spliterator spliterator = this.f17968c;
        if (spliterator == null) {
            Deque b10 = b();
            this.f17970e = b10;
            i2 a7 = a(b10);
            if (a7 != null) {
                this.f17969d = a7.spliterator();
                return true;
            }
            this.f17966a = null;
            return false;
        }
        this.f17969d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        i2 i2Var = this.f17966a;
        if (i2Var == null || this.f17969d != null) {
            return null;
        }
        Spliterator spliterator = this.f17968c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f17967b < i2Var.o() - 1) {
            i2 i2Var2 = this.f17966a;
            int i5 = this.f17967b;
            this.f17967b = i5 + 1;
            return i2Var2.a(i5).spliterator();
        }
        i2 a7 = this.f17966a.a(this.f17967b);
        this.f17966a = a7;
        if (a7.o() == 0) {
            Spliterator spliterator2 = this.f17966a.spliterator();
            this.f17968c = spliterator2;
            return spliterator2.trySplit();
        }
        i2 i2Var3 = this.f17966a;
        this.f17967b = 1;
        return i2Var3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.f17966a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f17968c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i5 = this.f17967b; i5 < this.f17966a.o(); i5++) {
            j += this.f17966a.a(i5).count();
        }
        return j;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        return (j$.util.c1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.t0 trySplit() {
        return (j$.util.t0) trySplit();
    }
}
