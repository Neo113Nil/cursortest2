package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f17850a;

    /* renamed from: b, reason: collision with root package name */
    public int f17851b;

    /* renamed from: c, reason: collision with root package name */
    public int f17852c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f17853d;

    public abstract void clear();

    public d() {
        this.f17850a = 4;
    }

    public d(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i5);
        }
        this.f17850a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i5 - 1));
    }

    public final long count() {
        int i5 = this.f17852c;
        if (i5 == 0) {
            return this.f17851b;
        }
        return this.f17853d[i5] + this.f17851b;
    }
}
