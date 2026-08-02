package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g68 {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final boolean[] h;
    public int i;

    public g68(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.h = new boolean[15];
                break;
            case 2:
                this.h = new boolean[15];
                break;
            default:
                this.h = new boolean[15];
                break;
        }
    }

    public boolean a() {
        switch (this.a) {
            case 0:
                if (this.e <= 15 || this.i != 0) {
                }
                break;
            default:
                if (this.e <= 15 || this.i != 0) {
                }
                break;
        }
        return false;
    }

    public void b(long j) {
        int i = this.a;
        boolean[] zArr = this.h;
        switch (i) {
            case 0:
                long j2 = this.e;
                if (j2 == 0) {
                    this.b = j;
                } else if (j2 == 1) {
                    long j3 = j - this.b;
                    this.c = j3;
                    this.g = j3;
                    this.f = 1L;
                } else {
                    long j4 = j - this.d;
                    int i2 = (int) (j2 % 15);
                    if (Math.abs(j4 - this.c) <= 1000000) {
                        this.f++;
                        this.g += j4;
                        if (zArr[i2]) {
                            zArr[i2] = false;
                            this.i--;
                        }
                    } else if (!zArr[i2]) {
                        zArr[i2] = true;
                        this.i++;
                    }
                }
                this.e++;
                this.d = j;
                break;
            default:
                long j5 = this.e;
                if (j5 == 0) {
                    this.b = j;
                } else if (j5 == 1) {
                    long j6 = j - this.b;
                    this.c = j6;
                    this.g = j6;
                    this.f = 1L;
                } else {
                    long j7 = j - this.d;
                    int i3 = (int) (j5 % 15);
                    if (Math.abs(j7 - this.c) <= 1000000) {
                        this.f++;
                        this.g += j7;
                        if (zArr[i3]) {
                            zArr[i3] = false;
                            this.i--;
                        }
                    } else if (!zArr[i3]) {
                        zArr[i3] = true;
                        this.i++;
                    }
                }
                this.e++;
                this.d = j;
                break;
        }
    }

    public void c() {
        int i = this.a;
        boolean[] zArr = this.h;
        switch (i) {
            case 0:
                this.e = 0L;
                this.f = 0L;
                this.g = 0L;
                this.i = 0;
                Arrays.fill(zArr, false);
                break;
            default:
                this.e = 0L;
                this.f = 0L;
                this.g = 0L;
                this.i = 0;
                Arrays.fill(zArr, false);
                break;
        }
    }

    public void d() {
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = 0;
        Arrays.fill(this.h, false);
    }

    public boolean e() {
        return this.e > 15 && this.i == 0;
    }

    public void f(long j) {
        long j2 = this.e;
        if (j2 == 0) {
            this.b = j;
        } else if (j2 == 1) {
            long j3 = j - this.b;
            this.c = j3;
            this.g = j3;
            this.f = 1L;
        } else {
            long j4 = j - this.d;
            long abs = Math.abs(j4 - this.c);
            int i = (int) (j2 % 15);
            boolean[] zArr = this.h;
            if (abs <= 1000000) {
                this.f++;
                this.g += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.i--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.i++;
            }
        }
        this.e++;
        this.d = j;
    }
}
