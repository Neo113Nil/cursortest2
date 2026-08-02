package e1;

import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f45495a;

    /* renamed from: b, reason: collision with root package name */
    public int f45496b;
    private long[] timestamps;
    private Object[] values;

    public P() {
        this(10);
    }

    public static Object[] f(int i10) {
        return new Object[i10];
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public final void b(long j10, Object obj) {
        int i10 = this.f45495a;
        int i11 = this.f45496b;
        Object[] objArr = this.values;
        int length = (i10 + i11) % objArr.length;
        this.timestamps[length] = j10;
        objArr[length] = obj;
        this.f45496b = i11 + 1;
    }

    public synchronized void c() {
        this.f45495a = 0;
        this.f45496b = 0;
        Arrays.fill(this.values, (Object) null);
    }

    public final void d(long j10) {
        if (this.f45496b > 0) {
            if (j10 <= this.timestamps[((this.f45495a + r0) - 1) % this.values.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.values.length;
        if (this.f45496b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] f10 = f(i10);
        int i11 = this.f45495a;
        int i12 = length - i11;
        System.arraycopy(this.timestamps, i11, jArr, 0, i12);
        System.arraycopy(this.values, this.f45495a, f10, 0, i12);
        int i13 = this.f45495a;
        if (i13 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i12, i13);
            System.arraycopy(this.values, 0, f10, i12, this.f45495a);
        }
        this.timestamps = jArr;
        this.values = f10;
        this.f45495a = 0;
    }

    public synchronized Object g(long j10) {
        return h(j10, false);
    }

    public final Object h(long j10, boolean z10) {
        Object obj = null;
        long j11 = LongCompanionObject.MAX_VALUE;
        while (this.f45496b > 0) {
            long j12 = j10 - this.timestamps[this.f45495a];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            obj = k();
            j11 = j12;
        }
        return obj;
    }

    public synchronized Object i() {
        return this.f45496b == 0 ? null : k();
    }

    public synchronized Object j(long j10) {
        return h(j10, true);
    }

    public final Object k() {
        AbstractC4134a.g(this.f45496b > 0);
        Object[] objArr = this.values;
        int i10 = this.f45495a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f45495a = (i10 + 1) % objArr.length;
        this.f45496b--;
        return obj;
    }

    public synchronized int l() {
        return this.f45496b;
    }

    public P(int i10) {
        this.timestamps = new long[i10];
        this.values = f(i10);
    }
}
