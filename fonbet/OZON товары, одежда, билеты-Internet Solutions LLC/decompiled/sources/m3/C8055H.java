package m3;

import java.util.Arrays;

/* renamed from: m3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8055H<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f74280a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    private V[] f74281b = (V[]) new Object[10];

    /* renamed from: c, reason: collision with root package name */
    private int f74282c;

    /* renamed from: d, reason: collision with root package name */
    private int f74283d;

    private void c() {
        int length = this.f74281b.length;
        if (this.f74283d < length) {
            return;
        }
        int i11 = length * 2;
        long[] jArr = new long[i11];
        V[] vArr = (V[]) new Object[i11];
        int i12 = this.f74282c;
        int i13 = length - i12;
        System.arraycopy(this.f74280a, i12, jArr, 0, i13);
        System.arraycopy(this.f74281b, this.f74282c, vArr, 0, i13);
        int i14 = this.f74282c;
        if (i14 > 0) {
            System.arraycopy(this.f74280a, 0, jArr, i13, i14);
            System.arraycopy(this.f74281b, 0, vArr, i13, this.f74282c);
        }
        this.f74280a = jArr;
        this.f74281b = vArr;
        this.f74282c = 0;
    }

    private V e(long j11, boolean z11) {
        V v11 = null;
        long j12 = Long.MAX_VALUE;
        while (this.f74283d > 0) {
            long j13 = j11 - this.f74280a[this.f74282c];
            if (j13 < 0 && (z11 || (-j13) >= j12)) {
                break;
            }
            v11 = h();
            j12 = j13;
        }
        return v11;
    }

    private V h() {
        G10.a.h(this.f74283d > 0);
        V[] vArr = this.f74281b;
        int i11 = this.f74282c;
        V v11 = vArr[i11];
        vArr[i11] = null;
        this.f74282c = (i11 + 1) % vArr.length;
        this.f74283d--;
        return v11;
    }

    public final synchronized void a(long j11, V v11) {
        if (this.f74283d > 0) {
            if (j11 <= this.f74280a[((this.f74282c + r0) - 1) % this.f74281b.length]) {
                b();
            }
        }
        c();
        int i11 = this.f74282c;
        int i12 = this.f74283d;
        V[] vArr = this.f74281b;
        int length = (i11 + i12) % vArr.length;
        this.f74280a[length] = j11;
        vArr[length] = v11;
        this.f74283d = i12 + 1;
    }

    public final synchronized void b() {
        this.f74282c = 0;
        this.f74283d = 0;
        Arrays.fill(this.f74281b, (Object) null);
    }

    public final synchronized V d(long j11) {
        return e(j11, false);
    }

    public final synchronized V f() {
        return this.f74283d == 0 ? null : h();
    }

    public final synchronized V g(long j11) {
        return e(j11, true);
    }

    public final synchronized int i() {
        return this.f74283d;
    }
}
