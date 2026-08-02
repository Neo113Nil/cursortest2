package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfi {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    public zzfi(int i) {
        this.a = new long[10];
        this.b = new Object[10];
    }

    public final synchronized void a(Object obj, long j) {
        try {
            if (this.d > 0) {
                if (j <= this.a[((this.c + r0) - 1) % this.b.length]) {
                    synchronized (this) {
                        this.c = 0;
                        this.d = 0;
                        Arrays.fill(this.b, (Object) null);
                    }
                }
            }
            Object[] objArr = this.b;
            int length = objArr.length;
            if (this.d >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                objArr = new Object[i];
                int i2 = this.c;
                int i3 = length - i2;
                System.arraycopy(this.a, i2, jArr, 0, i3);
                System.arraycopy(this.b, this.c, objArr, 0, i3);
                int i4 = this.c;
                if (i4 > 0) {
                    System.arraycopy(this.a, 0, jArr, i3, i4);
                    System.arraycopy(this.b, 0, objArr, i3, this.c);
                }
                this.a = jArr;
                this.b = objArr;
                this.c = 0;
            }
            int i5 = this.c;
            int i6 = this.d;
            int length2 = (i5 + i6) % objArr.length;
            this.a[length2] = j;
            objArr[length2] = obj;
            this.d = i6 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int b() {
        return this.d;
    }

    public final synchronized Object c() {
        if (this.d == 0) {
            return null;
        }
        return e();
    }

    public final synchronized Object d(long j) {
        Object obj;
        obj = null;
        while (this.d > 0 && j - this.a[this.c] >= 0) {
            obj = e();
        }
        return obj;
    }

    public final Object e() {
        zzguk.f(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public zzfi() {
        throw null;
    }
}
