package B1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final long f533b;

    /* renamed from: c, reason: collision with root package name */
    public final long f534c;

    /* renamed from: d, reason: collision with root package name */
    public long f535d;

    public b(long j10, long j11) {
        this.f533b = j10;
        this.f534c = j11;
        f();
    }

    public final void c() {
        long j10 = this.f535d;
        if (j10 < this.f533b || j10 > this.f534c) {
            throw new NoSuchElementException();
        }
    }

    public final long d() {
        return this.f535d;
    }

    public boolean e() {
        return this.f535d > this.f534c;
    }

    public void f() {
        this.f535d = this.f533b - 1;
    }

    @Override // B1.n
    public boolean next() {
        this.f535d++;
        return !e();
    }
}
