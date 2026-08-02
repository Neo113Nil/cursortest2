package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ojb {
    public final /* synthetic */ int a;
    public int b;
    public long[] c;

    public ojb(byte b, int i) {
        this.a = i;
        switch (i) {
            case 2:
                break;
            default:
                this.c = new long[32];
                break;
        }
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArr = this.c;
                if (i == jArr.length) {
                    jArr = Arrays.copyOf(jArr, i * 2);
                    this.c = jArr;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                jArr[i2] = j;
                break;
            case 1:
                int i3 = this.b;
                long[] jArr2 = this.c;
                if (i3 == jArr2.length) {
                    jArr2 = Arrays.copyOf(jArr2, i3 * 2);
                    this.c = jArr2;
                }
                int i4 = this.b;
                this.b = i4 + 1;
                jArr2[i4] = j;
                break;
            default:
                if (!c(j)) {
                    int i5 = this.b;
                    long[] jArr3 = this.c;
                    if (i5 >= jArr3.length) {
                        jArr3 = Arrays.copyOf(jArr3, Math.max(i5 + 1, jArr3.length * 2));
                        this.c = jArr3;
                    }
                    jArr3[i5] = j;
                    if (i5 >= this.b) {
                        this.b = i5 + 1;
                        break;
                    }
                }
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = this.c;
        if (length > jArr2.length) {
            jArr2 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
            this.c = jArr2;
        }
        System.arraycopy(jArr, 0, jArr2, this.b, jArr.length);
        this.b = length;
    }

    public boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long d(int i) {
        switch (this.a) {
            case 0:
                if (i >= 0 && i < this.b) {
                    break;
                } else {
                    pvd.m(this.b, lnb.t(i, "Invalid index ", ", size is "));
                    break;
                }
                break;
            default:
                if (i >= 0 && i < this.b) {
                    break;
                } else {
                    pvd.m(this.b, lnb.t(i, "Invalid index ", ", size is "));
                    break;
                }
        }
        return 0L;
    }

    public void e(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public ojb(int i) {
        this.a = 1;
        this.c = new long[i];
    }
}
