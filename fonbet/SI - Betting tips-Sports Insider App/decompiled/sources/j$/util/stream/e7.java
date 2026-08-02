package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class e7 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17875a;

    /* renamed from: b, reason: collision with root package name */
    public final b f17876b;

    /* renamed from: c, reason: collision with root package name */
    public Supplier f17877c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f17878d;

    /* renamed from: e, reason: collision with root package name */
    public n5 f17879e;

    /* renamed from: f, reason: collision with root package name */
    public BooleanSupplier f17880f;

    /* renamed from: g, reason: collision with root package name */
    public long f17881g;

    /* renamed from: h, reason: collision with root package name */
    public d f17882h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17883i;

    public abstract void d();

    public abstract e7 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    public e7(b bVar, Supplier supplier, boolean z5) {
        this.f17876b = bVar;
        this.f17877c = supplier;
        this.f17878d = null;
        this.f17875a = z5;
    }

    public e7(b bVar, Spliterator spliterator, boolean z5) {
        this.f17876b = bVar;
        this.f17877c = null;
        this.f17878d = spliterator;
        this.f17875a = z5;
    }

    public final void c() {
        if (this.f17878d == null) {
            this.f17878d = (Spliterator) this.f17877c.get();
            this.f17877c = null;
        }
    }

    public final boolean a() {
        d dVar = this.f17882h;
        if (dVar == null) {
            if (this.f17883i) {
                return false;
            }
            c();
            d();
            this.f17881g = 0L;
            this.f17879e.c(this.f17878d.getExactSizeIfKnown());
            return b();
        }
        long j = this.f17881g + 1;
        this.f17881g = j;
        boolean z5 = j < dVar.count();
        if (z5) {
            return z5;
        }
        this.f17881g = 0L;
        this.f17882h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f17875a || this.f17882h != null || this.f17883i) {
            return null;
        }
        c();
        Spliterator trySplit = this.f17878d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }

    public final boolean b() {
        while (this.f17882h.count() == 0) {
            if (this.f17879e.e() || !this.f17880f.getAsBoolean()) {
                if (this.f17883i) {
                    return false;
                }
                this.f17879e.end();
                this.f17883i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f17878d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (c7.SIZED.n(this.f17876b.f17804m)) {
            return this.f17878d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i5 = this.f17876b.f17804m;
        int i10 = i5 & ((~i5) >> 1) & c7.j & c7.f17827f;
        return (i10 & 64) != 0 ? (i10 & (-16449)) | (this.f17878d.characteristics() & 16448) : i10;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f17878d);
    }
}
